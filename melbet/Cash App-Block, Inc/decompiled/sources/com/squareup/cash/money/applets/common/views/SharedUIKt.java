package com.squareup.cash.money.applets.common.views;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda4;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.media3.ui.compose.PlayerSurfaceKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda30;
import app.cash.local.views.map.LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.afterpayapplet.applets.views.AfterpayAppletTile$$ExternalSyntheticLambda7;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.views.PasscodeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.card.onboarding.pdp.ProductDetailsPageKt$$ExternalSyntheticLambda4;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda9;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.maps.views.ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.common.views.InstalledServiceAppletTileLayoutConfig;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel;
import com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel$Metadata$Chart;
import com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel$Metadata$Default;
import com.squareup.cash.money.viewmodels.InstalledServiceAppletTileContentModel;
import com.squareup.cash.money.views.MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsViewKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda21;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.TagHeroBackgroundKt$$ExternalSyntheticLambda1;
import com.squareup.cash.work.views.ScheduleCalendarKt$$ExternalSyntheticLambda5;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.savings.SavingsElement;

/* loaded from: classes6.dex */
public abstract class SharedUIKt {

    /* renamed from: lambda$-1973958056, reason: not valid java name */
    public static final ComposableLambdaImpl f469lambda$1973958056;

    /* renamed from: lambda$-301723517, reason: not valid java name */
    public static final ComposableLambdaImpl f470lambda$301723517;

    /* renamed from: lambda$-435310428, reason: not valid java name */
    public static final ComposableLambdaImpl f471lambda$435310428;

