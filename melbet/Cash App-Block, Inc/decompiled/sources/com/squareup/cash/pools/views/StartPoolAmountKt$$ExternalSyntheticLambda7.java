package com.squareup.cash.pools.views;

import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class StartPoolAmountKt$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AmountDisplayKeypadListener f$0;

    public /* synthetic */ StartPoolAmountKt$$ExternalSyntheticLambda7(AmountDisplayKeypadListener amountDisplayKeypadListener, int i) {
        this.$r8$classId = i;
        this.f$0 = amountDisplayKeypadListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        AmountDisplayKeypadListener amountDisplayKeypadListener = this.f$0;
        switch (i) {
            case 0:
                amountDisplayKeypadListener.onLongBackspace();
                break;
            case 1:
                amountDisplayKeypadListener.onLongBackspace();
                break;
            case 2:
                amountDisplayKeypadListener.onLongBackspace();
                break;
            case 3:
                amountDisplayKeypadListener.onLongBackspace();
                break;
            default:
                amountDisplayKeypadListener.onLongBackspace();
                break;
        }
        return Unit.INSTANCE;
    }
}
