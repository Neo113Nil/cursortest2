package androidx.compose.material;

import androidx.compose.foundation.layout.FixedDpInsets;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.RulerKt;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class ScaffoldKt {
    public static final StaticProvidableCompositionLocal LocalFabPlacement = new StaticProvidableCompositionLocal(new TextKt$$ExternalSyntheticLambda0(4));
    public static final float FabSpacing = 16.0f;

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x003e  */
    /* renamed from: Scaffold-27mzLpw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m502Scaffold27mzLpw(Modifier modifier, ScaffoldState scaffoldState, Function2 function2, Function2 function22, Function3 function3, Function2 function23, int i, boolean z, Shape shape, float f, long j, long j2, long j3, final long j4, long j5, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i2, final int i3, final int i4) {
        Function2 function24;
        int i5;
        int i6;
        long j6;
        GapComposer gapComposer;
        final Modifier modifier2;
        final ScaffoldState scaffoldState2;
        final Function2 function25;
        final Function3 function32;
        final Function2 function26;
        final boolean z2;
        final Shape shape2;
        final float f2;
        final long j7;
        final long j8;
        final Function2 function27;
        final long j9;
        final int i7;
        final long j10;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier3;
        int i8;
        int i9;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1135600301);
        int i10 = i2 | 6;
        if ((i2 & 48) == 0) {
            i10 = i2 | 22;
        }
        int i11 = i4 & 4;
        if (i11 != 0) {
            i10 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            function24 = function2;
            i10 |= gapComposer2.changedInstance(function24) ? 256 : 128;
            i5 = i10 | 920349696;
            int i12 = (i3 & 6) != 0 ? i3 | 2 : i3;
            i6 = i12 | 48;
            if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
                i6 = i12 | EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE;
            }
            if ((i3 & 3072) == 0) {
                i6 |= 1024;
            }
            if ((i3 & 24576) == 0) {
                i6 |= PKIFailureInfo.certRevoked;
            }
            if ((196608 & i3) == 0) {
                i6 |= gapComposer2.changed(j4) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            if ((1572864 & i3) != 0) {
                j6 = j5;
                i6 |= ((i4 & 65536) == 0 && gapComposer2.changed(j6)) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            } else {
                j6 = j5;
            }
            if ((12582912 & i3) == 0) {
                i6 |= gapComposer2.changedInstance(composableLambdaImpl) ? 8388608 : 4194304;
            }
            if (gapComposer2.shouldExecute(i5 & 1, (306783379 & i5) == 306783378 || (4793491 & i6) != 4793490)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                modifier2 = modifier;
                scaffoldState2 = scaffoldState;
                function25 = function22;
                function32 = function3;
                function26 = function23;
                z2 = z;
                shape2 = shape;
                f2 = f;
                j7 = j2;
                j8 = j3;
                function27 = function24;
                j9 = j6;
                i7 = i;
                j10 = j;
            } else {
                gapComposer2.startDefaults();
                if ((i2 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                    DrawerValue drawerValue = DrawerValue.Closed;
                    DrawerState rememberDrawerState = DrawerKt.rememberDrawerState(gapComposer2);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    Object obj = Composer.Companion.Empty;
                    if (rememberedValue == obj) {
                        rememberedValue = new SnackbarHostState();
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    SnackbarHostState snackbarHostState = (SnackbarHostState) rememberedValue;
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == obj) {
                        rememberedValue2 = new ScaffoldState(rememberDrawerState, snackbarHostState);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    ScaffoldState scaffoldState3 = (ScaffoldState) rememberedValue2;
                    int i13 = i5 & (-113);
                    if (i11 != 0) {
                        function24 = CardKt.lambda$566090785;
                    }
                    ComposableLambdaImpl composableLambdaImpl2 = CardKt.f8lambda$1624772335;
                    ComposableLambdaImpl composableLambdaImpl3 = CardKt.lambda$939725476;
                    ComposableLambdaImpl composableLambdaImpl4 = CardKt.f7lambda$1341284559;
                    CornerBasedShape cornerBasedShape = ((Shapes) gapComposer2.consume(ShapesKt.LocalShapes)).large;
                    float f3 = DrawerDefaults.Elevation;
                    long m486getSurface0d7_KjU = ((Colors) gapComposer2.consume(ColorsKt.LocalColors)).m486getSurface0d7_KjU();
                    long m488contentColorForek8zF_U = ColorsKt.m488contentColorForek8zF_U(m486getSurface0d7_KjU, gapComposer2);
                    long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(0.32f, ((Colors) gapComposer2.consume(ColorsKt.LocalColors)).m484getOnSurface0d7_KjU(), 14);
                    int i14 = i6 & (-65423);
                    int i15 = i4 & 65536;
                    modifier3 = Modifier.Companion.$$INSTANCE;
                    if (i15 != 0) {
                        j10 = m486getSurface0d7_KjU;
                        i8 = i6 & (-3735439);
                        shape2 = cornerBasedShape;
                        z2 = true;
                        j8 = m675copywmQWz5c$default;
                        function27 = function24;
                        scaffoldState2 = scaffoldState3;
                        i7 = 2;
                        f2 = f3;
                        i9 = i13;
                        j9 = ColorsKt.m488contentColorForek8zF_U(j4, gapComposer2);
                        function32 = composableLambdaImpl3;
                        function26 = composableLambdaImpl4;
                        j7 = m488contentColorForek8zF_U;
                        gapComposer = gapComposer2;
                        function25 = composableLambdaImpl2;
                    } else {
                        i8 = i14;
                        function32 = composableLambdaImpl3;
                        function26 = composableLambdaImpl4;
                        shape2 = cornerBasedShape;
                        j7 = m488contentColorForek8zF_U;
                        z2 = true;
                        j8 = m675copywmQWz5c$default;
                        gapComposer = gapComposer2;
                        function27 = function24;
                        scaffoldState2 = scaffoldState3;
                        i7 = 2;
                        f2 = f3;
                        function25 = composableLambdaImpl2;
                        i9 = i13;
                        j9 = j6;
                        j10 = m486getSurface0d7_KjU;
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                    int i16 = i5 & (-113);
                    int i17 = i6 & (-65423);
                    if ((i4 & 65536) != 0) {
                        i17 = i6 & (-3735439);
                    }
                    modifier3 = modifier;
                    scaffoldState2 = scaffoldState;
                    z2 = z;
                    shape2 = shape;
                    f2 = f;
                    j7 = j2;
                    j8 = j3;
                    gapComposer = gapComposer2;
                    i9 = i16;
                    i8 = i17;
                    function27 = function24;
                    j9 = j6;
                    function25 = function22;
                    function32 = function3;
                    function26 = function23;
                    i7 = i;
                    j10 = j;
                }
                gapComposer.endDefaults();
                int i18 = i8 << 3;
                modifier2 = modifier3;
                m503Scaffoldu4IkXBM(new FixedDpInsets(), modifier2, scaffoldState2, function27, function25, function32, function26, i7, z2, shape2, f2, j10, j7, j8, j4, j9, composableLambdaImpl, gapComposer, (i9 << 3) & 2147483632, ((i9 >> 27) & 14) | (i18 & 896) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024));
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                        int updateChangedFlags2 = Updater.updateChangedFlags(i3);
                        ScaffoldKt.m502Scaffold27mzLpw(Modifier.this, scaffoldState2, function27, function25, function32, function26, i7, z2, shape2, f2, j10, j7, j8, j4, j9, composableLambdaImpl, (Composer) obj2, updateChangedFlags, updateChangedFlags2, i4);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        function24 = function2;
        i5 = i10 | 920349696;
        if ((i3 & 6) != 0) {
        }
        i6 = i12 | 48;
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((196608 & i3) == 0) {
        }
        if ((1572864 & i3) != 0) {
        }
        if ((12582912 & i3) == 0) {
        }
        if (gapComposer2.shouldExecute(i5 & 1, (306783379 & i5) == 306783378 || (4793491 & i6) != 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: Scaffold-u4IkXBM, reason: not valid java name */
    public static final void m503Scaffoldu4IkXBM(final FixedDpInsets fixedDpInsets, Modifier modifier, final ScaffoldState scaffoldState, final Function2 function2, final Function2 function22, final Function3 function3, final Function2 function23, final int i, final boolean z, final Shape shape, final float f, final long j, final long j2, final long j3, final long j4, final long j5, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i2, final int i3) {
        int i4;
        Function2 function24;
        int i5;
        GapComposer gapComposer;
        final Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(50073903);
        if ((i2 & 6) == 0) {
            i4 = (gapComposer2.changed(fixedDpInsets) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(scaffoldState) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function24 = function2;
            i4 |= gapComposer2.changedInstance(function24) ? 2048 : 1024;
        } else {
            function24 = function2;
        }
        int i6 = i2 & 24576;
        int i7 = PKIFailureInfo.certRevoked;
        if (i6 == 0) {
            i4 |= gapComposer2.changedInstance(function22) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= gapComposer2.changedInstance(function3) ? 131072 : 65536;
        }
        int i8 = i2 & 1572864;
        int i9 = PKIFailureInfo.signerNotTrusted;
        if (i8 == 0) {
            i4 |= gapComposer2.changedInstance(function23) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= gapComposer2.changed(i) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= gapComposer2.changed(false) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= gapComposer2.changedInstance(null) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i10 = i4;
        if ((i3 & 6) == 0) {
            i5 = (gapComposer2.changed(z) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= gapComposer2.changed(shape) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer2.changed(f) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= gapComposer2.changed(j) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            if (gapComposer2.changed(j2)) {
                i7 = 16384;
            }
            i5 |= i7;
        }
        if ((i3 & 196608) == 0) {
            i5 |= gapComposer2.changed(j3) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            if (gapComposer2.changed(j4)) {
                i9 = 1048576;
            }
            i5 |= i9;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= gapComposer2.changed(j5) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= gapComposer2.changedInstance(composableLambdaImpl) ? 67108864 : 33554432;
        }
        if (gapComposer2.shouldExecute(i10 & 1, ((i10 & 306783379) == 306783378 && (38347923 & i5) == 38347922) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i2 & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            boolean z2 = (i10 & 14) == 4;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MutableWindowInsets(fixedDpInsets);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) rememberedValue;
            gapComposer = gapComposer2;
            final Function2 function25 = function24;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1236753028, new Function3() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Modifier modifier3 = (Modifier) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= ((GapComposer) composer2).changed(modifier3) ? 4 : 2;
                    }
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                        MutableWindowInsets mutableWindowInsets2 = MutableWindowInsets.this;
                        boolean changed = gapComposer3.changed(mutableWindowInsets2);
                        FixedDpInsets fixedDpInsets2 = fixedDpInsets;
                        boolean changed2 = changed | gapComposer3.changed(fixedDpInsets2);
                        Object rememberedValue2 = gapComposer3.rememberedValue();
                        if (changed2 || rememberedValue2 == Composer.Companion.Empty) {
                            rememberedValue2 = new Navigator$$ExternalSyntheticLambda0(11, mutableWindowInsets2, fixedDpInsets2);
                            gapComposer3.updateRememberedValue(rememberedValue2);
                        }
                        CardKt.m472SurfaceFjzlyU(OffsetKt.onConsumedWindowInsetsChanged(modifier3, (Function1) rememberedValue2), null, j4, j5, null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-1761194824, new ScaffoldKt$$ExternalSyntheticLambda5(i, function25, composableLambdaImpl, function23, mutableWindowInsets2, function22, function3, scaffoldState), gapComposer3), gapComposer3, 1572864, 50);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            gapComposer.startReplaceGroup(1400739380);
            modifier2 = modifier;
            rememberComposableLambda.invoke(modifier2, gapComposer, Integer.valueOf(((i10 >> 3) & 14) | 48));
            gapComposer.end(false);
        } else {
            gapComposer = gapComposer2;
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i3);
                    ScaffoldKt.m503Scaffoldu4IkXBM(FixedDpInsets.this, modifier2, scaffoldState, function2, function22, function3, function23, i, z, shape, f, j, j2, j3, j4, j5, composableLambdaImpl, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: ScaffoldLayout-i1QSOvI, reason: not valid java name */
    public static final void m504ScaffoldLayouti1QSOvI(int i, int i2, WindowInsets windowInsets, Composer composer, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Function2 function2, Function2 function22, Function2 function23) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(675142332);
        int i3 = i2 | (gapComposer.changed(false) ? 4 : 2) | (gapComposer.changed(i) ? 32 : 16) | (gapComposer.changedInstance(function2) ? 256 : 128) | (gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024) | (gapComposer.changedInstance(function22) ? 131072 : 65536) | (gapComposer.changed(windowInsets) ? 1048576 : PKIFailureInfo.signerNotTrusted) | (gapComposer.changedInstance(function23) ? 8388608 : 4194304);
        if (gapComposer.shouldExecute(i3 & 1, (4793491 & i3) != 4793490)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new ScaffoldKt$ScaffoldLayout$contentPadding$1$1();
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1 = (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) rememberedValue;
            boolean z = ((i3 & 896) == 256) | ((3670016 & i3) == 1048576) | ((458752 & i3) == 131072) | ((i3 & 112) == 32) | ((i3 & 14) == 4) | ((29360128 & i3) == 8388608) | ((i3 & 7168) == 2048);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                ScaffoldKt$$ExternalSyntheticLambda5 scaffoldKt$$ExternalSyntheticLambda5 = new ScaffoldKt$$ExternalSyntheticLambda5(function2, composableLambdaImpl2, function22, i, windowInsets, scaffoldKt$ScaffoldLayout$contentPadding$1$1, function23, composableLambdaImpl);
                gapComposer.updateRememberedValue(scaffoldKt$$ExternalSyntheticLambda5);
                rememberedValue2 = scaffoldKt$$ExternalSyntheticLambda5;
            }
            RulerKt.SubcomposeLayout((Modifier) null, (Function2) rememberedValue2, gapComposer, 0, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScaffoldKt$$ExternalSyntheticLambda8(i, function2, composableLambdaImpl, composableLambdaImpl2, function22, windowInsets, function23, i2);
        }
    }
}
