package com.squareup.cash.profile.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewModel;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda8;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.profile.viewmodels.ProfileViewModel;
import com.squareup.cash.support.viewmodels.SupportFullScreenActivityPickerViewModel;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda6;
import com.squareup.cash.ui.util.RealCashVibrator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class ProfileUiView extends ComposeUiView {
    public final /* synthetic */ int $r8$classId;
    public final RealImageLoader imageLoader;
    public final RealCashVibrator vibrator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileUiView(Context context, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, int i) {
        super(context);
        this.$r8$classId = i;
        context.getClass();
        switch (i) {
            case 2:
                super(context);
                this.imageLoader = realImageLoader;
                this.vibrator = realCashVibrator;
                break;
            default:
                this.imageLoader = realImageLoader;
                this.vibrator = realCashVibrator;
                break;
        }
    }

    public void Content(ProfileViewModel profileViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(497928676);
        int i2 = (gapComposer.changedInstance(profileViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (profileViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda3(19, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer, 0);
            Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(this.vibrator)}, Expect_jvmKt.rememberComposableLambda(987676324, new ProfileUiView$$ExternalSyntheticLambda1(profileViewModel, function1, 0), gapComposer), gapComposer, 56);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1(this, profileViewModel, function1, i, 28);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileUiView(RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, Context context) {
        super(context);
        this.$r8$classId = 0;
        context.getClass();
        this.imageLoader = realImageLoader;
        this.vibrator = realCashVibrator;
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        switch (this.$r8$classId) {
            case 0:
                Content((ProfileViewModel) obj, function1, gapComposer, 0);
                break;
            case 1:
                Content((FullScreenActivityViewModel) obj, function1, gapComposer, 0);
                break;
            default:
                Content((SupportFullScreenActivityPickerViewModel) obj, function1, gapComposer, 0);
                break;
        }
    }

    public void Content(SupportFullScreenActivityPickerViewModel supportFullScreenActivityPickerViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1339856936);
        int i2 = (gapComposer.changedInstance(supportFullScreenActivityPickerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (supportFullScreenActivityPickerViewModel != null) {
            ScreenshotReviewViewKt.SupportFullScreenActivityPickerView(supportFullScreenActivityPickerViewModel, function1, this.imageLoader, this.vibrator, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda6(this, supportFullScreenActivityPickerViewModel, function1, i, 20);
        }
    }

    public void Content(FullScreenActivityViewModel fullScreenActivityViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1789238715);
        int i2 = (gapComposer.changedInstance(fullScreenActivityViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            AvatarsKt.FullScreenActivityView(fullScreenActivityViewModel, function1, this.imageLoader, this.vibrator, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8((Object) this, (Object) fullScreenActivityViewModel, function1, i, 3);
        }
    }
}
