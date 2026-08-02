package com.squareup.cash.sharesheet;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;

/* loaded from: classes.dex */
public final class ShareSheetScreen implements Screen, OnlyOneOverlayTreatment {
    public static final ShareSheetScreen INSTANCE = new ShareSheetScreen();
    public static final Parcelable.Creator<ShareSheetScreen> CREATOR = new Creator();

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return ShareSheetScreen.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShareSheetScreen[i];
        }
    }

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
