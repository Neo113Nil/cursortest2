package com.squareup.cash.amountchooser.views;

import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;

/* loaded from: classes7.dex */
public final class AmountKeypadState {
    public final boolean allowLeadingDecimal;
    public final AmountConfig config;
    public final String initialAmount;
    public final Shaker shaker;
    public final RealCashVibrator vibrator;

    public AmountKeypadState(AmountConfig amountConfig, String str, Shaker shaker, RealCashVibrator realCashVibrator, boolean z) {
        amountConfig.getClass();
        str.getClass();
        shaker.getClass();
        this.config = amountConfig;
        this.initialAmount = str;
        this.shaker = shaker;
        this.vibrator = realCashVibrator;
        this.allowLeadingDecimal = z;
    }

    public final void shake() {
        RealCashVibrator realCashVibrator = this.vibrator;
        if (realCashVibrator != null) {
            realCashVibrator.error();
        }
        this.shaker.shake();
    }
}
