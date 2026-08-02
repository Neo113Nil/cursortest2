package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SponsorDetailScreen implements Screen {
    public static final Parcelable.Creator<SponsorDetailScreen> CREATOR = new FamilyHome.Creator(16);
    public final Sponsor sponsor;

    public SponsorDetailScreen(Sponsor sponsor) {
        sponsor.getClass();
        this.sponsor = sponsor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SponsorDetailScreen) && Intrinsics.areEqual(this.sponsor, ((SponsorDetailScreen) obj).sponsor);
    }

    public final int hashCode() {
        return this.sponsor.hashCode();
    }

    public final String toString() {
        return "SponsorDetailScreen(sponsor=" + this.sponsor + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.sponsor, i);
    }
}
