package androidx.lifecycle;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;
import androidx.camera.video.Recorder;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreatePublicKeyCredentialResponse;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.fragment.app.strictmode.Violation;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.BackgroundThreadStateHandler$$ExternalSyntheticLambda0;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.NetworkTypeObserver$Api31;
import androidx.media3.common.util.SystemHandlerWrapper;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.WakeLockManager;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda6;
import androidx.media3.exoplayer.PlaybackInfo;
import androidx.media3.exoplayer.PlaylistTimeline;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda3;
import androidx.media3.exoplayer.analytics.MediaMetricsListener;
import androidx.media3.exoplayer.audio.AudioCapabilities;
import androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput$OnRoutingChangedListenerApi24$$ExternalSyntheticLambda0;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutputProvider;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecCallback;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.extractor.ts.NalUnitTargetBuffer;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.tracing.Trace;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import com.android.volley.NetworkResponse;
import com.fillr.n;
import com.google.android.gms.internal.time.zzbq;
import com.google.common.collect.RegularImmutableList;
import com.squareup.cash.NavigationModule$Companion;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final /* synthetic */ class DispatchQueue$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DispatchQueue$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        int i;
        boolean z;
        AudioCapabilitiesReceiver audioCapabilitiesReceiver;
        int i2 = 2;
        int i3 = 1;
        switch (this.$r8$classId) {
            case 0:
                DispatchQueue dispatchQueue = (DispatchQueue) this.f$0;
                if (((ArrayDeque) dispatchQueue.queue).offer((Runnable) this.f$1)) {
                    dispatchQueue.drainQueue();
                    return;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("cannot enqueue any more runnables");
                    return;
                }
            case 1:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0$0((CredentialManagerCallback) this.f$0, (Exception) this.f$1);
                return;
            case 2:
                ((CredentialManagerCallback) this.f$0).onError(this.f$1);
                return;
            case 3:
                ((CredentialManagerCallback) this.f$0).onResult((GetCredentialResponse) this.f$1);
                return;
            case 4:
                ((CredentialProviderBeginSignInController) this.f$0).getCallback().onResult((GetCredentialResponse) this.f$1);
                return;
            case 5:
                ((CredentialProviderBeginSignInController) this.f$0).getCallback().onError(((Ref$ObjectRef) this.f$1).element);
                return;
            case 6:
                ((CredentialProviderBeginSignInController) this.f$0).getCallback().onError((GetCredentialUnknownException) this.f$1);
                return;
            case 7:
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = (CredentialProviderCreatePublicKeyCredentialController) this.f$0;
                CreatePublicKeyCredentialResponse createPublicKeyCredentialResponse = (CreatePublicKeyCredentialResponse) this.f$1;
                CredentialManagerCallback credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.callback;
                if (credentialManagerCallback != null) {
                    credentialManagerCallback.onResult(createPublicKeyCredentialResponse);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
            case 8:
                ((CredentialManagerCallback) this.f$0).onResult((CreatePublicKeyCredentialResponse) this.f$1);
                return;
            case 9:
                CreatePublicKeyCredentialController createPublicKeyCredentialController = (CreatePublicKeyCredentialController) this.f$0;
                CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) this.f$1;
                CredentialManagerCallback credentialManagerCallback2 = createPublicKeyCredentialController.callback;
                if (credentialManagerCallback2 != null) {
                    credentialManagerCallback2.onResult(createCredentialResponse);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
            case 10:
                String str = (String) this.f$0;
                Violation violation = (Violation) this.f$1;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(str), violation);
                throw violation;
            case 11:
                Context context = (Context) this.f$0;
                ConditionVariable conditionVariable = (ConditionVariable) this.f$1;
                NavigationModule$Companion.audioManager = (AudioManager) context.getSystemService("audio");
                conditionVariable.open();
                return;
            case 12:
                AdapterHelper adapterHelper = (AdapterHelper) this.f$0;
                Object apply = ((ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda6) this.f$1).apply(adapterHelper.mOpReorderer);
                adapterHelper.mOpReorderer = apply;
                BackgroundThreadStateHandler$$ExternalSyntheticLambda0 backgroundThreadStateHandler$$ExternalSyntheticLambda0 = new BackgroundThreadStateHandler$$ExternalSyntheticLambda0(adapterHelper, apply, i3);
                SystemHandlerWrapper systemHandlerWrapper = (SystemHandlerWrapper) adapterHelper.mPendingUpdates;
                if (systemHandlerWrapper.handler.getLooper().getThread().isAlive()) {
                    systemHandlerWrapper.post(backgroundThreadStateHandler$$ExternalSyntheticLambda0);
                    return;
                }
                return;
            case 13:
                NetworkResponse networkResponse = (NetworkResponse) this.f$0;
                Context context2 = (Context) this.f$1;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context2.registerReceiver(new zzbq(networkResponse, i2), intentFilter);
                return;
            case 14:
                zzbq zzbqVar = (zzbq) this.f$0;
                Context context3 = (Context) this.f$1;
                NetworkResponse networkResponse2 = (NetworkResponse) zzbqVar.zza;
                ConnectivityManager connectivityManager = (ConnectivityManager) context3.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type2 = activeNetworkInfo.getType();
                            if (type2 != 0) {
                                if (type2 != 1) {
                                    if (type2 != 4 && type2 != 5) {
                                        if (type2 != 6) {
                                            i2 = type2 != 9 ? 8 : 7;
                                        }
                                        i2 = 5;
                                    }
                                }
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i2 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i2 = 4;
                                    break;
                                case 13:
                                    i2 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i2 = 6;
                                    break;
                                case 18:
                                    break;
                                case 20:
                                    i2 = 9;
                                    break;
                            }
                        } else {
                            i2 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (Build.VERSION.SDK_INT >= 31 || i2 != 5) {
                        networkResponse2.updateNetworkType(i2);
                        return;
                    } else {
                        NetworkTypeObserver$Api31.disambiguate4gAnd5gNsa(context3, networkResponse2);
                        return;
                    }
                }
                i2 = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                networkResponse2.updateNetworkType(i2);
                return;
            case 15:
                WakeLockManager wakeLockManager = (WakeLockManager) this.f$0;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f$1;
                Recorder.AnonymousClass1 anonymousClass1 = (Recorder.AnonymousClass1) wakeLockManager.wakeLockManagerInternal;
                anonymousClass1.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new DispatchQueue$$ExternalSyntheticLambda0(16, anonymousClass1, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 16:
                Recorder.AnonymousClass1 anonymousClass12 = (Recorder.AnonymousClass1) this.f$0;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f$1;
                synchronized (anonymousClass12) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) anonymousClass12.this$0) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 17:
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this.f$0;
                NalUnitTargetBuffer nalUnitTargetBuffer = (NalUnitTargetBuffer) this.f$1;
                int i4 = exoPlayerImpl.pendingOperationAcks - nalUnitTargetBuffer.targetType;
                exoPlayerImpl.pendingOperationAcks = i4;
                if (nalUnitTargetBuffer.isCompleted) {
                    exoPlayerImpl.pendingDiscontinuityReason = nalUnitTargetBuffer.nalLength;
                    exoPlayerImpl.pendingDiscontinuity = true;
                }
                if (i4 == 0) {
                    Timeline timeline = ((PlaybackInfo) nalUnitTargetBuffer.nalData).timeline;
                    int i5 = -1;
                    if (!exoPlayerImpl.playbackInfo.timeline.isEmpty() && timeline.isEmpty()) {
                        exoPlayerImpl.maskingWindowIndex = -1;
                        exoPlayerImpl.maskingWindowPositionMs = 0L;
                    }
                    if (!timeline.isEmpty()) {
                        List asList = Arrays.asList(((PlaylistTimeline) timeline).timelines);
                        Trace.checkState(asList.size() == exoPlayerImpl.mediaSourceHolderSnapshots.size());
                        for (int i6 = 0; i6 < asList.size(); i6++) {
                            ((ExoPlayerImpl.MediaSourceHolderSnapshot) exoPlayerImpl.mediaSourceHolderSnapshots.get(i6)).timeline = (Timeline) asList.get(i6);
                        }
                    }
                    long j = -9223372036854775807L;
                    if (exoPlayerImpl.pendingDiscontinuity) {
                        boolean z2 = ((PlaybackInfo) nalUnitTargetBuffer.nalData).timeline.isEmpty() && exoPlayerImpl.playbackInfo.timeline.isEmpty();
                        boolean equals = ((PlaybackInfo) nalUnitTargetBuffer.nalData).periodId.equals(exoPlayerImpl.playbackInfo.periodId);
                        boolean z3 = ((PlaybackInfo) nalUnitTargetBuffer.nalData).discontinuityStartPositionUs == exoPlayerImpl.playbackInfo.positionUs;
                        if (z2 || (equals && z3)) {
                            i3 = 0;
                        }
                        if (i3 != 0) {
                            i5 = exoPlayerImpl.getCurrentMediaItemIndex();
                            if (timeline.isEmpty() || ((PlaybackInfo) nalUnitTargetBuffer.nalData).periodId.isAd()) {
                                j = ((PlaybackInfo) nalUnitTargetBuffer.nalData).discontinuityStartPositionUs;
                            } else {
                                PlaybackInfo playbackInfo = (PlaybackInfo) nalUnitTargetBuffer.nalData;
                                MediaSource$MediaPeriodId mediaSource$MediaPeriodId = playbackInfo.periodId;
                                long j2 = playbackInfo.discontinuityStartPositionUs;
                                Object obj = mediaSource$MediaPeriodId.periodUid;
                                Timeline.Period period = exoPlayerImpl.period;
                                timeline.getPeriodByUid(obj, period);
                                j = j2 + period.positionInWindowUs;
                            }
                        }
                        z = i3;
                        i = i5;
                    } else {
                        i = -1;
                        z = 0;
                    }
                    long j3 = j;
                    exoPlayerImpl.pendingDiscontinuity = false;
                    exoPlayerImpl.updatePlaybackInfo((PlaybackInfo) nalUnitTargetBuffer.nalData, 1, z, exoPlayerImpl.pendingDiscontinuityReason, j3, i, false);
                    return;
                }
                return;
            case 18:
                ((MediaMetricsListener) this.f$0).playbackSession.reportTrackChangeEvent((TrackChangeEvent) this.f$1);
                return;
            case 19:
                ((MediaMetricsListener) this.f$0).playbackSession.reportNetworkEvent((NetworkEvent) this.f$1);
                return;
            case 20:
                ((MediaMetricsListener) this.f$0).playbackSession.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f$1);
                return;
            case 21:
                ((MediaMetricsListener) this.f$0).playbackSession.reportPlaybackMetrics((PlaybackMetrics) this.f$1);
                return;
            case 22:
                ((MediaMetricsListener) this.f$0).playbackSession.reportPlaybackStateEvent((PlaybackStateEvent) this.f$1);
                return;
            case 23:
                CallResult callResult = (CallResult) this.f$0;
                synchronized (((DecoderCounters) this.f$1)) {
                }
                ExoPlayerImpl.ComponentListener componentListener = (ExoPlayerImpl.ComponentListener) callResult.serviceNames;
                String str2 = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector = ExoPlayerImpl.this.analyticsCollector;
                defaultAnalyticsCollector.sendEvent(defaultAnalyticsCollector.generateEventTime((MediaSource$MediaPeriodId) defaultAnalyticsCollector.mediaPeriodQueueTracker.f), IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_HALFTONING_INFO, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(13));
                return;
            case 24:
                CallResult callResult2 = (CallResult) this.f$0;
                CodecParameters codecParameters = (CodecParameters) this.f$1;
                ExoPlayerImpl.ComponentListener componentListener2 = (ExoPlayerImpl.ComponentListener) callResult2.serviceNames;
                String str3 = Util.DEVICE_DEBUG_INFO;
                CallResult.access$2000(ExoPlayerImpl.this.audioListenerManager, codecParameters);
                return;
            case 25:
                n nVar = (n) this.f$0;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.f$1).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) nVar.c).post(new DispatchQueue$$ExternalSyntheticLambda0(26, nVar, routedDevice));
                    return;
                }
                return;
            case 26:
                n nVar2 = (n) this.f$0;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f$1;
                if (((AudioTrackAudioOutput$OnRoutingChangedListenerApi24$$ExternalSyntheticLambda0) nVar2.d) == null || (audioCapabilitiesReceiver = ((AudioTrackAudioOutputProvider) ((Recorder.AnonymousClass6) nVar2.b).this$0).audioCapabilitiesReceiver) == null || audioDeviceInfo.equals(audioCapabilitiesReceiver.routedDevice)) {
                    return;
                }
                audioCapabilitiesReceiver.routedDevice = audioDeviceInfo;
                Context context4 = audioCapabilitiesReceiver.context;
                AudioAttributes audioAttributes = audioCapabilitiesReceiver.audioAttributes;
                List spatializerChannelMasks = audioCapabilitiesReceiver.getSpatializerChannelMasks();
                RegularImmutableList regularImmutableList = AudioCapabilities.DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS;
                audioCapabilitiesReceiver.onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), audioAttributes, audioDeviceInfo, spatializerChannelMasks));
                return;
            case 27:
                AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter = (AsynchronousMediaCodecAdapter) this.f$0;
                DispatchQueue$$ExternalSyntheticLambda0 dispatchQueue$$ExternalSyntheticLambda0 = (DispatchQueue$$ExternalSyntheticLambda0) this.f$1;
                asynchronousMediaCodecAdapter.bufferEnqueuer.maybeThrowException();
                AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = asynchronousMediaCodecAdapter.asynchronousMediaCodecCallback;
                synchronized (asynchronousMediaCodecCallback.lock) {
                    asynchronousMediaCodecCallback.maybeThrowException();
                    dispatchQueue$$ExternalSyntheticLambda0.run();
                }
                return;
            case 28:
                MediaCodecRenderer mediaCodecRenderer = (MediaCodecRenderer) this.f$0;
                mediaCodecRenderer.readDataResultHolder.set(mediaCodecRenderer.readSource((AndroidSvg) this.f$1, mediaCodecRenderer.buffer, 0));
                return;
            default:
                ((Consumer) this.f$0).accept((MediaSourceEventListener) this.f$1);
                return;
        }
    }
}
