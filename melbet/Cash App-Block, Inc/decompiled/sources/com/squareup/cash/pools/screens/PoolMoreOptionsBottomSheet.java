package com.squareup.cash.pools.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.pools.MoneyPoolVisitOrigin;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PoolMoreOptionsBottomSheet implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<PoolMoreOptionsBottomSheet> CREATOR = new PdfScreen.Creator(11);
    public final String flowToken;
    public final MoneyPoolVisitOrigin leavePoolOrigin;
    public final Redacted pool;
    public final boolean viewerCanLeavePool;

    public PoolMoreOptionsBottomSheet(Redacted redacted, boolean z, String str, MoneyPoolVisitOrigin moneyPoolVisitOrigin) {
        redacted.getClass();
        str.getClass();
        this.pool = redacted;
        this.viewerCanLeavePool = z;
        this.flowToken = str;
        this.leavePoolOrigin = moneyPoolVisitOrigin;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoolMoreOptionsBottomSheet)) {
            return false;
        }
        PoolMoreOptionsBottomSheet poolMoreOptionsBottomSheet = (PoolMoreOptionsBottomSheet) obj;
        return Intrinsics.areEqual(this.pool, poolMoreOptionsBottomSheet.pool) && this.viewerCanLeavePool == poolMoreOptionsBottomSheet.viewerCanLeavePool && Intrinsics.areEqual(this.flowToken, poolMoreOptionsBottomSheet.flowToken) && this.leavePoolOrigin == poolMoreOptionsBottomSheet.leavePoolOrigin;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.pool.hashCode() * 31, 31, this.viewerCanLeavePool), 31, this.flowToken);
        MoneyPoolVisitOrigin moneyPoolVisitOrigin = this.leavePoolOrigin;
        return m + (moneyPoolVisitOrigin == null ? 0 : moneyPoolVisitOrigin.hashCode());
    }

    public final String toString() {
        return "PoolMoreOptionsBottomSheet(pool=" + this.pool + ", viewerCanLeavePool=" + this.viewerCanLeavePool + ", flowToken=" + this.flowToken + ", leavePoolOrigin=" + this.leavePoolOrigin + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.pool, i);
        parcel.writeInt(this.viewerCanLeavePool ? 1 : 0);
        parcel.writeString(this.flowToken);
        MoneyPoolVisitOrigin moneyPoolVisitOrigin = this.leavePoolOrigin;
        if (moneyPoolVisitOrigin == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(moneyPoolVisitOrigin.name());
        }
    }
}
