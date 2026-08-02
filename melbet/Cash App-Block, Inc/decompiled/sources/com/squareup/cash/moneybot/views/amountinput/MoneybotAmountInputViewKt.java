package com.squareup.cash.moneybot.views.amountinput;

import androidx.camera.camera2.pipe.core.Debug;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.room.util.DBUtil;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.amountchooser.views.AmountKeypadState;
import com.squareup.cash.money.views.ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda21;
import com.squareup.cash.moneybot.viewmodels.amountinput.MoneybotAmountInputViewModel;
import com.squareup.cash.sheet.SheetKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class MoneybotAmountInputViewKt {

    /* renamed from: lambda$-318614778, reason: not valid java name */
    public static final ComposableLambdaImpl f478lambda$318614778 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(11), false, -318614778);

    public static final void MoneybotAmountInputView(MoneybotAmountInputViewModel moneybotAmountInputViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        moneybotAmountInputViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1773554347);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(moneybotAmountInputViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda21(1, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            if (delegatingSoftwareKeyboardController != null) {
                delegatingSoftwareKeyboardController.hide();
            }
            AmountKeypadState rememberAmountKeypadState = Debug.rememberAmountKeypadState(moneybotAmountInputViewModel.moneyConfig, moneybotAmountInputViewModel.rawAmount, gapComposer, 8, 28);
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda21(2, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            SheetKt.Sheet((Function0) rememberedValue2, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-1541627924, new MoneybotAmountInputViewKt$$ExternalSyntheticLambda2(moneybotAmountInputViewModel, rememberAmountKeypadState, function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(moneybotAmountInputViewModel, function1, i, 12);
        }
    }
}
