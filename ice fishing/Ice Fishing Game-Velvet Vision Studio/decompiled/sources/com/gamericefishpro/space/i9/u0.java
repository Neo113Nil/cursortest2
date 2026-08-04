package com.gamericefishpro.space.i9;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ u0(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int iX = com.gamericefishpro.space.hj.c.X(parcel);
                Bundle bundleN = null;
                String strQ = null;
                boolean zM = false;
                long jP = 0;
                long jP2 = 0;
                while (parcel.dataPosition() < iX) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        jP = com.gamericefishpro.space.hj.c.P(parcel, i);
                    } else if (c == 2) {
                        jP2 = com.gamericefishpro.space.hj.c.P(parcel, i);
                    } else if (c == 3) {
                        zM = com.gamericefishpro.space.hj.c.M(parcel, i);
                    } else if (c == 7) {
                        bundleN = com.gamericefishpro.space.hj.c.n(parcel, i);
                    } else if (c != '\b') {
                        com.gamericefishpro.space.hj.c.V(parcel, i);
                    } else {
                        strQ = com.gamericefishpro.space.hj.c.q(parcel, i);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX);
                return new t0(jP, jP2, zM, bundleN, strQ);
            default:
                int iX2 = com.gamericefishpro.space.hj.c.X(parcel);
                String strQ2 = null;
                int iO = 0;
                Intent intent = null;
                while (parcel.dataPosition() < iX2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        iO = com.gamericefishpro.space.hj.c.O(parcel, i2);
                    } else if (c2 == 2) {
                        strQ2 = com.gamericefishpro.space.hj.c.q(parcel, i2);
                    } else if (c2 != 3) {
                        com.gamericefishpro.space.hj.c.V(parcel, i2);
                    } else {
                        intent = (Intent) com.gamericefishpro.space.hj.c.p(parcel, i2, Intent.CREATOR);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX2);
                return new v0(iO, strQ2, intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new t0[i];
            default:
                return new v0[i];
        }
    }
}
