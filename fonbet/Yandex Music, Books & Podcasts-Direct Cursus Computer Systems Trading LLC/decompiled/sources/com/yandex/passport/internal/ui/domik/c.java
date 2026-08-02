package com.yandex.passport.internal.ui.domik;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.w0;
import defpackage.vwb;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.EnumSet;

/* loaded from: classes4.dex */
public final class c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                parcel.getClass();
                com.yandex.passport.internal.properties.l createFromParcel = com.yandex.passport.internal.properties.l.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean z = true;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                com.yandex.passport.internal.l createFromParcel2 = parcel.readInt() == 0 ? null : com.yandex.passport.internal.l.CREATOR.createFromParcel(parcel);
                com.yandex.passport.internal.network.response.a valueOf = parcel.readInt() == 0 ? null : com.yandex.passport.internal.network.response.a.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList.add(com.yandex.passport.internal.network.response.b.valueOf(parcel.readString()));
                    }
                }
                return new d(createFromParcel, readString, readString2, z, readString3, readString4, createFromParcel2, valueOf, arrayList, parcel.readString(), com.yandex.passport.internal.analytics.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? d.CREATOR.createFromParcel(parcel) : null, parcel.readString(), b0.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 1:
                parcel.getClass();
                return new g((t) parcel.readParcelable(g.class.getClassLoader()), parcel.readString());
            case 2:
                parcel.getClass();
                return new p(parcel.readString());
            case 3:
                parcel.getClass();
                return new q(com.yandex.passport.internal.a0.CREATOR.createFromParcel(parcel));
            case 4:
                parcel.getClass();
                Bundle readBundle = parcel.readBundle(com.yandex.passport.internal.l.class.getClassLoader());
                readBundle.getClass();
                Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(readBundle, com.yandex.passport.internal.l.class, "master-account") : readBundle.getParcelable("master-account");
                if (parcelable == null) {
                    xq0.q("can't get required parcelable master-account");
                    return null;
                }
                com.yandex.passport.internal.l lVar = (com.yandex.passport.internal.l) parcelable;
                com.yandex.passport.internal.entities.e createFromParcel3 = parcel.readInt() == 0 ? null : com.yandex.passport.internal.entities.e.CREATOR.createFromParcel(parcel);
                w0 valueOf2 = w0.valueOf(parcel.readString());
                String readString5 = parcel.readString();
                return new u(lVar, createFromParcel3, valueOf2, readString5 != null ? readString5 : null, (EnumSet) parcel.readSerializable());
            case 5:
                parcel.getClass();
                return new x((t) parcel.readParcelable(x.class.getClassLoader()), parcel.readString());
            default:
                parcel.getClass();
                return new a0(com.yandex.passport.internal.properties.l.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), z.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : com.yandex.passport.internal.l.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : com.yandex.passport.internal.network.response.a.valueOf(parcel.readString()), parcel.readInt() != 0 ? com.yandex.passport.internal.entities.g.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readInt() != 0, b0.valueOf(parcel.readString()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new d[i];
            case 1:
                return new g[i];
            case 2:
                return new p[i];
            case 3:
                return new q[i];
            case 4:
                return new u[i];
            case 5:
                return new x[i];
            default:
                return new a0[i];
        }
    }
}
