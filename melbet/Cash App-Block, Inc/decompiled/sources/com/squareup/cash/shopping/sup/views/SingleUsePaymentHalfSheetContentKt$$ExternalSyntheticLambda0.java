package com.squareup.cash.shopping.sup.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class SingleUsePaymentHalfSheetContentKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ ButtonProminence f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ CartTotalDiscrepancy f$5;
    public final /* synthetic */ Function0 f$6;

    public /* synthetic */ SingleUsePaymentHalfSheetContentKt$$ExternalSyntheticLambda0(String str, String str2, String str3, ButtonProminence buttonProminence, boolean z, CartTotalDiscrepancy cartTotalDiscrepancy, Function0 function0) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = buttonProminence;
        this.f$4 = z;
        this.f$5 = cartTotalDiscrepancy;
        this.f$6 = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    SingleUsePaymentAddCardSheetKt.SingleUsePaymentHalfSheetContentArcade(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                SingleUsePaymentAddCardSheetKt.SingleUsePaymentHalfSheetContentArcade(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SingleUsePaymentHalfSheetContentKt$$ExternalSyntheticLambda0(String str, String str2, String str3, ButtonProminence buttonProminence, boolean z, CartTotalDiscrepancy cartTotalDiscrepancy, Function0 function0, int i) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = buttonProminence;
        this.f$4 = z;
        this.f$5 = cartTotalDiscrepancy;
        this.f$6 = function0;
    }
}
