package com.squareup.cash.arcade.components;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import app.cash.local.views.map.LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.components.internal.LocalEnabledStateKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class ModalButtonScope implements ColumnScope {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PrimaryModalButton(Function0 function0, Modifier modifier, boolean z, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        boolean z2;
        boolean z3;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier4;
        boolean booleanValue;
        int i4;
        function0.getClass();
        function3.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1767272686);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
                if ((i2 & 4) == 0) {
                    z2 = z;
                    if (gapComposer.changed(z2)) {
                        i4 = 256;
                        i3 |= i4;
                    }
                } else {
                    z2 = z;
                }
                i4 = 128;
                i3 |= i4;
            } else {
                z2 = z;
            }
            if ((i & 3072) == 0) {
                i3 |= gapComposer.changedInstance(function3) ? 2048 : 1024;
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                z3 = z2;
                modifier3 = modifier2;
            } else {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        booleanValue = ((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                        gapComposer.endDefaults();
                        SizeKt.PrimaryModalButton(function0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier4, 1.0f), booleanValue, null, function3, gapComposer, (i3 & 910) | ((i3 << 3) & 57344));
                        modifier3 = modifier4;
                        z3 = booleanValue;
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier4 = modifier2;
                }
                booleanValue = z2;
                gapComposer.endDefaults();
                SizeKt.PrimaryModalButton(function0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier4, 1.0f), booleanValue, null, function3, gapComposer, (i3 & 910) | ((i3 << 3) & 57344));
                modifier3 = modifier4;
                z3 = booleanValue;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ModalButtonScope$$ExternalSyntheticLambda0(this, function0, modifier3, z3, function3, i, i2, 1);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PrimaryModalButtonDestructive(int i, int i2, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function0 function0, boolean z) {
        int i3;
        Modifier modifier2;
        boolean z2;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier3;
        int i4;
        boolean booleanValue;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1754017282);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= 128;
            }
            if ((i & 3072) == 0) {
                i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                z2 = z;
            } else {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    i4 = i3 & (-897);
                    booleanValue = ((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                } else {
                    gapComposer.skipToGroupEnd();
                    i4 = i3 & (-897);
                    booleanValue = z;
                    modifier3 = modifier2;
                }
                gapComposer.endDefaults();
                SizeKt.PrimaryModalButtonDestructive(function0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier3, 1.0f), booleanValue, null, composableLambdaImpl, gapComposer, (i4 & 910) | ((i4 << 3) & 57344));
                modifier2 = modifier3;
                z2 = booleanValue;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0((Object) this, function0, modifier2, z2, composableLambdaImpl, i, i2, 2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void SecondaryModalButton(Function0 function0, Modifier modifier, boolean z, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        boolean z2;
        boolean z3;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier4;
        boolean booleanValue;
        int i4;
        function0.getClass();
        function3.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(678411488);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
                if ((i2 & 4) == 0) {
                    z2 = z;
                    if (gapComposer.changed(z2)) {
                        i4 = 256;
                        i3 |= i4;
                    }
                } else {
                    z2 = z;
                }
                i4 = 128;
                i3 |= i4;
            } else {
                z2 = z;
            }
            if ((i & 3072) == 0) {
                i3 |= gapComposer.changedInstance(function3) ? 2048 : 1024;
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                z3 = z2;
                modifier3 = modifier2;
            } else {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        booleanValue = ((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                        gapComposer.endDefaults();
                        SizeKt.SecondaryModalButton(function0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier4, 1.0f), booleanValue, null, function3, gapComposer, (i3 & 910) | ((i3 << 3) & 57344));
                        modifier3 = modifier4;
                        z3 = booleanValue;
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier4 = modifier2;
                }
                booleanValue = z2;
                gapComposer.endDefaults();
                SizeKt.SecondaryModalButton(function0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier4, 1.0f), booleanValue, null, function3, gapComposer, (i3 & 910) | ((i3 << 3) & 57344));
                modifier3 = modifier4;
                z3 = booleanValue;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ModalButtonScope$$ExternalSyntheticLambda0(this, function0, modifier3, z3, function3, i, i2, 0);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier align(Modifier modifier, Alignment.Horizontal horizontal) {
        modifier.getClass();
        horizontal.getClass();
        return modifier.then(new HorizontalAlignElement(horizontal));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier weight(float f, Modifier modifier, boolean z) {
        modifier.getClass();
        if (f <= 0.0d) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return modifier.then(new LayoutWeightElement(f, true));
    }
}
