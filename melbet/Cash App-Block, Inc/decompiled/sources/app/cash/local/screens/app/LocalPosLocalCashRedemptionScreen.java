package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.passcode.screens.EndAppLock;
import com.squareup.protos.cash.local.client.v1.POSLocalCashRedemption;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalPosLocalCashRedemptionScreen implements LocalScreen, NeverInBackStackScreen {
    public static final Parcelable.Creator<LocalPosLocalCashRedemptionScreen> CREATOR = new EndAppLock.Creator(7);
    public final POSLocalCashRedemption posLocalCashRedemption;

    public LocalPosLocalCashRedemptionScreen(POSLocalCashRedemption pOSLocalCashRedemption) {
        pOSLocalCashRedemption.getClass();
        this.posLocalCashRedemption = pOSLocalCashRedemption;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalPosLocalCashRedemptionScreen) && Intrinsics.areEqual(this.posLocalCashRedemption, ((LocalPosLocalCashRedemptionScreen) obj).posLocalCashRedemption);
    }

    public final int hashCode() {
        return this.posLocalCashRedemption.hashCode();
    }

    public final String toString() {
        return "LocalPosLocalCashRedemptionScreen(posLocalCashRedemption=" + this.posLocalCashRedemption + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.posLocalCashRedemption, i);
    }
}
