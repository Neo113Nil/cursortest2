package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.passcode.screens.EndAppLock;

/* loaded from: classes3.dex */
public final class TableQrCodeScannerScreen implements LocalScreen, NeverInBackStackScreen {
    public static final TableQrCodeScannerScreen INSTANCE = new TableQrCodeScannerScreen();
    public static final Parcelable.Creator<TableQrCodeScannerScreen> CREATOR = new EndAppLock.Creator(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof TableQrCodeScannerScreen);
    }

    public final int hashCode() {
        return 104071955;
    }

    public final String toString() {
        return "TableQrCodeScannerScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
