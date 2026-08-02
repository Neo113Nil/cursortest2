package com.squareup.cash.pools.views;

import com.squareup.cash.amountchooser.viewmodels.AmountChooserViewEvent;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.SendStablecoinEvent;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewEvent;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerEvent;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountChangedSource;
import com.squareup.cash.ui.widget.amount.AmountEvent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class StartPoolAmountKt$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ RealCashVibrator f$1;
    public final /* synthetic */ Shaker f$2;

    public /* synthetic */ StartPoolAmountKt$$ExternalSyntheticLambda4(Function1 function1, Shaker shaker, RealCashVibrator realCashVibrator) {
        this.$r8$classId = 4;
        this.f$0 = function1;
        this.f$2 = shaker;
        this.f$1 = realCashVibrator;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        AmountChangedSource.ConfigReset configReset = AmountChangedSource.ConfigReset.INSTANCE;
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
                    function1.invoke(Long.valueOf(MathKt__MathJVMKt.roundToLong(Double.parseDouble(((AmountEvent.AmountChanged) amountEvent).rawAmount) * 100.0d)));
                }
                break;
            case 1:
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
                    if (!Intrinsics.areEqual(amountChanged.source, configReset)) {
                        String str = amountChanged.rawAmount;
                        function1.invoke(new BitcoinKeypadAmountPickerEvent.AmountEntered(str, MathKt__MathJVMKt.roundToLong(Double.parseDouble(str) * 100.0d)));
                    }
                }
                break;
            case 2:
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
                    String str2 = amountChanged2.rawAmount;
                    if (!Intrinsics.areEqual(amountChanged2.source, configReset)) {
                        function1.invoke(new SendStablecoinEvent.AmountChanged(MathKt__MathJVMKt.roundToLong(Double.parseDouble(str2) * 100.0d), str2));
                    }
                }
                break;
            case 3:
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
                    AmountEvent.AmountChanged amountChanged3 = (AmountEvent.AmountChanged) amountEvent;
                    if (!Intrinsics.areEqual(amountChanged3.source, configReset)) {
                        String str3 = amountChanged3.rawAmount;
                        function1.invoke(new BitcoinTransferViewEvent.AmountEntered(str3, MathKt__MathJVMKt.roundToLong(Double.parseDouble(str3) * 100.0d)));
                    }
                }
                break;
            case 4:
                amountEvent.getClass();
                if (!(amountEvent instanceof AmountEvent.AmountChanged)) {
                    if (!(amountEvent instanceof AmountEvent.InvalidChange)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        shaker.shake();
                        if (realCashVibrator != null) {
                            realCashVibrator.error();
                        }
                    }
                } else {
                    function1.invoke(new AmountChooserViewEvent.KeypadAmountChanged(((AmountEvent.AmountChanged) amountEvent).rawAmount));
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
                    function1.invoke(Long.valueOf(MathKt__MathJVMKt.roundToLong(Double.parseDouble(((AmountEvent.AmountChanged) amountEvent).rawAmount) * 100.0d)));
                }
                break;
        }
        return null;
    }

    public /* synthetic */ StartPoolAmountKt$$ExternalSyntheticLambda4(Function1 function1, RealCashVibrator realCashVibrator, Shaker shaker, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = realCashVibrator;
        this.f$2 = shaker;
    }
}
