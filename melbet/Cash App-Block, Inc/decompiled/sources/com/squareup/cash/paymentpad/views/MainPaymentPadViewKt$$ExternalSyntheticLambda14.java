package com.squareup.cash.paymentpad.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class MainPaymentPadViewKt$$ExternalSyntheticLambda14 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ButtonProminence f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ Function2 f$3;
    public final /* synthetic */ Modifier f$4;

    public /* synthetic */ MainPaymentPadViewKt$$ExternalSyntheticLambda14(ButtonProminence buttonProminence, String str, String str2, Function2 function2, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = buttonProminence;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = function2;
        this.f$4 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                MainPaymentPadViewKt.PayRequestButtons(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(1);
                MainPaymentPadViewKt.PayTapToPayRequestButtons(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }
}
