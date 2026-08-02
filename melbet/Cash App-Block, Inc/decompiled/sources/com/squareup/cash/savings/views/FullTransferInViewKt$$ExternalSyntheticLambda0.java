package com.squareup.cash.savings.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class FullTransferInViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AmountPickerViewModel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ int f$3;

    public /* synthetic */ FullTransferInViewKt$$ExternalSyntheticLambda0(AmountPickerViewModel amountPickerViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = amountPickerViewModel;
        this.f$1 = function1;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = this.f$3;
        Function1 function1 = this.f$1;
        AmountPickerViewModel amountPickerViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                ButtonGroupKt.FullTransferInView(amountPickerViewModel, function1, companion, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                num.getClass();
                HelpSheetViewKt.CustomAllocationView(amountPickerViewModel, function1, companion, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                num.intValue();
                ButtonGroupKt.CondensedTransferInView(amountPickerViewModel, function1, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                num.getClass();
                ButtonGroupKt.FullTransferOutView(amountPickerViewModel, function1, companion, composer, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
