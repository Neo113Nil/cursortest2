package com.squareup.cash.paychecks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import com.squareup.cash.payments.common.PaymentRecipient;

/* loaded from: classes.dex */
public final class HelpSheetScreen implements PaychecksScreen, BottomSheetScreen {
    public static final HelpSheetScreen INSTANCE = new HelpSheetScreen();
    public static final Parcelable.Creator<HelpSheetScreen> CREATOR = new PaymentRecipient.Creator(18);

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
