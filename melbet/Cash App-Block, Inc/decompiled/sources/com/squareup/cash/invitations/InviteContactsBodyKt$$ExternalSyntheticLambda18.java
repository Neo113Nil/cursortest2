package com.squareup.cash.invitations;

import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.internal.LocalCombinedViewsKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import com.google.android.renderscript.ToolkitKt;
import com.mikepenz.markdown.annotator.AnnotatedStringKtxKt;
import com.mikepenz.markdown.compose.elements.MarkdownHeaderKt;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.genericelements.components.components.arcade.ArcadeUtilKt;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionBlockerViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionViewModel;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.instruments.views.InstrumentAvatarUtilsKt;
import com.squareup.cash.instruments.views.InstrumentCellKt;
import com.squareup.cash.instruments.views.SelectPaymentInstrumentViewKt;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.investing.components.categories.InvestingCategoryDetailKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderKt;
import com.squareup.cash.investing.components.holding.InvestingEtfHoldingDetailsKt;
import com.squareup.cash.investing.components.market.hours.InvestingPlaceholderGraphView;
import com.squareup.cash.investing.components.ordertype.autoinvest.AutoInvestPurchaseKt;
import com.squareup.cash.investing.components.teengraduation.StocksTransferEtaFullScreenView;
import com.squareup.cash.investing.viewmodels.PerformanceViewModel;
import com.squareup.cash.investing.viewmodels.SectionMoreInfoViewModel;
import com.squareup.cash.investing.viewmodels.activity.InvestingActivityHistoryViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryDetailViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingDetailsCategorySectionContentModel;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingDetailsViewModel;
import com.squareup.cash.investing.viewmodels.keystats.InvestingKeyStatsDetailsViewModel;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPlaceholderGraphViewModel;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringFrequencyPickerViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantHeaderViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantInfoFeedbackViewModel;
import com.squareup.cash.merchant.views.MerchantProfileViewKt;
import com.squareup.cash.merchant.views.components.ActionNoticeKt;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda21;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionSheetPlaceholder;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class InviteContactsBodyKt$$ExternalSyntheticLambda18 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$4;

    public /* synthetic */ InviteContactsBodyKt$$ExternalSyntheticLambda18(RealImageLoader realImageLoader, InvestingActivityHistoryViewModel investingActivityHistoryViewModel, Function1 function1, int i) {
        this.$r8$classId = 9;
        this.f$0 = realImageLoader;
        this.f$1 = investingActivityHistoryViewModel;
        this.f$2 = function1;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                InviteErrorDialogKt.PromotionUpsell((Modifier) obj5, (InviteContactsViewModel.PromotionUpsellViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1), this.f$4);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ArcadeUtilKt.SectionHeaderWidget((Modifier) obj5, (GenericComponentViewModel.SectionHeaderViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ToolkitKt.SingleThreadMoleculeEffect((String) obj5, (Function1) obj3, (ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                InstrumentCellKt.SavingsAvatars((Modifier) obj5, (ArrayList) obj4, (AvatarSize) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                InstrumentAvatarUtilsKt.InstrumentSelectionBlockerView((InstrumentSelectionBlockerViewModel) obj5, (Function1) obj3, (RealImageLoader) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                InstrumentAvatarUtilsKt.InstrumentSelectionView((InstrumentSelectionViewModel) obj5, (Function1) obj3, (RealImageLoader) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                SelectPaymentInstrumentViewKt.SelectPaymentInstrument((SelectPaymentInstrumentViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ArcadeBordersKt.InvestingFeaturedIn((RealImageLoader) obj5, (InvestingDetailsCategorySectionContentModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ArcadeBordersKt.InvestingPerformance((PerformanceViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                AnnotatedStringKtxKt.InvestingActivityHistory((RealImageLoader) obj5, (InvestingActivityHistoryViewModel) obj4, (Function1) obj3, Modifier.Companion.$$INSTANCE, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).intValue();
                InvestingCategoryDetailKt.InvestingCategoryDetail((InvestingCategoryDetailViewModel) obj5, (Function1) obj3, (RealImageLoader) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                InvestingCategoryDetailKt.InvestingCategoryFilter((InvestingCategoryFilterViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                CustomOrderKt.StepButton(Updater.updateChangedFlags(i2 | 1), (Composer) obj, (Icons) obj5, (String) obj4, (Function0) obj3);
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                InvestingEtfHoldingDetailsKt.InvestmentEtfHoldingDetails((RealImageLoader) obj5, (InvestingEtfHoldingDetailsViewModel) obj4, (Function1) obj3, Modifier.Companion.$$INSTANCE, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                MarkdownHeaderKt.InvestingKeyStatsDetails((InvestingKeyStatsDetailsViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                int i3 = InvestingPlaceholderGraphView.$r8$clinit;
                ((InvestingPlaceholderGraphView) obj5).GraphTimeRangeButtons((InvestingPlaceholderGraphViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                AutoInvestPurchaseKt.AutoInvestFrequencyPicker((InvestingRecurringFrequencyPickerViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                b.MoreInfoSheet((SectionMoreInfoViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ((StocksTransferEtaFullScreenView) obj4).Form$1((Modifier) obj5, (FormViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                OnBackPressedDispatcherKt.Carousel((InvestingCryptoNewsViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                InviteErrorDialogKt.InviteContactsReferralRulesSheet((RealImageLoader) obj5, (InviteContactsReferralRulesViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.MerchantBlockingList((MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.MerchantBlockingView((RealImageLoader) obj5, (MerchantBlockingViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.MerchantInfoRow((MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow) obj4, (Modifier) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.MerchantInfoFeedback((RealImageLoader) obj5, (MerchantInfoFeedbackViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.MerchantProfileHeaderArcade((Modifier) obj5, (MerchantHeaderViewModel) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                ActionNoticeKt.LoyaltyPromotion((Modifier) obj5, (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                ActionNoticeKt.SquareLoyaltySheetPlaceholder((Modifier) obj5, (LoyaltyPromotionSheetPlaceholder) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                SharedUIKt.PromotedAppletTile((PromotedAppletTileViewModel.Loaded) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            default:
                Function0 function0 = (Function0) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Function0 withHaptics = PlatformKt.withHaptics(function0, null, gapComposer, 0, 1);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, withHaptics, 15);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(m183clickableoSLSa3U$default, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 11);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer.startReplaceGroup(1470728842);
                    Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    float mo236toPx0680j_4 = density.mo236toPx0680j_4(8.0f);
                    gapComposer.end(false);
                    int i4 = (int) mo236toPx0680j_4;
                    boolean changed = gapComposer.changed(i4);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda21(i4, 11);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier layout = ValueInsets.layout(companion, (Function3) rememberedValue);
                    int i5 = 8;
                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-1789651181, new LocalCombinedViewsKt$$ExternalSyntheticLambda3(i2, i5), gapComposer), Expect_jvmKt.rememberComposableLambda(-1711530092, new PoolCreateViewKt$$ExternalSyntheticLambda4(9, layout, str), gapComposer), null, null, false, true, Expect_jvmKt.rememberComposableLambda(-1242803558, new PoolCreateViewKt$$ExternalSyntheticLambda4(i5, layout, str2), gapComposer), null, new CellDefaultAccessory.ButtonCompact(null, null, false, SharedUIKt.lambda$1552504549, 15), 0L, gapComposer, 14155830, 3388);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ InviteContactsBodyKt$$ExternalSyntheticLambda18(Modifier modifier, InviteContactsViewModel.PromotionUpsellViewModel promotionUpsellViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = 0;
        this.f$0 = modifier;
        this.f$1 = promotionUpsellViewModel;
        this.f$2 = function1;
        this.f$4 = i2;
    }

    public /* synthetic */ InviteContactsBodyKt$$ExternalSyntheticLambda18(Modifier modifier, Object obj, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = function1;
        this.f$0 = modifier;
        this.f$4 = i;
    }

    public /* synthetic */ InviteContactsBodyKt$$ExternalSyntheticLambda18(int i, int i2, Modifier modifier, Object obj, Object obj2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$0 = modifier;
        this.f$2 = obj2;
        this.f$4 = i;
    }

    public /* synthetic */ InviteContactsBodyKt$$ExternalSyntheticLambda18(RealImageLoader realImageLoader, InvestingEtfHoldingDetailsViewModel investingEtfHoldingDetailsViewModel, Function1 function1, int i) {
        this.$r8$classId = 13;
        this.f$0 = realImageLoader;
        this.f$1 = investingEtfHoldingDetailsViewModel;
        this.f$2 = function1;
        this.f$4 = i;
    }

    public /* synthetic */ InviteContactsBodyKt$$ExternalSyntheticLambda18(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = i;
    }

    public /* synthetic */ InviteContactsBodyKt$$ExternalSyntheticLambda18(Object obj, Function1 function1, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = obj2;
        this.f$4 = i;
    }

    public /* synthetic */ InviteContactsBodyKt$$ExternalSyntheticLambda18(Function0 function0, int i, String str, String str2) {
        this.$r8$classId = 29;
        this.f$0 = function0;
        this.f$4 = i;
        this.f$1 = str;
        this.f$2 = str2;
    }
}
