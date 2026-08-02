package androidx.core.view;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda17;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda12;
import com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda11;
import com.squareup.cash.score.applets.viewmodels.ScoreAppletTileViewModel;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda4;
import com.squareup.cash.sharesheet.ShareSheetPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda16;
import com.squareup.util.cash.Countries;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class ViewPropertyAnimatorListenerAdapter implements ViewPropertyAnimatorListener {
    public static final void HistoricalScoreGraph(int i, Composer composer, Modifier modifier, List list) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1540463478);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            RoundedCornerShape RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(Alignment.Companion.End, i3)), Alignment.Companion.Bottom, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(1440514208);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                OffsetKt.BoxWithConstraints(SizeKt.fillMaxHeight(SizeKt.m290width3ABfNKs(Modifier.Companion.$$INSTANCE, 12.0f), 1.0f), Alignment.Companion.BottomCenter, false, Expect_jvmKt.rememberComposableLambda(972599029, new MoneyTabUIKt$$ExternalSyntheticLambda12(((Number) it.next()).floatValue(), RoundedCornerShape, 5), gapComposer), gapComposer, 3126, 4);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda17(list, modifier, i, 10, false);
        }
    }

    public static final void InstalledScoreAppletTile(ScoreAppletTileViewModel.Installed installed, Function0 function0, boolean z, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-804679233);
        int i2 = 2;
        int i3 = i | (gapComposer.changedInstance(installed) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            SharedUIKt.InstalledAppletTile(new InstalledAppletTileHeaderModel(installed.title, null, null, 12), Expect_jvmKt.rememberComposableLambda(-773168283, new ButtonGroupKt$$ExternalSyntheticLambda11(installed, 19), gapComposer), function0, false, z ? new ShareSheetPresenter$$ExternalSyntheticLambda0(i2) : new ShareSheetPresenter$$ExternalSyntheticLambda0(3), gapComposer, 48 | ((i3 << 3) & 896), 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda16(installed, function0, z, i, 2);
        }
    }

    public static final void ScoreAppletLemon(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1924108756);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 64.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.annotationsMap;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.m178borderxT4_qwU(m285size3ABfNKs, 1.0f, colors.surface.money.applet.data.inactive.border, RoundedCornerShapeKt.CircleShape), RecyclerView.DECELERATION_RATE, 6.0f, RecyclerView.DECELERATION_RATE, 10.0f, 5);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
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
            ImageKt.Image(Countries.painterResource(2131233415, 0, gapComposer), null, SizeKt.m285size3ABfNKs(companion, 48.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 432, 120);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetPresenter$$ExternalSyntheticLambda0(i, 4);
        }
    }

    public static final void ScoreAppletTile(ScoreAppletTileViewModel scoreAppletTileViewModel, ScoreAppletViewsModule$$ExternalSyntheticLambda1 scoreAppletViewsModule$$ExternalSyntheticLambda1, AppletTile.AppletTileAppearance appletTileAppearance, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1554339927);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(scoreAppletTileViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(scoreAppletViewsModule$$ExternalSyntheticLambda1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(appletTileAppearance) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            SharedUIKt.AppletTileRow(companion, Expect_jvmKt.rememberComposableLambda(959612895, new SheetKt$$ExternalSyntheticLambda5(12, scoreAppletTileViewModel, appletTileAppearance, scoreAppletViewsModule$$ExternalSyntheticLambda1), gapComposer), gapComposer, ((i3 >> 9) & 14) | 48, 0);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(scoreAppletTileViewModel, i, scoreAppletViewsModule$$ExternalSyntheticLambda1, appletTileAppearance, modifier2, 13);
        }
    }

    public static final void UninstalledScoreAppletTile(ScoreAppletTileViewModel.Uninstalled uninstalled, Function0 function0, Composer composer, int i) {
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-761551621);
        int i2 = (gapComposer.changedInstance(uninstalled) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        int i3 = 18;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            function02 = function0;
            SharedUIKt.AppletTileRowUninstalledContent(2131233415, (i2 << 6) & 7168, gapComposer, uninstalled.title, uninstalled.subtitle, function02);
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda0(uninstalled, function02, i, i3);
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.Flow.deepLinkSpecs;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationCancel() {
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationStart() {
    }
}
