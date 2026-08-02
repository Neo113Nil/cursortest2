package com.squareup.cash.bitcoin.views.exchange;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewEvent;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewEvent;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountChangedSource;
import com.squareup.cash.ui.widget.amount.AmountEvent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes7.dex */
public final /* synthetic */ class BitcoinExchangeViewKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ RealCashVibrator f$1;
    public final /* synthetic */ Shaker f$2;
    public final /* synthetic */ MutableState f$3;

    public /* synthetic */ BitcoinExchangeViewKt$$ExternalSyntheticLambda3(Function1 function1, RealCashVibrator realCashVibrator, Shaker shaker, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = realCashVibrator;
        this.f$2 = shaker;
        this.f$3 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$3;
        Shaker shaker = this.f$2;
        RealCashVibrator realCashVibrator = this.f$1;
        Function1 function1 = this.f$0;
        AmountEvent amountEvent = (AmountEvent) obj;
        switch (i) {
            case 0:
                amountEvent.getClass();
                if (!(amountEvent instanceof AmountEvent.AmountChanged)) {
                    if (!(amountEvent instanceof AmountEvent.InvalidChange)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        if (realCashVibrator != null) {
                            realCashVibrator.error();
                        }
                        shaker.shake();
                    }
                } else {
                    AmountEvent.AmountChanged amountChanged = (AmountEvent.AmountChanged) amountEvent;
                    String str = amountChanged.rawAmount;
                    mutableState.setValue(Boolean.valueOf(MathKt__MathJVMKt.roundToLong(Double.parseDouble(str) * 100.0d) > 0));
                    if (Intrinsics.areEqual(amountChanged.source, AmountChangedSource.DigitInput.INSTANCE)) {
                        function1.invoke(new BitcoinTransferViewEvent.AmountEntered(str, MathKt__MathJVMKt.roundToLong(Double.parseDouble(str) * 100.0d)));
                    }
                }
                break;
            default:
                amountEvent.getClass();
                if (!(amountEvent instanceof AmountEvent.AmountChanged)) {
                    if (!(amountEvent instanceof AmountEvent.InvalidChange)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        if (realCashVibrator != null) {
                            realCashVibrator.error();
                        }
                        shaker.shake();
                    }
                } else {
                    String str2 = ((AmountEvent.AmountChanged) amountEvent).rawAmount;
                    long roundToLong = MathKt__MathJVMKt.roundToLong(Double.parseDouble(str2) * 100.0d);
                    mutableState.setValue(Boolean.valueOf(roundToLong > 0));
                    function1.invoke(new InvestingExchangeViewEvent.AmountEntered(str2, roundToLong));
                }
                break;
        }
        return null;
    }
}
