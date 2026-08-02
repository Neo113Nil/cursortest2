package com.squareup.cash.billssubscriptions.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.appmessages.SheetAppMessage;

/* loaded from: classes.dex */
public final class BillsSubscriptionsMerchantListScreen implements Screen {
    public static final BillsSubscriptionsMerchantListScreen INSTANCE = new BillsSubscriptionsMerchantListScreen();
    public static final Parcelable.Creator<BillsSubscriptionsMerchantListScreen> CREATOR = new SheetAppMessage.Creator(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BillsSubscriptionsMerchantListScreen);
    }

    public final int hashCode() {
        return -1353831691;
    }

    public final String toString() {
        return "BillsSubscriptionsMerchantListScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
