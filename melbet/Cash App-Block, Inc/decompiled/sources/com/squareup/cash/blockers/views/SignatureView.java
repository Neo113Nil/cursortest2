package com.squareup.cash.blockers.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cash.blockers.viewmodels.SignatureViewModel;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.ui.LandscapeOrientation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class SignatureView extends ComposeUiView implements LandscapeOrientation {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignatureView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(SignatureViewModel signatureViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-689779001);
        int i2 = (gapComposer.changedInstance(signatureViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (signatureViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(800938626, new SignatureView$$ExternalSyntheticLambda0(function1, signatureViewModel, this), gapComposer), gapComposer, 6);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SignatureView$$ExternalSyntheticLambda0(this, signatureViewModel, function1, i);
        }
    }

    public final void setSignatureState(SignatureState signatureState) {
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((SignatureViewModel) obj, function1, gapComposer, 0);
    }
}
