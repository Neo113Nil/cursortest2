package com.squareup.cash.graphics.swampgl;

import android.app.Activity;
import android.view.TextureView;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.squareup.cash.R;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.biometrics.Biometrics$AuthenticationStatus;
import com.squareup.cash.biometrics.Biometrics$Info;
import com.squareup.cash.biometrics.BiometricsStore$AnalyticsPayload;
import com.squareup.cash.biometrics.BiometricsStore$BiometricsResult;
import com.squareup.cash.biometrics.CashBiometricsInfo;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.account.AccountAuthenticateStart;
import com.squareup.cash.cdf.account.BiometryType;
import com.squareup.cash.cdf.creditline.CreditLineRepayStart;
import com.squareup.cash.cdf.stock.StockOpenOpenInvestSearchFilter;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.PaymentActionResult;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ActivityPasscodeModalPinFix;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.history.payments.presenters.ProfilePaymentHistoryPresenter;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$VerifyPasscodeAttempt;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.api.data.FilterDetails;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.components.RepeatClicksOnLongPress$attachTo$2$1;
import com.squareup.cash.investing.presenters.holdings.InvestingEtfHoldingsPresenter;
import com.squareup.cash.investing.presenters.metrics.InvestingAnalystOpinionsPresenter;
import com.squareup.cash.investing.presenters.metrics.InvestingEarningsPresenter;
import com.squareup.cash.investing.presenters.metrics.InvestingKeyStatsPresenter;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter;
import com.squareup.cash.investing.presenters.teengraduation.StocksTransferEtaSheetPresenter;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.categories.FilterSubFiltersViewModel;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.offers.presenters.OffersDetailsPresenterV2$models$1$1$1;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.protos.cash.btcnetwork.external.AcceptCryptoPaymentRequest;
import com.squareup.protos.cash.btcnetwork.external.AcceptCryptoPaymentResponse;
import com.squareup.protos.cash.marketprices.service.GetInvestmentEntityHistoricalDataResponse;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.GetHistoricalExchangeDataResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.lending.InitiateLoanPaymentRequest;
import com.squareup.protos.franklin.lending.InitiateLoanPaymentResponse;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.protos.franklin.lending.SkipLoanPaymentRequest;
import com.squareup.protos.franklin.lending.SkipLoanPaymentResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import okio.ByteString;
import papa.SafeTrace;
import sqip.internal.event.EventModule$$ExternalSyntheticLambda0;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class GLThread$start$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLThread$start$2(StocksTransferEtaSheetPresenter stocksTransferEtaSheetPresenter, InvestingState investingState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 29;
        this.L$2 = stocksTransferEtaSheetPresenter;
        this.L$0 = investingState;
        this.this$0 = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                GLThread$start$2 gLThread$start$2 = new GLThread$start$2((GLThread) obj2, continuation);
                gLThread$start$2.L$0 = obj;
                return gLThread$start$2;
            case 1:
                GLThread$start$2 gLThread$start$22 = new GLThread$start$2((SafeFlow) this.L$2, (SwipeableState$special$$inlined$filter$1) obj2, continuation, 1);
                gLThread$start$22.L$0 = obj;
                return gLThread$start$22;
            case 2:
                return new GLThread$start$2((CoroutineScope) this.L$1, (TextureView) this.L$2, (GLSceneScope) this.L$0, (MutableState) obj2, continuation, 2);
            case 3:
                GLThread$start$2 gLThread$start$23 = new GLThread$start$2((PaymentAction.AcceptCryptoPayment) this.L$2, (PaymentActionHandler) obj2, continuation, 3);
                gLThread$start$23.L$0 = obj;
                return gLThread$start$23;
            case 4:
                GLThread$start$2 gLThread$start$24 = new GLThread$start$2((PaymentActionHandler) this.L$2, (PaymentAction.MakeLoanPayment) obj2, continuation, 4);
                gLThread$start$24.L$0 = obj;
                return gLThread$start$24;
            case 5:
                GLThread$start$2 gLThread$start$25 = new GLThread$start$2((PaymentAction.SendSkipLoanPayment) this.L$2, (PaymentActionHandler) obj2, continuation, 5);
                gLThread$start$25.L$0 = obj;
                return gLThread$start$25;
            case 6:
                GLThread$start$2 gLThread$start$26 = new GLThread$start$2((Flow) this.L$1, continuation, (ProfilePaymentHistoryPresenter) this.L$2, (String) obj2, 6);
                gLThread$start$26.L$0 = obj;
                return gLThread$start$26;
            case 7:
                GLThread$start$2 gLThread$start$27 = new GLThread$start$2((Flow) this.L$1, continuation, (DisclosurePresenter) this.L$2, (MutableState) obj2, 7);
                gLThread$start$27.L$0 = obj;
                return gLThread$start$27;
            case 8:
                GLThread$start$2 gLThread$start$28 = new GLThread$start$2((PasscodeDialogPresenter$VerifyPasscodeAttempt) this.L$1, continuation, (TransfersPresenter) this.L$2, (MutableState) obj2, 8);
                gLThread$start$28.L$0 = obj;
                return gLThread$start$28;
            case 9:
                GLThread$start$2 gLThread$start$29 = new GLThread$start$2((TransfersPresenter) this.L$1, (MutableState) this.L$2, (MutableState) obj2, continuation, 9);
                gLThread$start$29.L$0 = obj;
                return gLThread$start$29;
            case 10:
                GLThread$start$2 gLThread$start$210 = new GLThread$start$2((Flow) this.L$1, continuation, (LocalHomePresenter) this.L$2, (MutableState) obj2, 10);
                gLThread$start$210.L$0 = obj;
                return gLThread$start$210;
            case 11:
                GLThread$start$2 gLThread$start$211 = new GLThread$start$2((Flow) this.L$1, continuation, (LocalHomePresenter) this.L$2, (MutableState) obj2, 11);
                gLThread$start$211.L$0 = obj;
                return gLThread$start$211;
            case 12:
                GLThread$start$2 gLThread$start$212 = new GLThread$start$2((Flow) this.L$1, continuation, (MusicPresenter) this.L$2, (State) obj2, 12);
                gLThread$start$212.L$0 = obj;
                return gLThread$start$212;
            case 13:
                GLThread$start$2 gLThread$start$213 = new GLThread$start$2((PersistentHistoricalDataCache) this.L$1, (CurrencyCode) this.L$2, (HistoricalRange) obj2, continuation, 13);
                gLThread$start$213.L$0 = obj;
                return gLThread$start$213;
            case 14:
                GLThread$start$2 gLThread$start$214 = new GLThread$start$2((PersistentHistoricalDataCache) this.L$1, (InvestmentEntityToken) this.L$2, (HistoricalRange) obj2, continuation, 14);
                gLThread$start$214.L$0 = obj;
                return gLThread$start$214;
            case 15:
                GLThread$start$2 gLThread$start$215 = new GLThread$start$2((RealInvestingHistoricalData) this.L$1, (HistoricalRange) this.L$2, (String) obj2, continuation, 15);
                gLThread$start$215.L$0 = obj;
                return gLThread$start$215;
            case 16:
                GLThread$start$2 gLThread$start$216 = new GLThread$start$2((Flow) this.L$1, continuation, (InviteErrorPresenter) this.L$2, (MutableState) obj2, 16);
                gLThread$start$216.L$0 = obj;
                return gLThread$start$216;
            case 17:
                GLThread$start$2 gLThread$start$217 = new GLThread$start$2((Flow) this.L$1, continuation, (DisclosurePresenter) this.L$2, (State) obj2, 17);
                gLThread$start$217.L$0 = obj;
                return gLThread$start$217;
            case 18:
                GLThread$start$2 gLThread$start$218 = new GLThread$start$2((Flow) this.L$1, continuation, (LocalPosCheckInPresenter) this.L$2, (MutableState) obj2, 18);
                gLThread$start$218.L$0 = obj;
                return gLThread$start$218;
            case 19:
                return new GLThread$start$2((Flow) this.L$1, (FilterSubFiltersViewModel.Content) this.L$2, (LocalPosCheckInPresenter) this.L$0, (Ref$ObjectRef) obj2, continuation, 19);
            case 20:
                GLThread$start$2 gLThread$start$219 = new GLThread$start$2((Flow) this.L$1, continuation, (LocalCashBalancePresenter) this.L$2, (MutableState) obj2, 20);
                gLThread$start$219.L$0 = obj;
                return gLThread$start$219;
            case 21:
                GLThread$start$2 gLThread$start$220 = new GLThread$start$2((Flow) this.L$1, continuation, (CardStudioPresenter) this.L$2, (MutableState) obj2, 21);
                gLThread$start$220.L$0 = obj;
                return gLThread$start$220;
            case 22:
                GLThread$start$2 gLThread$start$221 = new GLThread$start$2((Flow) this.L$1, continuation, (ShareSheetPresenter) this.L$2, (MutableState) obj2, 22);
                gLThread$start$221.L$0 = obj;
                return gLThread$start$221;
            case 23:
                GLThread$start$2 gLThread$start$222 = new GLThread$start$2((Flow) this.L$1, continuation, (InvestingEtfHoldingsPresenter) this.L$2, (MutableState) obj2, 23);
                gLThread$start$222.L$0 = obj;
                return gLThread$start$222;
            case 24:
                GLThread$start$2 gLThread$start$223 = new GLThread$start$2((InvestingEtfHoldingsPresenter) this.L$2, (MutableState) obj2, continuation, 24);
                gLThread$start$223.L$0 = obj;
                return gLThread$start$223;
            case 25:
                GLThread$start$2 gLThread$start$224 = new GLThread$start$2((Flow) this.L$1, continuation, (InvestingAnalystOpinionsPresenter) this.L$2, (MutableState) obj2, 25);
                gLThread$start$224.L$0 = obj;
                return gLThread$start$224;
            case 26:
                GLThread$start$2 gLThread$start$225 = new GLThread$start$2((Flow) this.L$1, continuation, (InvestingEarningsPresenter) this.L$2, (State) obj2, 26);
                gLThread$start$225.L$0 = obj;
                return gLThread$start$225;
            case 27:
                GLThread$start$2 gLThread$start$226 = new GLThread$start$2((Flow) this.L$1, continuation, (InvestingKeyStatsPresenter) this.L$2, (MutableState) obj2, 27);
                gLThread$start$226.L$0 = obj;
                return gLThread$start$226;
            case 28:
                return new GLThread$start$2((InvestingSearchPresenter) this.L$1, (InvestingSearchViewEvent) this.L$2, (ColorModel) this.L$0, (MutableState) obj2, continuation, 28);
            default:
                return new GLThread$start$2((StocksTransferEtaSheetPresenter) this.L$2, (InvestingState) this.L$0, (MutableState) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((GLThread$start$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((GLThread$start$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:397:0x078a, code lost:
    
        if (r2.emit(null, r22) == r3) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x07b7, code lost:
    
        if (r2.emit(r4, r22) == r3) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x07f2, code lost:
    
        if (r2.emit(null, r22) == r3) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x089d, code lost:
    
        if (r2.emit(null, r22) == r3) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x08c2, code lost:
    
        if (r2.emit(r4, r22) == r3) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x08fd, code lost:
    
        if (r2.emit(null, r22) == r3) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x086c, code lost:
    
        if (r11 == r3) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x097c, code lost:
    
        if (r2.emit(null, r22) == r3) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x09ab, code lost:
    
        if (r2.emit(r6, r22) == r3) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x09e6, code lost:
    
        if (r2.emit(null, r22) == r3) goto L431;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v101, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ExecutorService newSingleThreadExecutor;
        SupervisorJobImpl supervisorJobImpl;
        Object acceptCryptPayment;
        ClientScenario clientScenario;
        ClientScenario clientScenario2;
        Object initiateLoanPayment;
        Object skipLoanPayment;
        ClientScenario clientScenario3;
        AccountAuthenticateStart.BiometryState biometryState;
        Object readIfCanAuthenticate;
        Object first;
        Object first2;
        Object obj2;
        Screen filterCategoriesScreen;
        MutableState mutableState;
        Object obj3;
        int i = 5;
        int i2 = 26;
        int i3 = 28;
        int i4 = 4;
        Continuation continuation = null;
        continuation = null;
        continuation = null;
        switch (this.$r8$classId) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    newSingleThreadExecutor = Executors.newSingleThreadExecutor(new EventModule$$ExternalSyntheticLambda0((GLThread) this.this$0));
                    supervisorJobImpl = new SupervisorJobImpl((Job) coroutineScope.getCoroutineContext().get(Job.Key.$$INSTANCE));
                    GLThread$start$2$invokeSuspend$$inlined$CoroutineExceptionHandler$1 gLThread$start$2$invokeSuspend$$inlined$CoroutineExceptionHandler$1 = new GLThread$start$2$invokeSuspend$$inlined$CoroutineExceptionHandler$1((GLThread) this.this$0);
                    GLThread gLThread = (GLThread) this.this$0;
                    newSingleThreadExecutor.getClass();
                    gLThread.glContext = new ExecutorCoroutineDispatcherImpl(newSingleThreadExecutor).plus(supervisorJobImpl).plus(gLThread$start$2$invokeSuspend$$inlined$CoroutineExceptionHandler$1);
                    Timber.Forest forest = Timber.Forest;
                    forest.tag("GLThread");
                    forest.d("GLThread SwampGL-Engine started", new Object[0]);
                    try {
                        this.L$0 = null;
                        this.L$1 = newSingleThreadExecutor;
                        this.L$2 = supervisorJobImpl;
                        this.label = 1;
                        JobKt.awaitCancellation(this);
                        return coroutineSingletons;
                    } catch (Throwable th) {
                        th = th;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SupervisorJobImpl supervisorJobImpl2 = (SupervisorJobImpl) this.L$2;
                    newSingleThreadExecutor = (ExecutorService) this.L$1;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    } catch (Throwable th2) {
                        th = th2;
                        supervisorJobImpl = supervisorJobImpl2;
                    }
                }
                Throwable th3 = th;
                supervisorJobImpl.cancel(null);
                try {
                    newSingleThreadExecutor.execute(new KnotView$$ExternalSyntheticLambda1((GLThread) this.this$0, i2));
                } catch (Throwable th4) {
                    Timber.Forest forest2 = Timber.Forest;
                    forest2.tag("GLThread");
                    forest2.w("GLThread SwampGL-Engine cleanup submission failed", new Object[0], th4);
                    ((GLThread) this.this$0).cleanupJob.complete$1();
                }
                newSingleThreadExecutor.shutdown();
                ((GLThread) this.this$0).glContext = null;
                Timber.Forest forest3 = Timber.Forest;
                forest3.tag("GLThread");
                forest3.d("GLThread SwampGL-Engine disposed", new Object[0]);
                throw th3;
            case 1:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ?? r1 = this.label;
                try {
                    if (r1 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        CancellationException cancellationException = new CancellationException();
                        try {
                            AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$1 = new AnimationsKt$takeUntil$1$1((SafeFlow) this.L$2, flowCollector, (SwipeableState$special$$inlined$filter$1) this.this$0, cancellationException, (Continuation) null, 0);
                            this.L$0 = null;
                            this.L$1 = cancellationException;
                            this.label = 1;
                            Object coroutineScope2 = JobKt.coroutineScope(animationsKt$takeUntil$1$1, this);
                            r1 = coroutineScope2;
                            if (coroutineScope2 == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                        } catch (CancellationException e) {
                            e = e;
                            r1 = cancellationException;
                            if (!Intrinsics.areEqual(e.getCause(), (Object) r1)) {
                                throw e;
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (r1 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        CancellationException cancellationException2 = (CancellationException) this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        r1 = cancellationException2;
                    }
                } catch (CancellationException e2) {
                    e = e2;
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineContext coroutineContext = ((CoroutineScope) this.L$1).getCoroutineContext();
                    GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$1 = new GLSceneScopeProvider$SceneScope$2$1$1((TextureView) this.L$2, (GLSceneScope) this.L$0, (MutableState) this.this$0, (Continuation) null, 0);
                    this.label = 1;
                    if (JobKt.withContext(coroutineContext, gLSceneScopeProvider$SceneScope$2$1$1, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                PaymentActionHandler paymentActionHandler = (PaymentActionHandler) this.this$0;
                PaymentAction.AcceptCryptoPayment acceptCryptoPayment = (PaymentAction.AcceptCryptoPayment) this.L$2;
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AcceptCryptoPaymentRequest acceptCryptoPaymentRequest = new AcceptCryptoPaymentRequest(null, acceptCryptoPayment.paymentToken, ByteString.EMPTY);
                    ClientScenario clientScenario4 = ClientScenario.ACCEPT_CRYPTO_PAYMENT;
                    CryptoService cryptoService = paymentActionHandler.cryptoService;
                    String str = acceptCryptoPayment.flowToken;
                    this.L$0 = flowCollector2;
                    this.L$1 = clientScenario4;
                    this.label = 1;
                    acceptCryptPayment = cryptoService.acceptCryptPayment(clientScenario4, str, acceptCryptoPaymentRequest, this);
                    if (acceptCryptPayment != coroutineSingletons4) {
                        clientScenario = clientScenario4;
                    }
                    return coroutineSingletons4;
                }
                if (i7 != 1) {
                    if (i7 == 2 || i7 == 3 || i7 == 4) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ClientScenario clientScenario5 = (ClientScenario) this.L$1;
                SafeTrace.throwOnFailure(obj);
                clientScenario = clientScenario5;
                acceptCryptPayment = obj;
                ApiResult apiResult = (ApiResult) acceptCryptPayment;
                if (apiResult instanceof ApiResult.Success) {
                    ResponseContext responseContext = ((AcceptCryptoPaymentResponse) ((ApiResult.Success) apiResult).response).response_context;
                    ScenarioPlan scenarioPlan = responseContext.scenario_plan;
                    StatusResult statusResult = responseContext.status_result;
                    if (scenarioPlan != null || statusResult != null) {
                        PaymentActionResult.GoToScreen goToScreen = new PaymentActionResult.GoToScreen(((RealFlowStarter) paymentActionHandler.flowStarter).startPaymentBlockersFlow(acceptCryptoPayment.flowToken, scenarioPlan, statusResult, CollectionsKt__CollectionsJVMKt.listOf(acceptCryptoPayment.paymentToken), (Screen) paymentActionHandler.activeArgs.invoke(), clientScenario));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 2;
                        break;
                    } else {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        break;
                    }
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to accept crypto payment (", acceptCryptoPayment.paymentToken, ")"), new Object[0]);
                    ((RealPaymentManager) paymentActionHandler.paymentManager).error(acceptCryptoPayment.flowToken, TextUtilsCompat.errorMessaging(paymentActionHandler.stringManager, (ApiResult.Failure) apiResult, new Integer(R.string.history_accept_crypto_payment_error_message)).message);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    break;
                }
            case 4:
                PaymentActionHandler paymentActionHandler2 = (PaymentActionHandler) this.L$2;
                PaymentAction.MakeLoanPayment makeLoanPayment = (PaymentAction.MakeLoanPayment) this.this$0;
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = paymentActionHandler2.analytics;
                    CreditLineRepayStart.LoanRepaySource loanRepaySource = CreditLineRepayStart.LoanRepaySource.ACTIVITY;
                    analytics.track(new CreditLineRepayStart(makeLoanPayment.loanTransactionToken), null);
                    InitiateLoanPaymentRequest initiateLoanPaymentRequest = new InitiateLoanPaymentRequest(null, UUID.randomUUID().toString(), makeLoanPayment.amount, makeLoanPayment.loanTransactionToken, makeLoanPayment.opaqueData, 147);
                    clientScenario2 = ClientScenario.INITIATE_LOAN_PAYMENT;
                    LendingAppService lendingAppService = paymentActionHandler2.lendingAppService;
                    String str2 = makeLoanPayment.flowToken;
                    this.L$0 = flowCollector3;
                    this.L$1 = clientScenario2;
                    this.label = 1;
                    initiateLoanPayment = lendingAppService.initiateLoanPayment(clientScenario2, str2, initiateLoanPaymentRequest, this);
                    break;
                } else {
                    if (i8 != 1) {
                        if (i8 == 2 || i8 == 3 || i8 == 4) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    clientScenario2 = (ClientScenario) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    initiateLoanPayment = obj;
                }
                ClientScenario clientScenario6 = clientScenario2;
                ApiResult apiResult2 = (ApiResult) initiateLoanPayment;
                if (apiResult2 instanceof ApiResult.Success) {
                    ResponseContext responseContext2 = ((InitiateLoanPaymentResponse) ((ApiResult.Success) apiResult2).response).response_context;
                    ScenarioPlan scenarioPlan2 = responseContext2 != null ? responseContext2.scenario_plan : null;
                    StatusResult statusResult2 = responseContext2 != null ? responseContext2.status_result : null;
                    if (scenarioPlan2 != null || statusResult2 != null) {
                        PaymentActionResult.GoToScreen goToScreen2 = new PaymentActionResult.GoToScreen(((RealFlowStarter) paymentActionHandler2.flowStarter).startPaymentBlockersFlow(makeLoanPayment.flowToken, scenarioPlan2, statusResult2, CollectionsKt__CollectionsJVMKt.listOf(makeLoanPayment.loanTransactionToken), ActivityScreen.INSTANCE, clientScenario6));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 2;
                        break;
                    } else {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        break;
                    }
                } else {
                    if (!(apiResult2 instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to make loan payment (", makeLoanPayment.loanTransactionToken, ")"), new Object[0]);
                    ((RealPaymentManager) paymentActionHandler2.paymentManager).error(makeLoanPayment.flowToken, TextUtilsCompat.errorMessaging(paymentActionHandler2.stringManager, (ApiResult.Failure) apiResult2, new Integer(R.string.history_make_loan_payment_error_message)).message);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    break;
                }
            case 5:
                PaymentActionHandler paymentActionHandler3 = (PaymentActionHandler) this.this$0;
                PaymentAction.SendSkipLoanPayment sendSkipLoanPayment = (PaymentAction.SendSkipLoanPayment) this.L$2;
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SkipLoanPaymentRequest skipLoanPaymentRequest = new SkipLoanPaymentRequest(null, sendSkipLoanPayment.loanTransactionToken, ByteString.EMPTY);
                    ClientScenario clientScenario7 = ClientScenario.SKIP_LOAN_PAYMENT;
                    LendingAppService lendingAppService2 = paymentActionHandler3.lendingAppService;
                    String str3 = sendSkipLoanPayment.flowToken;
                    this.L$0 = flowCollector4;
                    this.L$1 = clientScenario7;
                    this.label = 1;
                    skipLoanPayment = lendingAppService2.skipLoanPayment(clientScenario7, str3, skipLoanPaymentRequest, this);
                    if (skipLoanPayment != coroutineSingletons6) {
                        clientScenario3 = clientScenario7;
                    }
                    return coroutineSingletons6;
                }
                if (i9 != 1) {
                    if (i9 == 2 || i9 == 3 || i9 == 4) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ClientScenario clientScenario8 = (ClientScenario) this.L$1;
                SafeTrace.throwOnFailure(obj);
                clientScenario3 = clientScenario8;
                skipLoanPayment = obj;
                ApiResult apiResult3 = (ApiResult) skipLoanPayment;
                if (apiResult3 instanceof ApiResult.Success) {
                    ResponseContext responseContext3 = ((SkipLoanPaymentResponse) ((ApiResult.Success) apiResult3).response).response_context;
                    ScenarioPlan scenarioPlan3 = responseContext3 != null ? responseContext3.scenario_plan : null;
                    StatusResult statusResult3 = responseContext3 != null ? responseContext3.status_result : null;
                    if (scenarioPlan3 != null || statusResult3 != null) {
                        PaymentActionResult.GoToScreen goToScreen3 = new PaymentActionResult.GoToScreen(((RealFlowStarter) paymentActionHandler3.flowStarter).startPaymentBlockersFlow(sendSkipLoanPayment.flowToken, scenarioPlan3, statusResult3, CollectionsKt__CollectionsJVMKt.listOf(sendSkipLoanPayment.loanTransactionToken), (Screen) paymentActionHandler3.activeArgs.invoke(), clientScenario3));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 2;
                        break;
                    } else {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        break;
                    }
                } else {
                    if (!(apiResult3 instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to skip loan payment (", sendSkipLoanPayment.loanTransactionToken, ")"), new Object[0]);
                    ((RealPaymentManager) paymentActionHandler3.paymentManager).error(sendSkipLoanPayment.flowToken, TextUtilsCompat.errorMessaging(paymentActionHandler3.stringManager, (ApiResult.Failure) apiResult3, new Integer(R.string.history_skip_loan_payment_error_message)).message);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    break;
                }
            case 6:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.L$1;
                    AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c00601 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(coroutineScope3, (ProfilePaymentHistoryPresenter) this.L$2, (String) this.this$0, i3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(c00601, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.L$1;
                    MusicPresenter$models$1$1.AnonymousClass2 anonymousClass2 = new MusicPresenter$models$1$1.AnonymousClass2(coroutineScope4, (DisclosurePresenter) this.L$2, (MutableState) this.this$0, i4);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(anonymousClass2, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasscodeDialogPresenter$VerifyPasscodeAttempt passcodeDialogPresenter$VerifyPasscodeAttempt = (PasscodeDialogPresenter$VerifyPasscodeAttempt) this.L$1;
                    String str4 = passcodeDialogPresenter$VerifyPasscodeAttempt.passcode;
                    String str5 = passcodeDialogPresenter$VerifyPasscodeAttempt.passcodeToken;
                    TransfersPresenter transfersPresenter = (TransfersPresenter) this.L$2;
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$1 = new RealBrandFollowPresenter$models$2$1$1(22, (MutableState) this.this$0);
                    this.L$0 = null;
                    this.label = 1;
                    if (TransfersPresenter.access$verifyPasscode(transfersPresenter, str4, str5, realBrandFollowPresenter$models$2$1$1, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                TransfersPresenter transfersPresenter2 = (TransfersPresenter) this.L$1;
                AndroidBiometricsStore androidBiometricsStore = (AndroidBiometricsStore) transfersPresenter2.accountFormatter;
                HistoryScreens.PaymentPasscodeDialog paymentPasscodeDialog = (HistoryScreens.PaymentPasscodeDialog) transfersPresenter2.router;
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                Continuation continuation2 = null;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str6 = paymentPasscodeDialog.verificationInstrumentToken;
                    if (str6 == null) {
                        Analytics analytics2 = (Analytics) transfersPresenter2.analytics;
                        String obj4 = ClientScenario.ACTIVITY.toString();
                        String str7 = paymentPasscodeDialog.flowToken;
                        BiometryType biometryType = BiometryType.STRONG;
                        Biometrics$AuthenticationStatus biometrics$AuthenticationStatus = androidBiometricsStore.getStatus().biometricsStatus;
                        if (biometrics$AuthenticationStatus.equals(Biometrics$AuthenticationStatus.BiometricsEnrolled.INSTANCE)) {
                            biometryState = AccountAuthenticateStart.BiometryState.ENABLED;
                        } else if (biometrics$AuthenticationStatus.equals(Biometrics$AuthenticationStatus.HardwareNotSupported.INSTANCE)) {
                            biometryState = AccountAuthenticateStart.BiometryState.NOT_SUPPORTED;
                        } else if (biometrics$AuthenticationStatus.equals(Biometrics$AuthenticationStatus.NoBiometricSignatures.INSTANCE)) {
                            biometryState = AccountAuthenticateStart.BiometryState.NOT_ENROLLED;
                        } else {
                            if (!biometrics$AuthenticationStatus.equals(Biometrics$AuthenticationStatus.OsUpdateRequired.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            biometryState = AccountAuthenticateStart.BiometryState.OS_UPDATE_REQUIRED;
                        }
                        analytics2.track(new AccountAuthenticateStart(obj4, str7, biometryType, biometryState, Boolean.FALSE), null);
                        return Unit.INSTANCE;
                    }
                    Activity activity = (Activity) transfersPresenter2.navigator;
                    Biometrics$Info biometrics$Info = ((CashBiometricsInfo) transfersPresenter2.issuedCardManager).moveFunds;
                    BiometricsStore$AnalyticsPayload biometricsStore$AnalyticsPayload = new BiometricsStore$AnalyticsPayload(paymentPasscodeDialog.flowToken, null);
                    this.L$0 = coroutineScope5;
                    this.label = 1;
                    readIfCanAuthenticate = androidBiometricsStore.readIfCanAuthenticate(activity, str6, biometrics$Info, biometricsStore$AnalyticsPayload, this);
                    if (readIfCanAuthenticate == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    readIfCanAuthenticate = obj;
                }
                BiometricsStore$BiometricsResult.Success success = (BiometricsStore$BiometricsResult.Success) readIfCanAuthenticate;
                String str8 = success != null ? success.value : null;
                if (str8 != null) {
                    if (((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) transfersPresenter2.featureFlagManager)).peekCurrentValue(LaunchDarklyFeatureFlags$ActivityPasscodeModalPinFix.INSTANCE)).enabled()) {
                        JobKt.launch$default(coroutineScope5, (CoroutineContext) transfersPresenter2.syncValueReader, null, new PasscodeDialogPresenter$models$1$1(transfersPresenter2, str8, (MutableState) this.L$2, continuation2, 11), 2);
                    } else {
                        ((MutableState) this.this$0).setValue(new PasscodeDialogPresenter$VerifyPasscodeAttempt(null, str8));
                    }
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.L$1;
                    MusicPresenter$models$1$1.AnonymousClass2 anonymousClass22 = new MusicPresenter$models$1$1.AnonymousClass2(coroutineScope6, (LocalHomePresenter) this.L$2, (MutableState) this.this$0, i);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(anonymousClass22, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.L$1;
                    MusicPresenter$models$1$1.AnonymousClass2 anonymousClass23 = new MusicPresenter$models$1$1.AnonymousClass2(coroutineScope7, (LocalHomePresenter) this.L$2, (MutableState) this.this$0, 6);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow4.collect(anonymousClass23, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.L$1;
                    RepeatClicksOnLongPress$attachTo$2$1 repeatClicksOnLongPress$attachTo$2$1 = new RepeatClicksOnLongPress$attachTo$2$1(coroutineScope8, (MusicPresenter) this.L$2, (State) this.this$0, i);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow5.collect(repeatClicksOnLongPress$attachTo$2$1, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                FlowCollector flowCollector5 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetHistoricalExchangeDataResponse getHistoricalExchangeDataResponse = (GetHistoricalExchangeDataResponse) ((PersistentHistoricalDataCache) this.L$1).bitcoinPortfolio.get(new Pair((CurrencyCode) this.L$2, (HistoricalRange) this.this$0));
                    if (getHistoricalExchangeDataResponse != null) {
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector5.emit(getHistoricalExchangeDataResponse, this) == coroutineSingletons14) {
                            return coroutineSingletons14;
                        }
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                FlowCollector flowCollector6 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetInvestmentEntityHistoricalDataResponse getInvestmentEntityHistoricalDataResponse = (GetInvestmentEntityHistoricalDataResponse) ((PersistentHistoricalDataCache) this.L$1).entityMemoryCache.get(new Pair((InvestmentEntityToken) this.L$2, (HistoricalRange) this.this$0));
                    if (getInvestmentEntityHistoricalDataResponse != null) {
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector6.emit(getInvestmentEntityHistoricalDataResponse, this) == coroutineSingletons15) {
                            return coroutineSingletons15;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                ProducerScope producerScope = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$12 = new AnimationsKt$takeUntil$1$1((RealInvestingHistoricalData) this.L$1, (HistoricalRange) this.L$2, (String) this.this$0, producerScope, (Continuation) null, 10);
                    this.L$0 = null;
                    this.label = 1;
                    if (JobKt.coroutineScope(animationsKt$takeUntil$1$12, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.L$1;
                    MusicPresenter$models$1$1.AnonymousClass2 anonymousClass24 = new MusicPresenter$models$1$1.AnonymousClass2(coroutineScope9, (InviteErrorPresenter) this.L$2, (MutableState) this.this$0, 13);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow6.collect(anonymousClass24, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.L$1;
                    RepeatClicksOnLongPress$attachTo$2$1 repeatClicksOnLongPress$attachTo$2$12 = new RepeatClicksOnLongPress$attachTo$2$1(coroutineScope10, (DisclosurePresenter) this.L$2, (State) this.this$0, 23);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow7.collect(repeatClicksOnLongPress$attachTo$2$12, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.L$1;
                    RepeatClicksOnLongPress$attachTo$2$1 repeatClicksOnLongPress$attachTo$2$13 = new RepeatClicksOnLongPress$attachTo$2$1(coroutineScope11, (LocalPosCheckInPresenter) this.L$2, (MutableState) this.this$0, 24);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow8.collect(repeatClicksOnLongPress$attachTo$2$13, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.L$1;
                    MusicPresenter$models$1$1.AnonymousClass2 anonymousClass25 = new MusicPresenter$models$1$1.AnonymousClass2(15, (FilterSubFiltersViewModel.Content) this.L$2, (LocalPosCheckInPresenter) this.L$0, (Ref$ObjectRef) this.this$0);
                    this.label = 1;
                    if (flow9.collect(anonymousClass25, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.L$1;
                    MusicPresenter$models$1$1.AnonymousClass2 anonymousClass26 = new MusicPresenter$models$1$1.AnonymousClass2(coroutineScope12, (LocalCashBalancePresenter) this.L$2, (MutableState) this.this$0, 17);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow10.collect(anonymousClass26, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.L$1;
                    RepeatClicksOnLongPress$attachTo$2$1 repeatClicksOnLongPress$attachTo$2$14 = new RepeatClicksOnLongPress$attachTo$2$1(coroutineScope13, (CardStudioPresenter) this.L$2, (MutableState) this.this$0, 25);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow11.collect(repeatClicksOnLongPress$attachTo$2$14, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.L$1;
                    RepeatClicksOnLongPress$attachTo$2$1 repeatClicksOnLongPress$attachTo$2$15 = new RepeatClicksOnLongPress$attachTo$2$1(coroutineScope14, (ShareSheetPresenter) this.L$2, (MutableState) this.this$0, i2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow12.collect(repeatClicksOnLongPress$attachTo$2$15, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow13 = (Flow) this.L$1;
                    RepeatClicksOnLongPress$attachTo$2$1 repeatClicksOnLongPress$attachTo$2$16 = new RepeatClicksOnLongPress$attachTo$2$1(coroutineScope15, (InvestingEtfHoldingsPresenter) this.L$2, (MutableState) this.this$0, 27);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow13.collect(repeatClicksOnLongPress$attachTo$2$16, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) ((MutableState) this.this$0).getValue()).booleanValue()) {
                        InvestingEtfHoldingsPresenter investingEtfHoldingsPresenter = (InvestingEtfHoldingsPresenter) this.L$2;
                        Flow stockDetails = investingEtfHoldingsPresenter.investmentEntities.stockDetails(investingEtfHoldingsPresenter.args.investmentEntityToken);
                        this.L$0 = null;
                        this.L$1 = produceStateScope;
                        this.label = 1;
                        first = FlowKt.first(stockDetails, this);
                        if (first == coroutineSingletons25) {
                            return coroutineSingletons25;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i28 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                produceStateScope = (ProduceStateScope) this.L$1;
                SafeTrace.throwOnFailure(obj);
                first = obj;
                produceStateScope.setValue(first);
                return Unit.INSTANCE;
            case 25:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow14 = (Flow) this.L$1;
                    RepeatClicksOnLongPress$attachTo$2$1 repeatClicksOnLongPress$attachTo$2$17 = new RepeatClicksOnLongPress$attachTo$2$1(coroutineScope16, (InvestingAnalystOpinionsPresenter) this.L$2, (MutableState) this.this$0, i3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow14.collect(repeatClicksOnLongPress$attachTo$2$17, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow15 = (Flow) this.L$1;
                    RepeatClicksOnLongPress$attachTo$2$1 repeatClicksOnLongPress$attachTo$2$18 = new RepeatClicksOnLongPress$attachTo$2$1(coroutineScope17, (InvestingEarningsPresenter) this.L$2, (State) this.this$0, 29);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow15.collect(repeatClicksOnLongPress$attachTo$2$18, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineScope coroutineScope18 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow16 = (Flow) this.L$1;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$1 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope18, (InvestingKeyStatsPresenter) this.L$2, (MutableState) this.this$0);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow16.collect(offersDetailsPresenterV2$models$1$1$1, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                ColorModel colorModel = (ColorModel) this.L$0;
                InvestingSearchPresenter investingSearchPresenter = (InvestingSearchPresenter) this.L$1;
                InvestingSearchViewEvent investingSearchViewEvent = (InvestingSearchViewEvent) this.L$2;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealContactRepository$contacts$$inlined$map$1 filterDetails = investingSearchPresenter.categoryBackend.filterDetails(((InvestingSearchViewEvent.FilterSelected) investingSearchViewEvent).filterToken);
                    this.label = 1;
                    first2 = FlowKt.first(filterDetails, this);
                    if (first2 == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    first2 = obj;
                }
                FilterDetails filterDetails2 = (FilterDetails) first2;
                Iterator it = ((Map) ((MutableState) this.this$0).getValue()).values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (Intrinsics.areEqual(((InvestingSearchViewEvent.FilterSelected) investingSearchViewEvent).filterToken, ((FilterConfiguration) obj2).getFilterToken())) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                FilterConfiguration filterConfiguration = (FilterConfiguration) obj2;
                if (filterConfiguration == null) {
                    if (filterDetails2 instanceof FilterDetails.Categories) {
                        filterConfiguration = new FilterConfiguration.Categories(((InvestingSearchViewEvent.FilterSelected) investingSearchViewEvent).filterToken, EmptyList.INSTANCE);
                    } else {
                        if (!(filterDetails2 instanceof FilterDetails.Subfilters)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        FilterToken filterToken = ((InvestingSearchViewEvent.FilterSelected) investingSearchViewEvent).filterToken;
                        EmptyMap emptyMap = EmptyMap.INSTANCE;
                        emptyMap.getClass();
                        filterConfiguration = new FilterConfiguration.SubFilters(filterToken, emptyMap);
                    }
                }
                if (filterConfiguration instanceof FilterConfiguration.SubFilters) {
                    filterCategoriesScreen = new InvestingScreens.FilterSubFiltersScreen(colorModel, (FilterConfiguration.SubFilters) filterConfiguration);
                } else {
                    if (!(filterConfiguration instanceof FilterConfiguration.Categories)) {
                        if (filterConfiguration instanceof FilterConfiguration.Empty) {
                            OptionalProvider$$ExternalSyntheticLambda0.m$1(filterConfiguration, "Unexpected navigation to ");
                            return null;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    filterCategoriesScreen = new InvestingScreens.FilterCategoriesScreen(colorModel, (FilterConfiguration.Categories) filterConfiguration);
                }
                String str9 = filterConfiguration.getFilterToken().value;
                if (investingSearchPresenter.categoryToken == null) {
                    investingSearchPresenter.analytics.track(new StockOpenOpenInvestSearchFilter(str9), null);
                }
                investingSearchPresenter.navigator.goTo(filterCategoriesScreen);
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState2 = (MutableState) this.this$0;
                    StocksTransferEtaSheetPresenter stocksTransferEtaSheetPresenter = (StocksTransferEtaSheetPresenter) this.L$2;
                    InvestingState investingState = (InvestingState) this.L$0;
                    this.L$1 = mutableState2;
                    this.label = 1;
                    if (investingState instanceof InvestingState.Content) {
                        InvestingState.Content.BrokerageAccountState brokerageAccountState = ((InvestingState.Content) investingState).brokerageAccountState;
                        if (!(brokerageAccountState instanceof InvestingState.Content.BrokerageAccountState.Active) && !(brokerageAccountState instanceof InvestingState.Content.BrokerageAccountState.Inactive)) {
                            if (!(brokerageAccountState instanceof InvestingState.Content.BrokerageAccountState.TransferInProgress)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            continuation = JobKt.withContext(stocksTransferEtaSheetPresenter.ioDispatcher, new GenieViewKt$GenieView$1$1(stocksTransferEtaSheetPresenter, brokerageAccountState, continuation, i4), this);
                        }
                    } else if (!(investingState instanceof InvestingState.Loading)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (continuation == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                    mutableState = mutableState2;
                    obj3 = continuation;
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = (MutableState) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    obj3 = obj;
                }
                mutableState.setValue((String) obj3);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLThread$start$2(GLThread gLThread, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.this$0 = gLThread;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GLThread$start$2(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.L$2 = obj2;
        this.L$0 = obj3;
        this.this$0 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GLThread$start$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.L$2 = obj2;
        this.this$0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GLThread$start$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$2 = obj;
        this.this$0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GLThread$start$2(Object obj, Continuation continuation, MoleculePresenter moleculePresenter, Object obj2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.L$2 = moleculePresenter;
        this.this$0 = obj2;
    }
}
