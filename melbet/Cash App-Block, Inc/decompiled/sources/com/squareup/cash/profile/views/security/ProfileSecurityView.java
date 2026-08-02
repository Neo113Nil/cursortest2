package com.squareup.cash.profile.views.security;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityViewModel;
import com.squareup.cash.profile.views.SecurityLockView$$ExternalSyntheticLambda1;
import com.squareup.cash.qrcodes.views.CashtagQrScanView$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class ProfileSecurityView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileSecurityView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(ProfileSecurityViewModel profileSecurityViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(345083680);
        int i2 = (gapComposer.changedInstance(profileSecurityViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (profileSecurityViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashtagQrScanView$$ExternalSyntheticLambda0(3, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            WebSectionKt.ProfileSecurity(profileSecurityViewModel, function1, null, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(this, profileSecurityViewModel, function1, i, 25);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((ProfileSecurityViewModel) obj, function1, gapComposer, 0);
    }
}
