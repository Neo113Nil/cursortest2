package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DependentDetailScreen implements Screen {
    public static final Parcelable.Creator<DependentDetailScreen> CREATOR = new FamilyHome.Creator(4);
    public final String dependentCustomerToken;

    public DependentDetailScreen(String str) {
        str.getClass();
        this.dependentCustomerToken = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DependentDetailScreen) && Intrinsics.areEqual(this.dependentCustomerToken, ((DependentDetailScreen) obj).dependentCustomerToken);
    }

    public final int hashCode() {
        return this.dependentCustomerToken.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DependentDetailScreen(dependentCustomerToken=", this.dependentCustomerToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.dependentCustomerToken);
    }
}
