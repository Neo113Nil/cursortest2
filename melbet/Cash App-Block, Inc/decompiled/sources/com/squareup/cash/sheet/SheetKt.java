package com.squareup.cash.sheet;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.UiScopeKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.overlays.OverlayKt;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class SheetKt {
    public static final StaticProvidableCompositionLocal LocalSheetInOverlayLayer = new StaticProvidableCompositionLocal(new SheetKt$$ExternalSyntheticLambda9(0));
    public static final StaticProvidableCompositionLocal LocalSheetContainerAnimationEnabled = new StaticProvidableCompositionLocal(new SheetKt$$ExternalSyntheticLambda9(0));

    /* JADX WARN: Removed duplicated region for block: B:106:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Sheet(Function0 function0, Modifier modifier, RealSheetState realSheetState, SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight, String str, boolean z, SheetTopCornerBehavior sheetTopCornerBehavior, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        RealSheetState realSheetState2;
        int i4;
        SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight2;
        int i5;
        String str2;
        int i6;
        int i7;
        int i8;
        SheetTopCornerBehavior sheetTopCornerBehavior2;
        Modifier modifier3;
        RealSheetState realSheetState3;
        SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight3;
        String str3;
        boolean z2;
        RecomposeScopeImpl endRestartGroup;
        RealSheetState realSheetState4;
        Modifier modifier4;
        SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight4;
        int i9;
        boolean z3;
        SheetTopCornerBehavior sheetTopCornerBehavior3;
        RealSheetState realSheetState5;
        SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight5;
        Modifier modifier5;
        boolean z4;
        SheetTopCornerBehavior sheetTopCornerBehavior4;
        int i10;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(331105802);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
                if ((i2 & 4) == 0) {
                    realSheetState2 = realSheetState;
                    if (gapComposer.changed(realSheetState2)) {
                        i10 = 256;
                        i3 |= i10;
                    }
                } else {
                    realSheetState2 = realSheetState;
                }
                i10 = 128;
                i3 |= i10;
            } else {
                realSheetState2 = realSheetState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                sheetPeekPosition$FixedHeight2 = sheetPeekPosition$FixedHeight;
                i3 |= gapComposer.changed(sheetPeekPosition$FixedHeight2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    str2 = str;
                    i3 |= gapComposer.changed(str2) ? 16384 : PKIFailureInfo.certRevoked;
                    i6 = 196608 | i3;
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i6 = 1769472 | i3;
                    } else if ((1572864 & i) == 0) {
                        i6 |= gapComposer.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                        i8 = i2 & 128;
                        int i12 = 12582912;
                        if (i8 == 0) {
                            if ((12582912 & i) == 0) {
                                i12 = gapComposer.changed(sheetTopCornerBehavior == null ? -1 : sheetTopCornerBehavior.ordinal()) ? 8388608 : 4194304;
                            }
                            if ((100663296 & i) == 0) {
                                i6 |= gapComposer.changedInstance(composableLambdaImpl) ? 67108864 : 33554432;
                            }
                            if (gapComposer.shouldExecute(i6 & 1, (i6 & 38347923) == 38347922)) {
                                gapComposer.skipToGroupEnd();
                                sheetTopCornerBehavior2 = sheetTopCornerBehavior;
                                modifier3 = modifier2;
                                realSheetState3 = realSheetState2;
                                sheetPeekPosition$FixedHeight3 = sheetPeekPosition$FixedHeight2;
                                str3 = str2;
                                z2 = z;
                            } else {
                                gapComposer.startDefaults();
                                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                                    Modifier modifier6 = i11 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                                    if ((i2 & 4) != 0) {
                                        realSheetState4 = SheetStateKt.rememberSheetState(null, gapComposer, 0, 1);
                                        i6 &= -897;
                                    } else {
                                        realSheetState4 = realSheetState2;
                                    }
                                    if (i4 != 0) {
                                        sheetPeekPosition$FixedHeight2 = null;
                                    }
                                    if (i5 != 0) {
                                        str2 = null;
                                    }
                                    boolean z5 = i7 == 0 ? z : true;
                                    if (i8 != 0) {
                                        modifier4 = modifier6;
                                        sheetTopCornerBehavior3 = SheetTopCornerBehavior.SquareAtStatusBar;
                                        sheetPeekPosition$FixedHeight4 = sheetPeekPosition$FixedHeight2;
                                        str3 = str2;
                                        i9 = i6;
                                        z3 = z5;
                                    } else {
                                        modifier4 = modifier6;
                                        sheetPeekPosition$FixedHeight4 = sheetPeekPosition$FixedHeight2;
                                        str3 = str2;
                                        i9 = i6;
                                        z3 = z5;
                                        sheetTopCornerBehavior3 = sheetTopCornerBehavior;
                                    }
                                } else {
                                    gapComposer.skipToGroupEnd();
                                    if ((i2 & 4) != 0) {
                                        i6 &= -897;
                                    }
                                    sheetTopCornerBehavior3 = sheetTopCornerBehavior;
                                    modifier4 = modifier2;
                                    realSheetState4 = realSheetState2;
                                    sheetPeekPosition$FixedHeight4 = sheetPeekPosition$FixedHeight2;
                                    str3 = str2;
                                    i9 = i6;
                                    z3 = z;
                                }
                                gapComposer.endDefaults();
                                gapComposer.startReplaceGroup(-1566103984);
                                gapComposer.end(false);
                                ChromeConfigKt.ChromeConfig(null, null, null, null, realSheetState4.getSettledPosition() == SheetPosition.Collapsed ? Boolean.FALSE : null, null, str3 != null ? Float.valueOf(1.0f - realSheetState4.getCollapsedContentProgress()) : null, gapComposer, 0, 47);
                                if (((Boolean) gapComposer.consume(LocalSheetInOverlayLayer)).booleanValue()) {
                                    gapComposer.startReplaceGroup(-1565709570);
                                    z4 = z3;
                                    sheetTopCornerBehavior4 = sheetTopCornerBehavior3;
                                    SheetKt$$ExternalSyntheticLambda0 sheetKt$$ExternalSyntheticLambda0 = new SheetKt$$ExternalSyntheticLambda0(function0, modifier4, realSheetState4, sheetPeekPosition$FixedHeight4, str3, sheetTopCornerBehavior4, z4, composableLambdaImpl);
                                    modifier5 = modifier4;
                                    realSheetState5 = realSheetState4;
                                    sheetPeekPosition$FixedHeight5 = sheetPeekPosition$FixedHeight4;
                                    OverlayKt.Overlay(function0, Expect_jvmKt.rememberComposableLambda(2102923177, sheetKt$$ExternalSyntheticLambda0, gapComposer), gapComposer, (i9 & 14) | 48);
                                    gapComposer.end(false);
                                    gapComposer = gapComposer;
                                } else {
                                    boolean z6 = z3;
                                    SheetTopCornerBehavior sheetTopCornerBehavior5 = sheetTopCornerBehavior3;
                                    Modifier modifier7 = modifier4;
                                    realSheetState5 = realSheetState4;
                                    sheetPeekPosition$FixedHeight5 = sheetPeekPosition$FixedHeight4;
                                    gapComposer.startReplaceGroup(-1565331029);
                                    String str4 = str3;
                                    gapComposer = gapComposer;
                                    TheSheet(function0, modifier7, realSheetState5, sheetPeekPosition$FixedHeight5, str4, sheetTopCornerBehavior5, z6, composableLambdaImpl, gapComposer, (65534 & i9) | (458752 & (i9 >> 6)) | (3670016 & i9) | ((i9 >> 3) & 29360128));
                                    modifier5 = modifier7;
                                    z4 = z6;
                                    sheetTopCornerBehavior4 = sheetTopCornerBehavior5;
                                    str3 = str4;
                                    gapComposer.end(false);
                                }
                                boolean z7 = z4;
                                sheetTopCornerBehavior2 = sheetTopCornerBehavior4;
                                z2 = z7;
                                sheetPeekPosition$FixedHeight3 = sheetPeekPosition$FixedHeight5;
                                realSheetState3 = realSheetState5;
                                modifier3 = modifier5;
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda1(function0, modifier3, realSheetState3, sheetPeekPosition$FixedHeight3, str3, z2, sheetTopCornerBehavior2, composableLambdaImpl, i, i2);
                                return;
                            }
                            return;
                        }
                        i6 |= i12;
                        if ((100663296 & i) == 0) {
                        }
                        if (gapComposer.shouldExecute(i6 & 1, (i6 & 38347923) == 38347922)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i8 = i2 & 128;
                    int i122 = 12582912;
                    if (i8 == 0) {
                    }
                    i6 |= i122;
                    if ((100663296 & i) == 0) {
                    }
                    if (gapComposer.shouldExecute(i6 & 1, (i6 & 38347923) == 38347922)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                str2 = str;
                i6 = 196608 | i3;
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                int i1222 = 12582912;
                if (i8 == 0) {
                }
                i6 |= i1222;
                if ((100663296 & i) == 0) {
                }
                if (gapComposer.shouldExecute(i6 & 1, (i6 & 38347923) == 38347922)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            sheetPeekPosition$FixedHeight2 = sheetPeekPosition$FixedHeight;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            str2 = str;
            i6 = 196608 | i3;
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            int i12222 = 12582912;
            if (i8 == 0) {
            }
            i6 |= i12222;
            if ((100663296 & i) == 0) {
            }
            if (gapComposer.shouldExecute(i6 & 1, (i6 & 38347923) == 38347922)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        sheetPeekPosition$FixedHeight2 = sheetPeekPosition$FixedHeight;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        str2 = str;
        i6 = 196608 | i3;
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        int i122222 = 12582912;
        if (i8 == 0) {
        }
        i6 |= i122222;
        if ((100663296 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 38347923) == 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void TheSheet(Function0 function0, Modifier modifier, RealSheetState realSheetState, SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight, String str, SheetTopCornerBehavior sheetTopCornerBehavior, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        AnimatedVisibilityScope animatedVisibilityScope;
        AnimatedVisibilityScope animatedVisibilityScope2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1516334334);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(realSheetState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(sheetPeekPosition$FixedHeight) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(str) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(sheetTopCornerBehavior.ordinal()) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 8388608 : 4194304;
        }
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            if (((Boolean) gapComposer.consume(LocalSheetContainerAnimationEnabled)).booleanValue()) {
                gapComposer.startReplaceGroup(-1349445751);
                animatedVisibilityScope = (AnimatedVisibilityScope) gapComposer.consume(UiScopeKt.LocalContainerAnimatedVisibilityScope);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1349382542);
                gapComposer.end(false);
                animatedVisibilityScope = null;
            }
            if (animatedVisibilityScope == null) {
                gapComposer.startReplaceGroup(-1349349248);
                SheetKt$TheSheet$visibilityScope$1$1$1 sheetKt$TheSheet$visibilityScope$1$1$1 = new SheetKt$TheSheet$visibilityScope$1$1$1(AnimatableKt.updateTransition(EnterExitState.Visible, null, gapComposer, 6, 2), 0);
                gapComposer.end(false);
                animatedVisibilityScope2 = sheetKt$TheSheet$visibilityScope$1$1$1;
            } else {
                gapComposer.startReplaceGroup(1203394192);
                gapComposer.end(false);
                animatedVisibilityScope2 = animatedVisibilityScope;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(324577417, new SheetKt$$ExternalSyntheticLambda2(realSheetState, function0, sheetPeekPosition$FixedHeight, modifier, animatedVisibilityScope2, z, str, sheetTopCornerBehavior, composableLambdaImpl), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda3(function0, modifier, realSheetState, sheetPeekPosition$FixedHeight, str, sheetTopCornerBehavior, z, composableLambdaImpl, i);
        }
    }

    public static final StaticProvidableCompositionLocal getLocalSheetInOverlayLayer() {
        return LocalSheetInOverlayLayer;
    }
}
