package com.squareup.cash.history.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.local.presenters.RealBrandFollowPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.worker.LocalActivitySetupTeardown;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.mikepenz.markdown.compose.MarkdownExtensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.cashapplite.views.KycAppletTile;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarKt;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda0;
import com.squareup.cash.history.viewmodels.PaymentReceiptDialogViewModel;
import com.squareup.cash.history.viewmodels.RefundPaymentViewModel;
import com.squareup.cash.history.viewmodels.SkipPaymentViewModel;
import com.squareup.cash.incentives.finishsetup.applets.presenters.FinishSetupAppletTilePresenter$Factory$Impl;
import com.squareup.cash.incentives.finishsetup.applets.presenters.RealFinishSetupAppletTileRepository;
import com.squareup.cash.incentives.finishsetup.applets.viewmodels.FinishSetupAppletTileViewModel;
import com.squareup.cash.incentives.finishsetup.applets.views.FinishSetupAppletTileKt;
import com.squareup.cash.initialscreenloader.viewmodels.AppUpgradeViewModel;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionViewModel;
import com.squareup.cash.instruments.views.InstrumentAvatarUtilsKt;
import com.squareup.cash.instruments.views.InstrumentCellKt;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda11;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTileRepository;
import com.squareup.cash.investing.applets.presenters.StocksAppletTilePresenter$Factory$Impl;
import com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.investing.components.InvestingHomeDisclosuresView;
import com.squareup.cash.investing.components.InvestingHomeDisclosuresView$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.MooncakeInvestingStockRowView;
import com.squareup.cash.investing.components.MooncakeMyInvestmentsTileView;
import com.squareup.cash.investing.components.autoinvest.InvestingAutoInvestKt;
import com.squareup.cash.investing.components.categories.InvestingCategoryDetailKt;
import com.squareup.cash.investing.components.categories.InvestingCategoryDetailKt$$ExternalSyntheticLambda5;
import com.squareup.cash.investing.components.categories.InvestingChoiceRow;
import com.squareup.cash.investing.components.categories.InvestingFilterCategoriesView;
import com.squareup.cash.investing.components.custom.order.CustomOrderGraphPriceModel;
import com.squareup.cash.investing.components.custom.order.CustomOrderHeaderViewKt$WhenMappings;
import com.squareup.cash.investing.components.custom.order.CustomOrderKt;
import com.squareup.cash.investing.components.custom.order.DragWidgetState;
import com.squareup.cash.investing.components.custom.order.GraphState;
import com.squareup.cash.investing.components.custom.order.PriceWidgetState;
import com.squareup.cash.investing.components.drip.DividendReinvestmentLearnMoreSheetView;
import com.squareup.cash.investing.components.drip.DividendReinvestmentWelcomeView;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.performance.SectionRowView;
import com.squareup.cash.investing.viewmodels.InvestmentEntityContentModel;
import com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel;
import com.squareup.cash.investing.viewmodels.StockMetric;
import com.squareup.cash.investing.viewmodels.activity.InvestingActivityHistoryViewModel;
import com.squareup.cash.investing.viewmodels.categories.FilterCategoriesViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryDetailViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingDetailsCategorySectionContentModel;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderContentModel;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentLearnMoreSheetViewModel;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentSettingViewModel;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentWelcomeViewModel;
import com.squareup.cash.investing.viewmodels.search.InvestingFilterResultViewModel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Icon;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Image;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda5;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.multiplatform.investing.PriceValue;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingStockDetailsHeaderViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.util.android.Views;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes6.dex */
public final /* synthetic */ class SkipPaymentView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ SkipPaymentView$$ExternalSyntheticLambda1(InvestingActivityHistoryViewModel investingActivityHistoryViewModel, Function1 function1) {
        this.$r8$classId = 16;
        this.f$0 = investingActivityHistoryViewModel;
        this.f$1 = function1;
    }

    private final Object invoke$com$squareup$cash$investing$components$custom$order$CustomOrderHeaderViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        InvestingStockDetailsHeaderViewModel investingStockDetailsHeaderViewModel = (InvestingStockDetailsHeaderViewModel) this.f$0;
        Function0 function0 = (Function0) this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            AvatarImage avatarImage = null;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            AvatarSize avatarSize = AvatarSize.Size64;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.icon.brand;
            LinkScanner linkScanner = investingStockDetailsHeaderViewModel.avatar;
            if (linkScanner == null) {
                gapComposer.startReplaceGroup(-409510612);
            } else {
                gapComposer.startReplaceGroup(818073973);
                if (linkScanner instanceof InvestingCryptoAvatarContentModel$Icon) {
                    gapComposer.startReplaceGroup(1801204151);
                    gapComposer.end(false);
                    InvestingCryptoImage investingCryptoImage = ((InvestingCryptoAvatarContentModel$Icon) linkScanner).image;
                    if (CustomOrderHeaderViewKt$WhenMappings.$EnumSwitchMapping$0[investingCryptoImage.ordinal()] != 1) {
                        OptionalProvider$$ExternalSyntheticLambda0.m((Object) investingCryptoImage, "Unsupported image: ");
                        return null;
                    }
                    avatarImage = new AvatarImage.LocalIcon(Icons.CurrencyBtc24, 0L, 6);
                } else {
                    if (!(linkScanner instanceof InvestingCryptoAvatarContentModel$Image)) {
                        gapComposer.startReplaceGroup(1801212922);
                        gapComposer.end(false);
                        OptionalProvider$$ExternalSyntheticLambda0.m((Object) linkScanner, "Unsupported content model: ");
                        return null;
                    }
                    gapComposer.startReplaceGroup(1801206570);
                    AvatarImage image = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(((InvestingCryptoAvatarContentModel$Image) linkScanner).image, gapComposer), false, null, 0L, new InstrumentCellKt$$ExternalSyntheticLambda11(17), 62);
                    gapComposer.end(false);
                    avatarImage = image;
                }
            }
            gapComposer.end(false);
            TextViewKt.Avatar(avatarSize, new AvatarEntry("", j, null, avatarImage, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer, 6, 28);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            StockMetric stockMetric = investingStockDetailsHeaderViewModel.metric;
            if (stockMetric == null) {
                gapComposer.startReplaceGroup(-409352171);
            } else {
                gapComposer.startReplaceGroup(-409352170);
                SizeKt.Button(function0, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1860166525, new FormView$$ExternalSyntheticLambda0(stockMetric, 21), gapComposer), gapComposer, 1572864, 62);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$investing$components$drip$DividendReinvestmentLearnMoreSheetViewKt$$ExternalSyntheticLambda3(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        MarkdownExtensionKt.DividendReinvestmentLearnMoreInfoSection((Modifier) this.f$0, (DividendReinvestmentLearnMoreSheetViewModel.InfoSection) this.f$1, (Composer) obj, Updater.updateChangedFlags(7));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$investing$components$drip$DividendReinvestmentSettingViewKt$$ExternalSyntheticLambda13(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        InterruptibleKt.EntryRow((DividendReinvestmentSettingViewModel.Entry) this.f$0, (Function1) this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$investing$components$drip$DividendReinvestmentWelcomeView$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        DividendReinvestmentWelcomeViewModel dividendReinvestmentWelcomeViewModel = (DividendReinvestmentWelcomeViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        int i = DividendReinvestmentWelcomeView.$r8$clinit;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            ThreadPoolDispatcherKt.DividendReinvestmentWelcome(null, dividendReinvestmentWelcomeViewModel, function1, gapComposer, 64);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        Pair pair;
        int i;
        int i2;
        Drawable drawable;
        int i3;
        int dip;
        Drawable drawable2;
        long j3;
        int i4 = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        InstrumentCellViewModel.InstrumentLabel instrumentLabel = null;
        instrumentLabel = null;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i5 = 3;
        int i6 = 2;
        int i7 = 1;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i4) {
            case 0:
                SkipPaymentViewModel skipPaymentViewModel = (SkipPaymentViewModel) obj4;
                Function1 function1 = (Function1) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i8 = SkipPaymentView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ModalKt.Modal((Modifier) null, skipPaymentViewModel.message, "", Expect_jvmKt.rememberComposableLambda(-282225508, new ErrorView$$ExternalSyntheticLambda3(27, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(-1978248867, new ErrorView$$ExternalSyntheticLambda3(28, function1), gapComposer), (Function3) null, gapComposer, 28032, 33);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                PaymentReceiptDialogViewModel paymentReceiptDialogViewModel = (PaymentReceiptDialogViewModel) obj4;
                Function1 function12 = (Function1) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i9 = PaymentReceiptDialogView.$r8$clinit;
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String str = paymentReceiptDialogViewModel.title;
                    ModalKt.Modal((Modifier) null, str == null ? "" : str, paymentReceiptDialogViewModel.content, Expect_jvmKt.rememberComposableLambda(548140741, new MoneyTabBookletKt$$ExternalSyntheticLambda4(11, function12, paymentReceiptDialogViewModel), gapComposer2), (Function3) null, (Function3) null, gapComposer2, 3072, 49);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                RefundPaymentViewModel refundPaymentViewModel = (RefundPaymentViewModel) obj4;
                Function1 function13 = (Function1) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i10 = RefundPaymentView.$r8$clinit;
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ModalKt.Modal((Modifier) null, "", refundPaymentViewModel.message, Expect_jvmKt.rememberComposableLambda(-1422366813, new ErrorView$$ExternalSyntheticLambda3(25, function13), gapComposer3), Expect_jvmKt.rememberComposableLambda(1832308644, new ErrorView$$ExternalSyntheticLambda3(26, function13), gapComposer3), (Function3) null, gapComposer3, 27696, 33);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                FinishSetupAppletTileKt.InstalledFinishSetupTile((FinishSetupAppletTileViewModel.Installed) obj4, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                Navigator navigator = (Navigator) obj;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                navigator.getClass();
                coroutineScope.getClass();
                LocalActivitySetupTeardown.MetroFactory metroFactory = ((FinishSetupAppletTilePresenter$Factory$Impl) obj4).delegateFactory;
                RealFinishSetupAppletTileRepository realFinishSetupAppletTileRepository = (RealFinishSetupAppletTileRepository) metroFactory.appForegroundStateProvider.invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.sessionManager.invoke();
                MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) metroFactory.syncValueReader.invoke();
                RealMoneyNavigatorHelper realMoneyNavigatorHelper = (RealMoneyNavigatorHelper) metroFactory.shortlinkHandler.invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.ioDispatcher.invoke();
                realFinishSetupAppletTileRepository.getClass();
                androidStringManager.getClass();
                moneyAnalyticsService.getClass();
                realMoneyNavigatorHelper.getClass();
                realRouter$Factory$Impl.getClass();
                Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new MusicPresenter(realFinishSetupAppletTileRepository, androidStringManager, moneyAnalyticsService, realMoneyNavigatorHelper, realRouter$Factory$Impl, navigator)), coroutineScope, (LifecycleOwner) obj3);
                return new KycAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels(), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 13), (short) 0);
            case 5:
                AppUpgradeViewModel appUpgradeViewModel = (AppUpgradeViewModel) obj4;
                Function1 function14 = (Function1) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Modifier fillMaxSize = androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    DBUtil.TitleBarSub((String) null, NavigationType.NONE, (Modifier) null, (DynamicColorConfiguration) null, (Function0) null, (Modifier) null, (Function3) null, gapComposer4, 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    String str2 = appUpgradeViewModel.title;
                    Countries.PageHeader(str2 == null ? "" : str2, (Modifier) null, AppUpgradeViewKt.f437lambda$1963635724, appUpgradeViewModel.message, gapComposer4, MLKEMEngine.KyberPolyBytes, 2);
                    SpacerKt.Spacer(gapComposer4, new LayoutWeightElement(1.0f, true));
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(365391403, new MoneyTabBookletKt$$ExternalSyntheticLambda4(12, (Object) appUpgradeViewModel, function14), gapComposer4), gapComposer4, 24576, 15);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                InstrumentCellViewModel instrumentCellViewModel = (InstrumentCellViewModel) obj4;
                AvatarSize avatarSize = (AvatarSize) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    InstrumentCellKt.InstrumentAvatar(Modifier.Companion.$$INSTANCE, instrumentCellViewModel.icons, avatarSize, gapComposer5, 6, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                InstrumentCellViewModel instrumentCellViewModel2 = (InstrumentCellViewModel) obj4;
                Color color = (Color) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer6, 0);
                    int hashCode2 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer6, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer6.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer6, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer6, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    String str3 = instrumentCellViewModel2.secondaryLabel;
                    String str4 = (str3 == null || str3.length() <= 0) ? null : str3;
                    if (str4 == null) {
                        gapComposer6.startReplaceGroup(1874336267);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(1874336268);
                        if (color != null) {
                            gapComposer6.startReplaceGroup(1981788058);
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, color.value, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                            gapComposer6.end(false);
                        } else {
                            gapComposer6.startReplaceGroup(1981878423);
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                            gapComposer6.end(false);
                        }
                        gapComposer6.end(false);
                    }
                    InstrumentCellViewModel.InstrumentLabel instrumentLabel2 = instrumentCellViewModel2.tertiaryLabel;
                    if (instrumentLabel2 != null && instrumentLabel2.text.length() > 0) {
                        instrumentLabel = instrumentLabel2;
                    }
                    if (instrumentLabel == null) {
                        gapComposer6.startReplaceGroup(1874658605);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(1874658606);
                        String str5 = instrumentLabel.text;
                        if (InstrumentCellKt.WhenMappings.$EnumSwitchMapping$0[instrumentLabel.color.ordinal()] == 1) {
                            gapComposer6.startReplaceGroup(1839012853);
                            Colors colors2 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                            if (colors2 == null) {
                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                            } else {
                                gapComposer6.startReplaceGroup(-1762997739);
                                gapComposer6.end(false);
                            }
                            j = colors2.semantic.text.danger;
                            gapComposer6.end(false);
                        } else {
                            gapComposer6.startReplaceGroup(1839014967);
                            Colors colors3 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                            if (colors3 == null) {
                                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                            } else {
                                gapComposer6.startReplaceGroup(-1762997739);
                                gapComposer6.end(false);
                            }
                            j = colors3.semantic.text.standard;
                            gapComposer6.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                        gapComposer6.end(false);
                    }
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                InstrumentSelectionViewModel instrumentSelectionViewModel = (InstrumentSelectionViewModel) obj4;
                Function1 function15 = (Function1) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    boolean changed = gapComposer7.changed(function15);
                    Object rememberedValue = gapComposer7.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new InviteContactsBodyKt$$ExternalSyntheticLambda5(5, function15);
                        gapComposer7.updateRememberedValue(rememberedValue);
                    }
                    Function1 function16 = (Function1) rememberedValue;
                    boolean changed2 = gapComposer7.changed(function15);
                    Object rememberedValue2 = gapComposer7.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(14, function15);
                        gapComposer7.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function0 = (Function0) rememberedValue2;
                    boolean changed3 = gapComposer7.changed(function15);
                    Object rememberedValue3 = gapComposer7.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(15, function15);
                        gapComposer7.updateRememberedValue(rememberedValue3);
                    }
                    InstrumentAvatarUtilsKt.InstrumentSelection(instrumentSelectionViewModel, function16, function0, (Function0) rememberedValue3, null, gapComposer7, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                BarcodeScanning.UninstalledUI((StocksAppletTileModel.Uninstalled) obj4, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                Navigator navigator2 = (Navigator) obj;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj2;
                navigator2.getClass();
                coroutineScope2.getClass();
                RealBrandFollowPresenter.MetroFactory metroFactory2 = ((StocksAppletTilePresenter$Factory$Impl) obj4).delegateFactory;
                AndroidStringManager androidStringManager2 = (AndroidStringManager) metroFactory2.syncer.invoke();
                RealStocksAppletTileRepository realStocksAppletTileRepository = (RealStocksAppletTileRepository) metroFactory2.store.invoke();
                MoneyAnalyticsService moneyAnalyticsService2 = (MoneyAnalyticsService) metroFactory2.service.invoke();
                RealInvestingStateManager realInvestingStateManager = (RealInvestingStateManager) metroFactory2.repository.invoke();
                PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl = (PromotedAppletTilePresenter$Factory$Impl) metroFactory2.analytics.invoke();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory2.responseContextHandlerFactory.invoke();
                androidStringManager2.getClass();
                realStocksAppletTileRepository.getClass();
                moneyAnalyticsService2.getClass();
                realInvestingStateManager.getClass();
                promotedAppletTilePresenter$Factory$Impl.getClass();
                factory.getClass();
                Presenter.Binding start$default2 = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(androidStringManager2, realStocksAppletTileRepository, moneyAnalyticsService2, realInvestingStateManager, promotedAppletTilePresenter$Factory$Impl, navigator2, factory)), coroutineScope2, (LifecycleOwner) obj3);
                return new TaxesAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default2).getModels(), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default2, 14), 0);
            case 11:
                InvestingDetailsCategorySectionContentModel.Cell cell = (InvestingDetailsCategorySectionContentModel.Cell) obj4;
                String str6 = (String) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    AvatarSize avatarSize2 = AvatarSize.Size48;
                    Color forTheme = ThemablesKt.forTheme(cell.gradientColor, gapComposer8);
                    if (forTheme == null) {
                        gapComposer8.startReplaceGroup(-497885829);
                        Colors colors4 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                        if (colors4 == null) {
                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                        } else {
                            gapComposer8.startReplaceGroup(-1762997739);
                            gapComposer8.end(false);
                        }
                        j2 = colors4.semantic.background.subtle;
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(-497887999);
                        gapComposer8.end(false);
                        j2 = forTheme.value;
                    }
                    Colors colors5 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    TextViewKt.Avatar(avatarSize2, new AvatarEntry("", j2, null, new AvatarImage.Remote.Image(str6, true, null, colors5.semantic.icon.inverse, new InstrumentCellKt$$ExternalSyntheticLambda11(11), 44), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer8, 6, 28);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                String str7 = (String) obj4;
                InvestingHomeDisclosuresView investingHomeDisclosuresView = (InvestingHomeDisclosuresView) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                int i11 = InvestingHomeDisclosuresView.$r8$clinit;
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    TextStyle textStyle = ((Typography) gapComposer9.consume(staticProvidableCompositionLocal)).bodyXSmall;
                    Colors colors6 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    long j4 = colors6.semantic.text.standard;
                    MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(((Typography) gapComposer9.consume(staticProvidableCompositionLocal)).linkXSmall.spanStyle, i6);
                    boolean changedInstance = gapComposer9.changedInstance(investingHomeDisclosuresView);
                    Object rememberedValue4 = gapComposer9.rememberedValue();
                    if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new InvestingHomeDisclosuresView$$ExternalSyntheticLambda0(investingHomeDisclosuresView);
                        gapComposer9.updateRememberedValue(rememberedValue4);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(str7, (Function2) rememberedValue4, fillMaxWidth, textStyle, j4, markdownSpanValues, null, null, 0, 0, 3, gapComposer9, MLKEMEngine.KyberPolyBytes, 960);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                InvestmentEntityContentModel.InvestmentEntityButtonContainerModel investmentEntityButtonContainerModel = (InvestmentEntityContentModel.InvestmentEntityButtonContainerModel) obj4;
                Function1 function17 = (Function1) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    String str8 = investmentEntityButtonContainerModel.firstButton;
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (str8 == null) {
                        gapComposer10.startReplaceGroup(-1791782796);
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(-1791782795);
                        ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                        Modifier weight = rowScopeInstance.weight(1.0f, companion, true);
                        boolean changed4 = gapComposer10.changed(function17);
                        Object rememberedValue5 = gapComposer10.rememberedValue();
                        if (changed4 || rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(28, function17);
                            gapComposer10.updateRememberedValue(rememberedValue5);
                        }
                        SizeKt.Button((Function0) rememberedValue5, weight, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-424146929, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str8, i7), gapComposer10), gapComposer10, 1573248, 56);
                        gapComposer10.end(false);
                    }
                    String str9 = investmentEntityButtonContainerModel.secondButton;
                    if (str9 == null) {
                        gapComposer10.startReplaceGroup(-1791523853);
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(-1791523852);
                        ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                        Modifier weight2 = rowScopeInstance.weight(1.0f, companion, true);
                        boolean changed5 = gapComposer10.changed(function17);
                        Object rememberedValue6 = gapComposer10.rememberedValue();
                        if (changed5 || rememberedValue6 == neverEqualPolicy) {
                            rememberedValue6 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(29, function17);
                            gapComposer10.updateRememberedValue(rememberedValue6);
                        }
                        SizeKt.Button((Function0) rememberedValue6, weight2, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(-1563623688, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str9, i6), gapComposer10), gapComposer10, 1573248, 56);
                        gapComposer10.end(false);
                    }
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                MooncakeInvestingStockRowView mooncakeInvestingStockRowView = (MooncakeInvestingStockRowView) obj4;
                LinkScanner linkScanner = (LinkScanner) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(mooncakeInvestingStockRowView.imageLoader), Expect_jvmKt.rememberComposableLambda(-1547585686, new CashMapViewKt$$ExternalSyntheticLambda5(linkScanner, i5), gapComposer11), gapComposer11, 56);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                MyInvestmentsContentModel myInvestmentsContentModel = (MyInvestmentsContentModel) obj4;
                MooncakeMyInvestmentsTileView mooncakeMyInvestmentsTileView = (MooncakeMyInvestmentsTileView) obj3;
                int intValue12 = ((Integer) obj).intValue();
                SectionRowView sectionRowView = (SectionRowView) obj2;
                int i12 = MooncakeMyInvestmentsTileView.$r8$clinit;
                sectionRowView.getClass();
                MyInvestmentsContentModel.StatRow statRow = (MyInvestmentsContentModel.StatRow) myInvestmentsContentModel.getInvestmentStats().get(intValue12);
                String str10 = statRow.label;
                String str11 = statRow.value;
                MyInvestmentsContentModel.StatRow.StatValueIconKind statValueIconKind = statRow.valueIcon;
                int i13 = statValueIconKind == null ? -1 : MooncakeMyInvestmentsTileView.WhenMappings.$EnumSwitchMapping$0[statValueIconKind.ordinal()];
                if (i13 == -1) {
                    pair = null;
                } else if (i13 == 1) {
                    Context context = mooncakeMyInvestmentsTileView.getContext();
                    context.getClass();
                    pair = new Pair(PlatformKt.getDrawableCompat(context, R.drawable.investing_components_section_row_arrow_up, null), mooncakeMyInvestmentsTileView.getContext().getString(R.string.investing_components_up_arrow_content_description));
                } else {
                    if (i13 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Context context2 = mooncakeMyInvestmentsTileView.getContext();
                    context2.getClass();
                    pair = new Pair(PlatformKt.getDrawableCompat(context2, R.drawable.investing_components_section_row_arrow_down, null), mooncakeMyInvestmentsTileView.getContext().getString(R.string.investing_components_down_arrow_content_description));
                }
                boolean isStale = myInvestmentsContentModel.isStale();
                AppCompatImageView appCompatImageView = sectionRowView.moreInfoView;
                AppCompatTextView appCompatTextView = sectionRowView.valueView;
                AppCompatImageView appCompatImageView2 = sectionRowView.valueIconView;
                AppCompatTextView appCompatTextView2 = sectionRowView.labelView;
                appCompatTextView2.setText(str10);
                appCompatTextView2.setContentDescription(str10);
                appCompatTextView.setText(str11);
                appCompatImageView.setVisibility(8);
                appCompatImageView.setContentDescription(sectionRowView.getContext().getString(R.string.investing_components_investing_transfer_stock_more_info));
                if (isStale) {
                    Context context3 = sectionRowView.getContext();
                    context3.getClass();
                    i = context3.getColor(R.color.investing_components_stale_data);
                } else {
                    i = ThemeHelpersKt.themeInfo(sectionRowView).colorPalette.label;
                }
                appCompatTextView2.setTextColor(i);
                if (isStale) {
                    Context context4 = sectionRowView.getContext();
                    context4.getClass();
                    i2 = context4.getColor(R.color.investing_components_stale_data);
                } else {
                    i2 = sectionRowView.colorPalette.label;
                }
                appCompatTextView.setTextColor(i2);
                if (pair == null || (drawable2 = (Drawable) pair.first) == null || (drawable = drawable2.mutate()) == null) {
                    drawable = null;
                } else {
                    drawable.setTint(i2);
                }
                appCompatImageView2.setVisibility(drawable != null ? 0 : 8);
                appCompatImageView2.setImageDrawable(drawable);
                appCompatImageView2.setContentDescription(pair != null ? (String) pair.second : null);
                if (intValue12 == 0) {
                    dip = mooncakeMyInvestmentsTileView.getDip(28);
                    i3 = 12;
                } else {
                    i3 = 12;
                    dip = mooncakeMyInvestmentsTileView.getDip(12);
                }
                sectionRowView.setPadding(sectionRowView.getPaddingLeft(), dip, sectionRowView.getPaddingRight(), intValue12 == CollectionsKt__CollectionsKt.getLastIndex(myInvestmentsContentModel.getInvestmentStats()) ? mooncakeMyInvestmentsTileView.getDip(28) : mooncakeMyInvestmentsTileView.getDip(i3));
                return Unit.INSTANCE;
            case 16:
                InvestingActivityHistoryViewModel investingActivityHistoryViewModel = (InvestingActivityHistoryViewModel) obj4;
                Function1 function18 = (Function1) obj3;
                Composer composer12 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Colors colors7 = (Colors) gapComposer12.consume(ArcadeThemeKt.LocalColors);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
                    } else {
                        gapComposer12.startReplaceGroup(-1762997739);
                        gapComposer12.end(false);
                    }
                    Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, colors7.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 1.0f));
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer12, 0);
                    int hashCode3 = Long.hashCode(gapComposer12.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer12.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer12, navigationBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer12.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer12.startReusableNode();
                    if (gapComposer12.inserting) {
                        gapComposer12.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer12.useNode();
                    }
                    Updater.m576setimpl(gapComposer12, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer12, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer12, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer12, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer12, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    InvestingActivityHistoryViewModel.Content content = (InvestingActivityHistoryViewModel.Content) investingActivityHistoryViewModel;
                    String str12 = content.title;
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed6 = gapComposer12.changed(function18);
                    Object rememberedValue7 = gapComposer12.rememberedValue();
                    if (changed6 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new InvestingNewsKt$$ExternalSyntheticLambda0(i7, function18);
                        gapComposer12.updateRememberedValue(rememberedValue7);
                    }
                    DBUtil.TitleBarSub(str12, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue7, (Modifier) null, (Function3) null, gapComposer12, 48, 108);
                    AvatarsKt.ActivityScrollableEmbeddedView(content.activityModel, androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f), (LazyListState) null, (PaddingValues) null, (Function3) null, (Function2) null, (Function3) null, gapComposer12, 48, 508);
                    gapComposer12.end(true);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                InvestingAutoInvestKt.InvestingAutoInvest((InvestingCryptoRecurringPurchaseTileViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                Function1 function19 = (Function1) obj3;
                InvestingCategoryDetailViewModel investingCategoryDetailViewModel = (InvestingCategoryDetailViewModel) obj4;
                Composer composer13 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Modifier clipToBounds = ClipKt.clipToBounds(new LayoutWeightElement(1.0f, true));
                    NavigationType navigationType2 = NavigationType.BACK;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-382398246, new InvestingCategoryDetailKt$$ExternalSyntheticLambda5(investingCategoryDetailViewModel, r4 ? 1 : 0), gapComposer13);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-597076039, new InvestingCategoryDetailKt$$ExternalSyntheticLambda5(investingCategoryDetailViewModel, i6), gapComposer13);
                    ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-533905470, new MusicViewKt$$ExternalSyntheticLambda7(7, function19), gapComposer13);
                    boolean changed7 = gapComposer13.changed(function19);
                    Object rememberedValue8 = gapComposer13.rememberedValue();
                    if (changed7 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new InvestingNewsKt$$ExternalSyntheticLambda0(i5, function19);
                        gapComposer13.updateRememberedValue(rememberedValue8);
                    }
                    CollapsingToolbarKt.m3475CollapsingHeaderScaffold8r3B23s(clipToBounds, rememberComposableLambda, rememberComposableLambda2, 0L, rememberComposableLambda3, navigationType2, (Function0) rememberedValue8, Expect_jvmKt.rememberComposableLambda(-397331559, new MoneyTabBookletKt$$ExternalSyntheticLambda4(16, (Object) investingCategoryDetailViewModel, function19), gapComposer13), gapComposer13, 12804528);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                int intValue15 = ((Integer) obj).intValue();
                InvestingChoiceRow investingChoiceRow = (InvestingChoiceRow) obj2;
                int i14 = InvestingFilterCategoriesView.$r8$clinit;
                investingChoiceRow.getClass();
                FilterCategoriesViewModel.ChoiceRowModel choiceRowModel = (FilterCategoriesViewModel.ChoiceRowModel) ((FilterCategoriesViewModel.Content) obj4).choiceRows.get(intValue15);
                IntentLauncher$$ExternalSyntheticLambda0 intentLauncher$$ExternalSyntheticLambda0 = new IntentLauncher$$ExternalSyntheticLambda0(r8, (InvestingFilterCategoriesView) obj3, choiceRowModel);
                AppCompatTextView appCompatTextView3 = investingChoiceRow.descriptionView;
                choiceRowModel.getClass();
                boolean z = choiceRowModel.isChecked;
                String str13 = choiceRowModel.description;
                AppCompatTextView appCompatTextView4 = investingChoiceRow.titleView;
                if (z) {
                    Drawable mutate = investingChoiceRow.choiceCheckedDrawable.mutate();
                    mutate.setTint(investingChoiceRow.colorPalette.tint);
                    Views.setCompoundDrawableStart(appCompatTextView4, mutate);
                } else {
                    Views.setCompoundDrawableStart(appCompatTextView4, investingChoiceRow.choiceUncheckedDrawable);
                }
                appCompatTextView4.setText(choiceRowModel.label);
                if (str13 == null) {
                    appCompatTextView3.setVisibility(8);
                } else {
                    appCompatTextView3.setVisibility(0);
                    appCompatTextView3.setText(str13);
                }
                investingChoiceRow.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(intentLauncher$$ExternalSyntheticLambda0, 4));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                InvestingCategoryDetailKt.FilterResultRow((InvestingFilterResultViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                CustomOrderKt.CustomOrderExplanation((InvestingCustomOrderContentModel.Content) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                return invoke$com$squareup$cash$investing$components$custom$order$CustomOrderHeaderViewKt$$ExternalSyntheticLambda0(obj, obj2);
            case 23:
                GraphState graphState = (GraphState) obj3;
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                pointerInputChange.getClass();
                pointerInputChange.consume();
                ((DragWidgetState) ((PriceWidgetState) obj4).dragWidgetState$delegate.getValue()).expand$delegate.setValue(Boolean.TRUE);
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = graphState.priceWidgetOffsetY$delegate;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = graphState.graphHeight$delegate;
                float intBitsToFloat = Float.intBitsToFloat((int) (((Offset) obj2).packedValue & BodyPartID.bodyIdMax)) + parcelableSnapshotMutableFloatState.getFloatValue();
                if (RecyclerView.DECELERATION_RATE <= intBitsToFloat && intBitsToFloat <= parcelableSnapshotMutableIntState.getIntValue()) {
                    if (intBitsToFloat < 3.0f) {
                        intBitsToFloat = 0.0f;
                    } else if (parcelableSnapshotMutableIntState.getIntValue() - intBitsToFloat < 3.0f) {
                        intBitsToFloat = parcelableSnapshotMutableIntState.getIntValue();
                    }
                    long j5 = (long) intBitsToFloat;
                    CustomOrderGraphPriceModel customOrderGraphPriceModel = (CustomOrderGraphPriceModel) graphState.priceModel$delegate.getValue();
                    if (customOrderGraphPriceModel != null) {
                        int intValue16 = parcelableSnapshotMutableIntState.getIntValue();
                        List list = customOrderGraphPriceModel.ticks;
                        j3 = (long) (((customOrderGraphPriceModel.bottomPrice - r8) * (j5 / intValue16)) + customOrderGraphPriceModel.topPrice);
                        int binarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(list, new PriceValue(j3));
                        if (binarySearch$default < 0) {
                            int i15 = -binarySearch$default;
                            int i16 = i15 - 1;
                            if (i16 > list.size()) {
                                j3 = ((PriceValue) CollectionsKt.last(list)).value;
                            } else if (i16 == 0) {
                                j3 = ((PriceValue) CollectionsKt.first(list)).value;
                            } else {
                                int i17 = i15 - 2;
                                j3 = Intrinsics.compare(((PriceValue) list.get(i16)).value - j3, j3 - ((PriceValue) list.get(i17)).value) < 0 ? ((PriceValue) list.get(i16)).value : ((PriceValue) list.get(i17)).value;
                            }
                        }
                    } else {
                        j3 = 0;
                    }
                    graphState.onSelectPrice.invoke(new PriceValue(j3));
                    graphState.selectedPrice$delegate.setValue(new PriceValue(j3));
                    graphState.priceWidgetOffsetY$delegate.setFloatValue(intBitsToFloat);
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                CustomOrderKt.CustomOrderTimeRange((HistoricalRange) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                DividendReinvestmentLearnMoreSheetViewModel dividendReinvestmentLearnMoreSheetViewModel = (DividendReinvestmentLearnMoreSheetViewModel) obj4;
                Function1 function110 = (Function1) obj3;
                Composer composer14 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                int i18 = DividendReinvestmentLearnMoreSheetView.$r8$clinit;
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    MarkdownExtensionKt.DividendReinvestmentLearnMore(dividendReinvestmentLearnMoreSheetViewModel, function110, NestedScrollModifierKt.nestedScroll(companion, zzagn.rememberNestedScrollInteropConnection(gapComposer14), null), gapComposer14, 8);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                return invoke$com$squareup$cash$investing$components$drip$DividendReinvestmentLearnMoreSheetViewKt$$ExternalSyntheticLambda3(obj, obj2);
            case 27:
                return invoke$com$squareup$cash$investing$components$drip$DividendReinvestmentSettingViewKt$$ExternalSyntheticLambda13(obj, obj2);
            case 28:
                return invoke$com$squareup$cash$investing$components$drip$DividendReinvestmentWelcomeView$$ExternalSyntheticLambda1(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                ThreadPoolDispatcherKt.DividendReinvestmentWelcomeSection((Modifier) obj4, (DividendReinvestmentWelcomeViewModel.Section) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SkipPaymentView$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ SkipPaymentView$$ExternalSyntheticLambda1(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ SkipPaymentView$$ExternalSyntheticLambda1(Function1 function1, InvestingCategoryDetailViewModel investingCategoryDetailViewModel) {
        this.$r8$classId = 18;
        this.f$1 = function1;
        this.f$0 = investingCategoryDetailViewModel;
    }
}
