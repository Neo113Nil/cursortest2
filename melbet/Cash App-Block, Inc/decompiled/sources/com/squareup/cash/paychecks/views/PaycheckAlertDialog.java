package com.squareup.cash.paychecks.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.paychecks.viewmodels.PaycheckAlertDialogViewModel;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class PaycheckAlertDialog extends ComposeUiView implements OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaycheckAlertDialog(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(PaycheckAlertDialogViewModel paycheckAlertDialogViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(827747433);
        int i2 = (gapComposer.changedInstance(paycheckAlertDialogViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            if (paycheckAlertDialogViewModel == null) {
                gapComposer.startReplaceGroup(2016655966);
            } else {
                gapComposer.startReplaceGroup(2016655967);
                ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1860904587, new PaycheckCirclesKt$$ExternalSyntheticLambda3(15, paycheckAlertDialogViewModel, function1), gapComposer), gapComposer, 6);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0(this, paycheckAlertDialogViewModel, function1, i, 22);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((PaycheckAlertDialogViewModel) obj, function1, gapComposer, 0);
    }
}
