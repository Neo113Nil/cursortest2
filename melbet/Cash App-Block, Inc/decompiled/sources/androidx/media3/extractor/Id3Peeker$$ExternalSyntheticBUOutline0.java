package androidx.media3.extractor;

import android.media.AudioDescriptor;
import android.os.Handler;
import android.os.SystemClock;
import androidx.biometric.BiometricPrompt;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0;
import androidx.media3.exoplayer.audio.AudioSink$AudioTrackConfig;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda1;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.extractor.amr.AmrExtractor;
import androidx.media3.extractor.flac.FlacExtractor;
import androidx.media3.extractor.flv.FlvExtractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.ogg.OggExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.Ac3Extractor;
import androidx.media3.extractor.ts.Ac4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.media3.extractor.wav.WavExtractor;
import app.cash.zipline.CallResult;
import com.android.volley.toolbox.HurlStack;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final /* synthetic */ class Id3Peeker$$ExternalSyntheticBUOutline0 implements ListenerSet.Event, Consumer, ExtractorsFactory {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Id3Peeker$$ExternalSyntheticBUOutline0(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(int i, int i2) {
        throw new IndexOutOfBoundsException("position=" + i + ((Object) ", limit=") + i2);
    }

    @Override // androidx.media3.common.util.Consumer, io.reactivex.rxjava3.functions.Consumer
    public void accept(Object obj) {
        switch (this.$r8$classId) {
            case 13:
                ((SampleQueue.SharedSampleMetadata) obj).drmSessionReference.getClass();
                break;
            default:
                ((ExecutorService) obj).shutdown();
                break;
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        int i = this.$r8$classId;
        HurlStack hurlStack = SubtitleParser.Factory.UNSUPPORTED;
        switch (i) {
            case 17:
                return new Extractor[]{new AmrExtractor()};
            case 18:
                return new Extractor[]{new FlacExtractor()};
            case 19:
                return new Extractor[]{new FlvExtractor()};
            case 20:
            case 21:
            default:
                return new Extractor[]{new WavExtractor()};
            case 22:
                return new Extractor[]{new Mp4Extractor(hurlStack, 16)};
            case 23:
                return new Extractor[]{new OggExtractor()};
            case 24:
                return new Extractor[]{new Ac3Extractor()};
            case 25:
                return new Extractor[]{new Ac4Extractor()};
            case 26:
                return new Extractor[]{new AdtsExtractor()};
            case 27:
                return new Extractor[]{new PsExtractor()};
            case 28:
                TimestampAdjuster timestampAdjuster = new TimestampAdjuster(0L);
                ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                return new Extractor[]{new TsExtractor(1, hurlStack, timestampAdjuster, new DefaultTsPayloadReaderFactory(RegularImmutableList.EMPTY))};
        }
    }

    public Constructor getConstructor() {
        switch (this.$r8$classId) {
            case 15:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(Extractor.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(Extractor.class).getConstructor(null);
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        long j;
        BiometricPrompt biometricPrompt;
        ExoPlayerImplInternal.AnonymousClass1 anonymousClass1;
        DefaultTrackSelector defaultTrackSelector;
        switch (this.$r8$classId) {
            case 1:
                ((AnalyticsListener) obj).getClass();
                return;
            case 2:
                ((AnalyticsListener) obj).getClass();
                return;
            case 3:
                ((AnalyticsListener) obj).getClass();
                return;
            case 4:
            case 5:
            case 6:
            default:
                BiometricPrompt biometricPrompt2 = ((DefaultAudioSink$$ExternalSyntheticLambda1) obj).f$0.listener;
                if (biometricPrompt2 != null) {
                    MediaCodecAudioRenderer mediaCodecAudioRenderer = (MediaCodecAudioRenderer) biometricPrompt2.mClientFragmentManager;
                    synchronized (mediaCodecAudioRenderer.lock) {
                        defaultTrackSelector = mediaCodecAudioRenderer.rendererCapabilitiesListener;
                    }
                    if (defaultTrackSelector != null) {
                        synchronized (defaultTrackSelector.lock) {
                            defaultTrackSelector.parameters.getClass();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                DefaultAudioSink.AudioOutputListener audioOutputListener = (DefaultAudioSink.AudioOutputListener) obj;
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                if (audioOutputListener == defaultAudioSink.audioOutputListener && defaultAudioSink.listener != null) {
                    LruArrayPool lruArrayPool = defaultAudioSink.configuration;
                    int i = lruArrayPool.currentSize;
                    if (i != -1) {
                        long j2 = ((AudioOutputProvider.OutputConfig) lruArrayPool.sortedSizes).bufferSize / i;
                        AudioTrackAudioOutput audioTrackAudioOutput = defaultAudioSink.audioOutput;
                        audioTrackAudioOutput.getClass();
                        j = Util.sampleCountToDurationUs(audioTrackAudioOutput.audioTrack.getSampleRate(), j2);
                    } else {
                        j = -9223372036854775807L;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime() - defaultAudioSink.lastFeedElapsedRealtimeMs;
                    BiometricPrompt biometricPrompt3 = defaultAudioSink.listener;
                    int i2 = ((AudioOutputProvider.OutputConfig) defaultAudioSink.configuration.sortedSizes).bufferSize;
                    long usToMs = Util.usToMs(j);
                    CallResult callResult = ((MediaCodecAudioRenderer) biometricPrompt3.mClientFragmentManager).eventDispatcher;
                    Handler handler = (Handler) callResult.result;
                    if (handler != null) {
                        handler.post(new AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(callResult, i2, usToMs, elapsedRealtime));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                DefaultAudioSink.AudioOutputListener audioOutputListener2 = (DefaultAudioSink.AudioOutputListener) obj;
                audioOutputListener2.getClass();
                DefaultAudioSink.pendingReleaseCount.getAndDecrement();
                BiometricPrompt biometricPrompt4 = DefaultAudioSink.this.listener;
                if (biometricPrompt4 != null) {
                    int i3 = audioOutputListener2.outputConfig.f880encoding;
                    AudioSink$AudioTrackConfig audioSink$AudioTrackConfig = new AudioSink$AudioTrackConfig();
                    CallResult callResult2 = ((MediaCodecAudioRenderer) biometricPrompt4.mClientFragmentManager).eventDispatcher;
                    Handler handler2 = (Handler) callResult2.result;
                    if (handler2 != null) {
                        handler2.post(new AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(3, callResult2, audioSink$AudioTrackConfig));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                DefaultAudioSink.AudioOutputListener audioOutputListener3 = (DefaultAudioSink.AudioOutputListener) obj;
                DefaultAudioSink defaultAudioSink2 = DefaultAudioSink.this;
                if (audioOutputListener3 == defaultAudioSink2.audioOutputListener && (biometricPrompt = defaultAudioSink2.listener) != null && defaultAudioSink2.playing && (anonymousClass1 = ((MediaCodecAudioRenderer) biometricPrompt.mClientFragmentManager).wakeupListener) != null) {
                    anonymousClass1.onWakeup();
                    return;
                }
                return;
            case 10:
                DefaultAudioSink.AudioOutputListener audioOutputListener4 = (DefaultAudioSink.AudioOutputListener) obj;
                DefaultAudioSink defaultAudioSink3 = DefaultAudioSink.this;
                if (audioOutputListener4 == defaultAudioSink3.audioOutputListener && defaultAudioSink3.stoppedAudioOutput) {
                    defaultAudioSink3.handledOffloadOnPresentationEnded = true;
                    return;
                }
                return;
        }
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor m(Object obj) {
        return (AudioDescriptor) obj;
    }
}
