package com.squareup.cash.profile.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.profile.viewmodels.Alias;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SponsoredAccount implements Parcelable {
    public static final Parcelable.Creator<SponsoredAccount> CREATOR = new Alias.Creator(25);
    public final String accountToken;
    public final boolean notificationsEnabled;
    public boolean notificationsTurnedOn;

    public SponsoredAccount(String str, boolean z, boolean z2) {
        this.accountToken = str;
        this.notificationsEnabled = z;
        this.notificationsTurnedOn = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsoredAccount)) {
            return false;
        }
        SponsoredAccount sponsoredAccount = (SponsoredAccount) obj;
        return Intrinsics.areEqual(this.accountToken, sponsoredAccount.accountToken) && this.notificationsEnabled == sponsoredAccount.notificationsEnabled && this.notificationsTurnedOn == sponsoredAccount.notificationsTurnedOn;
    }

    public final int hashCode() {
        String str = this.accountToken;
        return Boolean.hashCode(this.notificationsTurnedOn) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.notificationsEnabled);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m1540m("SponsoredAccount(accountToken=", this.accountToken, ", notificationsEnabled=", ", notificationsTurnedOn=", this.notificationsEnabled), this.notificationsTurnedOn, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.accountToken);
        parcel.writeInt(this.notificationsEnabled ? 1 : 0);
        parcel.writeInt(this.notificationsTurnedOn ? 1 : 0);
    }
}
