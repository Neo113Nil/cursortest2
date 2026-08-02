package com.squareup.cash.directdeposit.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.SingleInstanceScreen;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;
import com.squareup.cash.screens.Redacted;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DirectDepositManualFormDetailsScreen implements DirectDepositManualSetupScreen, SingleInstanceScreen {
    public static final Parcelable.Creator<DirectDepositManualFormDetailsScreen> CREATOR = new Limit.Creator(15);
    public final Redacted companyName;
    public final String token;

    public DirectDepositManualFormDetailsScreen(Redacted redacted, String str) {
        str.getClass();
        redacted.getClass();
        this.token = str;
        this.companyName = redacted;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectDepositManualFormDetailsScreen)) {
            return false;
        }
        DirectDepositManualFormDetailsScreen directDepositManualFormDetailsScreen = (DirectDepositManualFormDetailsScreen) obj;
        return Intrinsics.areEqual(this.token, directDepositManualFormDetailsScreen.token) && Intrinsics.areEqual(this.companyName, directDepositManualFormDetailsScreen.companyName);
    }

    @Override // com.squareup.cash.directdeposit.screens.DirectDepositManualSetupScreen
    public final String getToken() {
        throw null;
    }

    public final int hashCode() {
        return this.companyName.hashCode() + (this.token.hashCode() * 31);
    }

    public final String toString() {
        return "DirectDepositManualFormDetailsScreen(token=" + this.token + ", companyName=" + this.companyName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeParcelable(this.companyName, i);
    }
}
