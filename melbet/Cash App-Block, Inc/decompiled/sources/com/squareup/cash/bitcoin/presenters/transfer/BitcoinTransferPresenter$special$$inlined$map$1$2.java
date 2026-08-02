package com.squareup.cash.bitcoin.presenters.transfer;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrWidget;
import com.squareup.cash.bitcoin.presenters.applet.graph.BitcoinGraphWidgetPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.graph.BitcoinGraphWidgetPresenter$models$lambda$18$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.graph.BitcoinGraphWidgetPresenter$models$lambda$23$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.graph.BitcoinGraphWidgetPresenter$models$lambda$25$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.map.BitcoinMapCardWidgetPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.news.BitcoinNewsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.news.BitcoinNewsWidgetPresenter$models$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.onramp.BitcoinOnRampWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.pendingidv.BitcoinPendingIdvWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.performance.BitcoinPerformanceSummaryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.stackingtools.BitcoinStackingToolsPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.state.BitcoinToolbarStateKt$rememberToolbarState$lambda$0$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.statsandsettings.BitcoinSettingsWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.limits.util.NonCustodialBitcoinLimitsProvider$special$$inlined$filter$1$2$1;
import com.squareup.cash.bitcoin.presenters.limits.util.NonCustodialBitcoinLimitsProvider$special$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.presenters.limits.util.NonCustodialBitcoinLimitsProvider$special$$inlined$map$2$2$1;
import com.squareup.cash.bitcoin.presenters.limits.util.RealBitcoinLimitsProvider$special$$inlined$filter$1$2$1;
import com.squareup.cash.bitcoin.presenters.limits.util.RealBitcoinLimitsProvider$special$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.presenters.limits.util.RealBitcoinLimitsProvider$special$$inlined$map$2$2$1;
import com.squareup.cash.bitcoin.presenters.limits.util.RealBitcoinLimitsProvider$special$$inlined$map$3$2$1;
import com.squareup.cash.bitcoin.presenters.limits.util.RealBitcoinLimitsProvider$special$$inlined$map$4$2$1;
import com.squareup.cash.bitcoin.presenters.map.RealBitcoinMapEligibilityManager$isLightningWithdrawEligible$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.RealPaidInBitcoinStateManager$states$lambda$4$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.presenters.payinusd.BitcoinPayInUsdPreference;
import com.squareup.cash.bitcoin.presenters.payinusd.RealBitcoinPayInUsdPreferenceManager$bitcoinProfile$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.presenters.payinusd.RealBitcoinPayInUsdPreferenceManager$preference$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.presenters.stablecoin.LegacyStablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.presenters.stablecoin.StablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.viewmodels.applet.graph.BitcoinHomeGraphWidgetViewEvent$GraphEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.map.BitcoinMapCardWidgetViewEvent$OnCardClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.news.BitcoinHomeNewsWidgetViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.onramp.BitcoinOnRampWidgetViewEvent$OptionClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.pendingidv.BitcoinHomePendingIdvWidgetViewEvent$PendingIdvClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.performance.BitcoinPerformanceSummaryViewEvent$DetailsClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.toolbar.BitcoinHomeToolbarEvent;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$StablecoinBalance;
import com.squareup.cash.crypto.backend.eligibility.BitcoinEligibilityStatus;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfile;
import com.squareup.cash.data.profile.CustomerLimitsManager;
import com.squareup.cash.data.profile.JurisdictionConfigManager$JurisdictionConfig;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.db2.CryptocurrencyConfig;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphViewEvent;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.protos.franklin.ui.UiDda;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.CryptocurrencyProfile;

