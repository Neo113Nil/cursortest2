package com.squareup.cash.banking.real;

import androidx.lifecycle.Lifecycle;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrWidget;
import com.squareup.cash.banking.Disclosure;
import com.squareup.cash.benefits.components.presenters.BenefitsComparisonTablePresenter$models$lambda$4$$inlined$map$1$2$1;
import com.squareup.cash.benefits.presenters.BankingBenefitsBookletPresenter$models$lambda$4$$inlined$map$1$2$1;
import com.squareup.cash.benefits.presenters.BenefitsHomePresenter$models$lambda$5$$inlined$map$1$2$1;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$2$2$1;
import com.squareup.cash.bitcoin.applets.presenters.data.RealBitcoinAppletTileRepository$bitcoinModel$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.applets.presenters.data.RealBitcoinAppletTileRepository$special$$inlined$filterNot$1$2$1;
import com.squareup.cash.bitcoin.applets.presenters.data.RealBitcoinAppletTileRepository$special$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.applets.presenters.data.RealBitcoinAppletTileRepository$special$$inlined$map$2$2$1;
import com.squareup.cash.bitcoin.graph.api.model.BitcoinGraphModel;
import com.squareup.cash.bitcoin.navigation.RealBitcoinRefreshInvoiceManager$special$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$models$lambda$16$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1$2$1;
import com.squareup.cash.bitcoin.presenters.BitcoinQrCodeScannerPresenter$special$$inlined$filter$1$2$1;
import com.squareup.cash.bitcoin.presenters.BitcoinQrCodeScannerPresenter$special$$inlined$filter$2$2$1;
import com.squareup.cash.bitcoin.presenters.BitcoinQrCodeScannerPresenter$special$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.presenters.RealBitcoinKeypadStateStore$special$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.presenters.WalletAddressOptionsPresenter$models$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.BitcoinHomePresenter$HandleScrollAnalytics$lambda$0$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.allowlist.CashAppLiteBitcoinWidgetAllowlistProvider;
import com.squareup.cash.bitcoin.presenters.applet.allowlist.CashAppLiteBitcoinWidgetAllowlistProvider$allowedWidgets$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.autoinvest.BitcoinAutoInvestWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.balance.BitcoinBalanceWidgetPresenter$models$lambda$3$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.balance.BitcoinBalanceWidgetPresenter$models$lambda$7$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.boost.BitcoinBoostWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.boost.BitcoinBoostWidgetPresenter$models$lambda$4$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.buttons.BitcoinTradeButtonsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.disclosure.BitcoinDisclosureWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.education.BitcoinStoriesWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.graph.BitcoinGraphWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.bitcoin.presenters.applet.graph.BitcoinGraphWidgetPresenter$models$lambda$14$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.autoinvest.BitcoinHomeAutoInvestWidgetViewEvent$RecurringPurchaseClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.balance.BitcoinBalanceWidgetViewEvent$ToggleCurrencyDisplay;
import com.squareup.cash.bitcoin.viewmodels.applet.buttons.BitcoinTradeButtonsWidgetViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.disclosure.BitcoinHomeDisclosureWidgetViewEvent$ViewDisclosure;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoriesWidgetViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.graph.BitcoinHomeGraphWidgetViewEvent$GraphEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.scroll.BitcoinHomeScrollViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.widget.BitcoinWidget;
import com.squareup.cash.boost.db.BoostConfig;
import com.squareup.cash.borrow.backend.BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo$special$$inlined$map$1$2;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.data.profile.JurisdictionConfigManager$JurisdictionConfig;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.db2.profile.SelectRegion;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics$createMetricsFlow$1;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager$select$$inlined$map$1$2;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$StaleData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$UptoDateData;
import com.squareup.cash.profile.presenters.ProfileSecurityPresenter$special$$inlined$map$1$2;
import com.squareup.cash.session.backend.RealUrlAuthenticator$special$$inlined$filter$1$2;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.BitcoinAppletConfig;
import com.squareup.protos.franklin.app.CashLiteConfig;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.workflow1.ui.TextControllerKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealDisclosureProvider$special$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowQuery$mapToList$$inlined$map$1 $this_unsafeTransform$inlined;

    public /* synthetic */ RealDisclosureProvider$special$$inlined$map$1(FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flowQuery$mapToList$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 2;
        int i3 = 0;
        int i4 = 3;
        int i5 = 14;
        FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector, i3), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = flowQuery$mapToList$$inlined$map$1.collect(new BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2(flowCollector, i4), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = flowQuery$mapToList$$inlined$map$1.collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, i5), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = flowQuery$mapToList$$inlined$map$1.collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, 26), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = flowQuery$mapToList$$inlined$map$1.collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, 27), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = flowQuery$mapToList$$inlined$map$1.collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, 28), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = flowQuery$mapToList$$inlined$map$1.collect(new RealAppConfigManager$cashLiteConfig$$inlined$map$1.AnonymousClass2(flowCollector, i5), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = flowQuery$mapToList$$inlined$map$1.collect(new RealAppConfigManager$cashLiteConfig$$inlined$map$1.AnonymousClass2(flowCollector, 24), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = flowQuery$mapToList$$inlined$map$1.collect(new RealAppConfigManager$cashLiteConfig$$inlined$map$1.AnonymousClass2(flowCollector, 25), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = flowQuery$mapToList$$inlined$map$1.collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(flowCollector, 1), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = flowQuery$mapToList$$inlined$map$1.collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(flowCollector, i2), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect12 = flowQuery$mapToList$$inlined$map$1.collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(flowCollector, i4), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect13 = flowQuery$mapToList$$inlined$map$1.collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, i2), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object collect14 = flowQuery$mapToList$$inlined$map$1.collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, i4), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object collect15 = flowQuery$mapToList$$inlined$map$1.collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, 16), continuation);
                if (collect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object collect16 = flowQuery$mapToList$$inlined$map$1.collect(new RealP2pSettingsManager$select$$inlined$map$1$2(flowCollector, 6), continuation);
                if (collect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object collect17 = flowQuery$mapToList$$inlined$map$1.collect(new RealP2pSettingsManager$select$$inlined$map$1$2(flowCollector, 10), continuation);
                if (collect17 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object collect18 = flowQuery$mapToList$$inlined$map$1.collect(new RealP2pSettingsManager$select$$inlined$map$1$2(flowCollector, i5), continuation);
                if (collect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object collect19 = flowQuery$mapToList$$inlined$map$1.collect(new RealP2pSettingsManager$select$$inlined$map$1$2(flowCollector, 15), continuation);
                if (collect19 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object collect20 = flowQuery$mapToList$$inlined$map$1.collect(new ProfileSecurityPresenter$special$$inlined$map$1$2(flowCollector, i3), continuation);
                if (collect20 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect21 = flowQuery$mapToList$$inlined$map$1.collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, 23), continuation);
                if (collect21 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1$2$1, reason: invalid class name */
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
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, CashAppLiteBitcoinWidgetAllowlistProvider cashAppLiteBitcoinWidgetAllowlistProvider) {
            this.$r8$classId = 19;
            this.$this_unsafeFlow = flowCollector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:255:0x030c, code lost:
        
            if (r0 == null) goto L229;
         */
        /* JADX WARN: Code restructure failed: missing block: B:551:0x06f3, code lost:
        
            if (r0 < 100) goto L494;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x01e4  */
        /* JADX WARN: Removed duplicated region for block: B:171:0x0219  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:197:0x025f  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x0291  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x029d  */
        /* JADX WARN: Removed duplicated region for block: B:269:0x033b  */
        /* JADX WARN: Removed duplicated region for block: B:275:0x0345  */
        /* JADX WARN: Removed duplicated region for block: B:289:0x0377  */
        /* JADX WARN: Removed duplicated region for block: B:295:0x0381  */
        /* JADX WARN: Removed duplicated region for block: B:310:0x03b8  */
        /* JADX WARN: Removed duplicated region for block: B:316:0x03c2  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:332:0x040a  */
        /* JADX WARN: Removed duplicated region for block: B:338:0x0414  */
        /* JADX WARN: Removed duplicated region for block: B:350:0x044a  */
        /* JADX WARN: Removed duplicated region for block: B:356:0x0454  */
        /* JADX WARN: Removed duplicated region for block: B:372:0x048d  */
        /* JADX WARN: Removed duplicated region for block: B:378:0x0497  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:392:0x04ce  */
        /* JADX WARN: Removed duplicated region for block: B:398:0x04d8  */
        /* JADX WARN: Removed duplicated region for block: B:414:0x0511  */
        /* JADX WARN: Removed duplicated region for block: B:420:0x051b  */
        /* JADX WARN: Removed duplicated region for block: B:435:0x0554  */
        /* JADX WARN: Removed duplicated region for block: B:441:0x055e  */
        /* JADX WARN: Removed duplicated region for block: B:455:0x0591  */
        /* JADX WARN: Removed duplicated region for block: B:461:0x059b  */
        /* JADX WARN: Removed duplicated region for block: B:478:0x0605  */
        /* JADX WARN: Removed duplicated region for block: B:484:0x060f  */
        /* JADX WARN: Removed duplicated region for block: B:499:0x0646  */
        /* JADX WARN: Removed duplicated region for block: B:505:0x0650  */
        /* JADX WARN: Removed duplicated region for block: B:519:0x0688  */
        /* JADX WARN: Removed duplicated region for block: B:525:0x0692  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:537:0x06cd  */
        /* JADX WARN: Removed duplicated region for block: B:543:0x06d7  */
        /* JADX WARN: Removed duplicated region for block: B:564:0x0726  */
        /* JADX WARN: Removed duplicated region for block: B:570:0x0730  */
        /* JADX WARN: Removed duplicated region for block: B:582:0x0771  */
        /* JADX WARN: Removed duplicated region for block: B:588:0x077b  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:603:0x07b0  */
        /* JADX WARN: Removed duplicated region for block: B:609:0x07ba  */
        /* JADX WARN: Removed duplicated region for block: B:626:0x07f3  */
        /* JADX WARN: Removed duplicated region for block: B:632:0x07fd  */
        /* JADX WARN: Removed duplicated region for block: B:647:0x0837  */
        /* JADX WARN: Removed duplicated region for block: B:653:0x0841  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            BenefitsComparisonTablePresenter$models$lambda$4$$inlined$map$1$2$1 benefitsComparisonTablePresenter$models$lambda$4$$inlined$map$1$2$1;
            int i2;
            BankingBenefitsBookletPresenter$models$lambda$4$$inlined$map$1$2$1 bankingBenefitsBookletPresenter$models$lambda$4$$inlined$map$1$2$1;
            int i3;
            Object obj2;
            BenefitsHomePresenter$models$lambda$5$$inlined$map$1$2$1 benefitsHomePresenter$models$lambda$5$$inlined$map$1$2$1;
            int i4;
            BenefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$1$2$1 benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$1$2$1;
            int i5;
            BenefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$2$2$1 benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$2$2$1;
            int i6;
            RealBitcoinAppletTileRepository$bitcoinModel$lambda$0$$inlined$map$1$2$1 realBitcoinAppletTileRepository$bitcoinModel$lambda$0$$inlined$map$1$2$1;
            int i7;
            RealBitcoinAppletTileRepository$special$$inlined$filterNot$1$2$1 realBitcoinAppletTileRepository$special$$inlined$filterNot$1$2$1;
            int i8;
            RealBitcoinAppletTileRepository$special$$inlined$map$1$2$1 realBitcoinAppletTileRepository$special$$inlined$map$1$2$1;
            int i9;
            RealBitcoinAppletTileRepository$special$$inlined$map$2$2$1 realBitcoinAppletTileRepository$special$$inlined$map$2$2$1;
            int i10;
            RealBitcoinRefreshInvoiceManager$special$$inlined$mapNotNull$1$2$1 realBitcoinRefreshInvoiceManager$special$$inlined$mapNotNull$1$2$1;
            int i11;
            BitcoinDepositsPresenter$models$lambda$16$$inlined$map$1$2$1 bitcoinDepositsPresenter$models$lambda$16$$inlined$map$1$2$1;
            int i12;
            BitcoinDepositsPresenter$special$$inlined$filter$1$2$1 bitcoinDepositsPresenter$special$$inlined$filter$1$2$1;
            int i13;
            BitcoinQrCodeScannerPresenter$special$$inlined$filter$1$2$1 bitcoinQrCodeScannerPresenter$special$$inlined$filter$1$2$1;
            int i14;
            BitcoinQrCodeScannerPresenter$special$$inlined$filter$2$2$1 bitcoinQrCodeScannerPresenter$special$$inlined$filter$2$2$1;
            int i15;
            BitcoinQrCodeScannerPresenter$special$$inlined$map$1$2$1 bitcoinQrCodeScannerPresenter$special$$inlined$map$1$2$1;
            int i16;
            RealBitcoinKeypadStateStore$special$$inlined$map$1$2$1 realBitcoinKeypadStateStore$special$$inlined$map$1$2$1;
            int i17;
            WalletAddressOptionsPresenter$models$lambda$2$$inlined$map$1$2$1 walletAddressOptionsPresenter$models$lambda$2$$inlined$map$1$2$1;
            int i18;
            BitcoinHomePresenter$HandleScrollAnalytics$lambda$0$$inlined$filterIsInstance$1$2$1 bitcoinHomePresenter$HandleScrollAnalytics$lambda$0$$inlined$filterIsInstance$1$2$1;
            int i19;
            CashAppLiteBitcoinWidgetAllowlistProvider$allowedWidgets$$inlined$map$1$2$1 cashAppLiteBitcoinWidgetAllowlistProvider$allowedWidgets$$inlined$map$1$2$1;
            int i20;
            Object obj3;
            BitcoinAppletConfig bitcoinAppletConfig;
            List list;
            BitcoinWidget bitcoinWidget;
            BitcoinAutoInvestWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 bitcoinAutoInvestWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
            int i21;
            BitcoinBalanceWidgetPresenter$models$lambda$3$$inlined$filterIsInstance$1$2$1 bitcoinBalanceWidgetPresenter$models$lambda$3$$inlined$filterIsInstance$1$2$1;
            int i22;
            BitcoinBalanceWidgetPresenter$models$lambda$7$$inlined$map$1$2$1 bitcoinBalanceWidgetPresenter$models$lambda$7$$inlined$map$1$2$1;
            int i23;
            BitcoinBoostWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 bitcoinBoostWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1;
            int i24;
            BitcoinBoostWidgetPresenter$models$lambda$4$$inlined$map$1$2$1 bitcoinBoostWidgetPresenter$models$lambda$4$$inlined$map$1$2$1;
            int i25;
            BitcoinTradeButtonsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 bitcoinTradeButtonsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1;
            int i26;
            BitcoinDisclosureWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 bitcoinDisclosureWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
            int i27;
            BitcoinStoriesWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 bitcoinStoriesWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
            int i28;
            BitcoinGraphWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 bitcoinGraphWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
            int i29;
            BitcoinGraphWidgetPresenter$models$lambda$14$$inlined$map$1$2$1 bitcoinGraphWidgetPresenter$models$lambda$14$$inlined$map$1$2$1;
            int i30;
            int i31 = this.$r8$classId;
            char c = 0;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            switch (i31) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i32 = anonymousClass1.label;
                        if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i32 - PKIFailureInfo.systemUnavail;
                            Object obj4 = anonymousClass1.result;
                            Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj4);
                                Object obj6 = ((SelectRegion) obj).region;
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj6, anonymousClass1) == obj5) {
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
                    Object obj52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                case 1:
                    if (continuation instanceof BenefitsComparisonTablePresenter$models$lambda$4$$inlined$map$1$2$1) {
                        benefitsComparisonTablePresenter$models$lambda$4$$inlined$map$1$2$1 = (BenefitsComparisonTablePresenter$models$lambda$4$$inlined$map$1$2$1) continuation;
                        int i33 = benefitsComparisonTablePresenter$models$lambda$4$$inlined$map$1$2$1.label;
                        if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                            benefitsComparisonTablePresenter$models$lambda$4$$inlined$map$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                            Object obj7 = benefitsComparisonTablePresenter$models$lambda$4$$inlined$map$1$2$1.result;
                            Object obj8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = benefitsComparisonTablePresenter$models$lambda$4$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj7);
                                Object valueOf = Boolean.valueOf(((CashAppCard.PhysicalCardOrderState) obj) != CashAppCard.PhysicalCardOrderState.NO_CARD);
                                benefitsComparisonTablePresenter$models$lambda$4$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf, benefitsComparisonTablePresenter$models$lambda$4$$inlined$map$1$2$1) == obj8) {
                                    break;
                                }
                            } else if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj7);
                            }
                            break;
                        }
                    }
                    benefitsComparisonTablePresenter$models$lambda$4$$inlined$map$1$2$1 = new BenefitsComparisonTablePresenter$models$lambda$4$$inlined$map$1$2$1(this, continuation);
                    Object obj72 = benefitsComparisonTablePresenter$models$lambda$4$$inlined$map$1$2$1.result;
                    Object obj82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = benefitsComparisonTablePresenter$models$lambda$4$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
                case 2:
                    if (continuation instanceof BankingBenefitsBookletPresenter$models$lambda$4$$inlined$map$1$2$1) {
                        bankingBenefitsBookletPresenter$models$lambda$4$$inlined$map$1$2$1 = (BankingBenefitsBookletPresenter$models$lambda$4$$inlined$map$1$2$1) continuation;
                        int i34 = bankingBenefitsBookletPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                        if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                            bankingBenefitsBookletPresenter$models$lambda$4$$inlined$map$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                            Object obj9 = bankingBenefitsBookletPresenter$models$lambda$4$$inlined$map$1$2$1.result;
                            Object obj10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = bankingBenefitsBookletPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj9);
                                Disclosure disclosure = (Disclosure) obj;
                                obj2 = disclosure != null ? disclosure.text : null;
                                if (obj2 == null) {
                                    obj2 = "";
                                }
                                bankingBenefitsBookletPresenter$models$lambda$4$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj2, bankingBenefitsBookletPresenter$models$lambda$4$$inlined$map$1$2$1) == obj10) {
                                    break;
                                }
                            } else if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj9);
                            }
                            break;
                        }
                    }
                    bankingBenefitsBookletPresenter$models$lambda$4$$inlined$map$1$2$1 = new BankingBenefitsBookletPresenter$models$lambda$4$$inlined$map$1$2$1(this, continuation);
                    Object obj92 = bankingBenefitsBookletPresenter$models$lambda$4$$inlined$map$1$2$1.result;
                    Object obj102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = bankingBenefitsBookletPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                    if (i3 != 0) {
                    }
                case 3:
                    if (continuation instanceof BenefitsHomePresenter$models$lambda$5$$inlined$map$1$2$1) {
                        benefitsHomePresenter$models$lambda$5$$inlined$map$1$2$1 = (BenefitsHomePresenter$models$lambda$5$$inlined$map$1$2$1) continuation;
                        int i35 = benefitsHomePresenter$models$lambda$5$$inlined$map$1$2$1.label;
                        if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                            benefitsHomePresenter$models$lambda$5$$inlined$map$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                            Object obj11 = benefitsHomePresenter$models$lambda$5$$inlined$map$1$2$1.result;
                            Object obj12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = benefitsHomePresenter$models$lambda$5$$inlined$map$1$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj11);
                                Disclosure disclosure2 = (Disclosure) obj;
                                obj2 = disclosure2 != null ? disclosure2.text : null;
                                benefitsHomePresenter$models$lambda$5$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj2, benefitsHomePresenter$models$lambda$5$$inlined$map$1$2$1) == obj12) {
                                    break;
                                }
                            } else if (i4 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj11);
                            }
                            break;
                        }
                    }
                    benefitsHomePresenter$models$lambda$5$$inlined$map$1$2$1 = new BenefitsHomePresenter$models$lambda$5$$inlined$map$1$2$1(this, continuation);
                    Object obj112 = benefitsHomePresenter$models$lambda$5$$inlined$map$1$2$1.result;
                    Object obj122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = benefitsHomePresenter$models$lambda$5$$inlined$map$1$2$1.label;
                    if (i4 != 0) {
                    }
                case 4:
                    if (continuation instanceof BenefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$1$2$1) {
                        benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$1$2$1 = (BenefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i36 = benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                            benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                            Object obj13 = benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                            Object obj14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj13);
                                Object num = new Integer(MathKt__MathJVMKt.roundToInt(((Number) obj).doubleValue() * 100.0d));
                                benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(num, benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$1$2$1) == obj14) {
                                    break;
                                }
                            } else if (i5 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj13);
                            }
                            break;
                        }
                    }
                    benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$1$2$1 = new BenefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj132 = benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                    Object obj142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i5 != 0) {
                    }
                case 5:
                    if (continuation instanceof BenefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$2$2$1) {
                        benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$2$2$1 = (BenefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$2$2$1) continuation;
                        int i37 = benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                        if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                            benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$2$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                            Object obj15 = benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$2$2$1.result;
                            Object obj16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj15);
                                int intValue = ((Number) obj).intValue();
                                char c2 = 25;
                                if (intValue >= 25) {
                                    c = '2';
                                    if (intValue >= 50) {
                                        c2 = 'K';
                                        if (intValue >= 75) {
                                            c = 'd';
                                            break;
                                        }
                                    }
                                    c = c2;
                                }
                                Object num2 = new Integer(c);
                                benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$2$2$1.label = 1;
                                if (flowCollector.emit(num2, benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$2$2$1) == obj16) {
                                    break;
                                }
                            } else if (i6 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj15);
                            }
                            break;
                        }
                    }
                    benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$2$2$1 = new BenefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$2$2$1(this, continuation);
                    Object obj152 = benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$2$2$1.result;
                    Object obj162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = benefitsHubViewKt$BenefitsHub$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                    if (i6 != 0) {
                    }
                case 6:
                    if (continuation instanceof RealBitcoinAppletTileRepository$bitcoinModel$lambda$0$$inlined$map$1$2$1) {
                        realBitcoinAppletTileRepository$bitcoinModel$lambda$0$$inlined$map$1$2$1 = (RealBitcoinAppletTileRepository$bitcoinModel$lambda$0$$inlined$map$1$2$1) continuation;
                        int i38 = realBitcoinAppletTileRepository$bitcoinModel$lambda$0$$inlined$map$1$2$1.label;
                        if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                            realBitcoinAppletTileRepository$bitcoinModel$lambda$0$$inlined$map$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                            Object obj17 = realBitcoinAppletTileRepository$bitcoinModel$lambda$0$$inlined$map$1$2$1.result;
                            Object obj18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = realBitcoinAppletTileRepository$bitcoinModel$lambda$0$$inlined$map$1$2$1.label;
                            if (i7 != 0) {
                                SafeTrace.throwOnFailure(obj17);
                                Object valueOf2 = Boolean.valueOf(((Lifecycle.State) obj).isAtLeast(Lifecycle.State.STARTED));
                                realBitcoinAppletTileRepository$bitcoinModel$lambda$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf2, realBitcoinAppletTileRepository$bitcoinModel$lambda$0$$inlined$map$1$2$1) == obj18) {
                                    break;
                                }
                            } else if (i7 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj17);
                            }
                            break;
                        }
                    }
                    realBitcoinAppletTileRepository$bitcoinModel$lambda$0$$inlined$map$1$2$1 = new RealBitcoinAppletTileRepository$bitcoinModel$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj172 = realBitcoinAppletTileRepository$bitcoinModel$lambda$0$$inlined$map$1$2$1.result;
                    Object obj182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i7 = realBitcoinAppletTileRepository$bitcoinModel$lambda$0$$inlined$map$1$2$1.label;
                    if (i7 != 0) {
                    }
                case 7:
                    if (continuation instanceof RealBitcoinAppletTileRepository$special$$inlined$filterNot$1$2$1) {
                        realBitcoinAppletTileRepository$special$$inlined$filterNot$1$2$1 = (RealBitcoinAppletTileRepository$special$$inlined$filterNot$1$2$1) continuation;
                        int i39 = realBitcoinAppletTileRepository$special$$inlined$filterNot$1$2$1.label;
                        if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                            realBitcoinAppletTileRepository$special$$inlined$filterNot$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                            Object obj19 = realBitcoinAppletTileRepository$special$$inlined$filterNot$1$2$1.result;
                            Object obj20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i8 = realBitcoinAppletTileRepository$special$$inlined$filterNot$1$2$1.label;
                            if (i8 != 0) {
                                SafeTrace.throwOnFailure(obj19);
                                if (((Money) obj).currency_code != CurrencyCode.BTC) {
                                    realBitcoinAppletTileRepository$special$$inlined$filterNot$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, realBitcoinAppletTileRepository$special$$inlined$filterNot$1$2$1) == obj20) {
                                        break;
                                    }
                                }
                            } else if (i8 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj19);
                            }
                            break;
                        }
                    }
                    realBitcoinAppletTileRepository$special$$inlined$filterNot$1$2$1 = new RealBitcoinAppletTileRepository$special$$inlined$filterNot$1$2$1(this, continuation);
                    Object obj192 = realBitcoinAppletTileRepository$special$$inlined$filterNot$1$2$1.result;
                    Object obj202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i8 = realBitcoinAppletTileRepository$special$$inlined$filterNot$1$2$1.label;
                    if (i8 != 0) {
                    }
                case 8:
                    if (continuation instanceof RealBitcoinAppletTileRepository$special$$inlined$map$1$2$1) {
                        realBitcoinAppletTileRepository$special$$inlined$map$1$2$1 = (RealBitcoinAppletTileRepository$special$$inlined$map$1$2$1) continuation;
                        int i40 = realBitcoinAppletTileRepository$special$$inlined$map$1$2$1.label;
                        if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                            realBitcoinAppletTileRepository$special$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                            Object obj21 = realBitcoinAppletTileRepository$special$$inlined$map$1$2$1.result;
                            Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i9 = realBitcoinAppletTileRepository$special$$inlined$map$1$2$1.label;
                            if (i9 != 0) {
                                SafeTrace.throwOnFailure(obj21);
                                CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance = (CryptoBalance$BitcoinBalance) obj;
                                obj2 = cryptoBalance$BitcoinBalance != null ? TextControllerKt.toMoney(cryptoBalance$BitcoinBalance) : null;
                                realBitcoinAppletTileRepository$special$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj2, realBitcoinAppletTileRepository$special$$inlined$map$1$2$1) == obj22) {
                                    break;
                                }
                            } else if (i9 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj21);
                            }
                            break;
                        }
                    }
                    realBitcoinAppletTileRepository$special$$inlined$map$1$2$1 = new RealBitcoinAppletTileRepository$special$$inlined$map$1$2$1(this, continuation);
                    Object obj212 = realBitcoinAppletTileRepository$special$$inlined$map$1$2$1.result;
                    Object obj222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i9 = realBitcoinAppletTileRepository$special$$inlined$map$1$2$1.label;
                    if (i9 != 0) {
                    }
                case 9:
                    if (continuation instanceof RealBitcoinAppletTileRepository$special$$inlined$map$2$2$1) {
                        realBitcoinAppletTileRepository$special$$inlined$map$2$2$1 = (RealBitcoinAppletTileRepository$special$$inlined$map$2$2$1) continuation;
                        int i41 = realBitcoinAppletTileRepository$special$$inlined$map$2$2$1.label;
                        if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                            realBitcoinAppletTileRepository$special$$inlined$map$2$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                            Object obj23 = realBitcoinAppletTileRepository$special$$inlined$map$2$2$1.result;
                            Object obj24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = realBitcoinAppletTileRepository$special$$inlined$map$2$2$1.label;
                            if (i10 != 0) {
                                SafeTrace.throwOnFailure(obj23);
                                BitcoinGraphModel bitcoinGraphModel = (BitcoinGraphModel) obj;
                                bitcoinGraphModel.getClass();
                                Object loaded = new InvestingGraphContentModel.Loaded(bitcoinGraphModel.sampledPoints, bitcoinGraphModel.sampledSmoothedPoints, r10.size(), bitcoinGraphModel.isStale ? InvestingGraphContentModel$AccentColorType$StaleData.INSTANCE : new InvestingGraphContentModel$AccentColorType$UptoDateData(ColorModel.Bitcoin.INSTANCE), null, null, null, Long.valueOf(bitcoinGraphModel.firstTickY), Long.valueOf(bitcoinGraphModel.lastTickY), 112);
                                realBitcoinAppletTileRepository$special$$inlined$map$2$2$1.label = 1;
                                if (flowCollector.emit(loaded, realBitcoinAppletTileRepository$special$$inlined$map$2$2$1) == obj24) {
                                    break;
                                }
                            } else if (i10 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj23);
                            }
                            break;
                        }
                    }
                    realBitcoinAppletTileRepository$special$$inlined$map$2$2$1 = new RealBitcoinAppletTileRepository$special$$inlined$map$2$2$1(this, continuation);
                    Object obj232 = realBitcoinAppletTileRepository$special$$inlined$map$2$2$1.result;
                    Object obj242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = realBitcoinAppletTileRepository$special$$inlined$map$2$2$1.label;
                    if (i10 != 0) {
                    }
                case 10:
                    if (continuation instanceof RealBitcoinRefreshInvoiceManager$special$$inlined$mapNotNull$1$2$1) {
                        realBitcoinRefreshInvoiceManager$special$$inlined$mapNotNull$1$2$1 = (RealBitcoinRefreshInvoiceManager$special$$inlined$mapNotNull$1$2$1) continuation;
                        int i42 = realBitcoinRefreshInvoiceManager$special$$inlined$mapNotNull$1$2$1.label;
                        if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                            realBitcoinRefreshInvoiceManager$special$$inlined$mapNotNull$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                            Object obj25 = realBitcoinRefreshInvoiceManager$special$$inlined$mapNotNull$1$2$1.result;
                            Object obj26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i11 = realBitcoinRefreshInvoiceManager$special$$inlined$mapNotNull$1$2$1.label;
                            if (i11 != 0) {
                                SafeTrace.throwOnFailure(obj25);
                                Object obj27 = (String) obj;
                                if (obj27 != null) {
                                    realBitcoinRefreshInvoiceManager$special$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector.emit(obj27, realBitcoinRefreshInvoiceManager$special$$inlined$mapNotNull$1$2$1) == obj26) {
                                        break;
                                    }
                                }
                            } else if (i11 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj25);
                            }
                            break;
                        }
                    }
                    realBitcoinRefreshInvoiceManager$special$$inlined$mapNotNull$1$2$1 = new RealBitcoinRefreshInvoiceManager$special$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj252 = realBitcoinRefreshInvoiceManager$special$$inlined$mapNotNull$1$2$1.result;
                    Object obj262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i11 = realBitcoinRefreshInvoiceManager$special$$inlined$mapNotNull$1$2$1.label;
                    if (i11 != 0) {
                    }
                case 11:
                    if (continuation instanceof BitcoinDepositsPresenter$models$lambda$16$$inlined$map$1$2$1) {
                        bitcoinDepositsPresenter$models$lambda$16$$inlined$map$1$2$1 = (BitcoinDepositsPresenter$models$lambda$16$$inlined$map$1$2$1) continuation;
                        int i43 = bitcoinDepositsPresenter$models$lambda$16$$inlined$map$1$2$1.label;
                        if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                            bitcoinDepositsPresenter$models$lambda$16$$inlined$map$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                            Object obj28 = bitcoinDepositsPresenter$models$lambda$16$$inlined$map$1$2$1.result;
                            Object obj29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i12 = bitcoinDepositsPresenter$models$lambda$16$$inlined$map$1$2$1.label;
                            if (i12 != 0) {
                                SafeTrace.throwOnFailure(obj28);
                                FullCashtag fullCashtag = ((PublicProfile) obj).fullCashtag;
                                obj2 = fullCashtag != null ? FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag) : null;
                                bitcoinDepositsPresenter$models$lambda$16$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj2, bitcoinDepositsPresenter$models$lambda$16$$inlined$map$1$2$1) == obj29) {
                                    break;
                                }
                            } else if (i12 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj28);
                            }
                            break;
                        }
                    }
                    bitcoinDepositsPresenter$models$lambda$16$$inlined$map$1$2$1 = new BitcoinDepositsPresenter$models$lambda$16$$inlined$map$1$2$1(this, continuation);
                    Object obj282 = bitcoinDepositsPresenter$models$lambda$16$$inlined$map$1$2$1.result;
                    Object obj292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i12 = bitcoinDepositsPresenter$models$lambda$16$$inlined$map$1$2$1.label;
                    if (i12 != 0) {
                    }
                case 12:
                    if (continuation instanceof BitcoinDepositsPresenter$special$$inlined$filter$1$2$1) {
                        bitcoinDepositsPresenter$special$$inlined$filter$1$2$1 = (BitcoinDepositsPresenter$special$$inlined$filter$1$2$1) continuation;
                        int i44 = bitcoinDepositsPresenter$special$$inlined$filter$1$2$1.label;
                        if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                            bitcoinDepositsPresenter$special$$inlined$filter$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                            Object obj30 = bitcoinDepositsPresenter$special$$inlined$filter$1$2$1.result;
                            Object obj31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i13 = bitcoinDepositsPresenter$special$$inlined$filter$1$2$1.label;
                            if (i13 != 0) {
                                SafeTrace.throwOnFailure(obj30);
                                ActivityEvent activityEvent = (ActivityEvent) obj;
                                if (activityEvent == ActivityEvent.START || activityEvent == ActivityEvent.STOP) {
                                    bitcoinDepositsPresenter$special$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, bitcoinDepositsPresenter$special$$inlined$filter$1$2$1) == obj31) {
                                        break;
                                    }
                                }
                            } else if (i13 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj30);
                            }
                            break;
                        }
                    }
                    bitcoinDepositsPresenter$special$$inlined$filter$1$2$1 = new BitcoinDepositsPresenter$special$$inlined$filter$1$2$1(this, continuation);
                    Object obj302 = bitcoinDepositsPresenter$special$$inlined$filter$1$2$1.result;
                    Object obj312 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i13 = bitcoinDepositsPresenter$special$$inlined$filter$1$2$1.label;
                    if (i13 != 0) {
                    }
                    break;
                case 13:
                    if (continuation instanceof BitcoinQrCodeScannerPresenter$special$$inlined$filter$1$2$1) {
                        bitcoinQrCodeScannerPresenter$special$$inlined$filter$1$2$1 = (BitcoinQrCodeScannerPresenter$special$$inlined$filter$1$2$1) continuation;
                        int i45 = bitcoinQrCodeScannerPresenter$special$$inlined$filter$1$2$1.label;
                        if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                            bitcoinQrCodeScannerPresenter$special$$inlined$filter$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                            Object obj32 = bitcoinQrCodeScannerPresenter$special$$inlined$filter$1$2$1.result;
                            Object obj33 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i14 = bitcoinQrCodeScannerPresenter$special$$inlined$filter$1$2$1.label;
                            if (i14 != 0) {
                                SafeTrace.throwOnFailure(obj32);
                                if (((Boolean) obj).booleanValue()) {
                                    bitcoinQrCodeScannerPresenter$special$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, bitcoinQrCodeScannerPresenter$special$$inlined$filter$1$2$1) == obj33) {
                                        break;
                                    }
                                }
                            } else if (i14 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj32);
                            }
                            break;
                        }
                    }
                    bitcoinQrCodeScannerPresenter$special$$inlined$filter$1$2$1 = new BitcoinQrCodeScannerPresenter$special$$inlined$filter$1$2$1(this, continuation);
                    Object obj322 = bitcoinQrCodeScannerPresenter$special$$inlined$filter$1$2$1.result;
                    Object obj332 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i14 = bitcoinQrCodeScannerPresenter$special$$inlined$filter$1$2$1.label;
                    if (i14 != 0) {
                    }
                case 14:
                    if (continuation instanceof BitcoinQrCodeScannerPresenter$special$$inlined$filter$2$2$1) {
                        bitcoinQrCodeScannerPresenter$special$$inlined$filter$2$2$1 = (BitcoinQrCodeScannerPresenter$special$$inlined$filter$2$2$1) continuation;
                        int i46 = bitcoinQrCodeScannerPresenter$special$$inlined$filter$2$2$1.label;
                        if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                            bitcoinQrCodeScannerPresenter$special$$inlined$filter$2$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                            Object obj34 = bitcoinQrCodeScannerPresenter$special$$inlined$filter$2$2$1.result;
                            Object obj35 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i15 = bitcoinQrCodeScannerPresenter$special$$inlined$filter$2$2$1.label;
                            if (i15 != 0) {
                                SafeTrace.throwOnFailure(obj34);
                                ActivityEvent activityEvent2 = (ActivityEvent) obj;
                                if (activityEvent2 == ActivityEvent.RESUME || activityEvent2 == ActivityEvent.PAUSE) {
                                    bitcoinQrCodeScannerPresenter$special$$inlined$filter$2$2$1.label = 1;
                                    if (flowCollector.emit(obj, bitcoinQrCodeScannerPresenter$special$$inlined$filter$2$2$1) == obj35) {
                                        break;
                                    }
                                }
                            } else if (i15 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj34);
                            }
                            break;
                        }
                    }
                    bitcoinQrCodeScannerPresenter$special$$inlined$filter$2$2$1 = new BitcoinQrCodeScannerPresenter$special$$inlined$filter$2$2$1(this, continuation);
                    Object obj342 = bitcoinQrCodeScannerPresenter$special$$inlined$filter$2$2$1.result;
                    Object obj352 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i15 = bitcoinQrCodeScannerPresenter$special$$inlined$filter$2$2$1.label;
                    if (i15 != 0) {
                    }
                    break;
                case 15:
                    if (continuation instanceof BitcoinQrCodeScannerPresenter$special$$inlined$map$1$2$1) {
                        bitcoinQrCodeScannerPresenter$special$$inlined$map$1$2$1 = (BitcoinQrCodeScannerPresenter$special$$inlined$map$1$2$1) continuation;
                        int i47 = bitcoinQrCodeScannerPresenter$special$$inlined$map$1$2$1.label;
                        if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                            bitcoinQrCodeScannerPresenter$special$$inlined$map$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                            Object obj36 = bitcoinQrCodeScannerPresenter$special$$inlined$map$1$2$1.result;
                            Object obj37 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i16 = bitcoinQrCodeScannerPresenter$special$$inlined$map$1$2$1.label;
                            if (i16 != 0) {
                                SafeTrace.throwOnFailure(obj36);
                                ((Boolean) obj).getClass();
                                Object obj38 = Unit.INSTANCE;
                                bitcoinQrCodeScannerPresenter$special$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj38, bitcoinQrCodeScannerPresenter$special$$inlined$map$1$2$1) == obj37) {
                                    break;
                                }
                            } else if (i16 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj36);
                            }
                            break;
                        }
                    }
                    bitcoinQrCodeScannerPresenter$special$$inlined$map$1$2$1 = new BitcoinQrCodeScannerPresenter$special$$inlined$map$1$2$1(this, continuation);
                    Object obj362 = bitcoinQrCodeScannerPresenter$special$$inlined$map$1$2$1.result;
                    Object obj372 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i16 = bitcoinQrCodeScannerPresenter$special$$inlined$map$1$2$1.label;
                    if (i16 != 0) {
                    }
                case 16:
                    if (continuation instanceof RealBitcoinKeypadStateStore$special$$inlined$map$1$2$1) {
                        realBitcoinKeypadStateStore$special$$inlined$map$1$2$1 = (RealBitcoinKeypadStateStore$special$$inlined$map$1$2$1) continuation;
                        int i48 = realBitcoinKeypadStateStore$special$$inlined$map$1$2$1.label;
                        if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                            realBitcoinKeypadStateStore$special$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                            Object obj39 = realBitcoinKeypadStateStore$special$$inlined$map$1$2$1.result;
                            Object obj40 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i17 = realBitcoinKeypadStateStore$special$$inlined$map$1$2$1.label;
                            if (i17 != 0) {
                                SafeTrace.throwOnFailure(obj39);
                                CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance2 = (CryptoBalance$BitcoinBalance) obj;
                                Object money = cryptoBalance$BitcoinBalance2 != null ? TextControllerKt.toMoney(cryptoBalance$BitcoinBalance2) : new Money(new Long(0L), CurrencyCode.BTC, 4);
                                realBitcoinKeypadStateStore$special$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(money, realBitcoinKeypadStateStore$special$$inlined$map$1$2$1) == obj40) {
                                    break;
                                }
                            } else if (i17 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj39);
                            }
                            break;
                        }
                    }
                    realBitcoinKeypadStateStore$special$$inlined$map$1$2$1 = new RealBitcoinKeypadStateStore$special$$inlined$map$1$2$1(this, continuation);
                    Object obj392 = realBitcoinKeypadStateStore$special$$inlined$map$1$2$1.result;
                    Object obj402 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i17 = realBitcoinKeypadStateStore$special$$inlined$map$1$2$1.label;
                    if (i17 != 0) {
                    }
                case 17:
                    if (continuation instanceof WalletAddressOptionsPresenter$models$lambda$2$$inlined$map$1$2$1) {
                        walletAddressOptionsPresenter$models$lambda$2$$inlined$map$1$2$1 = (WalletAddressOptionsPresenter$models$lambda$2$$inlined$map$1$2$1) continuation;
                        int i49 = walletAddressOptionsPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                        if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                            walletAddressOptionsPresenter$models$lambda$2$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                            Object obj41 = walletAddressOptionsPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                            Object obj43 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i18 = walletAddressOptionsPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                            if (i18 != 0) {
                                SafeTrace.throwOnFailure(obj41);
                                FullCashtag fullCashtag2 = ((PublicProfile) obj).fullCashtag;
                                obj2 = fullCashtag2 != null ? fullCashtag2.cashtag_qr_image_url : null;
                                walletAddressOptionsPresenter$models$lambda$2$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj2, walletAddressOptionsPresenter$models$lambda$2$$inlined$map$1$2$1) == obj43) {
                                    break;
                                }
                            } else if (i18 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj41);
                            }
                            break;
                        }
                    }
                    walletAddressOptionsPresenter$models$lambda$2$$inlined$map$1$2$1 = new WalletAddressOptionsPresenter$models$lambda$2$$inlined$map$1$2$1(this, continuation);
                    Object obj412 = walletAddressOptionsPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                    Object obj432 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i18 = walletAddressOptionsPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                    if (i18 != 0) {
                    }
                case 18:
                    if (continuation instanceof BitcoinHomePresenter$HandleScrollAnalytics$lambda$0$$inlined$filterIsInstance$1$2$1) {
                        bitcoinHomePresenter$HandleScrollAnalytics$lambda$0$$inlined$filterIsInstance$1$2$1 = (BitcoinHomePresenter$HandleScrollAnalytics$lambda$0$$inlined$filterIsInstance$1$2$1) continuation;
                        int i50 = bitcoinHomePresenter$HandleScrollAnalytics$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                        if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                            bitcoinHomePresenter$HandleScrollAnalytics$lambda$0$$inlined$filterIsInstance$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                            Object obj44 = bitcoinHomePresenter$HandleScrollAnalytics$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                            Object obj45 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i19 = bitcoinHomePresenter$HandleScrollAnalytics$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                            if (i19 != 0) {
                                SafeTrace.throwOnFailure(obj44);
                                if (obj instanceof BitcoinHomeScrollViewEvent) {
                                    bitcoinHomePresenter$HandleScrollAnalytics$lambda$0$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, bitcoinHomePresenter$HandleScrollAnalytics$lambda$0$$inlined$filterIsInstance$1$2$1) == obj45) {
                                        break;
                                    }
                                }
                            } else if (i19 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj44);
                            }
                            break;
                        }
                    }
                    bitcoinHomePresenter$HandleScrollAnalytics$lambda$0$$inlined$filterIsInstance$1$2$1 = new BitcoinHomePresenter$HandleScrollAnalytics$lambda$0$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj442 = bitcoinHomePresenter$HandleScrollAnalytics$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                    Object obj452 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i19 = bitcoinHomePresenter$HandleScrollAnalytics$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                    if (i19 != 0) {
                    }
                case 19:
                    if (continuation instanceof CashAppLiteBitcoinWidgetAllowlistProvider$allowedWidgets$$inlined$map$1$2$1) {
                        cashAppLiteBitcoinWidgetAllowlistProvider$allowedWidgets$$inlined$map$1$2$1 = (CashAppLiteBitcoinWidgetAllowlistProvider$allowedWidgets$$inlined$map$1$2$1) continuation;
                        int i51 = cashAppLiteBitcoinWidgetAllowlistProvider$allowedWidgets$$inlined$map$1$2$1.label;
                        if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                            cashAppLiteBitcoinWidgetAllowlistProvider$allowedWidgets$$inlined$map$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                            Object obj46 = cashAppLiteBitcoinWidgetAllowlistProvider$allowedWidgets$$inlined$map$1$2$1.result;
                            Object obj47 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i20 = cashAppLiteBitcoinWidgetAllowlistProvider$allowedWidgets$$inlined$map$1$2$1.label;
                            if (i20 != 0) {
                                SafeTrace.throwOnFailure(obj46);
                                CashLiteConfig cashLiteConfig = (CashLiteConfig) obj;
                                if (cashLiteConfig != null && (bitcoinAppletConfig = cashLiteConfig.bitcoin_applet) != null && (list = bitcoinAppletConfig.home_widget_allowlist) != null) {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        switch ((BitcoinAppletConfig.BitcoinWidgetId) it.next()) {
                                            case WELCOME:
                                                bitcoinWidget = BitcoinWidget.WELCOME;
                                                break;
                                            case GRAPH:
                                                bitcoinWidget = BitcoinWidget.GRAPH;
                                                break;
                                            case BOOST:
                                                bitcoinWidget = BitcoinWidget.BOOST;
                                                break;
                                            case ON_RAMP:
                                                bitcoinWidget = BitcoinWidget.ON_RAMP;
                                                break;
                                            case DISCLOSURE:
                                                bitcoinWidget = BitcoinWidget.DISCLOSURE;
                                                break;
                                            case BUTTONS:
                                                bitcoinWidget = BitcoinWidget.BUTTONS;
                                                break;
                                            case NEWS:
                                                bitcoinWidget = BitcoinWidget.NEWS;
                                                break;
                                            case PENDING_IDV:
                                                bitcoinWidget = BitcoinWidget.PENDING_IDV;
                                                break;
                                            case STATS_AND_SETTINGS:
                                                bitcoinWidget = BitcoinWidget.STATS_AND_SETTINGS;
                                                break;
                                            case AUTO_INVEST:
                                                bitcoinWidget = BitcoinWidget.AUTO_INVEST;
                                                break;
                                            case ACTIVITY:
                                                bitcoinWidget = BitcoinWidget.ACTIVITY;
                                                break;
                                            case BITCOIN_STORIES:
                                                bitcoinWidget = BitcoinWidget.BITCOIN_STORIES;
                                                break;
                                            case KYB_RESTRICTION:
                                                bitcoinWidget = BitcoinWidget.KYB_RESTRICTION;
                                                break;
                                            case STACKING_TOOLS:
                                                bitcoinWidget = BitcoinWidget.STACKING_TOOLS;
                                                break;
                                            case BALANCE:
                                                bitcoinWidget = BitcoinWidget.BALANCE;
                                                break;
                                            case PERFORMANCE:
                                                bitcoinWidget = BitcoinWidget.PERFORMANCE;
                                                break;
                                            case DISABLED:
                                                bitcoinWidget = BitcoinWidget.DISABLED;
                                                break;
                                            case BITCOIN_MAP_CARD:
                                                bitcoinWidget = BitcoinWidget.BITCOIN_MAP_CARD;
                                                break;
                                            default:
                                                bitcoinWidget = null;
                                                break;
                                        }
                                        if (bitcoinWidget != null) {
                                            arrayList.add(bitcoinWidget);
                                        }
                                    }
                                    obj3 = CollectionsKt.toSet(arrayList);
                                    break;
                                }
                                obj3 = EmptySet.INSTANCE;
                                cashAppLiteBitcoinWidgetAllowlistProvider$allowedWidgets$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj3, cashAppLiteBitcoinWidgetAllowlistProvider$allowedWidgets$$inlined$map$1$2$1) == obj47) {
                                    break;
                                }
                            } else if (i20 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj46);
                            }
                            break;
                        }
                    }
                    cashAppLiteBitcoinWidgetAllowlistProvider$allowedWidgets$$inlined$map$1$2$1 = new CashAppLiteBitcoinWidgetAllowlistProvider$allowedWidgets$$inlined$map$1$2$1(this, continuation);
                    Object obj462 = cashAppLiteBitcoinWidgetAllowlistProvider$allowedWidgets$$inlined$map$1$2$1.result;
                    Object obj472 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i20 = cashAppLiteBitcoinWidgetAllowlistProvider$allowedWidgets$$inlined$map$1$2$1.label;
                    if (i20 != 0) {
                    }
                    break;
                case 20:
                    if (continuation instanceof BitcoinAutoInvestWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) {
                        bitcoinAutoInvestWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = (BitcoinAutoInvestWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) continuation;
                        int i52 = bitcoinAutoInvestWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                        if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                            bitcoinAutoInvestWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                            Object obj48 = bitcoinAutoInvestWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                            Object obj49 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i21 = bitcoinAutoInvestWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                            if (i21 != 0) {
                                SafeTrace.throwOnFailure(obj48);
                                if (obj instanceof BitcoinHomeAutoInvestWidgetViewEvent$RecurringPurchaseClicked) {
                                    bitcoinAutoInvestWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, bitcoinAutoInvestWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) == obj49) {
                                        break;
                                    }
                                }
                            } else if (i21 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj48);
                            }
                            break;
                        }
                    }
                    bitcoinAutoInvestWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = new BitcoinAutoInvestWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj482 = bitcoinAutoInvestWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                    Object obj492 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i21 = bitcoinAutoInvestWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                    if (i21 != 0) {
                    }
                case 21:
                    if (continuation instanceof BitcoinBalanceWidgetPresenter$models$lambda$3$$inlined$filterIsInstance$1$2$1) {
                        bitcoinBalanceWidgetPresenter$models$lambda$3$$inlined$filterIsInstance$1$2$1 = (BitcoinBalanceWidgetPresenter$models$lambda$3$$inlined$filterIsInstance$1$2$1) continuation;
                        int i53 = bitcoinBalanceWidgetPresenter$models$lambda$3$$inlined$filterIsInstance$1$2$1.label;
                        if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                            bitcoinBalanceWidgetPresenter$models$lambda$3$$inlined$filterIsInstance$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                            Object obj50 = bitcoinBalanceWidgetPresenter$models$lambda$3$$inlined$filterIsInstance$1$2$1.result;
                            Object obj51 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i22 = bitcoinBalanceWidgetPresenter$models$lambda$3$$inlined$filterIsInstance$1$2$1.label;
                            if (i22 != 0) {
                                SafeTrace.throwOnFailure(obj50);
                                if (obj instanceof BitcoinBalanceWidgetViewEvent$ToggleCurrencyDisplay) {
                                    bitcoinBalanceWidgetPresenter$models$lambda$3$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, bitcoinBalanceWidgetPresenter$models$lambda$3$$inlined$filterIsInstance$1$2$1) == obj51) {
                                        break;
                                    }
                                }
                            } else if (i22 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj50);
                            }
                            break;
                        }
                    }
                    bitcoinBalanceWidgetPresenter$models$lambda$3$$inlined$filterIsInstance$1$2$1 = new BitcoinBalanceWidgetPresenter$models$lambda$3$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj502 = bitcoinBalanceWidgetPresenter$models$lambda$3$$inlined$filterIsInstance$1$2$1.result;
                    Object obj512 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i22 = bitcoinBalanceWidgetPresenter$models$lambda$3$$inlined$filterIsInstance$1$2$1.label;
                    if (i22 != 0) {
                    }
                case 22:
                    if (continuation instanceof BitcoinBalanceWidgetPresenter$models$lambda$7$$inlined$map$1$2$1) {
                        bitcoinBalanceWidgetPresenter$models$lambda$7$$inlined$map$1$2$1 = (BitcoinBalanceWidgetPresenter$models$lambda$7$$inlined$map$1$2$1) continuation;
                        int i54 = bitcoinBalanceWidgetPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                        if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                            bitcoinBalanceWidgetPresenter$models$lambda$7$$inlined$map$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                            Object obj53 = bitcoinBalanceWidgetPresenter$models$lambda$7$$inlined$map$1$2$1.result;
                            Object obj54 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i23 = bitcoinBalanceWidgetPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                            if (i23 != 0) {
                                SafeTrace.throwOnFailure(obj53);
                                JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig = (JurisdictionConfigManager$JurisdictionConfig) obj;
                                obj2 = jurisdictionConfigManager$JurisdictionConfig != null ? jurisdictionConfigManager$JurisdictionConfig.defaultCurrency : null;
                                bitcoinBalanceWidgetPresenter$models$lambda$7$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj2, bitcoinBalanceWidgetPresenter$models$lambda$7$$inlined$map$1$2$1) == obj54) {
                                    break;
                                }
                            } else if (i23 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj53);
                            }
                            break;
                        }
                    }
                    bitcoinBalanceWidgetPresenter$models$lambda$7$$inlined$map$1$2$1 = new BitcoinBalanceWidgetPresenter$models$lambda$7$$inlined$map$1$2$1(this, continuation);
                    Object obj532 = bitcoinBalanceWidgetPresenter$models$lambda$7$$inlined$map$1$2$1.result;
                    Object obj542 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i23 = bitcoinBalanceWidgetPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                    if (i23 != 0) {
                    }
                case 23:
                    if (continuation instanceof BitcoinBoostWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) {
                        bitcoinBoostWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 = (BitcoinBoostWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) continuation;
                        int i55 = bitcoinBoostWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                        if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                            bitcoinBoostWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                            Object obj55 = bitcoinBoostWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.result;
                            Object obj56 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i24 = bitcoinBoostWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                            if (i24 != 0) {
                                SafeTrace.throwOnFailure(obj55);
                                if (obj instanceof BitcoinHomeViewEvent) {
                                    bitcoinBoostWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, bitcoinBoostWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) == obj56) {
                                        break;
                                    }
                                }
                            } else if (i24 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj55);
                            }
                            break;
                        }
                    }
                    bitcoinBoostWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 = new BitcoinBoostWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj552 = bitcoinBoostWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.result;
                    Object obj562 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i24 = bitcoinBoostWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                    if (i24 != 0) {
                    }
                case 24:
                    if (continuation instanceof BitcoinBoostWidgetPresenter$models$lambda$4$$inlined$map$1$2$1) {
                        bitcoinBoostWidgetPresenter$models$lambda$4$$inlined$map$1$2$1 = (BitcoinBoostWidgetPresenter$models$lambda$4$$inlined$map$1$2$1) continuation;
                        int i56 = bitcoinBoostWidgetPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                        if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                            bitcoinBoostWidgetPresenter$models$lambda$4$$inlined$map$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                            Object obj57 = bitcoinBoostWidgetPresenter$models$lambda$4$$inlined$map$1$2$1.result;
                            Object obj58 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i25 = bitcoinBoostWidgetPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                            if (i25 != 0) {
                                SafeTrace.throwOnFailure(obj57);
                                Object obj59 = ((BoostConfig) obj).bitcoinBoostUpsell;
                                bitcoinBoostWidgetPresenter$models$lambda$4$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj59, bitcoinBoostWidgetPresenter$models$lambda$4$$inlined$map$1$2$1) == obj58) {
                                    break;
                                }
                            } else if (i25 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj57);
                            }
                            break;
                        }
                    }
                    bitcoinBoostWidgetPresenter$models$lambda$4$$inlined$map$1$2$1 = new BitcoinBoostWidgetPresenter$models$lambda$4$$inlined$map$1$2$1(this, continuation);
                    Object obj572 = bitcoinBoostWidgetPresenter$models$lambda$4$$inlined$map$1$2$1.result;
                    Object obj582 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i25 = bitcoinBoostWidgetPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                    if (i25 != 0) {
                    }
                case 25:
                    if (continuation instanceof BitcoinTradeButtonsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) {
                        bitcoinTradeButtonsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 = (BitcoinTradeButtonsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) continuation;
                        int i57 = bitcoinTradeButtonsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                        if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                            bitcoinTradeButtonsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                            Object obj60 = bitcoinTradeButtonsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.result;
                            Object obj61 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i26 = bitcoinTradeButtonsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                            if (i26 != 0) {
                                SafeTrace.throwOnFailure(obj60);
                                if (obj instanceof BitcoinTradeButtonsWidgetViewEvent) {
                                    bitcoinTradeButtonsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, bitcoinTradeButtonsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) == obj61) {
                                        break;
                                    }
                                }
                            } else if (i26 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj60);
                            }
                            break;
                        }
                    }
                    bitcoinTradeButtonsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 = new BitcoinTradeButtonsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj602 = bitcoinTradeButtonsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.result;
                    Object obj612 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i26 = bitcoinTradeButtonsWidgetPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                    if (i26 != 0) {
                    }
                case 26:
                    if (continuation instanceof BitcoinDisclosureWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) {
                        bitcoinDisclosureWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = (BitcoinDisclosureWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) continuation;
                        int i58 = bitcoinDisclosureWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                        if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                            bitcoinDisclosureWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                            Object obj62 = bitcoinDisclosureWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                            Object obj63 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i27 = bitcoinDisclosureWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                            if (i27 != 0) {
                                SafeTrace.throwOnFailure(obj62);
                                if (obj instanceof BitcoinHomeDisclosureWidgetViewEvent$ViewDisclosure) {
                                    bitcoinDisclosureWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, bitcoinDisclosureWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) == obj63) {
                                        break;
                                    }
                                }
                            } else if (i27 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj62);
                            }
                            break;
                        }
                    }
                    bitcoinDisclosureWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = new BitcoinDisclosureWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj622 = bitcoinDisclosureWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                    Object obj632 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i27 = bitcoinDisclosureWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                    if (i27 != 0) {
                    }
                case 27:
                    if (continuation instanceof BitcoinStoriesWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) {
                        bitcoinStoriesWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = (BitcoinStoriesWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) continuation;
                        int i59 = bitcoinStoriesWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                        if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                            bitcoinStoriesWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                            Object obj64 = bitcoinStoriesWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                            Object obj65 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i28 = bitcoinStoriesWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                            if (i28 != 0) {
                                SafeTrace.throwOnFailure(obj64);
                                if (obj instanceof BitcoinStoriesWidgetViewEvent) {
                                    bitcoinStoriesWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, bitcoinStoriesWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) == obj65) {
                                        break;
                                    }
                                }
                            } else if (i28 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj64);
                            }
                            break;
                        }
                    }
                    bitcoinStoriesWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = new BitcoinStoriesWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj642 = bitcoinStoriesWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                    Object obj652 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i28 = bitcoinStoriesWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                    if (i28 != 0) {
                    }
                case 28:
                    if (continuation instanceof BitcoinGraphWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) {
                        bitcoinGraphWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = (BitcoinGraphWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) continuation;
                        int i60 = bitcoinGraphWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                        if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                            bitcoinGraphWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                            Object obj66 = bitcoinGraphWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                            Object obj67 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i29 = bitcoinGraphWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                            if (i29 != 0) {
                                SafeTrace.throwOnFailure(obj66);
                                if (obj instanceof BitcoinHomeGraphWidgetViewEvent$GraphEvent) {
                                    bitcoinGraphWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, bitcoinGraphWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) == obj67) {
                                        break;
                                    }
                                }
                            } else if (i29 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj66);
                            }
                            break;
                        }
                    }
                    bitcoinGraphWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = new BitcoinGraphWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj662 = bitcoinGraphWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                    Object obj672 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i29 = bitcoinGraphWidgetPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                    if (i29 != 0) {
                    }
                default:
                    if (continuation instanceof BitcoinGraphWidgetPresenter$models$lambda$14$$inlined$map$1$2$1) {
                        bitcoinGraphWidgetPresenter$models$lambda$14$$inlined$map$1$2$1 = (BitcoinGraphWidgetPresenter$models$lambda$14$$inlined$map$1$2$1) continuation;
                        int i61 = bitcoinGraphWidgetPresenter$models$lambda$14$$inlined$map$1$2$1.label;
                        if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                            bitcoinGraphWidgetPresenter$models$lambda$14$$inlined$map$1$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                            Object obj68 = bitcoinGraphWidgetPresenter$models$lambda$14$$inlined$map$1$2$1.result;
                            Object obj69 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i30 = bitcoinGraphWidgetPresenter$models$lambda$14$$inlined$map$1$2$1.label;
                            if (i30 != 0) {
                                SafeTrace.throwOnFailure(obj68);
                                JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig2 = (JurisdictionConfigManager$JurisdictionConfig) obj;
                                obj2 = jurisdictionConfigManager$JurisdictionConfig2 != null ? jurisdictionConfigManager$JurisdictionConfig2.defaultCurrency : null;
                                bitcoinGraphWidgetPresenter$models$lambda$14$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj2, bitcoinGraphWidgetPresenter$models$lambda$14$$inlined$map$1$2$1) == obj69) {
                                    break;
                                }
                            } else if (i30 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj68);
                            }
                            break;
                        }
                    }
                    bitcoinGraphWidgetPresenter$models$lambda$14$$inlined$map$1$2$1 = new BitcoinGraphWidgetPresenter$models$lambda$14$$inlined$map$1$2$1(this, continuation);
                    Object obj682 = bitcoinGraphWidgetPresenter$models$lambda$14$$inlined$map$1$2$1.result;
                    Object obj692 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i30 = bitcoinGraphWidgetPresenter$models$lambda$14$$inlined$map$1$2$1.label;
                    if (i30 != 0) {
                    }
            }
            return Unit.INSTANCE;
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
        }
    }
}
