package com.squareup.cash.pools.views;

import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.ui.util.RealCashVibrator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolDescriptionKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealCashVibrator f$0;
    public final /* synthetic */ Shaker f$1;

    public /* synthetic */ PoolDescriptionKt$$ExternalSyntheticLambda4(RealCashVibrator realCashVibrator, Shaker shaker, int i) {
        this.$r8$classId = i;
        this.f$0 = realCashVibrator;
        this.f$1 = shaker;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Shaker shaker = this.f$1;
        RealCashVibrator realCashVibrator = this.f$0;
        switch (i) {
            case 0:
                if (realCashVibrator != null) {
                    realCashVibrator.error();
                }
                shaker.shake();
                break;
            case 1:
                if (realCashVibrator != null) {
                    realCashVibrator.error();
                }
                shaker.shake();
                break;
            case 2:
                if (realCashVibrator != null) {
                    realCashVibrator.error();
                }
                shaker.shake();
                break;
            case 3:
                if (realCashVibrator != null) {
                    realCashVibrator.error();
                }
                shaker.shake();
                break;
            case 4:
                if (realCashVibrator != null) {
                    realCashVibrator.error();
                }
                shaker.shake();
                break;
            case 5:
                if (realCashVibrator != null) {
                    realCashVibrator.error();
                }
                shaker.shake();
                break;
            default:
                if (realCashVibrator != null) {
                    realCashVibrator.error();
                }
                shaker.shake();
                break;
        }
        return Unit.INSTANCE;
    }
}
