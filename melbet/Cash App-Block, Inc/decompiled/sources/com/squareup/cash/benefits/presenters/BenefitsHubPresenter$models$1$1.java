package com.squareup.cash.benefits.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.material.SwipeableState$animateTo$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.RotateKt;
import androidx.webkit.internal.WebViewGlueCommunicator;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import com.fillr.e0;
import com.fillr.n;
import com.google.zxing.Result;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.activity.views.ActivityTabViewKt$ActivityTab$5$1$3;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayMerchantRepo;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellSheetViewModel;
import com.squareup.cash.agents.applets.presenters.RealAgentsRepository;
import com.squareup.cash.appintro.presenters.SponsorshipRequestReferralIntroPresenter;
import com.squareup.cash.appmessages.TooltipAppMessageViewModel;
import com.squareup.cash.appmessages.views.TooltipAppMessageView;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphModelProvider;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$models$2$1$1;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter;
import com.squareup.cash.bitcoin.presenters.RealBitcoinKeypadStateStore;
import com.squareup.cash.bitcoin.presenters.applet.BitcoinHomePresenter;
import com.squareup.cash.bitcoin.presenters.applet.stackingtools.BitcoinStackingToolsPresenter;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinWidgetPluginProvider;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.PaidInBitcoinState;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.navigation.RealPaidInBitcoinNavigator;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeState;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.blockers.presenters.SsnPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.crypto.CryptoStackStart;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.growtools.presenters.manager.state.RealGrowToolsManagerViewAppearanceTracker;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.session.backend.AuthenticatedState;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.transfers.presenters.LinkedAccountsPresenter;
import com.squareup.cash.util.money.RealCurrencyConverter;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken$Token$MerchantToken;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.sync.MutexImpl;
import papa.SafeTrace;
import squareup.cash.earnings.EarningsTimeFrame;

