package com.squareup.cash.account.backend;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zza;

/* loaded from: classes.dex */
public final class AccountSwitchScreenStateRelay implements Parcelable {
    public static final Parcelable.Creator<AccountSwitchScreenStateRelay> CREATOR = new zza(10);
    public AccountSwitcher$AccountSwitchContinuation accountSwitchContinuation;
    public AccountSwitcher$AccountSwitchingMetadata accountSwitchingMetadata;
    public String managedAccountWelcomeMessage;

    public AccountSwitchScreenStateRelay(AccountSwitcher$AccountSwitchContinuation accountSwitcher$AccountSwitchContinuation, AccountSwitcher$AccountSwitchingMetadata accountSwitcher$AccountSwitchingMetadata, String str) {
        this.accountSwitchContinuation = accountSwitcher$AccountSwitchContinuation;
        this.accountSwitchingMetadata = accountSwitcher$AccountSwitchingMetadata;
        this.managedAccountWelcomeMessage = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        AccountSwitcher$AccountSwitchContinuation accountSwitcher$AccountSwitchContinuation = this.accountSwitchContinuation;
        if (accountSwitcher$AccountSwitchContinuation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountSwitcher$AccountSwitchContinuation.writeToParcel(parcel, i);
        }
        AccountSwitcher$AccountSwitchingMetadata accountSwitcher$AccountSwitchingMetadata = this.accountSwitchingMetadata;
        if (accountSwitcher$AccountSwitchingMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountSwitcher$AccountSwitchingMetadata.writeToParcel(parcel, i);
        }
        parcel.writeString(this.managedAccountWelcomeMessage);
    }
}
