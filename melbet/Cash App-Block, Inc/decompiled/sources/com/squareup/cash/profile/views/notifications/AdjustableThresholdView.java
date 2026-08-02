package com.squareup.cash.profile.views.notifications;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.navigation.Navigation;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.profile.viewmodels.AdjustableThresholdViewModel;
import com.squareup.cash.profile.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.SecurityLockView$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class AdjustableThresholdView extends ComposeUiView implements OutsideTapCloses, BottomSheetConfig {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdjustableThresholdView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(AdjustableThresholdViewModel adjustableThresholdViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(29180759);
        int i2 = (gapComposer.changedInstance(adjustableThresholdViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (adjustableThresholdViewModel != null) {
            gapComposer.startReplaceGroup(1740741853);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(216054269, new ErrorView$$ExternalSyntheticLambda0(17, (Object) adjustableThresholdViewModel, (Object) function1), gapComposer), gapComposer, 3072, 7);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1741001323);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(this, adjustableThresholdViewModel, function1, i, 9);
        }
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final BottomSheetStyle getBottomSheetStyle() {
        return Navigation.ArcadeBottomSheetStyle(this);
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((AdjustableThresholdViewModel) obj, function1, gapComposer, 0);
    }
}
