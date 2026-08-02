package com.squareup.cash.investing.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.investing.primitives.FilterToken;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestmentEntityToken implements Parcelable {
    public static final Parcelable.Creator<InvestmentEntityToken> CREATOR = new FilterToken.Creator(10);
    public final String value;

    public InvestmentEntityToken(String str) {
        str.getClass();
        this.value = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvestmentEntityToken) && Intrinsics.areEqual(this.value, ((InvestmentEntityToken) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InvestmentEntityToken(value=", this.value, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
    }
}
