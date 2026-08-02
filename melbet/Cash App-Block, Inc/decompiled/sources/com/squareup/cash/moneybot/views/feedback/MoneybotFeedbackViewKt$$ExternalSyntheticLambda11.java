package com.squareup.cash.moneybot.views.feedback;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.input.InputDropdownScope;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda21;
import com.squareup.cash.moneybot.viewmodels.feedback.MoneybotFeedbackViewModel;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotFeedbackViewKt$$ExternalSyntheticLambda11 implements Function3 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ MoneybotFeedbackViewModel f$1;

    public /* synthetic */ MoneybotFeedbackViewKt$$ExternalSyntheticLambda11(MoneybotFeedbackViewModel moneybotFeedbackViewModel, Function1 function1) {
        this.f$1 = moneybotFeedbackViewModel;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$0;
        MoneybotFeedbackViewModel moneybotFeedbackViewModel = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda21(12, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1512592538, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(moneybotFeedbackViewModel, 23), gapComposer), gapComposer, 1573296, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                InputDropdownScope inputDropdownScope = (InputDropdownScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                inputDropdownScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(inputDropdownScope) ? 4 : 2;
                }
                int i2 = intValue2;
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                    for (MoneybotFeedbackViewModel.ReasonOption reasonOption : moneybotFeedbackViewModel.options) {
                        boolean changed2 = gapComposer2.changed(function1) | gapComposer2.changedInstance(reasonOption);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new UtilsKt$$ExternalSyntheticLambda0(9, function1, reasonOption);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        InputChipKt.InputDropdownItem(inputDropdownScope, (Function0) rememberedValue2, null, Expect_jvmKt.rememberComposableLambda(468884890, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(reasonOption, 24), gapComposer2), gapComposer2, (i2 & 14) | 3072);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MoneybotFeedbackViewKt$$ExternalSyntheticLambda11(Function1 function1, MoneybotFeedbackViewModel moneybotFeedbackViewModel) {
        this.f$0 = function1;
        this.f$1 = moneybotFeedbackViewModel;
    }
}
