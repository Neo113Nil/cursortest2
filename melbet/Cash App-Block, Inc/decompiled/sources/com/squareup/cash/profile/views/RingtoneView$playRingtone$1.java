package com.squareup.cash.profile.views;

import androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.treehouse.NavBarBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.PaidInBitcoinLandingPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.web.viewmodels.WebBlockerBridgeEvent;
import com.squareup.cash.borrow.presenters.CreditMultiStepLoadingBlockerPresenter;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.JsonFeatureFlags$PersonalizePaymentResourceConfig;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.payments.backend.api.PersonalizationRepository;
import com.squareup.cash.payments.presenters.PersonalizePaymentResourceRefresher;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.CreditMultiStepLoadPollingRequest;
import com.squareup.protos.franklin.app.CreditMultiStepLoadPollingResponse;
import com.stripe.android.view.PaymentAuthWebChromeClient;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.ByteString;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RingtoneView$playRingtone$1 extends SuspendLambda implements Function2 {
    public int $position;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RingtoneView$playRingtone$1(GLSceneScope gLSceneScope, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 10;
        this.this$0 = gLSceneScope;
        this.label = i;
        this.$position = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new RingtoneView$playRingtone$1(this.$position, (RingtoneView) obj2, continuation, 0);
            case 1:
                return new RingtoneView$playRingtone$1((DeferredCoroutine) obj2, this.$position, continuation, 1);
            case 2:
                return new RingtoneView$playRingtone$1((DeferredUseCaseCameraRequestControl) obj2, continuation, this.$position);
            case 3:
                return new RingtoneView$playRingtone$1((LazyLayoutSemanticsModifierNode) obj2, this.$position, continuation, 3);
            case 4:
                return new RingtoneView$playRingtone$1((AnchoredDraggableState) obj2, this.$position, continuation, 4);
            case 5:
                return new RingtoneView$playRingtone$1(this.$position, (Animatable) obj2, continuation, 5);
            case 6:
                return new RingtoneView$playRingtone$1((PaidInBitcoinLandingPresenter) obj2, this.$position, continuation, 6);
            case 7:
                return new RingtoneView$playRingtone$1((PaymentAuthWebChromeClient) obj2, this.$position, continuation, 7);
            case 8:
                return new RingtoneView$playRingtone$1((CreditMultiStepLoadingBlockerPresenter) obj2, continuation, 8);
            case 9:
                return new RingtoneView$playRingtone$1((Function3) obj2, this.$position, continuation, 9);
            case 10:
                return new RingtoneView$playRingtone$1((GLSceneScope) obj2, this.label, this.$position, continuation);
            case 11:
                return new RingtoneView$playRingtone$1((PersonalizePaymentResourceRefresher) obj2, continuation, 11);
            default:
                return new RingtoneView$playRingtone$1(this.$position, (ParcelableSnapshotMutableIntState) obj2, continuation, 12);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RingtoneView$playRingtone$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x02f0, code lost:
    
        if (r2 == r1) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
    
        if (((java.util.List) r2).isEmpty() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        if (r0.refreshPersonalizationResources(r15) != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
    
        if (r2 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        if (r4 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        if (r6 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016c, code lost:
    
        if (r5 == r3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a9, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r8, r15) == r3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014a, code lost:
    
        if (0 == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b4, code lost:
    
        if (com.squareup.cash.borrow.presenters.CreditMultiStepLoadingBlockerPresenter.access$finish(r7, r15) == r3) goto L83;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01a9 -> B:64:0x014a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object awaitInternal;
        int i;
        Object obj2;
        int i2;
        Object obj3;
        Object loadCachedBackgrounds;
        Object loadCachedStickers;
        int i3 = this.$r8$classId;
        Object obj4 = this.this$0;
        switch (i3) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    ShoppingWebBridge.AnonymousClass1 anonymousClass1 = new ShoppingWebBridge.AnonymousClass1(this.$position, (RingtoneView) obj4, (Continuation) null);
                    this.label = 1;
                    if (JobKt.withContext(defaultIoScheduler, anonymousClass1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                int i5 = this.$position;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    awaitInternal = ((DeferredCoroutine) obj4).awaitInternal(this);
                    break;
                } else if (i6 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    awaitInternal = obj;
                } else if (i6 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                List list = (List) awaitInternal;
                if (i5 < list.size()) {
                    Deferred deferred = (Deferred) list.get(i5);
                    this.label = 2;
                    Object await = deferred.await(this);
                    if (await != coroutineSingletons2) {
                        break;
                    }
                    break;
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Deferred mo33setTorchOffAsyncMtizInI = DeferredUseCaseCameraRequestControl.access$getOrCreateImpl((DeferredUseCaseCameraRequestControl) obj4).mo33setTorchOffAsyncMtizInI(this.$position);
                    this.label = 1;
                    Object awaitInternal2 = ((CompletableDeferredImpl) mo33setTorchOffAsyncMtizInI).awaitInternal(this);
                    if (awaitInternal2 == coroutineSingletons3) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LazyLayoutSemanticState lazyLayoutSemanticState = ((LazyLayoutSemanticsModifierNode) obj4).state;
                    int i9 = this.$position;
                    this.label = 1;
                    if (lazyLayoutSemanticState.scrollToItem(i9, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Integer num = new Integer(this.$position);
                    this.label = 1;
                    if (Draggable2DKt.animateTo$default((AnchoredDraggableState) obj4, num, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (this.$position > 0) {
                        Float f = new Float(RecyclerView.DECELERATION_RATE);
                        KeyframesSpec keyframes = AnimatableKt.keyframes(new NavBarBinding$$ExternalSyntheticLambda2(29));
                        this.label = 1;
                        if (Animatable.animateTo$default((Animatable) obj4, f, keyframes, null, null, this, 12) == coroutineSingletons6) {
                            break;
                        }
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaidInBitcoinLandingPresenter paidInBitcoinLandingPresenter = (PaidInBitcoinLandingPresenter) obj4;
                    boolean z = this.$position > 0;
                    this.label = 1;
                    if (PaidInBitcoinLandingPresenter.access$launchEditAllocation(paidInBitcoinLandingPresenter, z, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BufferedChannel bufferedChannel = (BufferedChannel) ((PaymentAuthWebChromeClient) obj4).activity;
                    WebBlockerBridgeEvent.ProgressUpdated progressUpdated = new WebBlockerBridgeEvent.ProgressUpdated(this.$position);
                    this.label = 1;
                    if (bufferedChannel.send(progressUpdated, this) == coroutineSingletons8) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 8:
                CreditMultiStepLoadingBlockerPresenter creditMultiStepLoadingBlockerPresenter = (CreditMultiStepLoadingBlockerPresenter) obj4;
                BlockersScreens.CreditMultiStepLoadingBlockerScreen creditMultiStepLoadingBlockerScreen = creditMultiStepLoadingBlockerPresenter.args;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.$position;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    i = 0;
                } else if (i14 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    obj2 = obj;
                    ApiResult apiResult = (ApiResult) obj2;
                    if (!(apiResult instanceof ApiResult.Success) || ((CreditMultiStepLoadPollingResponse) ((ApiResult.Success) apiResult).response).status != CreditMultiStepLoadPollingResponse.Status.FINISHED) {
                        i = 0;
                        break;
                    } else {
                        i = 1;
                        if (1 == 0) {
                            Long l = creditMultiStepLoadingBlockerScreen.data.polling_period;
                            l.getClass();
                            long longValue = l.longValue();
                            Timber.Forest.v("Polling delay: %dms", new Long(longValue));
                            this.label = 1;
                            this.$position = 2;
                            break;
                        }
                    }
                } else if (i14 == 2) {
                    i = this.label;
                    SafeTrace.throwOnFailure(obj);
                } else if (i14 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                if (i != 0) {
                    this.label = i;
                    this.$position = 3;
                    break;
                } else {
                    AppService appService = creditMultiStepLoadingBlockerPresenter.appService;
                    ClientScenario clientScenario = creditMultiStepLoadingBlockerScreen.blockersData.clientScenario;
                    clientScenario.getClass();
                    String str = creditMultiStepLoadingBlockerScreen.blockersData.flowToken;
                    CreditMultiStepLoadPollingRequest creditMultiStepLoadPollingRequest = new CreditMultiStepLoadPollingRequest(creditMultiStepLoadingBlockerScreen.blockersData.requestContext, ByteString.EMPTY);
                    this.label = i;
                    this.$position = 1;
                    obj2 = appService.creditMultiStepPoll(clientScenario, str, creditMultiStepLoadPollingRequest, this);
                    break;
                }
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Integer num2 = new Integer(this.$position + 1);
                    Integer num3 = new Integer(4);
                    this.label = 1;
                    if (((Function3) obj4).invoke(num2, num3, this) == coroutineSingletons10) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((GLSceneScope) obj4)._screenSize.setValue(new IntSize((this.label << 32) | (this.$position & BodyPartID.bodyIdMax)));
                break;
            case 11:
                PersonalizePaymentResourceRefresher personalizePaymentResourceRefresher = (PersonalizePaymentResourceRefresher) obj4;
                PersonalizationRepository personalizationRepository = personalizePaymentResourceRefresher.personalizationRepository;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.$position;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    i2 = ((JsonFeatureFlags$PersonalizePaymentResourceConfig.ResourceConfigVersion) ((FeatureFlag$JsonFeatureFlag.Options) ((RealFeatureFlagManager) personalizePaymentResourceRefresher.featureFlagManager).peekCurrentValue(JsonFeatureFlags$PersonalizePaymentResourceConfig.INSTANCE)).value).version;
                    KeyValue keyValue = personalizePaymentResourceRefresher.personalizePaymentResourceVersion;
                    this.label = i2;
                    this.$position = 1;
                    obj3 = keyValue.get(this);
                    break;
                } else if (i16 == 1) {
                    i2 = this.label;
                    SafeTrace.throwOnFailure(obj);
                    obj3 = obj;
                } else if (i16 == 2) {
                    int i17 = this.label;
                    SafeTrace.throwOnFailure(obj);
                    i2 = i17;
                    loadCachedBackgrounds = obj;
                    if (!((List) loadCachedBackgrounds).isEmpty()) {
                        this.label = i2;
                        this.$position = 3;
                        loadCachedStickers = personalizationRepository.loadCachedStickers(this);
                        break;
                    }
                    this.label = i2;
                    this.$position = 4;
                    break;
                } else if (i16 == 3) {
                    int i18 = this.label;
                    SafeTrace.throwOnFailure(obj);
                    i2 = i18;
                    loadCachedStickers = obj;
                    break;
                } else if (i16 != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                if (((Number) obj3).intValue() == i2) {
                    this.label = i2;
                    this.$position = 2;
                    loadCachedBackgrounds = personalizationRepository.loadCachedBackgrounds(this);
                    break;
                }
                this.label = i2;
                this.$position = 4;
            default:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (JobKt.delay(500L, this) == coroutineSingletons13) {
                        break;
                    }
                } else if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ((ParcelableSnapshotMutableIntState) obj4).setIntValue(this.$position);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RingtoneView$playRingtone$1(DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.this$0 = deferredUseCaseCameraRequestControl;
        this.$position = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RingtoneView$playRingtone$1(int i, Object obj, Continuation continuation, int i2) {
        super(2, continuation);
        this.$r8$classId = i2;
        this.$position = i;
        this.this$0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RingtoneView$playRingtone$1(Object obj, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.$r8$classId = i2;
        this.this$0 = obj;
        this.$position = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RingtoneView$playRingtone$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
