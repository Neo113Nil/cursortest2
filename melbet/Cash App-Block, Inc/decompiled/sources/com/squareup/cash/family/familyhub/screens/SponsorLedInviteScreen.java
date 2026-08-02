package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SponsorLedInviteScreen implements Screen {
    public static final Parcelable.Creator<SponsorLedInviteScreen> CREATOR = new FamilyHome.Creator(17);
    public final Sponsor sponsor;

    public SponsorLedInviteScreen(Sponsor sponsor) {
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
        return (obj instanceof SponsorLedInviteScreen) && Intrinsics.areEqual(this.sponsor, ((SponsorLedInviteScreen) obj).sponsor);
    }

    public final int hashCode() {
        return this.sponsor.hashCode();
    }

    public final String toString() {
        return "SponsorLedInviteScreen(sponsor=" + this.sponsor + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.sponsor, i);
    }
}
