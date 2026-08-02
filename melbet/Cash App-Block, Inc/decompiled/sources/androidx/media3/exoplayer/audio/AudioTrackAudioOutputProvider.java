package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.camera.video.Recorder;
import androidx.compose.animation.core.VectorizedFloatDecaySpec;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.util.SpatializerWrapper;
import androidx.media3.extractor.AacUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import com.google.common.collect.RegularImmutableList;
import com.squareup.cash.NavigationModule$Companion;
import com.squareup.util.Strings;
import dagger.internal.Preconditions;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class AudioTrackAudioOutputProvider implements AudioOutputProvider {
    public AudioCapabilities audioCapabilities;
    public AudioCapabilitiesReceiver audioCapabilitiesReceiver;
    public final DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider;
    public final AudioSink$AudioTrackConfig audioTrackBufferSizeProvider;
    public final Recorder.AnonymousClass6 capabilityChangeListener;
    public SystemClock clock;
    public final Context context;
    public Context contextWithDeviceId;
    public ListenerSet listeners;
    public final float maxPlaybackSpeed;
    public Looper playbackLooper;

    public AudioTrackAudioOutputProvider(VectorizedFloatDecaySpec vectorizedFloatDecaySpec) {
        Context context = (Context) vectorizedFloatDecaySpec.floatDecaySpec;
        this.context = context;
        DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider = (DefaultAudioSink.AudioOffloadSupportProvider) vectorizedFloatDecaySpec.valueVector;
        audioOffloadSupportProvider.getClass();
        this.audioOffloadSupportProvider = audioOffloadSupportProvider;
        this.audioTrackBufferSizeProvider = (AudioSink$AudioTrackConfig) vectorizedFloatDecaySpec.velocityVector;
        this.audioCapabilities = (AudioCapabilities) vectorizedFloatDecaySpec.targetVector;
        this.capabilityChangeListener = context == null ? null : new Recorder.AnonymousClass6(this, 24);
        this.maxPlaybackSpeed = vectorizedFloatDecaySpec.absVelocityThreshold;
        this.clock = SystemClock.DEFAULT;
    }

    public final AudioTrackAudioOutput getAudioOutput(AudioOutputProvider.OutputConfig outputConfig) {
        Context context;
        Context context2;
        try {
            int i = outputConfig.audioSessionId;
            int i2 = outputConfig.virtualDeviceId;
            if (i2 == -1 || (context2 = this.context) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.contextWithDeviceId;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.contextWithDeviceId = context2.createDeviceContext(i2);
                }
                context = this.contextWithDeviceId;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(outputConfig.isTunneling ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : outputConfig.audioAttributes.getPlatformAudioAttributes()).setAudioFormat(new AudioFormat.Builder().setSampleRate(outputConfig.sampleRate).setChannelMask(outputConfig.channelMask).setEncoding(outputConfig.f880encoding).build()).setTransferMode(1).setBufferSizeInBytes(outputConfig.bufferSize).setSessionId(i);
            sessionId.setOffloadedPlayback(outputConfig.isOffload);
            if (Build.VERSION.SDK_INT >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new AudioTrackAudioOutput(build, outputConfig, this.capabilityChangeListener, this.maxPlaybackSpeed, this.clock);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new AudioOutputProvider.InitializationException();
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new AudioOutputProvider.InitializationException(e);
        }
    }

    public final AudioOutputProvider.FormatSupport getFormatSupport(AudioOutputProvider.FormatConfig formatConfig) {
        updateAudioCapabilitiesReceiver(formatConfig);
        Format format2 = formatConfig.f879format;
        androidx.media3.common.AudioAttributes audioAttributes = formatConfig.audioAttributes;
        AudioOffloadSupport audioOffloadSupport = ((DefaultAudioOffloadSupportProvider) this.audioOffloadSupportProvider).getAudioOffloadSupport(audioAttributes, format2);
        LinearLayoutManager.LayoutChunkResult layoutChunkResult = new LinearLayoutManager.LayoutChunkResult();
        String str = format2.sampleMimeType;
        int i = format2.pcmEncoding;
        int i2 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.audioCapabilities.getEncodingAndChannelConfigForPassthrough(audioAttributes, format2) != null : i == 2) {
            i2 = 2;
        }
        layoutChunkResult.mConsumed = i2;
        layoutChunkResult.mFinished = audioOffloadSupport.isFormatSupported;
        layoutChunkResult.mIgnoreConsumed = audioOffloadSupport.isGaplessSupported;
        layoutChunkResult.mFocusable = audioOffloadSupport.isSpeedChangeSupported;
        return layoutChunkResult.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AudioOutputProvider.OutputConfig getOutputConfig(AudioOutputProvider.FormatConfig formatConfig) {
        int intValue;
        int i;
        boolean z;
        char c;
        boolean z2;
        int i2;
        int i3;
        double d;
        boolean z3;
        int constrainValue;
        int maximumEncodedRateBytesPerSecond;
        Format format2 = formatConfig.f879format;
        boolean z4 = formatConfig.enableOffload;
        androidx.media3.common.AudioAttributes audioAttributes = formatConfig.audioAttributes;
        updateAudioCapabilitiesReceiver(formatConfig);
        String str = format2.sampleMimeType;
        int i4 = format2.sampleRate;
        int i5 = format2.pcmEncoding;
        int i6 = format2.channelCount;
        if (Objects.equals(str, "audio/raw")) {
            Trace.checkArgument(Util.isEncodingLinearPcm(i5));
            intValue = Util.getAudioTrackChannelConfig(i6);
            i = Util.getByteDepth(i5) * i6;
            z = false;
            c = 0;
        } else {
            AudioOffloadSupport audioOffloadSupport = z4 ? ((DefaultAudioOffloadSupportProvider) this.audioOffloadSupportProvider).getAudioOffloadSupport(audioAttributes, format2) : AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            if (z4 && audioOffloadSupport.isFormatSupported) {
                str.getClass();
                int encoding2 = MimeTypes.getEncoding(str, format2.codecs);
                int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(i6);
                boolean z5 = audioOffloadSupport.isGaplessSupported;
                i5 = encoding2;
                intValue = audioTrackChannelConfig;
                z = z5;
                i = -1;
                c = 1;
                z2 = true;
                i2 = format2.bitrate;
                if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i2 == -1) {
                    i2 = 768000;
                }
                i3 = formatConfig.preferredBufferSize;
                if (i3 == -1) {
                    z3 = true;
                } else {
                    int minBufferSize = AudioTrack.getMinBufferSize(i4, intValue, i5);
                    Trace.checkState(minBufferSize != -2);
                    if (i == -1) {
                        i = 1;
                    }
                    double d2 = z2 ? this.maxPlaybackSpeed : 1.0d;
                    this.audioTrackBufferSizeProvider.getClass();
                    if (c == 0) {
                        d = d2;
                        z3 = true;
                        long j = i4;
                        long j2 = 250000 * j;
                        long j3 = i;
                        constrainValue = Util.constrainValue(minBufferSize * 4, CompositeException.WrappedPrintStream.checkedCast((j2 * j3) / 1000000), CompositeException.WrappedPrintStream.checkedCast(((750000 * j) * j3) / 1000000));
                    } else if (c == 1) {
                        d = d2;
                        z3 = true;
                        int maximumEncodedRateBytesPerSecond2 = AacUtil.getMaximumEncodedRateBytesPerSecond(i5);
                        Trace.checkState(maximumEncodedRateBytesPerSecond2 != -2147483647);
                        constrainValue = CompositeException.WrappedPrintStream.checkedCast((Strings.DISK_CACHE_SIZE * maximumEncodedRateBytesPerSecond2) / 1000000);
                    } else {
                        if (c != 2) {
                            Path$$ExternalSyntheticBUOutline0.m$3();
                            return null;
                        }
                        z3 = true;
                        int i7 = i5 == 5 ? 500000 : i5 == 8 ? 1000000 : 250000;
                        if (i2 != -1) {
                            RoundingMode roundingMode = RoundingMode.CEILING;
                            maximumEncodedRateBytesPerSecond = Preconditions.divide(i2, 8);
                        } else {
                            maximumEncodedRateBytesPerSecond = AacUtil.getMaximumEncodedRateBytesPerSecond(i5);
                            Trace.checkState(maximumEncodedRateBytesPerSecond != -2147483647);
                        }
                        d = d2;
                        constrainValue = CompositeException.WrappedPrintStream.checkedCast((i7 * maximumEncodedRateBytesPerSecond) / 1000000);
                    }
                    i3 = (((Math.max(minBufferSize, (int) (constrainValue * d)) + i) - 1) / i) * i;
                }
                AudioOutputProvider.OutputConfig.Builder builder = new AudioOutputProvider.OutputConfig.Builder();
                androidx.media3.common.AudioAttributes audioAttributes2 = androidx.media3.common.AudioAttributes.DEFAULT;
                builder.virtualDeviceId = -1;
                builder.sampleRate = i4;
                builder.channelMask = intValue;
                builder.f881encoding = i5;
                builder.bufferSize = i3;
                builder.audioSessionId = formatConfig.audioSessionId;
                builder.audioAttributes = audioAttributes;
                boolean z6 = z3;
                builder.isOffload = c != z6 ? z6 : false;
                builder.isTunneling = formatConfig.enableTunneling;
                builder.usePlaybackParameters = z2;
                builder.useOffloadGapless = z;
                builder.virtualDeviceId = formatConfig.virtualDeviceId;
                return new AudioOutputProvider.OutputConfig(builder);
            }
            Pair encodingAndChannelConfigForPassthrough = this.audioCapabilities.getEncodingAndChannelConfigForPassthrough(audioAttributes, format2);
            if (encodingAndChannelConfigForPassthrough == null) {
                throw new AudioOutputProvider.ConfigurationException("Unable to configure passthrough for: " + format2);
            }
            i5 = ((Integer) encodingAndChannelConfigForPassthrough.first).intValue();
            intValue = ((Integer) encodingAndChannelConfigForPassthrough.second).intValue();
            i = -1;
            z = false;
            c = 2;
        }
        z2 = false;
        i2 = format2.bitrate;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i2 = 768000;
        }
        i3 = formatConfig.preferredBufferSize;
        if (i3 == -1) {
        }
        AudioOutputProvider.OutputConfig.Builder builder2 = new AudioOutputProvider.OutputConfig.Builder();
        androidx.media3.common.AudioAttributes audioAttributes22 = androidx.media3.common.AudioAttributes.DEFAULT;
        builder2.virtualDeviceId = -1;
        builder2.sampleRate = i4;
        builder2.channelMask = intValue;
        builder2.f881encoding = i5;
        builder2.bufferSize = i3;
        builder2.audioSessionId = formatConfig.audioSessionId;
        builder2.audioAttributes = audioAttributes;
        boolean z62 = z3;
        builder2.isOffload = c != z62 ? z62 : false;
        builder2.isTunneling = formatConfig.enableTunneling;
        builder2.usePlaybackParameters = z2;
        builder2.useOffloadGapless = z;
        builder2.virtualDeviceId = formatConfig.virtualDeviceId;
        return new AudioOutputProvider.OutputConfig(builder2);
    }

    public final void release() {
        SpatializerWrapper spatializerWrapper;
        ListenerSet listenerSet = this.listeners;
        if (listenerSet != null) {
            listenerSet.release();
        }
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver != null) {
            Context context = audioCapabilitiesReceiver.context;
            if (audioCapabilitiesReceiver.registered) {
                audioCapabilitiesReceiver.audioCapabilities = null;
                NavigationModule$Companion.getAudioManager(context).unregisterAudioDeviceCallback(audioCapabilitiesReceiver.audioDeviceCallback);
                if (Build.VERSION.SDK_INT >= 32 && (spatializerWrapper = audioCapabilitiesReceiver.spatializer) != null) {
                    spatializerWrapper.release();
                    audioCapabilitiesReceiver.spatializer = null;
                }
                context.unregisterReceiver(audioCapabilitiesReceiver.hdmiAudioPlugBroadcastReceiver);
                AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = audioCapabilitiesReceiver.externalSurroundSoundSettingObserver;
                if (externalSurroundSoundSettingObserver != null) {
                    externalSurroundSoundSettingObserver.resolver.unregisterContentObserver(externalSurroundSoundSettingObserver);
                }
                audioCapabilitiesReceiver.registered = false;
            }
        }
    }

    public final void updateAudioCapabilitiesReceiver(AudioOutputProvider.FormatConfig formatConfig) {
        Context context;
        AudioCapabilities capabilitiesInternal;
        AudioDeviceInfo audioDeviceInfo = formatConfig.preferredDevice;
        androidx.media3.common.AudioAttributes audioAttributes = formatConfig.audioAttributes;
        verifySinglePlaybackLooper();
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver == null && (context = this.context) != null) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver2 = new AudioCapabilitiesReceiver(context, new ExoPlayerImplInternal$$ExternalSyntheticLambda2(this, 6), audioAttributes, audioDeviceInfo);
            this.audioCapabilitiesReceiver = audioCapabilitiesReceiver2;
            if (audioCapabilitiesReceiver2.registered) {
                capabilitiesInternal = audioCapabilitiesReceiver2.audioCapabilities;
                capabilitiesInternal.getClass();
            } else {
                audioCapabilitiesReceiver2.registered = true;
                AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = audioCapabilitiesReceiver2.externalSurroundSoundSettingObserver;
                if (externalSurroundSoundSettingObserver != null) {
                    externalSurroundSoundSettingObserver.resolver.registerContentObserver(externalSurroundSoundSettingObserver.settingUri, false, externalSurroundSoundSettingObserver);
                }
                Context context2 = audioCapabilitiesReceiver2.context;
                AudioManager audioManager = NavigationModule$Companion.getAudioManager(context2);
                AudioCapabilitiesReceiver.AudioDeviceCallback audioDeviceCallback = audioCapabilitiesReceiver2.audioDeviceCallback;
                Handler handler = audioCapabilitiesReceiver2.handler;
                audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
                if (Build.VERSION.SDK_INT >= 32 && audioCapabilitiesReceiver2.spatializer == null) {
                    audioCapabilitiesReceiver2.spatializer = new SpatializerWrapper(context2, new AFd1lSDK$$ExternalSyntheticLambda0(audioCapabilitiesReceiver2, 12), Boolean.valueOf(Util.isTv(context2)));
                }
                capabilitiesInternal = AudioCapabilities.getCapabilitiesInternal(context2, context2.registerReceiver(audioCapabilitiesReceiver2.hdmiAudioPlugBroadcastReceiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), audioCapabilitiesReceiver2.audioAttributes, audioCapabilitiesReceiver2.routedDevice, audioCapabilitiesReceiver2.getSpatializerChannelMasks());
                audioCapabilitiesReceiver2.audioCapabilities = capabilitiesInternal;
            }
            this.audioCapabilities = capabilitiesInternal;
        } else if (audioCapabilitiesReceiver != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(audioCapabilitiesReceiver.routedDevice)) {
                audioCapabilitiesReceiver.routedDevice = audioDeviceInfo;
                Context context3 = audioCapabilitiesReceiver.context;
                androidx.media3.common.AudioAttributes audioAttributes2 = audioCapabilitiesReceiver.audioAttributes;
                List spatializerChannelMasks = audioCapabilitiesReceiver.getSpatializerChannelMasks();
                RegularImmutableList regularImmutableList = AudioCapabilities.DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS;
                audioCapabilitiesReceiver.onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), audioAttributes2, audioDeviceInfo, spatializerChannelMasks));
            }
            AudioCapabilitiesReceiver audioCapabilitiesReceiver3 = this.audioCapabilitiesReceiver;
            if (!Objects.equals(audioAttributes, audioCapabilitiesReceiver3.audioAttributes)) {
                audioCapabilitiesReceiver3.audioAttributes = audioAttributes;
                Context context4 = audioCapabilitiesReceiver3.context;
                AudioDeviceInfo audioDeviceInfo2 = audioCapabilitiesReceiver3.routedDevice;
                List spatializerChannelMasks2 = audioCapabilitiesReceiver3.getSpatializerChannelMasks();
                RegularImmutableList regularImmutableList2 = AudioCapabilities.DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS;
                audioCapabilitiesReceiver3.onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), audioAttributes, audioDeviceInfo2, spatializerChannelMasks2));
            }
        }
        this.audioCapabilities.getClass();
    }

    public final void verifySinglePlaybackLooper() {
        if (this.context == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.playbackLooper;
        boolean z = looper == null || looper == myLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = myLooper != null ? myLooper.getThread().getName() : "null";
        if (z) {
            this.playbackLooper = myLooper;
        } else {
            a$$ExternalSyntheticBUOutline0.m$1(DBUtil.lenientFormat("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
    }
}
