package com.squareup.cash.arcade.treehouse;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Color;
import coil3.network.NetworkFetcher$fetch$2;
import com.squareup.cash.card.onboarding.graphics.WandScene$ring$3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* loaded from: classes5.dex */
public final /* synthetic */ class LegacyPasscodeInputBinding$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ LegacyPasscodeInputBinding f$0;

    public /* synthetic */ LegacyPasscodeInputBinding$$ExternalSyntheticLambda0(LegacyPasscodeInputBinding legacyPasscodeInputBinding) {
        this.f$0 = legacyPasscodeInputBinding;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i = LegacyPasscodeInputBinding.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    LegacyPasscodeInputBinding legacyPasscodeInputBinding = this.f$0;
                    int length = legacyPasscodeInputBinding.getPasscode().length();
                    int intValue2 = legacyPasscodeInputBinding.passcodeLength$delegate.getIntValue();
                    long j = ((Color) legacyPasscodeInputBinding.dotAccentColor$delegate.getValue()).value;
                    int intValue3 = legacyPasscodeInputBinding.shakeTrigger$delegate.getIntValue();
                    boolean changedInstance = gapComposer.changedInstance(legacyPasscodeInputBinding);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        NetworkFetcher$fetch$2 networkFetcher$fetch$2 = new NetworkFetcher$fetch$2(1, legacyPasscodeInputBinding, LegacyPasscodeInputBinding.class, "onDigit", "onDigit(I)V", 0, 23);
                        gapComposer.updateRememberedValue(networkFetcher$fetch$2);
                        rememberedValue = networkFetcher$fetch$2;
                    }
                    Function1 function1 = (Function1) ((KFunction) rememberedValue);
                    boolean changedInstance2 = gapComposer.changedInstance(legacyPasscodeInputBinding);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                        WandScene$ring$3 wandScene$ring$3 = new WandScene$ring$3(0, legacyPasscodeInputBinding, LegacyPasscodeInputBinding.class, "onBackspace", "onBackspace()V", 0, 8);
                        gapComposer.updateRememberedValue(wandScene$ring$3);
                        rememberedValue2 = wandScene$ring$3;
                    }
                    Function0 function0 = (Function0) ((KFunction) rememberedValue2);
                    boolean changedInstance3 = gapComposer.changedInstance(legacyPasscodeInputBinding);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                        WandScene$ring$3 wandScene$ring$32 = new WandScene$ring$3(0, legacyPasscodeInputBinding, LegacyPasscodeInputBinding.class, "onClear", "onClear()V", 0, 9);
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
                int i2 = LegacyPasscodeInputBinding.$r8$clinit;
                this.f$0.Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LegacyPasscodeInputBinding$$ExternalSyntheticLambda0(LegacyPasscodeInputBinding legacyPasscodeInputBinding, int i) {
        this.f$0 = legacyPasscodeInputBinding;
    }
}
