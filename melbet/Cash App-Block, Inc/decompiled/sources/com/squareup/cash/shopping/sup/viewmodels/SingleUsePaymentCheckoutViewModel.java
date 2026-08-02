package com.squareup.cash.shopping.sup.viewmodels;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.shopping.sup.screens.CheckoutScreenType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SingleUsePaymentCheckoutViewModel {
    public final String cartDetails;
    public final Screen exitScreen;
    public final CheckoutScreenType sheetType;

    public SingleUsePaymentCheckoutViewModel(CheckoutScreenType checkoutScreenType, String str, Screen screen) {
        checkoutScreenType.getClass();
        this.sheetType = checkoutScreenType;
        this.cartDetails = str;
        this.exitScreen = screen;
    }

    public static SingleUsePaymentCheckoutViewModel copy$default(SingleUsePaymentCheckoutViewModel singleUsePaymentCheckoutViewModel, CheckoutScreenType checkoutScreenType) {
        String str = singleUsePaymentCheckoutViewModel.cartDetails;
        Screen screen = singleUsePaymentCheckoutViewModel.exitScreen;
        singleUsePaymentCheckoutViewModel.getClass();
        return new SingleUsePaymentCheckoutViewModel(checkoutScreenType, str, screen);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleUsePaymentCheckoutViewModel)) {
            return false;
        }
        SingleUsePaymentCheckoutViewModel singleUsePaymentCheckoutViewModel = (SingleUsePaymentCheckoutViewModel) obj;
        return Intrinsics.areEqual(this.sheetType, singleUsePaymentCheckoutViewModel.sheetType) && Intrinsics.areEqual(this.cartDetails, singleUsePaymentCheckoutViewModel.cartDetails) && Intrinsics.areEqual(this.exitScreen, singleUsePaymentCheckoutViewModel.exitScreen);
    }

    public final int hashCode() {
        int hashCode = this.sheetType.hashCode() * 31;
        String str = this.cartDetails;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Screen screen = this.exitScreen;
        return hashCode2 + (screen != null ? screen.hashCode() : 0);
    }

    public final String toString() {
        return "SingleUsePaymentCheckoutViewModel(sheetType=" + this.sheetType + ", cartDetails=" + this.cartDetails + ", exitScreen=" + this.exitScreen + ")";
    }
}
