package com.squareup.cash.money.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ChromeSystemIconColor;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.android.okhttp.TraceContext;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.advertising.views.FullscreenAdViewKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.viewmodels.CashTagSymbol;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.investing.components.holding.InvestingEtfHoldingDetailsKt$$ExternalSyntheticLambda6;
import com.squareup.cash.investing.components.holding.InvestingEtfHoldingDetailsKt$$ExternalSyntheticLambda7;
import com.squareup.cash.investing.components.market.hours.InvestingPendingTradesTileView;
import com.squareup.cash.investing.components.market.hours.InvestingPlaceholderGraphView;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.news.NewsArticleAdapter$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.components.ordertype.autoinvest.AutoInvestPurchaseKt;
import com.squareup.cash.investing.components.teengraduation.StocksTransferEtaSheetView;
import com.squareup.cash.investing.viewmodels.InvestingAboutContentModel;
import com.squareup.cash.investing.viewmodels.holdings.Holding;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingDetailsViewModel;
import com.squareup.cash.investing.viewmodels.holdings.InvestmentType;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPendingTradesTileWidgetViewModel;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPlaceholderGraphViewModel;
import com.squareup.cash.investing.viewmodels.ordertype.InvestingOrderTypeSelectionViewModel;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.DependentAutoInvestInfoViewModel;
import com.squareup.cash.investing.viewmodels.settings.InvestingSettingsViewModel;
import com.squareup.cash.investing.viewmodels.teengraduation.StocksTransferEtaViewModel;
import com.squareup.cash.investingcrypto.components.ordertype.custom.order.CustomOrderPeriodSelectorKt$$ExternalSyntheticLambda4;
import com.squareup.cash.investingcrypto.viewmodels.common.orders.PeriodSelectionViewModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda5;
import com.squareup.cash.invitations.InviteContactsHeaderViewModel;
import com.squareup.cash.invitations.InviteContactsReferralRulesViewModel;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.invitations.InviteContactsViewModel$State$PromptForPermissions;
import com.squareup.cash.invitations.InviteContactsViewModel$State$ShowContacts;
import com.squareup.cash.invitations.InviteErrorDialogKt;
import com.squareup.cash.invitations.InviteErrorDialogKt$$ExternalSyntheticLambda0;
import com.squareup.cash.limits.viewmodels.LimitItem;
import com.squareup.cash.limits.viewmodels.LimitItemViewModel;
import com.squareup.cash.limits.viewmodels.LimitViewModel;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.marketing.components.CardUpsellIllustration;
import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewModel;
import com.squareup.cash.merchant.views.MerchantProfileViewKt;
import com.squareup.cash.money.booklet.CollapsibleDetailsSection;
import com.squareup.cash.money.booklet.DisclosureSection;
import com.squareup.cash.money.booklet.DisclosureSectionKt;
import com.squareup.cash.money.booklet.MoneyTabBookletKt;
import com.squareup.cash.money.booklet.MoneyTabBookletSection;
import com.squareup.cash.money.core.ids.SectionId;
import com.squareup.cash.money.disclosure.DisclosureItemModel;
import com.squareup.cash.money.viewmodels.HypeWelcomeModel;
import com.squareup.cash.money.viewmodels.api.Section;
import com.squareup.cash.moneybot.components.api.ClientRenderablePlugin;
import com.squareup.cash.moneybot.genie.DatePickerViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.moneybot.genie.GenieForEachViewKt;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingStockDetailsHeaderViewModel;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.guava.ListenableFutureKt;
import net.idrnd.face.iad.capture.internal.s;
import net.idrnd.misnap.iad.Result;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.overdraft.OverdraftStatus;
import xyz.block.genie.state.StateBindingsKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class HypeWelcomeUIKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ HypeWelcomeUIKt$$ExternalSyntheticLambda0(Function1 function1, LimitViewModel limitViewModel) {
        this.$r8$classId = 14;
        this.f$1 = function1;
        this.f$0 = limitViewModel;
    }

    private final Object invoke$com$squareup$cash$limits$views$arcade$GroupedLimitsSectionDetailScreenKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        Function1 function1 = (Function1) this.f$1;
        LimitViewModel limitViewModel = (LimitViewModel) this.f$0;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
        Applier applier = gapComposer.applier;
        if (shouldExecute) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(companion, j, rectangleShapeKt$RectangleShape$1, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.BACK;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InviteErrorDialogKt$$ExternalSyntheticLambda0(29, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(companion, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            String str = limitViewModel.title;
            if (str == null) {
                str = "";
            }
            Countries.PageHeader(str, (Modifier) null, (Function2) null, limitViewModel.description, gapComposer, 0, 6);
            TraceContext.ArcadeLimitsSections(limitViewModel, null, gapComposer, 0);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$marketing$components$CardUpsellKt$$ExternalSyntheticLambda10(Object obj, Object obj2) {
        float f;
        CardUpsellIllustration cardUpsellIllustration = (CardUpsellIllustration) this.f$0;
        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            if (cardUpsellIllustration != null) {
                gapComposer.startReplaceGroup(-765762071);
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                gapComposer.end(false);
                f = 4.0f;
            } else {
                gapComposer.startReplaceGroup(-765761627);
                gapComposer.end(false);
                f = RecyclerView.DECELERATION_RATE;
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, 10);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$marketing$components$CardUpsellKt$$ExternalSyntheticLambda11(Object obj, Object obj2) {
        Dp dp;
        CardUpsellIllustration cardUpsellIllustration = (CardUpsellIllustration) this.f$0;
        Function2 function2 = (Function2) this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            if (cardUpsellIllustration == null) {
                gapComposer.startReplaceGroup(1390840816);
                gapComposer.end(false);
                dp = null;
            } else {
                gapComposer.startReplaceGroup(1390840817);
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                gapComposer.end(false);
                dp = new Dp(4.0f);
            }
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(fillMaxWidth, 16.0f, 4.0f, dp != null ? dp.value : RecyclerView.DECELERATION_RATE, 8.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR0);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Recorder$$ExternalSyntheticOutline1.m(0, function2, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$money$booklet$DisclosureSectionKt$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        DisclosureSectionKt.DisclosureSection((DisclosureSection) this.f$0, (Function1) this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$money$booklet$MoneyTabBookletKt$$ExternalSyntheticLambda7(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        MoneyTabBookletKt.SpacerBetweenSections((MoneyTabBookletSection) this.f$0, (MoneyTabBookletSection) this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$money$disclosure$DisclosureItemKt$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        OverdraftStatus.State_.DisclosureUI((DisclosureItemModel) this.f$0, (Function2) this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$money$views$MoneyTabSectionUIKt$$ExternalSyntheticLambda3(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        HypeWelcomeUIKt.UI((Section.Header) this.f$0, (SectionId) this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$moneybot$components$api$ClientRenderablePlugin$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ((ClientRenderablePlugin) this.f$0).RenderContent((UiCallbackModel) this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$moneybot$genie$ComposePlatformViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        StateBindingsKt.ComposePlatformView((ComposePlatform) this.f$0, (Modifier) this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$moneybot$genie$DatePickerViewKt$$ExternalSyntheticLambda8(Object obj, Object obj2) {
        MutableState mutableState = (MutableState) this.f$0;
        TextStyle textStyle = (TextStyle) this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        int i = 2;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda2(11, mutableState);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MenuKt.TextButton((Function0) rememberedValue, null, false, null, null, null, Expect_jvmKt.rememberComposableLambda(-91830939, new DatePickerViewKt$$ExternalSyntheticLambda11(textStyle, i), gapComposer), gapComposer, 805306374, 510);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:298:0x0a42, code lost:
    
        if (r5 == r3) goto L308;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        NeverEqualPolicy neverEqualPolicy;
        String str;
        int i;
        int i2;
        int i3;
        Modifier wrapContentHeight;
        Modifier wrapContentHeight2;
        String str2;
        int i4 = this.$r8$classId;
        int i5 = 27;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i4) {
            case 0:
                HypeWelcomeModel hypeWelcomeModel = (HypeWelcomeModel) obj4;
                Function1 function1 = (Function1) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    ChromeConfigKt.ChromeConfig(ChromeSystemIconColor.ALWAYS_LIGHT, (Boolean) null, gapComposer, 6, 14);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    if (1.0f <= 0.0d) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    String stringResource = Room.stringResource(gapComposer, R.string.hype_welcome_toolbar_title);
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (!changed) {
                        neverEqualPolicy = neverEqualPolicy2;
                        break;
                    } else {
                        neverEqualPolicy = neverEqualPolicy2;
                    }
                    rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda4(25, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                    DBUtil.TitleBarSub(stringResource, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 48, 108);
                    if (1.0f <= 0.0d) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    CashTagSymbol cashTagSymbol = hypeWelcomeModel.symbol;
                    HypeWelcomeModel.NotifyButtonState notifyButtonState = hypeWelcomeModel.notifyButtonState;
                    int ordinal = cashTagSymbol.ordinal();
                    if (ordinal == 0) {
                        str = "https://cash-f.squarecdn.com/static/wand-graphic-hype.mp4";
                    } else if (ordinal == 1) {
                        str = "https://cash-f.squarecdn.com/static/minicard-graphic-hype.mp4";
                    } else {
                        if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        str = "https://cash-f.squarecdn.com/static/heart-graphic-hype.mp4";
                    }
                    String str3 = str;
                    int ordinal2 = cashTagSymbol.ordinal();
                    if (ordinal2 == 0) {
                        i = R.drawable.hype_welcome_wand;
                    } else if (ordinal2 == 1) {
                        i = R.drawable.hype_welcome_minicard;
                    } else {
                        if (ordinal2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        i = R.drawable.hype_welcome_heart;
                    }
                    int i6 = i;
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier matchParentSize = boxScopeInstance.matchParentSize();
                    Strings.getSizes(gapComposer).getClass();
                    DefaultSizes.spacing.getClass();
                    HypeWelcomeUIKt.HypeWelcomeVideo(str3, i6, OffsetKt.aspectRatio(1.0f, SpacerKt.m300paddingVpY3zN4$default(matchParentSize, 16.0f, RecyclerView.DECELERATION_RATE, 2), false), gapComposer, 0, 0);
                    gapComposer.end(true);
                    Strings.getSizes(gapComposer).getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    Strings.getSizes(gapComposer).getClass();
                    Object obj5 = DefaultSizes.border.annotationsMap;
                    long j = Strings.getColors(gapComposer).semantic.border.prominent;
                    Strings.getSizes(gapComposer).getClass();
                    Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m300paddingVpY3zN4$default, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                    Strings.getSizes(gapComposer).getClass();
                    Strings.getSizes(gapComposer).getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m299paddingVpY3zN4(m178borderxT4_qwU, 8.0f, 4.0f), Strings.getTypography(gapComposer).labelXSmall, (TextLineBalancing) null, hypeWelcomeModel.dateLabel, (Map) null, (Function1) null, false);
                    Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 16.0f, gapComposer);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    Strings.getSizes(gapComposer).getClass();
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    int ordinal3 = cashTagSymbol.ordinal();
                    if (ordinal3 == 0) {
                        i2 = R.string.hype_welcome_header;
                    } else if (ordinal3 == 1) {
                        i2 = R.string.hype_welcome_header_card;
                    } else {
                        if (ordinal3 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        i2 = R.string.hype_welcome_header_heart;
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, m300paddingVpY3zN4$default2, Strings.getTypography(gapComposer).headlineSmall, (TextLineBalancing) null, Room.stringResource(gapComposer, i2), (Map) null, (Function1) null, false);
                    Strings.getSizes(gapComposer).getClass();
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
                    Strings.getSizes(gapComposer).getClass();
                    Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    boolean changed2 = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CashMapViewKt$$ExternalSyntheticLambda4(26, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.placeholder, (Composer) gapComposer, ImageKt.m183clickableoSLSa3U$default(m300paddingVpY3zN4$default3, false, null, null, (Function0) rememberedValue2, 15), Strings.getTypography(gapComposer).linkXSmall, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.hype_welcome_dismiss), (Map) null, (Function1) null, false);
                    Strings.getSizes(gapComposer).getClass();
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
                    gapComposer.end(true);
                    HypeWelcomeModel.NotifyButtonState notifyButtonState2 = HypeWelcomeModel.NotifyButtonState.Hidden;
                    if (notifyButtonState != notifyButtonState2) {
                        gapComposer.startReplaceGroup(-413243388);
                        Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                        Strings.getSizes(gapComposer).getClass();
                        Modifier m300paddingVpY3zN4$default4 = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth3, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                        Strings.getSizes(gapComposer).getClass();
                        Modifier m300paddingVpY3zN4$default5 = SpacerKt.m300paddingVpY3zN4$default(m300paddingVpY3zN4$default4, RecyclerView.DECELERATION_RATE, 16.0f, 1);
                        ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                        boolean z = notifyButtonState == HypeWelcomeModel.NotifyButtonState.Enabled;
                        boolean changed3 = gapComposer.changed(function1);
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (changed3 || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new CashMapViewKt$$ExternalSyntheticLambda4(27, function1);
                            gapComposer.updateRememberedValue(rememberedValue3);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, m300paddingVpY3zN4$default5, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(1470363171, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(hypeWelcomeModel, 0), gapComposer), gapComposer, 1573248, 40);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-412684737);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                    if (notifyButtonState == notifyButtonState2 || !hypeWelcomeModel.showToast) {
                        gapComposer.startReplaceGroup(1288744137);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1288411383);
                        Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(boxScopeInstance.align(companion, Alignment.Companion.BottomCenter));
                        Strings.getSizes(gapComposer).getClass();
                        ModalKt.m3381ToastBAHpl2s(SpacerKt.m298padding3ABfNKs(navigationBarsPadding, 16.0f), null, Room.stringResource(gapComposer, R.string.hype_welcome_notify_toast), HypeWelcomeUIKt.lambda$1960999335, null, null, null, gapComposer, 3072, 498);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                InvestingEtfHoldingDetailsViewModel investingEtfHoldingDetailsViewModel = (InvestingEtfHoldingDetailsViewModel) obj4;
                Function1 function12 = (Function1) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier navigationBarsPadding2 = SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode5 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer2, navigationBarsPadding2);
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
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    InvestingEtfHoldingDetailsViewModel.Content content = (InvestingEtfHoldingDetailsViewModel.Content) investingEtfHoldingDetailsViewModel;
                    String str4 = content.title;
                    InvestmentType investmentType = content.selectedType;
                    NavigationType navigationType2 = NavigationType.BACK;
                    boolean changed4 = gapComposer2.changed(function12);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy2) {
                        rememberedValue4 = new InvestingNewsKt$$ExternalSyntheticLambda0(24, function12);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    DBUtil.TitleBarSub(str4, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, gapComposer2, 48, 108);
                    if (content.showInvestmentTypeToggle) {
                        gapComposer2.startReplaceGroup(708581363);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                        int ordinal4 = investmentType.ordinal();
                        boolean changed5 = gapComposer2.changed(function12);
                        Object rememberedValue5 = gapComposer2.rememberedValue();
                        if (changed5 || rememberedValue5 == neverEqualPolicy2) {
                            rememberedValue5 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(12, function12);
                            gapComposer2.updateRememberedValue(rememberedValue5);
                        }
                        Function1 function13 = (Function1) rememberedValue5;
                        Object rememberedValue6 = gapComposer2.rememberedValue();
                        if (rememberedValue6 == neverEqualPolicy2) {
                            rememberedValue6 = new NewsArticleAdapter$$ExternalSyntheticLambda1(19);
                            gapComposer2.updateRememberedValue(rememberedValue6);
                        }
                        ModalKt.SegmentedControl(ordinal4, function13, null, (Function1) rememberedValue6, gapComposer2, 3072, 4);
                        i3 = 0;
                        gapComposer2.end(false);
                    } else {
                        i3 = 0;
                        gapComposer2.startReplaceGroup(709098381);
                        gapComposer2.end(false);
                    }
                    DBUtil.SpacerWithinSectionMedium(i3, 1, gapComposer2, null);
                    boolean z2 = investmentType == InvestmentType.STOCK ? 1 : i3;
                    EnterTransitionImpl fadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 3);
                    ExitTransitionImpl fadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 3);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1023498675, new InvestingEtfHoldingDetailsKt$$ExternalSyntheticLambda6(investingEtfHoldingDetailsViewModel, function12, i3), gapComposer2);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    AnimatedContentKt.AnimatedVisibility(columnScopeInstance, z2, null, fadeIn$default, fadeOut$default, null, rememberComposableLambda, gapComposer2, 1600518, 18);
                    AnimatedContentKt.AnimatedVisibility(columnScopeInstance, investmentType == InvestmentType.SECTOR, null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), null, Expect_jvmKt.rememberComposableLambda(-99149500, new InvestingEtfHoldingDetailsKt$$ExternalSyntheticLambda7(investingEtfHoldingDetailsViewModel, 0), gapComposer2), gapComposer2, 1600518, 18);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ListenableFutureKt.HoldingRow((Holding) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                InvestingPendingTradesTileWidgetViewModel investingPendingTradesTileWidgetViewModel = (InvestingPendingTradesTileWidgetViewModel) obj4;
                Function1 function14 = (Function1) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i7 = InvestingPendingTradesTileView.$r8$clinit;
                GapComposer gapComposer3 = (GapComposer) composer3;
                boolean shouldExecute2 = gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                Applier applier2 = gapComposer3.applier;
                if (shouldExecute2) {
                    RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
                    Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    long j2 = colors2.semantic.border.subtle;
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj6 = DefaultSizes.border.annotationsMap;
                    Modifier clip = ClipKt.clip(ImageKt.m178borderxT4_qwU(companion, 1.0f, j2, m340RoundedCornerShape0680j_4), m340RoundedCornerShape0680j_4);
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode6 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer3, clip);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf2 = Integer.valueOf(hashCode6);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf2, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier6, composeUiNode$Companion$SetModifier$18);
                    wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(wrapContentHeight, 24.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer3, 54);
                    int hashCode7 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer3, m298padding3ABfNKs);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope7, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode7, gapComposer3, composeUiNode$Companion$SetModifier$17, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    KeypadKt.m3651TextPdH14aY(1, 0, 0, 0, 196608, 0, 4048, MooncakeTheme.getColors(gapComposer3).label, (Composer) gapComposer3, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer3, materializeModifier7, composeUiNode$Companion$SetModifier$18, 1.0f, false), MooncakeTheme.getTypography(gapComposer3).header4, (TextLineBalancing) null, investingPendingTradesTileWidgetViewModel.title, (Map) null, (Function1) null, false);
                    String str5 = investingPendingTradesTileWidgetViewModel.buttonLabel;
                    boolean changed6 = gapComposer3.changed(function14);
                    Object rememberedValue7 = gapComposer3.rememberedValue();
                    if (changed6 || rememberedValue7 == neverEqualPolicy2) {
                        rememberedValue7 = new InvestingNewsKt$$ExternalSyntheticLambda0(27, function14);
                        gapComposer3.updateRememberedValue(rememberedValue7);
                    }
                    KeypadKt.m3640ButtonGFipHI0(str5, (Function0) rememberedValue7, null, null, MooncakePillButton.Size.SMALL, MooncakePillButton.Style.SECONDARY, null, false, 1, null, null, gapComposer3, 100884480, 0, 3788);
                    gapComposer3.end(true);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                InvestingPlaceholderGraphView investingPlaceholderGraphView = (InvestingPlaceholderGraphView) obj4;
                InvestingPlaceholderGraphViewModel investingPlaceholderGraphViewModel = (InvestingPlaceholderGraphViewModel) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i8 = InvestingPlaceholderGraphView.$r8$clinit;
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    wrapContentHeight2 = SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(wrapContentHeight2, 1.0f);
                    ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    investingPlaceholderGraphView.PlaceholderHeaderNew(SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth4, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), investingPlaceholderGraphViewModel, gapComposer4, 512);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                AutoInvestPurchaseKt.DependentAutoInvestInfoBottomSheet((DependentAutoInvestInfoViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                Function1 function15 = (Function1) obj3;
                InvestingOrderTypeSelectionViewModel investingOrderTypeSelectionViewModel = (InvestingOrderTypeSelectionViewModel) obj4;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean changed7 = gapComposer5.changed(function15);
                    Object rememberedValue8 = gapComposer5.rememberedValue();
                    if (changed7 || rememberedValue8 == neverEqualPolicy2) {
                        rememberedValue8 = new InviteErrorDialogKt$$ExternalSyntheticLambda0(4, function15);
                        gapComposer5.updateRememberedValue(rememberedValue8);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue8, gapComposer5, 0, 1);
                    Colors colors3 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                    int hashCode8 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope8 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier8 = PlatformKt.materializeModifier(gapComposer5, fillMaxSize3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope8, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode8), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier8, ComposeUiNode.Companion.SetModifier);
                    String str6 = investingOrderTypeSelectionViewModel.title;
                    NavigationType navigationType3 = NavigationType.CLOSE;
                    boolean changed8 = gapComposer5.changed(function15);
                    Object rememberedValue9 = gapComposer5.rememberedValue();
                    if (changed8 || rememberedValue9 == neverEqualPolicy2) {
                        rememberedValue9 = new InviteErrorDialogKt$$ExternalSyntheticLambda0(5, function15);
                        gapComposer5.updateRememberedValue(rememberedValue9);
                    }
                    DBUtil.TitleBarSub(str6, navigationType3, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue9, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1190041665, new MusicViewKt$$ExternalSyntheticLambda7(8, function15), gapComposer5), gapComposer5, 1572912, 44);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer5, null);
                    boolean changedInstance = gapComposer5.changedInstance(investingOrderTypeSelectionViewModel) | gapComposer5.changed(function15);
                    Object rememberedValue10 = gapComposer5.rememberedValue();
                    if (changedInstance || rememberedValue10 == neverEqualPolicy2) {
                        rememberedValue10 = new GLSceneScope$$ExternalSyntheticLambda10(i5, investingOrderTypeSelectionViewModel, function15);
                        gapComposer5.updateRememberedValue(rememberedValue10);
                    }
                    LazyDslKt.LazyColumn(null, null, null, null, null, null, false, null, (Function1) rememberedValue10, gapComposer5, 0, 511);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                s.EntryRow((InvestingSettingsViewModel.Entry) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                Result.InvestingAboutTile((Modifier) obj4, (InvestingAboutContentModel) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                InvestingStockDetailsHeaderViewModel investingStockDetailsHeaderViewModel = (InvestingStockDetailsHeaderViewModel) obj4;
                RealImageLoader realImageLoader = (RealImageLoader) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    gapComposer6.startReplaceGroup(1203162895);
                    ArcadeBordersKt.InvestingStockDetailsCollapsedHeader(investingStockDetailsHeaderViewModel, realImageLoader, SizeKt.m277height3ABfNKs(companion, 56.0f), gapComposer6, MLKEMEngine.KyberPolyBytes);
                    gapComposer6.end(false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                StocksTransferEtaViewModel stocksTransferEtaViewModel = (StocksTransferEtaViewModel) obj4;
                Function1 function16 = (Function1) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                int i9 = StocksTransferEtaSheetView.$r8$clinit;
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Modifier fillMaxWidth5 = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer7, 48);
                    int hashCode9 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope9 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier9 = PlatformKt.materializeModifier(gapComposer7, fillMaxWidth5);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy5, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope9, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode9), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier9, ComposeUiNode.Companion.SetModifier);
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 56.0f);
                    Painter painterResource = Countries.painterResource(R.drawable.receipt_status_pending, 0, gapComposer7);
                    long j3 = MooncakeTheme.getColors(gapComposer7).green;
                    ImageKt.Image(painterResource, null, m285size3ABfNKs, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j3, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j3), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer7, Painter.$stable | 432, 56);
                    KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 0, 0, 3824, MooncakeTheme.getColors(gapComposer7).label, (Composer) gapComposer7, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, 24.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), MooncakeTheme.getTypography(gapComposer7).header4, (TextLineBalancing) null, stocksTransferEtaViewModel.title, (Map) null, (Function1) null, false);
                    KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 0, 0, 3824, MooncakeTheme.getColors(gapComposer7).secondaryLabel, (Composer) gapComposer7, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, 8.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), MooncakeTheme.getTypography(gapComposer7).smallBody, (TextLineBalancing) null, stocksTransferEtaViewModel.description, (Map) null, (Function1) null, false);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    String str7 = stocksTransferEtaViewModel.doneButtonLabel;
                    MooncakePillButton.Style style = MooncakePillButton.Style.TERTIARY;
                    MooncakePillButton.Size size = MooncakePillButton.Size.LARGE;
                    boolean changed9 = gapComposer7.changed(function16);
                    Object rememberedValue11 = gapComposer7.rememberedValue();
                    if (changed9 || rememberedValue11 == neverEqualPolicy2) {
                        rememberedValue11 = new InviteErrorDialogKt$$ExternalSyntheticLambda0(18, function16);
                        gapComposer7.updateRememberedValue(rememberedValue11);
                    }
                    KeypadKt.m3640ButtonGFipHI0(str7, (Function0) rememberedValue11, m302paddingqDBjuR0$default, null, size, style, null, false, 0, null, null, gapComposer7, 221568, 0, 4040);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Function1 function17 = (Function1) obj3;
                PeriodSelectionViewModel periodSelectionViewModel = (PeriodSelectionViewModel) obj4;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    boolean changed10 = gapComposer8.changed(function17);
                    Object rememberedValue12 = gapComposer8.rememberedValue();
                    if (changed10 || rememberedValue12 == neverEqualPolicy2) {
                        rememberedValue12 = new InviteErrorDialogKt$$ExternalSyntheticLambda0(21, function17);
                        gapComposer8.updateRememberedValue(rememberedValue12);
                    }
                    SheetKt.Sheet((Function0) rememberedValue12, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1525660249, new CustomOrderPeriodSelectorKt$$ExternalSyntheticLambda4(periodSelectionViewModel, function17, r2 ? 1 : 0), gapComposer8), gapComposer8, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                InviteContactsReferralRulesViewModel inviteContactsReferralRulesViewModel = (InviteContactsReferralRulesViewModel) obj4;
                RealImageLoader realImageLoader2 = (RealImageLoader) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    InviteErrorDialogKt.InviteContactsReferralRules(ImageKt.verticalScroll$default(NestedScrollModifierKt.nestedScroll(companion, zzagn.rememberNestedScrollInteropConnection(gapComposer9), null), ImageKt.rememberScrollState(gapComposer9), false, 14), inviteContactsReferralRulesViewModel, realImageLoader2, gapComposer9, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Function1 function18 = (Function1) obj3;
                InviteContactsViewModel inviteContactsViewModel = (InviteContactsViewModel) obj4;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    boolean changed11 = gapComposer10.changed(function18);
                    Object rememberedValue13 = gapComposer10.rememberedValue();
                    if (changed11 || rememberedValue13 == neverEqualPolicy2) {
                        rememberedValue13 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(i5, function18);
                        gapComposer10.updateRememberedValue(rememberedValue13);
                    }
                    Function1 function19 = (Function1) rememberedValue13;
                    String str8 = inviteContactsViewModel.formattedText;
                    if (str8 == null) {
                        str8 = "";
                    }
                    boolean changed12 = gapComposer10.changed(function18);
                    Object rememberedValue14 = gapComposer10.rememberedValue();
                    if (changed12 || rememberedValue14 == neverEqualPolicy2) {
                        rememberedValue14 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(28, function18);
                        gapComposer10.updateRememberedValue(rememberedValue14);
                    }
                    Function1 function110 = (Function1) rememberedValue14;
                    String str9 = inviteContactsViewModel.searchPlaceholder;
                    InviteContactsHeaderViewModel inviteContactsHeaderViewModel = inviteContactsViewModel.headerViewModel;
                    InviteErrorDialogKt inviteErrorDialogKt = inviteContactsViewModel.state;
                    boolean z3 = inviteErrorDialogKt instanceof InviteContactsViewModel$State$ShowContacts;
                    String str10 = inviteContactsViewModel.inviteContactButtonText;
                    str2 = "";
                    ImmutableList immutableList = inviteContactsViewModel.recommended_contacts;
                    ImmutableList immutableList2 = inviteContactsViewModel.all_contacts;
                    boolean z4 = inviteErrorDialogKt instanceof InviteContactsViewModel$State$PromptForPermissions;
                    boolean changed13 = gapComposer10.changed(function18);
                    Object rememberedValue15 = gapComposer10.rememberedValue();
                    if (changed13 || rememberedValue15 == neverEqualPolicy2) {
                        rememberedValue15 = new InviteErrorDialogKt$$ExternalSyntheticLambda0(23, function18);
                        gapComposer10.updateRememberedValue(rememberedValue15);
                    }
                    Function0 function0 = (Function0) rememberedValue15;
                    String str11 = inviteContactsViewModel.contactRequestButtonText;
                    if (str11 == null) {
                        str11 = str2;
                    }
                    String str12 = inviteContactsViewModel.contactRequestText;
                    InviteErrorDialogKt.InviteContactsBody(layoutWeightElement2, function19, str8, function110, str9, inviteContactsHeaderViewModel, z3, str10, immutableList, immutableList2, z4, function0, str11, str12 != null ? str12 : "", inviteContactsViewModel.promotionUpsellViewModel, inviteContactsViewModel.isSearchFocused, function18, gapComposer10, 0, 0, 0);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                return invoke$com$squareup$cash$limits$views$arcade$GroupedLimitsSectionDetailScreenKt$$ExternalSyntheticLambda0(obj, obj2);
            case 15:
                ((Integer) obj2).getClass();
                TraceContext.ArcadeLimitsSections((LimitViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                TraceContext.StaticLimitsCategorySection((LimitItemViewModel.StaticLimit) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                TraceContext.LimitRow((LimitItem) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                return invoke$com$squareup$cash$marketing$components$CardUpsellKt$$ExternalSyntheticLambda10(obj, obj2);
            case 19:
                return invoke$com$squareup$cash$marketing$components$CardUpsellKt$$ExternalSyntheticLambda11(obj, obj2);
            case 20:
                MerchantBlockingViewModel merchantBlockingViewModel = (MerchantBlockingViewModel) obj4;
                Function1 function111 = (Function1) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Colors colors4 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    MerchantProfileViewKt.MerchantBlocking(merchantBlockingViewModel, function111, ImageKt.m177backgroundbw27NRU(companion, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), gapComposer11, 0);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                FullscreenAdViewKt.CollapsibleDetailsSection((CollapsibleDetailsSection) obj4, (Set) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                return invoke$com$squareup$cash$money$booklet$DisclosureSectionKt$$ExternalSyntheticLambda1(obj, obj2);
            case 23:
                return invoke$com$squareup$cash$money$booklet$MoneyTabBookletKt$$ExternalSyntheticLambda7(obj, obj2);
            case 24:
                return invoke$com$squareup$cash$money$disclosure$DisclosureItemKt$$ExternalSyntheticLambda1(obj, obj2);
            case 25:
                return invoke$com$squareup$cash$money$views$MoneyTabSectionUIKt$$ExternalSyntheticLambda3(obj, obj2);
            case 26:
                return invoke$com$squareup$cash$moneybot$components$api$ClientRenderablePlugin$$ExternalSyntheticLambda0(obj, obj2);
            case 27:
                return invoke$com$squareup$cash$moneybot$genie$ComposePlatformViewKt$$ExternalSyntheticLambda0(obj, obj2);
            case 28:
                return invoke$com$squareup$cash$moneybot$genie$DatePickerViewKt$$ExternalSyntheticLambda8(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                GenieForEachViewKt.GenieForEachView((ForEach) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ HypeWelcomeUIKt$$ExternalSyntheticLambda0(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = obj;
    }

    public /* synthetic */ HypeWelcomeUIKt$$ExternalSyntheticLambda0(InvestingEtfHoldingDetailsViewModel investingEtfHoldingDetailsViewModel, Function1 function1) {
        this.$r8$classId = 1;
        this.f$0 = investingEtfHoldingDetailsViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ HypeWelcomeUIKt$$ExternalSyntheticLambda0(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ HypeWelcomeUIKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
