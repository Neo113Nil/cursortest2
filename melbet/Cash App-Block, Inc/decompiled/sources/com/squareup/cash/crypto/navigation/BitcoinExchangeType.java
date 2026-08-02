package com.squareup.cash.crypto.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.composable.adapter.ViewStateId;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface BitcoinExchangeType extends Parcelable {

    public final class BuyBitcoin implements BitcoinExchangeType {
        public static final Parcelable.Creator<BuyBitcoin> CREATOR = new ViewStateId.Creator(19);
        public final Money money;
        public final CurrencyCode targetCurrency;

        public BuyBitcoin(Money money, CurrencyCode currencyCode) {
            money.getClass();
            currencyCode.getClass();
            this.money = money;
            this.targetCurrency = currencyCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuyBitcoin)) {
                return false;
            }
            BuyBitcoin buyBitcoin = (BuyBitcoin) obj;
            return Intrinsics.areEqual(this.money, buyBitcoin.money) && this.targetCurrency == buyBitcoin.targetCurrency;
        }

        @Override // com.squareup.cash.crypto.navigation.BitcoinExchangeType
        public final CurrencyCode getSourceCurrency() {
            CurrencyCode currencyCode = this.money.currency_code;
            currencyCode.getClass();
            return currencyCode;
        }

        @Override // com.squareup.cash.crypto.navigation.BitcoinExchangeType
        public final CurrencyCode getTargetCurrency() {
            return this.targetCurrency;
        }

        public final int hashCode() {
            return this.targetCurrency.hashCode() + (this.money.hashCode() * 31);
        }

        public final String toString() {
            return "BuyBitcoin(money=" + this.money + ", targetCurrency=" + this.targetCurrency + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.money, i);
            parcel.writeString(this.targetCurrency.name());
        }
    }

    public final class ConvertToBitcoin implements BitcoinExchangeType {
        public static final Parcelable.Creator<ConvertToBitcoin> CREATOR = new ViewStateId.Creator(22);
        public final CurrencyCode sourceCurrency;
        public final CurrencyCode targetCurrency;

        /* renamed from: type, reason: collision with root package name */
        public final ConvertToBitcoinType f1118type;

        public interface ConvertToBitcoinType extends Parcelable {

            public final class ConvertAll implements ConvertToBitcoinType {
                public static final ConvertAll INSTANCE = new ConvertAll();
                public static final Parcelable.Creator<ConvertAll> CREATOR = new ViewStateId.Creator(20);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof ConvertAll);
                }

                public final int hashCode() {
                    return -291884794;
                }

                public final String toString() {
                    return "ConvertAll";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            public final class ConvertSome implements ConvertToBitcoinType {
                public static final Parcelable.Creator<ConvertSome> CREATOR = new ViewStateId.Creator(21);
                public final Money money;

                public ConvertSome(Money money) {
                    money.getClass();
                    this.money = money;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ConvertSome) && Intrinsics.areEqual(this.money, ((ConvertSome) obj).money);
                }

                public final int hashCode() {
                    return this.money.hashCode();
                }

                public final String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(this.money, "ConvertSome(money=", ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeParcelable(this.money, i);
                }
            }
        }

        public ConvertToBitcoin(ConvertToBitcoinType convertToBitcoinType) {
            convertToBitcoinType.getClass();
            this.f1118type = convertToBitcoinType;
            this.targetCurrency = CurrencyCode.BTC;
            this.sourceCurrency = CurrencyCode.XUS;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConvertToBitcoin) && Intrinsics.areEqual(this.f1118type, ((ConvertToBitcoin) obj).f1118type);
        }

        @Override // com.squareup.cash.crypto.navigation.BitcoinExchangeType
        public final CurrencyCode getSourceCurrency() {
            return this.sourceCurrency;
        }

        @Override // com.squareup.cash.crypto.navigation.BitcoinExchangeType
        public final CurrencyCode getTargetCurrency() {
            return this.targetCurrency;
        }

        public final int hashCode() {
            return this.f1118type.hashCode();
        }

        public final String toString() {
            return "ConvertToBitcoin(type=" + this.f1118type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f1118type, i);
        }
    }

    public final class SellAllBitcoin implements BitcoinExchangeType {
        public static final Parcelable.Creator<SellAllBitcoin> CREATOR = new ViewStateId.Creator(23);
        public final CurrencyCode sourceCurrency;
        public final CurrencyCode targetCurrency;

        public SellAllBitcoin(CurrencyCode currencyCode, CurrencyCode currencyCode2) {
            currencyCode.getClass();
            currencyCode2.getClass();
            this.targetCurrency = currencyCode;
            this.sourceCurrency = currencyCode2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SellAllBitcoin)) {
                return false;
            }
            SellAllBitcoin sellAllBitcoin = (SellAllBitcoin) obj;
            return this.targetCurrency == sellAllBitcoin.targetCurrency && this.sourceCurrency == sellAllBitcoin.sourceCurrency;
        }

        @Override // com.squareup.cash.crypto.navigation.BitcoinExchangeType
        public final CurrencyCode getSourceCurrency() {
            return this.sourceCurrency;
        }

        @Override // com.squareup.cash.crypto.navigation.BitcoinExchangeType
        public final CurrencyCode getTargetCurrency() {
            return this.targetCurrency;
        }

        public final int hashCode() {
            return this.sourceCurrency.hashCode() + (this.targetCurrency.hashCode() * 31);
        }

        public final String toString() {
            return "SellAllBitcoin(targetCurrency=" + this.targetCurrency + ", sourceCurrency=" + this.sourceCurrency + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.targetCurrency.name());
            parcel.writeString(this.sourceCurrency.name());
        }
    }

    public final class SellBitcoin implements BitcoinExchangeType {
        public static final Parcelable.Creator<SellBitcoin> CREATOR = new ViewStateId.Creator(24);
        public final Money money;
        public final CurrencyCode sourceCurrency;

        public SellBitcoin(Money money, CurrencyCode currencyCode) {
            money.getClass();
            currencyCode.getClass();
            this.money = money;
            this.sourceCurrency = currencyCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SellBitcoin)) {
                return false;
            }
            SellBitcoin sellBitcoin = (SellBitcoin) obj;
            return Intrinsics.areEqual(this.money, sellBitcoin.money) && this.sourceCurrency == sellBitcoin.sourceCurrency;
        }

        @Override // com.squareup.cash.crypto.navigation.BitcoinExchangeType
        public final CurrencyCode getSourceCurrency() {
            return this.sourceCurrency;
        }

        @Override // com.squareup.cash.crypto.navigation.BitcoinExchangeType
        public final CurrencyCode getTargetCurrency() {
            CurrencyCode currencyCode = this.money.currency_code;
            currencyCode.getClass();
            return currencyCode;
        }

        public final int hashCode() {
            return this.sourceCurrency.hashCode() + (this.money.hashCode() * 31);
        }

        public final String toString() {
            return "SellBitcoin(money=" + this.money + ", sourceCurrency=" + this.sourceCurrency + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.money, i);
            parcel.writeString(this.sourceCurrency.name());
        }
    }

    CurrencyCode getSourceCurrency();

    CurrencyCode getTargetCurrency();
}
