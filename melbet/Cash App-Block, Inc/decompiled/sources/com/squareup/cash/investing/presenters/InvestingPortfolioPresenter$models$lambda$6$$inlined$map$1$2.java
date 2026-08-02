package com.squareup.cash.investing.presenters;

import androidx.lifecycle.Lifecycle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.investing.backend.api.StockDetails;
import com.squareup.cash.investing.backend.api.data.CategoryDetails;
import com.squareup.cash.investing.backend.api.data.FilterDetails;
import com.squareup.cash.investing.db.Investing_settings;
import com.squareup.cash.investing.db.Investment_entity;
import com.squareup.cash.investing.presenters.activity.InvestingActivityHistoryPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.activity.Result;
import com.squareup.cash.investing.presenters.categories.InvestingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.categories.InvestingFilterSubFiltersPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.custom.order.InvestingCustomOrderPresenter$models$5$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.custom.order.InvestingCustomOrderPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.custom.order.InvestingCustomOrderPresenter$models$lambda$37$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.custom.order.InvestingCustomSharePricePresenter$models$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.custom.order.InvestingOrderTypeSelectionPresenter$canShowAutoInvestForBitcoin$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.custom.order.InvestingOrderTypeSelectionPresenter$orderTypes$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.custom.order.InvestingOrderTypeSelectionPresenter$orderTypes$$inlined$map$2$2$1;
import com.squareup.cash.investing.presenters.custom.order.InvestingPeriodSelectionPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.holdings.InvestingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.keystats.InvestingKeyStatsDetailsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.investing.presenters.keystats.InvestingKeyStatsDetailsPresenter$models$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.metrics.InvestingAnalystOpinionsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.investing.presenters.metrics.InvestingEarningsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.investing.presenters.metrics.InvestingFinancialPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.investing.presenters.metrics.InvestingKeyStatsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.investing.presenters.navigation.RealInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.investing.presenters.roundups.RealCardsRoundUpsItemPresenter$toViewModels$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$3$2$1;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter$models$4$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.wallet.roundups.CardsRoundUpsItemViewModel;
import com.squareup.protos.cash.marketdata.model.InvestmentAnalystOpinions;
import com.squareup.protos.cash.marketdata.model.InvestmentEarnings;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityStats;
import com.squareup.protos.cash.marketdata.model.InvestmentFinancials;
import com.squareup.protos.cash.marketdata.server.GetInvestingMetricsResponse;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.investing.resources.CustomOrderConfiguration;
import com.squareup.workflow1.ui.CompatibleKt;
import io.noties.markwon.MarkwonConfiguration;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.investing.presenters.InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(FlowCollector flowCollector, MarkwonConfiguration markwonConfiguration) {
        this.$r8$classId = 25;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012e  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        InvestingPortfolioPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 investingPortfolioPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1;
        int i2;
        InvestingPortfolioPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1 investingPortfolioPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1;
        int i3;
        StockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$1$2$1 stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$1$2$1;
        int i4;
        StockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$2$2$1 stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$2$2$1;
        int i5;
        StockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$3$2$1 stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$3$2$1;
        int i6;
        InvestingActivityHistoryPresenter$models$lambda$0$$inlined$map$1$2$1 investingActivityHistoryPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i7;
        InvestingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1$2$1 investingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i8;
        InvestingFilterSubFiltersPresenter$models$lambda$0$$inlined$map$1$2$1 investingFilterSubFiltersPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i9;
        InvestingCustomOrderPresenter$models$5$1$invokeSuspend$$inlined$map$1$2$1 investingCustomOrderPresenter$models$5$1$invokeSuspend$$inlined$map$1$2$1;
        int i10;
        InvestingCustomOrderPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1 investingCustomOrderPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1;
        int i11;
        InvestingCustomOrderPresenter$models$lambda$37$$inlined$map$1$2$1 investingCustomOrderPresenter$models$lambda$37$$inlined$map$1$2$1;
        int i12;
        InvestingCustomSharePricePresenter$models$lambda$2$$inlined$map$1$2$1 investingCustomSharePricePresenter$models$lambda$2$$inlined$map$1$2$1;
        int i13;
        InvestingOrderTypeSelectionPresenter$canShowAutoInvestForBitcoin$$inlined$map$1$2$1 investingOrderTypeSelectionPresenter$canShowAutoInvestForBitcoin$$inlined$map$1$2$1;
        int i14;
        InvestingOrderTypeSelectionPresenter$orderTypes$$inlined$map$1$2$1 investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$1$2$1;
        int i15;
        InvestingOrderTypeSelectionPresenter$orderTypes$$inlined$map$2$2$1 investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$2$2$1;
        int i16;
        InvestingPeriodSelectionPresenter$models$lambda$0$$inlined$map$1$2$1 investingPeriodSelectionPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i17;
        InvestingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1 investingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i18;
        InvestingKeyStatsDetailsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 investingKeyStatsDetailsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1;
        int i19;
        InvestingKeyStatsDetailsPresenter$models$lambda$2$$inlined$map$1$2$1 investingKeyStatsDetailsPresenter$models$lambda$2$$inlined$map$1$2$1;
        int i20;
        InvestingAnalystOpinionsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 investingAnalystOpinionsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1;
        int i21;
        InvestingEarningsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 investingEarningsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1;
        int i22;
        InvestingFinancialPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 investingFinancialPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1;
        int i23;
        InvestingKeyStatsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 investingKeyStatsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1;
        int i24;
        RealInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$mapNotNull$1$2$1 realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
        int i25;
        RealCardsRoundUpsItemPresenter$toViewModels$$inlined$map$1$2$1 realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$1$2$1;
        int i26;
        Image image;
        Color color;
        InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$1$2$1 investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$1$2$1;
        int i27;
        InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$3$2$1 investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$3$2$1;
        int i28;
        InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$1$2$1 investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$1$2$1;
        int i29;
        InvestingSearchPresenter$models$4$1$1$invokeSuspend$$inlined$map$1$2$1 investingSearchPresenter$models$4$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i30;
        int i31 = this.$r8$classId;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        switch (i31) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i32 = anonymousClass1.label;
                    if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i32 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            InvestingGraphContentModel.Point point = ((InvestingHomeViewEvent.ScrubPoint) obj).point;
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(point, anonymousClass1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj2);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj22 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
            case 1:
                if (continuation instanceof InvestingPortfolioPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) {
                    investingPortfolioPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 = (InvestingPortfolioPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) continuation;
                    int i33 = investingPortfolioPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                    if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                        investingPortfolioPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                        Object obj3 = investingPortfolioPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = investingPortfolioPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            if (obj instanceof InvestingHomeViewEvent.SelectHistoricalRange) {
                                investingPortfolioPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, investingPortfolioPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) == coroutineSingletons3) {
                                    break;
                                }
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                        }
                        break;
                    }
                }
                investingPortfolioPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 = new InvestingPortfolioPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj32 = investingPortfolioPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = investingPortfolioPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                if (i2 != 0) {
                }
            case 2:
                if (continuation instanceof InvestingPortfolioPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1) {
                    investingPortfolioPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1 = (InvestingPortfolioPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1) continuation;
                    int i34 = investingPortfolioPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label;
                    if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                        investingPortfolioPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                        Object obj4 = investingPortfolioPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = investingPortfolioPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            if (obj instanceof InvestingHomeViewEvent.ScrubPoint) {
                                investingPortfolioPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, investingPortfolioPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1) == coroutineSingletons4) {
                                    break;
                                }
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                investingPortfolioPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1 = new InvestingPortfolioPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj42 = investingPortfolioPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = investingPortfolioPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label;
                if (i3 != 0) {
                }
            case 3:
                if (continuation instanceof StockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$1$2$1) {
                    stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$1$2$1 = (StockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$1$2$1) continuation;
                    int i35 = stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$1$2$1.label;
                    if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                        stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                        Object obj5 = stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            Object obj6 = ((PolledData) obj).value;
                            stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj6, stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$1$2$1) == coroutineSingletons5) {
                                break;
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        break;
                    }
                }
                stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$1$2$1 = new StockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj52 = stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$1$2$1.label;
                if (i4 != 0) {
                }
            case 4:
                if (continuation instanceof StockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$2$2$1) {
                    stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$2$2$1 = (StockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$2$2$1) continuation;
                    int i36 = stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$2$2$1.label;
                    if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                        stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$2$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                        Object obj7 = stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$2$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            Object obj8 = ((PolledData) obj).value;
                            stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(obj8, stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$2$2$1) == coroutineSingletons6) {
                                break;
                            }
                        } else if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj7);
                        }
                        break;
                    }
                }
                stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$2$2$1 = new StockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$2$2$1(this, continuation);
                Object obj72 = stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$2$2$1.label;
                if (i5 != 0) {
                }
            case 5:
                if (continuation instanceof StockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$3$2$1) {
                    stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$3$2$1 = (StockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$3$2$1) continuation;
                    int i37 = stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$3$2$1.label;
                    if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                        stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$3$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                        Object obj9 = stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$3$2$1.result;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$3$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            Object obj10 = ((PolledData) obj).value;
                            stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$3$2$1.label = 1;
                            if (flowCollector.emit(obj10, stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$3$2$1) == coroutineSingletons7) {
                                break;
                            }
                        } else if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj9);
                        }
                        break;
                    }
                }
                stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$3$2$1 = new StockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$3$2$1(this, continuation);
                Object obj92 = stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = stockSelectionPresenterHelperKt$getDefaultSearchResults$lambda$0$$inlined$map$3$2$1.label;
                if (i6 != 0) {
                }
            case 6:
                if (continuation instanceof InvestingActivityHistoryPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    investingActivityHistoryPresenter$models$lambda$0$$inlined$map$1$2$1 = (InvestingActivityHistoryPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i38 = investingActivityHistoryPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                        investingActivityHistoryPresenter$models$lambda$0$$inlined$map$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                        Object obj11 = investingActivityHistoryPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = investingActivityHistoryPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj11);
                            String str = (String) obj;
                            Object found = str == null ? Result.NotFound.INSTANCE : new Result.Found(str);
                            investingActivityHistoryPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(found, investingActivityHistoryPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons8) {
                                break;
                            }
                        } else if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj11);
                        }
                        break;
                    }
                }
                investingActivityHistoryPresenter$models$lambda$0$$inlined$map$1$2$1 = new InvestingActivityHistoryPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj112 = investingActivityHistoryPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = investingActivityHistoryPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i7 != 0) {
                }
            case 7:
                if (continuation instanceof InvestingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    investingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1$2$1 = (InvestingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i39 = investingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                        investingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                        Object obj12 = investingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = investingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            FilterDetails filterDetails = (FilterDetails) obj;
                            filterDetails.getClass();
                            investingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit((FilterDetails.Categories) filterDetails, investingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons9) {
                                break;
                            }
                        } else if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj12);
                        }
                        break;
                    }
                }
                investingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1$2$1 = new InvestingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj122 = investingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = investingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i8 != 0) {
                }
            case 8:
                if (continuation instanceof InvestingFilterSubFiltersPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    investingFilterSubFiltersPresenter$models$lambda$0$$inlined$map$1$2$1 = (InvestingFilterSubFiltersPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i40 = investingFilterSubFiltersPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                        investingFilterSubFiltersPresenter$models$lambda$0$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                        Object obj13 = investingFilterSubFiltersPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = investingFilterSubFiltersPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj13);
                            FilterDetails filterDetails2 = (FilterDetails) obj;
                            filterDetails2.getClass();
                            investingFilterSubFiltersPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit((FilterDetails.Subfilters) filterDetails2, investingFilterSubFiltersPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons10) {
                                break;
                            }
                        } else if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj13);
                        }
                        break;
                    }
                }
                investingFilterSubFiltersPresenter$models$lambda$0$$inlined$map$1$2$1 = new InvestingFilterSubFiltersPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj132 = investingFilterSubFiltersPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = investingFilterSubFiltersPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i9 != 0) {
                }
            case 9:
                if (continuation instanceof InvestingCustomOrderPresenter$models$5$1$invokeSuspend$$inlined$map$1$2$1) {
                    investingCustomOrderPresenter$models$5$1$invokeSuspend$$inlined$map$1$2$1 = (InvestingCustomOrderPresenter$models$5$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i41 = investingCustomOrderPresenter$models$5$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                        investingCustomOrderPresenter$models$5$1$invokeSuspend$$inlined$map$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                        Object obj14 = investingCustomOrderPresenter$models$5$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = investingCustomOrderPresenter$models$5$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj14);
                            Object obj15 = ((PolledData) obj).value;
                            investingCustomOrderPresenter$models$5$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj15, investingCustomOrderPresenter$models$5$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons11) {
                                break;
                            }
                        } else if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj14);
                        }
                        break;
                    }
                }
                investingCustomOrderPresenter$models$5$1$invokeSuspend$$inlined$map$1$2$1 = new InvestingCustomOrderPresenter$models$5$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj142 = investingCustomOrderPresenter$models$5$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = investingCustomOrderPresenter$models$5$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i10 != 0) {
                }
            case 10:
                if (continuation instanceof InvestingCustomOrderPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1) {
                    investingCustomOrderPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1 = (InvestingCustomOrderPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i42 = investingCustomOrderPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                        investingCustomOrderPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                        Object obj16 = investingCustomOrderPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = investingCustomOrderPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj16);
                            Object obj17 = ((PolledData) obj).value;
                            investingCustomOrderPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj17, investingCustomOrderPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons12) {
                                break;
                            }
                        } else if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj16);
                        }
                        break;
                    }
                }
                investingCustomOrderPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1 = new InvestingCustomOrderPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj162 = investingCustomOrderPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = investingCustomOrderPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i11 != 0) {
                }
            case 11:
                if (continuation instanceof InvestingCustomOrderPresenter$models$lambda$37$$inlined$map$1$2$1) {
                    investingCustomOrderPresenter$models$lambda$37$$inlined$map$1$2$1 = (InvestingCustomOrderPresenter$models$lambda$37$$inlined$map$1$2$1) continuation;
                    int i43 = investingCustomOrderPresenter$models$lambda$37$$inlined$map$1$2$1.label;
                    if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                        investingCustomOrderPresenter$models$lambda$37$$inlined$map$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                        Object obj18 = investingCustomOrderPresenter$models$lambda$37$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = investingCustomOrderPresenter$models$lambda$37$$inlined$map$1$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj18);
                            CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance = (CryptoBalance$BitcoinBalance) obj;
                            if (cryptoBalance$BitcoinBalance == null) {
                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                break;
                            } else {
                                Money money = CompatibleKt.toMoney(cryptoBalance$BitcoinBalance.amount);
                                investingCustomOrderPresenter$models$lambda$37$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(money, investingCustomOrderPresenter$models$lambda$37$$inlined$map$1$2$1) == coroutineSingletons13) {
                                    break;
                                }
                            }
                        } else if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj18);
                        }
                        break;
                    }
                }
                investingCustomOrderPresenter$models$lambda$37$$inlined$map$1$2$1 = new InvestingCustomOrderPresenter$models$lambda$37$$inlined$map$1$2$1(this, continuation);
                Object obj182 = investingCustomOrderPresenter$models$lambda$37$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = investingCustomOrderPresenter$models$lambda$37$$inlined$map$1$2$1.label;
                if (i12 != 0) {
                }
            case 12:
                if (continuation instanceof InvestingCustomSharePricePresenter$models$lambda$2$$inlined$map$1$2$1) {
                    investingCustomSharePricePresenter$models$lambda$2$$inlined$map$1$2$1 = (InvestingCustomSharePricePresenter$models$lambda$2$$inlined$map$1$2$1) continuation;
                    int i44 = investingCustomSharePricePresenter$models$lambda$2$$inlined$map$1$2$1.label;
                    if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                        investingCustomSharePricePresenter$models$lambda$2$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                        Object obj19 = investingCustomSharePricePresenter$models$lambda$2$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i13 = investingCustomSharePricePresenter$models$lambda$2$$inlined$map$1$2$1.label;
                        if (i13 != 0) {
                            SafeTrace.throwOnFailure(obj19);
                            CurrentPrice price = ((StockDetails) obj).entityWithPrice.getPrice();
                            price.getClass();
                            Money money2 = price.current_price;
                            money2.getClass();
                            investingCustomSharePricePresenter$models$lambda$2$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(money2, investingCustomSharePricePresenter$models$lambda$2$$inlined$map$1$2$1) == coroutineSingletons14) {
                                break;
                            }
                        } else if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj19);
                        }
                        break;
                    }
                }
                investingCustomSharePricePresenter$models$lambda$2$$inlined$map$1$2$1 = new InvestingCustomSharePricePresenter$models$lambda$2$$inlined$map$1$2$1(this, continuation);
                Object obj192 = investingCustomSharePricePresenter$models$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i13 = investingCustomSharePricePresenter$models$lambda$2$$inlined$map$1$2$1.label;
                if (i13 != 0) {
                }
            case 13:
                if (continuation instanceof InvestingOrderTypeSelectionPresenter$canShowAutoInvestForBitcoin$$inlined$map$1$2$1) {
                    investingOrderTypeSelectionPresenter$canShowAutoInvestForBitcoin$$inlined$map$1$2$1 = (InvestingOrderTypeSelectionPresenter$canShowAutoInvestForBitcoin$$inlined$map$1$2$1) continuation;
                    int i45 = investingOrderTypeSelectionPresenter$canShowAutoInvestForBitcoin$$inlined$map$1$2$1.label;
                    if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                        investingOrderTypeSelectionPresenter$canShowAutoInvestForBitcoin$$inlined$map$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                        Object obj20 = investingOrderTypeSelectionPresenter$canShowAutoInvestForBitcoin$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i14 = investingOrderTypeSelectionPresenter$canShowAutoInvestForBitcoin$$inlined$map$1$2$1.label;
                        if (i14 != 0) {
                            SafeTrace.throwOnFailure(obj20);
                            Investing_settings investing_settings = (Investing_settings) obj;
                            Boolean valueOf = Boolean.valueOf((investing_settings != null ? investing_settings.min_scheduled_btc_buy_amt : null) != null);
                            investingOrderTypeSelectionPresenter$canShowAutoInvestForBitcoin$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf, investingOrderTypeSelectionPresenter$canShowAutoInvestForBitcoin$$inlined$map$1$2$1) == coroutineSingletons15) {
                                break;
                            }
                        } else if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj20);
                        }
                        break;
                    }
                }
                investingOrderTypeSelectionPresenter$canShowAutoInvestForBitcoin$$inlined$map$1$2$1 = new InvestingOrderTypeSelectionPresenter$canShowAutoInvestForBitcoin$$inlined$map$1$2$1(this, continuation);
                Object obj202 = investingOrderTypeSelectionPresenter$canShowAutoInvestForBitcoin$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i14 = investingOrderTypeSelectionPresenter$canShowAutoInvestForBitcoin$$inlined$map$1$2$1.label;
                if (i14 != 0) {
                }
            case 14:
                if (continuation instanceof InvestingOrderTypeSelectionPresenter$orderTypes$$inlined$map$1$2$1) {
                    investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$1$2$1 = (InvestingOrderTypeSelectionPresenter$orderTypes$$inlined$map$1$2$1) continuation;
                    int i46 = investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$1$2$1.label;
                    if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                        investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                        Object obj21 = investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i15 = investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$1$2$1.label;
                        if (i15 != 0) {
                            SafeTrace.throwOnFailure(obj21);
                            String displayName = ((StockDetails) obj).entityWithPrice.getDisplayName();
                            investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(displayName, investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$1$2$1) == coroutineSingletons16) {
                                break;
                            }
                        } else if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj21);
                        }
                        break;
                    }
                }
                investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$1$2$1 = new InvestingOrderTypeSelectionPresenter$orderTypes$$inlined$map$1$2$1(this, continuation);
                Object obj212 = investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i15 = investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$1$2$1.label;
                if (i15 != 0) {
                }
            case 15:
                if (continuation instanceof InvestingOrderTypeSelectionPresenter$orderTypes$$inlined$map$2$2$1) {
                    investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$2$2$1 = (InvestingOrderTypeSelectionPresenter$orderTypes$$inlined$map$2$2$1) continuation;
                    int i47 = investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$2$2$1.label;
                    if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                        investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$2$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                        Object obj23 = investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i16 = investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$2$2$1.label;
                        if (i16 != 0) {
                            SafeTrace.throwOnFailure(obj23);
                            Investing_settings investing_settings2 = (Investing_settings) obj;
                            Boolean valueOf2 = Boolean.valueOf((investing_settings2 != null ? investing_settings2.min_scheduled_stock_buy_amt : null) != null);
                            investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(valueOf2, investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$2$2$1) == coroutineSingletons17) {
                                break;
                            }
                        } else if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj23);
                        }
                        break;
                    }
                }
                investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$2$2$1 = new InvestingOrderTypeSelectionPresenter$orderTypes$$inlined$map$2$2$1(this, continuation);
                Object obj232 = investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i16 = investingOrderTypeSelectionPresenter$orderTypes$$inlined$map$2$2$1.label;
                if (i16 != 0) {
                }
            case 16:
                if (continuation instanceof InvestingPeriodSelectionPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    investingPeriodSelectionPresenter$models$lambda$0$$inlined$map$1$2$1 = (InvestingPeriodSelectionPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i48 = investingPeriodSelectionPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                        investingPeriodSelectionPresenter$models$lambda$0$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                        Object obj24 = investingPeriodSelectionPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i17 = investingPeriodSelectionPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i17 != 0) {
                            SafeTrace.throwOnFailure(obj24);
                            CustomOrderConfiguration customOrderConfiguration = ((Investing_settings) obj).custom_order_configuration;
                            investingPeriodSelectionPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(customOrderConfiguration, investingPeriodSelectionPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons18) {
                                break;
                            }
                        } else if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj24);
                        }
                        break;
                    }
                }
                investingPeriodSelectionPresenter$models$lambda$0$$inlined$map$1$2$1 = new InvestingPeriodSelectionPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj242 = investingPeriodSelectionPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i17 = investingPeriodSelectionPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i17 != 0) {
                }
            case 17:
                if (continuation instanceof InvestingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    investingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1 = (InvestingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i49 = investingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                        investingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                        Object obj25 = investingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i18 = investingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i18 != 0) {
                            SafeTrace.throwOnFailure(obj25);
                            Boolean valueOf3 = Boolean.valueOf(((Lifecycle.State) obj).isAtLeast(Lifecycle.State.RESUMED));
                            investingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf3, investingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons19) {
                                break;
                            }
                        } else if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj25);
                        }
                        break;
                    }
                }
                investingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1 = new InvestingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj252 = investingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i18 = investingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i18 != 0) {
                }
            case 18:
                if (continuation instanceof InvestingKeyStatsDetailsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) {
                    investingKeyStatsDetailsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 = (InvestingKeyStatsDetailsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) continuation;
                    int i50 = investingKeyStatsDetailsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                    if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                        investingKeyStatsDetailsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                        Object obj26 = investingKeyStatsDetailsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i19 = investingKeyStatsDetailsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                        if (i19 != 0) {
                            SafeTrace.throwOnFailure(obj26);
                            InvestmentEntityStats investmentEntityStats = ((GetInvestingMetricsResponse) obj).stats;
                            if (investmentEntityStats != null) {
                                investingKeyStatsDetailsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(investmentEntityStats, investingKeyStatsDetailsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) == coroutineSingletons20) {
                                    break;
                                }
                            }
                        } else if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj26);
                        }
                        break;
                    }
                }
                investingKeyStatsDetailsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 = new InvestingKeyStatsDetailsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj262 = investingKeyStatsDetailsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i19 = investingKeyStatsDetailsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                if (i19 != 0) {
                }
            case 19:
                if (continuation instanceof InvestingKeyStatsDetailsPresenter$models$lambda$2$$inlined$map$1$2$1) {
                    investingKeyStatsDetailsPresenter$models$lambda$2$$inlined$map$1$2$1 = (InvestingKeyStatsDetailsPresenter$models$lambda$2$$inlined$map$1$2$1) continuation;
                    int i51 = investingKeyStatsDetailsPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                    if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                        investingKeyStatsDetailsPresenter$models$lambda$2$$inlined$map$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                        Object obj27 = investingKeyStatsDetailsPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i20 = investingKeyStatsDetailsPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                        if (i20 != 0) {
                            SafeTrace.throwOnFailure(obj27);
                            String str2 = ((StockDetails) obj).symbol;
                            investingKeyStatsDetailsPresenter$models$lambda$2$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(str2, investingKeyStatsDetailsPresenter$models$lambda$2$$inlined$map$1$2$1) == coroutineSingletons21) {
                                break;
                            }
                        } else if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj27);
                        }
                        break;
                    }
                }
                investingKeyStatsDetailsPresenter$models$lambda$2$$inlined$map$1$2$1 = new InvestingKeyStatsDetailsPresenter$models$lambda$2$$inlined$map$1$2$1(this, continuation);
                Object obj272 = investingKeyStatsDetailsPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i20 = investingKeyStatsDetailsPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                if (i20 != 0) {
                }
            case 20:
                if (continuation instanceof InvestingAnalystOpinionsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) {
                    investingAnalystOpinionsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 = (InvestingAnalystOpinionsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) continuation;
                    int i52 = investingAnalystOpinionsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                    if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                        investingAnalystOpinionsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                        Object obj28 = investingAnalystOpinionsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i21 = investingAnalystOpinionsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                        if (i21 != 0) {
                            SafeTrace.throwOnFailure(obj28);
                            InvestmentAnalystOpinions investmentAnalystOpinions = ((GetInvestingMetricsResponse) obj).opinions;
                            if (investmentAnalystOpinions != null) {
                                investingAnalystOpinionsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(investmentAnalystOpinions, investingAnalystOpinionsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) == coroutineSingletons22) {
                                    break;
                                }
                            }
                        } else if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj28);
                        }
                        break;
                    }
                }
                investingAnalystOpinionsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 = new InvestingAnalystOpinionsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj282 = investingAnalystOpinionsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i21 = investingAnalystOpinionsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                if (i21 != 0) {
                }
            case 21:
                if (continuation instanceof InvestingEarningsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) {
                    investingEarningsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 = (InvestingEarningsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) continuation;
                    int i53 = investingEarningsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                    if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                        investingEarningsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                        Object obj29 = investingEarningsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i22 = investingEarningsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                        if (i22 != 0) {
                            SafeTrace.throwOnFailure(obj29);
                            InvestmentEarnings investmentEarnings = ((GetInvestingMetricsResponse) obj).earnings;
                            if (investmentEarnings != null) {
                                investingEarningsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(investmentEarnings, investingEarningsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) == coroutineSingletons23) {
                                    break;
                                }
                            }
                        } else if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj29);
                        }
                        break;
                    }
                }
                investingEarningsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 = new InvestingEarningsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj292 = investingEarningsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i22 = investingEarningsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                if (i22 != 0) {
                }
            case 22:
                if (continuation instanceof InvestingFinancialPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) {
                    investingFinancialPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 = (InvestingFinancialPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) continuation;
                    int i54 = investingFinancialPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                    if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                        investingFinancialPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                        Object obj30 = investingFinancialPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i23 = investingFinancialPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                        if (i23 != 0) {
                            SafeTrace.throwOnFailure(obj30);
                            InvestmentFinancials investmentFinancials = ((GetInvestingMetricsResponse) obj).financials;
                            if (investmentFinancials != null) {
                                investingFinancialPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(investmentFinancials, investingFinancialPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) == coroutineSingletons24) {
                                    break;
                                }
                            }
                        } else if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj30);
                        }
                        break;
                    }
                }
                investingFinancialPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 = new InvestingFinancialPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj302 = investingFinancialPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i23 = investingFinancialPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                if (i23 != 0) {
                }
            case 23:
                if (continuation instanceof InvestingKeyStatsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) {
                    investingKeyStatsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 = (InvestingKeyStatsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) continuation;
                    int i55 = investingKeyStatsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                    if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                        investingKeyStatsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                        Object obj31 = investingKeyStatsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i24 = investingKeyStatsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                        if (i24 != 0) {
                            SafeTrace.throwOnFailure(obj31);
                            InvestmentEntityStats investmentEntityStats2 = ((GetInvestingMetricsResponse) obj).stats;
                            if (investmentEntityStats2 != null) {
                                investingKeyStatsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(investmentEntityStats2, investingKeyStatsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) == coroutineSingletons25) {
                                    break;
                                }
                            }
                        } else if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj31);
                        }
                        break;
                    }
                }
                investingKeyStatsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 = new InvestingKeyStatsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj312 = investingKeyStatsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i24 = investingKeyStatsPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                if (i24 != 0) {
                }
            case 24:
                if (continuation instanceof RealInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
                    realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (RealInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
                    int i56 = realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                    if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                        realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                        Object obj33 = realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i25 = realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                        if (i25 != 0) {
                            SafeTrace.throwOnFailure(obj33);
                            InvestingState investingState = (InvestingState) obj;
                            InvestingState.Content content = investingState instanceof InvestingState.Content ? (InvestingState.Content) investingState : null;
                            r6 = content != null ? content.dividendState : null;
                            if (r6 != null) {
                                realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(r6, realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons26) {
                                    break;
                                }
                            }
                        } else if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj33);
                        }
                        break;
                    }
                }
                realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new RealInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj332 = realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i25 = realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i25 != 0) {
                }
            case 25:
                if (continuation instanceof RealCardsRoundUpsItemPresenter$toViewModels$$inlined$map$1$2$1) {
                    realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$1$2$1 = (RealCardsRoundUpsItemPresenter$toViewModels$$inlined$map$1$2$1) continuation;
                    int i57 = realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$1$2$1.label;
                    if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                        realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                        Object obj34 = realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i26 = realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$1$2$1.label;
                        if (i26 != 0) {
                            SafeTrace.throwOnFailure(obj34);
                            Investment_entity investment_entity = (Investment_entity) obj;
                            if (investment_entity != null && (image = investment_entity.icon) != null && (color = investment_entity.entity_color) != null) {
                                r6 = new CardsRoundUpsItemViewModel.DestinationAvatar.Stock(image, color);
                            }
                            realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(r6, realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$1$2$1) == coroutineSingletons27) {
                                break;
                            }
                        } else if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj34);
                        }
                        break;
                    }
                }
                realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$1$2$1 = new RealCardsRoundUpsItemPresenter$toViewModels$$inlined$map$1$2$1(this, continuation);
                Object obj342 = realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i26 = realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$1$2$1.label;
                if (i26 != 0) {
                }
                break;
            case 26:
                if (continuation instanceof InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$1$2$1) {
                    investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$1$2$1 = (InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i58 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                        investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                        Object obj35 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i27 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i27 != 0) {
                            SafeTrace.throwOnFailure(obj35);
                            FilterDetails filterDetails3 = (FilterDetails) obj;
                            filterDetails3.getClass();
                            investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit((FilterDetails.Categories) filterDetails3, investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons28) {
                                break;
                            }
                        } else if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj35);
                        }
                        break;
                    }
                }
                investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$1$2$1 = new InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj352 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i27 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i27 != 0) {
                }
            case 27:
                if (continuation instanceof InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$3$2$1) {
                    investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$3$2$1 = (InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$3$2$1) continuation;
                    int i59 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$3$2$1.label;
                    if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                        investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$3$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                        Object obj36 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$3$2$1.result;
                        CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i28 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$3$2$1.label;
                        if (i28 != 0) {
                            SafeTrace.throwOnFailure(obj36);
                            FilterDetails filterDetails4 = (FilterDetails) obj;
                            filterDetails4.getClass();
                            investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$3$2$1.label = 1;
                            if (flowCollector.emit((FilterDetails.Subfilters) filterDetails4, investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$3$2$1) == coroutineSingletons29) {
                                break;
                            }
                        } else if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj36);
                        }
                        break;
                    }
                }
                investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$3$2$1 = new InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$3$2$1(this, continuation);
                Object obj362 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i28 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$3$2$1.label;
                if (i28 != 0) {
                }
            case 28:
                if (continuation instanceof InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$1$2$1) {
                    investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$1$2$1 = (InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$1$2$1) continuation;
                    int i60 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$1$2$1.label;
                    if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                        investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                        Object obj37 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i29 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$1$2$1.label;
                        if (i29 != 0) {
                            SafeTrace.throwOnFailure(obj37);
                            String str3 = ((CategoryDetails) obj).category.name;
                            investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(str3, investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$1$2$1) == coroutineSingletons30) {
                                break;
                            }
                        } else if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj37);
                        }
                        break;
                    }
                }
                investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$1$2$1 = new InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$1$2$1(this, continuation);
                Object obj372 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i29 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$1$2$1.label;
                if (i29 != 0) {
                }
            default:
                if (continuation instanceof InvestingSearchPresenter$models$4$1$1$invokeSuspend$$inlined$map$1$2$1) {
                    investingSearchPresenter$models$4$1$1$invokeSuspend$$inlined$map$1$2$1 = (InvestingSearchPresenter$models$4$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i61 = investingSearchPresenter$models$4$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                        investingSearchPresenter$models$4$1$1$invokeSuspend$$inlined$map$1$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                        Object obj38 = investingSearchPresenter$models$4$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i30 = investingSearchPresenter$models$4$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i30 != 0) {
                            SafeTrace.throwOnFailure(obj38);
                            ArrayList arrayList = ((CategoryDetails) obj).filters;
                            investingSearchPresenter$models$4$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(arrayList, investingSearchPresenter$models$4$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons31) {
                                break;
                            }
                        } else if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj38);
                        }
                        break;
                    }
                }
                investingSearchPresenter$models$4$1$1$invokeSuspend$$inlined$map$1$2$1 = new InvestingSearchPresenter$models$4$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj382 = investingSearchPresenter$models$4$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons312 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i30 = investingSearchPresenter$models$4$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i30 != 0) {
                }
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(FlowCollector flowCollector, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
    }
}
