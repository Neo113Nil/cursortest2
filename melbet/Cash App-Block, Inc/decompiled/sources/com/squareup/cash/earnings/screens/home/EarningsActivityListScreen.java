package com.squareup.cash.earnings.screens.home;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class EarningsActivityListScreen implements Screen {
    public static final Parcelable.Creator<EarningsActivityListScreen> CREATOR = new AddPayerCustomersScreen.Creator(14);
    public final String streamIdentifier;

    public EarningsActivityListScreen(String str) {
        this.streamIdentifier = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EarningsActivityListScreen) && Intrinsics.areEqual(this.streamIdentifier, ((EarningsActivityListScreen) obj).streamIdentifier);
    }

    public final int hashCode() {
        String str = this.streamIdentifier;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EarningsActivityListScreen(streamIdentifier=", this.streamIdentifier, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.streamIdentifier);
    }
}
