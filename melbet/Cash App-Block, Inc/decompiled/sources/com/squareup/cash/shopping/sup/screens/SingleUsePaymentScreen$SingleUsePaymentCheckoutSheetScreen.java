package com.squareup.cash.shopping.sup.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.shopping.settings.screens.ErrorScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen implements Screen, BottomSheetScreen {
    public static final Parcelable.Creator<SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen> CREATOR = new ErrorScreen.Creator(21);
    public final SingleUsePaymentAnalyticsParam analyticsParam;
    public final String cartDetails;
    public final ShoppingWebScreen.ShoppingWebScreenV2 exitScreen;
    public final CheckoutScreenType screenType;

    public SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen(CheckoutScreenType checkoutScreenType, String str, ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV2, SingleUsePaymentAnalyticsParam singleUsePaymentAnalyticsParam) {
        checkoutScreenType.getClass();
        this.screenType = checkoutScreenType;
        this.cartDetails = str;
        this.exitScreen = shoppingWebScreenV2;
        this.analyticsParam = singleUsePaymentAnalyticsParam;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen)) {
            return false;
        }
        SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen singleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen = (SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen) obj;
        return Intrinsics.areEqual(this.screenType, singleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen.screenType) && Intrinsics.areEqual(this.cartDetails, singleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen.cartDetails) && Intrinsics.areEqual(this.exitScreen, singleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen.exitScreen) && Intrinsics.areEqual(this.analyticsParam, singleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen.analyticsParam);
    }

    public final int hashCode() {
        int hashCode = this.screenType.hashCode() * 31;
        String str = this.cartDetails;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV2 = this.exitScreen;
        int hashCode3 = (hashCode2 + (shoppingWebScreenV2 == null ? 0 : shoppingWebScreenV2.hashCode())) * 31;
        SingleUsePaymentAnalyticsParam singleUsePaymentAnalyticsParam = this.analyticsParam;
        return hashCode3 + (singleUsePaymentAnalyticsParam != null ? singleUsePaymentAnalyticsParam.hashCode() : 0);
    }

    public final String toString() {
        return "SingleUsePaymentCheckoutSheetScreen(screenType=" + this.screenType + ", cartDetails=" + this.cartDetails + ", exitScreen=" + this.exitScreen + ", analyticsParam=" + this.analyticsParam + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.screenType, i);
        parcel.writeString(this.cartDetails);
        parcel.writeParcelable(this.exitScreen, i);
        SingleUsePaymentAnalyticsParam singleUsePaymentAnalyticsParam = this.analyticsParam;
        if (singleUsePaymentAnalyticsParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            singleUsePaymentAnalyticsParam.writeToParcel(parcel, i);
        }
    }
}
