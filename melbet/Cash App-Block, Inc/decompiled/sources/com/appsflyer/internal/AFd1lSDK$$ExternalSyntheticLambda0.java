package com.appsflyer.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.Surface;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.SimpleArrayMap;
import androidx.compose.material.pullrefresh.ArrowValues;
import androidx.core.view.insets.SystemBarStateMonitor;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.dynamicanimation.animation.AnimationHandler;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.emoji2.text.EmojiCompat;
import androidx.media3.common.audio.AudioBecomingNoisyManager$AudioBecomingNoisyReceiver;
import androidx.media3.common.util.BackgroundThreadStateHandler$$ExternalSyntheticLambda0;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.NetworkTypeObserver$ListenerHolder;
import androidx.media3.common.util.SystemHandlerWrapper;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda3;
import androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecCallback;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter$$ExternalSyntheticLambda0;
import androidx.media3.exoplayer.upstream.SlidingPercentile;
import androidx.media3.exoplayer.video.DefaultVideoSink;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.VideoFrameReleaseHelper;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.extractor.Id3Peeker$$ExternalSyntheticBUOutline0;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Response;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.CoreFeature$lastViewEvent$2;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.ndk.internal.DatadogNdkCrashHandler$readCrashData$2;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.ndk.internal.NdkCrashLogDeserializer;
import com.datadog.android.rum.Rum$createMonitor$1;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;
import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import com.google.common.base.Ascii;
import com.google.gson.JsonObject;
import com.squareup.cash.NavigationModule$Companion;
import com.stripe.hcaptcha.HCaptcha;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.android.HandlerDispatcherKt$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final /* synthetic */ class AFd1lSDK$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AFd1lSDK$$ExternalSyntheticLambda0(ExoPlayerImplInternal exoPlayerImplInternal, int i) {
        this.$r8$classId = 9;
        this.f$0 = exoPlayerImplInternal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        long j;
        int i2;
        String upperCase;
        TelephonyManager telephonyManager;
        Object obj;
        int i3 = this.$r8$classId;
        int i4 = 8;
        long j2 = 0;
        int i5 = 0;
        int i6 = 1;
        Object obj2 = this.f$0;
        switch (i3) {
            case 0:
                ((AFd1kSDK) obj2).AFAdRevenueData();
                return;
            case 1:
                SystemBarStateMonitor.AnonymousClass1 anonymousClass1 = ((SystemBarStateMonitor) obj2).mDetector;
                ViewParent parent = anonymousClass1.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(anonymousClass1);
                    return;
                }
                return;
            case 2:
                ((CredentialProviderBeginSignInController) obj2).getCallback().onError(new GetCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 3:
                AnimationHandler animationHandler = (AnimationHandler) ((AnimationHandler) obj2).mCallbackDispatcher.this$0;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = animationHandler.mAnimationCallbacks;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    SpringAnimation springAnimation = (SpringAnimation) arrayList.get(i7);
                    if (springAnimation != null) {
                        SimpleArrayMap simpleArrayMap = animationHandler.mDelayedCallbackStartTime;
                        Long l = (Long) simpleArrayMap.get(springAnimation);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis2) {
                                simpleArrayMap.remove(springAnimation);
                            }
                        }
                        long j3 = springAnimation.mLastFrameTime;
                        if (j3 == j2) {
                            springAnimation.mLastFrameTime = uptimeMillis;
                            springAnimation.setPropertyValue(springAnimation.mValue);
                        } else {
                            long j4 = uptimeMillis - j3;
                            springAnimation.mLastFrameTime = uptimeMillis;
                            float f = SpringAnimation.getAnimationHandler().mDurationScale;
                            long j5 = f == RecyclerView.DECELERATION_RATE ? 2147483647L : (long) (j4 / f);
                            boolean z = springAnimation.mEndRequested;
                            float f2 = springAnimation.mPendingPosition;
                            if (z) {
                                if (f2 != Float.MAX_VALUE) {
                                    springAnimation.mSpring.mFinalPosition = f2;
                                    springAnimation.mPendingPosition = Float.MAX_VALUE;
                                }
                                springAnimation.mValue = (float) springAnimation.mSpring.mFinalPosition;
                                springAnimation.mVelocity = RecyclerView.DECELERATION_RATE;
                                springAnimation.mEndRequested = false;
                                i2 = i6;
                                j = uptimeMillis2;
                            } else {
                                SpringForce springForce = springAnimation.mSpring;
                                float f3 = springAnimation.mValue;
                                float f4 = springAnimation.mVelocity;
                                if (f2 != Float.MAX_VALUE) {
                                    i = i6;
                                    j = uptimeMillis2;
                                    long j6 = j5 / 2;
                                    ArrowValues updateValues = springForce.updateValues(f3, f4, j6);
                                    SpringForce springForce2 = springAnimation.mSpring;
                                    springForce2.mFinalPosition = springAnimation.mPendingPosition;
                                    springAnimation.mPendingPosition = Float.MAX_VALUE;
                                    ArrowValues updateValues2 = springForce2.updateValues(updateValues.endAngle, updateValues.scale, j6);
                                    springAnimation.mValue = updateValues2.endAngle;
                                    springAnimation.mVelocity = updateValues2.scale;
                                } else {
                                    i = i6;
                                    j = uptimeMillis2;
                                    ArrowValues updateValues3 = springForce.updateValues(f3, f4, j5);
                                    springAnimation.mValue = updateValues3.endAngle;
                                    springAnimation.mVelocity = updateValues3.scale;
                                }
                                float max = Math.max(springAnimation.mValue, springAnimation.mMinValue);
                                springAnimation.mValue = max;
                                springAnimation.mValue = Math.min(max, springAnimation.mMaxValue);
                                float f5 = springAnimation.mVelocity;
                                SpringForce springForce3 = springAnimation.mSpring;
                                springForce3.getClass();
                                i2 = i;
                                if (Math.abs(f5) >= springForce3.mVelocityThreshold || Math.abs(r6 - ((float) springForce3.mFinalPosition)) >= springForce3.mValueThreshold) {
                                    i6 = 0;
                                } else {
                                    springAnimation.mValue = (float) springAnimation.mSpring.mFinalPosition;
                                    springAnimation.mVelocity = RecyclerView.DECELERATION_RATE;
                                    i6 = i2;
                                }
                            }
                            float min = Math.min(springAnimation.mValue, springAnimation.mMaxValue);
                            springAnimation.mValue = min;
                            float max2 = Math.max(min, springAnimation.mMinValue);
                            springAnimation.mValue = max2;
                            springAnimation.setPropertyValue(max2);
                            if (i6 != 0) {
                                springAnimation.endAnimationInternal(false);
                            }
                            i7++;
                            j2 = 0;
                            i6 = i2;
                            uptimeMillis2 = j;
                        }
                    }
                    i2 = i6;
                    j = uptimeMillis2;
                    i7++;
                    j2 = 0;
                    i6 = i2;
                    uptimeMillis2 = j;
                }
                int i8 = i6;
                if (animationHandler.mListDirty) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        animationHandler.mDurationScaleChangeListener.unregister();
                    }
                    animationHandler.mListDirty = false;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) animationHandler.mScheduler.val$videoEncoderSession).postFrameCallback(new HandlerDispatcherKt$$ExternalSyntheticLambda0(animationHandler.mRunnable, i8));
                    return;
                }
                return;
            case 4:
                ((EmojiCompat.InitWithExecutor) obj2).mInitCallback.onInitialized();
                return;
            case 5:
                Response response = (Response) obj2;
                ((Context) response.result).unregisterReceiver((AudioBecomingNoisyManager$AudioBecomingNoisyReceiver) response.cacheEntry);
                return;
            case 6:
                AudioBecomingNoisyManager$AudioBecomingNoisyReceiver audioBecomingNoisyManager$AudioBecomingNoisyReceiver = (AudioBecomingNoisyManager$AudioBecomingNoisyReceiver) obj2;
                if (audioBecomingNoisyManager$AudioBecomingNoisyReceiver.this$0.intermediate) {
                    ExoPlayerImpl.this.updatePlayWhenReady(3, false);
                    return;
                }
                return;
            case 7:
                NetworkTypeObserver$ListenerHolder networkTypeObserver$ListenerHolder = (NetworkTypeObserver$ListenerHolder) obj2;
                DefaultBandwidthMeter$$ExternalSyntheticLambda0 defaultBandwidthMeter$$ExternalSyntheticLambda0 = (DefaultBandwidthMeter$$ExternalSyntheticLambda0) networkTypeObserver$ListenerHolder.listener.get();
                if (defaultBandwidthMeter$$ExternalSyntheticLambda0 != null) {
                    int networkType = networkTypeObserver$ListenerHolder.this$0.getNetworkType();
                    DefaultBandwidthMeter defaultBandwidthMeter = defaultBandwidthMeter$$ExternalSyntheticLambda0.f$0;
                    synchronized (defaultBandwidthMeter) {
                        int i9 = defaultBandwidthMeter.networkType;
                        if (i9 == 0 || defaultBandwidthMeter.resetOnNetworkTypeChange) {
                            if (i9 != networkType || defaultBandwidthMeter.countryCode == null) {
                                defaultBandwidthMeter.networkType = networkType;
                                if (networkType != 1 && networkType != 0 && networkType != 8) {
                                    if (defaultBandwidthMeter.countryCode == null) {
                                        Context context = defaultBandwidthMeter.context;
                                        String str = Util.DEVICE_DEBUG_INFO;
                                        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                            if (!TextUtils.isEmpty(networkCountryIso)) {
                                                upperCase = Ascii.toUpperCase(networkCountryIso);
                                                defaultBandwidthMeter.countryCode = upperCase;
                                            }
                                        }
                                        upperCase = Ascii.toUpperCase(Locale.getDefault().getCountry());
                                        defaultBandwidthMeter.countryCode = upperCase;
                                    }
                                    defaultBandwidthMeter.bitrateEstimate = defaultBandwidthMeter.getInitialBitrateEstimateForNetworkType(networkType);
                                    defaultBandwidthMeter.clock.getClass();
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    defaultBandwidthMeter.maybeNotifyBandwidthSample(defaultBandwidthMeter.streamCount > 0 ? (int) (elapsedRealtime - defaultBandwidthMeter.sampleStartTimeMs) : 0, defaultBandwidthMeter.sampleBytesTransferred, defaultBandwidthMeter.bitrateEstimate);
                                    defaultBandwidthMeter.sampleStartTimeMs = elapsedRealtime;
                                    defaultBandwidthMeter.sampleBytesTransferred = 0L;
                                    defaultBandwidthMeter.totalBytesTransferred = 0L;
                                    defaultBandwidthMeter.totalElapsedTimeMs = 0L;
                                    SlidingPercentile slidingPercentile = defaultBandwidthMeter.slidingPercentile;
                                    slidingPercentile.samples.clear();
                                    slidingPercentile.currentSortOrder = -1;
                                    slidingPercentile.nextSampleIndex = 0;
                                    slidingPercentile.totalWeight = 0;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 8:
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) obj2;
                AdapterHelper adapterHelper = exoPlayerImpl.audioSessionIdState;
                Context context2 = exoPlayerImpl.applicationContext;
                String str2 = Util.DEVICE_DEBUG_INFO;
                int generateAudioSessionId = NavigationModule$Companion.getAudioManager(context2).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                adapterHelper.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((SystemHandlerWrapper) adapterHelper.mPendingUpdates).handler.getLooper()) {
                    obj = adapterHelper.mCallback;
                } else {
                    Trace.checkState(myLooper == ((SystemHandlerWrapper) adapterHelper.mUpdateOpPool).handler.getLooper());
                    obj = adapterHelper.mOpReorderer;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    adapterHelper.mOpReorderer = valueOf;
                    BackgroundThreadStateHandler$$ExternalSyntheticLambda0 backgroundThreadStateHandler$$ExternalSyntheticLambda0 = new BackgroundThreadStateHandler$$ExternalSyntheticLambda0(adapterHelper, valueOf, i5);
                    SystemHandlerWrapper systemHandlerWrapper = (SystemHandlerWrapper) adapterHelper.mPendingUpdates;
                    if (systemHandlerWrapper.handler.getLooper().getThread().isAlive()) {
                        systemHandlerWrapper.post(backgroundThreadStateHandler$$ExternalSyntheticLambda0);
                    }
                    exoPlayerImpl.sendRendererMessage(1, 10, Integer.valueOf(generateAudioSessionId));
                    exoPlayerImpl.sendRendererMessage(2, 10, Integer.valueOf(generateAudioSessionId));
                    return;
                }
                return;
            case 9:
                DefaultAnalyticsCollector defaultAnalyticsCollector = ((ExoPlayerImplInternal) obj2).analyticsCollector;
                defaultAnalyticsCollector.sendEvent(defaultAnalyticsCollector.generateCurrentPlayerMediaPeriodEventTime(), IptcConstants.IMAGE_RESOURCE_BLOCK_COPYRIGHT_FLAG, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(6));
                return;
            case 10:
                PlayerMessage playerMessage = (PlayerMessage) obj2;
                try {
                    synchronized (playerMessage) {
                    }
                    try {
                        playerMessage.target.handleMessage(playerMessage.f877type, playerMessage.payload);
                        playerMessage.markAsProcessed(true);
                        return;
                    } catch (Throwable th) {
                        playerMessage.markAsProcessed(true);
                        throw th;
                    }
                } catch (ExoPlaybackException e) {
                    Log.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                    return;
                }
            case 11:
                DefaultAnalyticsCollector defaultAnalyticsCollector2 = (DefaultAnalyticsCollector) obj2;
                defaultAnalyticsCollector2.sendEvent(defaultAnalyticsCollector2.generateCurrentPlayerMediaPeriodEventTime(), IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(i5));
                defaultAnalyticsCollector2.listeners.release();
                return;
            case 12:
                ((AudioCapabilitiesReceiver) obj2).updateCurrentAudioCapabilities();
                return;
            case 13:
                ListenerSet listenerSet = (ListenerSet) obj2;
                listenerSet.getClass();
                if (Thread.currentThread() == listenerSet.thread) {
                    listenerSet.sendEvent(-1, new Id3Peeker$$ExternalSyntheticBUOutline0(i4));
                    return;
                }
                return;
            case 14:
                DefaultAudioSink defaultAudioSink = (DefaultAudioSink) obj2;
                if (defaultAudioSink.accumulatedSkippedSilenceDurationUs >= 300000) {
                    ((MediaCodecAudioRenderer) defaultAudioSink.listener.mClientFragmentManager).hasPendingReportedSkippedSilence = true;
                    defaultAudioSink.accumulatedSkippedSilenceDurationUs = 0L;
                    return;
                }
                return;
            case 15:
                AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = (AsynchronousMediaCodecCallback) obj2;
                synchronized (asynchronousMediaCodecCallback.lock) {
                    try {
                        if (asynchronousMediaCodecCallback.shutDown) {
                            return;
                        }
                        long j7 = asynchronousMediaCodecCallback.pendingFlushCount - 1;
                        asynchronousMediaCodecCallback.pendingFlushCount = j7;
                        if (j7 > 0) {
                            return;
                        }
                        if (j7 >= 0) {
                            asynchronousMediaCodecCallback.flushInternal();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (asynchronousMediaCodecCallback.lock) {
                            asynchronousMediaCodecCallback.internalException = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
            case 16:
                ((DefaultTrackSelector) obj2).maybeInvalidateForAudioChannelCountConstraints();
                return;
            case 17:
                ((DefaultVideoSink) obj2).listener.onFrameAvailableForRendering();
                return;
            case 18:
                ((PlaybackVideoGraphWrapper) obj2).pendingFlushCount--;
                return;
            case 19:
                r0.choreographer.postVsyncCallback((VideoFrameReleaseHelper.VSyncSamplerV33) obj2);
                return;
            case 20:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj2;
                Surface surface = sphericalGLSurfaceView.surface;
                if (surface != null) {
                    Iterator it = sphericalGLSurfaceView.videoSurfaceListeners.iterator();
                    while (it.hasNext()) {
                        ExoPlayerImpl.this.setVideoOutputInternal(null);
                    }
                }
                SurfaceTexture surfaceTexture = sphericalGLSurfaceView.surfaceTexture;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                sphericalGLSurfaceView.surfaceTexture = null;
                sphericalGLSurfaceView.surface = null;
                return;
            case 21:
                int i10 = DefaultTimeBar.$r8$clinit;
                ((DefaultTimeBar) obj2).stopScrubbing(false);
                return;
            case 22:
                float[] fArr = PlayerControlView.PLAYBACK_SPEEDS;
                ((PlayerControlView) obj2).updateProgress();
                return;
            case 23:
                ((PlayerView) obj2).invalidate();
                return;
            case 24:
                int[] iArr = SwipeRefreshLayout.LAYOUT_ATTRS;
                ((SwipeRefreshLayout) obj2).reset();
                return;
            case 25:
                AFd1wSDK.getMediationNetwork((AFd1wSDK) obj2);
                return;
            case 26:
                ((Rum$createMonitor$1) obj2).invoke();
                return;
            case 27:
                ((DatadogCore) obj2).stop$dd_sdk_android_core_release();
                return;
            case 28:
                HCaptcha hCaptcha = (HCaptcha) obj2;
                File file = (File) hCaptcha.handler;
                InternalLogger internalLogger = (InternalLogger) hCaptcha.onSuccessListeners;
                try {
                    if (zzhk.existsSafe(file, internalLogger)) {
                        try {
                            hCaptcha.internalConfig = (JsonObject) ((CoreFeature$lastViewEvent$2) hCaptcha.onFailureListeners).this$0.lastViewEvent$delegate.getValue();
                            File[] listFilesSafe = zzhk.listFilesSafe(file, internalLogger);
                            if (listFilesSafe != null) {
                                int length = listFilesSafe.length;
                                while (i5 < length) {
                                    File file2 = listFilesSafe[i5];
                                    if (Intrinsics.areEqual(file2.getName(), "crash_log")) {
                                        String readTextSafe = zzhk.readTextSafe(file2, Charsets.UTF_8, internalLogger);
                                        hCaptcha.captchaVerifier = readTextSafe != null ? (NdkCrashLog) ((NdkCrashLogDeserializer) hCaptcha.exception).deserialize(readTextSafe) : null;
                                    }
                                    i5++;
                                }
                            }
                        } catch (SecurityException e2) {
                            DBUtil.log$default((InternalLogger) hCaptcha.onSuccessListeners, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), DatadogNdkCrashHandler$readCrashData$2.INSTANCE, e2, 48);
                        }
                        hCaptcha.clearCrashLog();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    hCaptcha.clearCrashLog();
                    throw th2;
                }
            default:
                ((DatadogRumMonitor) obj2).handleEvent$dd_sdk_android_rum_release(new RumRawEvent.KeepAlive());
                return;
        }
    }

    public /* synthetic */ AFd1lSDK$$ExternalSyntheticLambda0(ExoPlayerImplInternal exoPlayerImplInternal, PlayerMessage playerMessage) {
        this.$r8$classId = 10;
        this.f$0 = playerMessage;
    }

    public /* synthetic */ AFd1lSDK$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
