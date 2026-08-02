package com.squareup.cash.arcade.components;

import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda1;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.Icons;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class ToastActionScope {
    public final Function0 onDismiss;

    public ToastActionScope(Function0 function0) {
        function0.getClass();
        this.onDismiss = function0;
    }

    public final void IconAction(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        int i2;
        Modifier modifier2;
        Icons icons = Icons.NavigationClose;
        str.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-827505189);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(754) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changed(this) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = ((i3 & 896) == 256) | ((57344 & i3) == 16384);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ToastActionScope$$ExternalSyntheticLambda0(function0, this, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            StorageUtil.ButtonIcon(icons, str, (Function0) rememberedValue, companion, false, null, gapComposer, i3 & 7294, 48);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToastActionScope$$ExternalSyntheticLambda1(this, str, function0, modifier2, i, 0);
        }
    }

    public final void TextAction(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        int i2;
        str.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-637461247);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(this) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ToastActionScope$$ExternalSyntheticLambda0(function0, this, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SizeKt.ToastButton((Function0) rememberedValue, false, null, Expect_jvmKt.rememberComposableLambda(-342054177, new LocalHomeViewKt$$ExternalSyntheticLambda1(str, 26), gapComposer), gapComposer, ((i3 >> 3) & 112) | 24576);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToastActionScope$$ExternalSyntheticLambda1(this, str, function0, modifier2, i, 1);
        }
    }
}
