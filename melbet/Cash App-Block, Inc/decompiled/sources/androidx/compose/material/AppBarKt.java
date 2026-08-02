package androidx.compose.material;

import androidx.compose.foundation.layout.FixedDpInsets;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class AppBarKt {
    public static final Modifier TitleIconModifier;
    public static final Modifier TitleInsetWithoutIcon;
    public static final FixedDpInsets ZeroInsets;

    static {
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        TitleInsetWithoutIcon = SizeKt.m290width3ABfNKs(companion, 12.0f);
        TitleIconModifier = SizeKt.m290width3ABfNKs(SizeKt.fillMaxHeight(companion, 1.0f), 68.0f);
        ZeroInsets = new FixedDpInsets();
    }

    /* renamed from: AppBar-HkEspTQ, reason: not valid java name */
    public static final void m461AppBarHkEspTQ(long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1222317265);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(j2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(paddingValues) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        if (i3 == 0) {
            i2 |= gapComposer2.changed(rectangleShapeKt$RectangleShape$1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(windowInsets) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i & 1572864) == 0) {
            modifier2 = modifier;
            i2 |= gapComposer2.changed(modifier2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            modifier2 = modifier;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changedInstance(composableLambdaImpl) ? 8388608 : 4194304;
        }
        int i4 = 0;
        if (gapComposer2.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            int i5 = i2 << 6;
            gapComposer = gapComposer2;
            CardKt.m472SurfaceFjzlyU(modifier2, rectangleShapeKt$RectangleShape$1, j, j2, null, f, Expect_jvmKt.rememberComposableLambda(-1628734195, new AppBarKt$$ExternalSyntheticLambda2(windowInsets, paddingValues, composableLambdaImpl, i4), gapComposer2), gapComposer, ((i2 >> 18) & 14) | 1572864 | ((i2 >> 9) & 112) | (i5 & 896) | (i5 & 7168) | ((i2 << 9) & 458752), 16);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AppBarKt$$ExternalSyntheticLambda3(j, j2, f, paddingValues, windowInsets, modifier, composableLambdaImpl, i);
        }
    }

    /* renamed from: TopAppBar-Rx1qByU, reason: not valid java name */
    public static final void m462TopAppBarRx1qByU(final ComposableLambdaImpl composableLambdaImpl, final WindowInsets windowInsets, final Modifier modifier, final Function2 function2, final ComposableLambdaImpl composableLambdaImpl2, final long j, final long j2, final float f, Composer composer, final int i) {
        int i2;
        WindowInsets windowInsets2;
        Modifier modifier2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(138090236);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            windowInsets2 = windowInsets;
            i2 |= gapComposer2.changed(windowInsets2) ? 32 : 16;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i2 |= gapComposer2.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(composableLambdaImpl2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(j) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changed(j2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changed(f) ? 8388608 : 4194304;
        }
        int i3 = 0;
        if (gapComposer2.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            int i4 = i2 >> 15;
            int i5 = i2 << 12;
            gapComposer = gapComposer2;
            m461AppBarHkEspTQ(j, j2, f, AppBarDefaults.ContentPadding, windowInsets2, modifier2, Expect_jvmKt.rememberComposableLambda(-2019867954, new AppBarKt$$ExternalSyntheticLambda0(function2, composableLambdaImpl, composableLambdaImpl2, i3), gapComposer2), gapComposer, (i4 & 896) | (i4 & 14) | 12610560 | (i4 & 112) | (458752 & i5) | (i5 & 3670016));
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.material.AppBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AppBarKt.m462TopAppBarRx1qByU(ComposableLambdaImpl.this, windowInsets, modifier, function2, composableLambdaImpl2, j, j2, f, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: TopAppBar-xWeB9-s, reason: not valid java name */
    public static final void m463TopAppBarxWeB9s(ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function2 function2, ComposableLambdaImpl composableLambdaImpl2, long j, long j2, float f, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-350082398);
        int i2 = i | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(function2) ? 256 : 128) | (gapComposer.changed(j) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(j2) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            int i3 = i2 << 3;
            m462TopAppBarRx1qByU(composableLambdaImpl, ZeroInsets, modifier, function2, composableLambdaImpl2, j, j2, f, gapComposer, (i3 & 3670016) | (i3 & 896) | 54 | (i3 & 7168) | 24576 | (458752 & i3) | 12582912);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AppBarKt$$ExternalSyntheticLambda7(composableLambdaImpl, modifier, function2, composableLambdaImpl2, j, j2, f, i);
        }
    }
}
