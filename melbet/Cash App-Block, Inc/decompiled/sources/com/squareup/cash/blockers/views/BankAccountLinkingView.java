package com.squareup.cash.blockers.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.ui.OnTransitionListener;
import com.squareup.cash.ui.SecureScreen;
import com.squareup.cash.ui.util.RealCashVibrator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class BankAccountLinkingView extends ComposeUiView implements SecureScreen, OnTransitionListener {
    public final FocusRequester focusRequester;
    public final RealCashVibrator vibrator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankAccountLinkingView(Context context, RealCashVibrator realCashVibrator) {
        super(context);
        context.getClass();
        this.vibrator = realCashVibrator;
        this.focusRequester = new FocusRequester();
    }

    public final void Content(BankAccountLinkingViewModel bankAccountLinkingViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(369224910);
        int i2 = (gapComposer.changedInstance(bankAccountLinkingViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (bankAccountLinkingViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            int i3 = i2 & 112;
            boolean changedInstance = gapComposer.changedInstance(bankAccountLinkingViewModel) | gapComposer.changed(delegatingSoftwareKeyboardController) | (i3 == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CopyCodeKt$$ExternalSyntheticLambda4(bankAccountLinkingViewModel, delegatingSoftwareKeyboardController, function1, 12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            boolean z = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new AvatarsKt$$ExternalSyntheticLambda1(24, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue2, gapComposer, 0);
            Updater.CompositionLocalProvider(LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(this.vibrator), Expect_jvmKt.rememberComposableLambda(-1935273586, new BankAccountLinkingView$$ExternalSyntheticLambda2(bankAccountLinkingViewModel, function1, this), gapComposer), gapComposer, 56);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BankAccountLinkingView$$ExternalSyntheticLambda2(this, bankAccountLinkingViewModel, function1, i);
        }
    }

    @Override // com.squareup.cash.ui.OnTransitionListener
    public final void onEnterTransitionFinished() {
        DBUtil.requestFocusCompat(this, this.focusRequester);
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((BankAccountLinkingViewModel) obj, function1, gapComposer, 0);
    }
}