/* loaded from: classes5.dex */
public final class BitcoinTransferPresenter$special$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter$special$$inlined$map$1$2$1, reason: invalid class name */
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
            return BitcoinTransferPresenter$special$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ BitcoinTransferPresenter$special$$inlined$map$1$2(FlowCollector flowCollector, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0142  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        Object obj2;
        BitcoinGraphWidgetPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1 bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1;
        int i2;
        BitcoinGraphWidgetPresenter$models$lambda$18$$inlined$map$1$2$1 bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$map$1$2$1;
        int i3;
        BitcoinGraphWidgetPresenter$models$lambda$23$$inlined$filterIsInstance$1$2$1 bitcoinGraphWidgetPresenter$models$lambda$23$$inlined$filterIsInstance$1$2$1;
        int i4;
        BitcoinGraphWidgetPresenter$models$lambda$25$$inlined$filterIsInstance$1$2$1 bitcoinGraphWidgetPresenter$models$lambda$25$$inlined$filterIsInstance$1$2$1;
        int i5;
        BitcoinMapCardWidgetPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1 bitcoinMapCardWidgetPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1;
        int i6;
        BitcoinNewsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1;
        int i7;
        BitcoinNewsWidgetPresenter$models$lambda$2$$inlined$map$1$2$1 bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$map$1$2$1;
        int i8;
        BitcoinOnRampWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 bitcoinOnRampWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1;
        int i9;
        BitcoinPendingIdvWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 bitcoinPendingIdvWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
        int i10;
        BitcoinPerformanceSummaryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1 bitcoinPerformanceSummaryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1;
        int i11;
        BitcoinStackingToolsPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1 bitcoinStackingToolsPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1;
        int i12;
        BitcoinToolbarStateKt$rememberToolbarState$lambda$0$$inlined$filterIsInstance$1$2$1 bitcoinToolbarStateKt$rememberToolbarState$lambda$0$$inlined$filterIsInstance$1$2$1;
        int i13;
        BitcoinSettingsWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 bitcoinSettingsWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
        int i14;
        NonCustodialBitcoinLimitsProvider$special$$inlined$filter$1$2$1 nonCustodialBitcoinLimitsProvider$special$$inlined$filter$1$2$1;
        int i15;
        NonCustodialBitcoinLimitsProvider$special$$inlined$map$1$2$1 nonCustodialBitcoinLimitsProvider$special$$inlined$map$1$2$1;
        int i16;
        NonCustodialBitcoinLimitsProvider$special$$inlined$map$2$2$1 nonCustodialBitcoinLimitsProvider$special$$inlined$map$2$2$1;
        int i17;
        RealBitcoinLimitsProvider$special$$inlined$filter$1$2$1 realBitcoinLimitsProvider$special$$inlined$filter$1$2$1;
        int i18;
        RealBitcoinLimitsProvider$special$$inlined$map$1$2$1 realBitcoinLimitsProvider$special$$inlined$map$1$2$1;
        int i19;
        RealBitcoinLimitsProvider$special$$inlined$map$2$2$1 realBitcoinLimitsProvider$special$$inlined$map$2$2$1;
        int i20;
        RealBitcoinLimitsProvider$special$$inlined$map$3$2$1 realBitcoinLimitsProvider$special$$inlined$map$3$2$1;
        int i21;
        RealBitcoinLimitsProvider$special$$inlined$map$4$2$1 realBitcoinLimitsProvider$special$$inlined$map$4$2$1;
        int i22;
        RealBitcoinMapEligibilityManager$isLightningWithdrawEligible$$inlined$map$1$2$1 realBitcoinMapEligibilityManager$isLightningWithdrawEligible$$inlined$map$1$2$1;
        int i23;
        RealPaidInBitcoinStateManager$states$lambda$4$$inlined$map$1$2$1 realPaidInBitcoinStateManager$states$lambda$4$$inlined$map$1$2$1;
        int i24;
        RealBitcoinPayInUsdPreferenceManager$bitcoinProfile$$inlined$map$1$2$1 realBitcoinPayInUsdPreferenceManager$bitcoinProfile$$inlined$map$1$2$1;
        int i25;
        Object obj3;
        RealBitcoinPayInUsdPreferenceManager$preference$$inlined$map$1$2$1 realBitcoinPayInUsdPreferenceManager$preference$$inlined$map$1$2$1;
        int i26;
        LegacyStablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1 legacyStablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i27;
        StablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1 stablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i28;
        RealBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$1$2$1 realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$1$2$1;
        int i29;
        RealBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$2$2$1 realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$2$2$1;
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
                        Object obj4 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig = (JurisdictionConfigManager$JurisdictionConfig) obj;
                            obj2 = jurisdictionConfigManager$JurisdictionConfig != null ? jurisdictionConfigManager$JurisdictionConfig.defaultCurrency : null;
                            obj2.getClass();
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj2, anonymousClass1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj42 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
            case 1:
                if (continuation instanceof BitcoinGraphWidgetPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1) {
                    bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1 = (BitcoinGraphWidgetPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1) continuation;
                    int i33 = bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.label;
                    if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                        Object obj5 = bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            if (obj instanceof BitcoinHomeGraphWidgetViewEvent$GraphEvent) {
                                bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1) == coroutineSingletons3) {
                                    break;
                                }
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        break;
                    }
                }
                bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1 = new BitcoinGraphWidgetPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj52 = bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.label;
                if (i2 != 0) {
                }
            case 2:
                if (continuation instanceof BitcoinGraphWidgetPresenter$models$lambda$18$$inlined$map$1$2$1) {
                    bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$map$1$2$1 = (BitcoinGraphWidgetPresenter$models$lambda$18$$inlined$map$1$2$1) continuation;
                    int i34 = bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$map$1$2$1.label;
                    if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$map$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                        Object obj6 = bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            InvestingGraphViewEvent investingGraphViewEvent = ((BitcoinHomeGraphWidgetViewEvent$GraphEvent) obj).event;
                            bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(investingGraphViewEvent, bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$map$1$2$1) == coroutineSingletons4) {
                                break;
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj6);
                        }
                        break;
                    }
                }
                bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$map$1$2$1 = new BitcoinGraphWidgetPresenter$models$lambda$18$$inlined$map$1$2$1(this, continuation);
                Object obj62 = bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = bitcoinGraphWidgetPresenter$models$lambda$18$$inlined$map$1$2$1.label;
                if (i3 != 0) {
                }
            case 3:
                if (continuation instanceof BitcoinGraphWidgetPresenter$models$lambda$23$$inlined$filterIsInstance$1$2$1) {
                    bitcoinGraphWidgetPresenter$models$lambda$23$$inlined$filterIsInstance$1$2$1 = (BitcoinGraphWidgetPresenter$models$lambda$23$$inlined$filterIsInstance$1$2$1) continuation;
                    int i35 = bitcoinGraphWidgetPresenter$models$lambda$23$$inlined$filterIsInstance$1$2$1.label;
                    if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinGraphWidgetPresenter$models$lambda$23$$inlined$filterIsInstance$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                        Object obj7 = bitcoinGraphWidgetPresenter$models$lambda$23$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = bitcoinGraphWidgetPresenter$models$lambda$23$$inlined$filterIsInstance$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            if (obj instanceof InvestingGraphViewEvent.SelectRange) {
                                bitcoinGraphWidgetPresenter$models$lambda$23$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, bitcoinGraphWidgetPresenter$models$lambda$23$$inlined$filterIsInstance$1$2$1) == coroutineSingletons5) {
                                    break;
                                }
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj7);
                        }
                        break;
                    }
                }
                bitcoinGraphWidgetPresenter$models$lambda$23$$inlined$filterIsInstance$1$2$1 = new BitcoinGraphWidgetPresenter$models$lambda$23$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj72 = bitcoinGraphWidgetPresenter$models$lambda$23$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = bitcoinGraphWidgetPresenter$models$lambda$23$$inlined$filterIsInstance$1$2$1.label;
                if (i4 != 0) {
                }
            case 4:
                if (continuation instanceof BitcoinGraphWidgetPresenter$models$lambda$25$$inlined$filterIsInstance$1$2$1) {
                    bitcoinGraphWidgetPresenter$models$lambda$25$$inlined$filterIsInstance$1$2$1 = (BitcoinGraphWidgetPresenter$models$lambda$25$$inlined$filterIsInstance$1$2$1) continuation;
                    int i36 = bitcoinGraphWidgetPresenter$models$lambda$25$$inlined$filterIsInstance$1$2$1.label;
                    if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinGraphWidgetPresenter$models$lambda$25$$inlined$filterIsInstance$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                        Object obj8 = bitcoinGraphWidgetPresenter$models$lambda$25$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = bitcoinGraphWidgetPresenter$models$lambda$25$$inlined$filterIsInstance$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            if (obj instanceof InvestingGraphViewEvent.ScrubPoint) {
                                bitcoinGraphWidgetPresenter$models$lambda$25$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, bitcoinGraphWidgetPresenter$models$lambda$25$$inlined$filterIsInstance$1$2$1) == coroutineSingletons6) {
                                    break;
                                }
                            }
                        } else if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj8);
                        }
                        break;
                    }
                }
                bitcoinGraphWidgetPresenter$models$lambda$25$$inlined$filterIsInstance$1$2$1 = new BitcoinGraphWidgetPresenter$models$lambda$25$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj82 = bitcoinGraphWidgetPresenter$models$lambda$25$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = bitcoinGraphWidgetPresenter$models$lambda$25$$inlined$filterIsInstance$1$2$1.label;
                if (i5 != 0) {
                }
            case 5:
                if (continuation instanceof BitcoinMapCardWidgetPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1) {
                    bitcoinMapCardWidgetPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1 = (BitcoinMapCardWidgetPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1) continuation;
                    int i37 = bitcoinMapCardWidgetPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label;
                    if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinMapCardWidgetPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                        Object obj9 = bitcoinMapCardWidgetPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = bitcoinMapCardWidgetPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            if (obj instanceof BitcoinMapCardWidgetViewEvent$OnCardClicked) {
                                bitcoinMapCardWidgetPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, bitcoinMapCardWidgetPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1) == coroutineSingletons7) {
                                    break;
                                }
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
                bitcoinMapCardWidgetPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1 = new BitcoinMapCardWidgetPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj92 = bitcoinMapCardWidgetPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = bitcoinMapCardWidgetPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label;
                if (i6 != 0) {
                }
            case 6:
                if (continuation instanceof BitcoinNewsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) {
                    bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 = (BitcoinNewsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) continuation;
                    int i38 = bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                    if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                        Object obj10 = bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            if (obj instanceof BitcoinHomeNewsWidgetViewEvent) {
                                bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) == coroutineSingletons8) {
                                    break;
                                }
                            }
                        } else if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj10);
                        }
                        break;
                    }
                }
                bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 = new BitcoinNewsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj102 = bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                if (i7 != 0) {
                }
            case 7:
                if (continuation instanceof BitcoinNewsWidgetPresenter$models$lambda$2$$inlined$map$1$2$1) {
                    bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$map$1$2$1 = (BitcoinNewsWidgetPresenter$models$lambda$2$$inlined$map$1$2$1) continuation;
                    int i39 = bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                    if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$map$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                        Object obj11 = bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj11);
                            InvestingCryptoNewsViewEvent investingCryptoNewsViewEvent = ((BitcoinHomeNewsWidgetViewEvent) obj).event;
                            bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(investingCryptoNewsViewEvent, bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$map$1$2$1) == coroutineSingletons9) {
                                break;
                            }
                        } else if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj11);
                        }
                        break;
                    }
                }
                bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$map$1$2$1 = new BitcoinNewsWidgetPresenter$models$lambda$2$$inlined$map$1$2$1(this, continuation);
                Object obj112 = bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = bitcoinNewsWidgetPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                if (i8 != 0) {
                }
            case 8:
                if (continuation instanceof BitcoinOnRampWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) {
                    bitcoinOnRampWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 = (BitcoinOnRampWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) continuation;
                    int i40 = bitcoinOnRampWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                    if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinOnRampWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                        Object obj12 = bitcoinOnRampWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = bitcoinOnRampWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            if (obj instanceof BitcoinOnRampWidgetViewEvent$OptionClicked) {
                                bitcoinOnRampWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, bitcoinOnRampWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) == coroutineSingletons10) {
                                    break;
                                }
                            }
                        } else if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj12);
                        }
                        break;
                    }
                }
                bitcoinOnRampWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 = new BitcoinOnRampWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj122 = bitcoinOnRampWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = bitcoinOnRampWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                if (i9 != 0) {
                }
            case 9:
                if (continuation instanceof BitcoinPendingIdvWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) {
                    bitcoinPendingIdvWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = (BitcoinPendingIdvWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) continuation;
                    int i41 = bitcoinPendingIdvWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                    if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinPendingIdvWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                        Object obj13 = bitcoinPendingIdvWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = bitcoinPendingIdvWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj13);
                            if (obj instanceof BitcoinHomePendingIdvWidgetViewEvent$PendingIdvClicked) {
                                bitcoinPendingIdvWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, bitcoinPendingIdvWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) == coroutineSingletons11) {
                                    break;
                                }
                            }
                        } else if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj13);
                        }
                        break;
                    }
                }
                bitcoinPendingIdvWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = new BitcoinPendingIdvWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj132 = bitcoinPendingIdvWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = bitcoinPendingIdvWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                if (i10 != 0) {
                }
            case 10:
                if (continuation instanceof BitcoinPerformanceSummaryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1) {
                    bitcoinPerformanceSummaryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1 = (BitcoinPerformanceSummaryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1) continuation;
                    int i42 = bitcoinPerformanceSummaryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label;
                    if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinPerformanceSummaryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                        Object obj14 = bitcoinPerformanceSummaryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = bitcoinPerformanceSummaryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj14);
                            if (obj instanceof BitcoinPerformanceSummaryViewEvent$DetailsClicked) {
                                bitcoinPerformanceSummaryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, bitcoinPerformanceSummaryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1) == coroutineSingletons12) {
                                    break;
                                }
                            }
                        } else if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj14);
                        }
                        break;
                    }
                }
                bitcoinPerformanceSummaryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1 = new BitcoinPerformanceSummaryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj142 = bitcoinPerformanceSummaryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = bitcoinPerformanceSummaryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label;
                if (i11 != 0) {
                }
            case 11:
                if (continuation instanceof BitcoinStackingToolsPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1) {
                    bitcoinStackingToolsPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1 = (BitcoinStackingToolsPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1) continuation;
                    int i43 = bitcoinStackingToolsPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label;
                    if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinStackingToolsPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                        Object obj15 = bitcoinStackingToolsPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = bitcoinStackingToolsPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj15);
                            if (obj instanceof BitcoinStackingToolsViewEvent) {
                                bitcoinStackingToolsPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, bitcoinStackingToolsPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1) == coroutineSingletons13) {
                                    break;
                                }
                            }
                        } else if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj15);
                        }
                        break;
                    }
                }
                bitcoinStackingToolsPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1 = new BitcoinStackingToolsPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj152 = bitcoinStackingToolsPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = bitcoinStackingToolsPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label;
                if (i12 != 0) {
                }
            case 12:
                if (continuation instanceof BitcoinToolbarStateKt$rememberToolbarState$lambda$0$$inlined$filterIsInstance$1$2$1) {
                    bitcoinToolbarStateKt$rememberToolbarState$lambda$0$$inlined$filterIsInstance$1$2$1 = (BitcoinToolbarStateKt$rememberToolbarState$lambda$0$$inlined$filterIsInstance$1$2$1) continuation;
                    int i44 = bitcoinToolbarStateKt$rememberToolbarState$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                    if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinToolbarStateKt$rememberToolbarState$lambda$0$$inlined$filterIsInstance$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                        Object obj16 = bitcoinToolbarStateKt$rememberToolbarState$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i13 = bitcoinToolbarStateKt$rememberToolbarState$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                        if (i13 != 0) {
                            SafeTrace.throwOnFailure(obj16);
                            if (obj instanceof BitcoinHomeToolbarEvent) {
                                bitcoinToolbarStateKt$rememberToolbarState$lambda$0$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, bitcoinToolbarStateKt$rememberToolbarState$lambda$0$$inlined$filterIsInstance$1$2$1) == coroutineSingletons14) {
                                    break;
                                }
                            }
                        } else if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj16);
                        }
                        break;
                    }
                }
                bitcoinToolbarStateKt$rememberToolbarState$lambda$0$$inlined$filterIsInstance$1$2$1 = new BitcoinToolbarStateKt$rememberToolbarState$lambda$0$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj162 = bitcoinToolbarStateKt$rememberToolbarState$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i13 = bitcoinToolbarStateKt$rememberToolbarState$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                if (i13 != 0) {
                }
            case 13:
                if (continuation instanceof BitcoinSettingsWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) {
                    bitcoinSettingsWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = (BitcoinSettingsWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) continuation;
                    int i45 = bitcoinSettingsWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                    if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinSettingsWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                        Object obj17 = bitcoinSettingsWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i14 = bitcoinSettingsWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                        if (i14 != 0) {
                            SafeTrace.throwOnFailure(obj17);
                            if (obj instanceof BitcoinSettingsWidgetViewEvent) {
                                bitcoinSettingsWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, bitcoinSettingsWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) == coroutineSingletons15) {
                                    break;
                                }
                            }
                        } else if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj17);
                        }
                        break;
                    }
                }
                bitcoinSettingsWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = new BitcoinSettingsWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj172 = bitcoinSettingsWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i14 = bitcoinSettingsWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                if (i14 != 0) {
                }
            case 14:
                if (continuation instanceof NonCustodialBitcoinLimitsProvider$special$$inlined$filter$1$2$1) {
                    nonCustodialBitcoinLimitsProvider$special$$inlined$filter$1$2$1 = (NonCustodialBitcoinLimitsProvider$special$$inlined$filter$1$2$1) continuation;
                    int i46 = nonCustodialBitcoinLimitsProvider$special$$inlined$filter$1$2$1.label;
                    if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                        nonCustodialBitcoinLimitsProvider$special$$inlined$filter$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                        Object obj18 = nonCustodialBitcoinLimitsProvider$special$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i15 = nonCustodialBitcoinLimitsProvider$special$$inlined$filter$1$2$1.label;
                        if (i15 != 0) {
                            SafeTrace.throwOnFailure(obj18);
                            if (((Money) obj).currency_code != CurrencyCode.BTC) {
                                nonCustodialBitcoinLimitsProvider$special$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, nonCustodialBitcoinLimitsProvider$special$$inlined$filter$1$2$1) == coroutineSingletons16) {
                                    break;
                                }
                            }
                        } else if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj18);
                        }
                        break;
                    }
                }
                nonCustodialBitcoinLimitsProvider$special$$inlined$filter$1$2$1 = new NonCustodialBitcoinLimitsProvider$special$$inlined$filter$1$2$1(this, continuation);
                Object obj182 = nonCustodialBitcoinLimitsProvider$special$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i15 = nonCustodialBitcoinLimitsProvider$special$$inlined$filter$1$2$1.label;
                if (i15 != 0) {
                }
            case 15:
                if (continuation instanceof NonCustodialBitcoinLimitsProvider$special$$inlined$map$1$2$1) {
                    nonCustodialBitcoinLimitsProvider$special$$inlined$map$1$2$1 = (NonCustodialBitcoinLimitsProvider$special$$inlined$map$1$2$1) continuation;
                    int i47 = nonCustodialBitcoinLimitsProvider$special$$inlined$map$1$2$1.label;
                    if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                        nonCustodialBitcoinLimitsProvider$special$$inlined$map$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                        Object obj19 = nonCustodialBitcoinLimitsProvider$special$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i16 = nonCustodialBitcoinLimitsProvider$special$$inlined$map$1$2$1.label;
                        if (i16 != 0) {
                            SafeTrace.throwOnFailure(obj19);
                            JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig2 = (JurisdictionConfigManager$JurisdictionConfig) obj;
                            obj2 = jurisdictionConfigManager$JurisdictionConfig2 != null ? jurisdictionConfigManager$JurisdictionConfig2.defaultCurrency : null;
                            nonCustodialBitcoinLimitsProvider$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj2, nonCustodialBitcoinLimitsProvider$special$$inlined$map$1$2$1) == coroutineSingletons17) {
                                break;
                            }
                        } else if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj19);
                        }
                        break;
                    }
                }
                nonCustodialBitcoinLimitsProvider$special$$inlined$map$1$2$1 = new NonCustodialBitcoinLimitsProvider$special$$inlined$map$1$2$1(this, continuation);
                Object obj192 = nonCustodialBitcoinLimitsProvider$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i16 = nonCustodialBitcoinLimitsProvider$special$$inlined$map$1$2$1.label;
                if (i16 != 0) {
                }
            case 16:
                if (continuation instanceof NonCustodialBitcoinLimitsProvider$special$$inlined$map$2$2$1) {
                    nonCustodialBitcoinLimitsProvider$special$$inlined$map$2$2$1 = (NonCustodialBitcoinLimitsProvider$special$$inlined$map$2$2$1) continuation;
                    int i48 = nonCustodialBitcoinLimitsProvider$special$$inlined$map$2$2$1.label;
                    if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                        nonCustodialBitcoinLimitsProvider$special$$inlined$map$2$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                        Object obj20 = nonCustodialBitcoinLimitsProvider$special$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i17 = nonCustodialBitcoinLimitsProvider$special$$inlined$map$2$2$1.label;
                        if (i17 != 0) {
                            SafeTrace.throwOnFailure(obj20);
                            CustomerLimitsManager.TransactionLimit transactionLimit = new CustomerLimitsManager.TransactionLimit(null, (Money) obj);
                            nonCustodialBitcoinLimitsProvider$special$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(transactionLimit, nonCustodialBitcoinLimitsProvider$special$$inlined$map$2$2$1) == coroutineSingletons18) {
                                break;
                            }
                        } else if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj20);
                        }
                        break;
                    }
                }
                nonCustodialBitcoinLimitsProvider$special$$inlined$map$2$2$1 = new NonCustodialBitcoinLimitsProvider$special$$inlined$map$2$2$1(this, continuation);
                Object obj202 = nonCustodialBitcoinLimitsProvider$special$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i17 = nonCustodialBitcoinLimitsProvider$special$$inlined$map$2$2$1.label;
                if (i17 != 0) {
                }
            case 17:
                if (continuation instanceof RealBitcoinLimitsProvider$special$$inlined$filter$1$2$1) {
                    realBitcoinLimitsProvider$special$$inlined$filter$1$2$1 = (RealBitcoinLimitsProvider$special$$inlined$filter$1$2$1) continuation;
                    int i49 = realBitcoinLimitsProvider$special$$inlined$filter$1$2$1.label;
                    if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinLimitsProvider$special$$inlined$filter$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                        Object obj21 = realBitcoinLimitsProvider$special$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i18 = realBitcoinLimitsProvider$special$$inlined$filter$1$2$1.label;
                        if (i18 != 0) {
                            SafeTrace.throwOnFailure(obj21);
                            if (((Money) obj).currency_code != CurrencyCode.BTC) {
                                realBitcoinLimitsProvider$special$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, realBitcoinLimitsProvider$special$$inlined$filter$1$2$1) == coroutineSingletons19) {
                                    break;
                                }
                            }
                        } else if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj21);
                        }
                        break;
                    }
                }
                realBitcoinLimitsProvider$special$$inlined$filter$1$2$1 = new RealBitcoinLimitsProvider$special$$inlined$filter$1$2$1(this, continuation);
                Object obj212 = realBitcoinLimitsProvider$special$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i18 = realBitcoinLimitsProvider$special$$inlined$filter$1$2$1.label;
                if (i18 != 0) {
                }
            case 18:
                if (continuation instanceof RealBitcoinLimitsProvider$special$$inlined$map$1$2$1) {
                    realBitcoinLimitsProvider$special$$inlined$map$1$2$1 = (RealBitcoinLimitsProvider$special$$inlined$map$1$2$1) continuation;
                    int i50 = realBitcoinLimitsProvider$special$$inlined$map$1$2$1.label;
                    if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinLimitsProvider$special$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                        Object obj22 = realBitcoinLimitsProvider$special$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i19 = realBitcoinLimitsProvider$special$$inlined$map$1$2$1.label;
                        if (i19 != 0) {
                            SafeTrace.throwOnFailure(obj22);
                            JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig3 = (JurisdictionConfigManager$JurisdictionConfig) obj;
                            obj2 = jurisdictionConfigManager$JurisdictionConfig3 != null ? jurisdictionConfigManager$JurisdictionConfig3.defaultCurrency : null;
                            realBitcoinLimitsProvider$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj2, realBitcoinLimitsProvider$special$$inlined$map$1$2$1) == coroutineSingletons20) {
                                break;
                            }
                        } else if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj22);
                        }
                        break;
                    }
                }
                realBitcoinLimitsProvider$special$$inlined$map$1$2$1 = new RealBitcoinLimitsProvider$special$$inlined$map$1$2$1(this, continuation);
                Object obj222 = realBitcoinLimitsProvider$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i19 = realBitcoinLimitsProvider$special$$inlined$map$1$2$1.label;
                if (i19 != 0) {
                }
            case 19:
                if (continuation instanceof RealBitcoinLimitsProvider$special$$inlined$map$2$2$1) {
                    realBitcoinLimitsProvider$special$$inlined$map$2$2$1 = (RealBitcoinLimitsProvider$special$$inlined$map$2$2$1) continuation;
                    int i51 = realBitcoinLimitsProvider$special$$inlined$map$2$2$1.label;
                    if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinLimitsProvider$special$$inlined$map$2$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                        Object obj23 = realBitcoinLimitsProvider$special$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i20 = realBitcoinLimitsProvider$special$$inlined$map$2$2$1.label;
                        if (i20 != 0) {
                            SafeTrace.throwOnFailure(obj23);
                            JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig4 = (JurisdictionConfigManager$JurisdictionConfig) obj;
                            obj2 = jurisdictionConfigManager$JurisdictionConfig4 != null ? jurisdictionConfigManager$JurisdictionConfig4.defaultCurrency : null;
                            realBitcoinLimitsProvider$special$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(obj2, realBitcoinLimitsProvider$special$$inlined$map$2$2$1) == coroutineSingletons21) {
                                break;
                            }
                        } else if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj23);
                        }
                        break;
                    }
                }
                realBitcoinLimitsProvider$special$$inlined$map$2$2$1 = new RealBitcoinLimitsProvider$special$$inlined$map$2$2$1(this, continuation);
                Object obj232 = realBitcoinLimitsProvider$special$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i20 = realBitcoinLimitsProvider$special$$inlined$map$2$2$1.label;
                if (i20 != 0) {
                }
            case 20:
                if (continuation instanceof RealBitcoinLimitsProvider$special$$inlined$map$3$2$1) {
                    realBitcoinLimitsProvider$special$$inlined$map$3$2$1 = (RealBitcoinLimitsProvider$special$$inlined$map$3$2$1) continuation;
                    int i52 = realBitcoinLimitsProvider$special$$inlined$map$3$2$1.label;
                    if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinLimitsProvider$special$$inlined$map$3$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                        Object obj24 = realBitcoinLimitsProvider$special$$inlined$map$3$2$1.result;
                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i21 = realBitcoinLimitsProvider$special$$inlined$map$3$2$1.label;
                        if (i21 != 0) {
                            SafeTrace.throwOnFailure(obj24);
                            Long l = ((CryptocurrencyConfig) obj).minimum_withdrawal_limit_sats;
                            realBitcoinLimitsProvider$special$$inlined$map$3$2$1.label = 1;
                            if (flowCollector.emit(l, realBitcoinLimitsProvider$special$$inlined$map$3$2$1) == coroutineSingletons22) {
                                break;
                            }
                        } else if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj24);
                        }
                        break;
                    }
                }
                realBitcoinLimitsProvider$special$$inlined$map$3$2$1 = new RealBitcoinLimitsProvider$special$$inlined$map$3$2$1(this, continuation);
                Object obj242 = realBitcoinLimitsProvider$special$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i21 = realBitcoinLimitsProvider$special$$inlined$map$3$2$1.label;
                if (i21 != 0) {
                }
            case 21:
                if (continuation instanceof RealBitcoinLimitsProvider$special$$inlined$map$4$2$1) {
                    realBitcoinLimitsProvider$special$$inlined$map$4$2$1 = (RealBitcoinLimitsProvider$special$$inlined$map$4$2$1) continuation;
                    int i53 = realBitcoinLimitsProvider$special$$inlined$map$4$2$1.label;
                    if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinLimitsProvider$special$$inlined$map$4$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                        Object obj25 = realBitcoinLimitsProvider$special$$inlined$map$4$2$1.result;
                        CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i22 = realBitcoinLimitsProvider$special$$inlined$map$4$2$1.label;
                        if (i22 != 0) {
                            SafeTrace.throwOnFailure(obj25);
                            Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) ((FeatureFlag$JsonFeatureFlag.Options) obj).value);
                            realBitcoinLimitsProvider$special$$inlined$map$4$2$1.label = 1;
                            if (flowCollector.emit(firstOrNull, realBitcoinLimitsProvider$special$$inlined$map$4$2$1) == coroutineSingletons23) {
                                break;
                            }
                        } else if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj25);
                        }
                        break;
                    }
                }
                realBitcoinLimitsProvider$special$$inlined$map$4$2$1 = new RealBitcoinLimitsProvider$special$$inlined$map$4$2$1(this, continuation);
                Object obj252 = realBitcoinLimitsProvider$special$$inlined$map$4$2$1.result;
                CoroutineSingletons coroutineSingletons232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i22 = realBitcoinLimitsProvider$special$$inlined$map$4$2$1.label;
                if (i22 != 0) {
                }
            case 22:
                if (continuation instanceof RealBitcoinMapEligibilityManager$isLightningWithdrawEligible$$inlined$map$1$2$1) {
                    realBitcoinMapEligibilityManager$isLightningWithdrawEligible$$inlined$map$1$2$1 = (RealBitcoinMapEligibilityManager$isLightningWithdrawEligible$$inlined$map$1$2$1) continuation;
                    int i54 = realBitcoinMapEligibilityManager$isLightningWithdrawEligible$$inlined$map$1$2$1.label;
                    if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinMapEligibilityManager$isLightningWithdrawEligible$$inlined$map$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                        Object obj26 = realBitcoinMapEligibilityManager$isLightningWithdrawEligible$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i23 = realBitcoinMapEligibilityManager$isLightningWithdrawEligible$$inlined$map$1$2$1.label;
                        if (i23 != 0) {
                            SafeTrace.throwOnFailure(obj26);
                            Boolean valueOf = Boolean.valueOf(((BitcoinEligibilityStatus) obj) != BitcoinEligibilityStatus.INELIGIBLE);
                            realBitcoinMapEligibilityManager$isLightningWithdrawEligible$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf, realBitcoinMapEligibilityManager$isLightningWithdrawEligible$$inlined$map$1$2$1) == coroutineSingletons24) {
                                break;
                            }
                        } else if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj26);
                        }
                        break;
                    }
                }
                realBitcoinMapEligibilityManager$isLightningWithdrawEligible$$inlined$map$1$2$1 = new RealBitcoinMapEligibilityManager$isLightningWithdrawEligible$$inlined$map$1$2$1(this, continuation);
                Object obj262 = realBitcoinMapEligibilityManager$isLightningWithdrawEligible$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i23 = realBitcoinMapEligibilityManager$isLightningWithdrawEligible$$inlined$map$1$2$1.label;
                if (i23 != 0) {
                }
            case 23:
                if (continuation instanceof RealPaidInBitcoinStateManager$states$lambda$4$$inlined$map$1$2$1) {
                    realPaidInBitcoinStateManager$states$lambda$4$$inlined$map$1$2$1 = (RealPaidInBitcoinStateManager$states$lambda$4$$inlined$map$1$2$1) continuation;
                    int i55 = realPaidInBitcoinStateManager$states$lambda$4$$inlined$map$1$2$1.label;
                    if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                        realPaidInBitcoinStateManager$states$lambda$4$$inlined$map$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                        Object obj27 = realPaidInBitcoinStateManager$states$lambda$4$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i24 = realPaidInBitcoinStateManager$states$lambda$4$$inlined$map$1$2$1.label;
                        if (i24 != 0) {
                            SafeTrace.throwOnFailure(obj27);
                            UiDda uiDda = (UiDda) obj;
                            obj2 = uiDda != null ? uiDda.account : null;
                            realPaidInBitcoinStateManager$states$lambda$4$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj2, realPaidInBitcoinStateManager$states$lambda$4$$inlined$map$1$2$1) == coroutineSingletons25) {
                                break;
                            }
                        } else if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj27);
                        }
                        break;
                    }
                }
                realPaidInBitcoinStateManager$states$lambda$4$$inlined$map$1$2$1 = new RealPaidInBitcoinStateManager$states$lambda$4$$inlined$map$1$2$1(this, continuation);
                Object obj272 = realPaidInBitcoinStateManager$states$lambda$4$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i24 = realPaidInBitcoinStateManager$states$lambda$4$$inlined$map$1$2$1.label;
                if (i24 != 0) {
                }
            case 24:
                if (continuation instanceof RealBitcoinPayInUsdPreferenceManager$bitcoinProfile$$inlined$map$1$2$1) {
                    realBitcoinPayInUsdPreferenceManager$bitcoinProfile$$inlined$map$1$2$1 = (RealBitcoinPayInUsdPreferenceManager$bitcoinProfile$$inlined$map$1$2$1) continuation;
                    int i56 = realBitcoinPayInUsdPreferenceManager$bitcoinProfile$$inlined$map$1$2$1.label;
                    if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinPayInUsdPreferenceManager$bitcoinProfile$$inlined$map$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                        Object obj28 = realBitcoinPayInUsdPreferenceManager$bitcoinProfile$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i25 = realBitcoinPayInUsdPreferenceManager$bitcoinProfile$$inlined$map$1$2$1.label;
                        if (i25 != 0) {
                            SafeTrace.throwOnFailure(obj28);
                            RealBitcoinProfile realBitcoinProfile = (RealBitcoinProfile) obj;
                            switch (realBitcoinProfile.$r8$classId) {
                                case 0:
                                    Boolean bool = ((CryptocurrencyProfile) realBitcoinProfile.profile).has_usd_over_ln_payment;
                                    if (bool != null) {
                                        r1 = bool.booleanValue();
                                        break;
                                    }
                                    break;
                            }
                            if (!r1) {
                                if (r1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    obj3 = BitcoinPayInUsdPreference.Disabled.INSTANCE;
                                }
                            } else {
                                obj3 = BitcoinPayInUsdPreference.Enabled.INSTANCE;
                            }
                            realBitcoinPayInUsdPreferenceManager$bitcoinProfile$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj3, realBitcoinPayInUsdPreferenceManager$bitcoinProfile$$inlined$map$1$2$1) == coroutineSingletons26) {
                                break;
                            }
                        } else if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj28);
                        }
                        break;
                    }
                }
                realBitcoinPayInUsdPreferenceManager$bitcoinProfile$$inlined$map$1$2$1 = new RealBitcoinPayInUsdPreferenceManager$bitcoinProfile$$inlined$map$1$2$1(this, continuation);
                Object obj282 = realBitcoinPayInUsdPreferenceManager$bitcoinProfile$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i25 = realBitcoinPayInUsdPreferenceManager$bitcoinProfile$$inlined$map$1$2$1.label;
                if (i25 != 0) {
                }
            case 25:
                if (continuation instanceof RealBitcoinPayInUsdPreferenceManager$preference$$inlined$map$1$2$1) {
                    realBitcoinPayInUsdPreferenceManager$preference$$inlined$map$1$2$1 = (RealBitcoinPayInUsdPreferenceManager$preference$$inlined$map$1$2$1) continuation;
                    int i57 = realBitcoinPayInUsdPreferenceManager$preference$$inlined$map$1$2$1.label;
                    if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinPayInUsdPreferenceManager$preference$$inlined$map$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                        Object obj29 = realBitcoinPayInUsdPreferenceManager$preference$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i26 = realBitcoinPayInUsdPreferenceManager$preference$$inlined$map$1$2$1.label;
                        if (i26 != 0) {
                            SafeTrace.throwOnFailure(obj29);
                            Pair pair = (Pair) obj;
                            BitcoinPayInUsdPreference bitcoinPayInUsdPreference = (BitcoinPayInUsdPreference) pair.first;
                            BitcoinPayInUsdPreference bitcoinPayInUsdPreference2 = (BitcoinPayInUsdPreference) pair.second;
                            if (bitcoinPayInUsdPreference2 != null) {
                                bitcoinPayInUsdPreference = bitcoinPayInUsdPreference2;
                            }
                            realBitcoinPayInUsdPreferenceManager$preference$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(bitcoinPayInUsdPreference, realBitcoinPayInUsdPreferenceManager$preference$$inlined$map$1$2$1) == coroutineSingletons27) {
                                break;
                            }
                        } else if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj29);
                        }
                        break;
                    }
                }
                realBitcoinPayInUsdPreferenceManager$preference$$inlined$map$1$2$1 = new RealBitcoinPayInUsdPreferenceManager$preference$$inlined$map$1$2$1(this, continuation);
                Object obj292 = realBitcoinPayInUsdPreferenceManager$preference$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i26 = realBitcoinPayInUsdPreferenceManager$preference$$inlined$map$1$2$1.label;
                if (i26 != 0) {
                }
            case 26:
                if (continuation instanceof LegacyStablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    legacyStablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1 = (LegacyStablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i58 = legacyStablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                        legacyStablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                        Object obj30 = legacyStablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i27 = legacyStablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i27 != 0) {
                            SafeTrace.throwOnFailure(obj30);
                            FullCashtag fullCashtag = ((PublicProfile) obj).fullCashtag;
                            obj2 = fullCashtag != null ? FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag) : null;
                            legacyStablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj2, legacyStablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons28) {
                                break;
                            }
                        } else if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj30);
                        }
                        break;
                    }
                }
                legacyStablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1 = new LegacyStablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj302 = legacyStablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i27 = legacyStablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i27 != 0) {
                }
            case 27:
                if (continuation instanceof StablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    stablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1 = (StablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i59 = stablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                        stablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                        Object obj31 = stablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i28 = stablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i28 != 0) {
                            SafeTrace.throwOnFailure(obj31);
                            FullCashtag fullCashtag2 = ((PublicProfile) obj).fullCashtag;
                            obj2 = fullCashtag2 != null ? FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag2) : null;
                            stablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj2, stablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons29) {
                                break;
                            }
                        } else if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj31);
                        }
                        break;
                    }
                }
                stablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1 = new StablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj312 = stablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i28 = stablecoinDepositPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i28 != 0) {
                }
            case 28:
                if (continuation instanceof RealBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$1$2$1) {
                    realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$1$2$1 = (RealBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$1$2$1) continuation;
                    int i60 = realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$1$2$1.label;
                    if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                        Object obj32 = realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i29 = realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$1$2$1.label;
                        if (i29 != 0) {
                            SafeTrace.throwOnFailure(obj32);
                            BitcoinTransferCurrencyInstrument bitcoinTransferCurrencyInstrument = new BitcoinTransferCurrencyInstrument(((CryptoBalance$StablecoinBalance) obj).instrumentToken, CurrencyCode.XUS);
                            realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(bitcoinTransferCurrencyInstrument, realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$1$2$1) == coroutineSingletons30) {
                                break;
                            }
                        } else if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj32);
                        }
                        break;
                    }
                }
                realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$1$2$1 = new RealBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj322 = realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i29 = realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$1$2$1.label;
                if (i29 != 0) {
                }
            default:
                if (continuation instanceof RealBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$2$2$1) {
                    realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$2$2$1 = (RealBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$2$2$1) continuation;
                    int i61 = realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$2$2$1.label;
                    if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$2$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                        Object obj33 = realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i30 = realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$2$2$1.label;
                        if (i30 != 0) {
                            SafeTrace.throwOnFailure(obj33);
                            BalanceSnapshot balanceSnapshot = (BalanceSnapshot) obj;
                            BitcoinTransferCurrencyInstrument bitcoinTransferCurrencyInstrument2 = new BitcoinTransferCurrencyInstrument(balanceSnapshot.token, balanceSnapshot.balance.currency_code);
                            realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(bitcoinTransferCurrencyInstrument2, realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$2$2$1) == coroutineSingletons31) {
                                break;
                            }
                        } else if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj33);
                        }
                        break;
                    }
                }
                realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$2$2$1 = new RealBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$2$2$1(this, continuation);
                Object obj332 = realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons312 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i30 = realBitcoinTransferCurrencyInstrumentProvider$_get_bitcoinTransferInstrument_$lambda$0$$inlined$map$2$2$1.label;
                if (i30 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
