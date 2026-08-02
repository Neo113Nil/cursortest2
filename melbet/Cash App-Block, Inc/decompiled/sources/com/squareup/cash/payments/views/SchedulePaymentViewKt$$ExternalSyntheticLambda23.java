package com.squareup.cash.payments.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class SchedulePaymentViewKt$$ExternalSyntheticLambda23 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ boolean f$3;

    public /* synthetic */ SchedulePaymentViewKt$$ExternalSyntheticLambda23(Modifier modifier, Function0 function0, String str, boolean z, int i) {
        this.f$0 = modifier;
        this.f$1 = function0;
        this.f$2 = str;
        this.f$3 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                QuickPayViewKt.FrequencyButton(Updater.updateChangedFlags(1), (Composer) obj, this.f$0, this.f$2, this.f$1, this.f$3);
                break;
            default:
                ((Integer) obj2).getClass();
                BitcoinKeypadAmountPickerKt.KeypadButton(Updater.updateChangedFlags(1), (Composer) obj, this.f$0, this.f$2, this.f$1, this.f$3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SchedulePaymentViewKt$$ExternalSyntheticLambda23(String str, Function0 function0, boolean z, Modifier modifier, int i) {
        this.f$2 = str;
        this.f$1 = function0;
        this.f$3 = z;
        this.f$0 = modifier;
    }
}
