package com.squareup.cash.instruments.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BalanceSnapshot implements Parcelable {
    public static final Parcelable.Creator<BalanceSnapshot> CREATOR = new Instrument.Creator(3);
    public final Money balance;
    public final String token;
    public final Long version;

    public BalanceSnapshot(String str, Money money, Long l) {
        str.getClass();
        money.getClass();
        this.token = str;
        this.balance = money;
        this.version = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalanceSnapshot)) {
            return false;
        }
        BalanceSnapshot balanceSnapshot = (BalanceSnapshot) obj;
        return Intrinsics.areEqual(this.token, balanceSnapshot.token) && Intrinsics.areEqual(this.balance, balanceSnapshot.balance) && Intrinsics.areEqual(this.version, balanceSnapshot.version);
    }

    public final int hashCode() {
        int m = NavAction$$ExternalSyntheticOutline0.m(this.balance, this.token.hashCode() * 31, 31);
        Long l = this.version;
        return m + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BalanceSnapshot(token=");
        sb.append(this.token);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", version=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.version, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeParcelable(this.balance, i);
        Long l = this.version;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
        }
    }
}
