package com.squareup.cash.blockers.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.viewmodels.BirthdayViewModel;
import com.squareup.cash.ui.OnTransitionListener;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class BirthdayView extends ComposeUiView implements OnTransitionListener {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final FocusRequester focusRequester;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayView(Context context) {
        super(context);
        context.getClass();
        this.focusRequester = new FocusRequester();
    }

    public final void Content(BirthdayViewModel birthdayViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1037158040);
        int i2 = (gapComposer.changedInstance(birthdayViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (birthdayViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            SsnViewKt.Birthday(birthdayViewModel, function1, this.focusRequester, null, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BirthdayView$$ExternalSyntheticLambda0(this, birthdayViewModel, function1, i, 0);
        }
    }

    @Override // com.squareup.cash.ui.OnTransitionListener
    public final void onEnterTransitionFinished() {
        DBUtil.requestFocusCompat(this, this.focusRequester);
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((BirthdayViewModel) obj, function1, gapComposer, 0);
    }
}
