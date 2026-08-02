package com.squareup.cash.onboarding.accountpicker.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.nearby.viewmodels.ListSection;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AccountListConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OnboardingAliasPickerScreen implements Screen {
    public static final Parcelable.Creator<OnboardingAliasPickerScreen> CREATOR = new ListSection.Creator(25);
    public final AccountListConfig.Account account;
    public final ClientScenario clientScenario;

    public OnboardingAliasPickerScreen(AccountListConfig.Account account, ClientScenario clientScenario) {
        account.getClass();
        clientScenario.getClass();
        this.account = account;
        this.clientScenario = clientScenario;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingAliasPickerScreen)) {
            return false;
        }
        OnboardingAliasPickerScreen onboardingAliasPickerScreen = (OnboardingAliasPickerScreen) obj;
        return Intrinsics.areEqual(this.account, onboardingAliasPickerScreen.account) && this.clientScenario == onboardingAliasPickerScreen.clientScenario;
    }

    public final int hashCode() {
        return this.clientScenario.hashCode() + (this.account.hashCode() * 31);
    }

    public final String toString() {
        return "OnboardingAliasPickerScreen(account=" + this.account + ", clientScenario=" + this.clientScenario + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.account, i);
        parcel.writeString(this.clientScenario.name());
    }
}
