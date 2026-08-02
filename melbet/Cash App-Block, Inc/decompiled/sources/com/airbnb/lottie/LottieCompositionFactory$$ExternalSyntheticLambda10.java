package com.airbnb.lottie;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.Window;
import androidx.camera.video.Recorder;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda2;
import androidx.metrics.performance.DelegatingFrameMetricsListener;
import androidx.metrics.performance.JankStatsApi24Impl$$ExternalSyntheticLambda1;
import androidx.metrics.performance.JankStatsApi26Impl;
import app.cash.zipline.CallResult;
import java.io.InputStream;
import kotlin.collections.CollectionsKt__CollectionsKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class LottieCompositionFactory$$ExternalSyntheticLambda10 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ LottieCompositionFactory$$ExternalSyntheticLambda10(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                LottieCompositionFactory.lambda$fromJsonInputStream$7(this.f$0, (InputStream) this.f$1);
                return;
            case 1:
                Recorder.AnonymousClass4 anonymousClass4 = (Recorder.AnonymousClass4) this.f$1;
                boolean z = this.f$0;
                Recorder recorder = (Recorder) anonymousClass4.this$0;
                if (recorder.mIsAudioSourceSilenced != z) {
                    recorder.mIsAudioSourceSilenced = z;
                    recorder.updateInProgressStatusEvent(true);
                    return;
                } else {
                    StringUtilsKt.w("Recorder", "Audio source silenced transitions to the same state " + z);
                    return;
                }
            case 2:
                Recorder.AnonymousClass2 anonymousClass2 = (Recorder.AnonymousClass2) this.f$1;
                boolean z2 = this.f$0;
                AudioSource audioSource = anonymousClass2.val$audioSource;
                audioSource.mAudioStreamSilenced = z2;
                if (audioSource.mState == 2) {
                    audioSource.notifySilenced();
                    return;
                }
                return;
            case 3:
                CallResult callResult = (CallResult) this.f$1;
                boolean z3 = this.f$0;
                ExoPlayerImpl.ComponentListener componentListener = (ExoPlayerImpl.ComponentListener) callResult.serviceNames;
                String str = Util.DEVICE_DEBUG_INFO;
                ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
                if (exoPlayerImpl.skipSilenceEnabled == z3) {
                    return;
                }
                exoPlayerImpl.skipSilenceEnabled = z3;
                exoPlayerImpl.listeners.sendEvent(23, new ExoPlayerImpl$$ExternalSyntheticLambda2(z3, i));
                return;
            default:
                boolean z4 = this.f$0;
                JankStatsApi26Impl jankStatsApi26Impl = (JankStatsApi26Impl) this.f$1;
                if (!z4) {
                    Window window = jankStatsApi26Impl.window;
                    JankStatsApi24Impl$$ExternalSyntheticLambda1 jankStatsApi24Impl$$ExternalSyntheticLambda1 = jankStatsApi26Impl.frameMetricsAvailableListenerDelegate;
                    window.getClass();
                    jankStatsApi24Impl$$ExternalSyntheticLambda1.getClass();
                    DelegatingFrameMetricsListener delegatingFrameMetricsListener = (DelegatingFrameMetricsListener) window.getDecorView().getTag(com.squareup.cash.R.id.metricsDelegator);
                    if (delegatingFrameMetricsListener != null) {
                        synchronized (delegatingFrameMetricsListener) {
                            delegatingFrameMetricsListener.delegates.remove(jankStatsApi24Impl$$ExternalSyntheticLambda1);
                        }
                        if (delegatingFrameMetricsListener.delegates.isEmpty()) {
                            try {
                                window.removeOnFrameMetricsAvailableListener(delegatingFrameMetricsListener);
                            } catch (IllegalArgumentException unused) {
                            }
                            window.getDecorView().setTag(com.squareup.cash.R.id.metricsDelegator, null);
                        }
                    }
                    jankStatsApi26Impl.listenerAddedTime = 0L;
                    return;
                }
                if (jankStatsApi26Impl.listenerAddedTime == 0) {
                    Window window2 = jankStatsApi26Impl.window;
                    JankStatsApi24Impl$$ExternalSyntheticLambda1 jankStatsApi24Impl$$ExternalSyntheticLambda12 = jankStatsApi26Impl.frameMetricsAvailableListenerDelegate;
                    window2.getClass();
                    jankStatsApi24Impl$$ExternalSyntheticLambda12.getClass();
                    if (window2.getDecorView().isHardwareAccelerated()) {
                        DelegatingFrameMetricsListener delegatingFrameMetricsListener2 = (DelegatingFrameMetricsListener) window2.getDecorView().getTag(com.squareup.cash.R.id.metricsDelegator);
                        if (delegatingFrameMetricsListener2 == null) {
                            DelegatingFrameMetricsListener delegatingFrameMetricsListener3 = new DelegatingFrameMetricsListener(CollectionsKt__CollectionsKt.mutableListOf(jankStatsApi24Impl$$ExternalSyntheticLambda12));
                            if (DelegatingFrameMetricsListener.frameMetricsHandler == null) {
                                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                                handlerThread.start();
                                DelegatingFrameMetricsListener.frameMetricsHandler = new Handler(handlerThread.getLooper());
                            }
                            window2.getDecorView().setTag(com.squareup.cash.R.id.metricsDelegator, delegatingFrameMetricsListener3);
                            window2.addOnFrameMetricsAvailableListener(delegatingFrameMetricsListener3, DelegatingFrameMetricsListener.frameMetricsHandler);
                        } else {
                            synchronized (delegatingFrameMetricsListener2) {
                                delegatingFrameMetricsListener2.delegates.add(jankStatsApi24Impl$$ExternalSyntheticLambda12);
                            }
                        }
                        jankStatsApi26Impl.listenerAddedTime = System.nanoTime();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ LottieCompositionFactory$$ExternalSyntheticLambda10(boolean z, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = obj;
    }
}
