package com.squareup.cash.appmessages;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.appmessages.SheetAppMessage;

/* loaded from: classes.dex */
public final class PaymentPadTabPopupAppMessage implements DialogScreen {
    public static final PaymentPadTabPopupAppMessage INSTANCE = new PaymentPadTabPopupAppMessage();
    public static final Parcelable.Creator<PaymentPadTabPopupAppMessage> CREATOR = new SheetAppMessage.Creator(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
