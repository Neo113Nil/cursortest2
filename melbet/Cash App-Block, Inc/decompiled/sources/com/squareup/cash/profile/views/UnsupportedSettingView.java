package com.squareup.cash.profile.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.account.settings.viewmodels.UnsupportedSettingViewModel;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class UnsupportedSettingView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedSettingView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(UnsupportedSettingViewModel unsupportedSettingViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(205076990);
        int i2 = (gapComposer.changedInstance(unsupportedSettingViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (unsupportedSettingViewModel != null) {
            gapComposer.startReplaceGroup(2005252254);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda0(22, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1442198888, new ErrorView$$ExternalSyntheticLambda0(16, (Object) unsupportedSettingViewModel, function1), gapComposer), gapComposer, 3072, 7);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(2005381028);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(this, unsupportedSettingViewModel, function1, i, 7);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((UnsupportedSettingViewModel) obj, function1, gapComposer, 0);
    }
}
