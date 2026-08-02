package com.squareup.cash.shopping.sup.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.shopping.settings.screens.ErrorScreen;

/* loaded from: classes.dex */
public final class SingleUsePaymentScreen$SingleUsePaymentAddCardSheetScreen implements Screen, BottomSheetScreen {
    public static final SingleUsePaymentScreen$SingleUsePaymentAddCardSheetScreen INSTANCE = new SingleUsePaymentScreen$SingleUsePaymentAddCardSheetScreen();
    public static final Parcelable.Creator<SingleUsePaymentScreen$SingleUsePaymentAddCardSheetScreen> CREATOR = new ErrorScreen.Creator(18);

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
