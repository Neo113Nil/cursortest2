package app.cash.local.sharedui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LocalComposeUiKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LocalComposeUi(final Object obj, boolean z, boolean z2, boolean z3, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        ComposableLambdaImpl composableLambdaImpl2;
        final boolean z7;
        final boolean z8;
        final boolean z9;
        RecomposeScopeImpl endRestartGroup;
        obj.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-719026659);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer.changed(obj) : gapComposer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z4 = z;
            i3 |= gapComposer.changed(z4) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                z5 = z2;
                i3 |= gapComposer.changed(z5) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z6 = z3;
                    i3 |= gapComposer.changed(z6) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        composableLambdaImpl2 = composableLambdaImpl;
                        i3 |= gapComposer.changedInstance(composableLambdaImpl2) ? 16384 : PKIFailureInfo.certRevoked;
                    } else {
                        composableLambdaImpl2 = composableLambdaImpl;
                    }
                    if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                        gapComposer.skipToGroupEnd();
                        z7 = z4;
                        z8 = z5;
                        z9 = z6;
                    } else {
                        if (i6 != 0) {
                            z4 = false;
                        }
                        boolean z10 = i4 != 0 ? true : z5;
                        boolean z11 = i5 != 0 ? false : z6;
                        ChromeConfigKt.ChromeConfig(z10, (Boolean) null, gapComposer, (i3 >> 6) & 14, 14);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        ArcadeThemeKt.ArcadeTheme(colors, null, null, Expect_jvmKt.rememberComposableLambda(22476018, new LocalComposeUiKt$$ExternalSyntheticLambda1(obj, composableLambdaImpl2, z4, z10, z11), gapComposer), gapComposer, 3072, 6);
                        z7 = z4;
                        z8 = z10;
                        z9 = z11;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new Function2() { // from class: app.cash.local.sharedui.LocalComposeUiKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                LocalComposeUiKt.LocalComposeUi(obj, z7, z8, z9, composableLambdaImpl, (Composer) obj2, Updater.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                z6 = z3;
                if ((i & 24576) != 0) {
                }
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z5 = z2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z6 = z3;
            if ((i & 24576) != 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z4 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z5 = z2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z6 = z3;
        if ((i & 24576) != 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewDirectDepositAccount.deepLinkSpecs;
    }
}
