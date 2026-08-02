package com.squareup.cash.deposits.physical.view.map;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.deposits.physical.viewmodels.map.LimitReachedDialogViewModel;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class LimitReachedModalArcadeKt {
    public static final void LimitReachedModalArcade(LimitReachedDialogViewModel limitReachedDialogViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        limitReachedDialogViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2055067643);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(limitReachedDialogViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-166374714, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(14, limitReachedDialogViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(limitReachedDialogViewModel, function1, i, 7);
        }
    }
}
