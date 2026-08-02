package androidx.compose.foundation.text;

import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import bo.app.c7$$ExternalSyntheticLambda6;
import com.squareup.cash.common.composeui.IconAnimationViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt$$ExternalSyntheticLambda71;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class AndroidCursorHandle_androidKt {
    public static final float CursorHandleWidth = (25.0f * 2.0f) / 2.4142137f;

    /* renamed from: CursorHandle-USBMPiE, reason: not valid java name */
    public static final void m343CursorHandleUSBMPiE(OffsetProvider offsetProvider, Modifier modifier, long j, Composer composer, int i, int i2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1776202187);
        int i3 = (gapComposer.changed(offsetProvider) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= ((i2 & 4) == 0 && gapComposer.changed(j)) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                i3 &= -897;
                j = 9205357640488583168L;
            }
            gapComposer.endDefaults();
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ObjectList$$ExternalSyntheticLambda0(offsetProvider, 25);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SimpleLayoutKt.HandlePopup(offsetProvider, Alignment.Companion.TopCenter, Expect_jvmKt.rememberComposableLambda(-1653527038, new IconAnimationViewKt$$ExternalSyntheticLambda3(j, SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue)), gapComposer), gapComposer, i4 | 432);
        } else {
            gapComposer.skipToGroupEnd();
        }
        long j2 = j;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FidesmoProvisioningViewKt$$ExternalSyntheticLambda71(offsetProvider, modifier, j2, i, i2);
        }
    }

    public static final void DefaultCursorHandle(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        }
        int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            SpacerKt.Spacer(gapComposer, ClipKt.drawWithCache(SizeKt.m287sizeVpY3zN4(modifier, CursorHandleWidth, 25.0f), new c7$$ExternalSyntheticLambda6(((TextSelectionColors) gapComposer.consume(TextSelectionColorsKt.LocalTextSelectionColors)).handleColor, i5)));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SnackbarHostKt$$ExternalSyntheticLambda3(modifier, i, i2, 1);
        }
    }
}
