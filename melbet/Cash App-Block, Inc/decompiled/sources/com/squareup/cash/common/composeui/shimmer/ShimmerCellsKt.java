package com.squareup.cash.common.composeui.shimmer;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import app.cash.local.views.internal.ProgressBarKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda6;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda7;
import com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ShimmerCellsKt {

    /* renamed from: lambda$-612625851, reason: not valid java name */
    public static final ComposableLambdaImpl f360lambda$612625851 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(12), false, -612625851);

    /* renamed from: lambda$-188536876, reason: not valid java name */
    public static final ComposableLambdaImpl f359lambda$188536876 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(15), false, -188536876);

    /* renamed from: lambda$-1565812670, reason: not valid java name */
    public static final ComposableLambdaImpl f357lambda$1565812670 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(13), false, -1565812670);

    /* renamed from: lambda$-1303956333, reason: not valid java name */
    public static final ComposableLambdaImpl f356lambda$1303956333 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(16), false, -1303956333);
    public static final ComposableLambdaImpl lambda$1346097283 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(14), false, 1346097283);
    public static final ComposableLambdaImpl lambda$738129113 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(15), false, 738129113);
    public static final ComposableLambdaImpl lambda$1162218088 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(17), false, 1162218088);
    public static final ComposableLambdaImpl lambda$2086226604 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(18), false, 2086226604);

    /* renamed from: lambda$-1658552246, reason: not valid java name */
    public static final ComposableLambdaImpl f358lambda$1658552246 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(16), false, -1658552246);

    public static final void PlaceholderText(float f, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1869292652);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            TextStyle textStyle = (TextStyle) gapComposer.consume(ArcadeThemeKt.LocalTextStyle);
            if (textStyle == null) {
                gapComposer.startReplaceGroup(-1093904321);
                textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
            } else {
                gapComposer.startReplaceGroup(-1093905840);
            }
            gapComposer.end(false);
            float mo231toDpGaN1DYA = density.mo231toDpGaN1DYA(textStyle.paragraphStyle.lineHeight);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(companion, mo231toDpGaN1DYA);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs);
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
            Modifier m277height3ABfNKs2 = SizeKt.m277height3ABfNKs(companion, density.mo231toDpGaN1DYA(textStyle.spanStyle.fontSize));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier weight = rowScopeInstance.weight(f, m277height3ABfNKs2, true);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(weight, colors.semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), gapComposer, 0);
            SpacerKt.Spacer(gapComposer, rowScopeInstance.weight(1.0f, companion, true));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TrackRowKt$$ExternalSyntheticLambda0(f, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005e  */
    /* renamed from: ShimmerCellItem-FNF3uiM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3504ShimmerCellItemFNF3uiM(boolean z, boolean z2, long j, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        boolean z4;
        long j2;
        GapComposer gapComposer;
        final boolean z5;
        final boolean z6;
        final long j3;
        RecomposeScopeImpl endRestartGroup;
        long j4;
        boolean z7;
        int i4;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(333803977);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            z3 = z;
        } else if ((i & 6) == 0) {
            z3 = z;
            i3 = (gapComposer2.changed(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z4 = z2;
            i3 |= gapComposer2.changed(z4) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    if (gapComposer2.changed(j2)) {
                        i4 = 256;
                        i3 |= i4;
                    }
                } else {
                    j2 = j;
                }
                i4 = 128;
                i3 |= i4;
            } else {
                j2 = j;
            }
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                z5 = z3;
                z6 = z4;
                j3 = j2;
            } else {
                gapComposer2.startDefaults();
                if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        z3 = true;
                    }
                    boolean z8 = i6 == 0 ? z4 : true;
                    if ((i2 & 4) != 0) {
                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        i3 &= -897;
                        j4 = colors.component.cell.background.f171default;
                    } else {
                        j4 = j2;
                    }
                    z7 = z8;
                } else {
                    gapComposer2.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    z7 = z4;
                    j4 = j2;
                }
                gapComposer2.endDefaults();
                gapComposer = gapComposer2;
                CellDefaultKt.m3388CellActivity6RhP_wg(lambda$1346097283, lambda$1162218088, f358lambda$1658552246, null, null, null, z3 ? f359lambda$188536876 : null, z7 ? f356lambda$1303956333 : null, false, j4, gapComposer, ((i3 << 21) & 1879048192) | 3510, EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
                boolean z9 = z3;
                z6 = z7;
                z5 = z9;
                j3 = j4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: com.squareup.cash.common.composeui.shimmer.ShimmerCellItemKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ShimmerCellsKt.m3504ShimmerCellItemFNF3uiM(z5, z6, j3, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        z4 = z2;
        if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void ShimmerCells(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1452850791);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
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
            m3504ShimmerCellItemFNF3uiM(false, false, 0L, gapComposer, 0, 7);
            m3504ShimmerCellItemFNF3uiM(false, false, 0L, gapComposer, 0, 7);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProgressBarKt$$ExternalSyntheticLambda0(modifier2, i, i2, 6, (byte) 0);
        }
    }
}
