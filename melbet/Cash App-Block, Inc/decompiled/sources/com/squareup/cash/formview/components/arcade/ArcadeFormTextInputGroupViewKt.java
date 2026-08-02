package com.squareup.cash.formview.components.arcade;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.payments.views.composer.RotatingTitleIconKt$$ExternalSyntheticLambda2;
import com.squareup.protos.franklin.api.FormBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ArcadeFormTextInputGroupViewKt {
    public static final FormBlocker.Element.TextInputElement.Validation RequiredFieldValidation = new FormBlocker.Element.TextInputElement.Validation(".{1,}", null, null, 6, null);

    public static final void PasswordObfuscationToggleButton(int i, Composer composer, Modifier modifier, Function0 function0, boolean z) {
        Function0 function02;
        Modifier modifier2;
        Icons icons;
        int i2;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(756573931);
        int i4 = (gapComposer.changed(z) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer, 432, 9);
            Role role = new Role(0);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(companion, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, role, function0, 12);
            modifier2 = companion;
            function02 = function0;
            if (z) {
                icons = Icons.SensitiveHidden24;
            } else {
                if (z) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                icons = Icons.SensitiveVisible24;
            }
            if (z) {
                i2 = 1218092849;
                i3 = R.string.show_password;
            } else {
                if (z) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1218091735, false);
                }
                i2 = 1218094641;
                i3 = R.string.hide_password;
            }
            Trace.m1191Iconww6aTOc(icons, re$$ExternalSyntheticOutline0.m(gapComposer, i2, i3, gapComposer, false), m182clickableO2vRcR0$default, 0L, gapComposer, 0, 8);
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RotatingTitleIconKt$$ExternalSyntheticLambda2(z, function02, modifier2, i);
        }
    }
}