    /* renamed from: lambda$-605080418, reason: not valid java name */
    public static final ComposableLambdaImpl f472lambda$605080418;
    public static final ComposableLambdaImpl lambda$1038983386;
    public static final ComposableLambdaImpl lambda$1161296324;
    public static final ComposableLambdaImpl lambda$1552504549;
    public static final ComposableLambdaImpl lambda$1754558584;
    public static final ComposableLambdaImpl lambda$1993075105;
    public static final ComposableLambdaImpl lambda$1187477835 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(11), false, 1187477835);

    /* renamed from: lambda$-1629719268, reason: not valid java name */
    public static final ComposableLambdaImpl f468lambda$1629719268 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(24), false, -1629719268);
    public static final ComposableLambdaImpl lambda$499078120 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(12), false, 499078120);

    static {
        new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(13), false, 887944371);
        f471lambda$435310428 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(14), false, -435310428);
        f470lambda$301723517 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(15), false, -301723517);
        f472lambda$605080418 = new ComposableLambdaImpl(new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(6), false, -605080418);
        new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(16), false, 1981646762);
        lambda$1161296324 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(17), false, 1161296324);
        new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(18), false, -2082954097);
        lambda$1038983386 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(19), false, 1038983386);
        new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(20), false, 801064613);
        f469lambda$1973958056 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(21), false, -1973958056);
        new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(22), false, 533493997);
        lambda$1754558584 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(23), false, 1754558584);
        new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(25), false, 747884419);
        lambda$1993075105 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(26), false, 1993075105);
        new ComposableLambdaImpl(new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(7), false, -88581120);
        lambda$1552504549 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(27), false, 1552504549);
        new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(28), false, -2038803535);
        new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(29), false, -1466435430);
    }

    public static final void AppletTileRow(Modifier modifier, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        function3.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1672101918);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function3) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            int i5 = (i3 << 6) & 7168;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            function3.invoke(ColumnScopeInstance.INSTANCE, gapComposer, Integer.valueOf(((i5 >> 6) & 112) | 6));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PlayerSurfaceKt$$ExternalSyntheticLambda2(modifier2, (Object) function3, i, i2, 10);
        }
    }

    public static final void AppletTileRowUninstalledContent(int i, int i2, Composer composer, String str, String str2, Function0 function0) {
        int i3;
        str.getClass();
        str2.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1750778038);
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            ArcadeThemeKt.ArcadeTheme(Colors.copy$default(Strings.getColors(gapComposer), Colors.Component.copy$default(Strings.getColors(gapComposer).component, null, null, Colors.Component.Cell.copy$default(Strings.getColors(gapComposer).component.cell, new Colors.Component.Cell.Background(Color.Unspecified, Strings.getColors(gapComposer).component.cell.background.pressed)), null, null, null, null, 134217695), null, 55), null, null, Expect_jvmKt.rememberComposableLambda(913967391, new InviteContactsBodyKt$$ExternalSyntheticLambda18(function0, i, str, str2), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9(i, i2, str, str2, function0);
        }
    }

    public static final void BalanceAppletChart(InvestingGraphContentModel investingGraphContentModel, Composer composer, int i) {
        InvestingGraphContentModel investingGraphContentModel2;
        investingGraphContentModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1528694506);
        int i2 = (gapComposer.changed(investingGraphContentModel) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(Modifier.Companion.$$INSTANCE, 80.0f), 44.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            investingGraphContentModel2 = investingGraphContentModel;
            InvestingGraphTabsViewKt.m3722MooncakeInvestingGraphRFMEUTM(investingGraphContentModel2, SpacerKt.m298padding3ABfNKs(m277height3ABfNKs, 4.0f), null, null, false, 0L, gapComposer, i2 & 14, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        } else {
            investingGraphContentModel2 = investingGraphContentModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda5(investingGraphContentModel2, i, 19);
        }
    }

    public static final void DefaultBalanceLayout(InstalledBalanceAppletTileContentModel installedBalanceAppletTileContentModel, boolean z, InstalledBalanceAppletTileLayoutConfig installedBalanceAppletTileLayoutConfig, Composer composer, int i) {
        InstalledBalanceAppletTileContentModel installedBalanceAppletTileContentModel2;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(47698129);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(installedBalanceAppletTileContentModel) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changed(installedBalanceAppletTileLayoutConfig) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
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
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, installedBalanceAppletTileLayoutConfig.headerToBalanceGap));
            installedBalanceAppletTileContentModel2 = installedBalanceAppletTileContentModel;
            InstalledBalanceAppletTileContentInner(installedBalanceAppletTileContentModel2, z, installedBalanceAppletTileLayoutConfig, gapComposer, (i2 & 14) | 8 | (i2 & 112) | (i2 & 896));
            gapComposer.end(true);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            SpacerKt.Spacer(gapComposer, rowScopeInstance.weight(1.0f, companion, true));
            Function3 function3 = installedBalanceAppletTileContentModel2.visual;
            if (function3 == null) {
                gapComposer.startReplaceGroup(136688594);
                z2 = false;
            } else {
                z2 = false;
                gapComposer.startReplaceGroup(136688595);
                function3.invoke(rowScopeInstance, gapComposer, 6);
            }
            gapComposer.end(z2);
            gapComposer.end(true);
        } else {
            installedBalanceAppletTileContentModel2 = installedBalanceAppletTileContentModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstalledBalanceAppletTileKt$$ExternalSyntheticLambda0(installedBalanceAppletTileContentModel2, z, installedBalanceAppletTileLayoutConfig, i, 2);
        }
    }

    public static final void DefaultServiceLayout(int i, Composer composer, InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig, List list, Function2 function2, boolean z) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(34996713);
        int i2 = (i & 6) == 0 ? (gapComposer.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(installedServiceAppletTileLayoutConfig) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(-1089731229);
                re$$ExternalSyntheticOutline0.m(companion, installedServiceAppletTileLayoutConfig.headerToContentGap, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1089648583);
                gapComposer.end(false);
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            gapComposer.startReplaceGroup(167127588);
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                int i5 = i3;
                InstalledServiceAppletTileItem((InstalledServiceAppletTileContentModel) obj, installedServiceAppletTileLayoutConfig.visualPosition, false, gapComposer, 8, 4);
                if (i5 != CollectionsKt__CollectionsKt.getLastIndex(list)) {
                    gapComposer.startReplaceGroup(-1463610330);
                    re$$ExternalSyntheticOutline0.m(companion, installedServiceAppletTileLayoutConfig.contentRowGap, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1463524801);
                    gapComposer.end(false);
                }
                i3 = i4;
            }
            gapComposer.end(false);
            gapComposer.end(true);
            if (function2 != null) {
                gapComposer.startReplaceGroup(-1089330399);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                Recorder$$ExternalSyntheticOutline1.m((i2 >> 3) & 14, function2, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1089276583);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstalledServiceAppletTileKt$$ExternalSyntheticLambda1(list, function2, z, installedServiceAppletTileLayoutConfig, i);
        }
    }

    public static final void FailedAppletTile(int i, Composer composer, String str, Function0 function0) {
        int i2;
        str.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(874012315);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier appletPaddingAndBackground = appletPaddingAndBackground(i2 & 112, gapComposer, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.applet_tile_height)), function0);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, appletPaddingAndBackground);
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
            InstalledAppletTileHeader(new InstalledAppletTileHeaderModel(str, null, null, 14), null, gapComposer, 0, 2);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            String str2 = "Unable to load " + str + " right now";
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).helpText;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.subtle, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FailedAppletTileKt$$ExternalSyntheticLambda0(str, function0, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if ((r24 & 8) != 0) goto L48;
     */
    /* renamed from: FilledCircleWithIcon-JqkWdHE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3604FilledCircleWithIconJqkWdHE(final long j, final Icons icons, final long j2, float f, Composer composer, final int i, final int i2) {
        int i3;
        float f2;
        int i4;
        icons.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1337178272);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(icons.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                f2 = f;
                if (gapComposer.changed(f2)) {
                    i4 = 2048;
                    i3 |= i4;
                }
            } else {
                f2 = f;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            f2 = f;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
                    f2 = PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.applet_tile_service_content_height);
                    i3 &= -7169;
                }
                gapComposer.endDefaults();
                BiasAlignment biasAlignment = Alignment.Companion.Center;
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, f2), j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(0.5f * f2));
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, j2, gapComposer, ((i3 >> 3) & 14) | 48 | ((i3 << 3) & 7168), 4);
                gapComposer.end(true);
            } else {
                gapComposer.skipToGroupEnd();
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        final float f3 = f2;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.money.applets.common.views.SharedUIKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    SharedUIKt.m3604FilledCircleWithIconJqkWdHE(j, icons, j2, f3, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstalledAppletTile(InstalledAppletTileHeaderModel installedAppletTileHeaderModel, ComposableLambdaImpl composableLambdaImpl, Function0 function0, boolean z, Function2 function2, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        Function2 function22;
        RecomposeScopeImpl endRestartGroup;
        Modifier clickableWithHaptics;
        int i4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-705044593);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer.changed(installedAppletTileHeaderModel) : gapComposer.changedInstance(installedAppletTileHeaderModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    function22 = function2;
                    if (gapComposer.changedInstance(function22)) {
                        i4 = 16384;
                        i3 |= i4;
                    }
                } else {
                    function22 = function2;
                }
                i4 = PKIFailureInfo.certRevoked;
                i3 |= i4;
            } else {
                function22 = function2;
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                gapComposer.skipToGroupEnd();
            } else {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        function22 = new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(9);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                }
                gapComposer.endDefaults();
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (z2) {
                    gapComposer.startReplaceGroup(-1592853965);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj = DefaultSizes.border.entries;
                    Modifier clip = ClipKt.clip(companion, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    clickableWithHaptics = SpacerKt.m301paddingqDBjuR0(clickableWithHaptics((i3 >> 3) & 112, gapComposer, ImageKt.m177backgroundbw27NRU(clip, colors.surface.money.applet.background, ColorKt.RectangleShape), function0), 24.0f, 24.0f, 24.0f, 24.0f);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1592776527);
                    clickableWithHaptics = clickableWithHaptics(((i3 >> 3) & 112) | 6, gapComposer, companion, function0);
                    gapComposer.end(false);
                }
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clickableWithHaptics);
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
                if (installedAppletTileHeaderModel == null) {
                    gapComposer.startReplaceGroup(1466302786);
                } else {
                    gapComposer.startReplaceGroup(1466302787);
                    InstalledAppletTileHeader(installedAppletTileHeaderModel, function22, gapComposer, (i3 >> 9) & 112, 0);
                }
                gapComposer.end(false);
                Recorder$$ExternalSyntheticOutline1.m(6 | (i3 & 112), composableLambdaImpl, ColumnScopeInstance.INSTANCE, gapComposer, true);
            }
            boolean z3 = z2;
            Function2 function23 = function22;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(installedAppletTileHeaderModel, composableLambdaImpl, function0, z3, function23, i, i2, 7);
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 24576) != 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        boolean z32 = z2;
        Function2 function232 = function22;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if ((r37 & 2) != 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstalledAppletTileHeader(InstalledAppletTileHeaderModel installedAppletTileHeaderModel, Function2 function2, Composer composer, int i, int i2) {
        int i3;
        Function2 function22;
        GapComposer gapComposer;
        Modifier.Companion companion;
        boolean z;
        Modifier.Companion companion2;
        int i4;
        installedAppletTileHeaderModel.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(841404570);
        if ((i & 6) == 0) {
            i3 = i | ((i & 8) == 0 ? gapComposer2.changed(installedAppletTileHeaderModel) : gapComposer2.changedInstance(installedAppletTileHeaderModel) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                function22 = function2;
                if (gapComposer2.changedInstance(function22)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                function22 = function2;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            function22 = function2;
        }
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            gapComposer2.startDefaults();
            int i5 = 8;
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    function22 = new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(i5);
                    i3 &= -113;
                }
                int i6 = i3;
                Function2 function23 = function22;
                gapComposer2.endDefaults();
                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion3, 1.0f);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer2, 48);
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer2.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                InstalledAppletTileHeaderModel.Icon icon = installedAppletTileHeaderModel.startIcon;
                if (icon == null) {
                    gapComposer2.startReplaceGroup(1877285555);
                    gapComposer2.end(false);
                    gapComposer = gapComposer2;
                    companion = companion3;
                    z = 1090519040;
                } else {
                    gapComposer2.startReplaceGroup(1877285556);
                    gapComposer = gapComposer2;
                    companion = companion3;
                    z = 1090519040;
                    Trace.m1191Iconww6aTOc(Icons.SubtlePush16, icon.contentDescription, (Modifier) null, icon.tint, gapComposer, 0, 4);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 8.0f));
                    gapComposer.end(false);
                }
                String str = installedAppletTileHeaderModel.title;
                TextStyle textStyle = (TextStyle) function23.invoke(gapComposer, Integer.valueOf((i6 >> 3) & 14));
                long j = Strings.getColors(gapComposer).semantic.text.standard;
                boolean z2 = (i6 & 14) == 4 || ((i6 & 8) != 0 && gapComposer.changedInstance(installedAppletTileHeaderModel));
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z2 || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new TooltipBoxKt$$ExternalSyntheticLambda2(installedAppletTileHeaderModel, 27);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier.Companion companion4 = companion;
                gapComposer2 = gapComposer;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer2, rowScopeInstance.weight(1.0f, semantics, true), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                String str2 = installedAppletTileHeaderModel.titleCaption;
                if (str2 == null) {
                    gapComposer2.startReplaceGroup(1877772317);
                    gapComposer2.end(false);
                    companion2 = companion4;
                } else {
                    gapComposer2.startReplaceGroup(1877772318);
                    if (str2.length() > 0) {
                        gapComposer2.startReplaceGroup(-1923758166);
                        TextStyle textStyle2 = Strings.getTypography(gapComposer2).helpText;
                        long j2 = Strings.getColors(gapComposer2).semantic.text.subtle;
                        Modifier weight = rowScopeInstance.weight(1.0f, companion4, true);
                        boolean changed = gapComposer2.changed(str2);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new ClusterItemKt$$ExternalSyntheticLambda3(str2, 7);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        companion2 = companion4;
                        Room.m1165Text25TpFw(0, 0, 0, 6, 0, 0, 3824, j2, (Composer) gapComposer2, SemanticsModifierKt.semantics(weight, false, (Function1) rememberedValue2), textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                        gapComposer2.end(false);
                    } else {
                        companion2 = companion4;
                        gapComposer2.startReplaceGroup(-1923478267);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(false);
                }
                InstalledAppletTileHeaderModel.Icon icon2 = installedAppletTileHeaderModel.endIcon;
                if (icon2 == null) {
                    gapComposer2.startReplaceGroup(1878152315);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(1878152316);
                    Strings.getSizes(gapComposer2).getClass();
                    Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion2, 8.0f, gapComposer2);
                    Trace.m1191Iconww6aTOc(Icons.SubtlePush16, icon2.contentDescription, (Modifier) null, icon2.tint, gapComposer2, 0, 4);
                    gapComposer2.end(false);
                }
                gapComposer2.end(true);
                function22 = function23;
            } else {
                gapComposer2.skipToGroupEnd();
            }
        } else {
            gapComposer2.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PlayerSurfaceKt$$ExternalSyntheticLambda2(installedAppletTileHeaderModel, function22, i, i2, 9);
        }
    }

    public static final void InstalledBalanceAppletTile(InstalledAppletTileHeaderModel installedAppletTileHeaderModel, InstalledBalanceAppletTileContentModel installedBalanceAppletTileContentModel, boolean z, Function0 function0, boolean z2, InstalledBalanceAppletTileLayoutConfig installedBalanceAppletTileLayoutConfig, Composer composer, int i) {
        int i2;
        Function0 function02;
        boolean z3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1975976870);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(installedAppletTileHeaderModel) : gapComposer.changedInstance(installedAppletTileHeaderModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? gapComposer.changed(installedBalanceAppletTileContentModel) : gapComposer.changedInstance(installedBalanceAppletTileContentModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function02 = function0;
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            i4 |= gapComposer.changed(installedBalanceAppletTileLayoutConfig) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        boolean z4 = true;
        if (gapComposer.shouldExecute(i4 & 1, (74899 & i4) != 74898)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
                z4 = z2;
            }
            gapComposer.endDefaults();
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(253674816, new EducationalSheetKt$$ExternalSyntheticLambda8(installedBalanceAppletTileContentModel, z, installedBalanceAppletTileLayoutConfig, 5), gapComposer);
            int i5 = i4;
            CashMapViewKt$$ExternalSyntheticLambda5 cashMapViewKt$$ExternalSyntheticLambda5 = new CashMapViewKt$$ExternalSyntheticLambda5(installedBalanceAppletTileLayoutConfig, i3);
            int i6 = (i5 & 14) | 48;
            int i7 = i5 >> 3;
            int i8 = (i7 & 7168) | i6 | (i7 & 896);
            z3 = z4;
            InstalledAppletTile(installedAppletTileHeaderModel, rememberComposableLambda, function02, z3, cashMapViewKt$$ExternalSyntheticLambda5, gapComposer, i8, 0);
        } else {
            gapComposer.skipToGroupEnd();
            z3 = z2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScheduleCalendarKt$$ExternalSyntheticLambda5(installedAppletTileHeaderModel, installedBalanceAppletTileContentModel, z, function0, z3, installedBalanceAppletTileLayoutConfig, i);
        }
    }

    public static final void InstalledBalanceAppletTileContent(InstalledBalanceAppletTileContentModel installedBalanceAppletTileContentModel, boolean z, InstalledBalanceAppletTileLayoutConfig installedBalanceAppletTileLayoutConfig, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(846060739);
        int i2 = (gapComposer.changedInstance(installedBalanceAppletTileContentModel) ? 4 : 2) | i | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changed(installedBalanceAppletTileLayoutConfig) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (installedBalanceAppletTileLayoutConfig.useRedesignedLayout) {
            gapComposer.startReplaceGroup(2127603188);
            RedesignedBalanceLayout(installedBalanceAppletTileContentModel, z, installedBalanceAppletTileLayoutConfig, gapComposer, (i2 & 896) | (i2 & 14) | 8 | (i2 & 112));
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(2127683447);
            DefaultBalanceLayout(installedBalanceAppletTileContentModel, z, installedBalanceAppletTileLayoutConfig, gapComposer, (i2 & 896) | (i2 & 14) | 8 | (i2 & 112));
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstalledBalanceAppletTileKt$$ExternalSyntheticLambda0(installedBalanceAppletTileContentModel, z, installedBalanceAppletTileLayoutConfig, i, 0);
        }
    }

    public static final void InstalledBalanceAppletTileContentInner(InstalledBalanceAppletTileContentModel installedBalanceAppletTileContentModel, boolean z, InstalledBalanceAppletTileLayoutConfig installedBalanceAppletTileLayoutConfig, Composer composer, int i) {
        String str;
        String str2;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        boolean z2;
        String m;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        GapComposer gapComposer;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12;
        InstalledBalanceAppletTileContentModel$Metadata$Chart installedBalanceAppletTileContentModel$Metadata$Chart;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        Arrangement$End$1 arrangement$End$1;
        boolean z3;
        String str3 = installedBalanceAppletTileContentModel.formattedBalance;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1772700625);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(installedBalanceAppletTileContentModel) ? 4 : 2) | (gapComposer2.changed(z) ? 32 : 16) | (gapComposer2.changed(installedBalanceAppletTileLayoutConfig) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                str = re$$ExternalSyntheticOutline0.m(gapComposer2, 393792679, R.string.obfuscated_amount_content_description, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(393872783);
                gapComposer2.end(false);
                str = str3;
            }
            str.getClass();
            String format2 = new MessageFormat(Room.stringResource(gapComposer2, R.string.animated_amount_content_description)).format(new Object[]{str});
            format2.getClass();
            int mo236toPx0680j_4 = (int) ((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(23.0f);
            boolean changed = gapComposer2.changed(format2);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ClusterItemKt$$ExternalSyntheticLambda3(format2, 8);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier then = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue).then(companion);
            boolean changed2 = gapComposer2.changed(mo236toPx0680j_4);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new TabToolbarsKt$$ExternalSyntheticLambda21(mo236toPx0680j_4, 10);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            VisibleKt.m3482AnimatedAmountTextJDMA8c0(ValueInsets.layout(then, (Function3) rememberedValue2), Strings.getTypography(gapComposer2).numeralSmall, Strings.getColors(gapComposer2).semantic.text.standard, 0, new AnimatedAmountTextView.Amount(str3, installedBalanceAppletTileContentModel.rawBalance), null, false, 0L, gapComposer2, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            gapComposer2 = gapComposer2;
            SavingsElement.Element element = installedBalanceAppletTileContentModel.metadata;
            re$$ExternalSyntheticOutline0.m(gapComposer2, 394960604, companion, 8.0f, gapComposer2);
            if (element instanceof InstalledBalanceAppletTileContentModel$Metadata$Default) {
                gapComposer2.startReplaceGroup(-1400644540);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).helpText, (TextLineBalancing) null, ((InstalledBalanceAppletTileContentModel$Metadata$Default) element).text, (Map) null, (Function1) null, false);
                gapComposer2.end(false);
                z3 = false;
            } else {
                if (!(element instanceof InstalledBalanceAppletTileContentModel$Metadata$Chart)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -45182052, false);
                }
                gapComposer2.startReplaceGroup(-1400419883);
                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                Arrangement$End$1 arrangement$End$12 = SpacerKt.Start;
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$12, vertical, gapComposer2, 48);
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$16);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$13);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$17);
                InstalledBalanceAppletTileContentModel$Metadata$Chart installedBalanceAppletTileContentModel$Metadata$Chart2 = (InstalledBalanceAppletTileContentModel$Metadata$Chart) element;
                String str4 = installedBalanceAppletTileContentModel$Metadata$Chart2.percentText;
                InstalledBalanceAppletTileContentModel$Metadata$Chart.Arrow arrow = installedBalanceAppletTileContentModel$Metadata$Chart2.arrow;
                if (arrow == null) {
                    gapComposer2.startReplaceGroup(-165109101);
                    gapComposer2.end(false);
                    installedBalanceAppletTileContentModel$Metadata$Chart = installedBalanceAppletTileContentModel$Metadata$Chart2;
                    ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                    str2 = str4;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                    arrangement$End$1 = arrangement$End$12;
                    gapComposer = gapComposer2;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                } else {
                    gapComposer2.startReplaceGroup(-165109100);
                    Icons icons = arrow.icon;
                    str2 = str4;
                    long j = arrow.tint;
                    int ordinal = arrow.direction.ordinal();
                    if (ordinal == 0) {
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                        z2 = false;
                        m = re$$ExternalSyntheticOutline0.m(gapComposer2, 873968831, R.string.up_direction_content_description, gapComposer2, false);
                    } else {
                        if (ordinal != 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 873967416, false);
                        }
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                        z2 = false;
                        m = re$$ExternalSyntheticOutline0.m(gapComposer2, 873971521, R.string.down_direction_content_description, gapComposer2, false);
                    }
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                    gapComposer = gapComposer2;
                    ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                    installedBalanceAppletTileContentModel$Metadata$Chart = installedBalanceAppletTileContentModel$Metadata$Chart2;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                    arrangement$End$1 = arrangement$End$12;
                    Trace.m1191Iconww6aTOc(icons, m, (Modifier) null, j, gapComposer, 0, 4);
                    gapComposer.end(z2);
                }
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$1);
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, Alignment.Companion.Top, gapComposer, 6);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$1);
                if (StringsKt.isBlank(str2)) {
                    gapComposer2 = gapComposer;
                    z3 = false;
                    gapComposer2.startReplaceGroup(471804594);
                    gapComposer2.end(false);
                } else {
                    gapComposer.startReplaceGroup(471328899);
                    InstalledBalanceAppletTileContentModel$Metadata$Chart installedBalanceAppletTileContentModel$Metadata$Chart3 = installedBalanceAppletTileContentModel$Metadata$Chart;
                    gapComposer2 = gapComposer;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, installedBalanceAppletTileContentModel$Metadata$Chart3.percentTint, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer).helpText, (TextLineBalancing) null, str2.concat(" "), (Map) null, (Function1) null, false);
                    if (StringsKt.isBlank(installedBalanceAppletTileContentModel$Metadata$Chart3.todayText)) {
                        z3 = false;
                        gapComposer2.startReplaceGroup(471788722);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(471593081);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, installedBalanceAppletTileContentModel$Metadata$Chart3.todayTextTint, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).helpText, (TextLineBalancing) null, installedBalanceAppletTileContentModel$Metadata$Chart3.todayText, (Map) null, (Function1) null, false);
                        z3 = false;
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(z3);
                }
                gapComposer2.end(true);
                gapComposer2.end(true);
                gapComposer2.end(true);
                gapComposer2.end(z3);
            }
            gapComposer2.end(z3);
        } else {
            gapComposer2.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstalledBalanceAppletTileKt$$ExternalSyntheticLambda0(installedBalanceAppletTileContentModel, z, installedBalanceAppletTileLayoutConfig, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstalledServiceAppletTile(InstalledAppletTileHeaderModel installedAppletTileHeaderModel, List list, Function0 function0, boolean z, Function2 function2, InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig, Function2 function22, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        Function2 function23;
        InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig2;
        int i5;
        Function2 function24;
        GapComposer gapComposer;
        Function2 function25;
        InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig3;
        Function2 function26;
        RecomposeScopeImpl endRestartGroup;
        boolean z3;
        Function2 function27;
        Function2 function28;
        InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig4;
        int i6;
        list.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-269925163);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer2.changed(installedAppletTileHeaderModel) : gapComposer2.changedInstance(installedAppletTileHeaderModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(function0) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= gapComposer2.changed(z2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function23 = function2;
                i3 |= gapComposer2.changedInstance(function23) ? 16384 : PKIFailureInfo.certRevoked;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        installedServiceAppletTileLayoutConfig2 = installedServiceAppletTileLayoutConfig;
                        if (gapComposer2.changed(installedServiceAppletTileLayoutConfig2)) {
                            i6 = PKIFailureInfo.unsupportedVersion;
                            i3 |= i6;
                        }
                    } else {
                        installedServiceAppletTileLayoutConfig2 = installedServiceAppletTileLayoutConfig;
                    }
                    i6 = 65536;
                    i3 |= i6;
                } else {
                    installedServiceAppletTileLayoutConfig2 = installedServiceAppletTileLayoutConfig;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    function24 = function22;
                    i3 |= gapComposer2.changedInstance(function24) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    if (gapComposer2.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                        gapComposer2.skipToGroupEnd();
                        gapComposer = gapComposer2;
                        function25 = function23;
                        installedServiceAppletTileLayoutConfig3 = installedServiceAppletTileLayoutConfig2;
                        function26 = function24;
                    } else {
                        gapComposer2.startDefaults();
                        if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                            z3 = i7 == 0 ? z2 : true;
                            if (i4 != 0) {
                                function23 = null;
                            }
                            if ((i2 & 32) != 0) {
                                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                                DefaultSizes.spacing.getClass();
                                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                                i3 &= -458753;
                                installedServiceAppletTileLayoutConfig2 = new InstalledServiceAppletTileLayoutConfig(8.0f, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 24);
                            }
                            if (i5 != 0) {
                                function27 = null;
                                function28 = function23;
                                installedServiceAppletTileLayoutConfig4 = installedServiceAppletTileLayoutConfig2;
                                int i8 = i3;
                                gapComposer2.endDefaults();
                                InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig5 = installedServiceAppletTileLayoutConfig4;
                                Function2 function29 = function27;
                                boolean z4 = z3;
                                InstalledAppletTile(installedAppletTileHeaderModel, Expect_jvmKt.rememberComposableLambda(-1214733073, new SwipeToDismissKt$$ExternalSyntheticLambda2(list, function28, installedAppletTileHeaderModel, installedServiceAppletTileLayoutConfig4, function27, 11), gapComposer2), function0, z4, new CashMapViewKt$$ExternalSyntheticLambda5(installedServiceAppletTileLayoutConfig5, 17), gapComposer2, (i8 & 14) | 48 | (i8 & 896) | (i8 & 7168), 0);
                                z2 = z4;
                                gapComposer = gapComposer2;
                                function25 = function28;
                                installedServiceAppletTileLayoutConfig3 = installedServiceAppletTileLayoutConfig5;
                                function26 = function29;
                            }
                        } else {
                            gapComposer2.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            z3 = z2;
                        }
                        function28 = function23;
                        installedServiceAppletTileLayoutConfig4 = installedServiceAppletTileLayoutConfig2;
                        function27 = function24;
                        int i82 = i3;
                        gapComposer2.endDefaults();
                        InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig52 = installedServiceAppletTileLayoutConfig4;
                        Function2 function292 = function27;
                        boolean z42 = z3;
                        InstalledAppletTile(installedAppletTileHeaderModel, Expect_jvmKt.rememberComposableLambda(-1214733073, new SwipeToDismissKt$$ExternalSyntheticLambda2(list, function28, installedAppletTileHeaderModel, installedServiceAppletTileLayoutConfig4, function27, 11), gapComposer2), function0, z42, new CashMapViewKt$$ExternalSyntheticLambda5(installedServiceAppletTileLayoutConfig52, 17), gapComposer2, (i82 & 14) | 48 | (i82 & 896) | (i82 & 7168), 0);
                        z2 = z42;
                        gapComposer = gapComposer2;
                        function25 = function28;
                        installedServiceAppletTileLayoutConfig3 = installedServiceAppletTileLayoutConfig52;
                        function26 = function292;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda4(installedAppletTileHeaderModel, list, function0, z2, function25, installedServiceAppletTileLayoutConfig3, function26, i, i2);
                        return;
                    }
                    return;
                }
                function24 = function22;
                if (gapComposer2.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function23 = function2;
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            function24 = function22;
            if (gapComposer2.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z2 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function23 = function2;
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        function24 = function22;
        if (gapComposer2.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void InstalledServiceAppletTileContent(List list, Function2 function2, boolean z, InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig, Function2 function22, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-137505842);
        int i2 = i | (gapComposer.changedInstance(list) ? 4 : 2) | (gapComposer.changedInstance(function2) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changed(installedServiceAppletTileLayoutConfig) ? 2048 : 1024) | (gapComposer.changedInstance(function22) ? 16384 : PKIFailureInfo.certRevoked);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer.skipToGroupEnd();
        } else if (list.isEmpty()) {
            gapComposer.startReplaceGroup(962798036);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(962578928);
            if (function22 != null) {
                gapComposer.startReplaceGroup(962606549);
                int i3 = i2 & 14;
                int i4 = i2 >> 3;
                SharedVisualServiceLayout((i4 & 7168) | i3 | (i4 & 112) | (i4 & 896), gapComposer, installedServiceAppletTileLayoutConfig, list, function22, z);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(962706617);
                DefaultServiceLayout(i2 & 8190, gapComposer, installedServiceAppletTileLayoutConfig, list, function2, z);
                gapComposer.end(false);
            }
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(i, 7, list, function2, installedServiceAppletTileLayoutConfig, function22, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstalledServiceAppletTileItem(InstalledServiceAppletTileContentModel installedServiceAppletTileContentModel, InstalledServiceAppletTileLayoutConfig.VisualPosition visualPosition, boolean z, Composer composer, int i, int i2) {
        boolean z2;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        long j;
        RowScopeInstance rowScopeInstance;
        String str;
        Integer num;
        boolean z4;
        boolean z5;
        boolean z6;
        Modifier.Companion companion;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-126499083);
        int i3 = (gapComposer.changedInstance(installedServiceAppletTileContentModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(visualPosition == null ? -1 : visualPosition.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 256 : 128;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
                gapComposer.skipToGroupEnd();
                z3 = z2;
            } else {
                boolean z7 = i4 != 0 ? true : z2;
                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer, 48);
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
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                if (z7 && visualPosition == InstalledServiceAppletTileLayoutConfig.VisualPosition.START) {
                    gapComposer.startReplaceGroup(-579486950);
                    Function3 function3 = installedServiceAppletTileContentModel.visual;
                    if (function3 == null) {
                        gapComposer.startReplaceGroup(-784226265);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-784226264);
                        function3.invoke(rowScopeInstance2, gapComposer, 6);
                        SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion2, 12.0f));
                        gapComposer.end(false);
                    }
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-784127095);
                    gapComposer.end(false);
                }
                InstalledServiceAppletTileContentModel.Emphasis emphasis = installedServiceAppletTileContentModel.emphasis;
                InstalledServiceAppletTileContentModel.BriefState briefState = installedServiceAppletTileContentModel.briefState;
                TextStyle textStyle = emphasis != null ? emphasis.style : null;
                if (textStyle == null) {
                    gapComposer.startReplaceGroup(-579481339);
                    textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                } else {
                    gapComposer.startReplaceGroup(-579482827);
                }
                gapComposer.end(false);
                SpanStyle spanStyle = textStyle.spanStyle;
                Color color = emphasis != null ? new Color(emphasis.color) : null;
                if (color == null) {
                    gapComposer.startReplaceGroup(-579476575);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.text.standard;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-579478373);
                    gapComposer.end(false);
                    j = color.value;
                }
                long j2 = j;
                if (briefState instanceof InstalledServiceAppletTileContentModel.BriefState.Loading) {
                    gapComposer.startReplaceGroup(-783836873);
                    rowScopeInstance = rowScopeInstance2;
                    VisibleKt.ShimmerBox(null, false, null, f468lambda$1629719268, gapComposer, 3072, 7);
                    gapComposer.end(false);
                    num = 6;
                    z4 = z7;
                    gapComposer = gapComposer;
                    z5 = true;
                    z6 = false;
                    companion = companion2;
                } else {
                    rowScopeInstance = rowScopeInstance2;
                    gapComposer.startReplaceGroup(-783484558);
                    gapComposer.startReplaceGroup(-579462188);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder();
                    String str2 = "";
                    if (emphasis == null || (str = emphasis.text) == null) {
                        str = "";
                    }
                    int pushStyle = builder.pushStyle(SpanStyle.m973copyGSF8kmg$default(spanStyle, j2, null, 0L, JpegConstants.COM_MARKER));
                    try {
                        builder.append(str);
                        builder.pop(pushStyle);
                        String str3 = installedServiceAppletTileContentModel.brief;
                        if (str3 == null) {
                            InstalledServiceAppletTileContentModel.BriefState.Loaded loaded = briefState instanceof InstalledServiceAppletTileContentModel.BriefState.Loaded ? (InstalledServiceAppletTileContentModel.BriefState.Loaded) briefState : null;
                            String str4 = loaded != null ? loaded.brief : null;
                            if (str4 != null) {
                                str2 = str4;
                            }
                        } else {
                            str2 = str3;
                        }
                        if (str.length() > 0 && str2.length() > 0) {
                            builder.append(" ");
                        }
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        pushStyle = builder.pushStyle(SpanStyle.m973copyGSF8kmg$default(spanStyle, colors2.semantic.text.standard, null, 0L, JpegConstants.COM_MARKER));
                        try {
                            builder.append(str2);
                            builder.pop(pushStyle);
                            AnnotatedString annotatedString = builder.toAnnotatedString();
                            gapComposer.end(false);
                            if (StringsKt.isBlank(annotatedString)) {
                                num = 6;
                                z4 = z7;
                                gapComposer = gapComposer;
                                z5 = true;
                                z6 = false;
                                companion = companion2;
                                gapComposer.startReplaceGroup(-782822615);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-782866821);
                                gapComposer = gapComposer;
                                num = 6;
                                z4 = z7;
                                z5 = true;
                                z6 = false;
                                companion = companion2;
                                Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, annotatedString, (TextStyle) null, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                                gapComposer.end(false);
                            }
                            gapComposer.end(z6);
                        } finally {
                        }
                    } finally {
                    }
                }
                if (z4 && visualPosition == InstalledServiceAppletTileLayoutConfig.VisualPosition.END) {
                    gapComposer.startReplaceGroup(-579437975);
                    Function3 function32 = installedServiceAppletTileContentModel.visual;
                    if (function32 == null) {
                        gapComposer.startReplaceGroup(-782708040);
                        gapComposer.end(z6);
                    } else {
                        gapComposer.startReplaceGroup(-782708039);
                        RowScopeInstance rowScopeInstance3 = rowScopeInstance;
                        SpacerKt.Spacer(gapComposer, rowScopeInstance3.weight(1.0f, companion, z5));
                        SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 12.0f));
                        function32.invoke(rowScopeInstance3, gapComposer, num);
                        gapComposer.end(z6);
                    }
                    gapComposer.end(z6);
                } else {
                    gapComposer.startReplaceGroup(-782563703);
                    gapComposer.end(z6);
                }
                gapComposer.end(z5);
                z3 = z4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new PasscodeKt$$ExternalSyntheticLambda2(installedServiceAppletTileContentModel, visualPosition, z3, i, i2, 3);
                return;
            }
            return;
        }
        z2 = z;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0081  */
    /* renamed from: LoadingAppletTile-WH-ejsw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3605LoadingAppletTileWHejsw(InstalledAppletTileHeaderModel installedAppletTileHeaderModel, ComposableLambdaImpl composableLambdaImpl, Function0 function0, boolean z, float f, LoadingAppletTileLayoutConfig loadingAppletTileLayoutConfig, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        float f2;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier;
        int i4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1886800544);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer.changed(installedAppletTileHeaderModel) : gapComposer.changedInstance(installedAppletTileHeaderModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    f2 = f;
                    if (gapComposer.changed(f2)) {
                        i4 = 16384;
                        i3 |= i4;
                    }
                } else {
                    f2 = f;
                }
                i4 = PKIFailureInfo.certRevoked;
                i3 |= i4;
            } else {
                f2 = f;
            }
            if ((196608 & i) == 0) {
                i3 |= gapComposer.changed(loadingAppletTileLayoutConfig) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                gapComposer.skipToGroupEnd();
            } else {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        f2 = PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.applet_tile_height);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                }
                gapComposer.endDefaults();
                boolean z3 = loadingAppletTileLayoutConfig.wrapContentHeight;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(z3 ? companion : SizeKt.m277height3ABfNKs(companion, f2), 1.0f);
                if (z2) {
                    gapComposer.startReplaceGroup(1438589330);
                    modifier = appletPaddingAndBackground(((i3 >> 3) & 112) | 6, gapComposer, companion, function0);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1438673216);
                    gapComposer.end(false);
                    modifier = companion;
                }
                Modifier then = fillMaxWidth.then(modifier);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
                InstalledAppletTileHeader(installedAppletTileHeaderModel, new CashMapViewKt$$ExternalSyntheticLambda5(loadingAppletTileLayoutConfig, 18), gapComposer, i3 & 14, 0);
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, loadingAppletTileLayoutConfig.headerToContentGap));
                Recorder$$ExternalSyntheticOutline1.m(6 | (i3 & 112), composableLambdaImpl, ColumnScopeInstance.INSTANCE, gapComposer, true);
            }
            boolean z4 = z2;
            float f3 = f2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ProductDetailsPageKt$$ExternalSyntheticLambda4(installedAppletTileHeaderModel, composableLambdaImpl, function0, z4, f3, loadingAppletTileLayoutConfig, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        boolean z42 = z2;
        float f32 = f2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void LoadingBalanceAppletTile(InstalledAppletTileHeaderModel installedAppletTileHeaderModel, Function0 function0, boolean z, Composer composer, int i) {
        int i2;
        LoadingAppletTileLayoutConfig loadingAppletTileLayoutConfig;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(302176058);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(installedAppletTileHeaderModel) : gapComposer.changedInstance(installedAppletTileHeaderModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(z) ? 2048 : 1024;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                gapComposer.startReplaceGroup(-124284592);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                loadingAppletTileLayoutConfig = new LoadingAppletTileLayoutConfig(16.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, true);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-124223181);
                loadingAppletTileLayoutConfig = new LoadingAppletTileLayoutConfig(6.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, false);
                gapComposer.end(false);
            }
            LoadingAppletTileLayoutConfig loadingAppletTileLayoutConfig2 = loadingAppletTileLayoutConfig;
            int i4 = (i2 & 14) | 48;
            int i5 = i2 << 3;
            m3605LoadingAppletTileWHejsw(installedAppletTileHeaderModel, Expect_jvmKt.rememberComposableLambda(482858642, new LoadingBalanceAppletTileKt$$ExternalSyntheticLambda5(loadingAppletTileLayoutConfig2, z, i3), gapComposer), function0, true, RecyclerView.DECELERATION_RATE, loadingAppletTileLayoutConfig2, gapComposer, i4 | (i5 & 896) | (i5 & 7168), 16);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2(installedAppletTileHeaderModel, function0, z, i, 13);
        }
    }

    public static final void LoadingBalanceAppletTileContent(LoadingAppletTileLayoutConfig loadingAppletTileLayoutConfig, boolean z, Composer composer, int i) {
        int i2;
        final long j;
        LoadingBalanceShimmerSpec loadingBalanceShimmerSpec;
        final LoadingAppletTileLayoutConfig loadingAppletTileLayoutConfig2 = loadingAppletTileLayoutConfig;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(142127875);
        int i3 = (gapComposer.changed(loadingAppletTileLayoutConfig2) ? 4 : 2) | i | (gapComposer.changed(z) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            String stringResource = Room.stringResource(gapComposer, R.string.loading_content_description);
            if (ImageKt.isSystemInDarkTheme(gapComposer)) {
                gapComposer.startReplaceGroup(-705975870);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.background.standard;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-705909468);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.background.subtle;
                gapComposer.end(false);
            }
            if (z) {
                gapComposer.startReplaceGroup(-2144910178);
                gapComposer.end(false);
                loadingBalanceShimmerSpec = new LoadingBalanceShimmerSpec(LoadingBalanceShimmerSizes.redesignedRowSpacing, LoadingBalanceShimmerSizes.redesignedPrimary, LoadingBalanceShimmerSizes.redesignedSecondary);
            } else {
                gapComposer.startReplaceGroup(-2144660907);
                long j2 = LoadingBalanceShimmerSizes.legacyPrimary;
                long j3 = LoadingBalanceShimmerSizes.legacySecondary;
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                loadingBalanceShimmerSpec = new LoadingBalanceShimmerSpec(4.0f, j2, j3);
                gapComposer.end(false);
            }
            final LoadingBalanceShimmerSpec loadingBalanceShimmerSpec2 = loadingBalanceShimmerSpec;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m277height3ABfNKs = z ? companion : SizeKt.m277height3ABfNKs(companion, 62.0f);
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ClusterItemKt$$ExternalSyntheticLambda3(stringResource, 9);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m277height3ABfNKs, false, (Function1) rememberedValue);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            final int i4 = 0;
            VisibleKt.ShimmerBox(null, false, null, Expect_jvmKt.rememberComposableLambda(2083066492, new Function3(loadingBalanceShimmerSpec2, loadingAppletTileLayoutConfig2, j, i4) { // from class: com.squareup.cash.money.applets.common.views.LoadingBalanceAppletTileKt$$ExternalSyntheticLambda1
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ LoadingBalanceShimmerSpec f$0;
                public final /* synthetic */ long f$2;

                {
                    this.$r8$classId = i4;
                    this.f$2 = j;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = this.$r8$classId;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    long j4 = this.f$2;
                    LoadingBalanceShimmerSpec loadingBalanceShimmerSpec3 = this.f$0;
                    BoxScope boxScope = (BoxScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i5) {
                        case 0:
                            boxScope.getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m286size6HolHcs(loadingBalanceShimmerSpec3.primarySize, companion2), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), j4, rectangleShapeKt$RectangleShape$1), gapComposer2, 0);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            boxScope.getClass();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m286size6HolHcs(loadingBalanceShimmerSpec3.secondarySize, companion2), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), j4, rectangleShapeKt$RectangleShape$1), gapComposer3, 0);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 3072, 7);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, loadingBalanceShimmerSpec2.rowSpacing));
            final int i5 = 1;
            loadingAppletTileLayoutConfig2 = loadingAppletTileLayoutConfig;
            i2 = 0;
            VisibleKt.ShimmerBox(null, false, null, Expect_jvmKt.rememberComposableLambda(1434545061, new Function3(loadingBalanceShimmerSpec2, loadingAppletTileLayoutConfig2, j, i5) { // from class: com.squareup.cash.money.applets.common.views.LoadingBalanceAppletTileKt$$ExternalSyntheticLambda1
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ LoadingBalanceShimmerSpec f$0;
                public final /* synthetic */ long f$2;

                {
                    this.$r8$classId = i5;
                    this.f$2 = j;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i52 = this.$r8$classId;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    long j4 = this.f$2;
                    LoadingBalanceShimmerSpec loadingBalanceShimmerSpec3 = this.f$0;
                    BoxScope boxScope = (BoxScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i52) {
                        case 0:
                            boxScope.getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m286size6HolHcs(loadingBalanceShimmerSpec3.primarySize, companion2), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), j4, rectangleShapeKt$RectangleShape$1), gapComposer2, 0);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            boxScope.getClass();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m286size6HolHcs(loadingBalanceShimmerSpec3.secondarySize, companion2), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), j4, rectangleShapeKt$RectangleShape$1), gapComposer3, 0);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 3072, 7);
            gapComposer.end(true);
        } else {
            i2 = 0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LoadingBalanceAppletTileKt$$ExternalSyntheticLambda3(loadingAppletTileLayoutConfig2, z, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* renamed from: LoadingServiceAppletTile-942rkJo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3606LoadingServiceAppletTile942rkJo(String str, Function0 function0, float f, boolean z, Composer composer, int i, int i2) {
        float f2;
        boolean z2;
        int i3;
        float f3;
        float f4;
        LoadingAppletTileLayoutConfig loadingAppletTileLayoutConfig;
        int i4;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2057336467);
        int i5 = (gapComposer.changed(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i5 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i2 & 4) == 0) {
                f2 = f;
                if (gapComposer.changed(f2)) {
                    i4 = 256;
                    i5 |= i4;
                }
            } else {
                f2 = f;
            }
            i4 = 128;
            i5 |= i4;
        } else {
            f2 = f;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i3 = i5 | (gapComposer.changed(z2) ? 2048 : 1024);
        }
        int i7 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    f2 = PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.applet_tile_height);
                    i3 &= -897;
                }
                if (i6 != 0) {
                    f4 = f2;
                    z2 = false;
                    gapComposer.endDefaults();
                    if (z2) {
                        gapComposer.startReplaceGroup(927668762);
                        loadingAppletTileLayoutConfig = new LoadingAppletTileLayoutConfig(6.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, false);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(927607351);
                        ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        loadingAppletTileLayoutConfig = new LoadingAppletTileLayoutConfig(16.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, true);
                        gapComposer.end(false);
                    }
                    LoadingAppletTileLayoutConfig loadingAppletTileLayoutConfig2 = loadingAppletTileLayoutConfig;
                    m3605LoadingAppletTileWHejsw(new InstalledAppletTileHeaderModel(str, null, null, 14), Expect_jvmKt.rememberComposableLambda(488618043, new LoadingBalanceAppletTileKt$$ExternalSyntheticLambda5(loadingAppletTileLayoutConfig2, z2, i7), gapComposer), function0, false, f4, loadingAppletTileLayoutConfig2, gapComposer, ((i3 << 3) & 896) | 48 | ((i3 << 6) & 57344), 8);
                    f3 = f4;
                }
            } else {
                gapComposer.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            f4 = f2;
            gapComposer.endDefaults();
            if (z2) {
            }
            LoadingAppletTileLayoutConfig loadingAppletTileLayoutConfig22 = loadingAppletTileLayoutConfig;
            m3605LoadingAppletTileWHejsw(new InstalledAppletTileHeaderModel(str, null, null, 14), Expect_jvmKt.rememberComposableLambda(488618043, new LoadingBalanceAppletTileKt$$ExternalSyntheticLambda5(loadingAppletTileLayoutConfig22, z2, i7), gapComposer), function0, false, f4, loadingAppletTileLayoutConfig22, gapComposer, ((i3 << 3) & 896) | 48 | ((i3 << 6) & 57344), 8);
            f3 = f4;
        } else {
            gapComposer.skipToGroupEnd();
            f3 = f2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AfterpayAppletTile$$ExternalSyntheticLambda7(str, function0, f3, z2, i, i2, 2);
        }
    }

    public static final void LoadingServiceAppletTileContent(final LoadingAppletTileLayoutConfig loadingAppletTileLayoutConfig, boolean z, Composer composer, int i) {
        final LoadingServiceShimmerSpec loadingServiceShimmerSpec;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(417086435);
        int i2 = (gapComposer.changed(loadingAppletTileLayoutConfig) ? 4 : 2) | i | (gapComposer.changed(z) ? 32 : 16);
        final int i3 = 1;
        final int i4 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String stringResource = Room.stringResource(gapComposer, R.string.loading_content_description);
            if (z) {
                gapComposer.startReplaceGroup(176436816);
                gapComposer.end(false);
                loadingServiceShimmerSpec = new LoadingServiceShimmerSpec(LoadingServiceShimmerSizes.redesignedRowSpacing, LoadingServiceShimmerSizes.redesignedPrimary, LoadingServiceShimmerSizes.redesignedSecondary);
            } else {
                gapComposer.startReplaceGroup(176686087);
                long j = LoadingServiceShimmerSizes.legacyPrimary;
                long j2 = LoadingServiceShimmerSizes.legacySecondary;
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                loadingServiceShimmerSpec = new LoadingServiceShimmerSpec(4.0f, j, j2);
                gapComposer.end(false);
            }
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ClusterItemKt$$ExternalSyntheticLambda3(stringResource, 10);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            VisibleKt.ShimmerBox(null, false, null, Expect_jvmKt.rememberComposableLambda(-1936942244, new Function3(loadingServiceShimmerSpec, loadingAppletTileLayoutConfig, i4) { // from class: com.squareup.cash.money.applets.common.views.LoadingServiceAppletTileKt$$ExternalSyntheticLambda3
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ LoadingServiceShimmerSpec f$0;

                {
                    this.$r8$classId = i4;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = this.$r8$classId;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    LoadingServiceShimmerSpec loadingServiceShimmerSpec2 = this.f$0;
                    BoxScope boxScope = (BoxScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i5) {
                        case 0:
                            boxScope.getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m286size6HolHcs(loadingServiceShimmerSpec2.primarySize, companion2), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), SharedUIKt.getPlaceholderBackgroundColor(gapComposer2), rectangleShapeKt$RectangleShape$1), gapComposer2, 0);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            boxScope.getClass();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m286size6HolHcs(loadingServiceShimmerSpec2.secondarySize, companion2), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), SharedUIKt.getPlaceholderBackgroundColor(gapComposer3), rectangleShapeKt$RectangleShape$1), gapComposer3, 0);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 3072, 7);
            if (z) {
                gapComposer.startReplaceGroup(1723382219);
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, loadingServiceShimmerSpec.rowSpacing));
                VisibleKt.ShimmerBox(null, false, null, Expect_jvmKt.rememberComposableLambda(83163361, new Function3(loadingServiceShimmerSpec, loadingAppletTileLayoutConfig, i3) { // from class: com.squareup.cash.money.applets.common.views.LoadingServiceAppletTileKt$$ExternalSyntheticLambda3
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ LoadingServiceShimmerSpec f$0;

                    {
                        this.$r8$classId = i3;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i5 = this.$r8$classId;
                        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                        LoadingServiceShimmerSpec loadingServiceShimmerSpec2 = this.f$0;
                        BoxScope boxScope = (BoxScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        switch (i5) {
                            case 0:
                                boxScope.getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m286size6HolHcs(loadingServiceShimmerSpec2.primarySize, companion2), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), SharedUIKt.getPlaceholderBackgroundColor(gapComposer2), rectangleShapeKt$RectangleShape$1), gapComposer2, 0);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                boxScope.getClass();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m286size6HolHcs(loadingServiceShimmerSpec2.secondarySize, companion2), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), SharedUIKt.getPlaceholderBackgroundColor(gapComposer3), rectangleShapeKt$RectangleShape$1), gapComposer3, 0);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 3072, 7);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1723730101);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LoadingBalanceAppletTileKt$$ExternalSyntheticLambda3(loadingAppletTileLayoutConfig, z, i, i3);
        }
    }

    public static final void PromotedAppletTile(PromotedAppletTileViewModel.Loaded loaded, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Modifier modifier3;
        int i2;
        int i3;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-447700957);
        Applier applier = gapComposer.applier;
        int i4 = i | (gapComposer.changedInstance(loaded) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i4 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier modifier4 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier4);
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
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier4, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier aspectRatio = OffsetKt.aspectRatio(1.0f, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), false);
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(aspectRatio, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(40.0f)), Strings.getColors(gapComposer).surface.money.applet.background, ColorKt.RectangleShape);
            if (function1 != null) {
                gapComposer.startReplaceGroup(-758863179);
                boolean z = (i5 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda4(22, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(modifier4, false, null, null, (Function0) rememberedValue, 15);
                modifier3 = modifier4;
                i2 = 0;
                gapComposer.end(false);
                modifier4 = m183clickableoSLSa3U$default;
            } else {
                modifier3 = modifier4;
                i2 = 0;
                gapComposer.startReplaceGroup(-758862111);
                gapComposer.end(false);
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(m177backgroundbw27NRU.then(modifier4), RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer, i2);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(modifier3, 1.0f), 24.0f, RecyclerView.DECELERATION_RATE, 2);
            Strings.getSizes(gapComposer).getClass();
            Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(m300paddingVpY3zN4$default, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, 7);
            String str = loaded.title;
            Modifier modifier5 = modifier3;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, m302paddingqDBjuR0$default2, Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(modifier5, 0.7f), 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 3056, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(m302paddingqDBjuR0$default3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), Strings.getTypography(gapComposer).headlineSmall, new TextLineBalancing(1), loaded.subtitle, (Map) null, (Function1) null, false);
            Integer num = loaded.imageResource;
            Image image = loaded.image;
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (num != null) {
                gapComposer.startReplaceGroup(2031288025);
                i3 = 0;
                ImageKt.Image(Countries.painterResource(num.intValue(), 0, gapComposer), null, columnScopeInstance.align(columnScopeInstance.weight(1.0f, modifier5, true), horizontal), null, ContentScale.Companion.FillHeight, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 24624, 104);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                i3 = 0;
                if (image != null) {
                    gapComposer.startReplaceGroup(1035365794);
                    RemotePromotedAppletImage(image, columnScopeInstance.align(columnScopeInstance.weight(1.0f, modifier5, true), horizontal), gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1035370899);
                    gapComposer.end(false);
                }
            }
            gapComposer.end(true);
            DBUtil.SpacerWithinSectionMedium(i3, 1, gapComposer, null);
            gapComposer.end(true);
            modifier2 = modifier5;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(modifier2, (Object) loaded, function1, i, 28);
        }
    }

    public static final void RedesignedBalanceLayout(InstalledBalanceAppletTileContentModel installedBalanceAppletTileContentModel, boolean z, InstalledBalanceAppletTileLayoutConfig installedBalanceAppletTileLayoutConfig, Composer composer, int i) {
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1884941756);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(installedBalanceAppletTileContentModel) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changed(installedBalanceAppletTileLayoutConfig) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.Bottom;
            float f = installedBalanceAppletTileLayoutConfig.headerToBalanceGap;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
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
            InstalledBalanceAppletTileContentInner(installedBalanceAppletTileContentModel, z, installedBalanceAppletTileLayoutConfig, gapComposer, (i2 & 896) | (i2 & 14) | 8 | (i2 & 112));
            gapComposer.end(true);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            SpacerKt.Spacer(gapComposer, rowScopeInstance.weight(1.0f, companion, true));
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(companion, installedBalanceAppletTileLayoutConfig.iconSize, RecyclerView.DECELERATION_RATE, 2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomEnd, false);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m279heightInVpY3zN4$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            Function3 function3 = installedBalanceAppletTileContentModel.visual;
            if (function3 == null) {
                gapComposer.startReplaceGroup(-442737651);
                gapComposer.end(false);
                z2 = true;
            } else {
                gapComposer.startReplaceGroup(-442737650);
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, Alignment.Companion.Top, gapComposer, 0);
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, companion);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                function3.invoke(rowScopeInstance, gapComposer, 6);
                z2 = true;
                gapComposer.end(true);
                gapComposer.end(false);
            }
            gapComposer.end(z2);
            gapComposer.end(z2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstalledBalanceAppletTileKt$$ExternalSyntheticLambda0(installedBalanceAppletTileContentModel, z, installedBalanceAppletTileLayoutConfig, i, 1);
        }
    }

    public static final void RemotePromotedAppletImage(Image image, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1759097729);
        int i2 = (gapComposer.changedInstance(image) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            modifier2 = modifier;
            AsyncImageKt.m1443SubcomposeAsyncImageQgsmV_s(ThemablesKt.urlForTheme(image, gapComposer), null, (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader), modifier2, Alignment.Companion.Center, ContentScale.Companion.FillHeight, lambda$1993075105, gapComposer, ((i2 << 6) & 7168) | 14155824, 3888);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TagHeroBackgroundKt$$ExternalSyntheticLambda1(i, i3, modifier2, image);
        }
    }

    public static final void SharedVisualServiceLayout(int i, Composer composer, InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig, List list, Function2 function2, boolean z) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(554642219);
        Applier applier = gapComposer.applier;
        int i2 = (i & 6) == 0 ? (gapComposer.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(installedServiceAppletTileLayoutConfig) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 2048 : 1024;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            float f = z ? installedServiceAppletTileLayoutConfig.headerToContentGap : RecyclerView.DECELERATION_RATE;
            BiasAlignment.Vertical vertical = installedServiceAppletTileLayoutConfig.contentVerticalAlignment;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
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
            gapComposer.startReplaceGroup(-894387450);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                InstalledServiceAppletTileContentModel installedServiceAppletTileContentModel = (InstalledServiceAppletTileContentModel) obj;
                Modifier.Companion companion2 = companion;
                InstalledServiceAppletTileItem(installedServiceAppletTileContentModel, InstalledServiceAppletTileLayoutConfig.VisualPosition.START, false, gapComposer, 440, 0);
                if (i4 != CollectionsKt__CollectionsKt.getLastIndex(list)) {
                    gapComposer.startReplaceGroup(1201230840);
                    re$$ExternalSyntheticOutline0.m(companion2, installedServiceAppletTileLayoutConfig.contentRowGap, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(1201320213);
                    gapComposer.end(false);
                }
                companion = companion2;
                i4 = i5;
            }
            gapComposer.end(false);
            gapComposer.end(true);
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 12.0f));
            Recorder$$ExternalSyntheticOutline1.m((i3 >> 9) & 14, function2, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstalledServiceAppletTileKt$$ExternalSyntheticLambda1(list, z, installedServiceAppletTileLayoutConfig, function2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005a  */
    /* renamed from: ZeroBalanceIcon-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3607ZeroBalanceIconaMcp0Q(Icons icons, long j, float f, Composer composer, int i, int i2) {
        int i3;
        float f2;
        float f3;
        RecomposeScopeImpl endRestartGroup;
        icons.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1159954377);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(icons.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(j) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            f2 = f;
            i3 |= gapComposer.changed(f2) ? 256 : 128;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
                gapComposer.skipToGroupEnd();
                f3 = f2;
            } else {
                float f4 = i4 != 0 ? 60.0f : f2;
                BiasAlignment biasAlignment = Alignment.Companion.Center;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, f4);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Object obj = DefaultSizes.border.annotationsMap;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m285size3ABfNKs, 1.0f, colors.surface.money.applet.data.inactive.border, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f4));
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m178borderxT4_qwU);
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
                Trace.m1191Iconww6aTOc(icons, (String) null, SizeKt.m285size3ABfNKs(companion, 24.0f), j, gapComposer, (i3 & 14) | 432 | ((i3 << 6) & 7168), 0);
                gapComposer.end(true);
                f3 = f4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new SharedUIKt$$ExternalSyntheticLambda0(icons, j, f3, i, i2, 0);
                return;
            }
            return;
        }
        f2 = f;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final Modifier appletPaddingAndBackground(int i, Composer composer, Modifier modifier, Function0 function0) {
        modifier.getClass();
        Strings.getSizes(composer).getClass();
        Object obj = DefaultSizes.border.entries;
        Modifier clip = ClipKt.clip(modifier, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
        Modifier modifier2 = Modifier.Companion.$$INSTANCE;
        if (function0 != null) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-745924360);
            modifier2 = ImageKt.m183clickableoSLSa3U$default(modifier2, false, null, null, PlatformKt.withHaptics(function0, null, gapComposer, (i >> 3) & 14, 1), 15);
            gapComposer.end(false);
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-745851293);
            gapComposer2.end(false);
        }
        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip.then(modifier2), Strings.getColors(composer).surface.money.applet.background, ColorKt.RectangleShape);
        Strings.getSizes(composer).getClass();
        DefaultSizes.spacing.getClass();
        Strings.getSizes(composer).getClass();
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(composer, R.dimen.applet_tile_row_top_padding);
        Strings.getSizes(composer).getClass();
        return SpacerKt.m301paddingqDBjuR0(m177backgroundbw27NRU, 16.0f, dimensionResource, 16.0f, 16.0f);
    }

    public static final Modifier clickableWithHaptics(int i, Composer composer, Modifier modifier, Function0 function0) {
        Modifier modifier2 = Modifier.Companion.$$INSTANCE;
        if (function0 != null) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(913312589);
            modifier2 = ImageKt.m183clickableoSLSa3U$default(modifier2, false, null, null, PlatformKt.withHaptics(function0, null, gapComposer, (i >> 3) & 14, 1), 15);
            gapComposer.end(false);
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(913381688);
            gapComposer2.end(false);
        }
        return modifier.then(modifier2);
    }

    public static final long getPlaceholderBackgroundColor(GapComposer gapComposer) {
        if (ImageKt.isSystemInDarkTheme(gapComposer)) {
            gapComposer.startReplaceGroup(-535675987);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.standard;
            gapComposer.end(false);
            return j;
        }
        gapComposer.startReplaceGroup(-535613553);
        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors2 == null) {
            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        long j2 = colors2.semantic.background.subtle;
        gapComposer.end(false);
        return j2;
    }

    public static final void LoadingBalanceAppletTile(String str, Function0 function0, boolean z, boolean z2, Composer composer, int i) {
        int i2;
        boolean z3;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-938019837);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (gapComposer.changedInstance(function0) ? 32 : 16) | MLKEMEngine.KyberPolyBytes | (gapComposer.changed(z2) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            LoadingBalanceAppletTile(new InstalledAppletTileHeaderModel(str, null, null, 14), function0, z2, gapComposer, i3 & 8176);
            z3 = true;
        } else {
            gapComposer.skipToGroupEnd();
            z3 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LoadingBalanceAppletTileKt$$ExternalSyntheticLambda4(str, function0, z3, z2, i);
        }
    }
}
