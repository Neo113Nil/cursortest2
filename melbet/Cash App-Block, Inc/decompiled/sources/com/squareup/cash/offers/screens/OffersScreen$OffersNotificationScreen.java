package com.squareup.cash.offers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.nearby.viewmodels.ListSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OffersScreen$OffersNotificationScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<OffersScreen$OffersNotificationScreen> CREATOR = new ListSection.Creator(13);
    public final long duration;
    public final String message;

    public OffersScreen$OffersNotificationScreen(String str, long j) {
        str.getClass();
        this.message = str;
        this.duration = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersScreen$OffersNotificationScreen)) {
            return false;
        }
        OffersScreen$OffersNotificationScreen offersScreen$OffersNotificationScreen = (OffersScreen$OffersNotificationScreen) obj;
        return Intrinsics.areEqual(this.message, offersScreen$OffersNotificationScreen.message) && this.duration == offersScreen$OffersNotificationScreen.duration;
    }

    public final int hashCode() {
        return Long.hashCode(this.duration) + (this.message.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("OffersNotificationScreen(message=", this.message, ", duration=", this.duration);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.message);
        parcel.writeLong(this.duration);
    }
}
