package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DependentControlsAndLimitsScreen implements Screen {
    public static final Parcelable.Creator<DependentControlsAndLimitsScreen> CREATOR = new FamilyHome.Creator(2);
    public final String dependentCustomerToken;
    public final boolean forManagedAccount;

    public DependentControlsAndLimitsScreen(String str, boolean z) {
        str.getClass();
        this.dependentCustomerToken = str;
        this.forManagedAccount = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentControlsAndLimitsScreen)) {
            return false;
        }
        DependentControlsAndLimitsScreen dependentControlsAndLimitsScreen = (DependentControlsAndLimitsScreen) obj;
        return Intrinsics.areEqual(this.dependentCustomerToken, dependentControlsAndLimitsScreen.dependentCustomerToken) && this.forManagedAccount == dependentControlsAndLimitsScreen.forManagedAccount;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.forManagedAccount) + (this.dependentCustomerToken.hashCode() * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("DependentControlsAndLimitsScreen(dependentCustomerToken=", this.dependentCustomerToken, ", forManagedAccount=", ")", this.forManagedAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.dependentCustomerToken);
        parcel.writeInt(this.forManagedAccount ? 1 : 0);
    }
}
