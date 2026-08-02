package com.squareup.cash.blockers.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.FilesetUploadErrorViewModel;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class ArcadeFilesetUploadErrorDialogView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFilesetUploadErrorDialogView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(FilesetUploadErrorViewModel filesetUploadErrorViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-752272092);
        int i2 = (gapComposer.changedInstance(filesetUploadErrorViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (filesetUploadErrorViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1866479889, new SetPinViewKt$$ExternalSyntheticLambda2(8, (Object) filesetUploadErrorViewModel, (Object) function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BirthdayView$$ExternalSyntheticLambda0(this, filesetUploadErrorViewModel, function1, i, 5);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((FilesetUploadErrorViewModel) obj, function1, gapComposer, 0);
    }
}
