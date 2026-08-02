package com.squareup.cash.blockers.views.components;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.InviteFriendsViewModel;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda9;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class InviteFriendsView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(InviteFriendsViewModel inviteFriendsViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-563632215);
        int i2 = (gapComposer.changedInstance(inviteFriendsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            if (inviteFriendsViewModel == null) {
                gapComposer.startReplaceGroup(-2140055692);
            } else {
                gapComposer.startReplaceGroup(-2140055691);
                ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(2025922439, new InviteFriendsView$$ExternalSyntheticLambda0(inviteFriendsViewModel, function1), gapComposer), gapComposer, 3072, 7);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9((Object) this, (Object) inviteFriendsViewModel, function1, i, 9);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((InviteFriendsViewModel) obj, function1, gapComposer, 0);
    }
}
