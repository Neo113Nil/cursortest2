package androidx.core.util;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DatePickerKt$IconButtonWithTooltip$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.Room;
import app.cash.local.views.toolbar.LocalToolbarKt$$ExternalSyntheticLambda0;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda38;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.memory.RealWeakMemoryCache;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.applets.common.views.InstalledBalanceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel;
import com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel$Metadata$Default;
import com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda0;
import com.squareup.cash.retro.views.RetroUiFactory$$ExternalSyntheticLambda3;
import com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClasses$$Lambda$2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.slf4j.Marker;

/* loaded from: classes3.dex */
public abstract class TypedValueCompat {
    public static final void InstalledUI(SavingsAppletTileViewModel.Installed installed, AppletTile.AppletTileAppearance appletTileAppearance, Function0 function0, Composer composer, int i) {
        InstalledBalanceAppletTileLayoutConfig installedBalanceAppletTileLayoutConfig;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1705052811);
        int i2 = i | (gapComposer.changed(installed) ? 4 : 2) | (gapComposer.changed(appletTileAppearance) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String str = (String) appletTileAppearance.obfuscationMask.invoke(installed.getFormattedBalance());
            if (appletTileAppearance.useRedesignedTiles) {
                gapComposer.startReplaceGroup(1350152428);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                installedBalanceAppletTileLayoutConfig = new InstalledBalanceAppletTileLayoutConfig(16.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, true, 64.0f);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1350222767);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                installedBalanceAppletTileLayoutConfig = new InstalledBalanceAppletTileLayoutConfig(8.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, false, 60.0f);
                gapComposer.end(false);
            }
            InstalledBalanceAppletTileLayoutConfig installedBalanceAppletTileLayoutConfig2 = installedBalanceAppletTileLayoutConfig;
            SharedUIKt.InstalledBalanceAppletTile(new InstalledAppletTileHeaderModel(installed.getTitle(), null, null, 14), new InstalledBalanceAppletTileContentModel(str, installed.getRawBalance(), new InstalledBalanceAppletTileContentModel$Metadata$Default(installed.getSubtitle()), Expect_jvmKt.rememberComposableLambda(-1825823778, new ShareSheetViewKt$$ExternalSyntheticLambda1(15, installed, installedBalanceAppletTileLayoutConfig2), gapComposer), 4), !Intrinsics.areEqual(str, installed.getFormattedBalance()), function0, false, installedBalanceAppletTileLayoutConfig2, gapComposer, 64 | ((i2 << 3) & 7168));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(installed, appletTileAppearance, function0, i, 21);
        }
    }

    /* renamed from: SavingsVisual-ziNgDLE, reason: not valid java name */
    public static final void m1100SavingsVisualziNgDLE(SavingsAppletTileViewModel.Installed installed, float f, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1345872916);
        int i2 = 4;
        int i3 = (gapComposer.changed(installed) ? 4 : 2) | i | (gapComposer.changed(f) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1397166450, new TrackRowKt$$ExternalSyntheticLambda0(f, 8), gapComposer);
            if (installed instanceof SavingsAppletTileViewModel.Installed.GoalSet) {
                gapComposer.startReplaceGroup(-1380017558);
                List list = ((SavingsAppletTileViewModel.Installed.GoalSet) installed).goalIconIds;
                if (list.isEmpty()) {
                    gapComposer.startReplaceGroup(-1380017961);
                    rememberComposableLambda.invoke((Object) gapComposer, (Object) 6);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1379942786);
                    final int size = list.size() <= 2 ? 0 : list.size() - 1;
                    RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache(1);
                    gapComposer.startReplaceGroup(-744819520);
                    boolean changedInstance = gapComposer.changedInstance(installed);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new KClasses$$Lambda$2(installed, 19);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(f / (-3.0f), true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 0);
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
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer.startReplaceGroup(332869544);
                    Iterator it = CollectionsKt.take(list, list.size() - size).iterator();
                    while (it.hasNext()) {
                        m1101SavingsVisualCircleuFdPcIQ(realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, RoundedCornerShapeKt.CircleShape, 3.0f), f, Expect_jvmKt.rememberComposableLambda(783245770, new DatePickerKt$IconButtonWithTooltip$1((String) it.next(), i2), gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
                    }
                    gapComposer.end(false);
                    if (size > 0) {
                        gapComposer.startReplaceGroup(1729351362);
                        m1101SavingsVisualCircleuFdPcIQ(realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, RoundedCornerShapeKt.CircleShape, 3.0f), f, Expect_jvmKt.rememberComposableLambda(1979801791, new Function3() { // from class: com.squareup.cash.savings.applets.views.SavingsAppletTileKt$SavingsVisual$1$2$2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Number) obj3).intValue();
                                ((BoxScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(size, Marker.ANY_NON_NULL_MARKER);
                                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1762997739);
                                        gapComposer2.end(false);
                                    }
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.subtle, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, m, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1729752099);
                        gapComposer.end(false);
                    }
                    Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, false, false);
                }
                gapComposer.end(false);
            } else {
                if (!(installed instanceof SavingsAppletTileViewModel.Installed.NoGoalSet)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -598706994, false);
                }
                gapComposer.startReplaceGroup(-1378691781);
                rememberComposableLambda.invoke((Object) gapComposer, (Object) 6);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalToolbarKt$$ExternalSyntheticLambda0(installed, f, i);
        }
    }

    /* renamed from: SavingsVisualCircle-uFdPcIQ, reason: not valid java name */
    public static final void m1101SavingsVisualCircleuFdPcIQ(Modifier modifier, float f, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-536036301);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changed(f) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(modifier, f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.annotationsMap;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m285size3ABfNKs, 1.0f, colors.surface.money.applet.data.inactive.border, RoundedCornerShapeKt.CircleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
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
            composableLambdaImpl.invoke(BoxScopeInstance.INSTANCE, (Object) gapComposer, (Object) 54);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda38(modifier, f, composableLambdaImpl, i, 7);
        }
    }

    public static final void UninstalledUI(SavingsAppletTileViewModel.Uninstalled uninstalled, Function0 function0, Composer composer, int i) {
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-739409157);
        int i2 = (gapComposer.changed(uninstalled) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            function02 = function0;
            SharedUIKt.AppletTileRowUninstalledContent(2131233413, (i2 << 6) & 7168, gapComposer, uninstalled.title, uninstalled.subtitle, function02);
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda0(uninstalled, function02, i, 10);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewShopCategory.deepLinkSpecs;
    }

    public static int getUnitFromComplexDimension(int i) {
        return i & 15;
    }
}
