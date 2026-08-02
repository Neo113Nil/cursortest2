package com.squareup.cash.arcade.components;

import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import app.cash.local.views.map.LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0;
import coil3.size.SizeKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.components.internal.LocalEnabledStateKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class InlineMessageButtonScope implements AdaptiveStackScope {
    public final /* synthetic */ AdaptiveStackScope $$delegate_0;

    public InlineMessageButtonScope(AdaptiveStackScope adaptiveStackScope) {
        adaptiveStackScope.getClass();
        this.$$delegate_0 = adaptiveStackScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PrimaryButton(int i, int i2, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function0 function0, boolean z) {
        int i3;
        Modifier modifier2;
        boolean z2;
        Modifier modifier3;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        boolean booleanValue;
        int i4;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1394184207);
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
                i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= gapComposer.changed(this) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
                z3 = z2;
            } else {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        booleanValue = ((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                        gapComposer.endDefaults();
                        SizeKt.PrimaryModalButton(function0, horizontalWeight(modifier3, 1.0f), booleanValue, null, composableLambdaImpl, gapComposer, (i3 & 910) | ((i3 << 3) & 57344));
                        z3 = booleanValue;
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                booleanValue = z2;
                gapComposer.endDefaults();
                SizeKt.PrimaryModalButton(function0, horizontalWeight(modifier3, 1.0f), booleanValue, null, composableLambdaImpl, gapComposer, (i3 & 910) | ((i3 << 3) & 57344));
                z3 = booleanValue;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0((Object) this, function0, modifier3, z3, composableLambdaImpl, i, i2, 1);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public final void SecondaryButton(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function0 function0, boolean z) {
        Function0 function02;
        int i2;
        Modifier modifier2;
        boolean z2;
        boolean booleanValue;
        int i3;
        Modifier modifier3;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(93231295);
        if ((i & 6) == 0) {
            function02 = function0;
            i2 = (gapComposer.changedInstance(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 = i2 | EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE;
        }
        if ((i & 3072) == 0) {
            i4 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= gapComposer.changed(this) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                int i5 = i4 & (-897);
                booleanValue = ((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                i3 = i5;
                modifier3 = Modifier.Companion.$$INSTANCE;
            } else {
                gapComposer.skipToGroupEnd();
                i3 = i4 & (-897);
                modifier3 = modifier;
                booleanValue = z;
            }
            gapComposer.endDefaults();
            SizeKt.SecondaryModalButton(function02, horizontalWeight(modifier3, 1.0f), booleanValue, null, composableLambdaImpl, gapComposer, (i3 & 910) | ((i3 << 3) & 57344));
            z2 = booleanValue;
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            z2 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(this, function0, modifier2, z2, composableLambdaImpl, i);
        }
    }

    @Override // com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope
    public final Modifier divider() {
        return this.$$delegate_0.divider();
    }

    @Override // com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope
    public final Modifier horizontalWeight(Modifier modifier, float f) {
        modifier.getClass();
        return this.$$delegate_0.horizontalWeight(modifier, f);
    }
}
