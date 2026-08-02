package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.SingleInstanceScreen;
import app.cash.local.screens.app.LocalLoyaltySheet;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;

/* loaded from: classes.dex */
public final class LocalCashBalanceScreen implements LocalScreen, SingleInstanceScreen {
    public static final Parcelable.Creator<LocalCashBalanceScreen> CREATOR = new LocalLoyaltySheet.Creator(9);
    public final boolean navigateToLocalTabOnDismiss;
    public final boolean openCardManagementSheet;

    public /* synthetic */ LocalCashBalanceScreen(int i) {
        this((i & 1) == 0, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalCashBalanceScreen)) {
            return false;
        }
        LocalCashBalanceScreen localCashBalanceScreen = (LocalCashBalanceScreen) obj;
        return this.navigateToLocalTabOnDismiss == localCashBalanceScreen.navigateToLocalTabOnDismiss && this.openCardManagementSheet == localCashBalanceScreen.openCardManagementSheet;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.openCardManagementSheet) + (Boolean.hashCode(this.navigateToLocalTabOnDismiss) * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("LocalCashBalanceScreen(navigateToLocalTabOnDismiss=", ", openCardManagementSheet=", ")", this.navigateToLocalTabOnDismiss, this.openCardManagementSheet);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.navigateToLocalTabOnDismiss ? 1 : 0);
        parcel.writeInt(this.openCardManagementSheet ? 1 : 0);
    }

    public LocalCashBalanceScreen(boolean z, boolean z2) {
        this.navigateToLocalTabOnDismiss = z;
        this.openCardManagementSheet = z2;
    }
}
