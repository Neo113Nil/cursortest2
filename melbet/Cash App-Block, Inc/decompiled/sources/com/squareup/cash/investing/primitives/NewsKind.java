package com.squareup.cash.investing.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.investing.primitives.FilterToken;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class NewsKind implements Parcelable {

    public final class BitcoinPortfolio extends NewsKind {
        public static final BitcoinPortfolio INSTANCE = new BitcoinPortfolio();
        public static final Parcelable.Creator<BitcoinPortfolio> CREATOR = new FilterToken.Creator(11);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BitcoinPortfolio);
        }

        public final int hashCode() {
            return 208620866;
        }

        public final String toString() {
            return "BitcoinPortfolio";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Stock extends NewsKind {
        public static final Parcelable.Creator<Stock> CREATOR = new FilterToken.Creator(12);
        public final InvestmentEntityToken token;

        public Stock(InvestmentEntityToken investmentEntityToken) {
            investmentEntityToken.getClass();
            this.token = investmentEntityToken;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stock) && Intrinsics.areEqual(this.token, ((Stock) obj).token);
        }

        public final int hashCode() {
            return this.token.value.hashCode();
        }

        public final String toString() {
            return "Stock(token=" + this.token + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.token.writeToParcel(parcel, i);
        }
    }

    public final class StocksPortfolio extends NewsKind {
        public static final StocksPortfolio INSTANCE = new StocksPortfolio();
        public static final Parcelable.Creator<StocksPortfolio> CREATOR = new FilterToken.Creator(13);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StocksPortfolio);
        }

        public final int hashCode() {
            return -548726989;
        }

        public final String toString() {
            return "StocksPortfolio";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
