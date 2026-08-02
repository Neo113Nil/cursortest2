package androidx.paging;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.config.UseCaseGraphContext;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl;
import androidx.camera.camera2.pipe.CameraControls3A;
import androidx.camera.camera2.pipe.CameraGraph$Constants3A;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DefaultDraggableAnchors;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda3;
import androidx.compose.foundation.text.contextmenu.internal.FloatingTextActionModeCallback;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.material.AnchoredDraggableState$$ExternalSyntheticLambda0;
import androidx.compose.material.CardKt;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.ReadException;
import androidx.datastore.core.SingleProcessCoordinator;
import androidx.datastore.core.State;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.appmessages.TooltipAppMessageViewEvent;
import com.squareup.cash.appmessages.presenters.RealInAppNotificationPresenter;
import com.squareup.cash.appmessages.presenters.RealTooltipAppMessagePresenter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter;
import com.squareup.cash.blockers.presenters.FilesetUploadPresenter;
import com.squareup.cash.blockers.presenters.PasscodeConfirmTypeTransformer;
import com.squareup.cash.blockers.presenters.PromotionPanePresenter;
import com.squareup.cash.blockers.presenters.ReferralCodePresenter;
import com.squareup.cash.blockers.presenters.RegisterAliasPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.PasscodeViewEvent;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewEvent;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.core.CardGeometry;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.screens.DisclosureScreen;
import com.squareup.cash.cashlynxflow.api.v2.SelectInstrumentRequest;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.graphics.swampgl.components.AABB;
import com.squareup.cash.offers.views.sup.OffersNotificationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.passkeys.backend.PasskeyRepository$LoginIdentifier;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.grantly.app.CreateShippingAddressRequest;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.protos.cash.grantly.app.UpdateShippingAddressRequest;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.cash.messagingplatformcommon.app.ReportAppMessageActionRequest;
import com.squareup.protos.cash.messagingplatformcommon.app.ReportAppMessageViewRequest;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.ApplyRewardCodeRequest;
import com.squareup.protos.franklin.app.ConfirmDisclosureRequest;
import com.squareup.protos.franklin.app.ConfirmPasscodeRequest;
import com.squareup.protos.franklin.app.ConfirmPaymentRequest;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.app.SetSignatureRequest;
import com.squareup.protos.franklin.app.SubmitFilesetRequest;
import com.squareup.protos.franklin.common.InitiatePasscodeResetRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.GrpcMethod;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import okhttp3.Cache;
import okio.ByteString;
import papa.SafeTrace;
import squareup.cash.overdraft.OverdraftStatus;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class PagingDataPresenter$collectFrom$2 extends SuspendLambda implements Function1 {
    public final /* synthetic */ Object $pagingData;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataPresenter$collectFrom$2(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, List list, Continuation continuation) {
        super(1, continuation);
        this.$r8$classId = 2;
        UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.SESSION_CONFIG;
        this.this$0 = useCaseCameraRequestControlImpl;
        this.$pagingData = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.$pagingData;
        switch (i) {
            case 0:
                return new PagingDataPresenter$collectFrom$2((LazyPagingItems$pagingDataPresenter$1) this.this$0, (PagingData) obj, continuation, 0);
            case 1:
                return new PagingDataPresenter$collectFrom$2((UseCaseCameraRequestControlImpl) obj, continuation, 1);
            case 2:
                UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = (UseCaseCameraRequestControlImpl) this.this$0;
                UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.SESSION_CONFIG;
                return new PagingDataPresenter$collectFrom$2(useCaseCameraRequestControlImpl, (List) obj, continuation);
            case 3:
                return new PagingDataPresenter$collectFrom$2((AnchoredDraggableState) this.this$0, (Function3) obj, continuation, 3);
            case 4:
                return new PagingDataPresenter$collectFrom$2((AndroidTextContextMenuToolbarProvider) this.this$0, (TextContextMenuDataProvider) obj, continuation, 4);
            case 5:
                return new PagingDataPresenter$collectFrom$2((BasicTextContextMenuProvider) this.this$0, (BasicTextContextMenuProvider.SessionImpl) obj, continuation, 5);
            case 6:
                return new PagingDataPresenter$collectFrom$2((androidx.compose.material.AnchoredDraggableState) this.this$0, (Function3) obj, continuation, 6);
            case 7:
                return new PagingDataPresenter$collectFrom$2((DataStoreImpl) obj, continuation, 7);
            case 8:
                return new PagingDataPresenter$collectFrom$2((RealAppMessageManager) this.this$0, (String) obj, continuation, 8);
            case 9:
                return new PagingDataPresenter$collectFrom$2((CardStudioPresenter) this.this$0, (AppMessageViewEvent.AppMessageViewed) obj, continuation, 9);
            case 10:
                return new PagingDataPresenter$collectFrom$2((DisclosurePresenter) this.this$0, (AppMessageViewEvent.AppMessageViewed) obj, continuation, 10);
            case 11:
                return new PagingDataPresenter$collectFrom$2((DisclosurePresenter) this.this$0, (AppMessageViewEvent.AppMessageViewed) obj, continuation, 11);
            case 12:
                return new PagingDataPresenter$collectFrom$2((CardStudioPresenter) this.this$0, (AppMessageViewEvent) obj, continuation, 12);
            case 13:
                return new PagingDataPresenter$collectFrom$2((GrpcMethod) this.this$0, (AppMessageViewEvent.AppMessageActionTaken) obj, continuation, 13);
            case 14:
                return new PagingDataPresenter$collectFrom$2((RealInAppNotificationPresenter) this.this$0, (AppMessageViewEvent) obj, continuation, 14);
            case 15:
                return new PagingDataPresenter$collectFrom$2((RealTooltipAppMessagePresenter) this.this$0, (TooltipAppMessageViewEvent) obj, continuation, 15);
            case 16:
                return new PagingDataPresenter$collectFrom$2((AmountBlockerPresenter) this.this$0, (SetAmountRequest) obj, continuation, 16);
            case 17:
                return new PagingDataPresenter$collectFrom$2((CardLockPresenter) this.this$0, (SetAmountRequest) obj, continuation, 17);
            case 18:
                return new PagingDataPresenter$collectFrom$2((DisclosurePresenter) this.this$0, (RequestContext) obj, continuation, 18);
            case 19:
                return new PagingDataPresenter$collectFrom$2((FilesetUploadPresenter) this.this$0, (SubmitFilesetRequest) obj, continuation, 19);
            case 20:
                return new PagingDataPresenter$collectFrom$2((DisclosurePresenter) this.this$0, (SelectInstrumentRequest) obj, continuation, 20);
            case 21:
                return new PagingDataPresenter$collectFrom$2((PasscodeConfirmTypeTransformer) this.this$0, (PasscodeViewEvent.VerifyPasscode) obj, continuation, 21);
            case 22:
                return new PagingDataPresenter$collectFrom$2((PromotionPanePresenter) this.this$0, (String) obj, continuation, 22);
            case 23:
                return new PagingDataPresenter$collectFrom$2((ReferralCodePresenter) this.this$0, (ReferralCodeViewEvent) obj, continuation, 23);
            case 24:
                return new PagingDataPresenter$collectFrom$2((RegisterAliasPresenter) this.this$0, (ClientScenario) obj, continuation, 24);
            case 25:
                return new PagingDataPresenter$collectFrom$2((CardLockPresenter) this.this$0, (CreateShippingAddressRequest) obj, continuation, 25);
            case 26:
                return new PagingDataPresenter$collectFrom$2((CardLockPresenter) this.this$0, (UpdateShippingAddressRequest) obj, continuation, 26);
            case 27:
                return new PagingDataPresenter$collectFrom$2((LocalHomePresenter) this.this$0, (ByteString) obj, continuation, 27);
            case 28:
                return new PagingDataPresenter$collectFrom$2((DisclosurePresenter) this.this$0, (ConfirmDisclosureRequest) obj, continuation, 28);
            default:
                return new PagingDataPresenter$collectFrom$2((CardGeometry) this.this$0, (CardScene) obj, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((PagingDataPresenter$collectFrom$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0209, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r4, r6, r19) == r2) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f1, code lost:
    
        if (r3 == r2) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0557, code lost:
    
        if (r1 != r2) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x088f, code lost:
    
        if (r0 == r7) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0882, code lost:
    
        if (r0.await(r19) != r7) goto L442;
     */
    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Deferred deferred;
        Object obj2;
        Object acquireSession;
        Object acquireSession2;
        AutoCloseable autoCloseable;
        Object unlock3A$default;
        AutoCloseable autoCloseable2;
        Throwable th;
        AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl textActionModeCallbackImpl;
        Object version;
        State state;
        Object access$readDataOrHandleCorruption;
        Object initiatePasscodeReset;
        int i = this.$r8$classId;
        int i2 = 28;
        int i3 = 3;
        int i4 = 2;
        Object obj3 = this.$pagingData;
        int i5 = 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        switch (i) {
            case 0:
                PagingData pagingData = (PagingData) obj3;
                LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1 = (LazyPagingItems$pagingDataPresenter$1) this.this$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    UiReceiver uiReceiver = pagingData.uiReceiver;
                    UiReceiver uiReceiver2 = lazyPagingItems$pagingDataPresenter$1.uiReceiver;
                    lazyPagingItems$pagingDataPresenter$1.uiReceiver = uiReceiver;
                    if (uiReceiver2 instanceof PagingDataPresenter$InitialUiReceiver) {
                        PagingDataPresenter$InitialUiReceiver pagingDataPresenter$InitialUiReceiver = (PagingDataPresenter$InitialUiReceiver) uiReceiver2;
                        if (pagingDataPresenter$InitialUiReceiver.shouldRetry) {
                            uiReceiver.retry();
                        }
                        if (pagingDataPresenter$InitialUiReceiver.shouldRefresh) {
                            uiReceiver.refresh();
                        }
                    }
                    Flow flow = pagingData.flow;
                    ThumbNode$onAttach$1.AnonymousClass1 anonymousClass1 = new ThumbNode$onAttach$1.AnonymousClass1(10, lazyPagingItems$pagingDataPresenter$1, pagingData);
                    this.label = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                UseCaseGraphContext useCaseGraphContext = ((UseCaseCameraRequestControlImpl) obj3).useCaseGraphContext;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                try {
                    try {
                    } catch (CancellationException e) {
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
                        }
                        obj2 = UseCaseCameraRequestControlImpl.submitFailedResult;
                    }
                } catch (CancellationException e2) {
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e2);
                    }
                    deferred = UseCaseCameraRequestControlImpl.submitFailedResult;
                }
                try {
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "UseCaseCameraRequestControlImpl#cancelFocusAndMeteringAsync");
                        }
                        CameraGraphImpl graph = useCaseGraphContext.getGraph();
                        this.label = 1;
                        acquireSession2 = graph.acquireSession(this);
                        if (acquireSession2 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else if (i7 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        acquireSession2 = obj;
                    } else if (i7 == 2) {
                        autoCloseable2 = (AutoCloseable) this.this$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            unlock3A$default = obj;
                            deferred = (Deferred) unlock3A$default;
                            Cache.Companion.closeFinally(autoCloseable2, null);
                            this.this$0 = null;
                            this.label = 3;
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            autoCloseable = autoCloseable2;
                            th = th;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                Cache.Companion.closeFinally(autoCloseable, th);
                                throw th3;
                            }
                        }
                    } else if (i7 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        CameraGraphImpl graph2 = useCaseGraphContext.getGraph();
                        this.label = 4;
                        acquireSession = graph2.acquireSession(this);
                        break;
                    } else {
                        if (i7 != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        acquireSession = obj;
                        AutoCloseable autoCloseable3 = (AutoCloseable) acquireSession;
                        try {
                            MeteringRectangle[] meteringRectangleArr = CameraGraph$Constants3A.METERING_REGIONS_DEFAULT;
                            List asList = ArraysKt___ArraysJvmKt.asList(meteringRectangleArr);
                            List asList2 = Arrays.asList(meteringRectangleArr);
                            asList2.getClass();
                            List asList3 = Arrays.asList(meteringRectangleArr);
                            asList3.getClass();
                            obj2 = CameraControls3A.m42update3AydBZfZg$default((CameraGraphSessionImpl) autoCloseable3, null, null, null, asList, asList2, asList3, 7);
                            Cache.Companion.closeFinally(autoCloseable3, null);
                            return obj2;
                        } finally {
                        }
                    }
                    this.this$0 = autoCloseable;
                    this.label = 2;
                    unlock3A$default = CameraGraphSessionImpl.unlock3A$default((CameraGraphSessionImpl) autoCloseable, 0L, 56);
                    if (unlock3A$default != coroutineSingletons2) {
                        autoCloseable2 = autoCloseable;
                        deferred = (Deferred) unlock3A$default;
                        Cache.Companion.closeFinally(autoCloseable2, null);
                        this.this$0 = null;
                        this.label = 3;
                    }
                    return coroutineSingletons2;
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    throw th;
                }
                autoCloseable = (AutoCloseable) acquireSession2;
            case 2:
                UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = (UseCaseCameraRequestControlImpl) this.this$0;
                LinkedHashMap linkedHashMap = useCaseCameraRequestControlImpl.infoBundleMap;
                List list = (List) obj3;
                UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.DEFAULT;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#removeParametersAsync: [" + type2 + "] keys = " + list);
                }
                Object obj4 = linkedHashMap.get(type2);
                Object obj5 = obj4;
                if (obj4 == null) {
                    UseCaseCameraRequestControlImpl.InfoBundle infoBundle = new UseCaseCameraRequestControlImpl.InfoBundle((Toolbar.AnonymousClass1) (z3 ? 1 : 0), (LinkedHashMap) (z2 ? 1 : 0), (RequestTemplate) (z ? 1 : 0), 15);
                    linkedHashMap.put(type2, infoBundle);
                    obj5 = infoBundle;
                }
                UseCaseCameraRequestControlImpl.InfoBundle infoBundle2 = (UseCaseCameraRequestControlImpl.InfoBundle) obj5;
                Toolbar.AnonymousClass1 anonymousClass12 = new Toolbar.AnonymousClass1(5);
                anonymousClass12.insertAllOptions((MutableOptionsBundle) infoBundle2.options.this$0);
                list.getClass();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((MutableOptionsBundle) anonymousClass12.this$0).removeOption(OverdraftStatus.State_.createCaptureRequestOption((CaptureRequest.Key) it.next()));
                }
                linkedHashMap.put(type2, new UseCaseCameraRequestControlImpl.InfoBundle(anonymousClass12, MapsKt__MapsKt.toMutableMap(infoBundle2.tags), CollectionsKt.toMutableSet(infoBundle2.listeners), infoBundle2.template));
                UseCaseCameraRequestControlImpl.InfoBundle merge = UseCaseCameraRequestControlImpl.merge(useCaseCameraRequestControlImpl.infoBundleMap);
                this.label = 1;
                Object updateCameraStateAsync = useCaseCameraRequestControlImpl.updateCameraStateAsync(merge, null, this);
                return updateCameraStateAsync == coroutineSingletons3 ? coroutineSingletons3 : updateCameraStateAsync;
            case 3:
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) this.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersNotificationKt$$ExternalSyntheticLambda3 offersNotificationKt$$ExternalSyntheticLambda3 = new OffersNotificationKt$$ExternalSyntheticLambda3(anchoredDraggableState, i3);
                    SliderDraggableState$drag$2 sliderDraggableState$drag$2 = new SliderDraggableState$drag$2(obj3, (Object) anchoredDraggableState, (Continuation) (z4 ? 1 : 0), 14);
                    this.label = 1;
                    if (Draggable2DKt.access$restartable(offersNotificationKt$$ExternalSyntheticLambda3, sliderDraggableState$drag$2, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                DefaultDraggableAnchors anchors = anchoredDraggableState.getAnchors();
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = anchoredDraggableState.offset$delegate;
                Object closestAnchor = anchors.closestAnchor(parcelableSnapshotMutableFloatState.getFloatValue());
                if (closestAnchor != null) {
                    if (Math.abs(parcelableSnapshotMutableFloatState.getFloatValue() - anchoredDraggableState.getAnchors().positionOf(closestAnchor)) < 0.5f && ((Boolean) anchoredDraggableState.confirmValueChange.invoke(closestAnchor)).booleanValue()) {
                        anchoredDraggableState.settledValue$delegate.setValue(closestAnchor);
                        anchoredDraggableState.setCurrentValue(closestAnchor);
                    }
                }
                return Unit.INSTANCE;
            case 4:
                AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = (AndroidTextContextMenuToolbarProvider) this.this$0;
                SnapshotStateObserver snapshotStateObserver = androidTextContextMenuToolbarProvider.snapshotStateObserver;
                View view = androidTextContextMenuToolbarProvider.view;
                Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                try {
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        AndroidTextContextMenuToolbarProvider.TextContextMenuSessionImpl textContextMenuSessionImpl = new AndroidTextContextMenuToolbarProvider.TextContextMenuSessionImpl();
                        TextContextMenuDataProvider textContextMenuDataProvider = (TextContextMenuDataProvider) obj3;
                        AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl textActionModeCallbackImpl2 = new AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl(textContextMenuSessionImpl, new AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda3(androidTextContextMenuToolbarProvider, textContextMenuDataProvider, 0), new AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda3(androidTextContextMenuToolbarProvider, textContextMenuDataProvider, i5), view);
                        Function1 function1 = androidTextContextMenuToolbarProvider.callbackInjector;
                        if (function1 != null && (textActionModeCallbackImpl = (AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl) function1.invoke(textActionModeCallbackImpl2)) != null) {
                            textActionModeCallbackImpl2 = textActionModeCallbackImpl;
                        }
                        Looper myLooper = Looper.myLooper();
                        Handler handler = view.getHandler();
                        if (myLooper != (handler != null ? handler.getLooper() : null)) {
                            AFd1wSDK$$ExternalSyntheticLambda2 aFd1wSDK$$ExternalSyntheticLambda2 = androidTextContextMenuToolbarProvider.startActionModeRunnable;
                            if (aFd1wSDK$$ExternalSyntheticLambda2 == null) {
                                aFd1wSDK$$ExternalSyntheticLambda2 = new AFd1wSDK$$ExternalSyntheticLambda2(20, androidTextContextMenuToolbarProvider, textActionModeCallbackImpl2, textContextMenuSessionImpl);
                                androidTextContextMenuToolbarProvider.startActionModeRunnable = aFd1wSDK$$ExternalSyntheticLambda2;
                            }
                            view.post(aFd1wSDK$$ExternalSyntheticLambda2);
                        } else {
                            ActionMode startActionMode = view.startActionMode(new FloatingTextActionModeCallback(textActionModeCallbackImpl2), 1);
                            if (startActionMode == null) {
                                return Unit.INSTANCE;
                            }
                            androidTextContextMenuToolbarProvider.actionMode = startActionMode;
                        }
                        this.label = 1;
                        BufferedChannel bufferedChannel = textContextMenuSessionImpl.channel;
                        bufferedChannel.getClass();
                        Object receive$suspendImpl = BufferedChannel.receive$suspendImpl(bufferedChannel, this);
                        if ((receive$suspendImpl == obj6 ? receive$suspendImpl : Unit.INSTANCE) == obj6) {
                            return obj6;
                        }
                    } else {
                        if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    snapshotStateObserver.clear();
                    Looper myLooper2 = Looper.myLooper();
                    Handler handler2 = view.getHandler();
                    if (myLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                        Runnable runnable = androidTextContextMenuToolbarProvider.finishActionModeRunnable;
                        if (runnable == null) {
                            runnable = new Preview$$ExternalSyntheticLambda0(androidTextContextMenuToolbarProvider, i2);
                            androidTextContextMenuToolbarProvider.finishActionModeRunnable = runnable;
                        }
                        view.post(runnable);
                    } else {
                        ActionMode actionMode = androidTextContextMenuToolbarProvider.actionMode;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    AFd1wSDK$$ExternalSyntheticLambda2 aFd1wSDK$$ExternalSyntheticLambda22 = androidTextContextMenuToolbarProvider.startActionModeRunnable;
                    if (aFd1wSDK$$ExternalSyntheticLambda22 != null) {
                        view.removeCallbacks(aFd1wSDK$$ExternalSyntheticLambda22);
                    }
                    androidTextContextMenuToolbarProvider.actionMode = null;
                    return Unit.INSTANCE;
                } catch (Throwable th5) {
                    snapshotStateObserver.clear();
                    Looper myLooper3 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (myLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable runnable2 = androidTextContextMenuToolbarProvider.finishActionModeRunnable;
                        if (runnable2 == null) {
                            runnable2 = new Preview$$ExternalSyntheticLambda0(androidTextContextMenuToolbarProvider, i2);
                            androidTextContextMenuToolbarProvider.finishActionModeRunnable = runnable2;
                        }
                        view.post(runnable2);
                    } else {
                        ActionMode actionMode2 = androidTextContextMenuToolbarProvider.actionMode;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    AFd1wSDK$$ExternalSyntheticLambda2 aFd1wSDK$$ExternalSyntheticLambda23 = androidTextContextMenuToolbarProvider.startActionModeRunnable;
                    if (aFd1wSDK$$ExternalSyntheticLambda23 != null) {
                        view.removeCallbacks(aFd1wSDK$$ExternalSyntheticLambda23);
                    }
                    androidTextContextMenuToolbarProvider.actionMode = null;
                    throw th5;
                }
            case 5:
                BasicTextContextMenuProvider.SessionImpl sessionImpl = (BasicTextContextMenuProvider.SessionImpl) obj3;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((BasicTextContextMenuProvider) this.this$0).session$delegate;
                Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                try {
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        parcelableSnapshotMutableState.setValue(sessionImpl);
                        this.label = 1;
                        BufferedChannel bufferedChannel2 = sessionImpl.channel;
                        bufferedChannel2.getClass();
                        Object receive$suspendImpl2 = BufferedChannel.receive$suspendImpl(bufferedChannel2, this);
                        if ((receive$suspendImpl2 == obj7 ? receive$suspendImpl2 : Unit.INSTANCE) == obj7) {
                            return obj7;
                        }
                    } else {
                        if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    parcelableSnapshotMutableState.setValue(null);
                    return Unit.INSTANCE;
                } catch (Throwable th6) {
                    parcelableSnapshotMutableState.setValue(null);
                    throw th6;
                }
            case 6:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    androidx.compose.material.AnchoredDraggableState anchoredDraggableState2 = (androidx.compose.material.AnchoredDraggableState) this.this$0;
                    AnchoredDraggableState$$ExternalSyntheticLambda0 anchoredDraggableState$$ExternalSyntheticLambda0 = new AnchoredDraggableState$$ExternalSyntheticLambda0(anchoredDraggableState2, i3);
                    SliderDraggableState$drag$2 sliderDraggableState$drag$22 = new SliderDraggableState$drag$2(obj3, (Object) anchoredDraggableState2, (Continuation) (z5 ? 1 : 0), i2);
                    this.label = 1;
                    if (CardKt.access$restartable(anchoredDraggableState$$ExternalSyntheticLambda0, sliderDraggableState$drag$22, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                DataStoreImpl dataStoreImpl = (DataStoreImpl) obj3;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                try {
                } catch (Throwable th7) {
                    th = th7;
                    SingleProcessCoordinator coordinator = dataStoreImpl.getCoordinator();
                    this.this$0 = th;
                    this.label = 2;
                    version = coordinator.getVersion();
                    break;
                }
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    access$readDataOrHandleCorruption = DataStoreImpl.access$readDataOrHandleCorruption(dataStoreImpl, true, this);
                    if (access$readDataOrHandleCorruption == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) this.this$0;
                        SafeTrace.throwOnFailure(obj);
                        version = obj;
                        state = new ReadException(th, ((Number) version).intValue());
                        return new Pair(state, Boolean.TRUE);
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$readDataOrHandleCorruption = obj;
                }
                state = (State) access$readDataOrHandleCorruption;
                return new Pair(state, Boolean.TRUE);
            case 8:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 != 0) {
                    if (i14 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppMessageClientService appMessageClientService = ((RealAppMessageManager) this.this$0).appService;
                ReportAppMessageViewRequest reportAppMessageViewRequest = new ReportAppMessageViewRequest((String) obj3);
                this.label = 1;
                Object reportAppMessageView = appMessageClientService.reportAppMessageView(reportAppMessageViewRequest, this);
                return reportAppMessageView == coroutineSingletons7 ? coroutineSingletons7 : reportAppMessageView;
            case 9:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 != 0) {
                    if (i15 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppMessageClientService appMessageClientService2 = (AppMessageClientService) ((CardStudioPresenter) this.this$0).args;
                ReportAppMessageViewRequest reportAppMessageViewRequest2 = new ReportAppMessageViewRequest(((AppMessageViewEvent.AppMessageViewed) obj3).messageToken);
                this.label = 1;
                Object reportAppMessageView2 = appMessageClientService2.reportAppMessageView(reportAppMessageViewRequest2, this);
                return reportAppMessageView2 == coroutineSingletons8 ? coroutineSingletons8 : reportAppMessageView2;
            case 10:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 != 0) {
                    if (i16 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppMessageClientService appMessageClientService3 = (AppMessageClientService) ((DisclosurePresenter) this.this$0).analytics;
                ReportAppMessageViewRequest reportAppMessageViewRequest3 = new ReportAppMessageViewRequest(((AppMessageViewEvent.AppMessageViewed) obj3).messageToken);
                this.label = 1;
                Object reportAppMessageView3 = appMessageClientService3.reportAppMessageView(reportAppMessageViewRequest3, this);
                return reportAppMessageView3 == coroutineSingletons9 ? coroutineSingletons9 : reportAppMessageView3;
            case 11:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 != 0) {
                    if (i17 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppMessageClientService appMessageClientService4 = (AppMessageClientService) ((DisclosurePresenter) this.this$0).analytics;
                ReportAppMessageViewRequest reportAppMessageViewRequest4 = new ReportAppMessageViewRequest(((AppMessageViewEvent.AppMessageViewed) obj3).messageToken);
                this.label = 1;
                Object reportAppMessageView4 = appMessageClientService4.reportAppMessageView(reportAppMessageViewRequest4, this);
                return reportAppMessageView4 == coroutineSingletons10 ? coroutineSingletons10 : reportAppMessageView4;
            case 12:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 != 0) {
                    if (i18 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppMessageClientService appMessageClientService5 = (AppMessageClientService) ((CardStudioPresenter) this.this$0).args;
                ReportAppMessageViewRequest reportAppMessageViewRequest5 = new ReportAppMessageViewRequest(((AppMessageViewEvent.AppMessageViewed) ((AppMessageViewEvent) obj3)).messageToken);
                this.label = 1;
                Object reportAppMessageView5 = appMessageClientService5.reportAppMessageView(reportAppMessageViewRequest5, this);
                return reportAppMessageView5 == coroutineSingletons11 ? coroutineSingletons11 : reportAppMessageView5;
            case 13:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 != 0) {
                    if (i19 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppMessageClientService appMessageClientService6 = (AppMessageClientService) ((GrpcMethod) this.this$0).path;
                AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken = (AppMessageViewEvent.AppMessageActionTaken) obj3;
                ReportAppMessageActionRequest reportAppMessageActionRequest = new ReportAppMessageActionRequest(appMessageActionTaken.messageToken, appMessageActionTaken.url);
                this.label = 1;
                Object reportAppMessageAction = appMessageClientService6.reportAppMessageAction(reportAppMessageActionRequest, this);
                return reportAppMessageAction == coroutineSingletons12 ? coroutineSingletons12 : reportAppMessageAction;
            case 14:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 != 0) {
                    if (i20 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppMessageClientService appMessageClientService7 = ((RealInAppNotificationPresenter) this.this$0).service;
                ReportAppMessageViewRequest reportAppMessageViewRequest6 = new ReportAppMessageViewRequest(((AppMessageViewEvent.AppMessageViewed) ((AppMessageViewEvent) obj3)).messageToken);
                this.label = 1;
                Object reportAppMessageView6 = appMessageClientService7.reportAppMessageView(reportAppMessageViewRequest6, this);
                return reportAppMessageView6 == coroutineSingletons13 ? coroutineSingletons13 : reportAppMessageView6;
            case 15:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 != 0) {
                    if (i21 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppMessageClientService appMessageClientService8 = ((RealTooltipAppMessagePresenter) this.this$0).service;
                ReportAppMessageViewRequest reportAppMessageViewRequest7 = new ReportAppMessageViewRequest(((TooltipAppMessageViewEvent.TooltipViewed) ((TooltipAppMessageViewEvent) obj3)).messageToken);
                this.label = 1;
                Object reportAppMessageView7 = appMessageClientService8.reportAppMessageView(reportAppMessageViewRequest7, this);
                return reportAppMessageView7 == coroutineSingletons14 ? coroutineSingletons14 : reportAppMessageView7;
            case 16:
                AmountBlockerPresenter amountBlockerPresenter = (AmountBlockerPresenter) this.this$0;
                BlockersScreens.AmountScreen amountScreen = amountBlockerPresenter.args;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 != 0) {
                    if (i22 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppService appService = amountBlockerPresenter.appService;
                ClientScenario clientScenario = amountScreen.blockersData.clientScenario;
                clientScenario.getClass();
                this.label = 1;
                Object amount = appService.setAmount(clientScenario, amountScreen.blockersData.flowToken, (SetAmountRequest) obj3, this);
                return amount == coroutineSingletons15 ? coroutineSingletons15 : amount;
            case 17:
                CardLockPresenter cardLockPresenter = (CardLockPresenter) this.this$0;
                BlockersScreens.BitcoinAmountScreen bitcoinAmountScreen = (BlockersScreens.BitcoinAmountScreen) cardLockPresenter.cashAppTagManager;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 != 0) {
                    if (i23 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppService appService2 = (AppService) cardLockPresenter.franklinAppService;
                ClientScenario clientScenario2 = bitcoinAmountScreen.blockersData.clientScenario;
                clientScenario2.getClass();
                this.label = 1;
                Object amount2 = appService2.setAmount(clientScenario2, bitcoinAmountScreen.blockersData.flowToken, (SetAmountRequest) obj3, this);
                return amount2 == coroutineSingletons16 ? coroutineSingletons16 : amount2;
            case 18:
                RequestContext requestContext = (RequestContext) obj3;
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) this.this$0;
                BlockersScreens.ConfirmPaymentScreen confirmPaymentScreen = (BlockersScreens.ConfirmPaymentScreen) disclosurePresenter.args;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 != 0) {
                    if (i24 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppService appService3 = (AppService) disclosurePresenter.appService;
                ClientScenario clientScenario3 = confirmPaymentScreen.blockersData.clientScenario;
                clientScenario3.getClass();
                String str = confirmPaymentScreen.blockersData.flowToken;
                ConfirmPaymentRequest confirmPaymentRequest = new ConfirmPaymentRequest(requestContext, requestContext.payment_tokens, confirmPaymentScreen.instrumentSelection, 18);
                this.label = 1;
                Object confirmPayment = appService3.confirmPayment(clientScenario3, str, confirmPaymentRequest, this);
                return confirmPayment == coroutineSingletons17 ? coroutineSingletons17 : confirmPayment;
            case 19:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 != 0) {
                    if (i25 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                FilesetUploadPresenter filesetUploadPresenter = (FilesetUploadPresenter) this.this$0;
                AppService appService4 = filesetUploadPresenter.franklinAppService;
                BlockersData blockersData = filesetUploadPresenter.args.blockersData;
                this.label = 1;
                Object submitFileset = appService4.submitFileset(blockersData.clientScenario, blockersData.flowToken, (SubmitFilesetRequest) obj3, this);
                return submitFileset == coroutineSingletons18 ? coroutineSingletons18 : submitFileset;
            case 20:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 != 0) {
                    if (i26 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                DisclosurePresenter disclosurePresenter2 = (DisclosurePresenter) this.this$0;
                com.squareup.cash.cashlynxflow.service.v2.AppService appService5 = (com.squareup.cash.cashlynxflow.service.v2.AppService) disclosurePresenter2.launcher;
                BlockersData blockersData2 = ((BlockersScreens.InstrumentSelectionScreen) disclosurePresenter2.appService).blockersData;
                this.label = 1;
                Object selectInstrument = appService5.selectInstrument(blockersData2.clientScenario, blockersData2.flowToken, (SelectInstrumentRequest) obj3, this);
                return selectInstrument == coroutineSingletons19 ? coroutineSingletons19 : selectInstrument;
            case 21:
                PasscodeConfirmTypeTransformer passcodeConfirmTypeTransformer = (PasscodeConfirmTypeTransformer) this.this$0;
                BlockersScreens.PasscodeScreen passcodeScreen = passcodeConfirmTypeTransformer.args;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 != 0) {
                    if (i27 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppService appService6 = passcodeConfirmTypeTransformer.appService;
                ClientScenario clientScenario4 = passcodeScreen.blockersData.clientScenario;
                clientScenario4.getClass();
                BlockersData blockersData3 = passcodeScreen.blockersData;
                String str2 = blockersData3.flowToken;
                PasscodeViewEvent.VerifyPasscode verifyPasscode = (PasscodeViewEvent.VerifyPasscode) obj3;
                PasscodeViewEvent.VerifyPasscode.WithoutFingerprint withoutFingerprint = verifyPasscode instanceof PasscodeViewEvent.VerifyPasscode.WithoutFingerprint ? (PasscodeViewEvent.VerifyPasscode.WithoutFingerprint) verifyPasscode : null;
                String str3 = withoutFingerprint != null ? withoutFingerprint.passcode : null;
                PasscodeViewEvent.VerifyPasscode.WithFingerprint withFingerprint = verifyPasscode instanceof PasscodeViewEvent.VerifyPasscode.WithFingerprint ? (PasscodeViewEvent.VerifyPasscode.WithFingerprint) verifyPasscode : null;
                String str4 = withFingerprint != null ? withFingerprint.passcodeToken : null;
                RequestContext requestContext2 = blockersData3.requestContext;
                ConfirmPasscodeRequest confirmPasscodeRequest = new ConfirmPasscodeRequest(requestContext2, str3, requestContext2.payment_tokens, str4, (InstrumentSelection) null, requestContext2.transfer_token, 80);
                this.label = 1;
                Object confirmPasscode = appService6.confirmPasscode(clientScenario4, str2, confirmPasscodeRequest, this);
                return confirmPasscode == coroutineSingletons20 ? coroutineSingletons20 : confirmPasscode;
            case 22:
                String str5 = (String) obj3;
                PromotionPanePresenter promotionPanePresenter = (PromotionPanePresenter) this.this$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService7 = promotionPanePresenter.appService;
                    ClientScenario clientScenario5 = ClientScenario.RESET_PASSCODE;
                    InitiatePasscodeResetRequest initiatePasscodeResetRequest = new InitiatePasscodeResetRequest();
                    this.label = 1;
                    initiatePasscodeReset = appService7.initiatePasscodeReset(clientScenario5, str5, initiatePasscodeResetRequest, this);
                    break;
                } else {
                    if (i28 != 1) {
                        if (i28 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    initiatePasscodeReset = obj;
                }
                CoroutineContext coroutineContext = promotionPanePresenter.uiDispatcher;
                SetNameViewKt$SetName$2$1 setNameViewKt$SetName$2$1 = new SetNameViewKt$SetName$2$1((ApiResult) initiatePasscodeReset, promotionPanePresenter, str5, (Continuation) null, 15);
                this.label = 2;
                break;
            case 23:
                ReferralCodePresenter referralCodePresenter = (ReferralCodePresenter) this.this$0;
                BlockersScreens.ReferralCodeScreen referralCodeScreen = referralCodePresenter.args;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 != 0) {
                    if (i29 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppService appService8 = referralCodePresenter.appService;
                ClientScenario clientScenario6 = referralCodeScreen.blockersData.clientScenario;
                clientScenario6.getClass();
                String str6 = referralCodeScreen.blockersData.flowToken;
                ApplyRewardCodeRequest applyRewardCodeRequest = new ApplyRewardCodeRequest(null, ((ReferralCodeViewEvent.SubmitAction) ((ReferralCodeViewEvent) obj3)).code, ByteString.EMPTY);
                this.label = 1;
                Object applyRewardCode = appService8.applyRewardCode(clientScenario6, str6, applyRewardCodeRequest, this);
                return applyRewardCode == coroutineSingletons22 ? coroutineSingletons22 : applyRewardCode;
            case 24:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 != 0) {
                    if (i30 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RegisterAliasPresenter registerAliasPresenter = (RegisterAliasPresenter) this.this$0;
                String str7 = registerAliasPresenter.flowToken;
                this.label = 1;
                Object authenticateWithPasskey = registerAliasPresenter.passkeyRepository.authenticateWithPasskey(PasskeyRepository$LoginIdentifier.Discoverable.INSTANCE, (ClientScenario) obj3, str7, this);
                return authenticateWithPasskey == coroutineSingletons23 ? coroutineSingletons23 : authenticateWithPasskey;
            case 25:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object createShippingAddress = ((ShippingAddressService) ((CardLockPresenter) this.this$0).cardLockFlowTypeProvider).createShippingAddress((CreateShippingAddressRequest) obj3, this);
                    return createShippingAddress == coroutineSingletons24 ? coroutineSingletons24 : createShippingAddress;
                }
                if (i31 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object updateShippingAddress = ((ShippingAddressService) ((CardLockPresenter) this.this$0).cardLockFlowTypeProvider).updateShippingAddress((UpdateShippingAddressRequest) obj3, this);
                    return updateShippingAddress == coroutineSingletons25 ? coroutineSingletons25 : updateShippingAddress;
                }
                if (i32 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.this$0;
                BlockersScreens.SignatureScreen signatureScreen = (BlockersScreens.SignatureScreen) localHomePresenter.syncer;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 != 0) {
                    if (i33 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppService appService9 = (AppService) localHomePresenter.localHomeGeoPresenterFactory;
                ClientScenario clientScenario7 = signatureScreen.blockersData.clientScenario;
                clientScenario7.getClass();
                BlockersData blockersData4 = signatureScreen.blockersData;
                String str8 = blockersData4.flowToken;
                SetSignatureRequest setSignatureRequest = new SetSignatureRequest(blockersData4.requestContext, (ByteString) obj3, "image/png", ByteString.EMPTY);
                this.label = 1;
                Object signature = appService9.setSignature(clientScenario7, str8, setSignatureRequest, this);
                return signature == coroutineSingletons26 ? coroutineSingletons26 : signature;
            case 28:
                DisclosurePresenter disclosurePresenter3 = (DisclosurePresenter) this.this$0;
                DisclosureScreen disclosureScreen = (DisclosureScreen) disclosurePresenter3.args;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 != 0) {
                    if (i34 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppService appService10 = (AppService) disclosurePresenter3.appService;
                ClientScenario clientScenario8 = disclosureScreen.blockersData.clientScenario;
                clientScenario8.getClass();
                this.label = 1;
                Object confirmDisclosure = appService10.confirmDisclosure(clientScenario8, disclosureScreen.blockersData.flowToken, (ConfirmDisclosureRequest) obj3, this);
                return confirmDisclosure == coroutineSingletons27 ? coroutineSingletons27 : confirmDisclosure;
            default:
                CardScene cardScene = (CardScene) obj3;
                CardGeometry cardGeometry = (CardGeometry) this.this$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ReadonlyStateFlow readonlyStateFlow = cardGeometry.ready;
                    SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$5 = new SessionWorkerKt$runSession$5(i4, z6 ? 1 : 0, i4);
                    this.label = 1;
                    if (FlowKt.first(readonlyStateFlow, sessionWorkerKt$runSession$5, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                AABB aabb = cardGeometry.getAABB();
                float max = Math.max((aabb.maxX - aabb.minX) / 2.0f, Math.max((aabb.maxY - aabb.minY) / 2.0f, (aabb.maxZ - aabb.minZ) / 2.0f));
                float f = max > RecyclerView.DECELERATION_RATE ? 3.0f / (max * 2.0f) : 1.0f;
                cardScene.slotATransform.setScale(new Vector3(f, f, f));
                cardScene.slotBTransform.setScale(new Vector3(f, f, f));
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagingDataPresenter$collectFrom$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$pagingData = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagingDataPresenter$collectFrom$2(Object obj, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.$pagingData = obj;
    }
}
