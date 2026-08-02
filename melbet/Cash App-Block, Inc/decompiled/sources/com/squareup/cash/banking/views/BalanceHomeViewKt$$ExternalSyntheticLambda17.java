package com.squareup.cash.banking.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.protos.franklin.common.BalanceData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BalanceHomeViewKt$$ExternalSyntheticLambda17 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BalanceData.Button f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ BalanceHomeViewKt$$ExternalSyntheticLambda17(BalanceData.Button button, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = button;
        this.f$1 = function1;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        Function1 function1 = this.f$1;
        BalanceData.Button button = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                BalanceHomeViewKt.AccountDetailsPlaceholder(button, function1, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                num.getClass();
                BalanceHomeViewKt.AccountManageRow(button, function1, composer, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
