package com.squareup.cash.globalsearch.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.coroutines.ConnectionPoolKt;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ChromeSystemIconColor;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.mikepenz.markdown.compose.MarkdownExtensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.views.exchange.BitcoinExchangeViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.bitcoin.views.exchange.BitcoinExchangeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda0;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsActivityViewModel;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewModel;
import com.squareup.cash.history.viewmodels.ReportAbuseViewModel;
import com.squareup.cash.history.views.InvestingRoundUpsFailedDialog;
import com.squareup.cash.history.views.InvestingRoundUpsSkippedDialog;
import com.squareup.cash.history.views.ReportAbuseDialogView;
import com.squareup.cash.history.views.ReportAbuseViewKt;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.instruments.screens.TransferOptionPickerScreen;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.instruments.viewmodels.TransferOptionPickerViewModel;
import com.squareup.cash.instruments.views.InstrumentAvatarUtilsKt;
import com.squareup.cash.instruments.views.InstrumentsUiFactory$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.investing.components.ArcadeMigrationUtilsKt$investingCryptoExchangeView$1;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.components.InvestingStockSelectionViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.investing.components.MyFirstConfigurationView$$ExternalSyntheticLambda2;
import com.squareup.cash.investing.components.custom.order.CustomOrderKt;
import com.squareup.cash.investing.components.drip.DividendReinvestmentLearnMoreSheetViewV2;
import com.squareup.cash.investing.components.drip.DividendReinvestmentSettingView;
import com.squareup.cash.investing.components.exchange.InvestingExchangeView$Content$1$1$1;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.investing.viewmodels.InvestmentEntityContentModel;
import com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryDetailViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingDetailsCategorySectionContentModel;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderContentModel;
import com.squareup.cash.investing.viewmodels.dependent.DependentWelcomeViewModel;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentLearnMoreSheetViewModel;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentSettingViewModel;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentWelcomeViewModel;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingsViewModel;
import com.squareup.cash.investing.viewmodels.search.SearchResult;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.merchant.views.SquareLoyaltySheetView;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingStockDetailsHeaderViewModel;
import com.squareup.cash.sheet.PinnedKt;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetPeekPosition$FixedHeight;
import com.squareup.cash.sheet.SheetPosition;
import com.squareup.cash.sheet.SheetStateKt;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.views.shared.TransferSheetKt$TransferSheet$4$1;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda33;
import com.squareup.protos.common.Money;
import com.squareup.util.Strings;
import com.squareup.util.compose.SharedViewEventsKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import kotlinx.coroutines.guava.ListenableFutureKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class QuickAccessBarKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ QuickAccessBarKt$$ExternalSyntheticLambda1(Modifier modifier, RealImageLoader realImageLoader, InvestingStockSelectionViewModel.SearchResultItemModel searchResultItemModel) {
        this.$r8$classId = 13;
        this.f$1 = modifier;
        this.f$0 = realImageLoader;
        this.f$2 = searchResultItemModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01f6, code lost:
    
        if (r0 != null) goto L73;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Shaker shaker;
        boolean z;
        Object moleculeKt$immediateClockFlow$1$1$1;
        ArcadeMigrationUtilsKt$investingCryptoExchangeView$1 arcadeMigrationUtilsKt$investingCryptoExchangeView$1;
        boolean z2;
        List list;
        AmountDisplayState amountDisplayState;
        MutableState mutableState;
        boolean z3;
        Function1 function1;
        Object investingHomeView$onScrollFlow$1;
        MutableFloatState mutableFloatState;
        MutableFloatState mutableFloatState2;
        KClass kClass;
        Boolean bool;
        int i;
        Continuation continuation;
        State state;
        RealSheetState realSheetState;
        MutableState mutableState2;
        Object navHostKt$NavHost$33$1;
        MutableFloatState mutableFloatState3;
        Function1 function12;
        final MutableFloatState mutableFloatState4;
        int i2 = this.$r8$classId;
        Object obj3 = Composer.Companion.Empty;
        int i3 = 2;
        int i4 = 0;
        Object obj4 = this.f$1;
        Object obj5 = this.f$2;
        Object obj6 = this.f$0;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                QuickAccessBarKt.QuickAccessBar((GlobalSearchViewModel.QabSection) obj6, (Modifier) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                QuickAccessBarKt.GlobalSearchCell((GlobalSearchViewModel.Item) obj6, (Modifier) obj4, (GlobalSearchFeedKt$$ExternalSyntheticLambda5) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ((P2PListView) obj6).Content((GrowToolsActivityViewModel) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int i5 = InvestingRoundUpsFailedDialog.$r8$clinit;
                ((InvestingRoundUpsFailedDialog) obj6).Content((Unit) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                int i6 = InvestingRoundUpsSkippedDialog.$r8$clinit;
                ((InvestingRoundUpsSkippedDialog) obj6).Content((Unit) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ReportAbuseViewKt.PasscodeDialogContent((PasscodeDialogViewModel) obj6, (Function1) obj5, (String) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                int i7 = ReportAbuseDialogView.$r8$clinit;
                ((ReportAbuseDialogView) obj6).Content((ReportAbuseViewModel) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                Screen screen = (Screen) obj6;
                TransferOptionPickerViewModel transferOptionPickerViewModel = (TransferOptionPickerViewModel) obj4;
                Function1 function13 = (Function1) obj5;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                } else if (((TransferOptionPickerScreen) screen).forceDarkMode) {
                    gapComposer.startReplaceGroup(-105279812);
                    ChromeConfigKt.ChromeConfig(null, ChromeSystemIconColor.ALWAYS_LIGHT, null, null, null, null, null, gapComposer, 48, 125);
                    ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(-434401812, new InstrumentsUiFactory$$ExternalSyntheticLambda4(transferOptionPickerViewModel, function13), gapComposer), gapComposer, 3072, 6);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-105087178);
                    InstrumentAvatarUtilsKt.TransferOptionPickerView(transferOptionPickerViewModel, function13, gapComposer, 0);
                    gapComposer.end(false);
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ((SquareLoyaltySheetView) obj6).Content((SelectPaymentInstrumentViewModel) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                BarcodeScanning.GraphErrorUI((StocksAppletTileModel.Installed.GraphError) obj6, (AppletTile.AppletTileAppearance) obj4, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                BarcodeScanning.InstalledUI((StocksAppletTileModel.Installed.LoadedPriceMovement) obj6, (AppletTile.AppletTileAppearance) obj4, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                RealImageLoader realImageLoader = (RealImageLoader) obj6;
                InvestingDetailsCategorySectionContentModel.Cell cell = (InvestingDetailsCategorySectionContentModel.Cell) obj4;
                String str = (String) obj5;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(607302453, new SkipPaymentView$$ExternalSyntheticLambda1(11, cell, str), gapComposer2), gapComposer2, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ArcadeBordersKt.InvestingStockDetailsCollapsedHeader((InvestingStockDetailsHeaderViewModel) obj6, (RealImageLoader) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 13:
                Modifier modifier = (Modifier) obj4;
                RealImageLoader realImageLoader2 = (RealImageLoader) obj6;
                InvestingStockSelectionViewModel.SearchResultItemModel searchResultItemModel = (InvestingStockSelectionViewModel.SearchResultItemModel) obj5;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, modifier);
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
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader2), Expect_jvmKt.rememberComposableLambda(-1696591162, new InvestingStockSelectionViewKt$$ExternalSyntheticLambda15(searchResultItemModel, i3), gapComposer3), gapComposer3, 56);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ArcadeBordersKt.StockList((InvestingStockSelectionViewModel.Loaded) obj6, (RealImageLoader) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ArcadeBordersKt.InvestmentEntityButtons((InvestmentEntityContentModel.InvestmentEntityButtonContainerModel) obj6, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                ArcadeBordersKt.InvestingSearchStockRow((SearchResult) obj6, (Function1) obj5, (RealImageLoader) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ArcadeBordersKt.MyInvestmentsTile((MyInvestmentsContentModel) obj6, (Function0) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                InvestingCategoryDetailViewModel investingCategoryDetailViewModel = (InvestingCategoryDetailViewModel) obj6;
                RealImageLoader realImageLoader3 = (RealImageLoader) obj4;
                Function1 function14 = (Function1) obj5;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean z4 = investingCategoryDetailViewModel instanceof InvestingCategoryDetailViewModel.Loading;
                    Object rememberedValue = gapComposer4.rememberedValue();
                    if (rememberedValue == obj3) {
                        rememberedValue = new MyFirstConfigurationView$$ExternalSyntheticLambda2(23);
                        gapComposer4.updateRememberedValue(rememberedValue);
                    }
                    Strings.LoadableFullScreenContent(investingCategoryDetailViewModel, z4, null, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(1250416939, new FirstTimeBorrowKt$$ExternalSyntheticLambda2(investingCategoryDetailViewModel, realImageLoader3, function14, 12), gapComposer4), gapComposer4, 199680, 20);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                CustomOrderKt.ExpandedWidget((Function0) obj6, (Function0) obj4, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                CustomOrderKt.CustomOrderHeader((InvestingStockDetailsHeaderViewModel) obj6, (Function0) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                CustomOrderKt.CustomOrderToolbar((String) obj6, (Function0) obj4, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                AwaitKt.DependentWelcomeNullStateContent((DependentWelcomeViewModel) obj6, (Function0) obj4, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                MarkdownExtensionKt.DividendReinvestmentLearnMore((DividendReinvestmentLearnMoreSheetViewModel) obj6, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(9));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                int i8 = DividendReinvestmentLearnMoreSheetViewV2.$r8$clinit;
                ((DividendReinvestmentLearnMoreSheetViewV2) obj6).Content((DividendReinvestmentLearnMoreSheetViewModel) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                int i9 = DividendReinvestmentSettingView.$r8$clinit;
                ((DividendReinvestmentSettingView) obj6).Content((DividendReinvestmentSettingViewModel) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                ThreadPoolDispatcherKt.DividendReinvestmentWelcome((Modifier) obj4, (DividendReinvestmentWelcomeViewModel) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(65));
                return Unit.INSTANCE;
            case 27:
                ArcadeMigrationUtilsKt$investingCryptoExchangeView$1 arcadeMigrationUtilsKt$investingCryptoExchangeView$12 = (ArcadeMigrationUtilsKt$investingCryptoExchangeView$1) obj6;
                InvestingExchangeViewModel investingExchangeViewModel = (InvestingExchangeViewModel) obj4;
                Function1 function15 = (Function1) obj5;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Continuation continuation2 = null;
                    RealSheetState rememberSheetState = SheetStateKt.rememberSheetState(null, gapComposer5, 0, 1);
                    MutableState rememberUpdatedState = Updater.rememberUpdatedState(Reflection.factory.getOrCreateKotlinClass(investingExchangeViewModel.getClass()), gapComposer5);
                    boolean z5 = investingExchangeViewModel instanceof InvestingExchangeViewModel.Content.BottomSheetContent;
                    MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(z5 ? ((InvestingExchangeViewModel.Content.BottomSheetContent) investingExchangeViewModel).amountSelections : null, gapComposer5);
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    if (rememberedValue2 == obj3) {
                        rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer5.updateRememberedValue(rememberedValue2);
                    }
                    MutableState mutableState3 = (MutableState) rememberedValue2;
                    Object rememberedValue3 = gapComposer5.rememberedValue();
                    if (rememberedValue3 == obj3) {
                        rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer5.updateRememberedValue(rememberedValue3);
                    }
                    MutableState mutableState4 = (MutableState) rememberedValue3;
                    RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer5.consume(LocalCashVibratorKt.LocalCashVibrator);
                    Shaker rememberShaker = SharedViewEventsKt.rememberShaker(true, gapComposer5, 0);
                    boolean changed = gapComposer5.changed(function15) | gapComposer5.changedInstance(realCashVibrator) | gapComposer5.changedInstance(rememberShaker);
                    Object rememberedValue4 = gapComposer5.rememberedValue();
                    if (changed || rememberedValue4 == obj3) {
                        rememberedValue4 = new BitcoinExchangeViewKt$$ExternalSyntheticLambda3(function15, realCashVibrator, rememberShaker, mutableState4, 1);
                        shaker = rememberShaker;
                        gapComposer5.updateRememberedValue(rememberedValue4);
                    } else {
                        shaker = rememberShaker;
                    }
                    AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(null, null, (Function1) rememberedValue4, gapComposer5, 3);
                    boolean z6 = investingExchangeViewModel instanceof InvestingExchangeViewModel.Content.FullScreenContent;
                    InvestingExchangeViewModel.Content.FullScreenContent fullScreenContent = z6 ? (InvestingExchangeViewModel.Content.FullScreenContent) investingExchangeViewModel : null;
                    Money money = fullScreenContent != null ? fullScreenContent.maxAmount : null;
                    boolean changedInstance = gapComposer5.changedInstance(money) | gapComposer5.changed(rememberAmountDisplayState);
                    Object rememberedValue5 = gapComposer5.rememberedValue();
                    if (changedInstance || rememberedValue5 == obj3) {
                        rememberedValue5 = new InvestingExchangeView$Content$1$1$1(money, rememberAmountDisplayState, continuation2, i4);
                        gapComposer5.updateRememberedValue(rememberedValue5);
                    }
                    Updater.LaunchedEffect(gapComposer5, money, (Function2) rememberedValue5);
                    KClass kClass2 = (KClass) rememberUpdatedState.getValue();
                    List list2 = (List) rememberUpdatedState2.getValue();
                    boolean changedInstance2 = gapComposer5.changedInstance(arcadeMigrationUtilsKt$investingCryptoExchangeView$12) | gapComposer5.changedInstance(investingExchangeViewModel) | gapComposer5.changed(function15) | gapComposer5.changed(rememberAmountDisplayState);
                    Object rememberedValue6 = gapComposer5.rememberedValue();
                    if (changedInstance2 || rememberedValue6 == obj3) {
                        z = z5;
                        arcadeMigrationUtilsKt$investingCryptoExchangeView$1 = arcadeMigrationUtilsKt$investingCryptoExchangeView$12;
                        z2 = z6;
                        list = list2;
                        moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(arcadeMigrationUtilsKt$investingCryptoExchangeView$1, investingExchangeViewModel, rememberAmountDisplayState, function15, mutableState3, null, 15);
                        amountDisplayState = rememberAmountDisplayState;
                        mutableState = mutableState3;
                        investingExchangeViewModel = investingExchangeViewModel;
                        function15 = function15;
                        gapComposer5.updateRememberedValue(moleculeKt$immediateClockFlow$1$1$1);
                    } else {
                        moleculeKt$immediateClockFlow$1$1$1 = rememberedValue6;
                        z = z5;
                        amountDisplayState = rememberAmountDisplayState;
                        mutableState = mutableState3;
                        list = list2;
                        arcadeMigrationUtilsKt$investingCryptoExchangeView$1 = arcadeMigrationUtilsKt$investingCryptoExchangeView$12;
                        z2 = z6;
                    }
                    Updater.LaunchedEffect(kClass2, list, (Function2) moleculeKt$immediateClockFlow$1$1$1, gapComposer5);
                    boolean changed2 = gapComposer5.changed((KClass) rememberUpdatedState.getValue()) | gapComposer5.changed((List) rememberUpdatedState2.getValue());
                    Object rememberedValue7 = gapComposer5.rememberedValue();
                    if (changed2 || rememberedValue7 == obj3) {
                        if (z) {
                            if (!((Boolean) mutableState.getValue()).booleanValue()) {
                                List list3 = ((InvestingExchangeViewModel.Content.BottomSheetContent) investingExchangeViewModel).amountSelections;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    Iterator it = list3.iterator();
                                    while (it.hasNext()) {
                                        if (((AmountSelection) it.next()).isSelected()) {
                                        }
                                    }
                                }
                                z3 = false;
                            }
                            z3 = true;
                        } else {
                            if (z2) {
                                String str2 = ((InvestingExchangeViewModel.Content.FullScreenContent) investingExchangeViewModel).restoreKeypadAmount;
                                if (!Intrinsics.areEqual(str2, "0")) {
                                }
                            }
                            z3 = false;
                        }
                        rememberedValue7 = Recorder$$ExternalSyntheticOutline1.m(z3, gapComposer5);
                    }
                    final MutableState mutableState5 = (MutableState) rememberedValue7;
                    Boolean bool2 = (Boolean) mutableState4.getValue();
                    bool2.getClass();
                    boolean changedInstance3 = gapComposer5.changedInstance(investingExchangeViewModel) | gapComposer5.changed(mutableState5);
                    Object rememberedValue8 = gapComposer5.rememberedValue();
                    if (changedInstance3 || rememberedValue8 == obj3) {
                        function1 = function15;
                        Object gLSceneScopeProvider$SceneScope$2$1$1 = new GLSceneScopeProvider$SceneScope$2$1$1((Object) investingExchangeViewModel, mutableState4, mutableState5, (Continuation) null, 28);
                        gapComposer5.updateRememberedValue(gLSceneScopeProvider$SceneScope$2$1$1);
                        rememberedValue8 = gLSceneScopeProvider$SceneScope$2$1$1;
                    } else {
                        function1 = function15;
                    }
                    Updater.LaunchedEffect(gapComposer5, bool2, (Function2) rememberedValue8);
                    Object rememberedValue9 = gapComposer5.rememberedValue();
                    if (rememberedValue9 == obj3) {
                        rememberedValue9 = Recorder$$ExternalSyntheticOutline2.m(1.0f, gapComposer5);
                    }
                    MutableFloatState mutableFloatState5 = (MutableFloatState) rememberedValue9;
                    Object rememberedValue10 = gapComposer5.rememberedValue();
                    if (rememberedValue10 == obj3) {
                        rememberedValue10 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer5);
                    }
                    MutableFloatState mutableFloatState6 = (MutableFloatState) rememberedValue10;
                    Object rememberedValue11 = gapComposer5.rememberedValue();
                    if (rememberedValue11 == obj3) {
                        rememberedValue11 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer5.updateRememberedValue(rememberedValue11);
                    }
                    MutableState mutableState6 = (MutableState) rememberedValue11;
                    Object rememberedValue12 = gapComposer5.rememberedValue();
                    if (rememberedValue12 == obj3) {
                        rememberedValue12 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer5.updateRememberedValue(rememberedValue12);
                    }
                    MutableState mutableState7 = (MutableState) rememberedValue12;
                    boolean changed3 = gapComposer5.changed((KClass) rememberUpdatedState.getValue());
                    Object rememberedValue13 = gapComposer5.rememberedValue();
                    int i10 = 22;
                    if (changed3 || rememberedValue13 == obj3) {
                        rememberedValue13 = Updater.derivedStateOf(new GLSceneScope$$ExternalSyntheticLambda2(i10, investingExchangeViewModel, mutableState7, mutableState6));
                        gapComposer5.updateRememberedValue(rememberedValue13);
                    }
                    State state2 = (State) rememberedValue13;
                    Boolean bool3 = (Boolean) mutableState7.getValue();
                    bool3.getClass();
                    KClass kClass3 = (KClass) rememberUpdatedState.getValue();
                    boolean changedInstance4 = gapComposer5.changedInstance(investingExchangeViewModel) | gapComposer5.changed(rememberSheetState);
                    Object rememberedValue14 = gapComposer5.rememberedValue();
                    if (changedInstance4 || rememberedValue14 == obj3) {
                        mutableFloatState = mutableFloatState5;
                        mutableFloatState2 = mutableFloatState6;
                        kClass = kClass3;
                        bool = bool3;
                        i = 22;
                        continuation = null;
                        state = state2;
                        investingHomeView$onScrollFlow$1 = new InvestingHomeView$onScrollFlow$1(investingExchangeViewModel, rememberSheetState, mutableState7, continuation, 3);
                        realSheetState = rememberSheetState;
                        gapComposer5.updateRememberedValue(investingHomeView$onScrollFlow$1);
                    } else {
                        mutableFloatState = mutableFloatState5;
                        mutableFloatState2 = mutableFloatState6;
                        bool = bool3;
                        kClass = kClass3;
                        investingHomeView$onScrollFlow$1 = rememberedValue14;
                        i = 22;
                        continuation = null;
                        realSheetState = rememberSheetState;
                        state = state2;
                    }
                    Updater.LaunchedEffect(bool, kClass, (Function2) investingHomeView$onScrollFlow$1, gapComposer5);
                    SheetPosition settledPosition = realSheetState.getSettledPosition();
                    boolean changed4 = gapComposer5.changed(realSheetState);
                    Object rememberedValue15 = gapComposer5.rememberedValue();
                    if (changed4 || rememberedValue15 == obj3) {
                        Object transferSheetKt$TransferSheet$4$1 = new TransferSheetKt$TransferSheet$4$1(realSheetState, mutableState6, mutableState7, continuation, 2);
                        mutableState2 = mutableState7;
                        gapComposer5.updateRememberedValue(transferSheetKt$TransferSheet$4$1);
                        rememberedValue15 = transferSheetKt$TransferSheet$4$1;
                    } else {
                        mutableState2 = mutableState7;
                    }
                    Updater.LaunchedEffect(gapComposer5, settledPosition, (Function2) rememberedValue15);
                    Float valueOf = Float.valueOf(realSheetState.getExpandProgress());
                    Boolean bool4 = (Boolean) state.getValue();
                    bool4.getClass();
                    boolean changed5 = gapComposer5.changed(realSheetState) | gapComposer5.changed(state) | gapComposer5.changedInstance(investingExchangeViewModel) | gapComposer5.changed(function1);
                    Object rememberedValue16 = gapComposer5.rememberedValue();
                    if (changed5 || rememberedValue16 == obj3) {
                        mutableFloatState3 = mutableFloatState;
                        function12 = function1;
                        InvestingExchangeViewModel investingExchangeViewModel2 = investingExchangeViewModel;
                        RealSheetState realSheetState2 = realSheetState;
                        MutableFloatState mutableFloatState7 = mutableFloatState2;
                        navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1((Object) realSheetState2, (Object) investingExchangeViewModel2, (Object) function12, (MutableState) mutableFloatState3, (MutableState) mutableFloatState7, state, (Continuation) null, 9);
                        realSheetState = realSheetState2;
                        investingExchangeViewModel = investingExchangeViewModel2;
                        mutableFloatState4 = mutableFloatState7;
                        gapComposer5.updateRememberedValue(navHostKt$NavHost$33$1);
                    } else {
                        mutableFloatState3 = mutableFloatState;
                        function12 = function1;
                        navHostKt$NavHost$33$1 = rememberedValue16;
                        mutableFloatState4 = mutableFloatState2;
                    }
                    Updater.LaunchedEffect(valueOf, bool4, (Function2) navHostKt$NavHost$33$1, gapComposer5);
                    boolean changed6 = gapComposer5.changed(((Boolean) mutableState2.getValue()).booleanValue());
                    Object rememberedValue17 = gapComposer5.rememberedValue();
                    if (changed6 || rememberedValue17 == obj3) {
                        rememberedValue17 = Updater.derivedStateOf(new IntentLauncher$$ExternalSyntheticLambda0(12, arcadeMigrationUtilsKt$investingCryptoExchangeView$1, mutableState2));
                        gapComposer5.updateRememberedValue(rememberedValue17);
                    }
                    State state3 = (State) rememberedValue17;
                    Object rememberedValue18 = gapComposer5.rememberedValue();
                    if (rememberedValue18 == obj3) {
                        rememberedValue18 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer5);
                        gapComposer5.updateRememberedValue(rememberedValue18);
                    }
                    final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue18;
                    SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight = new SheetPeekPosition$FixedHeight(6, ((Number) state3.getValue()).intValue(), false);
                    boolean changed7 = gapComposer5.changed(function12);
                    Object rememberedValue19 = gapComposer5.rememberedValue();
                    if (changed7 || rememberedValue19 == obj3) {
                        rememberedValue19 = new InvestingNewsKt$$ExternalSyntheticLambda0(i, function12);
                        gapComposer5.updateRememberedValue(rememberedValue19);
                    }
                    Function0 function0 = (Function0) rememberedValue19;
                    final ArcadeMigrationUtilsKt$investingCryptoExchangeView$1 arcadeMigrationUtilsKt$investingCryptoExchangeView$13 = arcadeMigrationUtilsKt$investingCryptoExchangeView$1;
                    final Function1 function16 = function12;
                    final RealSheetState realSheetState3 = realSheetState;
                    final Shaker shaker2 = shaker;
                    final MutableState mutableState8 = mutableState;
                    final AmountDisplayState amountDisplayState2 = amountDisplayState;
                    final InvestingExchangeViewModel investingExchangeViewModel3 = investingExchangeViewModel;
                    final MutableFloatState mutableFloatState8 = mutableFloatState3;
                    SheetKt.Sheet(function0, null, realSheetState3, sheetPeekPosition$FixedHeight, null, false, null, Expect_jvmKt.rememberComposableLambda(-142916100, new Function3() { // from class: com.squareup.cash.investing.components.exchange.InvestingExchangeView$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            Function1 function17;
                            AmountDisplayState amountDisplayState3;
                            RealSheetState realSheetState4;
                            NeverEqualPolicy neverEqualPolicy;
                            GapComposer gapComposer6;
                            float f;
                            Modifier wrapContentHeight;
                            boolean z7;
                            boolean changed8;
                            Object rememberedValue20;
                            Object bitcoinExchangeViewKt$$ExternalSyntheticLambda8;
                            PaddingValues paddingValues = (PaddingValues) obj7;
                            Composer composer6 = (Composer) obj8;
                            int intValue6 = ((Integer) obj9).intValue();
                            paddingValues.getClass();
                            if ((intValue6 & 6) == 0) {
                                intValue6 |= ((GapComposer) composer6).changed(paddingValues) ? 4 : 2;
                            }
                            GapComposer gapComposer7 = (GapComposer) composer6;
                            boolean shouldExecute = gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18);
                            Applier applier = gapComposer7.applier;
                            if (shouldExecute) {
                                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer7, 0);
                                int hashCode2 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer7.currentCompositionLocalScope();
                                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer7, companion);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                if (applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer7.startReusableNode();
                                if (gapComposer7.inserting) {
                                    gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                                } else {
                                    gapComposer7.useNode();
                                }
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                                Updater.m576setimpl(gapComposer7, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                                Updater.m576setimpl(gapComposer7, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                                Integer valueOf2 = Integer.valueOf(hashCode2);
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                                Updater.m576setimpl(gapComposer7, valueOf2, composeUiNode$Companion$SetModifier$13);
                                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                                Updater.m575reconcileimpl(gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                                LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer7, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, true);
                                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                int hashCode3 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer7.currentCompositionLocalScope();
                                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer7, m);
                                gapComposer7.startReusableNode();
                                if (gapComposer7.inserting) {
                                    gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                                } else {
                                    gapComposer7.useNode();
                                }
                                Updater.m576setimpl(gapComposer7, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                                Updater.m576setimpl(gapComposer7, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer7, composeUiNode$Companion$SetModifier$13, gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                                Updater.m576setimpl(gapComposer7, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                                InvestingExchangeViewModel investingExchangeViewModel4 = InvestingExchangeViewModel.this;
                                boolean z8 = investingExchangeViewModel4 instanceof InvestingExchangeViewModel.Content.BottomSheetContent;
                                RealSheetState realSheetState5 = realSheetState3;
                                Function1 function18 = function16;
                                MutableState mutableState9 = mutableState5;
                                AmountDisplayState amountDisplayState4 = amountDisplayState2;
                                NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                                if (z8) {
                                    gapComposer7.startReplaceGroup(-1017712273);
                                    InvestingExchangeViewModel.Content.BottomSheetContent bottomSheetContent = (InvestingExchangeViewModel.Content.BottomSheetContent) investingExchangeViewModel4;
                                    boolean changed9 = gapComposer7.changed(mutableState9) | gapComposer7.changed(amountDisplayState4);
                                    ArcadeMigrationUtilsKt$investingCryptoExchangeView$1 arcadeMigrationUtilsKt$investingCryptoExchangeView$14 = arcadeMigrationUtilsKt$investingCryptoExchangeView$13;
                                    boolean changedInstance5 = changed9 | gapComposer7.changedInstance(arcadeMigrationUtilsKt$investingCryptoExchangeView$14) | gapComposer7.changed(function18);
                                    CoroutineScope coroutineScope2 = coroutineScope;
                                    boolean changedInstance6 = changedInstance5 | gapComposer7.changedInstance(coroutineScope2) | gapComposer7.changed(realSheetState5);
                                    Object rememberedValue21 = gapComposer7.rememberedValue();
                                    if (changedInstance6 || rememberedValue21 == neverEqualPolicy2) {
                                        bitcoinExchangeViewKt$$ExternalSyntheticLambda8 = new BitcoinExchangeViewKt$$ExternalSyntheticLambda8(function18, mutableState8, mutableState9, amountDisplayState4, arcadeMigrationUtilsKt$investingCryptoExchangeView$14, coroutineScope2, realSheetState5);
                                        function17 = function18;
                                        amountDisplayState3 = amountDisplayState4;
                                        realSheetState4 = realSheetState5;
                                        gapComposer7.updateRememberedValue(bitcoinExchangeViewKt$$ExternalSyntheticLambda8);
                                    } else {
                                        bitcoinExchangeViewKt$$ExternalSyntheticLambda8 = rememberedValue21;
                                        amountDisplayState3 = amountDisplayState4;
                                        function17 = function18;
                                        realSheetState4 = realSheetState5;
                                    }
                                    Function1 function19 = (Function1) bitcoinExchangeViewKt$$ExternalSyntheticLambda8;
                                    Modifier padding = SpacerKt.padding(companion, paddingValues);
                                    Object rememberedValue22 = gapComposer7.rememberedValue();
                                    if (rememberedValue22 == neverEqualPolicy2) {
                                        rememberedValue22 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState8, 20);
                                        gapComposer7.updateRememberedValue(rememberedValue22);
                                    }
                                    Modifier graphicsLayer = ColorKt.graphicsLayer(padding, (Function1) rememberedValue22);
                                    neverEqualPolicy = neverEqualPolicy2;
                                    gapComposer6 = gapComposer7;
                                    InvestingExchangeAtmPickerKt.InvestingExchangeAtmPicker(bottomSheetContent, function19, graphicsLayer, gapComposer6, 0, 0);
                                    gapComposer6.end(false);
                                } else {
                                    function17 = function18;
                                    amountDisplayState3 = amountDisplayState4;
                                    realSheetState4 = realSheetState5;
                                    neverEqualPolicy = neverEqualPolicy2;
                                    gapComposer6 = gapComposer7;
                                    gapComposer6.startReplaceGroup(-1016333238);
                                    gapComposer6.end(false);
                                }
                                if (investingExchangeViewModel4 instanceof InvestingExchangeViewModel.Content.FullScreenContent) {
                                    gapComposer6.startReplaceGroup(-1016277748);
                                    InvestingExchangeViewModel.Content.FullScreenContent fullScreenContent2 = (InvestingExchangeViewModel.Content.FullScreenContent) investingExchangeViewModel4;
                                    Object rememberedValue23 = gapComposer6.rememberedValue();
                                    if (rememberedValue23 == neverEqualPolicy) {
                                        rememberedValue23 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState4, 21);
                                        gapComposer6.updateRememberedValue(rememberedValue23);
                                    }
                                    Modifier graphicsLayer2 = ColorKt.graphicsLayer(companion, (Function1) rememberedValue23);
                                    f = 1.0f;
                                    GapComposer gapComposer8 = gapComposer6;
                                    InvestingExchangeKeypadAmountPickerKt.InvestingExchangeKeypadAmountPicker(fullScreenContent2, amountDisplayState3, shaker2, function17, graphicsLayer2, gapComposer8, 24576);
                                    gapComposer6 = gapComposer8;
                                    gapComposer6.end(false);
                                } else {
                                    f = 1.0f;
                                    gapComposer6.startReplaceGroup(-1015972150);
                                    gapComposer6.end(false);
                                }
                                gapComposer6.end(true);
                                if (investingExchangeViewModel4 instanceof InvestingExchangeViewModel.Content) {
                                    gapComposer6.startReplaceGroup(801961353);
                                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                                    wrapContentHeight = SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(PinnedKt.pinned(SpacerKt.m301paddingqDBjuR0(wrapContentHeight, 24.0f, 24.0f, 24.0f, 48.0f), realSheetState4), f);
                                    if (((Boolean) mutableState9.getValue()).booleanValue()) {
                                        InvestingExchangeViewModel.Content content = (InvestingExchangeViewModel.Content) investingExchangeViewModel4;
                                        if (!content.getHasInvalidAmount() && content.getSubmitButtonEnabled()) {
                                            z7 = true;
                                            changed8 = gapComposer6.changed(function17);
                                            rememberedValue20 = gapComposer6.rememberedValue();
                                            if (!changed8 || rememberedValue20 == neverEqualPolicy) {
                                                rememberedValue20 = new InvestingNewsKt$$ExternalSyntheticLambda0(21, function17);
                                                gapComposer6.updateRememberedValue(rememberedValue20);
                                            }
                                            GapComposer gapComposer9 = gapComposer6;
                                            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue20, fillMaxWidth, buttonProminence, false, z7, null, Expect_jvmKt.rememberComposableLambda(1973595314, new FormView$$ExternalSyntheticLambda0(investingExchangeViewModel4, 25), gapComposer6), gapComposer9, 1573248, 40);
                                            gapComposer6 = gapComposer9;
                                            gapComposer6.end(false);
                                        }
                                    }
                                    z7 = false;
                                    changed8 = gapComposer6.changed(function17);
                                    rememberedValue20 = gapComposer6.rememberedValue();
                                    if (!changed8) {
                                    }
                                    rememberedValue20 = new InvestingNewsKt$$ExternalSyntheticLambda0(21, function17);
                                    gapComposer6.updateRememberedValue(rememberedValue20);
                                    GapComposer gapComposer92 = gapComposer6;
                                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue20, fillMaxWidth, buttonProminence, false, z7, null, Expect_jvmKt.rememberComposableLambda(1973595314, new FormView$$ExternalSyntheticLambda0(investingExchangeViewModel4, 25), gapComposer6), gapComposer92, 1573248, 40);
                                    gapComposer6 = gapComposer92;
                                    gapComposer6.end(false);
                                } else {
                                    gapComposer6.startReplaceGroup(802472016);
                                    gapComposer6.end(false);
                                }
                                gapComposer6.end(true);
                            } else {
                                gapComposer7.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer5), gapComposer5, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                ListenableFutureKt.InvestingEtfHoldingsComponent((InvestingEtfHoldingsViewModel.Content) obj6, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                InvestingCustomOrderContentModel investingCustomOrderContentModel = (InvestingCustomOrderContentModel) obj6;
                Function1 function17 = (Function1) obj5;
                InvestingScreens.CustomOrderScreen customOrderScreen = (InvestingScreens.CustomOrderScreen) obj4;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    CustomOrderKt.CustomOrder(investingCustomOrderContentModel, function17, customOrderScreen.accentColor, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ QuickAccessBarKt$$ExternalSyntheticLambda1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ QuickAccessBarKt$$ExternalSyntheticLambda1(Modifier modifier, DividendReinvestmentWelcomeViewModel dividendReinvestmentWelcomeViewModel, Function1 function1, int i) {
        this.$r8$classId = 26;
        this.f$1 = modifier;
        this.f$0 = dividendReinvestmentWelcomeViewModel;
        this.f$2 = function1;
    }

    public /* synthetic */ QuickAccessBarKt$$ExternalSyntheticLambda1(InvestingCustomOrderContentModel investingCustomOrderContentModel, Function1 function1, InvestingScreens.CustomOrderScreen customOrderScreen) {
        this.$r8$classId = 29;
        this.f$0 = investingCustomOrderContentModel;
        this.f$2 = function1;
        this.f$1 = customOrderScreen;
    }

    public /* synthetic */ QuickAccessBarKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = obj3;
    }

    public /* synthetic */ QuickAccessBarKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Function function, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = function;
    }
}
