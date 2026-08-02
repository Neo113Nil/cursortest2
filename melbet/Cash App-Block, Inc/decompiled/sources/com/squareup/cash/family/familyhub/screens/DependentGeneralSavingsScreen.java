package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DependentGeneralSavingsScreen implements Screen {
    public static final Parcelable.Creator<DependentGeneralSavingsScreen> CREATOR = new FamilyHome.Creator(5);
    public final String dependentCustomerToken;
    public final SavingsScreen.ScreenType screenType;

    public DependentGeneralSavingsScreen(String str, SavingsScreen.ScreenType screenType) {
        str.getClass();
        screenType.getClass();
        this.dependentCustomerToken = str;
        this.screenType = screenType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentGeneralSavingsScreen)) {
            return false;
        }
        DependentGeneralSavingsScreen dependentGeneralSavingsScreen = (DependentGeneralSavingsScreen) obj;
        return Intrinsics.areEqual(this.dependentCustomerToken, dependentGeneralSavingsScreen.dependentCustomerToken) && Intrinsics.areEqual(this.screenType, dependentGeneralSavingsScreen.screenType);
    }

    public final int hashCode() {
        return this.screenType.hashCode() + (this.dependentCustomerToken.hashCode() * 31);
    }

    public final String toString() {
        return "DependentGeneralSavingsScreen(dependentCustomerToken=" + this.dependentCustomerToken + ", screenType=" + this.screenType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.dependentCustomerToken);
        parcel.writeParcelable(this.screenType, i);
    }
}
