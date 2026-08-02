package com.squareup.cash.money.views;

import _COROUTINE.ArtificialStackFrames;
import android.content.Context;
import androidx.appcompat.app.LocaleOverlayHelper;
import androidx.biometric.AuthenticatorUtils;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.dynamite.zzb;
import com.mikepenz.markdown.model.MarkdownAnimationsKt;
import com.nimbusds.jose.util.X509CertChainUtils;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.stock.StockSelectToggleStockSelection;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.api.model.EntitySelectionBlocker;
import com.squareup.cash.investing.components.market.hours.InvestingPendingTradesTileView;
import com.squareup.cash.investing.components.market.hours.InvestingPlaceholderGraphView;
import com.squareup.cash.investing.components.metrics.FinancialBarGraphKt$$ExternalSyntheticLambda8;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.ordertype.autoinvest.AutoInvestPurchaseKt;
import com.squareup.cash.investing.components.settings.InvestingSettingsView;
import com.squareup.cash.investing.components.stockmetric.ComposableStockMetricTypePickerSheet;
import com.squareup.cash.investing.components.teengraduation.StocksTransferEtaSheetView;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.StockMetricTypePickerViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryTileContentModel;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPendingTradesTileWidgetViewModel;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPlaceholderGraphViewModel;
import com.squareup.cash.investing.viewmodels.metrics.InvestingEarningsViewModel;
import com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Content;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringFrequencyPickerViewModel;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringPurchaseReceiptViewModel;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewModel;
import com.squareup.cash.investing.viewmodels.settings.InvestingSettingsViewModel;
import com.squareup.cash.investing.viewmodels.teengraduation.StocksTransferEtaViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleViewModel;
import com.squareup.cash.invitations.InviteContactsReferralRulesViewModel;
import com.squareup.cash.invitations.InviteErrorDialogKt;
import com.squareup.cash.invitations.InviteErrorDialogKt$$ExternalSyntheticLambda0;
import com.squareup.cash.limits.viewmodels.LimitViewModel;
import com.squareup.cash.limits.viewmodels.LimitsMessageViewModel;
import com.squareup.cash.limits.viewmodels.LimitsSectionType;
import com.squareup.cash.limits.viewmodels.LimitsViewModel;
import com.squareup.cash.limits.views.arcade.GroupedLimitsSectionDetailScreen;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantHeaderViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantInfoFeedbackViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantProfileViewModel;
import com.squareup.cash.merchant.views.MerchantProfileViewKt;
import com.squareup.cash.merchant.views.components.ActionNoticeKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.amount.AmountDisplayKt$AmountDisplay$1$1;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda11;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.rx3.RxAwaitKt;
import net.idrnd.misnap.iad.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabSectionUIKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ MoneyTabSectionUIKt$$ExternalSyntheticLambda6(InvestingRecurringFrequencyPickerViewModel investingRecurringFrequencyPickerViewModel, Function1 function1, MutableState mutableState) {
        this.$r8$classId = 5;
        this.f$0 = investingRecurringFrequencyPickerViewModel;
        this.f$1 = function1;
        this.f$2 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        NavigationType navigationType;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i2 = 2;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                HypeWelcomeUIKt.HeaderText((Modifier) obj5, (String) obj4, (PaddingValues) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int i3 = InvestingPendingTradesTileView.$r8$clinit;
                ((InvestingPendingTradesTileView) obj5).Content((InvestingPendingTradesTileWidgetViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                int i4 = InvestingPlaceholderGraphView.$r8$clinit;
                ((InvestingPlaceholderGraphView) obj4).PlaceholderHeaderNew((Modifier) obj5, (InvestingPlaceholderGraphViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(513));
                return Unit.INSTANCE;
            case 3:
                Modifier modifier = (Modifier) obj5;
                InvestingFinancialViewModel$Content investingFinancialViewModel$Content = (InvestingFinancialViewModel$Content) obj4;
                Function1 function1 = (Function1) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(Strings.getColors(gapComposer).semantic.background.standard);
                    int m694toArgb8_81llA2 = ColorKt.m694toArgb8_81llA(Strings.getColors(gapComposer).semantic.background.prominent);
                    long j = Strings.getColors(gapComposer).semantic.icon.standard;
                    int i5 = (int) (((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)).getResources().getDisplayMetrics().density * 160.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(1274243541, new FinancialBarGraphKt$$ExternalSyntheticLambda8(i5, investingFinancialViewModel$Content, j, m694toArgb8_81llA, m694toArgb8_81llA2), gapComposer), gapComposer, 6);
                    OnUndeliveredElementKt.InvestingGraphDetails(0, gapComposer, null, investingFinancialViewModel$Content.graphDetails);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    String str = investingFinancialViewModel$Content.profitLabel;
                    String str2 = investingFinancialViewModel$Content.revenueLabel;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new InvestingNewsKt$$ExternalSyntheticLambda0(28, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    OnUndeliveredElementKt.InvestingGraphLegend(0, gapComposer, null, str, str2, (Function0) rememberedValue);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                RxAwaitKt.InvestingEarningsTile((InvestingEarningsViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                InvestingRecurringFrequencyPickerViewModel investingRecurringFrequencyPickerViewModel = (InvestingRecurringFrequencyPickerViewModel) obj5;
                Function1 function12 = (Function1) obj4;
                MutableState mutableState = (MutableState) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(companion, colors.semantic.background.f1047app, ColorKt.RectangleShape, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Start, gapComposer2, 6);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    String stringResource = Room.stringResource(gapComposer2, R.string.investing_components_auto_invest_picker_title);
                    int ordinal = ((InvestingRecurringFrequencyPickerViewModel.Content) investingRecurringFrequencyPickerViewModel).navigationType.ordinal();
                    if (ordinal == 0) {
                        navigationType = NavigationType.CLOSE;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        navigationType = NavigationType.BACK;
                    }
                    NavigationType navigationType2 = navigationType;
                    boolean changed2 = gapComposer2.changed(function12);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new InviteErrorDialogKt$$ExternalSyntheticLambda0(1, function12);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    DBUtil.TitleBarSub(stringResource, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer2, 0, 108);
                    Modifier m2 = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxSize(companion, 1.0f), true);
                    boolean changedInstance = gapComposer2.changedInstance(investingRecurringFrequencyPickerViewModel);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new GLSceneScope$$ExternalSyntheticLambda10(26, investingRecurringFrequencyPickerViewModel, mutableState);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    LazyDslKt.LazyColumn(m2, null, null, null, null, null, false, null, (Function1) rememberedValue3, gapComposer2, 0, 510);
                    DimensionKt.ButtonCtaGroup(null, false, null, Expect_jvmKt.rememberComposableLambda(1213629167, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(investingRecurringFrequencyPickerViewModel, i2), gapComposer2), Expect_jvmKt.rememberComposableLambda(798677424, new ShiftListViewKt$$ExternalSyntheticLambda11(function12, mutableState, 4), gapComposer2), gapComposer2, 27648, 7);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                AutoInvestPurchaseKt.AutoInvestPurchase((InvestingRecurringPurchaseReceiptViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                MarkdownAnimationsKt.InvestingCategoryCarouselCard((InvestingCategoryTileContentModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(9));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ((P2PListView) obj5).Content((InvestingSearchViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                int i6 = InvestingSettingsView.$r8$clinit;
                ((InvestingSettingsView) obj5).Content((InvestingSettingsViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                a.InvestingAnalystOptions((X509CertChainUtils) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                int i7 = ComposableStockMetricTypePickerSheet.$r8$clinit;
                ((ComposableStockMetricTypePickerSheet) obj5).OptionItem((StockMetricTypePickerViewModel.Option) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(513));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                int i8 = StocksTransferEtaSheetView.$r8$clinit;
                ((StocksTransferEtaSheetView) obj5).Content((StocksTransferEtaViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) obj5;
                CoroutineScope coroutineScope = (CoroutineScope) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                Pair pair = (Pair) obj2;
                ((InvestingScreens.SelectStockQuestion) obj).getClass();
                if (pair != null) {
                    EntitySelectionBlocker entitySelectionBlocker = (EntitySelectionBlocker) tapToPayPresenter.ttpSessionManager;
                    if (entitySelectionBlocker instanceof EntitySelectionBlocker.MultiSelectData) {
                        Set set = (Set) mutableState2.getValue();
                        InvestmentEntityToken investmentEntityToken = (InvestmentEntityToken) pair.first;
                        String str3 = (String) pair.second;
                        investmentEntityToken.getClass();
                        str3.getClass();
                        String str4 = investmentEntityToken.value;
                        LinkedHashSet mutableSet = CollectionsKt.toMutableSet(set);
                        if (mutableSet.contains(str4)) {
                            mutableSet.remove(str4);
                        } else {
                            mutableSet.add(str4);
                            r10 = true;
                        }
                        ((Analytics) tapToPayPresenter.keyProvider).track(new StockSelectToggleStockSelection(Boolean.valueOf(r10), str3), null);
                        mutableState2.setValue(mutableSet);
                    } else {
                        Continuation continuation = null;
                        if (!(entitySelectionBlocker instanceof EntitySelectionBlocker.SingleSelectData)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        JobKt.launch$default(coroutineScope, null, null, new CheckStatusPresenter.AnonymousClass1(tapToPayPresenter, pair, continuation, 27), 3);
                    }
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineScope coroutineScope2 = (CoroutineScope) obj5;
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj4;
                MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) obj3;
                Map map = (Map) obj2;
                ((InvestingScreens.UpdateCategoryFilterQuestion) obj).getClass();
                if (map != null) {
                    JobKt.launch$default(coroutineScope2, null, null, new AmountDisplayKt$AmountDisplay$1$1(disclosurePresenter, map, mutableSharedFlow, null), 3);
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ArtificialStackFrames.InvestingCryptoNewsArticleOutline((InvestingCryptoNewsArticleViewModel) obj4, (Function0) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                InviteErrorDialogKt.InviteContactsReferralRules((Modifier) obj5, (InviteContactsReferralRulesViewModel) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                int i9 = GroupedLimitsSectionDetailScreen.$r8$clinit;
                ((GroupedLimitsSectionDetailScreen) obj5).Content((LimitViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                LocaleOverlayHelper.LimitsSection((LimitViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                AuthenticatorUtils.LimitsInlineMessage((LimitsMessageViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ((P2PListView) obj5).Content((LimitsViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                zzb.DynamicGroupingLimitsListItem((String) obj4, (LimitsSectionType) obj5, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                Function2 function2 = (Function2) obj5;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new CashMapViewKt$$ExternalSyntheticLambda0(7);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue4), 24.0f, 24.0f, 24.0f, 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer3, 48);
                    int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, m301paddingqDBjuR0);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    gapComposer3.startReplaceGroup(447178397);
                    gapComposer3.end(false);
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    ProvidedValue defaultProvidedValue$runtime = dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).labelMedium);
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = ArcadeThemeKt.LocalTextAlign;
                    Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, dynamicProvidableCompositionLocal2.defaultProvidedValue$runtime(new TextAlign(3))}, Expect_jvmKt.rememberComposableLambda(-390223442, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, 16), gapComposer3), gapComposer3, 56);
                    if (function2 == null) {
                        gapComposer3.startReplaceGroup(447887863);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(447887864);
                        ProvidedValue defaultProvidedValue$runtime2 = dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).bodySmall);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalTextColor;
                        Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime2, re$$ExternalSyntheticOutline0.m(colors2.semantic.text.subtle, staticProvidableCompositionLocal2), dynamicProvidableCompositionLocal2.defaultProvidedValue$runtime(new TextAlign(3))}, Expect_jvmKt.rememberComposableLambda(2068202507, new ToastKt$$ExternalSyntheticLambda11(19, function2), gapComposer3), gapComposer3, 56);
                        gapComposer3.end(false);
                    }
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 8.0f, gapComposer3);
                    coil3.size.SizeKt.ButtonCompact(null, null, ButtonProminence.SUBTLE, false, false, null, Expect_jvmKt.rememberComposableLambda(-143415834, new OverlayKt$$ExternalSyntheticLambda0(composableLambdaImpl2, 17), gapComposer3), gapComposer3, 1573254, 58);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                RealImageLoader realImageLoader = (RealImageLoader) obj5;
                MerchantBlockingViewModel merchantBlockingViewModel = (MerchantBlockingViewModel) obj4;
                Function1 function13 = (Function1) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(311210243, new HypeWelcomeUIKt$$ExternalSyntheticLambda0(20, (Object) merchantBlockingViewModel, (Object) function13), gapComposer4), gapComposer4, 56);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.MerchantBlocking((MerchantBlockingViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.MerchantBlockingSection((MerchantBlockingViewModel.MerchantBlockingSectionViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.MerchantInfoFeedbackLoaded((MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel) obj4, (Modifier) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                MerchantHeaderViewModel merchantHeaderViewModel = (MerchantHeaderViewModel) obj5;
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj4;
                Function0 function0 = (Function0) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    StackedAvatarViewModel.Single single = merchantHeaderViewModel.avatarViewModel;
                    gapComposer5.startReplaceGroup(-2136951181);
                    TextViewKt.Avatar(AvatarSize.Size64, AvatarsKt.toAvatarEntry(single.avatar, null, null, gapComposer5, 8, 3), ImageKt.m182clickableO2vRcR0$default(Modifier.Companion.$$INSTANCE, mutableInteractionSourceImpl, RippleKt.m3400rippleYJYuY3k(0L, false, 48.0f, null, gapComposer5, 432, 9), merchantHeaderViewModel.isAvatarClickable, null, null, function0, 24), false, gapComposer5, 6, 24);
                    gapComposer5.end(false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.ProfilePhotoOverlay((Modifier) obj5, (MerchantProfileViewModel.ProfilePhoto) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ActionNoticeKt.SquareLoyaltyDetailsPlaceholder((Modifier) obj5, (LoyaltyPromotionDetailsPlaceholder) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MoneyTabSectionUIKt$$ExternalSyntheticLambda6(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ MoneyTabSectionUIKt$$ExternalSyntheticLambda6(int i, int i2, Modifier modifier, Object obj, Function function) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = function;
        this.f$0 = modifier;
    }

    public /* synthetic */ MoneyTabSectionUIKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ MoneyTabSectionUIKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$0 = obj2;
        this.f$2 = obj3;
    }
}
