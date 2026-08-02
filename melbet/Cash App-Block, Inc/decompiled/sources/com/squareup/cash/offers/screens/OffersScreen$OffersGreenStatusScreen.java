package com.squareup.cash.offers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.nearby.viewmodels.ListSection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OffersScreen$OffersGreenStatusScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<OffersScreen$OffersGreenStatusScreen> CREATOR = new ListSection.Creator(9);
    public final String rewardToken;

    public OffersScreen$OffersGreenStatusScreen(String str) {
        str.getClass();
        this.rewardToken = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OffersScreen$OffersGreenStatusScreen) && Intrinsics.areEqual(this.rewardToken, ((OffersScreen$OffersGreenStatusScreen) obj).rewardToken);
    }

    public final int hashCode() {
        return this.rewardToken.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OffersGreenStatusScreen(rewardToken=", this.rewardToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.rewardToken);
    }
}
