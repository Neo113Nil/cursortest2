package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Line;

/* loaded from: classes3.dex */
public final class LocalMoney implements Parcelable {
    public static final Parcelable.Creator<LocalMoney> CREATOR = new Line.Creator(14);
    public static final LocalMoney Zero = new LocalMoney(0, LocalCurrencyCode.USD);
    public final long amount;
    public final LocalCurrencyCode currencyCode;

    public LocalMoney(long j, LocalCurrencyCode localCurrencyCode) {
        localCurrencyCode.getClass();
        this.amount = j;
        this.currencyCode = localCurrencyCode;
    }

    public static LocalMoney copy$default(LocalMoney localMoney, long j) {
        LocalCurrencyCode localCurrencyCode = localMoney.currencyCode;
        localMoney.getClass();
        localCurrencyCode.getClass();
        return new LocalMoney(j, localCurrencyCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMoney)) {
            return false;
        }
        LocalMoney localMoney = (LocalMoney) obj;
        return this.amount == localMoney.amount && this.currencyCode == localMoney.currencyCode;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final int hashCode() {
        return this.currencyCode.hashCode() + (Long.hashCode(this.amount) * 31);
    }

    public final String toString() {
        return "LocalMoney(amount=" + this.amount + ", currencyCode=" + this.currencyCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.amount);
        parcel.writeString(this.currencyCode.name());
    }
}
