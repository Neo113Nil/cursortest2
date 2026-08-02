package androidx.camera.camera2.interop;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.View;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.core.AutoValue_SurfaceRequest_TransformationInfo;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.AdapterCameraControl;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture;
import androidx.camera.core.processing.AutoValue_DefaultSurfaceProcessor_PendingSnapshot;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.OpenGlRenderer;
import androidx.camera.core.processing.util.GLUtils;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda17;
import androidx.camera.view.TextureViewImplementation;
import androidx.compose.foundation.lazy.layout.Averages;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.TextRangeLayoutMeasureScope;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.ShouldPauseCallback;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda6;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda10;
import androidx.emoji2.text.MetadataRepo;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.work.DirectExecutor;
import androidx.work.WorkerKt$$ExternalSyntheticLambda1;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import app.cash.arcade.protocol.host.arcade.AccessibilityActionImpl;
import app.cash.redwood.treehouse.EventListener;
import app.cash.redwood.treehouse.RealEventPublisher$ZiplineEventListener;
import app.cash.redwood.treehouse.RealTreehouseApp;
import app.cash.redwood.treehouse.TreehouseAppContent;
import app.cash.redwood.treehouse.TreehouseLayout;
import app.cash.redwood.treehouse.TreehouseView$ReadyForContentChangeListener;
import app.cash.zipline.CallResult;
import app.cash.zipline.EventListener;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.caverock.androidsvg.SVG;
import com.fidesmo.sec.delivery.SecResponse;
import com.fidesmo.sec.delivery.ServiceDeliveryClient;
import com.fidesmo.sec.nfc.NfcDevice;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;
import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_PersistedEvent;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.android.gms.maps.zzai;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.messaging.RequestDeduplicator;
import com.squareup.cash.treehouse.accessibility.AccessibilityCallback;
import com.squareup.cash.treehouse.accessibility.RealAccessibilityCallbackService;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.internal.SubtreeManager;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import defpackage.Size$$ExternalSyntheticLambda0;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate$CreateEmitter;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.oneformapp.ProfileStore_;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0 implements ImageReaderProxy.OnImageAvailableListener, CallbackToFutureAdapter$Resolver, SurfaceRequest.TransformationInfoListener, AsyncFunction, ShouldPauseCallback, OnFailureListener, ListenerSet.IterationFinishedEvent, ListenerSet.Event, MediaCodecUtil.ScoreProvider, Consumer, TreehouseView$ReadyForContentChangeListener, EventListener.Factory, OnApplyWindowInsetsListener, io.reactivex.rxjava3.functions.Consumer, ObservableOnSubscribe, SynchronizationGuard$CriticalSection, SQLiteEventStore.Function, OnCompleteListener, Continuation, AccessibilityViewCommand {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(AnalyticsListener.EventTime eventTime, Format format2, DecoderReuseEvaluation decoderReuseEvaluation) {
        this.$r8$classId = 13;
        this.f$0 = eventTime;
        this.f$1 = format2;
    }

    @Override // androidx.media3.common.util.Consumer, io.reactivex.rxjava3.functions.Consumer
    public void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 16:
                DrmSessionEventListener.EventDispatcher eventDispatcher = (DrmSessionEventListener.EventDispatcher) obj3;
                ((MediaSourceEventListener) obj).onDownstreamFormatChanged(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, (MediaLoadData) obj2);
                break;
            case 21:
                ((ServiceDeliveryClient) obj3).lambda$execUtil$5((PublishSubject) obj2, (Throwable) obj);
                break;
            default:
                ((ServiceDeliveryClient) obj3).lambda$serviceError$25((String) obj2, (SecResponse) obj);
                break;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    /* renamed from: apply, reason: collision with other method in class */
    public Object mo39apply(Object obj) {
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) this.f$0;
        AutoValue_TransportContext autoValue_TransportContext = (AutoValue_TransportContext) this.f$1;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        AutoValue_EventStoreConfig autoValue_EventStoreConfig = sQLiteEventStore.config;
        ArrayList loadEvents = sQLiteEventStore.loadEvents(sQLiteDatabase, autoValue_TransportContext, autoValue_EventStoreConfig.loadBatchSize);
        for (Priority priority : Priority.values()) {
            if (priority != autoValue_TransportContext.priority) {
                int size = autoValue_EventStoreConfig.loadBatchSize - loadEvents.size();
                if (size <= 0) {
                    break;
                }
                SVG builder = AutoValue_TransportContext.builder();
                builder.setBackendName(autoValue_TransportContext.backendName);
                if (priority == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("Null priority");
                    return null;
                }
                builder.idToElementMap = priority;
                builder.cssRules = autoValue_TransportContext.extras;
                loadEvents.addAll(sQLiteEventStore.loadEvents(sQLiteDatabase, builder.build(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < loadEvents.size(); i++) {
            sb.append(((AutoValue_PersistedEvent) loadEvents.get(i)).id);
            if (i < loadEvents.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new SQLiteEventStore.Metadata(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = loadEvents.listIterator();
        while (listIterator.hasNext()) {
            AutoValue_PersistedEvent autoValue_PersistedEvent = (AutoValue_PersistedEvent) listIterator.next();
            long j2 = autoValue_PersistedEvent.id;
            if (hashMap.containsKey(Long.valueOf(j2))) {
                SubtreeManager builder2 = autoValue_PersistedEvent.event.toBuilder();
                for (SQLiteEventStore.Metadata metadata : (Set) hashMap.get(Long.valueOf(j2))) {
                    builder2.addMetadata(metadata.key, metadata.value);
                }
                listIterator.set(new AutoValue_PersistedEvent(j2, autoValue_PersistedEvent.transportContext, builder2.m4005build()));
            }
        }
        return loadEvents;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 2:
                ((AtomicReference) obj).set(callbackToFutureAdapter$Completer);
                return "SurfaceRequest-surface-recreation(" + ((SurfaceRequest) obj2).hashCode() + ")";
            case 6:
                TextureViewImplementation textureViewImplementation = (TextureViewImplementation) obj2;
                Surface surface = (Surface) obj;
                StringUtilsKt.d("TextureViewImpl", "Surface set on Preview.");
                textureViewImplementation.mSurfaceRequest.provideSurface(surface, zzabp.directExecutor(), new Recorder$$ExternalSyntheticLambda17(callbackToFutureAdapter$Completer, 4));
                return "provideSurface[request=" + textureViewImplementation.mSurfaceRequest + " surface=" + surface + "]";
            default:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                callbackToFutureAdapter$Completer.addCancellationListener(new WorkerKt$$ExternalSyntheticLambda1(atomicBoolean, 0), DirectExecutor.INSTANCE);
                ((Executor) obj2).execute(new WorkerKt$$ExternalSyntheticLambda2(atomicBoolean, callbackToFutureAdapter$Completer, (Function0) obj, 0));
                return Unit.INSTANCE;
        }
    }

    @Override // app.cash.zipline.EventListener.Factory
    public EventListener create(String str, String str2) {
        EventListener.Factory factory = (EventListener.Factory) this.f$0;
        RealTreehouseApp realTreehouseApp = (RealTreehouseApp) this.f$1;
        str.getClass();
        return (RealEventPublisher$ZiplineEventListener) new SVG(factory.create(realTreehouseApp, str2)).cssRules;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
    public Object execute() {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        zzai zzaiVar = (zzai) this.f$0;
        switch (i) {
            case 24:
                Iterable iterable = (Iterable) obj;
                SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) zzaiVar.zab;
                sQLiteEventStore.getClass();
                if (iterable.iterator().hasNext()) {
                    sQLiteEventStore.getDb().compileStatement("DELETE FROM events WHERE _id in ".concat(SQLiteEventStore.toIdList(iterable))).execute();
                    break;
                }
                break;
            default:
                Iterator it = ((HashMap) obj).entrySet().iterator();
                while (it.hasNext()) {
                    ((SQLiteEventStore) zzaiVar.zze).recordLogEventDropped(((Integer) r2.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    public int getScore(Object obj) {
        Context context = (Context) this.f$0;
        Format format2 = (Format) this.f$1;
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
        String str = mediaCodecInfo.mimeType;
        return ((str.equals(format2.sampleMimeType) || str.equals(MediaCodecUtil.getAlternativeCodecMimeType(format2))) && mediaCodecInfo.isCodecProfileAndLevelSupported(context, format2, false) && mediaCodecInfo.isCompressedAudioBitDepthSupported(format2)) ? 1 : 0;
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        DefaultAnalyticsCollector defaultAnalyticsCollector = (DefaultAnalyticsCollector) this.f$0;
        Player player = (Player) this.f$1;
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        SparseArray sparseArray = defaultAnalyticsCollector.eventTimes;
        CallResult callResult = new CallResult();
        callResult.result = flagSet;
        SparseBooleanArray sparseBooleanArray = flagSet.flags;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int i2 = flagSet.get(i);
            AnalyticsListener.EventTime eventTime = (AnalyticsListener.EventTime) sparseArray.get(i2);
            eventTime.getClass();
            sparseArray2.append(i2, eventTime);
        }
        callResult.serviceNames = sparseArray2;
        analyticsListener.onEvents(player, callResult);
    }

    public OffsetApplier measure(TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
        TextLinkScope textLinkScope = (TextLinkScope) this.f$0;
        AnnotatedString.Range range = (AnnotatedString.Range) this.f$1;
        TextLayoutResult textLayoutResult = (TextLayoutResult) textLinkScope.textLayoutResult$delegate.getValue();
        int i = 1;
        int i2 = 0;
        if (textLayoutResult == null) {
            return new OffsetApplier(i2, i2, new Size$$ExternalSyntheticLambda0(25), i);
        }
        AnnotatedString.Range calculateVisibleLinkRange = TextLinkScope.calculateVisibleLinkRange(range, textLayoutResult);
        if (calculateVisibleLinkRange == null) {
            return new OffsetApplier(i2, i2, new Size$$ExternalSyntheticLambda0(24), i);
        }
        IntRect roundToIntRect = IntRectKt.roundToIntRect(textLayoutResult.getPathForRange(calculateVisibleLinkRange.start, calculateVisibleLinkRange.end).getBounds());
        return new OffsetApplier(roundToIntRect.getWidth(), roundToIntRect.getHeight(), new Threads$$ExternalSyntheticLambda1(roundToIntRect, 23), i);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat addInAppMessageViewToViewGroup$lambda$2;
        addInAppMessageViewToViewGroup$lambda$2 = DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$2((DefaultInAppMessageViewWrapper) this.f$0, (View) this.f$1, view, windowInsetsCompat);
        return addInAppMessageViewToViewGroup$lambda$2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((EnhancedIntentService) this.f$0).finishTask((Intent) this.f$1);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        GetCredentialException getCredentialCancellationException;
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 9:
                CredentialProviderBeginSignInController credentialProviderBeginSignInController = (CredentialProviderBeginSignInController) obj2;
                CancellationSignal cancellationSignal = (CancellationSignal) obj;
                String str = ((exc instanceof ApiException) && CredentialProviderController.retryables.contains(Integer.valueOf(((ApiException) exc).mStatus.zza))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String m = Fragment$5$$ExternalSyntheticOutline0.m(exc, new StringBuilder("During begin sign in, failure response from one tap: "));
                int hashCode = str.hashCode();
                if (hashCode == -1567968963) {
                    if (str.equals("GET_CANCELED_TAG")) {
                        getCredentialCancellationException = new GetCredentialCancellationException(m);
                    }
                    getCredentialCancellationException = new GetCredentialUnknownException(m);
                } else if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        getCredentialCancellationException = new NoCredentialException(m);
                    }
                    getCredentialCancellationException = new GetCredentialUnknownException(m);
                } else {
                    if (str.equals("GET_INTERRUPTED")) {
                        getCredentialCancellationException = new GetCredentialInterruptedException(m);
                    }
                    getCredentialCancellationException = new GetCredentialUnknownException(m);
                }
                CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                    return;
                }
                credentialProviderBeginSignInController.getExecutor().execute(new CredentialProviderBeginSignInController$$ExternalSyntheticLambda6(credentialProviderBeginSignInController, getCredentialCancellationException, 1));
                return;
            default:
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = (CredentialProviderCreatePublicKeyCredentialController) obj2;
                CancellationSignal cancellationSignal2 = (CancellationSignal) obj;
                String str2 = ((exc instanceof ApiException) && CredentialProviderController.retryables.contains(Integer.valueOf(((ApiException) exc).mStatus.zza))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                String m2 = Fragment$5$$ExternalSyntheticOutline0.m(exc, new StringBuilder("During create public key credential, fido registration failure: "));
                CreateCredentialException createCredentialCancellationException = str2.equals("CREATE_CANCELED") ? new CreateCredentialCancellationException(m2) : str2.equals("CREATE_INTERRUPTED") ? new CreateCredentialInterruptedException(m2) : new CreateCredentialUnknownException(m2);
                CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal2)) {
                    return;
                }
                Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
                if (executor != null) {
                    executor.execute(new CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda10(credentialProviderCreatePublicKeyCredentialController, createCredentialCancellationException, 2));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    throw null;
                }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 1:
                ((ImageReaderProxy.OnImageAvailableListener) obj).onImageAvailable((ProfileStore_) obj2);
                break;
            default:
                ((ImageReaderProxy.OnImageAvailableListener) obj).onImageAvailable((Recorder.AnonymousClass1) obj2);
                break;
        }
    }

    public void onReadyForContentChanged(TreehouseLayout treehouseLayout) {
        TreehouseLayout treehouseLayout2 = (TreehouseLayout) this.f$0;
        TreehouseAppContent treehouseAppContent = (TreehouseAppContent) this.f$1;
        treehouseLayout.getClass();
        if (treehouseLayout2.readyForContent) {
            treehouseAppContent.bind(treehouseLayout2);
        } else {
            treehouseAppContent.unbind();
        }
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo) {
        DefaultSurfaceProcessor defaultSurfaceProcessor = (DefaultSurfaceProcessor) this.f$0;
        GLUtils.InputFormat inputFormat = (((SurfaceRequest) this.f$1).mDynamicRange.is10BitHdr() && autoValue_SurfaceRequest_TransformationInfo.hasCameraTransform) ? GLUtils.InputFormat.YUV : GLUtils.InputFormat.DEFAULT;
        OpenGlRenderer openGlRenderer = defaultSurfaceProcessor.mGlRenderer;
        GLUtils.checkInitializedOrThrow((AtomicBoolean) openGlRenderer.mInitialized, true);
        GLUtils.checkGlThreadOrThrow((Thread) openGlRenderer.mGlThread);
        if (((GLUtils.InputFormat) openGlRenderer.mCurrentInputformat) != inputFormat) {
            openGlRenderer.mCurrentInputformat = inputFormat;
            openGlRenderer.useAndConfigureProgramWithTexture(openGlRenderer.mExternalTextureId);
        }
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view) {
        AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) this.f$0;
        AccessibilityActionImpl accessibilityActionImpl = (AccessibilityActionImpl) this.f$1;
        view.getClass();
        RealAccessibilityCallbackService realAccessibilityCallbackService = (RealAccessibilityCallbackService) anchoredDraggableState.lastVelocity$delegate;
        String str = accessibilityActionImpl.callbackTag;
        str.getClass();
        StateFlowKt.emitOrThrow(realAccessibilityCallbackService.flow, new AccessibilityCallback(str));
        return true;
    }

    @Override // androidx.compose.runtime.ShouldPauseCallback
    public boolean shouldPause() {
        PrefetchHandleProvider$HandleAndRequestImpl prefetchHandleProvider$HandleAndRequestImpl = (PrefetchHandleProvider$HandleAndRequestImpl) this.f$0;
        Averages averages = (Averages) this.f$1;
        if (!prefetchHandleProvider$HandleAndRequestImpl.pauseRequested) {
            prefetchHandleProvider$HandleAndRequestImpl.updateElapsedAndAvailableTime();
            averages.resumeTimeNanos = Averages.calculateAverageTime(prefetchHandleProvider$HandleAndRequestImpl.elapsedTimeNanos, averages.resumeTimeNanos);
            prefetchHandleProvider$HandleAndRequestImpl.pauseRequested = !prefetchHandleProvider$HandleAndRequestImpl.shouldExecute(prefetchHandleProvider$HandleAndRequestImpl.availableTimeNanos, r1 + averages.pauseTimeNanos);
        }
        return prefetchHandleProvider$HandleAndRequestImpl.pauseRequested;
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public void subscribe(ObservableCreate$CreateEmitter observableCreate$CreateEmitter) {
        NfcDevice.transceive$lambda$0((NfcDevice) this.f$0, (List) this.f$1, observableCreate$CreateEmitter);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        RequestDeduplicator requestDeduplicator = (RequestDeduplicator) this.f$0;
        String str = (String) this.f$1;
        synchronized (requestDeduplicator) {
            requestDeduplicator.getTokenRequests.remove(str);
        }
        return task;
    }

    public /* synthetic */ CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$1;
        AnalyticsListener.EventTime eventTime = (AnalyticsListener.EventTime) this.f$0;
        switch (i) {
            case 12:
                ((AnalyticsListener) obj).onPlayerError(eventTime, (PlaybackException) obj2);
                break;
            case 13:
                ((AnalyticsListener) obj).onAudioInputFormatChanged(eventTime, (Format) obj2);
                break;
            default:
                ((AnalyticsListener) obj).onDownstreamFormatChanged(eventTime, (MediaLoadData) obj2);
                break;
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        AdapterCameraControl adapterCameraControl = (AdapterCameraControl) this.f$0;
        ArrayList arrayList = (ArrayList) this.f$1;
        StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1 = (StreamSharing$$ExternalSyntheticLambda1) adapterCameraControl.mCameraControl;
        Integer num = (Integer) ((CaptureConfig) arrayList.get(0)).mImplementationOptions.retrieveOption(CaptureConfig.OPTION_JPEG_QUALITY, 100);
        Objects.requireNonNull(num);
        int intValue = num.intValue();
        Integer num2 = (Integer) ((CaptureConfig) arrayList.get(0)).mImplementationOptions.retrieveOption(CaptureConfig.OPTION_ROTATION, 0);
        Objects.requireNonNull(num2);
        int intValue2 = num2.intValue();
        MetadataRepo metadataRepo = ((StreamSharing) streamSharing$$ExternalSyntheticLambda1.f$0).mSharingNode;
        if (metadataRepo != null) {
            DefaultSurfaceProcessor defaultSurfaceProcessor = (DefaultSurfaceProcessor) metadataRepo.mMetadataList;
            CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
            callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
            CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
            callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
            callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
            try {
                defaultSurfaceProcessor.executeSafely(new CameraX$$ExternalSyntheticLambda2(29, defaultSurfaceProcessor, new AutoValue_DefaultSurfaceProcessor_PendingSnapshot(intValue, intValue2, callbackToFutureAdapter$Completer)), new Preview$$ExternalSyntheticLambda0(callbackToFutureAdapter$Completer, 12));
                callbackToFutureAdapter$Completer.tag = "DefaultSurfaceProcessor#snapshot";
            } catch (Exception e) {
                callbackToFutureAdapter$SafeFuture.setException(e);
            }
            return Futures.nonCancellationPropagating(callbackToFutureAdapter$SafeFuture);
        }
        return new ImmediateFuture$ImmediateFailedFuture(new Exception("Failed to take picture: pipeline is not ready."), 0);
    }
}
