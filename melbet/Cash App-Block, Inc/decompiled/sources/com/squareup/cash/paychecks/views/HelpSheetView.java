package com.squareup.cash.paychecks.views;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.paychecks.viewmodels.HelpSheetViewModel;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class HelpSheetView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpSheetView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(HelpSheetViewModel helpSheetViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1642107037);
        int i2 = (gapComposer.changedInstance(helpSheetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (helpSheetViewModel == null) {
            gapComposer.startReplaceGroup(-333141788);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-333141787);
            HelpSheetViewKt.HelpSheetView(helpSheetViewModel, function1, ImageKt.verticalScroll$default(Modifier.Companion.$$INSTANCE, ImageKt.rememberScrollState(gapComposer), false, 14), gapComposer, i2 & 112);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0(this, helpSheetViewModel, function1, i, 0);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((HelpSheetViewModel) obj, function1, gapComposer, 0);
    }
}
