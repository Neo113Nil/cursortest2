package com.squareup.cash.promotionsreferrals.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.cdf.promotions.PromotionsSourceScreen;
import com.squareup.cash.profile.viewmodels.Alias;

/* loaded from: classes.dex */
public final class PromotionsReferralsScreen$PromotionsReferralsHomeScreen implements Screen {
    public static final Parcelable.Creator<PromotionsReferralsScreen$PromotionsReferralsHomeScreen> CREATOR = new Alias.Creator(26);
    public final PromotionsSourceScreen sourceScreen;

    public PromotionsReferralsScreen$PromotionsReferralsHomeScreen(PromotionsSourceScreen promotionsSourceScreen) {
        promotionsSourceScreen.getClass();
        this.sourceScreen = promotionsSourceScreen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PromotionsReferralsScreen$PromotionsReferralsHomeScreen) && this.sourceScreen == ((PromotionsReferralsScreen$PromotionsReferralsHomeScreen) obj).sourceScreen;
    }

    public final int hashCode() {
        return this.sourceScreen.hashCode();
    }

    public final String toString() {
        return "PromotionsReferralsHomeScreen(sourceScreen=" + this.sourceScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.sourceScreen.name());
    }

    public /* synthetic */ PromotionsReferralsScreen$PromotionsReferralsHomeScreen() {
        this(PromotionsSourceScreen.PROMOTIONS_HOME);
    }
}
