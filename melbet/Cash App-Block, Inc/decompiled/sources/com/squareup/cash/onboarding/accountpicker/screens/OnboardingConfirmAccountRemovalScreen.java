package com.squareup.cash.onboarding.accountpicker.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.nearby.viewmodels.ListSection;
import com.squareup.protos.franklin.app.AccountListConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OnboardingConfirmAccountRemovalScreen implements DialogScreen {
    public static final Parcelable.Creator<OnboardingConfirmAccountRemovalScreen> CREATOR = new ListSection.Creator(26);
    public final AccountListConfig.Account account;

    public OnboardingConfirmAccountRemovalScreen(AccountListConfig.Account account) {
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
        return (obj instanceof OnboardingConfirmAccountRemovalScreen) && Intrinsics.areEqual(this.account, ((OnboardingConfirmAccountRemovalScreen) obj).account);
    }

    public final int hashCode() {
        return this.account.hashCode();
    }

    public final String toString() {
        return "OnboardingConfirmAccountRemovalScreen(account=" + this.account + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.account, i);
    }
}
