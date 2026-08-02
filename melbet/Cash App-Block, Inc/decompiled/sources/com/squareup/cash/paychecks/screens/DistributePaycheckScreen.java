package com.squareup.cash.paychecks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import com.squareup.cash.payments.common.PaymentRecipient;

/* loaded from: classes.dex */
public final class DistributePaycheckScreen implements PaychecksScreen, RestoringScreen {
    public static final DistributePaycheckScreen INSTANCE = new DistributePaycheckScreen();
    public static final Parcelable.Creator<DistributePaycheckScreen> CREATOR = new PaymentRecipient.Creator(15);

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
