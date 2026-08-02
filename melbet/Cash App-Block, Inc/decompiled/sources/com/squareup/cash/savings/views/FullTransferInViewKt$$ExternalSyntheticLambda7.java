package com.squareup.cash.savings.views;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneyChanged;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountChangedSource;
import com.squareup.cash.ui.widget.amount.AmountEvent;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class FullTransferInViewKt$$ExternalSyntheticLambda7 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CurrencyCode f$0;
    public final /* synthetic */ RealCashVibrator f$1;
    public final /* synthetic */ Shaker f$2;
    public final /* synthetic */ MutableState f$3;
    public final /* synthetic */ Function1 f$4;

    public /* synthetic */ FullTransferInViewKt$$ExternalSyntheticLambda7(CurrencyCode currencyCode, RealCashVibrator realCashVibrator, Shaker shaker, MutableState mutableState, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = currencyCode;
        this.f$1 = realCashVibrator;
        this.f$2 = shaker;
        this.f$3 = mutableState;
        this.f$4 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        AmountChangedSource.DigitInput digitInput = AmountChangedSource.DigitInput.INSTANCE;
        AmountChangedSource.ConfigReset configReset = AmountChangedSource.ConfigReset.INSTANCE;
        Function1 function1 = this.f$4;
        MutableState mutableState = this.f$3;
        Shaker shaker = this.f$2;
        RealCashVibrator realCashVibrator = this.f$1;
        CurrencyCode currencyCode = this.f$0;
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
                    AmountChangedSource amountChangedSource = amountChanged.source;
                    if (!Intrinsics.areEqual(amountChangedSource, configReset)) {
                        if (Intrinsics.areEqual(amountChangedSource, digitInput)) {
                            mutableState.setValue(Boolean.TRUE);
                        }
                        if (currencyCode != null) {
                            function1.invoke(new AmountPickerViewEvent$Full$MoneyChanged(new Money(Long.valueOf(ButtonGroupKt.getAmountInCents(amountChanged.rawAmount)), currencyCode, 4)));
                        }
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
                    AmountEvent.AmountChanged amountChanged2 = (AmountEvent.AmountChanged) amountEvent;
                    AmountChangedSource amountChangedSource2 = amountChanged2.source;
                    if (!Intrinsics.areEqual(amountChangedSource2, configReset)) {
                        if (Intrinsics.areEqual(amountChangedSource2, digitInput)) {
                            mutableState.setValue(Boolean.TRUE);
                        }
                        if (currencyCode != null) {
                            function1.invoke(new AmountPickerViewEvent$Full$MoneyChanged(new Money(Long.valueOf(ButtonGroupKt.getAmountInCents(amountChanged2.rawAmount)), currencyCode, 4)));
                        }
                    }
                }
                break;
        }
        return null;
    }
}
