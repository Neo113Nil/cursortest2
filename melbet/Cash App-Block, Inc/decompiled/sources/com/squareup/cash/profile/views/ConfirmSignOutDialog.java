package com.squareup.cash.profile.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.profile.viewmodels.ProfileConfirmSignOutViewModel;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class ConfirmSignOutDialog extends ComposeUiView implements OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSignOutDialog(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(ProfileConfirmSignOutViewModel profileConfirmSignOutViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(131613201);
        int i2 = (gapComposer.changedInstance(profileConfirmSignOutViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (profileConfirmSignOutViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1676282980, new ErrorView$$ExternalSyntheticLambda0(5, (Object) profileConfirmSignOutViewModel, (Object) function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1(this, profileConfirmSignOutViewModel, function1, i, 18);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((ProfileConfirmSignOutViewModel) obj, function1, gapComposer, 0);
    }
}
