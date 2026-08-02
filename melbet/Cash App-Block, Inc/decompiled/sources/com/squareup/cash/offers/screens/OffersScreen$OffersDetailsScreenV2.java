package com.squareup.cash.offers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.nearby.viewmodels.ListSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OffersScreen$OffersDetailsScreenV2 implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<OffersScreen$OffersDetailsScreenV2> CREATOR = new ListSection.Creator(6);
    public final BlockersData.MoneybotContext moneybotContext;
    public final String token;

    public OffersScreen$OffersDetailsScreenV2(String str, BlockersData.MoneybotContext moneybotContext) {
        str.getClass();
        this.token = str;
        this.moneybotContext = moneybotContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersScreen$OffersDetailsScreenV2)) {
            return false;
        }
        OffersScreen$OffersDetailsScreenV2 offersScreen$OffersDetailsScreenV2 = (OffersScreen$OffersDetailsScreenV2) obj;
        return Intrinsics.areEqual(this.token, offersScreen$OffersDetailsScreenV2.token) && Intrinsics.areEqual(this.moneybotContext, offersScreen$OffersDetailsScreenV2.moneybotContext);
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        BlockersData.MoneybotContext moneybotContext = this.moneybotContext;
        return hashCode + (moneybotContext == null ? 0 : moneybotContext.hashCode());
    }

    public final String toString() {
        return "OffersDetailsScreenV2(token=" + this.token + ", moneybotContext=" + this.moneybotContext + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeParcelable(this.moneybotContext, i);
    }
}
