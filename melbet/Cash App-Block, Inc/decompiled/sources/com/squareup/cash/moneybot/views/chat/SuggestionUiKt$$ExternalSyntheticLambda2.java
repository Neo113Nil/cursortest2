package com.squareup.cash.moneybot.views.chat;

import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class SuggestionUiKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealHapticVibrator f$0;
    public final /* synthetic */ Haptics f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ SuggestionUiKt$$ExternalSyntheticLambda2(RealHapticVibrator realHapticVibrator, Haptics haptics, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = realHapticVibrator;
        this.f$1 = haptics;
        this.f$2 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function0 function0 = this.f$2;
        Haptics haptics = this.f$1;
        RealHapticVibrator realHapticVibrator = this.f$0;
        switch (i) {
            case 0:
                realHapticVibrator.vibrate(haptics.input.standard);
                function0.invoke();
                break;
            case 1:
                realHapticVibrator.vibrate(haptics.input.standard);
                function0.invoke();
                break;
            case 2:
                realHapticVibrator.vibrate(haptics.input.subtle);
                function0.invoke();
                break;
            default:
                realHapticVibrator.vibrate(haptics.input.subtle);
                function0.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
