package com.squareup.cash.profile.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class SearchVisibilityView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchVisibilityView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel profilePrivacyReadyViewModel$SearchPrivacySectionViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1659139926);
        int i2 = (gapComposer.changedInstance(profilePrivacyReadyViewModel$SearchPrivacySectionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (profilePrivacyReadyViewModel$SearchPrivacySectionViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            if (profilePrivacyReadyViewModel$SearchPrivacySectionViewModel instanceof ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content) {
                gapComposer.startReplaceGroup(-953694262);
                BadgeNameKt.SearchVisibility((ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content) profilePrivacyReadyViewModel$SearchPrivacySectionViewModel, function1, null, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-953650056);
                gapComposer.end(false);
            }
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda0(14, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1(this, profilePrivacyReadyViewModel$SearchPrivacySectionViewModel, function1, i, 29);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel) obj, function1, gapComposer, 0);
    }
}
