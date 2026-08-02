package com.squareup.cash.paymentpad.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.paychecks.views.HelpSheetView$$ExternalSyntheticLambda0;
import com.squareup.cash.paychecks.views.PaycheckCirclesKt$$ExternalSyntheticLambda3;
import com.squareup.cash.paymentpad.viewmodels.LowDiskSpaceAlertViewModel$Main;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class LowDiskSpaceAlertDialog extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LowDiskSpaceAlertDialog(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(LowDiskSpaceAlertViewModel$Main lowDiskSpaceAlertViewModel$Main, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1261836136);
        int i2 = (gapComposer.changedInstance(lowDiskSpaceAlertViewModel$Main) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (lowDiskSpaceAlertViewModel$Main == null) {
            gapComposer.startReplaceGroup(1806695802);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1806695803);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1215437477, new PaycheckCirclesKt$$ExternalSyntheticLambda3(19, lowDiskSpaceAlertViewModel$Main, function1), gapComposer), gapComposer, 3072, 7);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0(this, lowDiskSpaceAlertViewModel$Main, function1, i, 28);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((LowDiskSpaceAlertViewModel$Main) obj, function1, gapComposer, 0);
    }
}
