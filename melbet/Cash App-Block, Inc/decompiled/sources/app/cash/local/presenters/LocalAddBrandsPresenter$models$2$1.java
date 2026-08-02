package app.cash.local.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.api.ApiResult;
import app.cash.local.primitives.BrandToken;
import app.cash.local.screens.app.LocalAddBrandsScreen;
import app.cash.local.service.LocalService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.caverock.androidsvg.SVG;
import com.squareup.cash.RealBugReportSender$submitBugReport$2;
import com.squareup.cash.bitcoin.navigation.BitcoinInboundNavigator;
import com.squareup.cash.bitcoin.presenters.applet.stackingtools.BitcoinStackingToolsPresenter;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.navigation.RealPaidInBitcoinNavigator;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationPresenter;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.cdf.localclient.LocalClientTabAdd;
import com.squareup.cash.cdf.localclient.LocalClientTabRemove;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.payments.presenters.RealPaymentConfigurationRouter;
import com.squareup.cash.screens.Back;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.protos.cash.local.client.app.v1.BulkUpdateBrandsRequest;
import com.squareup.protos.cash.local.client.app.v1.BulkUpdateBrandsResponse;
import com.squareup.protos.franklin.api.PaymentCardGlobalConfig;
import com.squareup.protos.franklin.common.RequestContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LocalAddBrandsPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $addRequests;
    public final /* synthetic */ Object $addTokens;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object $removeRequests;
    public final /* synthetic */ Object $removeTokens;
    public final /* synthetic */ Object $workingAsync$delegate;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public MutableState L$3;
    public Object L$5;
    public Object L$6;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAddBrandsPresenter$models$2$1(Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, CardRegistry.SharedCardTransitionState sharedCardTransitionState, CardWobbleState cardWobbleState, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, CardScene cardScene, Continuation continuation) {
        super(2, continuation);
        this.L$0 = function1;
        this.L$3 = mutableState;
        this.$workingAsync$delegate = mutableState2;
        this.this$0 = mutableState3;
        this.L$1 = sharedCardTransitionState;
        this.$addTokens = cardWobbleState;
        this.L$2 = mutableState4;
        this.$removeTokens = mutableState5;
        this.L$5 = mutableState6;
        this.L$6 = mutableState7;
        this.$addRequests = mutableState8;
        this.$removeRequests = cardScene;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$removeRequests;
        Object obj3 = this.$addRequests;
        Object obj4 = this.$removeTokens;
        Object obj5 = this.$workingAsync$delegate;
        Object obj6 = this.$addTokens;
        Object obj7 = this.this$0;
        switch (i) {
            case 0:
                return new LocalAddBrandsPresenter$models$2$1((LocalAddBrandsPresenter) obj7, (ArrayList) obj3, (ArrayList) obj2, (List) obj6, (LinkedHashSet) obj4, (MutableState) obj5, continuation);
            case 1:
                LocalAddBrandsPresenter$models$2$1 localAddBrandsPresenter$models$2$1 = new LocalAddBrandsPresenter$models$2$1((Flow) obj7, continuation, (BitcoinStackingToolsPresenter) this.L$1, (BetterNavigator.ScreenNavigator) obj6, (BitcoinInboundNavigator) this.L$2, (State) obj4, (RealPaidInBitcoinNavigator) obj5, this.L$3, (State) this.L$5, (RealRouter) this.L$6, (State) obj3, (State) obj2);
                localAddBrandsPresenter$models$2$1.L$0 = obj;
                return localAddBrandsPresenter$models$2$1;
            case 2:
                LocalAddBrandsPresenter$models$2$1 localAddBrandsPresenter$models$2$12 = new LocalAddBrandsPresenter$models$2$1((Flow) obj7, continuation, (PaymentDeviceCustomizationPresenter) obj6, (List) this.L$1, this.L$3, (MutableState) obj5, (MutableState) this.L$2, (MutableState) obj4, (MutableState) this.L$5, (PaymentCardGlobalConfig) this.L$6, (MutableState) obj3, (State) obj2);
                localAddBrandsPresenter$models$2$12.L$0 = obj;
                return localAddBrandsPresenter$models$2$12;
            case 3:
                LocalAddBrandsPresenter$models$2$1 localAddBrandsPresenter$models$2$13 = new LocalAddBrandsPresenter$models$2$1((Flow) obj7, continuation, (PaymentConfigurationPresenter) this.L$1, (MutableStateFlow) obj6, this.L$3, (MutableState) obj5, (RealPaymentConfigurationRouter) this.L$2, (CoroutineScope) obj4, (State) this.L$5, (State) this.L$6, (State) obj3, (Set) obj2);
                localAddBrandsPresenter$models$2$13.L$0 = obj;
                return localAddBrandsPresenter$models$2$13;
            case 4:
                return new LocalAddBrandsPresenter$models$2$1((Function1) this.L$0, this.L$3, (MutableState) obj5, (MutableState) obj7, (CardRegistry.SharedCardTransitionState) this.L$1, (CardWobbleState) obj6, (MutableState) this.L$2, (MutableState) obj4, (MutableState) this.L$5, (MutableState) this.L$6, (MutableState) obj3, (CardScene) obj2, continuation);
            default:
                LocalAddBrandsPresenter$models$2$1 localAddBrandsPresenter$models$2$14 = new LocalAddBrandsPresenter$models$2$1((Flow) obj7, continuation, (CardLockPresenter) this.L$1, (CoroutineScope) obj6, (SellerCardViewModel) this.L$2, this.L$3, (MutableState) obj5, (MutableState) obj4, (MutableState) this.L$5, (MutableState) this.L$6, (MutableState) obj3, (MutableState) obj2);
                localAddBrandsPresenter$models$2$14.L$0 = obj;
                return localAddBrandsPresenter$models$2$14;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((LocalAddBrandsPresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f9, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r7, r11, r24) == r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LocalAddBrandsPresenter localAddBrandsPresenter;
        LinkedHashSet linkedHashSet;
        Object bulkUpdateBrands;
        MutableState mutableState;
        List list;
        SVG svg;
        String str;
        int i = this.$r8$classId;
        Object obj2 = this.$removeRequests;
        Object obj3 = this.$addRequests;
        Object obj4 = this.$removeTokens;
        Object obj5 = this.$workingAsync$delegate;
        Object obj6 = this.$addTokens;
        Object obj7 = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    localAddBrandsPresenter = (LocalAddBrandsPresenter) obj7;
                    SVG svg2 = localAddBrandsPresenter.responseContextHandler;
                    List list2 = (List) obj6;
                    linkedHashSet = (LinkedHashSet) obj4;
                    MutableState mutableState2 = (MutableState) obj5;
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    LocalService localService = localAddBrandsPresenter.service;
                    BulkUpdateBrandsRequest bulkUpdateBrandsRequest = new BulkUpdateBrandsRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), (ArrayList) obj3, (ArrayList) obj2, ByteString.EMPTY);
                    this.L$0 = localAddBrandsPresenter;
                    this.L$1 = list2;
                    this.L$2 = linkedHashSet;
                    this.L$3 = mutableState2;
                    this.L$5 = generateToken;
                    this.L$6 = svg2;
                    this.label = 1;
                    bulkUpdateBrands = localService.bulkUpdateBrands(generateToken, bulkUpdateBrandsRequest, this);
                    if (bulkUpdateBrands == coroutineSingletons) {
                        break;
                    } else {
                        mutableState = mutableState2;
                        list = list2;
                        svg = svg2;
                        str = generateToken;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    svg = (SVG) this.L$6;
                    str = (String) this.L$5;
                    mutableState = this.L$3;
                    linkedHashSet = (LinkedHashSet) this.L$2;
                    list = (List) this.L$1;
                    LocalAddBrandsPresenter localAddBrandsPresenter2 = (LocalAddBrandsPresenter) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    localAddBrandsPresenter = localAddBrandsPresenter2;
                    bulkUpdateBrands = obj;
                }
                BulkUpdateBrandsResponse bulkUpdateBrandsResponse = (BulkUpdateBrandsResponse) svg.handle((ApiResult) bulkUpdateBrands, str, LocalAddBrandsScreen.INSTANCE);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    localAddBrandsPresenter.analytics.track(new LocalClientTabAdd(((BrandToken) it.next()).value), null);
                }
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    localAddBrandsPresenter.analytics.track(new LocalClientTabRemove(((BrandToken) it2.next()).value), null);
                }
                if (bulkUpdateBrandsResponse != null) {
                    localAddBrandsPresenter.navigator.goTo(Back.INSTANCE);
                }
                WorkLauncherImpl workLauncherImpl = LocalAddBrandsPresenter.brandTokenListSaver;
                mutableState.setValue(Boolean.FALSE);
                break;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentConfigurationPresenter$models$$inlined$CollectEffect$1$1 paymentConfigurationPresenter$models$$inlined$CollectEffect$1$1 = new PaymentConfigurationPresenter$models$$inlined$CollectEffect$1$1(coroutineScope, (BitcoinStackingToolsPresenter) this.L$1, (BetterNavigator.ScreenNavigator) obj6, (BitcoinInboundNavigator) this.L$2, (State) obj4, (RealPaidInBitcoinNavigator) obj5, this.L$3, (State) this.L$5, (RealRouter) this.L$6, (State) obj3, (State) obj2);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj7).collect(paymentConfigurationPresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentConfigurationPresenter$models$$inlined$CollectEffect$1$1 paymentConfigurationPresenter$models$$inlined$CollectEffect$1$12 = new PaymentConfigurationPresenter$models$$inlined$CollectEffect$1$1(coroutineScope2, (PaymentDeviceCustomizationPresenter) obj6, (List) this.L$1, this.L$3, (MutableState) obj5, (MutableState) this.L$2, (MutableState) obj4, (MutableState) this.L$5, (PaymentCardGlobalConfig) this.L$6, (MutableState) obj3, (State) obj2);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj7).collect(paymentConfigurationPresenter$models$$inlined$CollectEffect$1$12, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentConfigurationPresenter$models$$inlined$CollectEffect$1$1 paymentConfigurationPresenter$models$$inlined$CollectEffect$1$13 = new PaymentConfigurationPresenter$models$$inlined$CollectEffect$1$1(coroutineScope3, (PaymentConfigurationPresenter) this.L$1, (MutableStateFlow) obj6, this.L$3, (MutableState) obj5, (RealPaymentConfigurationRouter) this.L$2, (CoroutineScope) obj4, (State) this.L$5, (State) this.L$6, (State) obj3, (Set) obj2);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj7).collect(paymentConfigurationPresenter$models$$inlined$CollectEffect$1$13, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                MutableState mutableState3 = (MutableState) obj5;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                int i7 = 17;
                try {
                } catch (Exception e) {
                    ((Function1) this.L$0).invoke(e);
                }
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState4 = this.L$3;
                    Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                    if (((CardRegistry.SharedCardTransitionState) mutableState4.getValue()) != null) {
                        HeroCardViewKt$Render$1$8$1.AnonymousClass3 anonymousClass3 = new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState3, continuation, i7);
                        this.label = 1;
                        if (JobKt.withTimeoutOrNull(400L, anonymousClass3, this) == coroutineSingletons5) {
                            break;
                        }
                    }
                } else if (i6 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i6 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                ref$BooleanRef.element = true;
                SafeFlow snapshotFlow = Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(i7, (MutableState) obj7));
                RealBugReportSender$submitBugReport$2 realBugReportSender$submitBugReport$2 = new RealBugReportSender$submitBugReport$2((CardRegistry.SharedCardTransitionState) this.L$1, (CardWobbleState) obj6, mutableState3, (MutableState) this.L$2, (MutableState) obj4, (MutableState) this.L$5, (MutableState) this.L$6, (MutableState) obj3, (CardScene) obj2, ref$BooleanRef, (Continuation) null);
                this.label = 2;
                break;
            default:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShoppingWebPresenter$models$$inlined$CollectEffect$1$1 shoppingWebPresenter$models$$inlined$CollectEffect$1$1 = new ShoppingWebPresenter$models$$inlined$CollectEffect$1$1(coroutineScope4, (CardLockPresenter) this.L$1, (CoroutineScope) obj6, (SellerCardViewModel) this.L$2, this.L$3, (MutableState) obj5, (MutableState) obj4, (MutableState) this.L$5, (MutableState) this.L$6, (MutableState) obj3, (MutableState) obj2);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj7).collect(shoppingWebPresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAddBrandsPresenter$models$2$1(LocalAddBrandsPresenter localAddBrandsPresenter, ArrayList arrayList, ArrayList arrayList2, List list, LinkedHashSet linkedHashSet, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = localAddBrandsPresenter;
        this.$addRequests = arrayList;
        this.$removeRequests = arrayList2;
        this.$addTokens = list;
        this.$removeTokens = linkedHashSet;
        this.$workingAsync$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAddBrandsPresenter$models$2$1(Flow flow, Continuation continuation, BitcoinStackingToolsPresenter bitcoinStackingToolsPresenter, BetterNavigator.ScreenNavigator screenNavigator, BitcoinInboundNavigator bitcoinInboundNavigator, State state, RealPaidInBitcoinNavigator realPaidInBitcoinNavigator, MutableState mutableState, State state2, RealRouter realRouter, State state3, State state4) {
        super(2, continuation);
        this.this$0 = flow;
        this.L$1 = bitcoinStackingToolsPresenter;
        this.$addTokens = screenNavigator;
        this.L$2 = bitcoinInboundNavigator;
        this.$removeTokens = state;
        this.$workingAsync$delegate = realPaidInBitcoinNavigator;
        this.L$3 = mutableState;
        this.L$5 = state2;
        this.L$6 = realRouter;
        this.$addRequests = state3;
        this.$removeRequests = state4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAddBrandsPresenter$models$2$1(Flow flow, Continuation continuation, PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter, List list, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, PaymentCardGlobalConfig paymentCardGlobalConfig, MutableState mutableState6, State state) {
        super(2, continuation);
        this.this$0 = flow;
        this.$addTokens = paymentDeviceCustomizationPresenter;
        this.L$1 = list;
        this.L$3 = mutableState;
        this.$workingAsync$delegate = mutableState2;
        this.L$2 = mutableState3;
        this.$removeTokens = mutableState4;
        this.L$5 = mutableState5;
        this.L$6 = paymentCardGlobalConfig;
        this.$addRequests = mutableState6;
        this.$removeRequests = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAddBrandsPresenter$models$2$1(Flow flow, Continuation continuation, PaymentConfigurationPresenter paymentConfigurationPresenter, MutableStateFlow mutableStateFlow, MutableState mutableState, MutableState mutableState2, RealPaymentConfigurationRouter realPaymentConfigurationRouter, CoroutineScope coroutineScope, State state, State state2, State state3, Set set) {
        super(2, continuation);
        this.this$0 = flow;
        this.L$1 = paymentConfigurationPresenter;
        this.$addTokens = mutableStateFlow;
        this.L$3 = mutableState;
        this.$workingAsync$delegate = mutableState2;
        this.L$2 = realPaymentConfigurationRouter;
        this.$removeTokens = coroutineScope;
        this.L$5 = state;
        this.L$6 = state2;
        this.$addRequests = state3;
        this.$removeRequests = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAddBrandsPresenter$models$2$1(Flow flow, Continuation continuation, CardLockPresenter cardLockPresenter, CoroutineScope coroutineScope, SellerCardViewModel sellerCardViewModel, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        super(2, continuation);
        this.this$0 = flow;
        this.L$1 = cardLockPresenter;
        this.$addTokens = coroutineScope;
        this.L$2 = sellerCardViewModel;
        this.L$3 = mutableState;
        this.$workingAsync$delegate = mutableState2;
        this.$removeTokens = mutableState3;
        this.L$5 = mutableState4;
        this.L$6 = mutableState5;
        this.$addRequests = mutableState6;
        this.$removeRequests = mutableState7;
    }
}
