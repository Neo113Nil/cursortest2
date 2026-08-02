package com.squareup.cash.paychecks.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerKt;
import com.squareup.cash.bitcoin.views.paidinbitcoin.PainInBitcoinUpsellViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class DistributePaycheckViewKt$$ExternalSyntheticLambda7 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ DistributePaycheckViewKt$$ExternalSyntheticLambda7(Modifier modifier, Function1 function1, String str, int i) {
        this.$r8$classId = 0;
        this.f$0 = str;
        this.f$1 = modifier;
        this.f$2 = function1;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.$r8$classId) {
            case 0:
                num.intValue();
                HelpSheetViewKt.FooterSlot(Updater.updateChangedFlags(this.f$3 | 1), composer, this.f$1, this.f$0, this.f$2);
                break;
            case 1:
                num.getClass();
                BitcoinKeypadAmountPickerKt.KeypadNote(Updater.updateChangedFlags(this.f$3 | 1), composer, this.f$1, this.f$0, this.f$2);
                break;
            default:
                num.getClass();
                PainInBitcoinUpsellViewKt.ButtonContent(Updater.updateChangedFlags(this.f$3 | 1), composer, this.f$1, this.f$0, this.f$2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DistributePaycheckViewKt$$ExternalSyntheticLambda7(int i, int i2, Modifier modifier, String str, Function1 function1) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$2 = function1;
        this.f$1 = modifier;
        this.f$3 = i;
    }
}
