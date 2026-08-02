package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6;
import androidx.core.app.NotificationManagerCompat;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.audio.SonicAudioProcessor;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.MediaClock;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.mp4.BoxParser;
import androidx.tracing.Trace;
import app.cash.zipline.CallResult;
import coil3.svg.internal.AndroidSvg;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.fillr.e0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableList;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class MediaCodecAudioRenderer extends MediaCodecRenderer implements MediaClock {
    public boolean allowPositionDiscontinuity;
    public final DefaultAudioSink audioSink;
    public boolean audioSinkNeedsReset;
    public int codecMaxInputSize;
    public boolean codecNeedsVorbisToAndroidChannelMappingWorkaround;
    public final Context context;
    public long currentPositionUs;
    public Format decryptOnlyCodecFormat;
    public final CallResult eventDispatcher;
    public boolean hasPendingReportedSkippedSilence;
    public boolean hasReportedAudioPositionAdvancing;
    public Format inputFormat;
    public boolean isStarted;
    public final LoudnessCodecController loudnessCodecController;
    public long nextBufferToWritePresentationTimeUs;
    public int rendererPriority;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecAudioRenderer(Context context, MediaCodecAdapter.Factory factory, Handler handler, ExoPlayerImpl.ComponentListener componentListener, DefaultAudioSink defaultAudioSink) {
        super(context.getApplicationContext(), 1, factory, 44100.0f);
        LoudnessCodecController loudnessCodecController = Build.VERSION.SDK_INT >= 35 ? new LoudnessCodecController() : null;
        this.context = context.getApplicationContext();
        this.audioSink = defaultAudioSink;
        this.loudnessCodecController = loudnessCodecController;
        this.rendererPriority = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.eventDispatcher = new CallResult(handler, componentListener);
        this.nextBufferToWritePresentationTimeUs = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format2, Format format3, boolean z) {
        DecoderReuseEvaluation canReuseCodec = mediaCodecInfo.canReuseCodec(format2, format3);
        int i = canReuseCodec.discardReasons;
        if (this.sourceDrmSession == null && shouldUseBypass(format3)) {
            i |= 32768;
        }
        "OMX.google.raw.decoder".equals(mediaCodecInfo.name);
        if (format3.maxInputSize > this.codecMaxInputSize) {
            i |= 64;
        }
        int i2 = i;
        return new DecoderReuseEvaluation(mediaCodecInfo.name, format2, format3, i2 != 0 ? 0 : canReuseCodec.result, i2);
    }

    public final int getAudioOffloadSupport(Format format2) {
        AudioOffloadSupport build;
        DefaultAudioSink defaultAudioSink = this.audioSink;
        if (defaultAudioSink.offloadDisabledUntilNextConfiguration) {
            build = AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        } else {
            AudioOutputProvider.FormatSupport formatSupport = ((AudioTrackAudioOutputProvider) defaultAudioSink.audioOutputProvider).getFormatSupport(defaultAudioSink.getFormatConfig(format2));
            BoxParser.StriData striData = new BoxParser.StriData();
            striData.hasLeftEyeView = formatSupport.isFormatSupportedForOffload;
            striData.hasRightEyeView = formatSupport.isGaplessSupportedForOffload;
            striData.eyeViewsReversed = formatSupport.isSpeedChangeSupportedForOffload;
            build = striData.build();
        }
        if (!build.isFormatSupported) {
            return 0;
        }
        int i = build.isGaplessSupported ? 1536 : 512;
        return build.isSpeedChangeSupported ? i | 2048 : i;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float getCodecOperatingRateV23(float f, Format format2, Format[] formatArr) {
        int i = -1;
        for (Format format3 : formatArr) {
            int i2 = format3.sampleRate;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final ArrayList getDecoderInfos(LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0, Format format2, boolean z) {
        RegularImmutableList decoderInfosSoftMatch;
        if (format2.sampleMimeType == null) {
            decoderInfosSoftMatch = RegularImmutableList.EMPTY;
        } else {
            if (this.audioSink.getFormatSupport(format2) != 0) {
                List decoderInfos = MediaCodecUtil.getDecoderInfos("audio/raw", false, false);
                MediaCodecInfo mediaCodecInfo = decoderInfos.isEmpty() ? null : (MediaCodecInfo) decoderInfos.get(0);
                if (mediaCodecInfo != null) {
                    decoderInfosSoftMatch = ImmutableList.of((Object) mediaCodecInfo);
                }
            }
            decoderInfosSoftMatch = MediaCodecUtil.getDecoderInfosSoftMatch(loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0, format2, z, false);
        }
        HashMap hashMap = MediaCodecUtil.decoderInfosCache;
        ArrayList arrayList = new ArrayList(decoderInfosSoftMatch);
        Collections.sort(arrayList, new VideoCapture$$ExternalSyntheticLambda6(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(15, this.context, format2), 5));
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final long getDurationToProgressUs(boolean z, long j, long j2) {
        boolean equals;
        long scaleLargeValue;
        DefaultAudioSink defaultAudioSink = this.audioSink;
        boolean z2 = defaultAudioSink.hasPendingData() && this.nextBufferToWritePresentationTimeUs != -9223372036854775807L;
        if (this.isStarted) {
            if (defaultAudioSink.isAudioOutputInitialized()) {
                equals = Objects.equals(((Format) defaultAudioSink.configuration.groupedMap).sampleMimeType, "audio/raw");
                if (equals) {
                    scaleLargeValue = Util.sampleCountToDurationUs(((AudioOutputProvider.OutputConfig) defaultAudioSink.configuration.sortedSizes).sampleRate, defaultAudioSink.audioOutput.audioTrack.getBufferSizeInFrames());
                } else {
                    long bufferSizeInFrames = defaultAudioSink.audioOutput.audioTrack.getBufferSizeInFrames();
                    int maximumEncodedRateBytesPerSecond = AacUtil.getMaximumEncodedRateBytesPerSecond(((AudioOutputProvider.OutputConfig) defaultAudioSink.configuration.sortedSizes).f880encoding);
                    Trace.checkState(maximumEncodedRateBytesPerSecond != -2147483647);
                    scaleLargeValue = Util.scaleLargeValue(bufferSizeInFrames, 1000000L, maximumEncodedRateBytesPerSecond, RoundingMode.DOWN);
                }
            } else {
                scaleLargeValue = -9223372036854775807L;
            }
            if (this.hasReportedAudioPositionAdvancing && z2 && scaleLargeValue != -9223372036854775807L) {
                float min = Math.min(scaleLargeValue, this.nextBufferToWritePresentationTimeUs - j);
                PlaybackParameters playbackParameters = defaultAudioSink.playbackParameters;
                return Math.max(10000L, (long) ((min / (playbackParameters != null ? playbackParameters.speed : 1.0f)) / 2.0f));
            }
        } else if (z2 || this.outputStreamEnded) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final MediaClock getMediaClock() {
        return this;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final e0 getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format2, MediaCrypto mediaCrypto, float f) {
        int i;
        Pair codecProfileAndLevel;
        Format[] formatArr = this.streamFormats;
        formatArr.getClass();
        String str = mediaCodecInfo.name;
        "OMX.google.raw.decoder".equals(str);
        int i2 = format2.maxInputSize;
        String str2 = format2.sampleMimeType;
        int i3 = format2.channelCount;
        int i4 = 0;
        boolean z = true;
        if (formatArr.length != 1) {
            for (Format format3 : formatArr) {
                if (mediaCodecInfo.canReuseCodec(format2, format3).result != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    i2 = Math.max(i2, format3.maxInputSize);
                }
            }
        }
        this.codecMaxInputSize = i2;
        if (!str.equals("OMX.google.opus.decoder") && !str.equals("c2.android.opus.decoder") && !str.equals("OMX.google.vorbis.decoder") && !str.equals("c2.android.vorbis.decoder")) {
            z = false;
        }
        this.codecNeedsVorbisToAndroidChannelMappingWorkaround = z;
        String str3 = mediaCodecInfo.codecMimeType;
        int i5 = this.codecMaxInputSize;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i3);
        int i6 = format2.sampleRate;
        mediaFormat.setInteger("sample-rate", i6);
        Log.setCsdBuffers(mediaFormat, format2.initializationData);
        Log.maybeSetInteger(mediaFormat, "max-input-size", i5);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2) && (codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format2)) != null) {
            Log.maybeSetInteger(mediaFormat, "profile", ((Integer) codecProfileAndLevel.first).intValue());
            Log.maybeSetInteger(mediaFormat, "level", ((Integer) codecProfileAndLevel.second).intValue());
        }
        Format.Builder builder = new Format.Builder();
        builder.sampleMimeType = MimeTypes.normalizeMimeType("audio/raw");
        builder.channelCount = i3;
        builder.sampleRate = i6;
        builder.pcmEncoding = 4;
        Format format4 = new Format(builder);
        DefaultAudioSink defaultAudioSink = this.audioSink;
        if (defaultAudioSink.getFormatSupport(format4) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i7 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.rendererPriority));
        }
        Format format5 = null;
        if (Objects.equals(str2, "audio/iamf")) {
            AudioOutputProvider audioOutputProvider = defaultAudioSink.audioOutputProvider;
            AudioCapabilities audioCapabilities = audioOutputProvider instanceof AudioTrackAudioOutputProvider ? ((AudioTrackAudioOutputProvider) audioOutputProvider).audioCapabilities : null;
            int i8 = 12;
            if (audioCapabilities == null) {
                Log.w("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                ImmutableSet immutableSet = IamfUtil.IAMF_SUPPORTED_CHANNEL_MASKS;
                Iterator it = audioCapabilities.spatializerChannelMasks.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = 0;
                        break;
                    }
                    Integer num = (Integer) it.next();
                    i = num.intValue();
                    if (IamfUtil.IAMF_SUPPORTED_CHANNEL_MASKS.contains(num)) {
                        break;
                    }
                }
                if (i != 0) {
                    i8 = i;
                } else {
                    Iterator it2 = audioCapabilities.speakerLayoutChannelMasks.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Integer num2 = (Integer) it2.next();
                        int intValue = num2.intValue();
                        if (IamfUtil.IAMF_SUPPORTED_CHANNEL_MASKS.contains(num2)) {
                            i4 = intValue;
                            break;
                        }
                    }
                    if (i4 != 0) {
                        i8 = i4;
                    }
                }
                int bitCount = Integer.bitCount(i8);
                mediaFormat.setInteger("channel-mask", i8);
                mediaFormat.setInteger("max-output-channel-count", bitCount);
            }
        }
        applyCodecParametersToMediaFormat(mediaFormat);
        if ("audio/raw".equals(mediaCodecInfo.mimeType) && !"audio/raw".equals(str2)) {
            format5 = format2;
        }
        this.decryptOnlyCodecFormat = format5;
        return new e0(mediaCodecInfo, mediaFormat, format2, (Object) null, mediaCrypto, this.loudnessCodecController, 9);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final PlaybackParameters getPlaybackParameters() {
        return this.audioSink.playbackParameters;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final long getPositionUs() {
        if (this.state == 2) {
            updateCurrentPosition();
        }
        return this.currentPositionUs;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) {
        LruArrayPool lruArrayPool;
        Format format2 = decoderInputBuffer.f875format;
        if (format2 != null && Objects.equals(format2.sampleMimeType, "audio/opus") && this.bypassEnabled) {
            ByteBuffer byteBuffer = decoderInputBuffer.supplementalData;
            byteBuffer.getClass();
            Format format3 = decoderInputBuffer.f875format;
            format3.getClass();
            int i = format3.encoderDelay;
            if (byteBuffer.remaining() == 8) {
                int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                DefaultAudioSink defaultAudioSink = this.audioSink;
                AudioTrackAudioOutput audioTrackAudioOutput = defaultAudioSink.audioOutput;
                if (audioTrackAudioOutput == null || !audioTrackAudioOutput.audioTrack.isOffloadedPlayback() || (lruArrayPool = defaultAudioSink.configuration) == null || !((AudioOutputProvider.OutputConfig) lruArrayPool.sortedSizes).useOffloadGapless) {
                    return;
                }
                defaultAudioSink.audioOutput.audioTrack.setOffloadDelayPadding(i, i2);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public final void handleMessage(int i, Object obj) {
        LoudnessCodecController loudnessCodecController;
        DefaultAudioSink defaultAudioSink = this.audioSink;
        if (i == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            if (defaultAudioSink.volume != floatValue) {
                defaultAudioSink.volume = floatValue;
                if (defaultAudioSink.isAudioOutputInitialized()) {
                    defaultAudioSink.audioOutput.audioTrack.setVolume(defaultAudioSink.volume);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            AudioAttributes audioAttributes = (AudioAttributes) obj;
            audioAttributes.getClass();
            if (defaultAudioSink.audioAttributes.equals(audioAttributes)) {
                return;
            }
            defaultAudioSink.audioAttributes = audioAttributes;
            if (defaultAudioSink.tunneling) {
                return;
            }
            defaultAudioSink.reconfigureAndFlush();
            return;
        }
        if (i == 6) {
            AuxEffectInfo auxEffectInfo = (AuxEffectInfo) obj;
            auxEffectInfo.getClass();
            if (defaultAudioSink.auxEffectInfo.equals(auxEffectInfo)) {
                return;
            }
            if (defaultAudioSink.audioOutput != null) {
                defaultAudioSink.auxEffectInfo.getClass();
            }
            defaultAudioSink.auxEffectInfo = auxEffectInfo;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            defaultAudioSink.preferredDevice = audioDeviceInfo;
            AudioTrackAudioOutput audioTrackAudioOutput = defaultAudioSink.audioOutput;
            if (audioTrackAudioOutput != null) {
                audioTrackAudioOutput.audioTrack.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.rendererPriority = ((Integer) obj).intValue();
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            if (mediaCodecAdapter != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.rendererPriority));
                mediaCodecAdapter.setParameters(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            defaultAudioSink.skipSilenceEnabled = ((Boolean) obj).booleanValue();
            DefaultAudioSink.MediaPositionParameters mediaPositionParameters = new DefaultAudioSink.MediaPositionParameters(defaultAudioSink.useAudioOutputPlaybackParams() ? PlaybackParameters.DEFAULT : defaultAudioSink.playbackParameters, -9223372036854775807L, -9223372036854775807L);
            if (defaultAudioSink.isAudioOutputInitialized()) {
                defaultAudioSink.afterDrainParameters = mediaPositionParameters;
                return;
            } else {
                defaultAudioSink.mediaPositionParameters = mediaPositionParameters;
                return;
            }
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (defaultAudioSink.pendingAudioSessionIdChangeConfirmation) {
                if (defaultAudioSink.audioSessionId == intValue) {
                    defaultAudioSink.pendingAudioSessionIdChangeConfirmation = false;
                }
                if (Build.VERSION.SDK_INT >= 35 || (loudnessCodecController = this.loudnessCodecController) == null) {
                    return;
                }
                loudnessCodecController.setAudioSessionId(intValue);
                return;
            }
            if (defaultAudioSink.audioSessionId != intValue) {
                defaultAudioSink.audioSessionId = intValue;
                defaultAudioSink.externalAudioSessionIdProvided = intValue != 0;
                defaultAudioSink.reconfigureAndFlush();
            }
            if (Build.VERSION.SDK_INT >= 35) {
                return;
            } else {
                return;
            }
        }
        if (i == 19) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            AtomicInteger atomicInteger = DefaultAudioSink.pendingReleaseCount;
            if (intValue2 == 0 || intValue2 == -1) {
                intValue2 = -1;
            }
            if (defaultAudioSink.virtualDeviceId == intValue2) {
                return;
            }
            defaultAudioSink.virtualDeviceId = intValue2;
            defaultAudioSink.reconfigureAndFlush();
            return;
        }
        if (i != 20) {
            super.handleMessage(i, obj);
            return;
        }
        obj.getClass();
        AudioOutputProvider audioOutputProvider = (AudioOutputProvider) obj;
        if (audioOutputProvider.equals(defaultAudioSink.audioOutputProvider)) {
            return;
        }
        ((AudioTrackAudioOutputProvider) defaultAudioSink.audioOutputProvider).release();
        defaultAudioSink.audioOutputProvider = audioOutputProvider;
        DefaultAudioSink$$ExternalSyntheticLambda1 defaultAudioSink$$ExternalSyntheticLambda1 = defaultAudioSink.audioOutputProviderListener;
        if (defaultAudioSink$$ExternalSyntheticLambda1 != null) {
            AudioTrackAudioOutputProvider audioTrackAudioOutputProvider = (AudioTrackAudioOutputProvider) audioOutputProvider;
            audioTrackAudioOutputProvider.verifySinglePlaybackLooper();
            if (audioTrackAudioOutputProvider.listeners == null) {
                audioTrackAudioOutputProvider.listeners = new ListenerSet(Thread.currentThread());
            }
            audioTrackAudioOutputProvider.listeners.add(defaultAudioSink$$ExternalSyntheticLambda1);
        }
        defaultAudioSink.reconfigureAndFlush();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final boolean hasSkippedSilenceSinceLastCall() {
        boolean z = this.hasPendingReportedSkippedSilence;
        this.hasPendingReportedSkippedSilence = false;
        return z;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final boolean isEnded() {
        if (!this.outputStreamEnded) {
            return false;
        }
        DefaultAudioSink defaultAudioSink = this.audioSink;
        if (defaultAudioSink.isAudioOutputInitialized()) {
            return defaultAudioSink.handledEndOfStream && !defaultAudioSink.hasPendingData();
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final boolean isReady() {
        return this.audioSink.hasPendingData();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void onCodecError(Exception exc) {
        Log.e("MediaCodecAudioRenderer", "Audio codec error", exc);
        CallResult callResult = this.eventDispatcher;
        Handler handler = (Handler) callResult.result;
        if (handler != null) {
            handler.post(new AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(0, callResult, exc));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void onCodecInitialized(long j, long j2, String str) {
        CallResult callResult = this.eventDispatcher;
        Handler handler = (Handler) callResult.result;
        if (handler != null) {
            handler.post(new AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(callResult, str, j, j2));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void onCodecParametersChanged(CodecParameters codecParameters) {
        CallResult callResult = this.eventDispatcher;
        Handler handler = (Handler) callResult.result;
        if (handler != null) {
            handler.post(new DispatchQueue$$ExternalSyntheticLambda0(24, callResult, codecParameters));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void onCodecReleased(String str) {
        CallResult callResult = this.eventDispatcher;
        Handler handler = (Handler) callResult.result;
        if (handler != null) {
            handler.post(new AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(5, callResult, str));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void onDisabled() {
        CallResult callResult = this.eventDispatcher;
        this.audioSinkNeedsReset = true;
        this.inputFormat = null;
        this.nextBufferToWritePresentationTimeUs = -9223372036854775807L;
        this.hasReportedAudioPositionAdvancing = false;
        try {
            this.audioSink.flush();
            try {
                super.onDisabled();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.onDisabled();
                throw th;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onEnabled(boolean z, boolean z2) {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.decoderCounters = decoderCounters;
        CallResult callResult = this.eventDispatcher;
        Handler handler = (Handler) callResult.result;
        if (handler != null) {
            handler.post(new AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(6, callResult, decoderCounters));
        }
        RendererConfiguration rendererConfiguration = this.configuration;
        rendererConfiguration.getClass();
        boolean z3 = rendererConfiguration.tunneling;
        DefaultAudioSink defaultAudioSink = this.audioSink;
        if (z3) {
            Trace.checkState(defaultAudioSink.externalAudioSessionIdProvided);
            if (!defaultAudioSink.tunneling) {
                defaultAudioSink.tunneling = true;
                defaultAudioSink.reconfigureAndFlush();
            }
        } else if (defaultAudioSink.tunneling) {
            defaultAudioSink.tunneling = false;
            defaultAudioSink.reconfigureAndFlush();
        }
        PlayerId playerId = this.playerId;
        playerId.getClass();
        defaultAudioSink.playerId = playerId;
        SystemClock systemClock = this.clock;
        systemClock.getClass();
        ((AudioTrackAudioOutputProvider) defaultAudioSink.audioOutputProvider).clock = systemClock;
        defaultAudioSink.listener = new BiometricPrompt(this, 25);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation onInputFormatChanged(AndroidSvg androidSvg) {
        Format format2 = (Format) androidSvg.renderOptions;
        format2.getClass();
        this.inputFormat = format2;
        DecoderReuseEvaluation onInputFormatChanged = super.onInputFormatChanged(androidSvg);
        CallResult callResult = this.eventDispatcher;
        Handler handler = (Handler) callResult.result;
        if (handler != null) {
            handler.post(new AFd1wSDK$$ExternalSyntheticLambda2(25, callResult, format2, onInputFormatChanged));
        }
        return onInputFormatChanged;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void onOutputFormatChanged(Format format2, MediaFormat mediaFormat) {
        Format format3 = this.decryptOnlyCodecFormat;
        int[] iArr = null;
        if (format3 != null) {
            format2 = format3;
        } else if (this.codec != null) {
            mediaFormat.getClass();
            int integer = "audio/raw".equals(format2.sampleMimeType) ? format2.pcmEncoding : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? Util.getPcmEncoding(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            Format.Builder builder = new Format.Builder();
            builder.sampleMimeType = MimeTypes.normalizeMimeType("audio/raw");
            builder.pcmEncoding = integer;
            builder.encoderDelay = format2.encoderDelay;
            builder.encoderPadding = format2.encoderPadding;
            builder.metadata = format2.metadata;
            builder.id = format2.id;
            builder.label = format2.label;
            builder.labels = ImmutableList.copyOf((Collection) format2.labels);
            builder.language = format2.language;
            builder.selectionFlags = format2.selectionFlags;
            builder.roleFlags = format2.roleFlags;
            builder.channelCount = mediaFormat.getInteger("channel-count");
            builder.sampleRate = mediaFormat.getInteger("sample-rate");
            format2 = new Format(builder);
            if (this.codecNeedsVorbisToAndroidChannelMappingWorkaround) {
                int i = format2.channelCount;
                if (i == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            boolean z = this.bypassEnabled;
            DefaultAudioSink defaultAudioSink = this.audioSink;
            if (z) {
                RendererConfiguration rendererConfiguration = this.configuration;
                rendererConfiguration.getClass();
                if (rendererConfiguration.offloadModePreferred != 0) {
                    RendererConfiguration rendererConfiguration2 = this.configuration;
                    rendererConfiguration2.getClass();
                    defaultAudioSink.offloadMode = rendererConfiguration2.offloadModePreferred;
                    defaultAudioSink.configure(format2, iArr);
                }
            }
            defaultAudioSink.offloadMode = 0;
            defaultAudioSink.configure(format2, iArr);
        } catch (AudioSink$ConfigurationException e) {
            throw createRendererException(e, e.f882format, false, 5001);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void onOutputStreamOffsetUsChanged() {
        this.audioSink.getClass();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void onPositionReset(long j, boolean z, boolean z2) {
        super.onPositionReset(j, z, z2);
        this.audioSink.flush();
        this.currentPositionUs = j;
        this.nextBufferToWritePresentationTimeUs = -9223372036854775807L;
        this.hasPendingReportedSkippedSilence = false;
        this.hasReportedAudioPositionAdvancing = false;
        this.allowPositionDiscontinuity = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void onProcessedStreamChange() {
        this.audioSink.startMediaTimeUsNeedsSync = true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onRelease() {
        LoudnessCodecController loudnessCodecController;
        ((AudioTrackAudioOutputProvider) this.audioSink.audioOutputProvider).release();
        if (Build.VERSION.SDK_INT < 35 || (loudnessCodecController = this.loudnessCodecController) == null) {
            return;
        }
        loudnessCodecController.release();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onReset() {
        DefaultAudioSink defaultAudioSink = this.audioSink;
        this.hasPendingReportedSkippedSilence = false;
        this.hasReportedAudioPositionAdvancing = false;
        this.nextBufferToWritePresentationTimeUs = -9223372036854775807L;
        try {
            try {
                this.bypassEnabled = false;
                resetBypassState();
                releaseCodec();
                Toolbar.AnonymousClass1 anonymousClass1 = this.sourceDrmSession;
                if (anonymousClass1 != null) {
                    anonymousClass1.release(null);
                }
                this.sourceDrmSession = null;
            } catch (Throwable th) {
                Toolbar.AnonymousClass1 anonymousClass12 = this.sourceDrmSession;
                if (anonymousClass12 != null) {
                    anonymousClass12.release(null);
                }
                this.sourceDrmSession = null;
                throw th;
            }
        } finally {
            if (this.audioSinkNeedsReset) {
                this.audioSinkNeedsReset = false;
                defaultAudioSink.reset();
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onStarted() {
        this.audioSink.play();
        this.isStarted = true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onStopped() {
        updateCurrentPosition();
        this.isStarted = false;
        DefaultAudioSink defaultAudioSink = this.audioSink;
        defaultAudioSink.playing = false;
        if (defaultAudioSink.isAudioOutputInitialized()) {
            AudioTrackAudioOutput audioTrackAudioOutput = defaultAudioSink.audioOutput;
            AudioTrack audioTrack = audioTrackAudioOutput.audioTrack;
            AudioTrackPositionTracker audioTrackPositionTracker = audioTrackAudioOutput.audioTrackPositionTracker;
            audioTrackPositionTracker.smoothedPlayheadOffsetUs = 0L;
            audioTrackPositionTracker.playheadOffsetCount = 0;
            audioTrackPositionTracker.nextPlayheadOffsetIndex = 0;
            audioTrackPositionTracker.lastPlayheadSampleTimeUs = 0L;
            audioTrackPositionTracker.lastPositionUs = -9223372036854775807L;
            audioTrackPositionTracker.lastSystemTimeUs = -9223372036854775807L;
            if (audioTrackPositionTracker.stopTimestampUs == -9223372036854775807L) {
                audioTrackPositionTracker.audioTimestampPoller.updateState(0);
            }
            audioTrackPositionTracker.stopPlaybackHeadPosition = audioTrackPositionTracker.getPlaybackHeadPosition();
            if (!audioTrackAudioOutput.hasBeenStopped || audioTrack.isOffloadedPlayback()) {
                audioTrack.pause();
            }
        }
        this.hasReportedAudioPositionAdvancing = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean processOutputBuffer(long j, long j2, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format2) {
        int i4;
        int i5;
        byteBuffer.getClass();
        this.nextBufferToWritePresentationTimeUs = -9223372036854775807L;
        if (this.decryptOnlyCodecFormat != null && (i2 & 2) != 0) {
            mediaCodecAdapter.getClass();
            mediaCodecAdapter.releaseOutputBuffer(i);
            return true;
        }
        DefaultAudioSink defaultAudioSink = this.audioSink;
        if (z) {
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.releaseOutputBuffer(i);
            }
            this.decoderCounters.skippedOutputBufferCount += i3;
            defaultAudioSink.startMediaTimeUsNeedsSync = true;
            return true;
        }
        try {
            if (!defaultAudioSink.handleBuffer(i3, j3, byteBuffer)) {
                this.nextBufferToWritePresentationTimeUs = j3;
                return false;
            }
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.releaseOutputBuffer(i);
            }
            this.decoderCounters.renderedOutputBufferCount += i3;
            return true;
        } catch (AudioSink$InitializationException e) {
            Format format3 = this.inputFormat;
            if (this.bypassEnabled) {
                RendererConfiguration rendererConfiguration = this.configuration;
                rendererConfiguration.getClass();
                if (rendererConfiguration.offloadModePreferred != 0) {
                    i5 = 5004;
                    throw createRendererException(e, format3, e.isRecoverable, i5);
                }
            }
            i5 = 5001;
            throw createRendererException(e, format3, e.isRecoverable, i5);
        } catch (AudioSink$WriteException e2) {
            if (this.bypassEnabled) {
                RendererConfiguration rendererConfiguration2 = this.configuration;
                rendererConfiguration2.getClass();
                if (rendererConfiguration2.offloadModePreferred != 0) {
                    i4 = 5003;
                    throw createRendererException(e2, format2, e2.isRecoverable, i4);
                }
            }
            i4 = 5002;
            throw createRendererException(e2, format2, e2.isRecoverable, i4);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void renderToEndOfStream() {
        try {
            DefaultAudioSink defaultAudioSink = this.audioSink;
            if (!defaultAudioSink.handledEndOfStream && defaultAudioSink.isAudioOutputInitialized() && defaultAudioSink.drainToEndOfStream()) {
                defaultAudioSink.playPendingData();
                defaultAudioSink.handledEndOfStream = true;
            }
            long j = this.outputStreamInfo.lastBufferTimeUs;
            if (j != -9223372036854775807L) {
                this.nextBufferToWritePresentationTimeUs = j;
            }
        } catch (AudioSink$WriteException e) {
            throw createRendererException(e, e.f883format, e.isRecoverable, this.bypassEnabled ? 5003 : 5002);
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final void setPlaybackParameters(PlaybackParameters playbackParameters) {
        DefaultAudioSink defaultAudioSink = this.audioSink;
        if (defaultAudioSink.useAudioOutputPlaybackParams()) {
            defaultAudioSink.playbackParameters = playbackParameters;
            defaultAudioSink.setAudioOutputPlaybackParameters();
            return;
        }
        PlaybackParameters playbackParameters2 = new PlaybackParameters(Util.constrainValue(playbackParameters.speed, 0.1f, 8.0f), Util.constrainValue(playbackParameters.pitch, 0.1f, 8.0f));
        defaultAudioSink.playbackParameters = playbackParameters2;
        DefaultAudioSink.MediaPositionParameters mediaPositionParameters = new DefaultAudioSink.MediaPositionParameters(playbackParameters2, -9223372036854775807L, -9223372036854775807L);
        if (defaultAudioSink.isAudioOutputInitialized()) {
            defaultAudioSink.afterDrainParameters = mediaPositionParameters;
        } else {
            defaultAudioSink.mediaPositionParameters = mediaPositionParameters;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean shouldUseBypass(Format format2) {
        RendererConfiguration rendererConfiguration = this.configuration;
        rendererConfiguration.getClass();
        if (rendererConfiguration.offloadModePreferred != 0) {
            int audioOffloadSupport = getAudioOffloadSupport(format2);
            if ((audioOffloadSupport & 512) != 0) {
                RendererConfiguration rendererConfiguration2 = this.configuration;
                rendererConfiguration2.getClass();
                if (rendererConfiguration2.offloadModePreferred == 2 || (audioOffloadSupport & 1024) != 0 || (format2.encoderDelay == 0 && format2.encoderPadding == 0)) {
                    return true;
                }
            }
        }
        return this.audioSink.getFormatSupport(format2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if ((r7.isEmpty() ? null : (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) r7.get(0)) != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int supportsFormat(LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0, Format format2) {
        int i;
        Format.Builder builder;
        RegularImmutableList decoderInfosSoftMatch;
        boolean z;
        boolean z2;
        int create = BaseRenderer.create(1, 0, 0, 0);
        String str = format2.sampleMimeType;
        String str2 = format2.sampleMimeType;
        if (!MimeTypes.isAudio(str)) {
            return BaseRenderer.create(0, 0, 0, 0);
        }
        int i2 = format2.cryptoType;
        boolean z3 = i2 != 0;
        boolean z4 = i2 == 0 || i2 == 2;
        int i3 = 8;
        DefaultAudioSink defaultAudioSink = this.audioSink;
        if (z4) {
            if (z3) {
                List decoderInfos = MediaCodecUtil.getDecoderInfos("audio/raw", false, false);
            }
            i = getAudioOffloadSupport(format2);
            if (defaultAudioSink.getFormatSupport(format2) != 0) {
                return BaseRenderer.create(4, 8, 32, i);
            }
            if ("audio/raw".equals(str2) || defaultAudioSink.getFormatSupport(format2) != 0) {
                int i4 = format2.channelCount;
                int i5 = format2.sampleRate;
                builder = new Format.Builder();
                builder.sampleMimeType = MimeTypes.normalizeMimeType("audio/raw");
                builder.channelCount = i4;
                builder.sampleRate = i5;
                builder.pcmEncoding = 2;
                if (defaultAudioSink.getFormatSupport(new Format(builder)) != 0) {
                    if (str2 == null) {
                        decoderInfosSoftMatch = RegularImmutableList.EMPTY;
                    } else {
                        if (defaultAudioSink.getFormatSupport(format2) != 0) {
                            List decoderInfos2 = MediaCodecUtil.getDecoderInfos("audio/raw", false, false);
                            MediaCodecInfo mediaCodecInfo = decoderInfos2.isEmpty() ? null : (MediaCodecInfo) decoderInfos2.get(0);
                            if (mediaCodecInfo != null) {
                                decoderInfosSoftMatch = ImmutableList.of((Object) mediaCodecInfo);
                            }
                        }
                        decoderInfosSoftMatch = MediaCodecUtil.getDecoderInfosSoftMatch(loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0, format2, false, false);
                    }
                    if (!decoderInfosSoftMatch.isEmpty()) {
                        if (!z4) {
                            return BaseRenderer.create(2, 0, 0, 0);
                        }
                        MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) decoderInfosSoftMatch.get(0);
                        Context context = this.context;
                        boolean isFormatSupported = mediaCodecInfo2.isFormatSupported(context, format2);
                        if (!isFormatSupported) {
                            for (int i6 = 1; i6 < decoderInfosSoftMatch.size; i6++) {
                                MediaCodecInfo mediaCodecInfo3 = (MediaCodecInfo) decoderInfosSoftMatch.get(i6);
                                if (mediaCodecInfo3.isFormatSupported(context, format2)) {
                                    z2 = false;
                                    mediaCodecInfo2 = mediaCodecInfo3;
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = isFormatSupported;
                        z2 = true;
                        int i7 = z ? 4 : 3;
                        if (z && mediaCodecInfo2.isSeamlessAdaptationSupported(format2)) {
                            i3 = 16;
                        }
                        return (mediaCodecInfo2.hardwareAccelerated ? 64 : 0) | i7 | i3 | 32 | (z2 ? 128 : 0) | i;
                    }
                }
            }
            return create;
        }
        i = 0;
        if ("audio/raw".equals(str2)) {
        }
        int i42 = format2.channelCount;
        int i52 = format2.sampleRate;
        builder = new Format.Builder();
        builder.sampleMimeType = MimeTypes.normalizeMimeType("audio/raw");
        builder.channelCount = i42;
        builder.sampleRate = i52;
        builder.pcmEncoding = 2;
        if (defaultAudioSink.getFormatSupport(new Format(builder)) != 0) {
        }
        return create;
    }

    public final void updateCurrentPosition() {
        long j;
        long j2;
        long j3;
        isEnded();
        DefaultAudioSink defaultAudioSink = this.audioSink;
        Recorder.AnonymousClass3 anonymousClass3 = defaultAudioSink.audioProcessorChain;
        if (!defaultAudioSink.isAudioOutputInitialized() || defaultAudioSink.startMediaTimeUsNeedsInit) {
            j = Long.MIN_VALUE;
            j2 = Long.MIN_VALUE;
        } else {
            long min = Math.min(defaultAudioSink.audioOutput.getPositionUs(), Util.sampleCountToDurationUs(((AudioOutputProvider.OutputConfig) defaultAudioSink.configuration.sortedSizes).sampleRate, defaultAudioSink.getWrittenFrames()));
            ArrayDeque arrayDeque = defaultAudioSink.mediaPositionParametersCheckpoints;
            while (!arrayDeque.isEmpty() && min >= ((DefaultAudioSink.MediaPositionParameters) arrayDeque.getFirst()).audioOutputPositionUs) {
                defaultAudioSink.mediaPositionParameters = (DefaultAudioSink.MediaPositionParameters) arrayDeque.remove();
            }
            DefaultAudioSink.MediaPositionParameters mediaPositionParameters = defaultAudioSink.mediaPositionParameters;
            long j4 = min - mediaPositionParameters.audioOutputPositionUs;
            long mediaDurationForPlayoutDuration = Util.getMediaDurationForPlayoutDuration(j4, mediaPositionParameters.playbackParameters.speed);
            if (arrayDeque.isEmpty()) {
                SonicAudioProcessor sonicAudioProcessor = (SonicAudioProcessor) anonymousClass3.this$0;
                if (!sonicAudioProcessor.isActive()) {
                    j = Long.MIN_VALUE;
                } else if (sonicAudioProcessor.outputBytes >= 1024) {
                    long j5 = sonicAudioProcessor.inputBytes;
                    sonicAudioProcessor.sonic.getClass();
                    long bytesPerSample = j5 - (r10.impl.bytesPerSample() * (r10.inputFrameCount * r10.channelCount));
                    int i = sonicAudioProcessor.outputAudioFormat.sampleRate;
                    int i2 = sonicAudioProcessor.inputAudioFormat.sampleRate;
                    j = Long.MIN_VALUE;
                    long j6 = sonicAudioProcessor.outputBytes;
                    j4 = i == i2 ? Util.scaleLargeValue(j4, bytesPerSample, j6, RoundingMode.DOWN) : Util.scaleLargeValue(j4, bytesPerSample * i, j6 * i2, RoundingMode.DOWN);
                } else {
                    j = Long.MIN_VALUE;
                    j4 = (long) (sonicAudioProcessor.speed * j4);
                }
                DefaultAudioSink.MediaPositionParameters mediaPositionParameters2 = defaultAudioSink.mediaPositionParameters;
                j3 = mediaPositionParameters2.mediaTimeUs + j4;
                mediaPositionParameters2.mediaPositionDriftUs = j4 - mediaDurationForPlayoutDuration;
            } else {
                j = Long.MIN_VALUE;
                DefaultAudioSink.MediaPositionParameters mediaPositionParameters3 = defaultAudioSink.mediaPositionParameters;
                j3 = mediaPositionParameters3.mediaTimeUs + mediaDurationForPlayoutDuration + mediaPositionParameters3.mediaPositionDriftUs;
            }
            long j7 = ((SilenceSkippingAudioProcessor) anonymousClass3.val$recordingToStart).skippedFrames;
            j2 = Util.sampleCountToDurationUs(((AudioOutputProvider.OutputConfig) defaultAudioSink.configuration.sortedSizes).sampleRate, j7) + j3;
            long j8 = defaultAudioSink.skippedOutputFrameCountAtLastPosition;
            if (j7 > j8) {
                long sampleCountToDurationUs = Util.sampleCountToDurationUs(((AudioOutputProvider.OutputConfig) defaultAudioSink.configuration.sortedSizes).sampleRate, j7 - j8);
                defaultAudioSink.skippedOutputFrameCountAtLastPosition = j7;
                defaultAudioSink.accumulatedSkippedSilenceDurationUs += sampleCountToDurationUs;
                if (defaultAudioSink.reportSkippedSilenceHandler == null) {
                    defaultAudioSink.reportSkippedSilenceHandler = new Handler(Looper.myLooper());
                }
                defaultAudioSink.reportSkippedSilenceHandler.removeCallbacksAndMessages(null);
                defaultAudioSink.reportSkippedSilenceHandler.postDelayed(new AFd1lSDK$$ExternalSyntheticLambda0(defaultAudioSink, 14), 100L);
            }
        }
        if (j2 != j) {
            if (!this.allowPositionDiscontinuity) {
                j2 = Math.max(this.currentPositionUs, j2);
            }
            this.currentPositionUs = j2;
            this.allowPositionDiscontinuity = false;
        }
    }
}
