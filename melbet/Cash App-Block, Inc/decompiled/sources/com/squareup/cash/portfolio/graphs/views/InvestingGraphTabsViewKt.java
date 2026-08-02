package com.squareup.cash.portfolio.graphs.views;

import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.map.LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.FilterBarKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.components.stock.details.InvestmentEntityViewKt$$ExternalSyntheticLambda19;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Icon;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda47;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolsListViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$StaleData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$UptoDateData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphTimeRangeViewModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingStockDetailsHeaderViewModel;
import com.squareup.cash.portfolio.graphs.views.MooncakeInvestingGraphView;
import com.squareup.cash.profile.views.ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda3;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.stripe.android.uicore.elements.SectionUIKt$$ExternalSyntheticLambda1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class InvestingGraphTabsViewKt {
    public static final ComposableLambdaImpl lambda$2059444872 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(12), false, 2059444872);
    public static final ComposableLambdaImpl lambda$238123136 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(5), false, 238123136);
    public static final ComposableLambdaImpl lambda$549870069 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(6), false, 549870069);

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestingGraphTimeRangeButtons(HistoricalRange historicalRange, boolean z, Function1 function1, Modifier modifier, List list, Composer composer, int i, int i2) {
        int i3;
        Function1 function12;
        Modifier modifier2;
        int i4;
        List list2;
        List list3;
        RecomposeScopeImpl endRestartGroup;
        boolean z2;
        List list4;
        historicalRange.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-230498520);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(historicalRange.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            function12 = function1;
            i3 |= gapComposer.changedInstance(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                list2 = list;
                i3 |= gapComposer.changedInstance(list2) ? 16384 : PKIFailureInfo.certRevoked;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                    if (i5 != 0) {
                        modifier2 = Modifier.Companion.$$INSTANCE;
                    }
                    if (i4 != 0) {
                        list4 = CollectionsKt__CollectionsKt.listOf((Object[]) new HistoricalRange[]{HistoricalRange.DAY, HistoricalRange.WEEK, HistoricalRange.MONTH, HistoricalRange.YEAR, HistoricalRange.ALL});
                        z2 = false;
                    } else {
                        z2 = false;
                        list4 = list2;
                    }
                    boolean changedInstance = ((i3 & 14) == 4 ? true : z2) | gapComposer.changedInstance(list4) | ((i3 & 112) == 32 ? true : z2) | ((i3 & 896) != 256 ? z2 : true);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        UserJavascriptInterfaceBase$$ExternalSyntheticLambda25 userJavascriptInterfaceBase$$ExternalSyntheticLambda25 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(list4, historicalRange, z, function12, 16);
                        list3 = list4;
                        gapComposer.updateRememberedValue(userJavascriptInterfaceBase$$ExternalSyntheticLambda25);
                        rememberedValue = userJavascriptInterfaceBase$$ExternalSyntheticLambda25;
                    } else {
                        list3 = list4;
                    }
                    FilterBarKt.FilterBar(modifier2, null, null, (Function1) rememberedValue, gapComposer, (i3 >> 9) & 14, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                    list3 = list2;
                }
                Modifier modifier3 = modifier2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(historicalRange, z, function1, modifier3, list3, i, i2);
                    return;
                }
                return;
            }
            list2 = list;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            }
            Modifier modifier32 = modifier2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        list2 = list;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
        }
        Modifier modifier322 = modifier2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void InvestingGraphTimeRangeMooncakeButtons(InvestingGraphTimeRangeViewModel investingGraphTimeRangeViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-790380627);
        int i2 = (gapComposer.changed(investingGraphTimeRangeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda3(15, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean z2 = (i2 & 14) == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new UtilsKt$$ExternalSyntheticLambda0(investingGraphTimeRangeViewModel, 25);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function12, modifier, (Function1) rememberedValue2, gapComposer, 48, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1((Object) investingGraphTimeRangeViewModel, function1, (Object) modifier, i, 9);
        }
    }

    public static final void InvestingPortfolioHeroHeader(InvestingHomePortfolioHeaderContentModel investingHomePortfolioHeaderContentModel, Composer composer, int i) {
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1392674924);
        int i2 = (gapComposer.changedInstance(investingHomePortfolioHeaderContentModel) ? 4 : 2) | i;
        byte b = 0;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            TextIndentKt textIndentKt = investingHomePortfolioHeaderContentModel.subtitle;
            ComposableLambdaImpl composableLambdaImpl = null;
            InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData = textIndentKt instanceof InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData ? (InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData) textIndentKt : null;
            if (investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData == null || (str = investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData.totalAmount) == null || StringsKt.isBlank(str)) {
                str = null;
            }
            if (str == null) {
                gapComposer.startReplaceGroup(-205134174);
            } else {
                gapComposer.startReplaceGroup(-205134173);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-1146195810, new PoolCreateViewKt$$ExternalSyntheticLambda5(str, 27), gapComposer);
            }
            gapComposer.end(false);
            zzacg.m2009HeroNumericsHeadertv5qRRQ(Expect_jvmKt.rememberComposableLambda(-173139118, new InvestingPortfolioAmountView$$ExternalSyntheticLambda9(investingHomePortfolioHeaderContentModel, i3, b), gapComposer), (Modifier) null, 0, (Function2) null, (Function3) null, Expect_jvmKt.rememberComposableLambda(1276686405, new PoolListSectionKt$$ExternalSyntheticLambda2(textIndentKt, 17), gapComposer), composableLambdaImpl, gapComposer, 196614, 30);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InvestingPortfolioAmountView$$ExternalSyntheticLambda9(investingHomePortfolioHeaderContentModel, i);
        }
    }

    public static final void InvestingStockDetailsHeroHeader(InvestingStockDetailsHeaderViewModel investingStockDetailsHeaderViewModel, Composer composer, int i) {
        GapComposer gapComposer;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        long j;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        boolean z;
        boolean z2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-148416842);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changed(investingStockDetailsHeaderViewModel) ? 4 : 2);
        byte b = 0;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j2 = colors.semantic.text.standard;
            boolean z3 = investingStockDetailsHeaderViewModel.metric != null;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$18);
            if (z3) {
                gapComposer2.startReplaceGroup(1678531465);
                gapComposer2.startReplaceGroup(885432007);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-388524548, new PoolCreateViewKt$$ExternalSyntheticLambda5(investingStockDetailsHeaderViewModel.title, 28), gapComposer2);
                gapComposer2.end(false);
                gapComposer = gapComposer2;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                j = j2;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$18;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$16;
                zzacg.m2009HeroNumericsHeadertv5qRRQ(Expect_jvmKt.rememberComposableLambda(-723906207, new InvestmentEntityViewKt$$ExternalSyntheticLambda19(investingStockDetailsHeaderViewModel, 2, b), gapComposer2), (Modifier) null, 0, rememberComposableLambda, (Function3) null, (Function3) null, (Function2) null, gapComposer, 6, 118);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                j = j2;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$18;
                gapComposer = gapComposer2;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$16;
                gapComposer.startReplaceGroup(1678736902);
                Countries.PageHeader(investingStockDetailsHeaderViewModel.title, (Modifier) null, (Function2) null, (String) null, gapComposer2, 0, 14);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            InvestingStockDetailsHeaderViewModel.Subtitle subtitle = investingStockDetailsHeaderViewModel.subtitle;
            if (subtitle == null) {
                gapComposer.startReplaceGroup(1678859289);
                gapComposer.end(false);
                z2 = true;
            } else {
                InvestingCryptoAvatarContentModel$Icon investingCryptoAvatarContentModel$Icon = subtitle.detailIcon;
                gapComposer.startReplaceGroup(1678859290);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer, 48);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$14);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$12, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$13);
                if (investingCryptoAvatarContentModel$Icon != null) {
                    gapComposer.startReplaceGroup(-809725534);
                    m3723SubtitleIconRPmYEkk(investingCryptoAvatarContentModel$Icon, j, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-809649615);
                    gapComposer.end(false);
                }
                String str = subtitle.detail;
                if (StringsKt.isBlank(str)) {
                    str = null;
                }
                String str2 = subtitle.subdetail;
                if (str2 == null || StringsKt.isBlank(str2)) {
                    str2 = null;
                }
                String str3 = subtitle.detailDescription;
                if (StringsKt.isBlank(str3)) {
                    str3 = null;
                }
                String joinToString$default = CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{str, str2, str3}), " ", null, null, 0, null, null, 62);
                String str4 = !StringsKt.isBlank(joinToString$default) ? joinToString$default : null;
                if (str4 == null) {
                    gapComposer.startReplaceGroup(-809307469);
                    gapComposer.end(false);
                    z2 = true;
                    z = false;
                } else {
                    gapComposer.startReplaceGroup(-809307468);
                    GapComposer gapComposer3 = gapComposer;
                    z = false;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                    gapComposer = gapComposer3;
                    gapComposer.end(false);
                    z2 = true;
                }
                gapComposer.end(z2);
                gapComposer.end(z);
            }
            gapComposer.end(z2);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InvestmentEntityViewKt$$ExternalSyntheticLambda19(investingStockDetailsHeaderViewModel, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0040  */
    /* renamed from: MooncakeInvestingGraph-RFMEUTM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3722MooncakeInvestingGraphRFMEUTM(final InvestingGraphContentModel investingGraphContentModel, Modifier modifier, Function1 function1, MooncakeInvestingGraphView.LoaderYPosition loaderYPosition, boolean z, long j, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function1 function12;
        int i4;
        int i5;
        boolean z2;
        int i6;
        long j2;
        int i7;
        MooncakeInvestingGraphView.LoaderYPosition loaderYPosition2;
        boolean z3;
        Function1 function13;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        boolean z4;
        investingGraphContentModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-119061583);
        int i8 = i | (gapComposer.changed(investingGraphContentModel) ? 4 : 2);
        int i9 = i2 & 2;
        if (i9 != 0) {
            i8 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i8 |= gapComposer.changed(modifier2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i4 = i8 | MLKEMEngine.KyberPolyBytes;
                function12 = function1;
            } else {
                function12 = function1;
                i4 = i8 | (gapComposer.changedInstance(function12) ? 256 : 128);
            }
            int i10 = i4 | 27648;
            i5 = i2 & 32;
            if (i5 == 0) {
                i10 = 224256 | i4;
            } else if ((i & 196608) == 0) {
                z2 = z;
                i10 |= gapComposer.changed(z2) ? 131072 : 65536;
                i6 = i2 & 64;
                if (i6 != 0) {
                    i7 = i10 | 1572864;
                    j2 = j;
                } else {
                    j2 = j;
                    i7 = i10 | (gapComposer.changed(j2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
                }
                if (gapComposer.shouldExecute(i7 & 1, (i7 & 599187) != 599186)) {
                    Modifier modifier4 = i9 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if (i3 != 0) {
                        function12 = null;
                    }
                    MooncakeInvestingGraphView.LoaderYPosition loaderYPosition3 = MooncakeInvestingGraphView.LoaderYPosition.VERTICALLY_CENTERED;
                    if (i5 != 0) {
                        z2 = false;
                    }
                    if (i6 != 0) {
                        j2 = Color.Unspecified;
                    }
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = MooncakeInvestingGraphViewKt$MooncakeInvestingGraph$1$2.INSTANCE;
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function1 function14 = (Function1) rememberedValue;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new PoolsListViewKt$$ExternalSyntheticLambda6(23);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Function1 function15 = (Function1) rememberedValue2;
                    boolean z5 = ((i7 & 896) == 256) | ((458752 & i7) == 131072) | ((3670016 & i7) == 1048576) | ((i7 & 14) == 4);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (z5 || rememberedValue3 == neverEqualPolicy) {
                        final boolean z6 = z2;
                        final Function1 function16 = function12;
                        final long j3 = j2;
                        rememberedValue3 = new Function1() { // from class: com.squareup.cash.portfolio.graphs.views.MooncakeInvestingGraphViewKt$$ExternalSyntheticLambda1
                            {
                                MooncakeInvestingGraphView.LoaderYPosition loaderYPosition4 = MooncakeInvestingGraphView.LoaderYPosition.BELOW_EVENT_LABEL;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                MooncakeInvestingGraphView.LoaderYPosition loaderYPosition4 = MooncakeInvestingGraphView.LoaderYPosition.VERTICALLY_CENTERED;
                                MooncakeInvestingGraphView mooncakeInvestingGraphView = (MooncakeInvestingGraphView) obj;
                                mooncakeInvestingGraphView.getClass();
                                mooncakeInvestingGraphView.setLoaderYPosition(loaderYPosition4);
                                mooncakeInvestingGraphView.setScrubListener(function16);
                                mooncakeInvestingGraphView.setLineWidthOverride(null);
                                mooncakeInvestingGraphView.setShouldStaleDataShowError(z6);
                                long j4 = Color.Unspecified;
                                long j5 = j3;
                                if (!Color.m676equalsimpl0(j5, j4)) {
                                    mooncakeInvestingGraphView.setColorOverride(Integer.valueOf(ColorKt.m694toArgb8_81llA(j5)));
                                    mooncakeInvestingGraphView.setEventLabelSize(14.0f);
                                }
                                mooncakeInvestingGraphView.render(investingGraphContentModel);
                                return Unit.INSTANCE;
                            }
                        };
                        z4 = z6;
                        gapComposer.updateRememberedValue(rememberedValue3);
                    } else {
                        z4 = z2;
                    }
                    AndroidView_androidKt.AndroidView(function14, modifier4, function15, null, (Function1) rememberedValue3, gapComposer, (i7 & 112) | 390, 8);
                    function13 = function12;
                    loaderYPosition2 = loaderYPosition3;
                    z3 = z4;
                    modifier3 = modifier4;
                } else {
                    gapComposer.skipToGroupEnd();
                    loaderYPosition2 = loaderYPosition;
                    z3 = z2;
                    function13 = function12;
                    modifier3 = modifier2;
                }
                long j4 = j2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SectionUIKt$$ExternalSyntheticLambda1(investingGraphContentModel, modifier3, function13, loaderYPosition2, z3, j4, i, i2);
                    return;
                }
                return;
            }
            z2 = z;
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            if (gapComposer.shouldExecute(i7 & 1, (i7 & 599187) != 599186)) {
            }
            long j42 = j2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        int i102 = i4 | 27648;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        if (gapComposer.shouldExecute(i7 & 1, (i7 & 599187) != 599186)) {
        }
        long j422 = j2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void NewInvestingStockDetailsHeaderView(InvestingStockDetailsHeaderViewModel investingStockDetailsHeaderViewModel, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1544911756);
        int i2 = (gapComposer.changed(investingStockDetailsHeaderViewModel) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1443219327, new InvestmentEntityViewKt$$ExternalSyntheticLambda19(investingStockDetailsHeaderViewModel), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewViewKt$$ExternalSyntheticLambda0(investingStockDetailsHeaderViewModel, modifier, i, 28);
        }
    }

    public static final void StaleSubtitle(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2146679352);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            Trace.m1190Iconww6aTOc(Countries.painterResource(R.drawable.investing_stale_data_caution, 0, gapComposer), (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.warning, gapComposer, Painter.$stable | 48, 4);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.investing_portfolio_stale_data), (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(i, 7);
        }
    }

    /* renamed from: SubtitleIcon-RPmYEkk, reason: not valid java name */
    public static final void m3723SubtitleIconRPmYEkk(InvestingCryptoAvatarContentModel$Icon investingCryptoAvatarContentModel$Icon, long j, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-532873551);
        int i2 = (gapComposer.changed(investingCryptoAvatarContentModel$Icon) ? 4 : 2) | i | (gapComposer.changed(j) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Icons icons = null;
            InvestingCryptoImage investingCryptoImage = investingCryptoAvatarContentModel$Icon != null ? investingCryptoAvatarContentModel$Icon.image : null;
            int i3 = investingCryptoImage == null ? -1 : NewInvestingStockDetailsHeaderViewKt$WhenMappings.$EnumSwitchMapping$0[investingCryptoImage.ordinal()];
            if (i3 == 1) {
                icons = Icons.TickerUp16;
            } else if (i3 == 2) {
                icons = Icons.TickerDown16;
            } else if (i3 == 3) {
                icons = Icons.AlertOutline16;
            }
            Icons icons2 = icons;
            if (icons2 != null) {
                gapComposer.startReplaceGroup(-636482329);
                Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, j, gapComposer, ((i2 << 6) & 7168) | 48, 4);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-636411215);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LoanDetailsSheetKt$$ExternalSyntheticLambda8(investingCryptoAvatarContentModel$Icon, j, i, 5);
        }
    }

    public static final void UpToDateSubtitle(InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData, Composer composer, int i) {
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(619624593);
        int i2 = i | (gapComposer.changed(investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            InvestingCryptoImage investingCryptoImage = investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData.percentIcon;
            int i3 = investingCryptoImage == null ? -1 : InvestingPortfolioAmountViewKt$WhenMappings.$EnumSwitchMapping$0[investingCryptoImage.ordinal()];
            Icons icons = i3 != 1 ? i3 != 2 ? null : Icons.TickerDown16 : Icons.TickerUp16;
            if (icons == null) {
                gapComposer.startReplaceGroup(-71574918);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-71574917);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, colors.semantic.icon.standard, gapComposer, 48, 4);
                gapComposer.end(false);
            }
            String str = investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData.percent;
            String str2 = (str == null || StringsKt.isBlank(str)) ? null : str;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-71373139);
                gapComposer.end(false);
                z = false;
            } else {
                gapComposer.startReplaceGroup(-71373138);
                z = false;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            String str3 = investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData.day;
            String str4 = (str3 == null || StringsKt.isBlank(str3)) ? null : str3;
            if (str4 == null) {
                gapComposer.startReplaceGroup(-71286091);
            } else {
                gapComposer.startReplaceGroup(-71286090);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
            }
            gapComposer.end(z);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewViewKt$$ExternalSyntheticLambda2(investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData, i, 13);
        }
    }

    public static final int asColorInt(TextGeometricTransformKt textGeometricTransformKt, View view) {
        view.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(view).colorPalette;
        if (textGeometricTransformKt == null) {
            return colorPalette.investing;
        }
        if (textGeometricTransformKt instanceof InvestingGraphContentModel$AccentColorType$UptoDateData) {
            Integer forTheme = DimensionKt.forTheme(((InvestingGraphContentModel$AccentColorType$UptoDateData) textGeometricTransformKt).accentColor, ThemeHelpersKt.themeInfo(view));
            return forTheme != null ? forTheme.intValue() : colorPalette.investing;
        }
        if (textGeometricTransformKt instanceof InvestingGraphContentModel$AccentColorType$StaleData) {
            return colorPalette.placeholderLabel;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }
}
