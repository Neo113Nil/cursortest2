package com.yandex.plus.pay.repository.api.model.offers;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class w0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ w0(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new x0(parcel.readString(), parcel.readString(), parcel.readString(), (com.yandex.plus.core.data.common.y) parcel.readParcelable(x0.class.getClassLoader()));
            case 1:
                parcel.getClass();
                return new a1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 2:
                parcel.getClass();
                return new d1(parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                parcel.getClass();
                return new g1(parcel.readString(), parcel.readString(), parcel.readString(), (com.yandex.plus.core.data.common.v) parcel.readParcelable(g1.class.getClassLoader()));
            case 4:
                parcel.getClass();
                return new com.yandex.plus.pay.repository.api.model.upsale.c(l0.CREATOR.createFromParcel(parcel), com.yandex.plus.pay.repository.api.model.upsale.b.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : v.CREATOR.createFromParcel(parcel), com.yandex.plus.pay.repository.api.model.upsale.a.CREATOR.createFromParcel(parcel));
            case 5:
                parcel.getClass();
                return new com.yandex.plus.pay.repository.api.model.upsale.a(parcel.readString(), parcel.readString());
            case 6:
                parcel.getClass();
                return new com.yandex.plus.pay.repository.api.model.upsale.b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 7:
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = com.appsflyer.internal.k.c(com.yandex.plus.pay.repository.api.model.upsale.c.CREATOR, parcel, arrayList2, i, 1);
                }
                return new com.yandex.plus.pay.repository.api.model.upsale.d(readString, readString2, arrayList2);
            case 8:
                parcel.getClass();
                return new com.yandex.plus.pay.repository.api.model.widget.c(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            case 9:
                parcel.getClass();
                return new com.yandex.plus.pay.ui.api.feature.payment.a(com.yandex.plus.pay.api.exception.c.valueOf(parcel.readString()));
            case 10:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.pay.ui.api.feature.payment.b.a;
            case 11:
                parcel.getClass();
                return new com.yandex.plus.pay.ui.api.feature.payment.c(com.yandex.plus.pay.api.exception.b.valueOf(parcel.readString()));
            case 12:
                parcel.getClass();
                return new com.yandex.plus.pay.ui.api.feature.payment.d((com.yandex.plus.core.data.pay.k) parcel.readParcelable(com.yandex.plus.pay.ui.api.feature.payment.d.class.getClassLoader()));
            case 13:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.pay.ui.api.feature.payment.e.a;
            case 14:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.pay.ui.api.feature.payment.f.a;
            case 15:
                parcel.getClass();
                return new com.yandex.plus.pay.ui.core.tarifficator.api.data.common.e((com.yandex.plus.pay.ui.api.feature.payment.g) parcel.readParcelable(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.e.class.getClassLoader()));
            case 16:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.pay.ui.core.tarifficator.api.data.common.f.a;
            case 17:
                parcel.getClass();
                return new com.yandex.plus.pay.ui.core.tarifficator.api.data.common.g(parcel.readString());
            case 18:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.g.a;
            case 19:
                parcel.getClass();
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.h((com.yandex.plus.pay.ui.api.feature.payment.g) parcel.readParcelable(com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.h.class.getClassLoader()), parcel.readInt() != 0);
            case 20:
                parcel.getClass();
                UUID uuid = (UUID) parcel.readSerializable();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.g createFromParcel = com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.g.CREATOR.createFromParcel(parcel);
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
                int i2 = 0;
                while (true) {
                    if (i2 == readInt2) {
                        int readInt3 = parcel.readInt();
                        LinkedHashSet linkedHashSet = new LinkedHashSet(readInt3);
                        for (int i3 = 0; i3 != readInt3; i3++) {
                            linkedHashSet.add(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.p.valueOf(parcel.readString()));
                        }
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.h(uuid, createFromParcel, linkedHashMap, linkedHashSet, parcel.readInt() != 0, (com.yandex.plus.pay.api.analytics.c) parcel.readParcelable(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.h.class.getClassLoader()));
                    }
                    i2 = com.appsflyer.internal.k.b(parcel, linkedHashMap, parcel.readString(), i2, 1);
                }
            case 21:
                parcel.getClass();
                String readString3 = parcel.readString();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                int i4 = 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt4);
                    int i5 = 0;
                    while (i5 != readInt4) {
                        i5 = com.appsflyer.internal.k.c(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.f.CREATOR, parcel, arrayList3, i5, 1);
                    }
                    arrayList = arrayList3;
                }
                int readInt5 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt5);
                while (i4 != readInt5) {
                    i4 = com.appsflyer.internal.k.b(parcel, linkedHashMap2, parcel.readString(), i4, 1);
                }
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.g(readString3, createStringArrayList, arrayList, linkedHashMap2);
            case 22:
                parcel.getClass();
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.f(parcel.readString(), parcel.createStringArrayList());
            case 23:
                parcel.getClass();
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.i(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.a.c.a(parcel));
            case 24:
                parcel.getClass();
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.j(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.a.c.a(parcel), (com.yandex.plus.pay.ui.api.feature.payment.g) parcel.readParcelable(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.j.class.getClassLoader()), parcel.readInt() != 0);
            case 25:
                parcel.getClass();
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.k(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.a.c.a(parcel), parcel.readInt() != 0);
            case 26:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.m.a;
            case 27:
                parcel.getClass();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.l lVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.l) parcel.readParcelable(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.n.class.getClassLoader());
                lVar.getClass();
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.n(lVar);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.a(parcel.readString(), parcel.readString(), (com.yandex.plus.bdui.s) parcel.readParcelable(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.a.class.getClassLoader()), parcel.readInt() != 0);
            default:
                parcel.getClass();
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.k(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.e.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new x0[i];
            case 1:
                return new a1[i];
            case 2:
                return new d1[i];
            case 3:
                return new g1[i];
            case 4:
                return new com.yandex.plus.pay.repository.api.model.upsale.c[i];
            case 5:
                return new com.yandex.plus.pay.repository.api.model.upsale.a[i];
            case 6:
                return new com.yandex.plus.pay.repository.api.model.upsale.b[i];
            case 7:
                return new com.yandex.plus.pay.repository.api.model.upsale.d[i];
            case 8:
                return new com.yandex.plus.pay.repository.api.model.widget.c[i];
            case 9:
                return new com.yandex.plus.pay.ui.api.feature.payment.a[i];
            case 10:
                return new com.yandex.plus.pay.ui.api.feature.payment.b[i];
            case 11:
                return new com.yandex.plus.pay.ui.api.feature.payment.c[i];
            case 12:
                return new com.yandex.plus.pay.ui.api.feature.payment.d[i];
            case 13:
                return new com.yandex.plus.pay.ui.api.feature.payment.e[i];
            case 14:
                return new com.yandex.plus.pay.ui.api.feature.payment.f[i];
            case 15:
                return new com.yandex.plus.pay.ui.core.tarifficator.api.data.common.e[i];
            case 16:
                return new com.yandex.plus.pay.ui.core.tarifficator.api.data.common.f[i];
            case 17:
                return new com.yandex.plus.pay.ui.core.tarifficator.api.data.common.g[i];
            case 18:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.g[i];
            case 19:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.h[i];
            case 20:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.h[i];
            case 21:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.g[i];
            case 22:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.f[i];
            case 23:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.i[i];
            case 24:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.j[i];
            case 25:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.k[i];
            case 26:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.m[i];
            case 27:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.n[i];
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.a[i];
            default:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.k[i];
        }
    }
}
