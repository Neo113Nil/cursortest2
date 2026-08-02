package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import app.cash.passcode.screens.EndAppLock;

/* loaded from: classes3.dex */
public final class MenuItemDetailsQuestion implements Question {
    public static final Parcelable.Creator<MenuItemDetailsQuestion> CREATOR = new EndAppLock.Creator(12);

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
