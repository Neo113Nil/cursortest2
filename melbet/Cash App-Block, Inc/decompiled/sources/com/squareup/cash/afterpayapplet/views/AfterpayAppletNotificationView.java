package com.squareup.cash.afterpayapplet.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletNotificationViewModel;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda4;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class AfterpayAppletNotificationView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayAppletNotificationView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(AfterpayAppletNotificationViewModel afterpayAppletNotificationViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2070734393);
        int i2 = (gapComposer.changedInstance(afterpayAppletNotificationViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (afterpayAppletNotificationViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1643110226, new AtmPickerGridKt$$ExternalSyntheticLambda4(11, afterpayAppletNotificationViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8((Object) this, (Object) afterpayAppletNotificationViewModel, function1, i, 7);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((AfterpayAppletNotificationViewModel) obj, function1, gapComposer, 0);
    }
}
