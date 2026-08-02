package com.squareup.cash.pools.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.cdf.asset.AssetPoolPoolHomeView;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.protos.cash.pools.MoneyPool;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PoolDetailsScreen implements Screen {
    public static final Parcelable.Creator<PoolDetailsScreen> CREATOR = new PdfScreen.Creator(6);
    public final String flowToken;
    public final Money lastBalance;
    public final String origin;
    public final MoneyPool pool;
    public final AssetPoolPoolHomeView.ViewHomeSource source;
    public final String token;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PoolDetailsScreen(java.lang.String r8, java.lang.String r9, com.squareup.protos.cash.pools.MoneyPool r10, java.lang.String r11, com.squareup.cash.cdf.asset.AssetPoolPoolHomeView.ViewHomeSource r12, com.squareup.protos.common.Money r13, int r14) {
        /*
            r7 = this;
            r0 = r14 & 2
            if (r0 == 0) goto L6
            java.lang.String r9 = ""
        L6:
            r2 = r9
            r9 = r14 & 4
            r0 = 0
            if (r9 == 0) goto Le
            r3 = r0
            goto Lf
        Le:
            r3 = r10
        Lf:
            r9 = r14 & 8
            if (r9 == 0) goto L15
            r4 = r0
            goto L16
        L15:
            r4 = r11
        L16:
            r9 = r14 & 16
            if (r9 == 0) goto L1c
            r5 = r0
            goto L1d
        L1c:
            r5 = r12
        L1d:
            r9 = r14 & 32
            if (r9 == 0) goto L25
            r6 = r0
            r1 = r8
            r0 = r7
            goto L28
        L25:
            r6 = r13
            r0 = r7
            r1 = r8
        L28:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.pools.screens.PoolDetailsScreen.<init>(java.lang.String, java.lang.String, com.squareup.protos.cash.pools.MoneyPool, java.lang.String, com.squareup.cash.cdf.asset.AssetPoolPoolHomeView$ViewHomeSource, com.squareup.protos.common.Money, int):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoolDetailsScreen)) {
            return false;
        }
        PoolDetailsScreen poolDetailsScreen = (PoolDetailsScreen) obj;
        return Intrinsics.areEqual(this.token, poolDetailsScreen.token) && Intrinsics.areEqual(this.origin, poolDetailsScreen.origin) && Intrinsics.areEqual(this.pool, poolDetailsScreen.pool) && Intrinsics.areEqual(this.flowToken, poolDetailsScreen.flowToken) && this.source == poolDetailsScreen.source && Intrinsics.areEqual(this.lastBalance, poolDetailsScreen.lastBalance);
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        String str = this.origin;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        MoneyPool moneyPool = this.pool;
        int hashCode3 = (hashCode2 + (moneyPool == null ? 0 : moneyPool.hashCode())) * 31;
        String str2 = this.flowToken;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AssetPoolPoolHomeView.ViewHomeSource viewHomeSource = this.source;
        int hashCode5 = (hashCode4 + (viewHomeSource == null ? 0 : viewHomeSource.hashCode())) * 31;
        Money money = this.lastBalance;
        return hashCode5 + (money != null ? money.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PoolDetailsScreen(token=", this.token, ", origin=", this.origin, ", pool=");
        m.append(this.pool);
        m.append(", flowToken=");
        m.append(this.flowToken);
        m.append(", source=");
        m.append(this.source);
        m.append(", lastBalance=");
        m.append(this.lastBalance);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeString(this.origin);
        parcel.writeParcelable(this.pool, i);
        parcel.writeString(this.flowToken);
        AssetPoolPoolHomeView.ViewHomeSource viewHomeSource = this.source;
        if (viewHomeSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(viewHomeSource.name());
        }
        parcel.writeParcelable(this.lastBalance, i);
    }

    public PoolDetailsScreen(String str, String str2, MoneyPool moneyPool, String str3, AssetPoolPoolHomeView.ViewHomeSource viewHomeSource, Money money) {
        str.getClass();
        this.token = str;
        this.origin = str2;
        this.pool = moneyPool;
        this.flowToken = str3;
        this.source = viewHomeSource;
        this.lastBalance = money;
    }
}
