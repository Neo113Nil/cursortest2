package com.squareup.cash.earnings.views.home;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ScreenScaffoldContentScope;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.viewmodels.EarningsActivityListViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHeaderViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel$DistributionsSection$NullState;
import com.squareup.cash.earnings.views.components.EarningsCardKt;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.phoneplans.PhonePlansHomeViewKt$$ExternalSyntheticLambda14;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class EarningsHomeKt {

    /* renamed from: lambda$-1958374360, reason: not valid java name */
    public static final ComposableLambdaImpl f390lambda$1958374360 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(11), false, -1958374360);

    public static final void ActionButtonsSection(ArrayList arrayList, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1343182391);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(-918366133, new EarningsHomeKt$$ExternalSyntheticLambda9(arrayList, function1, 0), gapComposer), gapComposer, 24960, 11);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PhonePlansHomeViewKt$$ExternalSyntheticLambda14(arrayList, function1, i, 1);
        }
    }

    public static final void DisclosureFooter(EarningsHomeViewModel.Loaded.DisclosureFooter disclosureFooter, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1984414437);
        int i2 = (i & 6) == 0 ? (gapComposer.changedInstance(disclosureFooter) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            if (disclosureFooter.showIcon) {
                gapComposer.startReplaceGroup(2090066085);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Trace.m1191Iconww6aTOc(Icons.Fdic32, (String) null, (Modifier) null, colors.semantic.icon.standard, gapComposer, 54, 4);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2090196967);
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(-1595141341);
            for (String str : disclosureFooter.disclosures) {
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                DisclosureMarkdownText(str, function1, gapComposer, i2 & 112);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(disclosureFooter, function1, i, 14);
        }
    }

    public static final void DisclosureMarkdownText(String str, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-584358515);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.standard;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda12(23, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, m300paddingVpY3zN4$default, textStyle, j, null, null, new TextLineBalancing(1), 0, 0, 3, gapComposer, i2 & 14, 864);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda15(str, function1, i, 0);
        }
    }

    public static final void DistributionsNullStateSection(EarningsHomeViewModel$DistributionsSection$NullState earningsHomeViewModel$DistributionsSection$NullState, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(819766633);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(earningsHomeViewModel$DistributionsSection$NullState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = earningsHomeViewModel$DistributionsSection$NullState.title;
            String str2 = earningsHomeViewModel$DistributionsSection$NullState.subtitle;
            String str3 = earningsHomeViewModel$DistributionsSection$NullState.callToActionButtonText;
            boolean changedInstance = gapComposer.changedInstance(earningsHomeViewModel$DistributionsSection$NullState) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ArcadeModal2Kt$$ExternalSyntheticLambda2(18, function1, earningsHomeViewModel$DistributionsSection$NullState);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            EarningsCardKt.EarningsCard(str, str2, str3, (Function0) rememberedValue, Countries.painterResource(R.drawable.arcade_paychecks_distribution_nux, 0, gapComposer), null, gapComposer, Painter.$stable << 12);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(earningsHomeViewModel$DistributionsSection$NullState, function1, i, 15);
        }
    }

    public static final void EarningsActivityList(EarningsActivityListViewModel earningsActivityListViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        earningsActivityListViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1612792041);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(earningsActivityListViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1107184599, new EarningsActivityListKt$$ExternalSyntheticLambda0(earningsActivityListViewModel, function1, 0), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1((Object) earningsActivityListViewModel, function1, realImageLoader, i, 3);
        }
    }

    public static final void EarningsActivityListContent(EarningsActivityListViewModel earningsActivityListViewModel, Function1 function1, Composer composer, int i) {
        earningsActivityListViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(645943224);
        int i2 = (gapComposer.changedInstance(earningsActivityListViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
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
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m);
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
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new EarningsHeaderKt$$ExternalSyntheticLambda2(28, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(f390lambda$1958374360, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            AvatarsKt.ActivityScrollableEmbeddedView(earningsActivityListViewModel.activityEmbeddedModel, SizeKt.fillMaxSize(companion, 1.0f), (LazyListState) null, (PaddingValues) null, (Function3) null, (Function2) null, (Function3) null, gapComposer, 48, 508);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(earningsActivityListViewModel, function1, i, 13);
        }
    }

    public static final void EarningsHome(EarningsHomeViewModel earningsHomeViewModel, Function1 function1, RealImageLoader realImageLoader, LocalizedMoneyFormatter.Factory factory, Composer composer, int i) {
        int i2;
        earningsHomeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-753611243);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(earningsHomeViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(factory) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(266237610, new VerifyCheckDepositKt$$ExternalSyntheticLambda14(realImageLoader, function1, earningsHomeViewModel, factory, 26), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2((Object) earningsHomeViewModel, function1, realImageLoader, (Object) factory, i, 1);
        }
    }

    public static final void SectionView(EarningsHomeViewModel.SectionContent sectionContent, EarningsHomeViewModel.SectionContent sectionContent2, Function1 function1, ScreenScaffoldContentScope screenScaffoldContentScope, LocalizedMoneyFormatter.Factory factory, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1945548696);
        int i2 = i | (gapComposer.changedInstance(sectionContent) ? 4 : 2) | (gapComposer.changedInstance(sectionContent2) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changed(screenScaffoldContentScope) ? 2048 : 1024) | (gapComposer.changedInstance(factory) ? 16384 : PKIFailureInfo.certRevoked);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer.skipToGroupEnd();
        } else if (sectionContent instanceof EarningsHomeViewModel.SectionContent.Header) {
            gapComposer.startReplaceGroup(-742182167);
            UiCallbackModel uiCallbackModel = ((EarningsHomeViewModel.SectionContent.Header) sectionContent).state;
            EarningsHeaderKt.EarningsHeader((EarningsHeaderViewModel) uiCallbackModel.model, uiCallbackModel.onEvent, factory, screenScaffoldContentScope, gapComposer, ((i2 >> 6) & 896) | (i2 & 7168));
            gapComposer.end(false);
        } else if (sectionContent instanceof EarningsHomeViewModel.SectionContent.Activity) {
            gapComposer.startReplaceGroup(-741953728);
            if (sectionContent2 == null) {
                gapComposer.startReplaceGroup(1361540412);
                gapComposer.end(false);
            } else if ((sectionContent2 instanceof EarningsHomeViewModel.SectionContent.Activity) || (sectionContent2 instanceof EarningsHomeViewModel.SectionContent.EarningTools)) {
                gapComposer.startReplaceGroup(1361543101);
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1361544820);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            EarningsCardKt.EarningsActivitySection(((EarningsHomeViewModel.SectionContent.Activity) sectionContent).state, gapComposer, 0);
            gapComposer.end(false);
        } else if (sectionContent instanceof EarningsHomeViewModel.SectionContent.Distributions) {
            gapComposer.startReplaceGroup(-741641310);
            if (sectionContent2 == null) {
                gapComposer.startReplaceGroup(1361550204);
                gapComposer.end(false);
            } else if ((sectionContent2 instanceof EarningsHomeViewModel.SectionContent.Activity) || (sectionContent2 instanceof EarningsHomeViewModel.SectionContent.EarningTools)) {
                gapComposer.startReplaceGroup(1361552893);
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1361554612);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            EarningsHomeViewModel$DistributionsSection$NullState earningsHomeViewModel$DistributionsSection$NullState = ((EarningsHomeViewModel.SectionContent.Distributions) sectionContent).state;
            gapComposer.startReplaceGroup(1361564088);
            DistributionsNullStateSection(earningsHomeViewModel$DistributionsSection$NullState, function1, gapComposer, (i2 >> 3) & 112);
            gapComposer.end(false);
            gapComposer.end(false);
        } else if (sectionContent instanceof EarningsHomeViewModel.SectionContent.ActionButtons) {
            gapComposer.startReplaceGroup(-741065671);
            if (sectionContent2 == null) {
                gapComposer.startReplaceGroup(1361569148);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1361569843);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            ActionButtonsSection(((EarningsHomeViewModel.SectionContent.ActionButtons) sectionContent).buttons, function1, gapComposer, (i2 >> 3) & 112);
            gapComposer.end(false);
        } else if (sectionContent instanceof EarningsHomeViewModel.SectionContent.EarningTools) {
            gapComposer.startReplaceGroup(-740848020);
            if (sectionContent2 == null) {
                gapComposer.startReplaceGroup(1361576060);
                gapComposer.end(false);
            } else if ((sectionContent2 instanceof EarningsHomeViewModel.SectionContent.Activity) || (sectionContent2 instanceof EarningsHomeViewModel.SectionContent.EarningTools)) {
                gapComposer.startReplaceGroup(1361578749);
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1361580468);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            EarningsToolsSectionKt.EarningsToolsSection((EarningsHomeViewModel.SectionContent.EarningTools) sectionContent, function1, gapComposer, ((i2 >> 3) & 112) | (i2 & 14));
            gapComposer.end(false);
        } else if (sectionContent instanceof EarningsHomeViewModel.SectionContent.DisclosureFooter) {
            gapComposer.startReplaceGroup(-740521621);
            if (sectionContent2 == null) {
                gapComposer.startReplaceGroup(1361586588);
                gapComposer.end(false);
            } else if ((sectionContent2 instanceof EarningsHomeViewModel.SectionContent.Activity) || (sectionContent2 instanceof EarningsHomeViewModel.SectionContent.EarningTools)) {
                gapComposer.startReplaceGroup(1361589277);
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1361590996);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            DisclosureFooter(((EarningsHomeViewModel.SectionContent.DisclosureFooter) sectionContent).state, function1, gapComposer, (i2 >> 3) & 112);
            gapComposer.end(false);
        } else {
            if (!Intrinsics.areEqual(sectionContent, EarningsHomeViewModel.SectionContent.Unknown.INSTANCE)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1361532060, false);
            }
            gapComposer.startReplaceGroup(1361595420);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda4(sectionContent, sectionContent2, function1, screenScaffoldContentScope, factory, i, 21);
        }
    }
}
