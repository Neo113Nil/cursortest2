package com.squareup.cash.arcade.components.input;

import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import com.squareup.cash.account.components.AccountAvatarKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.internal.LocalEnabledStateKt;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class InputChipGridScope implements FlowRowScope {
    public final /* synthetic */ FlowRowScope $$delegate_0;

    public InputChipGridScope(FlowRowScope flowRowScope) {
        flowRowScope.getClass();
        this.$$delegate_0 = flowRowScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void InputChip(int i, int i2, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, String str, Function0 function0, boolean z, boolean z2) {
        ComposableLambdaImpl composableLambdaImpl2;
        int i3;
        Modifier modifier2;
        String str2;
        boolean z3;
        boolean z4;
        boolean z5;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier3;
        boolean booleanValue;
        int i4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(982987785);
        if ((i & 6) == 0) {
            composableLambdaImpl2 = composableLambdaImpl;
            i3 = (gapComposer.changedInstance(composableLambdaImpl2) ? 4 : 2) | i;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
                str2 = str;
                i3 |= gapComposer.changed(str2) ? 256 : 128;
            } else {
                str2 = str;
            }
            if ((i & 3072) == 0) {
                i3 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                z3 = z;
                i3 |= gapComposer.changed(z3) ? 16384 : PKIFailureInfo.certRevoked;
            } else {
                z3 = z;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    z4 = z2;
                    if (gapComposer.changed(z4)) {
                        i4 = PKIFailureInfo.unsupportedVersion;
                        i3 |= i4;
                    }
                } else {
                    z4 = z2;
                }
                i4 = 65536;
                i3 |= i4;
            } else {
                z4 = z2;
            }
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                gapComposer.skipToGroupEnd();
                z5 = z4;
            } else {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        booleanValue = ((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                        gapComposer.endDefaults();
                        InputChipKt.InputChipBase(composableLambdaImpl2, str2, modifier3, function0, z3, booleanValue, gapComposer, (i3 & 458752) | (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896) | (i3 & 7168) | (57344 & i3));
                        modifier2 = modifier3;
                        z5 = booleanValue;
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    modifier3 = modifier2;
                }
                booleanValue = z4;
                gapComposer.endDefaults();
                InputChipKt.InputChipBase(composableLambdaImpl2, str2, modifier3, function0, z3, booleanValue, gapComposer, (i3 & 458752) | (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896) | (i3 & 7168) | (57344 & i3));
                modifier2 = modifier3;
                z5 = booleanValue;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AccountAvatarKt$$ExternalSyntheticLambda2(this, composableLambdaImpl, modifier2, str, function0, z, z5, i, i2, 2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier align(Modifier modifier, BiasAlignment.Vertical vertical) {
        modifier.getClass();
        return this.$$delegate_0.align(modifier, vertical);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier weight(float f, Modifier modifier, boolean z) {
        modifier.getClass();
        return this.$$delegate_0.weight(f, modifier, z);
    }

    public final void InputChip(String str, Modifier modifier, String str2, Function0 function0, boolean z, boolean z2, Composer composer, int i, int i2) {
        int i3;
        boolean z3;
        boolean z4;
        Modifier modifier2;
        String str3;
        String str4;
        Modifier modifier3;
        boolean booleanValue;
        int i4;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1137104049);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z3 = z;
            i3 |= gapComposer.changed(z3) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            z3 = z;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                z4 = z2;
                if (gapComposer.changed(z4)) {
                    i4 = PKIFailureInfo.unsupportedVersion;
                    i3 |= i4;
                }
            } else {
                z4 = z2;
            }
            i4 = 65536;
            i3 |= i4;
        } else {
            z4 = z2;
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                if (i5 != 0) {
                    modifier = Modifier.Companion.$$INSTANCE;
                }
                str4 = i6 != 0 ? null : str2;
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    booleanValue = ((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                    modifier3 = modifier;
                    gapComposer.endDefaults();
                    InputChipKt.InputChipBase(str, str4, modifier3, function0, z3, booleanValue, gapComposer, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
                    str3 = str4;
                    modifier2 = modifier3;
                    z4 = booleanValue;
                } else {
                    modifier3 = modifier;
                }
            } else {
                gapComposer.skipToGroupEnd();
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
                modifier3 = modifier;
                str4 = str2;
            }
            booleanValue = z4;
            gapComposer.endDefaults();
            InputChipKt.InputChipBase(str, str4, modifier3, function0, z3, booleanValue, gapComposer, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
            str3 = str4;
            modifier2 = modifier3;
            z4 = booleanValue;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            str3 = str2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AccountAvatarKt$$ExternalSyntheticLambda2(this, str, modifier2, str3, function0, z, z4, i, i2, 1);
        }
    }
}
