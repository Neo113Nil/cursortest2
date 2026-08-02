package com.squareup.cash.profile.views.notifications;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.profile.viewmodels.ContactMethodDetailsViewModel;
import com.squareup.cash.profile.views.SecurityLockView$$ExternalSyntheticLambda1;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class ContactMethodDetailsView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactMethodDetailsView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(int i, Composer composer, ContactMethodDetailsViewModel contactMethodDetailsViewModel, Function1 function1) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1836905598);
        int i2 = (gapComposer.changedInstance(contactMethodDetailsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (contactMethodDetailsViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1376008147, new ContactMethodDetailsView$$ExternalSyntheticLambda0(function1, contactMethodDetailsViewModel), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(this, contactMethodDetailsViewModel, function1, i, 16);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content(0, gapComposer, (ContactMethodDetailsViewModel) obj, function1);
    }
}