/* loaded from: classes5.dex */
public final class BenefitsHubPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $explanationScreen$delegate;
    public final /* synthetic */ int $r8$classId;
    public Object $retryKey$delegate;
    public Object $viewModel$delegate;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsHubPresenter$models$1$1(TooltipAppMessageView tooltipAppMessageView, ElementBoundsRegistry.Element element, TooltipAppMessageViewModel.Ready ready, TooltipAppMessageViewModel.Ready.ArrowPosition arrowPosition, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 10;
        this.$retryKey$delegate = tooltipAppMessageView;
        this.$viewModel$delegate = element;
        this.$explanationScreen$delegate = ready;
        this.this$0 = arrowPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$explanationScreen$delegate;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                return new BenefitsHubPresenter$models$1$1((MutableState) this.$retryKey$delegate, (LocalPosCheckInPresenter) obj3, (MutableState) this.$viewModel$delegate, (MutableState) obj2, continuation);
            case 1:
                return new BenefitsHubPresenter$models$1$1((RealAfterpayMerchantRepo) obj2, (EngagedItemToken) obj3, continuation, 1);
            case 2:
                int i2 = 2;
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$1 = new BenefitsHubPresenter$models$1$1(i2, (MutableState) this.$retryKey$delegate, (Flow) obj2, (AfterpayAppletHomePresenter) obj3, continuation);
                benefitsHubPresenter$models$1$1.$viewModel$delegate = obj;
                return benefitsHubPresenter$models$1$1;
            case 3:
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$12 = new BenefitsHubPresenter$models$1$1((Flow) this.$viewModel$delegate, continuation, (LocalHomePresenter) obj2, (Function1) obj3, 3);
                benefitsHubPresenter$models$1$12.$retryKey$delegate = obj;
                return benefitsHubPresenter$models$1$12;
            case 4:
                int i3 = 4;
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$13 = new BenefitsHubPresenter$models$1$1(i3, (MutableState) this.$retryKey$delegate, (Flow) obj2, (PoolsListPresenter) obj3, continuation);
                benefitsHubPresenter$models$1$13.$viewModel$delegate = obj;
                return benefitsHubPresenter$models$1$13;
            case 5:
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$14 = new BenefitsHubPresenter$models$1$1((Flow) this.$viewModel$delegate, continuation, (DisclosurePresenter) obj2, (AfterpayAppletUpsellSheetViewModel) obj3, 5);
                benefitsHubPresenter$models$1$14.$retryKey$delegate = obj;
                return benefitsHubPresenter$models$1$14;
            case 6:
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$15 = new BenefitsHubPresenter$models$1$1((Flow) this.$viewModel$delegate, continuation, (EndAppLockPresenter) obj2, (State) obj3, 6);
                benefitsHubPresenter$models$1$15.$retryKey$delegate = obj;
                return benefitsHubPresenter$models$1$15;
            case 7:
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$16 = new BenefitsHubPresenter$models$1$1((SessionState) obj2, (RealAgentsRepository) obj3, continuation, 7);
                benefitsHubPresenter$models$1$16.$viewModel$delegate = obj;
                return benefitsHubPresenter$models$1$16;
            case 8:
                int i4 = 8;
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$17 = new BenefitsHubPresenter$models$1$1(i4, (MutableState) this.$retryKey$delegate, (Flow) obj2, (SponsorshipRequestReferralIntroPresenter) obj3, continuation);
                benefitsHubPresenter$models$1$17.$viewModel$delegate = obj;
                return benefitsHubPresenter$models$1$17;
            case 9:
                int i5 = 9;
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$18 = new BenefitsHubPresenter$models$1$1(i5, (MutableState) this.$retryKey$delegate, (Flow) obj2, (LocalCashBalancePresenter) obj3, continuation);
                benefitsHubPresenter$models$1$18.$viewModel$delegate = obj;
                return benefitsHubPresenter$models$1$18;
            case 10:
                return new BenefitsHubPresenter$models$1$1((TooltipAppMessageView) this.$retryKey$delegate, (ElementBoundsRegistry.Element) this.$viewModel$delegate, (TooltipAppMessageViewModel.Ready) obj2, (TooltipAppMessageViewModel.Ready.ArrowPosition) obj3, continuation);
            case 11:
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$19 = new BenefitsHubPresenter$models$1$1((Flow) this.$viewModel$delegate, continuation, (TransfersPresenter) obj2, (State) obj3, 11);
                benefitsHubPresenter$models$1$19.$retryKey$delegate = obj;
                return benefitsHubPresenter$models$1$19;
            case 12:
                int i6 = 12;
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$110 = new BenefitsHubPresenter$models$1$1(i6, (MutableState) this.$retryKey$delegate, (Flow) obj2, (LocalHomePresenter) obj3, continuation);
                benefitsHubPresenter$models$1$110.$viewModel$delegate = obj;
                return benefitsHubPresenter$models$1$110;
            case 13:
                int i7 = 13;
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$111 = new BenefitsHubPresenter$models$1$1(i7, (MutableState) this.$retryKey$delegate, (Flow) obj2, (LinkedAccountsPresenter) obj3, continuation);
                benefitsHubPresenter$models$1$111.$viewModel$delegate = obj;
                return benefitsHubPresenter$models$1$111;
            case 14:
                int i8 = 14;
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$112 = new BenefitsHubPresenter$models$1$1(i8, (MutableState) this.$retryKey$delegate, (Flow) obj2, (BankingBenefitsBookletPresenter) obj3, continuation);
                benefitsHubPresenter$models$1$112.$viewModel$delegate = obj;
                return benefitsHubPresenter$models$1$112;
            case 15:
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$113 = new BenefitsHubPresenter$models$1$1((Flow) this.$viewModel$delegate, continuation, (LocalPosCheckInPresenter) obj2, (State) obj3, 15);
                benefitsHubPresenter$models$1$113.$retryKey$delegate = obj;
                return benefitsHubPresenter$models$1$113;
            case 16:
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$114 = new BenefitsHubPresenter$models$1$1((CallbackFlowBuilder) this.$viewModel$delegate, continuation, (Ref$IntRef) obj2, (Function1) obj3, 16);
                benefitsHubPresenter$models$1$114.$retryKey$delegate = obj;
                return benefitsHubPresenter$models$1$114;
            case 17:
                int i9 = 17;
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$115 = new BenefitsHubPresenter$models$1$1(i9, (MutableState) this.$retryKey$delegate, (Flow) obj2, (ErrorPresenter) obj3, continuation);
                benefitsHubPresenter$models$1$115.$viewModel$delegate = obj;
                return benefitsHubPresenter$models$1$115;
            case 18:
                int i10 = 18;
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$116 = new BenefitsHubPresenter$models$1$1(i10, (MutableState) this.$retryKey$delegate, this.$explanationScreen$delegate, (ErrorPresenter) obj3, continuation);
                benefitsHubPresenter$models$1$116.$viewModel$delegate = obj;
                return benefitsHubPresenter$models$1$116;
            case 19:
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$117 = new BenefitsHubPresenter$models$1$1((Flow) this.$viewModel$delegate, continuation, (CardStudioPresenter) obj2, (State) obj3, 19);
                benefitsHubPresenter$models$1$117.$retryKey$delegate = obj;
                return benefitsHubPresenter$models$1$117;
            case 20:
                int i11 = 20;
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$118 = new BenefitsHubPresenter$models$1$1(i11, (MutableState) this.$retryKey$delegate, (Flow) obj2, (RealBitcoinAmountPickerPresenter) obj3, continuation);
                benefitsHubPresenter$models$1$118.$viewModel$delegate = obj;
                return benefitsHubPresenter$models$1$118;
            case 21:
                int i12 = 21;
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$119 = new BenefitsHubPresenter$models$1$1(i12, (MutableState) this.$retryKey$delegate, (Flow) obj2, (RealBitcoinKeypadStateStore) obj3, continuation);
                benefitsHubPresenter$models$1$119.$viewModel$delegate = obj;
                return benefitsHubPresenter$models$1$119;
            case 22:
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$120 = new BenefitsHubPresenter$models$1$1((BitcoinHomePresenter) obj2, (BitcoinHomeState) obj3, continuation, 22);
                benefitsHubPresenter$models$1$120.$viewModel$delegate = obj;
                return benefitsHubPresenter$models$1$120;
            case 23:
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$121 = new BenefitsHubPresenter$models$1$1((Flow) this.$viewModel$delegate, continuation, (n) obj2, (BetterNavigator.ScreenNavigator) obj3, 23);
                benefitsHubPresenter$models$1$121.$retryKey$delegate = obj;
                return benefitsHubPresenter$models$1$121;
            case 24:
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$122 = new BenefitsHubPresenter$models$1$1((RealCurrencyConverter) obj2, (Money) obj3, continuation, (MutableState) this.$retryKey$delegate);
                benefitsHubPresenter$models$1$122.$viewModel$delegate = obj;
                return benefitsHubPresenter$models$1$122;
            case 25:
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$123 = new BenefitsHubPresenter$models$1$1((Flow) this.$viewModel$delegate, continuation, (BetterNavigator.ScreenNavigator) obj2, (Result) obj3, 25);
                benefitsHubPresenter$models$1$123.$retryKey$delegate = obj;
                return benefitsHubPresenter$models$1$123;
            case 26:
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$124 = new BenefitsHubPresenter$models$1$1((Flow) this.$viewModel$delegate, continuation, (com.miteksystems.misnap.camera.a.n) obj2, (BetterNavigator.ScreenNavigator) obj3, 26);
                benefitsHubPresenter$models$1$124.$retryKey$delegate = obj;
                return benefitsHubPresenter$models$1$124;
            case 27:
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$125 = new BenefitsHubPresenter$models$1$1((Flow) this.$viewModel$delegate, continuation, (com.miteksystems.misnap.camera.a.n) obj2, (BetterNavigator.ScreenNavigator) obj3, 27);
                benefitsHubPresenter$models$1$125.$retryKey$delegate = obj;
                return benefitsHubPresenter$models$1$125;
            case 28:
                BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$126 = new BenefitsHubPresenter$models$1$1((Flow) this.$viewModel$delegate, continuation, (e0) obj2, (BetterNavigator.ScreenNavigator) obj3, 28);
                benefitsHubPresenter$models$1$126.$retryKey$delegate = obj;
                return benefitsHubPresenter$models$1$126;
            default:
                return new BenefitsHubPresenter$models$1$1((BetterNavigator.ScreenNavigator) this.$viewModel$delegate, (RealPaidInBitcoinNavigator) obj2, (BitcoinStackingToolsPresenter) obj3, (MutableState) this.$retryKey$delegate, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 10:
                ((BenefitsHubPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((BenefitsHubPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:277:0x051e, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0511, code lost:
    
        if (r15 == r1) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x04ee, code lost:
    
        if (r0.emit(com.squareup.cash.agents.applets.presenters.AgentsState.Loading.INSTANCE, r14) == r1) goto L247;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutexImpl mutexImpl;
        int i = this.$r8$classId;
        int i2 = 20;
        int i3 = 22;
        int i4 = 23;
        int i5 = 24;
        int i6 = 25;
        int i7 = 2;
        int i8 = 18;
        int i9 = 19;
        Object obj2 = this.this$0;
        Object obj3 = this.$explanationScreen$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new TabContentViewKt$$ExternalSyntheticLambda1(i8, (MutableState) this.$retryKey$delegate));
                    SwipeableState$animateTo$2 swipeableState$animateTo$2 = new SwipeableState$animateTo$2(i5, (LocalPosCheckInPresenter) obj2, (MutableState) this.$viewModel$delegate, (MutableState) obj3);
                    this.label = 1;
                    if (snapshotFlow.collect(swipeableState$animateTo$2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                EngagedItemToken engagedItemToken = (EngagedItemToken) obj2;
                RealAfterpayMerchantRepo realAfterpayMerchantRepo = (RealAfterpayMerchantRepo) obj3;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SessionQueries sessionQueries = realAfterpayMerchantRepo.queries;
                    String access$getDatabaseToken = EarningsTimeFrame.TimeFrame.access$getDatabaseToken(engagedItemToken);
                    access$getDatabaseToken.getClass();
                    Long l = new Long(realAfterpayMerchantRepo.clock.millis());
                    Boolean valueOf = Boolean.valueOf(engagedItemToken.token instanceof EngagedItemToken$Token$MerchantToken);
                    sessionQueries.getClass();
                    sessionQueries.driver.execute(1863673661, "INSERT OR REPLACE INTO afterpayRecentlyViewedMerchant (token, last_updated_at_ms,  is_merchant_token)\nVALUES (?, ?,  ?)", new UtilsKt$$ExternalSyntheticLambda0(18, access$getDatabaseToken, l, valueOf));
                    sessionQueries.notifyQueries(1863673661, new ActivityTabViewKt$$ExternalSyntheticLambda17(i2));
                    MutexImpl mutexImpl2 = realAfterpayMerchantRepo.emptyQueryParamsMutex;
                    this.$retryKey$delegate = mutexImpl2;
                    this.$viewModel$delegate = realAfterpayMerchantRepo;
                    this.label = 1;
                    if (mutexImpl2.lock(this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    mutexImpl = mutexImpl2;
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    realAfterpayMerchantRepo = (RealAfterpayMerchantRepo) this.$viewModel$delegate;
                    mutexImpl = (MutexImpl) this.$retryKey$delegate;
                    SafeTrace.throwOnFailure(obj);
                }
                try {
                    realAfterpayMerchantRepo.emptyQueryParamsResponse = null;
                    mutexImpl.unlock(null);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    mutexImpl.unlock(null);
                    throw th;
                }
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) this.$viewModel$delegate;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SwipeableState$animateTo$2 swipeableState$animateTo$22 = new SwipeableState$animateTo$2(14, coroutineScope, (AfterpayAppletHomePresenter) obj2, (MutableState) this.$retryKey$delegate);
                    this.$viewModel$delegate = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(swipeableState$animateTo$22, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.$retryKey$delegate;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$viewModel$delegate;
                    SwipeableState$animateTo$2 swipeableState$animateTo$23 = new SwipeableState$animateTo$2(15, coroutineScope2, (LocalHomePresenter) obj3, (Function1) obj2);
                    this.$retryKey$delegate = null;
                    this.label = 1;
                    if (flow.collect(swipeableState$animateTo$23, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$viewModel$delegate;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SwipeableState$animateTo$2 swipeableState$animateTo$24 = new SwipeableState$animateTo$2(16, coroutineScope3, (PoolsListPresenter) obj2, (MutableState) this.$retryKey$delegate);
                    this.$viewModel$delegate = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(swipeableState$animateTo$24, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.$retryKey$delegate;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$viewModel$delegate;
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$3 = new ActivityTabViewKt$ActivityTab$5$1$3(coroutineScope4, (DisclosurePresenter) obj3, (AfterpayAppletUpsellSheetViewModel) obj2, 10);
                    this.$retryKey$delegate = null;
                    this.label = 1;
                    if (flow2.collect(activityTabViewKt$ActivityTab$5$1$3, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.$retryKey$delegate;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$viewModel$delegate;
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$32 = new ActivityTabViewKt$ActivityTab$5$1$3(coroutineScope5, (EndAppLockPresenter) obj3, (State) obj2, 12);
                    this.$retryKey$delegate = null;
                    this.label = 1;
                    if (flow3.collect(activityTabViewKt$ActivityTab$5$1$32, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                FlowCollector flowCollector = (FlowCollector) this.$viewModel$delegate;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.$viewModel$delegate = flowCollector;
                    this.label = 1;
                    break;
                } else if (i17 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i17 == 2) {
                    flowCollector = (FlowCollector) this.$retryKey$delegate;
                    SafeTrace.throwOnFailure(obj);
                    this.$viewModel$delegate = null;
                    this.$retryKey$delegate = null;
                    this.label = 3;
                    break;
                } else {
                    if (i17 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SessionState sessionState = (SessionState) obj3;
                SessionState.Authenticated authenticated = sessionState instanceof SessionState.Authenticated ? (SessionState.Authenticated) sessionState : null;
                String str = authenticated != null ? ((AuthenticatedState) authenticated).accountToken : null;
                if (str != null) {
                    this.$viewModel$delegate = null;
                    this.$retryKey$delegate = flowCollector;
                    this.label = 2;
                    obj = RealAgentsRepository.access$fetchAgents((RealAgentsRepository) obj2, str, this);
                    break;
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.$viewModel$delegate;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SwipeableState$animateTo$2 swipeableState$animateTo$25 = new SwipeableState$animateTo$2(17, coroutineScope6, (SponsorshipRequestReferralIntroPresenter) obj2, (MutableState) this.$retryKey$delegate);
                    this.$viewModel$delegate = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(swipeableState$animateTo$25, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.$viewModel$delegate;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$33 = new ActivityTabViewKt$ActivityTab$5$1$3(coroutineScope7, (LocalCashBalancePresenter) obj2, (MutableState) this.$retryKey$delegate, i8);
                    this.$viewModel$delegate = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(activityTabViewKt$ActivityTab$5$1$33, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                TooltipAppMessageView tooltipAppMessageView = (TooltipAppMessageView) this.$retryKey$delegate;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 != 0) {
                    if (i20 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ElementBoundsRegistry elementBoundsRegistry = tooltipAppMessageView.elementBoundsRegistry;
                ElementBoundsRegistry.Element element = (ElementBoundsRegistry.Element) this.$viewModel$delegate;
                elementBoundsRegistry.getClass();
                DerivedStateFlow mapState = StateFlowKt.mapState(elementBoundsRegistry.elements, new RecipientQueries$$ExternalSyntheticLambda0(element, i2));
                SwipeableState$animateTo$2 swipeableState$animateTo$26 = new SwipeableState$animateTo$2(i9, tooltipAppMessageView, (TooltipAppMessageViewModel.Ready) obj3, (TooltipAppMessageViewModel.Ready.ArrowPosition) obj2);
                this.label = 1;
                mapState.collect(swipeableState$animateTo$26, this);
                return coroutineSingletons11;
            case 11:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.$retryKey$delegate;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$viewModel$delegate;
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$34 = new ActivityTabViewKt$ActivityTab$5$1$3(coroutineScope8, (TransfersPresenter) obj3, (State) obj2, i9);
                    this.$retryKey$delegate = null;
                    this.label = 1;
                    if (flow4.collect(activityTabViewKt$ActivityTab$5$1$34, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.$viewModel$delegate;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SwipeableState$animateTo$2 swipeableState$animateTo$27 = new SwipeableState$animateTo$2(i3, coroutineScope9, (LocalHomePresenter) obj2, (MutableState) this.$retryKey$delegate);
                    this.$viewModel$delegate = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(swipeableState$animateTo$27, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.$viewModel$delegate;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SwipeableState$animateTo$2 swipeableState$animateTo$28 = new SwipeableState$animateTo$2(i4, coroutineScope10, (LinkedAccountsPresenter) obj2, (MutableState) this.$retryKey$delegate);
                    this.$viewModel$delegate = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(swipeableState$animateTo$28, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.$viewModel$delegate;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$35 = new ActivityTabViewKt$ActivityTab$5$1$3(coroutineScope11, (BankingBenefitsBookletPresenter) obj2, (MutableState) this.$retryKey$delegate, 21);
                    this.$viewModel$delegate = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(activityTabViewKt$ActivityTab$5$1$35, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.$retryKey$delegate;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$viewModel$delegate;
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$36 = new ActivityTabViewKt$ActivityTab$5$1$3(coroutineScope12, (LocalPosCheckInPresenter) obj3, (State) obj2, i3);
                    this.$retryKey$delegate = null;
                    this.label = 1;
                    if (flow5.collect(activityTabViewKt$ActivityTab$5$1$36, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                FlowCollector flowCollector2 = (FlowCollector) this.$retryKey$delegate;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CallbackFlowBuilder callbackFlowBuilder = (CallbackFlowBuilder) this.$viewModel$delegate;
                    SwipeableState$animateTo$2 swipeableState$animateTo$29 = new SwipeableState$animateTo$2(i6, flowCollector2, (Ref$IntRef) obj3, (Function1) obj2);
                    this.$retryKey$delegate = null;
                    this.label = 1;
                    if (callbackFlowBuilder.collect(swipeableState$animateTo$29, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.$viewModel$delegate;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$37 = new ActivityTabViewKt$ActivityTab$5$1$3(coroutineScope13, (ErrorPresenter) obj2, (MutableState) this.$retryKey$delegate, i4);
                    this.$viewModel$delegate = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(activityTabViewKt$ActivityTab$5$1$37, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__MergeKt$flatMapConcat$$inlined$map$1 bitcoinGraphModel = ((RealBitcoinGraphModelProvider) ((ErrorPresenter) obj2).args).bitcoinGraphModel((HistoricalRange) obj3);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass1 = new MusicPresenter$models$2$1.AnonymousClass1(5, (MutableState) this.$retryKey$delegate);
                    this.$viewModel$delegate = null;
                    this.label = 1;
                    if (bitcoinGraphModel.collect(anonymousClass1, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.$retryKey$delegate;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$viewModel$delegate;
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$38 = new ActivityTabViewKt$ActivityTab$5$1$3(coroutineScope14, (CardStudioPresenter) obj3, (State) obj2, i5);
                    this.$retryKey$delegate = null;
                    this.label = 1;
                    if (flow6.collect(activityTabViewKt$ActivityTab$5$1$38, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.$viewModel$delegate;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$39 = new ActivityTabViewKt$ActivityTab$5$1$3(coroutineScope15, (RealBitcoinAmountPickerPresenter) obj2, (MutableState) this.$retryKey$delegate, i6);
                    this.$viewModel$delegate = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(activityTabViewKt$ActivityTab$5$1$39, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.$viewModel$delegate;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$310 = new ActivityTabViewKt$ActivityTab$5$1$3(coroutineScope16, (RealBitcoinKeypadStateStore) obj2, (MutableState) this.$retryKey$delegate, 26);
                    this.$viewModel$delegate = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(activityTabViewKt$ActivityTab$5$1$310, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.$viewModel$delegate;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinWidgetPluginProvider bitcoinWidgetPluginProvider = ((BitcoinHomePresenter) obj3).bitcoinWidgetPluginProvider;
                    BitcoinHomeState bitcoinHomeState = (BitcoinHomeState) obj2;
                    bitcoinHomeState.getClass();
                    bitcoinWidgetPluginProvider.state = bitcoinHomeState;
                    this.$viewModel$delegate = null;
                    this.$retryKey$delegate = produceStateScope;
                    this.label = 1;
                    obj = bitcoinWidgetPluginProvider.getWidgetToPluginMap(this);
                    if (obj == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    produceStateScope = (ProduceStateScope) this.$retryKey$delegate;
                    SafeTrace.throwOnFailure(obj);
                }
                produceStateScope.setValue((Map) obj);
                return Unit.INSTANCE;
            case 23:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.$retryKey$delegate;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$viewModel$delegate;
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$1 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope17, (n) obj3, (BetterNavigator.ScreenNavigator) obj2);
                    this.$retryKey$delegate = null;
                    this.label = 1;
                    if (flow7.collect(bitcoinDepositsPresenter$models$2$1$1, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 convert = WebViewGlueCommunicator.convert(new AppLockMonitor$special$$inlined$map$2((Money) obj2, 19), (RealCurrencyConverter) obj3);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass12 = new MusicPresenter$models$2$1.AnonymousClass1(9, (MutableState) this.$retryKey$delegate);
                    this.$viewModel$delegate = null;
                    this.label = 1;
                    if (convert.collect(anonymousClass12, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineScope coroutineScope18 = (CoroutineScope) this.$retryKey$delegate;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$viewModel$delegate;
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$311 = new ActivityTabViewKt$ActivityTab$5$1$3(coroutineScope18, (BetterNavigator.ScreenNavigator) obj3, (Result) obj2, 27);
                    this.$retryKey$delegate = null;
                    this.label = 1;
                    if (flow8.collect(activityTabViewKt$ActivityTab$5$1$311, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineScope coroutineScope19 = (CoroutineScope) this.$retryKey$delegate;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.$viewModel$delegate;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$1 = new SsnPresenter$models$$inlined$CollectEffect$1$1(i7, coroutineScope19, (com.miteksystems.misnap.camera.a.n) obj3, (BetterNavigator.ScreenNavigator) obj2);
                    this.$retryKey$delegate = null;
                    this.label = 1;
                    if (flow9.collect(ssnPresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineScope coroutineScope20 = (CoroutineScope) this.$retryKey$delegate;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.$viewModel$delegate;
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$312 = new ActivityTabViewKt$ActivityTab$5$1$3(coroutineScope20, (com.miteksystems.misnap.camera.a.n) obj3, (BetterNavigator.ScreenNavigator) obj2, 28);
                    this.$retryKey$delegate = null;
                    this.label = 1;
                    if (flow10.collect(activityTabViewKt$ActivityTab$5$1$312, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i37 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineScope coroutineScope21 = (CoroutineScope) this.$retryKey$delegate;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.$viewModel$delegate;
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$313 = new ActivityTabViewKt$ActivityTab$5$1$3(coroutineScope21, (e0) obj3, (BetterNavigator.ScreenNavigator) obj2, 29);
                    this.$retryKey$delegate = null;
                    this.label = 1;
                    if (flow11.collect(activityTabViewKt$ActivityTab$5$1$313, this) == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i38 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinStackingToolsPresenter bitcoinStackingToolsPresenter = (BitcoinStackingToolsPresenter) obj2;
                    Analytics analytics = bitcoinStackingToolsPresenter.analytics;
                    CryptoStackStart.EntryPoint entryPoint = CryptoStackStart.EntryPoint.APPLET;
                    FeatureFlagManager featureFlagManager = bitcoinStackingToolsPresenter.featureFlagManager;
                    RealGrowToolsManagerViewAppearanceTracker realGrowToolsManagerViewAppearanceTracker = bitcoinStackingToolsPresenter.growToolsManagerViewAppearanceTracker;
                    this.label = 1;
                    if (RotateKt.handleStackingToolsPaidInBitcoinNavigation((PaidInBitcoinState) ((MutableState) this.$retryKey$delegate).getValue(), (BetterNavigator.ScreenNavigator) this.$viewModel$delegate, (RealPaidInBitcoinNavigator) obj3, analytics, entryPoint, featureFlagManager, realGrowToolsManagerViewAppearanceTracker, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i39 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsHubPresenter$models$1$1(MutableState mutableState, LocalPosCheckInPresenter localPosCheckInPresenter, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.$retryKey$delegate = mutableState;
        this.this$0 = localPosCheckInPresenter;
        this.$viewModel$delegate = mutableState2;
        this.$explanationScreen$delegate = mutableState3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BenefitsHubPresenter$models$1$1(int i, MutableState mutableState, Object obj, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$explanationScreen$delegate = obj;
        this.this$0 = obj2;
        this.$retryKey$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsHubPresenter$models$1$1(BetterNavigator.ScreenNavigator screenNavigator, RealPaidInBitcoinNavigator realPaidInBitcoinNavigator, BitcoinStackingToolsPresenter bitcoinStackingToolsPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 29;
        this.$viewModel$delegate = screenNavigator;
        this.$explanationScreen$delegate = realPaidInBitcoinNavigator;
        this.this$0 = bitcoinStackingToolsPresenter;
        this.$retryKey$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsHubPresenter$models$1$1(RealCurrencyConverter realCurrencyConverter, Money money, Continuation continuation, MutableState mutableState) {
        super(2, continuation);
        this.$r8$classId = 24;
        this.$explanationScreen$delegate = realCurrencyConverter;
        this.this$0 = money;
        this.$retryKey$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BenefitsHubPresenter$models$1$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$explanationScreen$delegate = obj;
        this.this$0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BenefitsHubPresenter$models$1$1(Flow flow, Continuation continuation, Object obj, Object obj2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$viewModel$delegate = flow;
        this.$explanationScreen$delegate = obj;
        this.this$0 = obj2;
    }
}
