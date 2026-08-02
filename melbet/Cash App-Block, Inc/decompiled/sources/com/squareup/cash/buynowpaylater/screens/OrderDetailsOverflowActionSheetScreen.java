package com.squareup.cash.buynowpaylater.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.BottomSheetScreen;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class OrderDetailsOverflowActionSheetScreen implements BottomSheetScreen {
    public static final Parcelable.Creator<OrderDetailsOverflowActionSheetScreen> CREATOR = new BorrowLimitHub.Creator(17);
    public final List actions;
    public final AfterPayOrderDetailsScreen originScreen;

    public OrderDetailsOverflowActionSheetScreen(List list, AfterPayOrderDetailsScreen afterPayOrderDetailsScreen) {
        afterPayOrderDetailsScreen.getClass();
        this.actions = list;
        this.originScreen = afterPayOrderDetailsScreen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailsOverflowActionSheetScreen)) {
            return false;
        }
        OrderDetailsOverflowActionSheetScreen orderDetailsOverflowActionSheetScreen = (OrderDetailsOverflowActionSheetScreen) obj;
        return this.actions.equals(orderDetailsOverflowActionSheetScreen.actions) && Intrinsics.areEqual(this.originScreen, orderDetailsOverflowActionSheetScreen.originScreen);
    }

    public final int hashCode() {
        return this.originScreen.hashCode() + (this.actions.hashCode() * 31);
    }

    public final String toString() {
        return "OrderDetailsOverflowActionSheetScreen(actions=" + this.actions + ", originScreen=" + this.originScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.actions, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        this.originScreen.writeToParcel(parcel, i);
    }
}
