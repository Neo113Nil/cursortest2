package com.squareup.cash.datefilterbar.views;

import android.content.res.Configuration;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class DateFilterBarShimmerKt {
    public static final long smallBoxWidth = Room.getSp(64);
    public static final long bigBoxWidth = Room.getSp(116);

    public static final void DateFilterBarShimmer(int i, int i2, Composer composer, Modifier modifier) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-974086746);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            modifier3 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            float f = ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenWidthDp / 2;
            long j = bigBoxWidth;
            float mo231toDpGaN1DYA = f - (density.mo231toDpGaN1DYA(j) / 2.0f);
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, false, new StreamSharing$$ExternalSyntheticLambda1(Alignment.Companion.End, 18));
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, mo231toDpGaN1DYA, RecyclerView.DECELERATION_RATE, 11);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(m302paddingqDBjuR0$default, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 54);
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
            m3517ShimmerItem8XLLXH4(0L, 0L, RecyclerView.DECELERATION_RATE, gapComposer, 0, 7);
            m3517ShimmerItem8XLLXH4(0L, 0L, RecyclerView.DECELERATION_RATE, gapComposer, 0, 7);
            m3517ShimmerItem8XLLXH4(j, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).numeralSmall.spanStyle.fontSize, RecyclerView.DECELERATION_RATE, gapComposer, 390, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SnackbarHostKt$$ExternalSyntheticLambda3(modifier3, i, i2, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0051  */
    /* renamed from: ShimmerItem-8XLLXH4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3517ShimmerItem8XLLXH4(long j, long j2, float f, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        int i4;
        int i5;
        float f2;
        final long j4;
        final long j5;
        final float f3;
        RecomposeScopeImpl endRestartGroup;
        long j6;
        long j7;
        int i6;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-817044489);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            j3 = j2;
            if (gapComposer.changed(j3)) {
                i4 = 32;
                i5 = i3 | i4;
                if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
                    if ((i2 & 4) == 0) {
                        f2 = f;
                        if (gapComposer.changed(f2)) {
                            i6 = 256;
                            i5 |= i6;
                        }
                    } else {
                        f2 = f;
                    }
                    i6 = 128;
                    i5 |= i6;
                } else {
                    f2 = f;
                }
                if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) == 146)) {
                    gapComposer.skipToGroupEnd();
                    j4 = j;
                    j5 = j3;
                    f3 = f2;
                } else {
                    gapComposer.startDefaults();
                    if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        j6 = i7 != 0 ? smallBoxWidth : j;
                        j7 = (i2 & 2) != 0 ? ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).buttonCompact.paragraphStyle.lineHeight : j3;
                        if ((i2 & 4) != 0) {
                            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            DefaultSizes.spacing.getClass();
                            f2 = 16.0f;
                        }
                    } else {
                        gapComposer.skipToGroupEnd();
                        j6 = j;
                        j7 = j3;
                    }
                    gapComposer.endDefaults();
                    final long j8 = j6;
                    final long j9 = j7;
                    final float f4 = f2;
                    VisibleKt.ShimmerBox(null, false, null, Expect_jvmKt.rememberComposableLambda(-209243866, new Function3() { // from class: com.squareup.cash.datefilterbar.views.DateFilterBarShimmerKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((BoxScope) obj).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.m287sizeVpY3zN4(Modifier.Companion.$$INSTANCE, density.mo231toDpGaN1DYA(j8), density.mo231toDpGaN1DYA(j9)), f4, RecyclerView.DECELERATION_RATE, 2);
                                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                long j10 = colors.semantic.background.subtle;
                                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                Object obj4 = DefaultSizes.border.entries;
                                BoxKt.Box(ImageKt.m177backgroundbw27NRU(m300paddingVpY3zN4$default, j10, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f)), gapComposer2, 0);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 3072, 7);
                    f3 = f4;
                    j5 = j7;
                    j4 = j6;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.datefilterbar.views.DateFilterBarShimmerKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            DateFilterBarShimmerKt.m3517ShimmerItem8XLLXH4(j4, j5, f3, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            j3 = j2;
        }
        i4 = 16;
        i5 = i3 | i4;
        if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
