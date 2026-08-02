package com.squareup.cash.money.navigation.real;

import com.squareup.cash.money.screens.MoneyTabScreen;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class RealMoneyNavigatorHelper {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealMoneyNavigatorHelper();
        }
    }

    public static MoneyTabScreen moneyTabScreen() {
        return new MoneyTabScreen(null);
    }
}
