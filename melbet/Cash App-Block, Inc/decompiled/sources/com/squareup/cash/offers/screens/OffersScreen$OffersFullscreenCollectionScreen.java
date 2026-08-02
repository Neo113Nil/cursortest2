package com.squareup.cash.offers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.nearby.viewmodels.ListSection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OffersScreen$OffersFullscreenCollectionScreen implements Screen, RestoringScreen {
    public static final Parcelable.Creator<OffersScreen$OffersFullscreenCollectionScreen> CREATOR = new ListSection.Creator(8);
    public final String collectionToken;

    public OffersScreen$OffersFullscreenCollectionScreen(String str) {
        str.getClass();
        this.collectionToken = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OffersScreen$OffersFullscreenCollectionScreen) && Intrinsics.areEqual(this.collectionToken, ((OffersScreen$OffersFullscreenCollectionScreen) obj).collectionToken);
    }

    public final int hashCode() {
        return this.collectionToken.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OffersFullscreenCollectionScreen(collectionToken=", this.collectionToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.collectionToken);
    }
}
