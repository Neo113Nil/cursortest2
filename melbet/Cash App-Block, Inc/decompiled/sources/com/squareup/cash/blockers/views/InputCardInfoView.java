package com.squareup.cash.blockers.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.viewmodels.InputCardInfoViewModel;
import com.squareup.cash.ui.OnTransitionListener;
import com.squareup.cash.ui.SecureScreen;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class InputCardInfoView extends ComposeUiView implements SecureScreen, OnTransitionListener {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputCardInfoView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(InputCardInfoViewModel inputCardInfoViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(737799703);
        int i2 = (gapComposer.changedInstance(inputCardInfoViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (inputCardInfoViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            SsnViewKt.InputCardInfo(inputCardInfoViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BirthdayView$$ExternalSyntheticLambda0(this, inputCardInfoViewModel, function1, i, 24);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((InputCardInfoViewModel) obj, function1, gapComposer, 0);
    }
}
