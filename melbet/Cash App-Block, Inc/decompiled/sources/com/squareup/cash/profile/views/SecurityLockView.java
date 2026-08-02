package com.squareup.cash.profile.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.account.settings.viewmodels.ProfilePasscodeSectionViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class SecurityLockView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityLockView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(ProfilePasscodeSectionViewModel profilePasscodeSectionViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1843107807);
        int i2 = (gapComposer.changedInstance(profilePasscodeSectionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            if (profilePasscodeSectionViewModel == null) {
                gapComposer.startReplaceGroup(-1162635297);
            } else {
                gapComposer.startReplaceGroup(-1162635296);
                BadgeNameKt.SecurityLock(i2 & 112, gapComposer, null, profilePasscodeSectionViewModel, function1);
            }
            gapComposer.end(false);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda0(16, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(this, profilePasscodeSectionViewModel, function1, i, 0);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((ProfilePasscodeSectionViewModel) obj, function1, gapComposer, 0);
    }
}
