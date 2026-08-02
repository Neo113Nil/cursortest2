package com.squareup.cash.checks;

import com.squareup.cash.common.composeui.animations.Shaker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class CheckDepositAmountKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Shaker f$0;

    public /* synthetic */ CheckDepositAmountKt$$ExternalSyntheticLambda3(int i, Shaker shaker) {
        this.$r8$classId = i;
        this.f$0 = shaker;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Shaker shaker = this.f$0;
        switch (i) {
            case 0:
                shaker.shake();
                break;
            case 1:
                shaker.shake();
                break;
            default:
                shaker.shake();
                break;
        }
        return Unit.INSTANCE;
    }
}
