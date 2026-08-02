package com.squareup.cash.investing.presenters;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.investing.primitives.FilterToken;

/* loaded from: classes6.dex */
public final class InvestmentOrderPresenter$Empty implements Screen {
    public static final InvestmentOrderPresenter$Empty INSTANCE = new InvestmentOrderPresenter$Empty();
    public static final Parcelable.Creator<InvestmentOrderPresenter$Empty> CREATOR = new FilterToken.Creator(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof InvestmentOrderPresenter$Empty);
    }

    public final int hashCode() {
        return -834263108;
    }

    public final String toString() {
        return "Empty";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
