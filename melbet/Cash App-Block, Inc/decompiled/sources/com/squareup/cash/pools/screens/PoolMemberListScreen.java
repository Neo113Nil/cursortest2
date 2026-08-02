package com.squareup.cash.pools.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.pools.MoneyPoolVisitOrigin;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PoolMemberListScreen implements Screen {
    public static final Parcelable.Creator<PoolMemberListScreen> CREATOR = new PdfScreen.Creator(10);
    public final double contributionTotal;
    public final String flowToken;
    public final double goalAmount;
    public final boolean isPoolClosed;
    public final MoneyPoolVisitOrigin leavePoolOrigin;
    public final Redacted participants;
    public final Redacted poolOwner;
    public final String shareUrl;
    public final String token;
    public final boolean viewerCanLeavePool;

    public PoolMemberListScreen(String str, Redacted redacted, Redacted redacted2, String str2, boolean z, String str3, double d, double d2, boolean z2, MoneyPoolVisitOrigin moneyPoolVisitOrigin) {
        str.getClass();
        redacted.getClass();
        redacted2.getClass();
        str3.getClass();
        this.token = str;
        this.poolOwner = redacted;
        this.participants = redacted2;
        this.shareUrl = str2;
        this.viewerCanLeavePool = z;
        this.flowToken = str3;
        this.goalAmount = d;
        this.contributionTotal = d2;
        this.isPoolClosed = z2;
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
        if (!(obj instanceof PoolMemberListScreen)) {
            return false;
        }
        PoolMemberListScreen poolMemberListScreen = (PoolMemberListScreen) obj;
        return Intrinsics.areEqual(this.token, poolMemberListScreen.token) && Intrinsics.areEqual(this.poolOwner, poolMemberListScreen.poolOwner) && Intrinsics.areEqual(this.participants, poolMemberListScreen.participants) && Intrinsics.areEqual(this.shareUrl, poolMemberListScreen.shareUrl) && this.viewerCanLeavePool == poolMemberListScreen.viewerCanLeavePool && Intrinsics.areEqual(this.flowToken, poolMemberListScreen.flowToken) && Double.compare(this.goalAmount, poolMemberListScreen.goalAmount) == 0 && Double.compare(this.contributionTotal, poolMemberListScreen.contributionTotal) == 0 && this.isPoolClosed == poolMemberListScreen.isPoolClosed && this.leavePoolOrigin == poolMemberListScreen.leavePoolOrigin;
    }

    public final int hashCode() {
        int m = re$$ExternalSyntheticOutline0.m(this.participants, re$$ExternalSyntheticOutline0.m(this.poolOwner, this.token.hashCode() * 31, 31), 31);
        String str = this.shareUrl;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Fragment$5$$ExternalSyntheticOutline0.m(this.contributionTotal, Fragment$5$$ExternalSyntheticOutline0.m(this.goalAmount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.viewerCanLeavePool), 31, this.flowToken), 31), 31), 31, this.isPoolClosed);
        MoneyPoolVisitOrigin moneyPoolVisitOrigin = this.leavePoolOrigin;
        return m2 + (moneyPoolVisitOrigin != null ? moneyPoolVisitOrigin.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoolMemberListScreen(token=");
        sb.append(this.token);
        sb.append(", poolOwner=");
        sb.append(this.poolOwner);
        sb.append(", participants=");
        sb.append(this.participants);
        sb.append(", shareUrl=");
        sb.append(this.shareUrl);
        sb.append(", viewerCanLeavePool=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.viewerCanLeavePool, ", flowToken=", this.flowToken, ", goalAmount=");
        sb.append(this.goalAmount);
        sb.append(", contributionTotal=");
        sb.append(this.contributionTotal);
        sb.append(", isPoolClosed=");
        sb.append(this.isPoolClosed);
        sb.append(", leavePoolOrigin=");
        sb.append(this.leavePoolOrigin);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeParcelable(this.poolOwner, i);
        parcel.writeParcelable(this.participants, i);
        parcel.writeString(this.shareUrl);
        parcel.writeInt(this.viewerCanLeavePool ? 1 : 0);
        parcel.writeString(this.flowToken);
        parcel.writeDouble(this.goalAmount);
        parcel.writeDouble(this.contributionTotal);
        parcel.writeInt(this.isPoolClosed ? 1 : 0);
        MoneyPoolVisitOrigin moneyPoolVisitOrigin = this.leavePoolOrigin;
        if (moneyPoolVisitOrigin == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(moneyPoolVisitOrigin.name());
        }
    }
}
