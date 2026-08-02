package com.squareup.cash.blockers.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.viewmodels.VerifyContactsViewModel;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda9;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class VerifyContactsView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyContactsView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(VerifyContactsViewModel verifyContactsViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2008808839);
        int i2 = (gapComposer.changedInstance(verifyContactsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (verifyContactsViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda14(17, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda1(6, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue2, gapComposer, 0);
            SsnViewKt.VerifyContacts(verifyContactsViewModel, function1, null, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9((Object) this, (Object) verifyContactsViewModel, function1, i, 5);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((VerifyContactsViewModel) obj, function1, gapComposer, 0);
    }
}
