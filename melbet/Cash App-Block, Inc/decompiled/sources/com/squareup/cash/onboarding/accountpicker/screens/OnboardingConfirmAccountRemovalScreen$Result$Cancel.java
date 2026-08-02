package com.squareup.cash.onboarding.accountpicker.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.nearby.viewmodels.ListSection;
import com.squareup.protos.franklin.app.AccountListConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OnboardingConfirmAccountRemovalScreen$Result$Cancel implements Parcelable {
    public static final Parcelable.Creator<OnboardingConfirmAccountRemovalScreen$Result$Cancel> CREATOR = new ListSection.Creator(27);
    public final AccountListConfig.Account account;

    public OnboardingConfirmAccountRemovalScreen$Result$Cancel(AccountListConfig.Account account) {
        account.getClass();
        this.account = account;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnboardingConfirmAccountRemovalScreen$Result$Cancel) && Intrinsics.areEqual(this.account, ((OnboardingConfirmAccountRemovalScreen$Result$Cancel) obj).account);
    }

    public final int hashCode() {
        return this.account.hashCode();
    }

    public final String toString() {
        return "Cancel(account=" + this.account + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.account, i);
    }
}
