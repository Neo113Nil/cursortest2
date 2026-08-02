package com.squareup.cash.pools.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PoolContributeScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<PoolContributeScreen> CREATOR = new PdfScreen.Creator(5);
    public final String flowToken;
    public final Redacted ownerName;
    public final Redacted ownerToken;
    public final Redacted pool;
    public final Money poolBalance;
    public final Long poolCreditCardBps;
    public final Redacted poolName;
    public final String poolToken;

    public PoolContributeScreen(Redacted redacted, Redacted redacted2, String str, Redacted redacted3, Money money, Long l, String str2, Redacted redacted4) {
        redacted.getClass();
        redacted2.getClass();
        str.getClass();
        redacted3.getClass();
        money.getClass();
        str2.getClass();
        this.ownerName = redacted;
        this.ownerToken = redacted2;
        this.poolToken = str;
        this.poolName = redacted3;
        this.poolBalance = money;
        this.poolCreditCardBps = l;
        this.flowToken = str2;
        this.pool = redacted4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoolContributeScreen)) {
            return false;
        }
        PoolContributeScreen poolContributeScreen = (PoolContributeScreen) obj;
        return Intrinsics.areEqual(this.ownerName, poolContributeScreen.ownerName) && Intrinsics.areEqual(this.ownerToken, poolContributeScreen.ownerToken) && Intrinsics.areEqual(this.poolToken, poolContributeScreen.poolToken) && Intrinsics.areEqual(this.poolName, poolContributeScreen.poolName) && Intrinsics.areEqual(this.poolBalance, poolContributeScreen.poolBalance) && Intrinsics.areEqual(this.poolCreditCardBps, poolContributeScreen.poolCreditCardBps) && Intrinsics.areEqual(this.flowToken, poolContributeScreen.flowToken) && Intrinsics.areEqual(this.pool, poolContributeScreen.pool);
    }

    public final int hashCode() {
        int m = NavAction$$ExternalSyntheticOutline0.m(this.poolBalance, re$$ExternalSyntheticOutline0.m(this.poolName, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(re$$ExternalSyntheticOutline0.m(this.ownerToken, this.ownerName.hashCode() * 31, 31), 31, this.poolToken), 31), 31);
        Long l = this.poolCreditCardBps;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (l == null ? 0 : l.hashCode())) * 31, 31, this.flowToken);
        Redacted redacted = this.pool;
        return m2 + (redacted != null ? redacted.hashCode() : 0);
    }

    public final String toString() {
        return "PoolContributeScreen(ownerName=" + this.ownerName + ", ownerToken=" + this.ownerToken + ", poolToken=" + this.poolToken + ", poolName=" + this.poolName + ", poolBalance=" + this.poolBalance + ", poolCreditCardBps=" + this.poolCreditCardBps + ", flowToken=" + this.flowToken + ", pool=" + this.pool + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.ownerName, i);
        parcel.writeParcelable(this.ownerToken, i);
        parcel.writeString(this.poolToken);
        parcel.writeParcelable(this.poolName, i);
        parcel.writeParcelable(this.poolBalance, i);
        Long l = this.poolCreditCardBps;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
        }
        parcel.writeString(this.flowToken);
        parcel.writeParcelable(this.pool, i);
    }
}
