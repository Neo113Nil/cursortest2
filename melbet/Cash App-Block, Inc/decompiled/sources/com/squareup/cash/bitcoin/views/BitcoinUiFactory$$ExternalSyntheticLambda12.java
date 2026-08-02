package com.squareup.cash.bitcoin.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.DpSize;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.benefits.viewmodels.PdsaBenefitsExplainerViewModel$Loaded;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.benefits.views.PdsaBenefitsExplainerViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.billssubscriptions.viewmodels.model.Merchant;
import com.squareup.cash.billssubscriptions.views.BillsSubscriptionsMerchantListViewKt;
import com.squareup.cash.bitcoin.applets.presenters.BitcoinAppletTilePresenter$Factory$Impl;
import com.squareup.cash.bitcoin.applets.presenters.data.BitcoinAppletTileRepository;
import com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel;
import com.squareup.cash.bitcoin.screens.ChangeNetworkQuestion;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDepositsViewModel;
import com.squareup.cash.bitcoin.viewmodels.BitcoinPayInUsdSettingsViewModel;
import com.squareup.cash.bitcoin.viewmodels.WalletAddressOptionsViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.activity.BitcoinDependentActivityViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.sendreceive.BitcoinSendReceiveBottomSheetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.sendreceive.BitcoinSendRestrictionViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption;
import com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.autowithdraw.BitcoinAutoWithdrawUpsellViewModel;
import com.squareup.cash.bitcoin.viewmodels.deposits.copy.BitcoinDepositCopyViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapErrorViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapViewModel;
import com.squareup.cash.bitcoin.viewmodels.paidinbitcoin.PaidInBitcoinCardUpsellViewModel;
import com.squareup.cash.bitcoin.viewmodels.paidinbitcoin.PaidInBitcoinLandingViewModel;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsContentViewModel;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.SendStablecoinModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositCopyViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositOptionsViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositViewModel$Loaded;
import com.squareup.cash.bitcoin.views.applet.BitcoinHomeViewKt;
import com.squareup.cash.bitcoin.views.applet.graph.BitcoinGraphHeaderKt;
import com.squareup.cash.bitcoin.views.applet.sendreceive.BitcoinSendReceiveBottomSheetView;
import com.squareup.cash.bitcoin.views.applet.sendreceive.BitcoinSendRestrictionViewKt;
import com.squareup.cash.bitcoin.views.applet.sendreceive.BitcoinSendRestrictionViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.bitcoin.views.applet.statsandsettings.BitcoinSettingsWidgetViewKt;
import com.squareup.cash.bitcoin.views.autowithdraw.BitcoinAutoWithdrawUpsellViewKt;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.bitcoin.views.deposits.copy.BitcoinAddressCopySheetView;
import com.squareup.cash.bitcoin.views.deposits.copy.BitcoinAddressCopySheetViewKt;
import com.squareup.cash.bitcoin.views.deposits.copy.BitcoinAddressCopySheetViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.bitcoin.views.deposits.copy.BitcoinDepositCopySheetView;
import com.squareup.cash.bitcoin.views.map.BitcoinMapErrorDialogViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.bitcoin.views.paidinbitcoin.PainInBitcoinUpsellViewKt;
import com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsContentKt;
import com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsViewKt;
import com.squareup.cash.bitcoin.views.stablecoin.SendStablecoinViewKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.cdf.crypto.CryptoStablecoinDepositSelectNetwork;
import com.squareup.cash.cdf.crypto.CryptoStablecoinDepositViewDestinationAddress;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.crypto.address.StablecoinDepositOption;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$ImageWithBackground;
import com.squareup.cash.limits.presenters.LimitsInlineMessagePresenter$MetroFactory;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUi;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinUiFactory$$ExternalSyntheticLambda12 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BitcoinUiFactory$$ExternalSyntheticLambda12(BitcoinDepositsViewModel bitcoinDepositsViewModel, Function1 function1) {
        this.$r8$classId = 17;
        this.f$0 = bitcoinDepositsViewModel;
        this.f$1 = function1;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$stablecoin$StablecoinDepositCopyViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        Function1 function1 = (Function1) this.f$1;
        StablecoinDepositCopyViewModel stablecoinDepositCopyViewModel = (StablecoinDepositCopyViewModel) this.f$0;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BitcoinMapViewKt$$ExternalSyntheticLambda6(18, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SheetKt.Sheet((Function0) rememberedValue, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-1906077424, new BorrowHomeKt$$ExternalSyntheticLambda0(6, stablecoinDepositCopyViewModel, function1), gapComposer), gapComposer, 100663344, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b9, code lost:
    
        if (r7 == r3) goto L53;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        long j;
        Function0 function0;
        int i;
        ComposableLambdaImpl composableLambdaImpl;
        NeverEqualPolicy neverEqualPolicy;
        Object obj3;
        boolean z;
        Object obj4;
        int i2 = this.$r8$classId;
        int i3 = 4;
        int i4 = 5;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i2) {
            case 0:
                BitcoinMapViewModel bitcoinMapViewModel = (BitcoinMapViewModel) obj6;
                Function1 function1 = (Function1) obj5;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    BitcoinMapViewKt.BitcoinMapView(bitcoinMapViewModel, function1, null, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Function1 function12 = (Function1) obj5;
                PdsaBenefitsExplainerViewModel$Loaded pdsaBenefitsExplainerViewModel$Loaded = (PdsaBenefitsExplainerViewModel$Loaded) obj6;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean changed = gapComposer2.changed(function12);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy2) {
                        rememberedValue = new BenefitsHubViewKt$$ExternalSyntheticLambda4(13, function12);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer2, 0, 1);
                    boolean changed2 = gapComposer2.changed(function12);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy2) {
                        rememberedValue2 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(14, function12);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    SheetKt.Sheet((Function0) rememberedValue2, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-1863966285, new PdsaBenefitsExplainerViewKt$$ExternalSyntheticLambda4(pdsaBenefitsExplainerViewModel$Loaded, function12), gapComposer2), gapComposer2, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                BillsSubscriptionsMerchantListViewKt.MerchantRow((Merchant) obj6, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                Utils_androidKt.UninstalledUI((BitcoinAppletTileModel.Uninstalled) obj6, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                Navigator navigator = (Navigator) obj;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                navigator.getClass();
                coroutineScope.getClass();
                LimitsInlineMessagePresenter$MetroFactory limitsInlineMessagePresenter$MetroFactory = ((BitcoinAppletTilePresenter$Factory$Impl) obj6).delegateFactory;
                BitcoinAppletTileRepository bitcoinAppletTileRepository = (BitcoinAppletTileRepository) limitsInlineMessagePresenter$MetroFactory.appService.getValue();
                PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl = (PromotedAppletTilePresenter$Factory$Impl) limitsInlineMessagePresenter$MetroFactory.limitsPageletStore.invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) limitsInlineMessagePresenter$MetroFactory.routerFactory.invoke();
                MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) limitsInlineMessagePresenter$MetroFactory.lastSeenPageletVersion.invoke();
                bitcoinAppletTileRepository.getClass();
                promotedAppletTilePresenter$Factory$Impl.getClass();
                androidStringManager.getClass();
                moneyAnalyticsService.getClass();
                Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(bitcoinAppletTileRepository, promotedAppletTilePresenter$Factory$Impl, androidStringManager, moneyAnalyticsService, navigator)), coroutineScope, (LifecycleOwner) obj5);
                return new TaxesAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels(), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 6), (byte) 0);
            case 5:
                Analytics analytics = (Analytics) ((LocalEditorialPresenter) obj6).launcher;
                MutableState mutableState = (MutableState) obj5;
                StablecoinDepositOption stablecoinDepositOption = (StablecoinDepositOption) obj2;
                ((ChangeNetworkQuestion) obj).getClass();
                if (stablecoinDepositOption != null) {
                    StablecoinNetwork stablecoinNetwork = stablecoinDepositOption.network;
                    if (!stablecoinDepositOption.equals((StablecoinDepositOption) mutableState.getValue())) {
                        mutableState.setValue(stablecoinDepositOption);
                        String str = stablecoinNetwork.chain;
                        String str2 = stablecoinNetwork.asset;
                        analytics.track(new CryptoStablecoinDepositSelectNetwork(str, str2), null);
                        analytics.track(new CryptoStablecoinDepositViewDestinationAddress(stablecoinNetwork.chain, str2), null);
                    }
                }
                return Unit.INSTANCE;
            case 6:
                Function1 function13 = (Function1) obj5;
                final BitcoinPayInUsdSettingsViewModel bitcoinPayInUsdSettingsViewModel = (BitcoinPayInUsdSettingsViewModel) obj6;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer3).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed3 = gapComposer3.changed(function13);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy2) {
                        rememberedValue3 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(25, function13);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    DBUtil.TitleBarSub("", navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue3, (Modifier) null, (Function3) null, gapComposer3, 54, 108);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                    Strings.getSizes(gapComposer3).getClass();
                    DefaultSizes.spacing.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer3, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer3).sectionTitle, (TextLineBalancing) null, bitcoinPayInUsdSettingsViewModel.header, (Map) null, (Function1) null, false);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer3, null);
                    Strings.getSizes(gapComposer3).getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer3).semantic.text.subtle, (Composer) gapComposer3, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer3).bodyMedium, (TextLineBalancing) null, bitcoinPayInUsdSettingsViewModel.description, (Map) null, (Function1) null, false);
                    final int i5 = 0;
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                    CellDefaultAccessory.Toggle toggle = new CellDefaultAccessory.Toggle(bitcoinPayInUsdSettingsViewModel.toggleEnabled);
                    ComposableLambdaImpl composableLambdaImpl2 = BitcoinInvoiceEntryViewKt.f247lambda$1334473949;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1576171262, new Function2() { // from class: com.squareup.cash.bitcoin.views.BitcoinPayInUsdSettingsViewKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            int i6 = i5;
                            BitcoinPayInUsdSettingsViewModel bitcoinPayInUsdSettingsViewModel2 = bitcoinPayInUsdSettingsViewModel;
                            switch (i6) {
                                case 0:
                                    Composer composer4 = (Composer) obj7;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinPayInUsdSettingsViewModel2.toggleTitle, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer5 = (Composer) obj7;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                    if (gapComposer5.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                                        String str3 = bitcoinPayInUsdSettingsViewModel2.toggleSubtitle;
                                        if (str3 == null) {
                                            gapComposer5.startReplaceGroup(1807526197);
                                        } else {
                                            gapComposer5.startReplaceGroup(1807526198);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer5.end(false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer3);
                    boolean changed4 = gapComposer3.changed(function13) | gapComposer3.changedInstance(bitcoinPayInUsdSettingsViewModel);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy2) {
                        rememberedValue4 = new BankingDialogKt$$ExternalSyntheticLambda5(28, function13, bitcoinPayInUsdSettingsViewModel);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    Function0 function02 = (Function0) rememberedValue4;
                    final int i6 = 1;
                    CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(composableLambdaImpl2, rememberComposableLambda, null, function02, null, false, false, Expect_jvmKt.rememberComposableLambda(1268612156, new Function2() { // from class: com.squareup.cash.bitcoin.views.BitcoinPayInUsdSettingsViewKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            int i62 = i6;
                            BitcoinPayInUsdSettingsViewModel bitcoinPayInUsdSettingsViewModel2 = bitcoinPayInUsdSettingsViewModel;
                            switch (i62) {
                                case 0:
                                    Composer composer4 = (Composer) obj7;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinPayInUsdSettingsViewModel2.toggleTitle, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer5 = (Composer) obj7;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                    if (gapComposer5.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                                        String str3 = bitcoinPayInUsdSettingsViewModel2.toggleSubtitle;
                                        if (str3 == null) {
                                            gapComposer5.startReplaceGroup(1807526197);
                                        } else {
                                            gapComposer5.startReplaceGroup(1807526198);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer5.end(false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer3), null, toggle, 0L, null, gapComposer3, 12582966, 0, 3444);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                BitcoinHomeViewKt.TopDivider((BitcoinHomeWidgetViewModel) obj6, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                BitcoinHomeViewKt.HandleScrollEvents((LazyListState) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                ClipOp.BitcoinDependentActivityWidget((BitcoinDependentActivityViewModel) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                LinkScanner linkScanner = (LinkScanner) obj6;
                String str3 = (String) obj5;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size48;
                    Color composeColor = ComposeUtilsKt.toComposeColor(((InvestingCryptoAvatarContentModel$ImageWithBackground) linkScanner).bgColor, gapComposer4);
                    if (composeColor == null) {
                        gapComposer4.startReplaceGroup(-1917599171);
                        Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                        } else {
                            gapComposer4.startReplaceGroup(-1762997739);
                            gapComposer4.end(false);
                        }
                        j = colors.semantic.icon.brand;
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(-1917601062);
                        gapComposer4.end(false);
                        j = composeColor.value;
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", j, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.Remote.Image(str3, false, null, 0L, new AvatarsKt$$ExternalSyntheticLambda0(15), 62), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer4, 3126, 0, 2000);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                BitcoinGraphHeaderKt.BitcoinGraphHeader((InvestingHomePortfolioHeaderContentModel) obj6, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(9));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                BitcoinGraphHeaderKt.NewUpToDateSubtitle((InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData) obj6, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                BitcoinSendReceiveBottomSheetViewModel bitcoinSendReceiveBottomSheetViewModel = (BitcoinSendReceiveBottomSheetViewModel) obj6;
                Function1 function14 = (Function1) obj5;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i7 = BitcoinSendReceiveBottomSheetView.$r8$clinit;
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    BitcoinSendRestrictionViewKt.BitcoinSendReceiveContent(bitcoinSendReceiveBottomSheetViewModel, function14, null, gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Function1 function15 = (Function1) obj5;
                BitcoinSendRestrictionViewModel bitcoinSendRestrictionViewModel = (BitcoinSendRestrictionViewModel) obj6;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    boolean changed5 = gapComposer6.changed(function15);
                    Object rememberedValue5 = gapComposer6.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy2) {
                        rememberedValue5 = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(11, function15);
                        gapComposer6.updateRememberedValue(rememberedValue5);
                    }
                    SheetKt.Sheet((Function0) rememberedValue5, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-1611108316, new BitcoinSendRestrictionViewKt$$ExternalSyntheticLambda4(bitcoinSendRestrictionViewModel, function15), gapComposer6), gapComposer6, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                BitcoinSettingsWidgetViewModel bitcoinSettingsWidgetViewModel = (BitcoinSettingsWidgetViewModel) obj6;
                Function1 function16 = (Function1) obj5;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    for (BitcoinSettingsWidgetOption bitcoinSettingsWidgetOption : bitcoinSettingsWidgetViewModel.items) {
                        BitcoinSettingsWidgetViewEvent event = bitcoinSettingsWidgetOption.getEvent();
                        if (event == null) {
                            gapComposer7.startReplaceGroup(1716275335);
                            i = 0;
                            gapComposer7.end(false);
                            function0 = null;
                        } else {
                            gapComposer7.startReplaceGroup(1716275336);
                            boolean changed6 = gapComposer7.changed(function16) | gapComposer7.changedInstance(event);
                            Object rememberedValue6 = gapComposer7.rememberedValue();
                            if (changed6 || rememberedValue6 == neverEqualPolicy2) {
                                rememberedValue6 = new BulletinTileKt$$ExternalSyntheticLambda12(i4, function16, event);
                                gapComposer7.updateRememberedValue(rememberedValue6);
                            }
                            function0 = (Function0) rememberedValue6;
                            i = 0;
                            gapComposer7.end(false);
                        }
                        BitcoinSettingsWidgetViewKt.StatsAndSettingsOption(bitcoinSettingsWidgetOption, null, function0, gapComposer7, i);
                    }
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Function1 function17 = (Function1) obj5;
                BitcoinAutoWithdrawUpsellViewModel bitcoinAutoWithdrawUpsellViewModel = (BitcoinAutoWithdrawUpsellViewModel) obj6;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                boolean shouldExecute = gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2);
                Applier applier = gapComposer8.applier;
                if (shouldExecute) {
                    Colors colors2 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 1.0f));
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer8, 0);
                    int hashCode2 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer8, systemBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer8.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer8, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer8, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    NavigationType navigationType2 = NavigationType.CLOSE;
                    boolean changed7 = gapComposer8.changed(function17);
                    Object rememberedValue7 = gapComposer8.rememberedValue();
                    if (changed7 || rememberedValue7 == neverEqualPolicy2) {
                        rememberedValue7 = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(20, function17);
                        gapComposer8.updateRememberedValue(rememberedValue7);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue7, (Modifier) null, (Function3) null, gapComposer8, 54, 108);
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f, true), 1.0f), ImageKt.rememberScrollState(gapComposer8), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer8, 0);
                    int hashCode3 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer8, verticalScroll$default);
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer8, composeUiNode$Companion$SetModifier$13, gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer8, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    Painter painterResource = Countries.painterResource(2131231133, 0, gapComposer8);
                    HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(Alignment.Companion.CenterHorizontally);
                    ((DefaultSizes) gapComposer8.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    ImageKt.Image(painterResource, null, SpacerKt.m300paddingVpY3zN4$default(horizontalAlignElement, RecyclerView.DECELERATION_RATE, 16.0f, 1), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer8, Painter.$stable | 48, 120);
                    ViewfinderKt.HeroHeader(Room.stringResource(gapComposer8, R.string.bitcoin_views_auto_withdraw_upsell_title), SizeKt.fillMaxWidth(companion, 1.0f), (String) null, (TextStyle) null, gapComposer8, 48, 12);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer8, null);
                    BitcoinAutoWithdrawUpsellViewKt.InfoCell(Icons.BankLinked24, Room.stringResource(gapComposer8, R.string.bitcoin_views_auto_withdraw_upsell_link_label), Room.stringResource(gapComposer8, R.string.bitcoin_views_auto_withdraw_upsell_link_description), gapComposer8, 6);
                    BitcoinAutoWithdrawUpsellViewKt.InfoCell(Icons.SavingsGoal24, Room.stringResource(gapComposer8, R.string.bitcoin_views_auto_withdraw_upsell_target_label), bitcoinAutoWithdrawUpsellViewModel.targetDescription, gapComposer8, 6);
                    BitcoinAutoWithdrawUpsellViewKt.InfoCell(Icons.Deposit24, Room.stringResource(gapComposer8, R.string.bitcoin_views_auto_withdraw_upsell_keep_label), Room.stringResource(gapComposer8, R.string.bitcoin_views_auto_withdraw_upsell_keep_description), gapComposer8, 6);
                    gapComposer8.end(true);
                    DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(-1454792203, new BrandSheetViewKt$$ExternalSyntheticLambda6(25, function17), gapComposer8), gapComposer8, 24960, 11);
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                BitcoinDepositsViewModel bitcoinDepositsViewModel = (BitcoinDepositsViewModel) obj6;
                Function1 function18 = (Function1) obj5;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    BitcoinDepositsViewKt.BitcoinDepositContent(bitcoinDepositsViewModel, function18, Modifier.Companion.$$INSTANCE, gapComposer9, 0, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                WalletAddressOptionsViewModel walletAddressOptionsViewModel = (WalletAddressOptionsViewModel) obj6;
                Function1 function19 = (Function1) obj5;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                int i8 = BitcoinAddressCopySheetView.$r8$clinit;
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (!gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    gapComposer10.skipToGroupEnd();
                } else if (walletAddressOptionsViewModel instanceof WalletAddressOptionsViewModel.Content) {
                    gapComposer10.startReplaceGroup(1838486315);
                    BitcoinAddressCopySheetViewKt.BitcoinAddressCopyContent((WalletAddressOptionsViewModel.Content) walletAddressOptionsViewModel, function19, null, gapComposer10, 0);
                    gapComposer10.end(false);
                } else {
                    if (!(walletAddressOptionsViewModel instanceof WalletAddressOptionsViewModel.Error)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer10, 1838484313, false);
                    }
                    gapComposer10.startReplaceGroup(1838488304);
                    BitcoinAddressCopySheetViewKt.BitcoinAddressCopyErrorContent((WalletAddressOptionsViewModel.Error) walletAddressOptionsViewModel, function19, null, gapComposer10, 0);
                    gapComposer10.end(false);
                }
                return Unit.INSTANCE;
            case 19:
                Function1 function110 = (Function1) obj5;
                WalletAddressOptionsViewModel.Content content = (WalletAddressOptionsViewModel.Content) obj6;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(-256785033, new BitcoinAddressCopySheetViewKt$$ExternalSyntheticLambda3(function110, content), gapComposer11), gapComposer11, 24966, 10);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                BitcoinDepositCopyViewModel bitcoinDepositCopyViewModel = (BitcoinDepositCopyViewModel) obj6;
                Function1 function111 = (Function1) obj5;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                int i9 = BitcoinDepositCopySheetView.$r8$clinit;
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (!gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    gapComposer12.skipToGroupEnd();
                } else if (bitcoinDepositCopyViewModel instanceof BitcoinDepositCopyViewModel.Error) {
                    gapComposer12.startReplaceGroup(-80435788);
                    BitcoinAddressCopySheetViewKt.DepositCopyError((BitcoinDepositCopyViewModel.Error) bitcoinDepositCopyViewModel, function111, null, gapComposer12, 0, 4);
                    gapComposer12.end(false);
                } else {
                    if (!(bitcoinDepositCopyViewModel instanceof BitcoinDepositCopyViewModel.Loaded) && !Intrinsics.areEqual(bitcoinDepositCopyViewModel, BitcoinDepositCopyViewModel.Loading.INSTANCE)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer12, -80436785, false);
                    }
                    gapComposer12.startReplaceGroup(-80433507);
                    BitcoinAddressCopySheetViewKt.BitcoinDepositCopyContent(bitcoinDepositCopyViewModel, function111, null, gapComposer12, 0);
                    gapComposer12.end(false);
                }
                return Unit.INSTANCE;
            case 21:
                BitcoinMapErrorViewModel bitcoinMapErrorViewModel = (BitcoinMapErrorViewModel) obj6;
                Function1 function112 = (Function1) obj5;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                int i10 = 1;
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(381169063, new BitcoinMapErrorDialogViewKt$$ExternalSyntheticLambda2(bitcoinMapErrorViewModel, 0), gapComposer13);
                    ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-46100666, new BitcoinMapErrorDialogViewKt$$ExternalSyntheticLambda2(bitcoinMapErrorViewModel, i10), gapComposer13);
                    ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(-2071223822, new BorrowHomeKt$$ExternalSyntheticLambda0(function112, bitcoinMapErrorViewModel, false ? 1 : 0, i3), gapComposer13);
                    String str4 = bitcoinMapErrorViewModel.negativeActionText;
                    if (str4 == null) {
                        gapComposer13.startReplaceGroup(975746871);
                        gapComposer13.end(false);
                        composableLambdaImpl = null;
                    } else {
                        gapComposer13.startReplaceGroup(975746872);
                        ComposableLambdaImpl rememberComposableLambda5 = Expect_jvmKt.rememberComposableLambda(823792893, new TabContentViewKt$$ExternalSyntheticLambda11(function112, str4, 8), gapComposer13);
                        gapComposer13.end(false);
                        composableLambdaImpl = rememberComposableLambda5;
                    }
                    ModalKt.Modal(Modifier.Companion.$$INSTANCE, rememberComposableLambda2, rememberComposableLambda3, rememberComposableLambda4, composableLambdaImpl, (Function3) null, gapComposer13, 3504, 32);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Function1 function113 = (Function1) obj5;
                PaidInBitcoinLandingViewModel paidInBitcoinLandingViewModel = (PaidInBitcoinLandingViewModel) obj6;
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors3 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                    } else {
                        gapComposer14.startReplaceGroup(-1762997739);
                        gapComposer14.end(false);
                    }
                    Modifier systemBarsPadding2 = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer14, 0);
                    int hashCode4 = Long.hashCode(gapComposer14.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer14.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer14, systemBarsPadding2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer14.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer14.startReusableNode();
                    if (gapComposer14.inserting) {
                        gapComposer14.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer14.useNode();
                    }
                    Updater.m576setimpl(gapComposer14, columnMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer14, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer14, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer14, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer14, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    NavigationType navigationType3 = NavigationType.CLOSE;
                    boolean changed8 = gapComposer14.changed(function113);
                    Object rememberedValue8 = gapComposer14.rememberedValue();
                    if (changed8 || rememberedValue8 == neverEqualPolicy2) {
                        rememberedValue8 = new BitcoinMapViewKt$$ExternalSyntheticLambda6(7, function113);
                        gapComposer14.updateRememberedValue(rememberedValue8);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType3, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue8, (Modifier) null, (Function3) null, gapComposer14, 54, 108);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer14, null);
                    PainInBitcoinUpsellViewKt.PaidInBitcoinLandingContent(paidInBitcoinLandingViewModel, function113, new LayoutWeightElement(1.0f, true), gapComposer14, 0);
                    gapComposer14.end(true);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                PaidInBitcoinCardUpsellViewModel paidInBitcoinCardUpsellViewModel = (PaidInBitcoinCardUpsellViewModel) obj6;
                Function1 function114 = (Function1) obj5;
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    String str5 = paidInBitcoinCardUpsellViewModel.header;
                    String str6 = paidInBitcoinCardUpsellViewModel.body;
                    Painter painterResource2 = Countries.painterResource(2131233214, 0, gapComposer15);
                    long m1091DpSizeYgX7TsA = BundleKt.m1091DpSizeYgX7TsA(262.0f, 210.0f);
                    NavigationType navigationType4 = NavigationType.CLOSE;
                    DpSize dpSize = new DpSize(m1091DpSizeYgX7TsA);
                    boolean changed9 = gapComposer15.changed(function114);
                    Object rememberedValue9 = gapComposer15.rememberedValue();
                    if (changed9 || rememberedValue9 == neverEqualPolicy2) {
                        rememberedValue9 = new BitcoinMapViewKt$$ExternalSyntheticLambda6(10, function114);
                        gapComposer15.updateRememberedValue(rememberedValue9);
                    }
                    VisibleKt.m3492InfoUpsellvCkY0N0(str5, painterResource2, Modifier.Companion.$$INSTANCE, dpSize, str6, navigationType4, (Function0) rememberedValue9, Expect_jvmKt.rememberComposableLambda(-1312509365, new BorrowHomeKt$$ExternalSyntheticLambda0(i4, paidInBitcoinCardUpsellViewModel, function114), gapComposer15), Expect_jvmKt.rememberComposableLambda(321566933, new SsnViewKt$$ExternalSyntheticLambda2(paidInBitcoinCardUpsellViewModel, i3), gapComposer15), gapComposer15, (Painter.$stable << 3) | 113445888, 0);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Function1 function115 = (Function1) obj5;
                BitcoinPerformanceDetailsViewModel bitcoinPerformanceDetailsViewModel = (BitcoinPerformanceDetailsViewModel) obj6;
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                boolean shouldExecute2 = gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2);
                Applier applier2 = gapComposer16.applier;
                if (shouldExecute2) {
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors4 = (Colors) gapComposer16.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer16, -1762997026, gapComposer16, false);
                    } else {
                        gapComposer16.startReplaceGroup(-1762997739);
                        gapComposer16.end(false);
                    }
                    Modifier systemBarsPadding3 = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize3, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer16, 0);
                    int hashCode5 = Long.hashCode(gapComposer16.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer16.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer16, systemBarsPadding3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer16.startReusableNode();
                    if (gapComposer16.inserting) {
                        gapComposer16.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer16.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer16, columnMeasurePolicy5, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer16, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf2 = Integer.valueOf(hashCode5);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer16, valueOf2, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer16, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer16, materializeModifier5, composeUiNode$Companion$SetModifier$18);
                    String stringResource = Room.stringResource(gapComposer16, R.string.bitcoin_views_performance_details_toolbar_title);
                    NavigationType navigationType5 = NavigationType.BACK;
                    boolean changed10 = gapComposer16.changed(function115);
                    Object rememberedValue10 = gapComposer16.rememberedValue();
                    Object obj7 = rememberedValue10;
                    if (changed10 || rememberedValue10 == neverEqualPolicy2) {
                        BitcoinMapViewKt$$ExternalSyntheticLambda6 bitcoinMapViewKt$$ExternalSyntheticLambda6 = new BitcoinMapViewKt$$ExternalSyntheticLambda6(12, function115);
                        gapComposer16.updateRememberedValue(bitcoinMapViewKt$$ExternalSyntheticLambda6);
                        obj7 = bitcoinMapViewKt$$ExternalSyntheticLambda6;
                    }
                    DBUtil.TitleBarSub(stringResource, navigationType5, (Modifier) null, (DynamicColorConfiguration) null, (Function0) obj7, (Modifier) null, (Function3) null, gapComposer16, 48, 108);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer16, 0);
                    int hashCode6 = Long.hashCode(gapComposer16.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer16.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer16, fillMaxWidth);
                    gapComposer16.startReusableNode();
                    if (gapComposer16.inserting) {
                        gapComposer16.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer16.useNode();
                    }
                    Updater.m576setimpl(gapComposer16, columnMeasurePolicy6, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer16, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer16, composeUiNode$Companion$SetModifier$17, gapComposer16, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(gapComposer16, materializeModifier6, composeUiNode$Companion$SetModifier$18);
                    boolean z2 = bitcoinPerformanceDetailsViewModel instanceof BitcoinPerformanceDetailsViewModel.Loaded;
                    if (z2) {
                        gapComposer16.startReplaceGroup(-1853258691);
                        BitcoinPerformanceDetailsContentViewModel bitcoinPerformanceDetailsContentViewModel = ((BitcoinPerformanceDetailsViewModel.Loaded) bitcoinPerformanceDetailsViewModel).model;
                        boolean changed11 = gapComposer16.changed(function115);
                        Object rememberedValue11 = gapComposer16.rememberedValue();
                        if (!changed11) {
                            neverEqualPolicy = neverEqualPolicy2;
                            obj3 = rememberedValue11;
                            break;
                        } else {
                            neverEqualPolicy = neverEqualPolicy2;
                        }
                        AvatarsKt$$ExternalSyntheticLambda1 avatarsKt$$ExternalSyntheticLambda1 = new AvatarsKt$$ExternalSyntheticLambda1(18, function115);
                        gapComposer16.updateRememberedValue(avatarsKt$$ExternalSyntheticLambda1);
                        obj3 = avatarsKt$$ExternalSyntheticLambda1;
                        Function1 function116 = (Function1) obj3;
                        boolean changed12 = gapComposer16.changed(function115);
                        Object rememberedValue12 = gapComposer16.rememberedValue();
                        if (changed12 || rememberedValue12 == neverEqualPolicy) {
                            z = false;
                            BalanceHomeViewKt$$ExternalSyntheticLambda12 balanceHomeViewKt$$ExternalSyntheticLambda12 = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function115, z, 23);
                            gapComposer16.updateRememberedValue(balanceHomeViewKt$$ExternalSyntheticLambda12);
                            obj4 = balanceHomeViewKt$$ExternalSyntheticLambda12;
                        } else {
                            z = false;
                            obj4 = rememberedValue12;
                        }
                        BitcoinPerformanceDetailsContentKt.BitcoinPerformanceDetailsContent(bitcoinPerformanceDetailsContentViewModel, function116, (Function2) obj4, SizeKt.fillMaxSize(companion, 1.0f), false, gapComposer16, 3072, 16);
                        gapComposer16.end(z);
                    } else {
                        neverEqualPolicy = neverEqualPolicy2;
                        if (!(bitcoinPerformanceDetailsViewModel instanceof BitcoinPerformanceDetailsViewModel.Loading)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer16, -613972910, false);
                        }
                        gapComposer16.startReplaceGroup(-1852939608);
                        BitcoinPerformanceDetailsViewKt.BitcoinPerformanceLoadingContent(null, ((BitcoinPerformanceDetailsViewModel.Loading) bitcoinPerformanceDetailsViewModel).detailsCopyData, gapComposer16, 0);
                        gapComposer16.end(false);
                    }
                    gapComposer16.end(true);
                    boolean changed13 = gapComposer16.changed(bitcoinPerformanceDetailsViewModel);
                    Object rememberedValue13 = gapComposer16.rememberedValue();
                    if (changed13 || rememberedValue13 == neverEqualPolicy) {
                        BitcoinPerformanceDetailsViewModel.Loaded loaded = z2 ? (BitcoinPerformanceDetailsViewModel.Loaded) bitcoinPerformanceDetailsViewModel : null;
                        BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem bitcoinPerformanceDetailsSectionInfoItem = loaded != null ? loaded.selectedInfoItem : null;
                        gapComposer16.updateRememberedValue(bitcoinPerformanceDetailsSectionInfoItem);
                        rememberedValue13 = bitcoinPerformanceDetailsSectionInfoItem;
                    }
                    BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem bitcoinPerformanceDetailsSectionInfoItem2 = (BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem) rememberedValue13;
                    if (bitcoinPerformanceDetailsSectionInfoItem2 != null) {
                        gapComposer16.startReplaceGroup(-1430552536);
                        BitcoinPerformanceDetailsViewKt.InfoItemBottomSheet(bitcoinPerformanceDetailsSectionInfoItem2, function115, null, gapComposer16, 0);
                        gapComposer16.end(false);
                    } else {
                        gapComposer16.startReplaceGroup(-1430478539);
                        gapComposer16.end(false);
                    }
                    gapComposer16.end(true);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                BitcoinPerformanceDetailsViewKt.BitcoinPerformanceLoadingContent((Modifier) obj6, (PerformanceDetailsUi) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                SendStablecoinViewKt.SendStablecoinContent((SendStablecoinModel.Content) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                return invoke$com$squareup$cash$bitcoin$views$stablecoin$StablecoinDepositCopyViewKt$$ExternalSyntheticLambda0(obj, obj2);
            case 28:
                ((Integer) obj2).getClass();
                SendStablecoinViewKt.NetworkRowItem((StablecoinDepositOptionsViewModel.NetworkRow) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded = (StablecoinDepositViewModel$Loaded) obj6;
                Function1 function117 = (Function1) obj5;
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    SendStablecoinViewKt.StablecoinDepositContent(stablecoinDepositViewModel$Loaded, function117, Modifier.Companion.$$INSTANCE, gapComposer17, 0, 0);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BitcoinUiFactory$$ExternalSyntheticLambda12(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = obj;
    }

    public /* synthetic */ BitcoinUiFactory$$ExternalSyntheticLambda12(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ BitcoinUiFactory$$ExternalSyntheticLambda12(BitcoinMapErrorViewModel bitcoinMapErrorViewModel, Function1 function1) {
        this.$r8$classId = 21;
        this.f$0 = bitcoinMapErrorViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ BitcoinUiFactory$$ExternalSyntheticLambda12(PaidInBitcoinCardUpsellViewModel paidInBitcoinCardUpsellViewModel, Function1 function1) {
        this.$r8$classId = 23;
        this.f$0 = paidInBitcoinCardUpsellViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ BitcoinUiFactory$$ExternalSyntheticLambda12(StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded, Function1 function1) {
        this.$r8$classId = 29;
        this.f$0 = stablecoinDepositViewModel$Loaded;
        this.f$1 = function1;
    }

    public /* synthetic */ BitcoinUiFactory$$ExternalSyntheticLambda12(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ BitcoinUiFactory$$ExternalSyntheticLambda12(Function1 function1, PaidInBitcoinLandingViewModel paidInBitcoinLandingViewModel) {
        this.$r8$classId = 22;
        this.f$1 = function1;
        this.f$0 = paidInBitcoinLandingViewModel;
    }

    public /* synthetic */ BitcoinUiFactory$$ExternalSyntheticLambda12(Function1 function1, BitcoinPerformanceDetailsViewModel bitcoinPerformanceDetailsViewModel) {
        this.$r8$classId = 24;
        this.f$1 = function1;
        this.f$0 = bitcoinPerformanceDetailsViewModel;
    }
}
