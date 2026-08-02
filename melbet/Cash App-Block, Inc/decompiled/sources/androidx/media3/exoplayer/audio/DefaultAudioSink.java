package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.biometric.BiometricPrompt;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda14;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.audio.AudioProcessingPipeline;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.SonicAudioProcessor;
import androidx.media3.common.audio.ToInt16PcmAudioProcessor;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.container.OpusUtil;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.VorbisBitArray;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda10;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.util.LruCache;
import com.fillr.n;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.camera2.Camera2Controller;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import sqip.internal.event.EventModule$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class DefaultAudioSink {
    public static final AtomicInteger pendingReleaseCount = new AtomicInteger();
    public long accumulatedSkippedSilenceDurationUs;
    public MediaPositionParameters afterDrainParameters;
    public AudioAttributes audioAttributes;
    public AudioTrackAudioOutput audioOutput;
    public AudioOutputListener audioOutputListener;
    public AudioOutputProvider audioOutputProvider;
    public DefaultAudioSink$$ExternalSyntheticLambda1 audioOutputProviderListener;
    public AudioProcessingPipeline audioProcessingPipeline;
    public final Recorder.AnonymousClass3 audioProcessorChain;
    public int audioSessionId;
    public AuxEffectInfo auxEffectInfo;
    public final RegularImmutableList availableAudioProcessors;
    public final ChannelMappingAudioProcessor channelMappingAudioProcessor;
    public LruArrayPool configuration;
    public final Context context;
    public boolean externalAudioSessionIdProvided;
    public int framesPerEncodedSample;
    public boolean handledEndOfStream;
    public boolean handledOffloadOnPresentationEnded;
    public final LruCache initializationExceptionPendingExceptionHolder;
    public ByteBuffer inputBuffer;
    public int inputBufferAccessUnitCount;
    public boolean isWaitingForOffloadEndOfStreamHandled;
    public long lastFeedElapsedRealtimeMs;
    public BiometricPrompt listener;
    public MediaPositionParameters mediaPositionParameters;
    public final ArrayDeque mediaPositionParametersCheckpoints;
    public boolean offloadDisabledUntilNextConfiguration;
    public int offloadMode;
    public ByteBuffer outputBuffer;
    public boolean pendingAudioSessionIdChangeConfirmation;
    public LruArrayPool pendingConfiguration;
    public PlaybackParameters playbackParameters;
    public PlayerId playerId;
    public boolean playing;
    public AudioDeviceInfo preferredDevice;
    public Handler reportSkippedSilenceHandler;
    public boolean skipSilenceEnabled;
    public long skippedOutputFrameCountAtLastPosition;
    public long startMediaTimeUs;
    public boolean startMediaTimeUsNeedsInit;
    public boolean startMediaTimeUsNeedsSync;
    public boolean stoppedAudioOutput;
    public long submittedEncodedFrames;
    public long submittedPcmBytes;
    public final ToFloatPcmAudioProcessor toFloatPcmAudioProcessor;
    public final ToInt16PcmAudioProcessor toInt16PcmAudioProcessor;
    public final TrimmingAudioProcessor trimmingAudioProcessor;
    public boolean tunneling;
    public int virtualDeviceId;
    public float volume;
    public final LruCache writeExceptionPendingExceptionHolder;
    public long writtenEncodedFrames;
    public long writtenPcmBytes;

    public interface AudioOffloadSupportProvider {
    }

    public final class AudioOutputListener {
        public final AudioOutputProvider.OutputConfig outputConfig;

        public AudioOutputListener(AudioOutputProvider.OutputConfig outputConfig) {
            this.outputConfig = outputConfig;
        }
    }

    public final class MediaPositionParameters {
        public final long audioOutputPositionUs;
        public long mediaPositionDriftUs;
        public final long mediaTimeUs;
        public final PlaybackParameters playbackParameters;

        public MediaPositionParameters(PlaybackParameters playbackParameters, long j, long j2) {
            this.playbackParameters = playbackParameters;
            this.mediaTimeUs = j;
            this.audioOutputPositionUs = j2;
        }
    }

    public DefaultAudioSink(Camera2Controller camera2Controller) {
        int deviceId;
        Context context = (Context) camera2Controller.cameraChoiceHelper;
        this.context = context == null ? null : context.getApplicationContext();
        this.audioAttributes = AudioAttributes.DEFAULT;
        this.audioProcessorChain = (Recorder.AnonymousClass3) camera2Controller.coroutineScope;
        this.offloadMode = 0;
        this.audioOutputProvider = (AudioTrackAudioOutputProvider) camera2Controller._previewState;
        ChannelMappingAudioProcessor channelMappingAudioProcessor = new ChannelMappingAudioProcessor();
        this.channelMappingAudioProcessor = channelMappingAudioProcessor;
        TrimmingAudioProcessor trimmingAudioProcessor = new TrimmingAudioProcessor();
        trimmingAudioProcessor.endBuffer = Util.EMPTY_BYTE_ARRAY;
        this.trimmingAudioProcessor = trimmingAudioProcessor;
        this.toInt16PcmAudioProcessor = new ToInt16PcmAudioProcessor();
        this.toFloatPcmAudioProcessor = new ToFloatPcmAudioProcessor();
        this.availableAudioProcessors = ImmutableList.of((Object) trimmingAudioProcessor, (Object) channelMappingAudioProcessor);
        this.volume = 1.0f;
        this.audioSessionId = 0;
        this.auxEffectInfo = new AuxEffectInfo();
        PlaybackParameters playbackParameters = PlaybackParameters.DEFAULT;
        this.mediaPositionParameters = new MediaPositionParameters(playbackParameters, 0L, 0L);
        this.playbackParameters = playbackParameters;
        this.skipSilenceEnabled = false;
        this.mediaPositionParametersCheckpoints = new ArrayDeque();
        this.initializationExceptionPendingExceptionHolder = new LruCache();
        this.writeExceptionPendingExceptionHolder = new LruCache();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.virtualDeviceId = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getFramesPerEncodedSample(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b3 = byteBuffer.get(26);
                int i9 = 28;
                int i10 = 28;
                for (int i11 = 0; i11 < b3; i11++) {
                    i10 += byteBuffer.get(i11 + 27);
                }
                byte b4 = byteBuffer.get(i10 + 26);
                for (int i12 = 0; i12 < b4; i12++) {
                    i9 += byteBuffer.get(i10 + 27 + i12);
                }
                i2 = i10 + i9;
            }
            int i13 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((OpusUtil.getPacketDurationUs(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int position = byteBuffer.position();
                    String str = Util.DEVICE_DEBUG_INFO;
                    int i14 = byteBuffer.getInt(position);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        i14 = Integer.reverseBytes(i14);
                    }
                    if ((i14 & (-2097152)) == -2097152 && (i6 = (i14 >>> 19) & 3) != 1 && (i7 = (i14 >>> 17) & 3) != 0) {
                        int i15 = (i14 >>> 12) & 15;
                        int i16 = (i14 >>> 10) & 3;
                        if (i15 != 0 && i15 != 15 && i16 != 3) {
                            i5 = 1152;
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        Path$$ExternalSyntheticBUOutline0.m$3();
                                        return 0;
                                    }
                                    i5 = MLKEMEngine.KyberPolyBytes;
                                }
                            } else if (i6 != 3) {
                                i5 = 576;
                            }
                            if (i5 == -1) {
                                return i5;
                            }
                            Path$$ExternalSyntheticBUOutline0.m$3();
                            return 0;
                        }
                    }
                    i5 = -1;
                    if (i5 == -1) {
                    }
                    break;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i17 = position2;
                            while (true) {
                                if (i17 <= limit) {
                                    String str2 = Util.DEVICE_DEBUG_INFO;
                                    int i18 = byteBuffer.getInt(i17 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i18 = Integer.reverseBytes(i18);
                                    }
                                    if ((i18 & (-2)) == -126718022) {
                                        i8 = i17 - position2;
                                    } else {
                                        i17++;
                                    }
                                } else {
                                    i8 = -1;
                                }
                            }
                            if (i8 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + (((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int position3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position3);
                            return AacUtil.parseAc4SyncframeInfo(new VorbisBitArray(bArr, 16)).initialLoadSize;
                        case 18:
                            break;
                        default:
                            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unexpected audio encoding: "));
                            return 0;
                    }
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return AacUtil.BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int position4 = byteBuffer.position();
        byte b5 = byteBuffer.get(position4);
        if (b5 != -2) {
            if (b5 == -1) {
                i3 = (byteBuffer.get(position4 + 4) & 7) << 4;
                b2 = byteBuffer.get(position4 + 7);
            } else if (b5 != 31) {
                i3 = (byteBuffer.get(position4 + 4) & 1) << 6;
                b = byteBuffer.get(position4 + 5);
            } else {
                i3 = (byteBuffer.get(position4 + 5) & 7) << 4;
                b2 = byteBuffer.get(position4 + 6);
            }
            i4 = b2 & 60;
            return (((i4 >> 2) | i3) + 1) * 32;
        }
        i3 = (byteBuffer.get(position4 + 5) & 1) << 6;
        b = byteBuffer.get(position4 + 4);
        i4 = b & 252;
        return (((i4 >> 2) | i3) + 1) * 32;
    }

    public final void applyAudioProcessorPlaybackParametersAndSkipSilence(long j) {
        PlaybackParameters playbackParameters;
        boolean equals;
        boolean equals2;
        boolean useAudioOutputPlaybackParams = useAudioOutputPlaybackParams();
        boolean z = false;
        Recorder.AnonymousClass3 anonymousClass3 = this.audioProcessorChain;
        if (useAudioOutputPlaybackParams) {
            playbackParameters = PlaybackParameters.DEFAULT;
        } else {
            if (!this.tunneling) {
                equals2 = Objects.equals(((Format) this.configuration.groupedMap).sampleMimeType, "audio/raw");
                if (equals2) {
                    int i = ((Format) this.configuration.groupedMap).pcmEncoding;
                    playbackParameters = this.playbackParameters;
                    SonicAudioProcessor sonicAudioProcessor = (SonicAudioProcessor) anonymousClass3.this$0;
                    float f = playbackParameters.speed;
                    sonicAudioProcessor.getClass();
                    Trace.checkArgument(f > RecyclerView.DECELERATION_RATE);
                    if (sonicAudioProcessor.speed != f) {
                        sonicAudioProcessor.speed = f;
                        sonicAudioProcessor.pendingSonicRecreation = true;
                    }
                    float f2 = playbackParameters.pitch;
                    Trace.checkArgument(f2 > RecyclerView.DECELERATION_RATE);
                    if (sonicAudioProcessor.pitch != f2) {
                        sonicAudioProcessor.pitch = f2;
                        sonicAudioProcessor.pendingSonicRecreation = true;
                    }
                    this.playbackParameters = playbackParameters;
                }
            }
            playbackParameters = PlaybackParameters.DEFAULT;
            this.playbackParameters = playbackParameters;
        }
        PlaybackParameters playbackParameters2 = playbackParameters;
        if (!this.tunneling) {
            equals = Objects.equals(((Format) this.configuration.groupedMap).sampleMimeType, "audio/raw");
            if (equals) {
                int i2 = ((Format) this.configuration.groupedMap).pcmEncoding;
                z = this.skipSilenceEnabled;
                ((SilenceSkippingAudioProcessor) anonymousClass3.val$recordingToStart).enabled = z;
            }
        }
        this.skipSilenceEnabled = z;
        this.mediaPositionParametersCheckpoints.add(new MediaPositionParameters(playbackParameters2, Math.max(0L, j), Util.sampleCountToDurationUs(((AudioOutputProvider.OutputConfig) this.configuration.sortedSizes).sampleRate, getWrittenFrames())));
        AudioProcessingPipeline audioProcessingPipeline = (AudioProcessingPipeline) this.configuration.adapters;
        this.audioProcessingPipeline = audioProcessingPipeline;
        audioProcessingPipeline.flush();
        BiometricPrompt biometricPrompt = this.listener;
        if (biometricPrompt != null) {
            boolean z2 = this.skipSilenceEnabled;
            CallResult callResult = ((MediaCodecAudioRenderer) biometricPrompt.mClientFragmentManager).eventDispatcher;
            Handler handler = (Handler) callResult.result;
            if (handler != null) {
                handler.post(new LottieCompositionFactory$$ExternalSyntheticLambda10(callResult, z2, 3));
            }
        }
    }

    public final AudioTrackAudioOutput buildAudioOutput(AudioOutputProvider.OutputConfig outputConfig) {
        try {
            return ((AudioTrackAudioOutputProvider) this.audioOutputProvider).getAudioOutput(outputConfig);
        } catch (AudioOutputProvider.InitializationException e) {
            AudioSink$InitializationException audioSink$InitializationException = new AudioSink$InitializationException(outputConfig.sampleRate, outputConfig.channelMask, outputConfig.f880encoding, outputConfig.bufferSize, (Format) this.configuration.groupedMap, outputConfig.isOffload, e);
            BiometricPrompt biometricPrompt = this.listener;
            if (biometricPrompt == null) {
                throw audioSink$InitializationException;
            }
            biometricPrompt.onAudioSinkError(audioSink$InitializationException);
            throw audioSink$InitializationException;
        }
    }

    public final void configure(Format format2, int[] iArr) {
        AudioProcessingPipeline audioProcessingPipeline;
        Format format3;
        int i;
        int i2;
        if (this.audioOutputProviderListener == null && this.context != null) {
            DefaultAudioSink$$ExternalSyntheticLambda1 defaultAudioSink$$ExternalSyntheticLambda1 = new DefaultAudioSink$$ExternalSyntheticLambda1(this);
            this.audioOutputProviderListener = defaultAudioSink$$ExternalSyntheticLambda1;
            AudioTrackAudioOutputProvider audioTrackAudioOutputProvider = (AudioTrackAudioOutputProvider) this.audioOutputProvider;
            audioTrackAudioOutputProvider.verifySinglePlaybackLooper();
            if (audioTrackAudioOutputProvider.listeners == null) {
                audioTrackAudioOutputProvider.listeners = new ListenerSet(Thread.currentThread());
            }
            audioTrackAudioOutputProvider.listeners.add(defaultAudioSink$$ExternalSyntheticLambda1);
        }
        String str = format2.sampleMimeType;
        int i3 = format2.channelCount;
        int i4 = format2.pcmEncoding;
        if ("audio/raw".equals(str)) {
            Trace.checkArgument(Util.isEncodingLinearPcm(i4));
            int byteDepth = Util.getByteDepth(i4) * i3;
            ImmutableList.Builder builder = new ImmutableList.Builder(4);
            builder.addAll(this.availableAudioProcessors);
            builder.m2032add((Object) this.toInt16PcmAudioProcessor);
            AudioProcessor[] audioProcessorArr = (AudioProcessor[]) this.audioProcessorChain.val$completer;
            builder.addAll(audioProcessorArr.length, audioProcessorArr);
            audioProcessingPipeline = new AudioProcessingPipeline(builder.build());
            if (audioProcessingPipeline.equals(this.audioProcessingPipeline)) {
                audioProcessingPipeline = this.audioProcessingPipeline;
            }
            int i5 = format2.encoderDelay;
            int i6 = format2.encoderPadding;
            TrimmingAudioProcessor trimmingAudioProcessor = this.trimmingAudioProcessor;
            trimmingAudioProcessor.trimStartFrames = i5;
            trimmingAudioProcessor.trimEndFrames = i6;
            this.channelMappingAudioProcessor.pendingOutputChannels = iArr;
            AudioProcessor.AudioFormat audioFormat = new AudioProcessor.AudioFormat(format2.sampleRate, i3, i4);
            try {
                ImmutableList immutableList = audioProcessingPipeline.audioProcessors;
                if (audioFormat.equals(AudioProcessor.AudioFormat.NOT_SET)) {
                    throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
                }
                for (int i7 = 0; i7 < immutableList.size(); i7++) {
                    AudioProcessor audioProcessor = (AudioProcessor) immutableList.get(i7);
                    AudioProcessor.AudioFormat configure = audioProcessor.configure(audioFormat);
                    if (audioProcessor.isActive()) {
                        Trace.checkState(!configure.equals(AudioProcessor.AudioFormat.NOT_SET));
                        audioFormat = configure;
                    }
                }
                int i8 = audioFormat.channelCount;
                int i9 = audioFormat.f872encoding;
                Format.Builder buildUpon = format2.buildUpon();
                buildUpon.pcmEncoding = i9;
                buildUpon.sampleRate = audioFormat.sampleRate;
                buildUpon.channelCount = i8;
                format3 = new Format(buildUpon);
                i = byteDepth;
                i2 = Util.getByteDepth(i9) * i8;
            } catch (AudioProcessor.UnhandledAudioFormatException e) {
                throw new AudioSink$ConfigurationException(e, format2);
            }
        } else {
            audioProcessingPipeline = new AudioProcessingPipeline(RegularImmutableList.EMPTY);
            format3 = format2;
            i = -1;
            i2 = -1;
        }
        AudioProcessingPipeline audioProcessingPipeline2 = audioProcessingPipeline;
        AudioOutputProvider.FormatConfig formatConfig = getFormatConfig(format3);
        Format format4 = formatConfig.f879format;
        try {
            AudioOutputProvider.OutputConfig outputConfig = ((AudioTrackAudioOutputProvider) this.audioOutputProvider).getOutputConfig(formatConfig);
            boolean z = outputConfig.isOffload;
            if (outputConfig.f880encoding == 0) {
                throw new AudioSink$ConfigurationException(Fragment$5$$ExternalSyntheticOutline0.m("Invalid output encoding (isOffload=", ")", z), format4);
            }
            if (outputConfig.channelMask == 0) {
                throw new AudioSink$ConfigurationException(Fragment$5$$ExternalSyntheticOutline0.m("Invalid output channel config (isOffload=", ")", z), format4);
            }
            this.offloadDisabledUntilNextConfiguration = false;
            LruArrayPool lruArrayPool = new LruArrayPool(format2, format3, i, i2, outputConfig, audioProcessingPipeline2);
            if (isAudioOutputInitialized()) {
                this.pendingConfiguration = lruArrayPool;
            } else {
                this.configuration = lruArrayPool;
            }
        } catch (AudioOutputProvider.ConfigurationException e2) {
            throw new AudioSink$ConfigurationException(e2, format2);
        }
    }

    public final void drainOutputBuffer(long j) {
        boolean equals;
        boolean equals2;
        BiometricPrompt biometricPrompt;
        ExoPlayerImplInternal.AnonymousClass1 anonymousClass1;
        if (this.outputBuffer == null) {
            return;
        }
        LruCache lruCache = this.writeExceptionPendingExceptionHolder;
        if (((Exception) lruCache.cache) != null && (pendingReleaseCount.get() > 0 || SystemClock.elapsedRealtime() < lruCache.currentSize)) {
            return;
        }
        int remaining = this.outputBuffer.remaining();
        try {
            boolean write = this.audioOutput.write(this.inputBufferAccessUnitCount, j, this.outputBuffer);
            this.lastFeedElapsedRealtimeMs = SystemClock.elapsedRealtime();
            lruCache.cache = null;
            lruCache.maxSize = -9223372036854775807L;
            lruCache.currentSize = -9223372036854775807L;
            if (this.audioOutput.audioTrack.isOffloadedPlayback()) {
                if (this.writtenEncodedFrames > 0) {
                    this.isWaitingForOffloadEndOfStreamHandled = false;
                }
                if (this.playing && (biometricPrompt = this.listener) != null && !write && !this.isWaitingForOffloadEndOfStreamHandled && (anonymousClass1 = ((MediaCodecAudioRenderer) biometricPrompt.mClientFragmentManager).wakeupListener) != null) {
                    ExoPlayerImplInternal.this.requestForRendererSleep = true;
                }
            }
            equals = Objects.equals(((Format) this.configuration.groupedMap).sampleMimeType, "audio/raw");
            if (equals) {
                this.writtenPcmBytes += remaining - this.outputBuffer.remaining();
            }
            if (write) {
                equals2 = Objects.equals(((Format) this.configuration.groupedMap).sampleMimeType, "audio/raw");
                if (!equals2) {
                    Trace.checkState(this.outputBuffer == this.inputBuffer);
                    this.writtenEncodedFrames = (this.framesPerEncodedSample * this.inputBufferAccessUnitCount) + this.writtenEncodedFrames;
                }
                this.outputBuffer = null;
            }
        } catch (AudioOutput$WriteException e) {
            boolean z = e.isRecoverable;
            if (z) {
                if (getWrittenFrames() <= 0) {
                    if (this.audioOutput.audioTrack.isOffloadedPlayback()) {
                        if (((AudioOutputProvider.OutputConfig) this.configuration.sortedSizes).isOffload) {
                            this.offloadDisabledUntilNextConfiguration = true;
                        }
                    }
                }
                r4 = true;
            }
            AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(e.errorCode, (Format) this.configuration.groupedMap, r4);
            BiometricPrompt biometricPrompt2 = this.listener;
            if (biometricPrompt2 != null) {
                biometricPrompt2.onAudioSinkError(audioSink$WriteException);
            }
            if (z) {
                throw audioSink$WriteException;
            }
            lruCache.throwExceptionIfDeadlineIsReached(audioSink$WriteException);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drainToEndOfStream() {
        ByteBuffer byteBuffer;
        if (!this.audioProcessingPipeline.isOperational()) {
            drainOutputBuffer(Long.MIN_VALUE);
            return this.outputBuffer == null;
        }
        AudioProcessingPipeline audioProcessingPipeline = this.audioProcessingPipeline;
        if (audioProcessingPipeline.isOperational() && !audioProcessingPipeline.inputEnded) {
            audioProcessingPipeline.inputEnded = true;
            ((AudioProcessor) audioProcessingPipeline.activeAudioProcessors.get(0)).queueEndOfStream();
        }
        processBuffers(Long.MIN_VALUE);
        if (!this.audioProcessingPipeline.isEnded() || ((byteBuffer = this.outputBuffer) != null && byteBuffer.hasRemaining())) {
        }
    }

    public final void flush() {
        if (isAudioOutputInitialized()) {
            this.submittedPcmBytes = 0L;
            this.submittedEncodedFrames = 0L;
            this.writtenPcmBytes = 0L;
            this.writtenEncodedFrames = 0L;
            this.isWaitingForOffloadEndOfStreamHandled = false;
            this.framesPerEncodedSample = 0;
            this.mediaPositionParameters = new MediaPositionParameters(this.playbackParameters, 0L, 0L);
            this.startMediaTimeUs = 0L;
            this.afterDrainParameters = null;
            this.mediaPositionParametersCheckpoints.clear();
            this.inputBuffer = null;
            this.inputBufferAccessUnitCount = 0;
            this.outputBuffer = null;
            this.stoppedAudioOutput = false;
            this.handledEndOfStream = false;
            this.handledOffloadOnPresentationEnded = false;
            this.trimmingAudioProcessor.trimmedFrameCount = 0L;
            AudioProcessingPipeline audioProcessingPipeline = (AudioProcessingPipeline) this.configuration.adapters;
            this.audioProcessingPipeline = audioProcessingPipeline;
            audioProcessingPipeline.flush();
            this.audioOutputListener = null;
            LruArrayPool lruArrayPool = this.pendingConfiguration;
            if (lruArrayPool != null) {
                this.configuration = lruArrayPool;
                this.pendingConfiguration = null;
            }
            pendingReleaseCount.incrementAndGet();
            AudioTrackAudioOutput audioTrackAudioOutput = this.audioOutput;
            if (audioTrackAudioOutput.audioTrackPositionTracker.audioTrack.getPlayState() == 3) {
                audioTrackAudioOutput.audioTrack.pause();
            }
            if (audioTrackAudioOutput.audioTrack.isOffloadedPlayback()) {
                Recorder.AnonymousClass3 anonymousClass3 = audioTrackAudioOutput.offloadStreamEventCallbackV29;
                anonymousClass3.getClass();
                ((AudioTrackAudioOutput) anonymousClass3.this$0).audioTrack.unregisterStreamEventCallback((AudioTrackAudioOutput$StreamEventCallbackV29$1) anonymousClass3.val$recordingToStart);
                ((Handler) anonymousClass3.val$completer).removeCallbacksAndMessages(null);
            }
            n nVar = audioTrackAudioOutput.onRoutingChangedListener;
            if (nVar != null) {
                AudioTrack audioTrack = (AudioTrack) nVar.a;
                AudioTrackAudioOutput$OnRoutingChangedListenerApi24$$ExternalSyntheticLambda0 audioTrackAudioOutput$OnRoutingChangedListenerApi24$$ExternalSyntheticLambda0 = (AudioTrackAudioOutput$OnRoutingChangedListenerApi24$$ExternalSyntheticLambda0) nVar.d;
                audioTrackAudioOutput$OnRoutingChangedListenerApi24$$ExternalSyntheticLambda0.getClass();
                audioTrack.removeOnRoutingChangedListener(audioTrackAudioOutput$OnRoutingChangedListenerApi24$$ExternalSyntheticLambda0);
                nVar.d = null;
                audioTrackAudioOutput.onRoutingChangedListener = null;
            }
            AudioTrack audioTrack2 = audioTrackAudioOutput.audioTrack;
            ListenerSet listenerSet = audioTrackAudioOutput.listeners;
            Handler createHandlerForCurrentLooper = Util.createHandlerForCurrentLooper(null);
            synchronized (AudioTrackAudioOutput.releaseExecutorLock) {
                try {
                    int i = 1;
                    if (AudioTrackAudioOutput.releaseExecutor == null) {
                        AudioTrackAudioOutput.releaseExecutor = Executors.newSingleThreadScheduledExecutor(new EventModule$$ExternalSyntheticLambda0(i));
                    }
                    AudioTrackAudioOutput.pendingReleaseCount++;
                    AudioTrackAudioOutput.releaseExecutor.schedule(new AFd1wSDK$$ExternalSyntheticLambda2(26, audioTrack2, createHandlerForCurrentLooper, listenerSet), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.audioOutput = null;
        }
        LruCache lruCache = this.writeExceptionPendingExceptionHolder;
        lruCache.cache = null;
        lruCache.maxSize = -9223372036854775807L;
        lruCache.currentSize = -9223372036854775807L;
        LruCache lruCache2 = this.initializationExceptionPendingExceptionHolder;
        lruCache2.cache = null;
        lruCache2.maxSize = -9223372036854775807L;
        lruCache2.currentSize = -9223372036854775807L;
        this.skippedOutputFrameCountAtLastPosition = 0L;
        this.accumulatedSkippedSilenceDurationUs = 0L;
        Handler handler = this.reportSkippedSilenceHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final AudioOutputProvider.FormatConfig getFormatConfig(Format format2) {
        AudioOutputProvider.FormatConfig formatConfig = new AudioOutputProvider.FormatConfig(format2);
        formatConfig.audioAttributes = this.audioAttributes;
        formatConfig.enableOffload = this.offloadMode != 0;
        formatConfig.preferredDevice = this.preferredDevice;
        formatConfig.audioSessionId = this.audioSessionId;
        formatConfig.enableTunneling = this.tunneling;
        formatConfig.preferredBufferSize = -1;
        formatConfig.virtualDeviceId = this.virtualDeviceId;
        return new AudioOutputProvider.FormatConfig(formatConfig);
    }

    public final int getFormatSupport(Format format2) {
        boolean z;
        if (!Util.isEncodingLinearPcm(format2.pcmEncoding) || format2.pcmEncoding == 2) {
            z = false;
        } else {
            Format.Builder buildUpon = format2.buildUpon();
            buildUpon.pcmEncoding = 2;
            format2 = new Format(buildUpon);
            z = true;
        }
        int i = ((AudioTrackAudioOutputProvider) this.audioOutputProvider).getFormatSupport(getFormatConfig(format2)).supportLevel;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final long getWrittenFrames() {
        boolean equals;
        equals = Objects.equals(((Format) this.configuration.groupedMap).sampleMimeType, "audio/raw");
        if (!equals) {
            return this.writtenEncodedFrames;
        }
        long j = this.writtenPcmBytes;
        long j2 = this.configuration.currentSize;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00a9, code lost:
    
        if (initializeAudioOutput() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0118, code lost:
    
        if (r5 == 0) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleBuffer(int i, long j, ByteBuffer byteBuffer) {
        long j2;
        long j3;
        boolean equals;
        boolean equals2;
        long j4;
        boolean equals3;
        ByteBuffer byteBuffer2 = this.inputBuffer;
        Trace.checkArgument(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.pendingConfiguration != null) {
            if (drainToEndOfStream()) {
                if (this.audioOutput != null) {
                    AudioOutputProvider.OutputConfig outputConfig = (AudioOutputProvider.OutputConfig) this.configuration.sortedSizes;
                    getFormatConfig((Format) this.pendingConfiguration.keyPool);
                    if (!((AudioOutputProvider.OutputConfig) this.pendingConfiguration.sortedSizes).equals(outputConfig)) {
                        playPendingData();
                        if (!hasPendingData()) {
                            flush();
                            applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                        }
                    }
                }
                this.configuration = this.pendingConfiguration;
                this.pendingConfiguration = null;
                AudioTrackAudioOutput audioTrackAudioOutput = this.audioOutput;
                if (audioTrackAudioOutput != null && audioTrackAudioOutput.audioTrack.isOffloadedPlayback() && ((AudioOutputProvider.OutputConfig) this.configuration.sortedSizes).useOffloadGapless) {
                    AudioTrackAudioOutput audioTrackAudioOutput2 = this.audioOutput;
                    AudioTrack audioTrack = audioTrackAudioOutput2.audioTrack;
                    if (audioTrack.getPlayState() == 3) {
                        audioTrack.setOffloadEndOfStream();
                        AudioTrackPositionTracker audioTrackPositionTracker = audioTrackAudioOutput2.audioTrackPositionTracker;
                        audioTrackPositionTracker.expectRawPlaybackHeadReset = true;
                        audioTrackPositionTracker.audioTimestampPoller.audioTimestamp.expectTimestampFramePositionReset = true;
                    }
                    AudioTrackAudioOutput audioTrackAudioOutput3 = this.audioOutput;
                    Format format2 = (Format) this.configuration.groupedMap;
                    audioTrackAudioOutput3.audioTrack.setOffloadDelayPadding(format2.encoderDelay, format2.encoderPadding);
                    this.isWaitingForOffloadEndOfStreamHandled = true;
                }
                applyAudioProcessorPlaybackParametersAndSkipSilence(j);
            }
            return false;
        }
        boolean isAudioOutputInitialized = isAudioOutputInitialized();
        LruCache lruCache = this.initializationExceptionPendingExceptionHolder;
        if (!isAudioOutputInitialized) {
            try {
            } catch (AudioSink$InitializationException e) {
                if (e.isRecoverable) {
                    throw e;
                }
                lruCache.throwExceptionIfDeadlineIsReached(e);
                return false;
            }
        }
        lruCache.cache = null;
        lruCache.maxSize = -9223372036854775807L;
        lruCache.currentSize = -9223372036854775807L;
        if (this.startMediaTimeUsNeedsInit) {
            this.startMediaTimeUs = Math.max(0L, j);
            this.startMediaTimeUsNeedsSync = false;
            this.startMediaTimeUsNeedsInit = false;
            if (useAudioOutputPlaybackParams()) {
                setAudioOutputPlaybackParameters();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j);
            if (this.playing) {
                play();
            }
        }
        if (this.inputBuffer == null) {
            Trace.checkArgument(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                equals = Objects.equals(((Format) this.configuration.groupedMap).sampleMimeType, "audio/raw");
                if (!equals && this.framesPerEncodedSample == 0) {
                    int framesPerEncodedSample = getFramesPerEncodedSample(((AudioOutputProvider.OutputConfig) this.configuration.sortedSizes).f880encoding, byteBuffer);
                    this.framesPerEncodedSample = framesPerEncodedSample;
                }
                if (this.afterDrainParameters != null) {
                    if (drainToEndOfStream()) {
                        applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                        this.afterDrainParameters = null;
                    }
                    return false;
                }
                long j5 = this.startMediaTimeUs;
                LruArrayPool lruArrayPool = this.configuration;
                equals2 = Objects.equals(((Format) lruArrayPool.groupedMap).sampleMimeType, "audio/raw");
                if (equals2) {
                    j2 = -9223372036854775807L;
                    j3 = 0;
                    j4 = this.submittedPcmBytes / this.configuration.maxSize;
                } else {
                    j2 = -9223372036854775807L;
                    j3 = 0;
                    j4 = this.submittedEncodedFrames;
                }
                long sampleCountToDurationUs = Util.sampleCountToDurationUs(((Format) lruArrayPool.groupedMap).sampleRate, j4 - this.trimmingAudioProcessor.trimmedFrameCount) + j5;
                if (!this.startMediaTimeUsNeedsSync && Math.abs(sampleCountToDurationUs - j) > 200000) {
                    BiometricPrompt biometricPrompt = this.listener;
                    if (biometricPrompt != null) {
                        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(sampleCountToDurationUs, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                        m1149m.append(j);
                        biometricPrompt.onAudioSinkError(new AudioSink$UnexpectedDiscontinuityException(m1149m.toString()));
                    }
                    this.startMediaTimeUsNeedsSync = true;
                }
                if (this.startMediaTimeUsNeedsSync) {
                    if (drainToEndOfStream()) {
                        long j6 = j - sampleCountToDurationUs;
                        this.startMediaTimeUs += j6;
                        this.startMediaTimeUsNeedsSync = false;
                        applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                        BiometricPrompt biometricPrompt2 = this.listener;
                        if (biometricPrompt2 != null && j6 != j3) {
                            ((MediaCodecAudioRenderer) biometricPrompt2.mClientFragmentManager).allowPositionDiscontinuity = true;
                        }
                    }
                    return false;
                }
                equals3 = Objects.equals(((Format) this.configuration.groupedMap).sampleMimeType, "audio/raw");
                if (equals3) {
                    this.submittedPcmBytes += byteBuffer.remaining();
                } else {
                    this.submittedEncodedFrames = (this.framesPerEncodedSample * i) + this.submittedEncodedFrames;
                }
                this.inputBuffer = byteBuffer;
                this.inputBufferAccessUnitCount = i;
            }
            return true;
        }
        j2 = -9223372036854775807L;
        j3 = 0;
        processBuffers(j);
        if (!this.inputBuffer.hasRemaining()) {
            this.inputBuffer = null;
            this.inputBufferAccessUnitCount = 0;
            return true;
        }
        AudioTrackAudioOutput audioTrackAudioOutput4 = this.audioOutput;
        AudioTrackPositionTracker audioTrackPositionTracker2 = audioTrackAudioOutput4.audioTrackPositionTracker;
        long writtenFrames = audioTrackAudioOutput4.getWrittenFrames();
        if (audioTrackPositionTracker2.forceResetWorkaroundTimeMs != j2 && writtenFrames > j3) {
            audioTrackPositionTracker2.clock.getClass();
            if (SystemClock.elapsedRealtime() - audioTrackPositionTracker2.forceResetWorkaroundTimeMs >= 200) {
                Log.w("DefaultAudioSink", "Resetting stalled audio output");
                flush();
                return true;
            }
        }
        return false;
    }

    public final boolean hasPendingData() {
        if (!isAudioOutputInitialized()) {
            return false;
        }
        if (this.audioOutput.audioTrack.isOffloadedPlayback() && this.handledOffloadOnPresentationEnded) {
            return false;
        }
        long writtenFrames = getWrittenFrames();
        long positionUs = this.audioOutput.getPositionUs();
        AudioTrackAudioOutput audioTrackAudioOutput = this.audioOutput;
        audioTrackAudioOutput.getClass();
        return writtenFrames > Util.scaleLargeValue(positionUs, (long) audioTrackAudioOutput.audioTrack.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final boolean initializeAudioOutput() {
        AudioTrackAudioOutput buildAudioOutput;
        LoudnessCodecController loudnessCodecController;
        LruCache lruCache = this.initializationExceptionPendingExceptionHolder;
        if (((Exception) lruCache.cache) != null && (pendingReleaseCount.get() > 0 || SystemClock.elapsedRealtime() < lruCache.currentSize)) {
            return false;
        }
        try {
            buildAudioOutput = buildAudioOutput((AudioOutputProvider.OutputConfig) this.configuration.sortedSizes);
        } catch (AudioSink$InitializationException e) {
            int i = ((AudioOutputProvider.OutputConfig) this.configuration.sortedSizes).bufferSize;
            while (true) {
                LruArrayPool lruArrayPool = this.configuration;
                if (i <= 1000000) {
                    if (!((AudioOutputProvider.OutputConfig) lruArrayPool.sortedSizes).isOffload) {
                        throw e;
                    }
                    this.offloadDisabledUntilNextConfiguration = true;
                    throw e;
                }
                int i2 = i / 2;
                int i3 = lruArrayPool.currentSize;
                if (i3 == -1) {
                    i3 = 1;
                }
                int i4 = i2 % i3;
                int i5 = i4 != 0 ? (i3 - i4) + i2 : i2;
                AudioOutputProvider.OutputConfig.Builder buildUpon = ((AudioOutputProvider.OutputConfig) lruArrayPool.sortedSizes).buildUpon();
                buildUpon.bufferSize = i5;
                AudioOutputProvider.OutputConfig outputConfig = new AudioOutputProvider.OutputConfig(buildUpon);
                try {
                    buildAudioOutput = buildAudioOutput(outputConfig);
                    LruArrayPool lruArrayPool2 = this.configuration;
                    this.configuration = new LruArrayPool((Format) lruArrayPool2.groupedMap, (Format) lruArrayPool2.keyPool, lruArrayPool2.maxSize, lruArrayPool2.currentSize, outputConfig, (AudioProcessingPipeline) lruArrayPool2.adapters);
                    break;
                } catch (AudioSink$InitializationException e2) {
                    e.addSuppressed(e2);
                    i = i5;
                }
            }
        }
        this.audioOutput = buildAudioOutput;
        AudioOutputListener audioOutputListener = new AudioOutputListener((AudioOutputProvider.OutputConfig) this.configuration.sortedSizes);
        this.audioOutputListener = audioOutputListener;
        buildAudioOutput.listeners.add(audioOutputListener);
        if (this.audioOutput.audioTrack.isOffloadedPlayback()) {
            LruArrayPool lruArrayPool3 = this.configuration;
            if (((AudioOutputProvider.OutputConfig) lruArrayPool3.sortedSizes).useOffloadGapless) {
                AudioTrackAudioOutput audioTrackAudioOutput = this.audioOutput;
                Format format2 = (Format) lruArrayPool3.groupedMap;
                audioTrackAudioOutput.audioTrack.setOffloadDelayPadding(format2.encoderDelay, format2.encoderPadding);
            }
        }
        PlayerId playerId = this.playerId;
        if (playerId != null) {
            this.audioOutput.setPlayerId(playerId);
        }
        if (isAudioOutputInitialized()) {
            this.audioOutput.audioTrack.setVolume(this.volume);
        }
        this.auxEffectInfo.getClass();
        AudioDeviceInfo audioDeviceInfo = this.preferredDevice;
        if (audioDeviceInfo != null) {
            this.audioOutput.audioTrack.setPreferredDevice(audioDeviceInfo);
        }
        this.startMediaTimeUsNeedsInit = true;
        int audioSessionId = this.audioOutput.audioTrack.getAudioSessionId();
        boolean z = audioSessionId != this.audioSessionId;
        this.audioSessionId = audioSessionId;
        BiometricPrompt biometricPrompt = this.listener;
        if (biometricPrompt != null) {
            int i6 = ((AudioOutputProvider.OutputConfig) this.configuration.sortedSizes).f880encoding;
            AudioSink$AudioTrackConfig audioSink$AudioTrackConfig = new AudioSink$AudioTrackConfig();
            CallResult callResult = ((MediaCodecAudioRenderer) biometricPrompt.mClientFragmentManager).eventDispatcher;
            Handler handler = (Handler) callResult.result;
            if (handler != null) {
                handler.post(new AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(7, callResult, audioSink$AudioTrackConfig));
            }
            if (z) {
                this.pendingAudioSessionIdChangeConfirmation = true;
                LruArrayPool lruArrayPool4 = this.configuration;
                AudioOutputProvider.OutputConfig.Builder buildUpon2 = ((AudioOutputProvider.OutputConfig) lruArrayPool4.sortedSizes).buildUpon();
                buildUpon2.audioSessionId = this.audioSessionId;
                this.configuration = new LruArrayPool((Format) lruArrayPool4.groupedMap, (Format) lruArrayPool4.keyPool, lruArrayPool4.maxSize, lruArrayPool4.currentSize, new AudioOutputProvider.OutputConfig(buildUpon2), (AudioProcessingPipeline) lruArrayPool4.adapters);
                LruArrayPool lruArrayPool5 = this.pendingConfiguration;
                if (lruArrayPool5 != null) {
                    AudioOutputProvider.OutputConfig.Builder buildUpon3 = ((AudioOutputProvider.OutputConfig) lruArrayPool5.sortedSizes).buildUpon();
                    buildUpon3.audioSessionId = this.audioSessionId;
                    this.pendingConfiguration = new LruArrayPool((Format) lruArrayPool5.groupedMap, (Format) lruArrayPool5.keyPool, lruArrayPool5.maxSize, lruArrayPool5.currentSize, new AudioOutputProvider.OutputConfig(buildUpon3), (AudioProcessingPipeline) lruArrayPool5.adapters);
                }
                BiometricPrompt biometricPrompt2 = this.listener;
                int i7 = this.audioSessionId;
                MediaCodecAudioRenderer mediaCodecAudioRenderer = (MediaCodecAudioRenderer) biometricPrompt2.mClientFragmentManager;
                if (Build.VERSION.SDK_INT >= 35 && (loudnessCodecController = mediaCodecAudioRenderer.loudnessCodecController) != null) {
                    loudnessCodecController.setAudioSessionId(i7);
                }
                CallResult callResult2 = mediaCodecAudioRenderer.eventDispatcher;
                Handler handler2 = (Handler) callResult2.result;
                if (handler2 != null) {
                    handler2.post(new Recorder$$ExternalSyntheticLambda14(callResult2, i7, 8));
                }
            }
        }
        return true;
    }

    public final boolean isAudioOutputInitialized() {
        return this.audioOutput != null;
    }

    public final void play() {
        this.playing = true;
        if (isAudioOutputInitialized()) {
            AudioTrackAudioOutput audioTrackAudioOutput = this.audioOutput;
            AudioTrack audioTrack = audioTrackAudioOutput.audioTrack;
            AudioTrackPositionTracker audioTrackPositionTracker = audioTrackAudioOutput.audioTrackPositionTracker;
            if (audioTrackPositionTracker.stopTimestampUs != -9223372036854775807L) {
                audioTrackPositionTracker.clock.getClass();
                audioTrackPositionTracker.stopTimestampUs = Util.msToUs(SystemClock.elapsedRealtime());
            }
            audioTrackPositionTracker.onPositionAdvancingFromPositionUs = Util.sampleCountToDurationUs(audioTrackPositionTracker.outputSampleRate, audioTrackPositionTracker.getPlaybackHeadPosition());
            audioTrackPositionTracker.audioTimestampPoller.updateState(0);
            if (!audioTrackAudioOutput.hasBeenStopped || audioTrack.isOffloadedPlayback()) {
                audioTrack.play();
            }
        }
    }

    public final void playPendingData() {
        if (this.stoppedAudioOutput) {
            return;
        }
        this.stoppedAudioOutput = true;
        if (this.audioOutput.audioTrack.isOffloadedPlayback()) {
            this.handledOffloadOnPresentationEnded = false;
        }
        AudioTrackAudioOutput audioTrackAudioOutput = this.audioOutput;
        if (audioTrackAudioOutput.hasBeenStopped) {
            return;
        }
        audioTrackAudioOutput.hasBeenStopped = true;
        AudioTrackPositionTracker audioTrackPositionTracker = audioTrackAudioOutput.audioTrackPositionTracker;
        long writtenFrames = audioTrackAudioOutput.getWrittenFrames();
        audioTrackPositionTracker.stopPlaybackHeadPosition = audioTrackPositionTracker.getPlaybackHeadPosition();
        audioTrackPositionTracker.clock.getClass();
        audioTrackPositionTracker.stopTimestampUs = Util.msToUs(SystemClock.elapsedRealtime());
        audioTrackPositionTracker.endPlaybackHeadPosition = writtenFrames;
        audioTrackAudioOutput.audioTrack.stop();
    }

    public final void processBuffers(long j) {
        ByteBuffer byteBuffer;
        drainOutputBuffer(j);
        if (this.outputBuffer != null) {
            return;
        }
        if (!this.audioProcessingPipeline.isOperational()) {
            ByteBuffer byteBuffer2 = this.inputBuffer;
            if (byteBuffer2 != null) {
                setOutputBuffer(byteBuffer2);
                drainOutputBuffer(j);
                return;
            }
            return;
        }
        while (!this.audioProcessingPipeline.isEnded()) {
            do {
                AudioProcessingPipeline audioProcessingPipeline = this.audioProcessingPipeline;
                if (audioProcessingPipeline.isOperational()) {
                    ByteBuffer byteBuffer3 = audioProcessingPipeline.outputBuffers[audioProcessingPipeline.getFinalOutputBufferIndex()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        audioProcessingPipeline.processData(AudioProcessor.EMPTY_BUFFER);
                        byteBuffer = audioProcessingPipeline.outputBuffers[audioProcessingPipeline.getFinalOutputBufferIndex()];
                    }
                } else {
                    byteBuffer = AudioProcessor.EMPTY_BUFFER;
                }
                if (byteBuffer.hasRemaining()) {
                    setOutputBuffer(byteBuffer);
                    drainOutputBuffer(j);
                } else {
                    ByteBuffer byteBuffer4 = this.inputBuffer;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    AudioProcessingPipeline audioProcessingPipeline2 = this.audioProcessingPipeline;
                    ByteBuffer byteBuffer5 = this.inputBuffer;
                    if (audioProcessingPipeline2.isOperational() && !audioProcessingPipeline2.inputEnded) {
                        audioProcessingPipeline2.processData(byteBuffer5);
                    }
                }
            } while (this.outputBuffer == null);
            return;
        }
    }

    public final void reconfigureAndFlush() {
        if (this.configuration != null) {
            LruArrayPool lruArrayPool = this.pendingConfiguration;
            if (lruArrayPool != null) {
                this.configuration = lruArrayPool;
                this.pendingConfiguration = null;
            }
            try {
                AudioOutputProvider.OutputConfig outputConfig = ((AudioTrackAudioOutputProvider) this.audioOutputProvider).getOutputConfig(getFormatConfig((Format) this.configuration.keyPool));
                LruArrayPool lruArrayPool2 = this.configuration;
                this.configuration = new LruArrayPool((Format) lruArrayPool2.groupedMap, (Format) lruArrayPool2.keyPool, lruArrayPool2.maxSize, lruArrayPool2.currentSize, outputConfig, (AudioProcessingPipeline) lruArrayPool2.adapters);
            } catch (AudioOutputProvider.ConfigurationException e) {
                OptionalProvider$$ExternalSyntheticLambda0.m(new AudioSink$ConfigurationException(e, (Format) this.configuration.groupedMap));
                return;
            }
        }
        flush();
    }

    public final void reset() {
        flush();
        ImmutableList.Itr listIterator = this.availableAudioProcessors.listIterator(0);
        while (listIterator.hasNext()) {
            ((AudioProcessor) listIterator.next()).reset();
        }
        this.toInt16PcmAudioProcessor.reset();
        this.toFloatPcmAudioProcessor.reset();
        AudioProcessingPipeline audioProcessingPipeline = this.audioProcessingPipeline;
        if (audioProcessingPipeline != null) {
            ImmutableList immutableList = audioProcessingPipeline.audioProcessors;
            for (int i = 0; i < immutableList.size(); i++) {
                AudioProcessor audioProcessor = (AudioProcessor) immutableList.get(i);
                audioProcessor.flush(AudioProcessor.StreamMetadata.DEFAULT);
                audioProcessor.reset();
            }
            audioProcessingPipeline.activeAudioProcessors.clear();
            audioProcessingPipeline.outputBuffers = new ByteBuffer[0];
            AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
            audioProcessingPipeline.inputEnded = false;
        }
        this.playing = false;
        this.offloadDisabledUntilNextConfiguration = false;
    }

    public final void setAudioOutputPlaybackParameters() {
        if (isAudioOutputInitialized()) {
            AudioTrackAudioOutput audioTrackAudioOutput = this.audioOutput;
            PlaybackParameters playbackParameters = this.playbackParameters;
            AudioTrack audioTrack = audioTrackAudioOutput.audioTrack;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(Util.constrainValue(playbackParameters.speed, 0.1f, audioTrackAudioOutput.maxPlaybackSpeed)).setPitch(Util.constrainValue(playbackParameters.pitch, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                Log.w("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            AudioTrackPositionTracker audioTrackPositionTracker = audioTrackAudioOutput.audioTrackPositionTracker;
            audioTrackPositionTracker.audioTrackPlaybackSpeed = audioTrack.getPlaybackParams().getSpeed();
            audioTrackPositionTracker.audioTimestampPoller.updateState(0);
            audioTrackPositionTracker.smoothedPlayheadOffsetUs = 0L;
            audioTrackPositionTracker.playheadOffsetCount = 0;
            audioTrackPositionTracker.nextPlayheadOffsetIndex = 0;
            audioTrackPositionTracker.lastPlayheadSampleTimeUs = 0L;
            audioTrackPositionTracker.lastPositionUs = -9223372036854775807L;
            audioTrackPositionTracker.lastSystemTimeUs = -9223372036854775807L;
            PlaybackParams playbackParams = this.audioOutput.audioTrack.getPlaybackParams();
            this.playbackParameters = new PlaybackParameters(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setOutputBuffer(ByteBuffer byteBuffer) {
        boolean equals;
        ByteBuffer byteBuffer2;
        int i;
        byte b;
        int i2;
        int i3;
        Trace.checkState(this.outputBuffer == null);
        if (byteBuffer.hasRemaining()) {
            equals = Objects.equals(((Format) this.configuration.groupedMap).sampleMimeType, "audio/raw");
            if (equals) {
                int scaleLargeValue = (int) Util.scaleLargeValue(Util.msToUs(20L), ((AudioOutputProvider.OutputConfig) this.configuration.sortedSizes).sampleRate, 1000000L, RoundingMode.UP);
                long writtenFrames = getWrittenFrames();
                long j = scaleLargeValue;
                if (writtenFrames < j) {
                    LruArrayPool lruArrayPool = this.configuration;
                    int i4 = ((AudioOutputProvider.OutputConfig) lruArrayPool.sortedSizes).f880encoding;
                    int i5 = lruArrayPool.currentSize;
                    int i6 = (int) writtenFrames;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i6 < scaleLargeValue) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i4 == 4) {
                                float constrainValue = Util.constrainValue(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i3 = (int) (constrainValue < RecyclerView.DECELERATION_RATE ? (-constrainValue) * (-2.1474836E9f) : constrainValue * 2.1474836E9f);
                            } else if (i4 == 21) {
                                i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            } else if (i4 != 22) {
                                if (i4 == 268435456) {
                                    i = (byteBuffer.get() & 255) << 24;
                                    i2 = (byteBuffer.get() & 255) << 16;
                                } else if (i4 == 1342177280) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i2 = (byteBuffer.get() & 255) << 8;
                                } else if (i4 == 1610612736) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i2 = byteBuffer.get() & 255;
                                } else if (i4 != 1879048192) {
                                    Path$$ExternalSyntheticBUOutline0.m();
                                    return;
                                } else {
                                    double max = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                    i3 = (int) (max < 0.0d ? (-max) * (-2.147483648E9d) : max * 2.147483647E9d);
                                }
                                i3 = i | i2;
                            } else {
                                i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            }
                            int i7 = (int) ((i3 * i6) / j);
                            if (i4 != 2) {
                                byteBuffer2.put((byte) (i7 >> 16));
                                byteBuffer2.put((byte) (i7 >> 24));
                            } else if (i4 == 3) {
                                byteBuffer2.put((byte) (i7 >> 24));
                            } else if (i4 != 4) {
                                if (i4 == 21) {
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 24));
                                } else if (i4 == 22) {
                                    byteBuffer2.put((byte) i7);
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 24));
                                } else if (i4 == 268435456) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                } else if (i4 == 1342177280) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 8));
                                } else if (i4 == 1610612736) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) i7);
                                } else if (i4 != 1879048192) {
                                    Path$$ExternalSyntheticBUOutline0.m();
                                    return;
                                } else if (i7 < 0) {
                                    byteBuffer2.putDouble((-i7) / (-2.147483648E9d));
                                } else {
                                    byteBuffer2.putDouble(i7 / 2.147483647E9d);
                                }
                            } else if (i7 < 0) {
                                byteBuffer2.putFloat((-i7) / (-2.1474836E9f));
                            } else {
                                byteBuffer2.putFloat(i7 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + i5) {
                                i6++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & 255) << 24;
                        i3 = i | i2;
                        int i72 = (int) ((i3 * i6) / j);
                        if (i4 != 2) {
                        }
                        if (byteBuffer.position() != position + i5) {
                        }
                    }
                    byteBuffer2.put(byteBuffer);
                    byteBuffer2.flip();
                    this.outputBuffer = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.outputBuffer = byteBuffer2;
        }
    }

    public final boolean useAudioOutputPlaybackParams() {
        LruArrayPool lruArrayPool = this.configuration;
        return lruArrayPool != null && ((AudioOutputProvider.OutputConfig) lruArrayPool.sortedSizes).usePlaybackParameters;
    }
}
