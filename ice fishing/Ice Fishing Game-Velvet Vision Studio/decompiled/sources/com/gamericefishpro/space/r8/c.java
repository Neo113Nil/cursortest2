package com.gamericefishpro.space.r8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int iX = com.gamericefishpro.space.hj.c.X(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iX) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        com.gamericefishpro.space.hj.c.V(parcel, i);
                    } else {
                        intent = (Intent) com.gamericefishpro.space.hj.c.p(parcel, i, Intent.CREATOR);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new a[i];
            default:
                return new g[i];
        }
    }
}
