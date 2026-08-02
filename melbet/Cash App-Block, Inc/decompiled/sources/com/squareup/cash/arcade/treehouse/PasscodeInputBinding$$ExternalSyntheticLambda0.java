package com.squareup.cash.arcade.treehouse;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import coil3.network.NetworkFetcher$fetch$2;
import com.squareup.cash.card.onboarding.graphics.WandScene$ring$3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* loaded from: classes5.dex */
public final /* synthetic */ class PasscodeInputBinding$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ PasscodeInputBinding f$0;

    public /* synthetic */ PasscodeInputBinding$$ExternalSyntheticLambda0(PasscodeInputBinding passcodeInputBinding) {
        this.f$0 = passcodeInputBinding;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i = PasscodeInputBinding.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    PasscodeInputBinding passcodeInputBinding = this.f$0;
                    int length = passcodeInputBinding.getPasscode$1().length();
                    int intValue2 = passcodeInputBinding.passcodeLength$delegate.getIntValue();
                    long j = passcodeInputBinding.dotAccentColor;
                    int intValue3 = passcodeInputBinding.shakeTrigger$delegate.getIntValue();
                    boolean changedInstance = gapComposer.changedInstance(passcodeInputBinding);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        NetworkFetcher$fetch$2 networkFetcher$fetch$2 = new NetworkFetcher$fetch$2(1, passcodeInputBinding, PasscodeInputBinding.class, "onDigit", "onDigit(I)V", 0, 24);
                        gapComposer.updateRememberedValue(networkFetcher$fetch$2);
                        rememberedValue = networkFetcher$fetch$2;
                    }
                    Function1 function1 = (Function1) ((KFunction) rememberedValue);
                    boolean changedInstance2 = gapComposer.changedInstance(passcodeInputBinding);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                        WandScene$ring$3 wandScene$ring$3 = new WandScene$ring$3(0, passcodeInputBinding, PasscodeInputBinding.class, "onBackspace", "onBackspace()V", 0, 10);
                        gapComposer.updateRememberedValue(wandScene$ring$3);
                        rememberedValue2 = wandScene$ring$3;
                    }
                    Function0 function0 = (Function0) ((KFunction) rememberedValue2);
                    boolean changedInstance3 = gapComposer.changedInstance(passcodeInputBinding);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                        WandScene$ring$3 wandScene$ring$32 = new WandScene$ring$3(0, passcodeInputBinding, PasscodeInputBinding.class, "onClear", "onClear()V", 0, 11);
                        gapComposer.updateRememberedValue(wandScene$ring$32);
                        rememberedValue3 = wandScene$ring$32;
                    }
                    ColorBindingsKt.m3402PasscodeInputlVb_Clg(length, intValue2, j, intValue3, function1, function0, (Function0) ((KFunction) rememberedValue3), null, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                int i2 = PasscodeInputBinding.$r8$clinit;
                this.f$0.Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PasscodeInputBinding$$ExternalSyntheticLambda0(PasscodeInputBinding passcodeInputBinding, int i) {
        this.f$0 = passcodeInputBinding;
    }
}
