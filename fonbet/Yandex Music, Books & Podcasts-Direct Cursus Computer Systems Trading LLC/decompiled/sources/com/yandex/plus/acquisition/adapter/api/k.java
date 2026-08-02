package com.yandex.plus.acquisition.adapter.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.acquisition.sdk.pay.common.api.p;
import com.yandex.plus.acquisition.sdk.pay.common.api.q;
import com.yandex.plus.acquisition.sdk.pay.common.api.r;
import com.yandex.plus.acquisition.sdk.pay.common.api.s;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class k implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        switch (this.a) {
            case 0:
                parcel.getClass();
                parcel.readInt();
                return l.a;
            case 1:
                parcel.getClass();
                parcel.readInt();
                return n.a;
            case 2:
                parcel.getClass();
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashSet.add(com.yandex.plus.acquisition.sdk.api.a.CREATOR.createFromParcel(parcel));
                }
                int readInt2 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    linkedHashSet2.add(parcel.readString());
                }
                return new com.yandex.plus.acquisition.sdk.api.b(linkedHashSet, linkedHashSet2);
            case 3:
                parcel.getClass();
                return new com.yandex.plus.acquisition.sdk.api.a(parcel.readLong(), parcel.readLong());
            case 4:
                parcel.getClass();
                return new com.yandex.plus.acquisition.sdk.api.offers.a(parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                com.yandex.plus.acquisition.sdk.api.offers.e createFromParcel = parcel.readInt() == 0 ? null : com.yandex.plus.acquisition.sdk.api.offers.e.CREATOR.createFromParcel(parcel);
                int readInt3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = com.appsflyer.internal.k.c(com.yandex.plus.acquisition.sdk.api.offers.e.CREATOR, parcel, arrayList, i3, 1);
                }
                com.yandex.plus.acquisition.sdk.api.offers.a createFromParcel2 = com.yandex.plus.acquisition.sdk.api.offers.a.CREATOR.createFromParcel(parcel);
                com.yandex.plus.acquisition.sdk.api.offers.b createFromParcel3 = com.yandex.plus.acquisition.sdk.api.offers.b.CREATOR.createFromParcel(parcel);
                int readInt4 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = com.appsflyer.internal.k.b(parcel, linkedHashMap2, parcel.readString(), i4, 1);
                }
                return new com.yandex.plus.acquisition.sdk.api.offers.c(readString, readString2, createFromParcel, arrayList, createFromParcel2, createFromParcel3, linkedHashMap2, parcel.readInt() != 0);
            case 6:
                parcel.getClass();
                return new com.yandex.plus.acquisition.sdk.api.offers.b(parcel.readString(), parcel.readString());
            case 7:
                parcel.getClass();
                return new com.yandex.plus.acquisition.sdk.api.offers.d((BigDecimal) parcel.readSerializable(), parcel.readString());
            case 8:
                parcel.getClass();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                com.yandex.plus.acquisition.sdk.api.offers.d createFromParcel4 = com.yandex.plus.acquisition.sdk.api.offers.d.CREATOR.createFromParcel(parcel);
                com.yandex.plus.acquisition.sdk.api.offers.i iVar = (com.yandex.plus.acquisition.sdk.api.offers.i) parcel.readParcelable(com.yandex.plus.acquisition.sdk.api.offers.e.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt5 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt5);
                    int i5 = 0;
                    while (i5 != readInt5) {
                        i5 = com.appsflyer.internal.k.b(parcel, linkedHashMap, parcel.readString(), i5, 1);
                    }
                }
                return new com.yandex.plus.acquisition.sdk.api.offers.e(readString3, readString4, readString5, readString6, readString7, readString8, readString9, createFromParcel4, iVar, linkedHashMap);
            case 9:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.acquisition.sdk.api.offers.f.a;
            case 10:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.acquisition.sdk.api.offers.g.a;
            case 11:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.acquisition.sdk.api.offers.h.a;
            case 12:
                parcel.getClass();
                com.yandex.plus.acquisition.sdk.api.b bVar = (com.yandex.plus.acquisition.sdk.api.b) parcel.readParcelable(com.yandex.plus.acquisition.sdk.pay.common.api.a.class.getClassLoader());
                String readString10 = parcel.readString();
                int readInt6 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt6);
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = com.appsflyer.internal.k.b(parcel, linkedHashMap3, parcel.readString(), i6, 1);
                }
                return new com.yandex.plus.acquisition.sdk.pay.common.api.a(bVar, readString10, linkedHashMap3);
            case 13:
                parcel.getClass();
                return new com.yandex.plus.acquisition.sdk.pay.common.api.k(parcel.readInt(), parcel.readString(), parcel.readString(), com.yandex.plus.acquisition.sdk.pay.common.api.g.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, com.yandex.plus.acquisition.sdk.pay.common.api.j.CREATOR.createFromParcel(parcel), com.yandex.plus.acquisition.sdk.pay.common.api.e.CREATOR.createFromParcel(parcel), parcel.readString(), com.yandex.plus.acquisition.sdk.pay.common.api.f.CREATOR.createFromParcel(parcel), (com.yandex.plus.acquisition.sdk.api.offers.c) parcel.readParcelable(com.yandex.plus.acquisition.sdk.pay.common.api.k.class.getClassLoader()));
            case 14:
                parcel.getClass();
                return new com.yandex.plus.acquisition.sdk.pay.common.api.d(parcel.readString(), parcel.readString(), parcel.readString());
            case 15:
                parcel.getClass();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                int readInt7 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt7);
                int i7 = 0;
                while (i7 != readInt7) {
                    i7 = com.appsflyer.internal.k.c(com.yandex.plus.acquisition.sdk.pay.common.api.d.CREATOR, parcel, arrayList2, i7, 1);
                }
                return new com.yandex.plus.acquisition.sdk.pay.common.api.e(readString11, readString12, arrayList2);
            case 16:
                parcel.getClass();
                return new com.yandex.plus.acquisition.sdk.pay.common.api.f(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
            case 17:
                parcel.getClass();
                String readString13 = parcel.readString();
                int readInt8 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(readInt8);
                for (int i8 = 0; i8 != readInt8; i8++) {
                    linkedHashSet3.add(parcel.readString());
                }
                return new com.yandex.plus.acquisition.sdk.pay.common.api.g(readString13, linkedHashSet3);
            case 18:
                parcel.getClass();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                String readString18 = parcel.readString();
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                String readString24 = parcel.readString();
                int readInt9 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt9);
                int i9 = 0;
                while (i9 != readInt9) {
                    i9 = com.appsflyer.internal.k.b(parcel, linkedHashMap4, parcel.readString(), i9, 1);
                    readInt9 = readInt9;
                }
                return new com.yandex.plus.acquisition.sdk.pay.common.api.j(readString14, readString15, readString16, readString17, readString18, readString19, readString20, readString21, readString22, readString23, readString24, linkedHashMap4);
            case 19:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.acquisition.sdk.pay.common.api.l.a;
            case 20:
                parcel.getClass();
                return new com.yandex.plus.acquisition.sdk.pay.common.api.m(parcel.readString());
            case 21:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.acquisition.sdk.pay.common.api.n.a;
            case 22:
                parcel.getClass();
                return new com.yandex.plus.acquisition.sdk.pay.common.api.o(parcel.readString());
            case 23:
                parcel.getClass();
                return new p(parcel.readString());
            case 24:
                parcel.getClass();
                parcel.readInt();
                return q.a;
            case 25:
                parcel.getClass();
                parcel.readInt();
                return r.a;
            case 26:
                parcel.getClass();
                return new s(com.yandex.plus.acquisition.sdk.pay.common.api.k.CREATOR.createFromParcel(parcel));
            case 27:
                parcel.getClass();
                Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                com.yandex.plus.bdui.query.e eVar = (com.yandex.plus.bdui.query.e) parcel.readParcelable(com.yandex.plus.bdui.plus.scenario.q.class.getClassLoader());
                int readInt10 = parcel.readInt();
                int readInt11 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt11);
                for (int i10 = 0; i10 != readInt11; i10++) {
                    arrayList3.add(parcel.readParcelable(com.yandex.plus.bdui.plus.scenario.q.class.getClassLoader()));
                }
                return new com.yandex.plus.bdui.plus.scenario.q(valueOf, eVar, readInt10, arrayList3, (com.yandex.plus.core.benchmark.r) parcel.readParcelable(com.yandex.plus.bdui.plus.scenario.q.class.getClassLoader()));
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                return new com.yandex.plus.core.benchmark.e(parcel.readString());
            default:
                parcel.getClass();
                return new com.yandex.plus.core.benchmark.f(parcel.readString(), parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new l[i];
            case 1:
                return new n[i];
            case 2:
                return new com.yandex.plus.acquisition.sdk.api.b[i];
            case 3:
                return new com.yandex.plus.acquisition.sdk.api.a[i];
            case 4:
                return new com.yandex.plus.acquisition.sdk.api.offers.a[i];
            case 5:
                return new com.yandex.plus.acquisition.sdk.api.offers.c[i];
            case 6:
                return new com.yandex.plus.acquisition.sdk.api.offers.b[i];
            case 7:
                return new com.yandex.plus.acquisition.sdk.api.offers.d[i];
            case 8:
                return new com.yandex.plus.acquisition.sdk.api.offers.e[i];
            case 9:
                return new com.yandex.plus.acquisition.sdk.api.offers.f[i];
            case 10:
                return new com.yandex.plus.acquisition.sdk.api.offers.g[i];
            case 11:
                return new com.yandex.plus.acquisition.sdk.api.offers.h[i];
            case 12:
                return new com.yandex.plus.acquisition.sdk.pay.common.api.a[i];
            case 13:
                return new com.yandex.plus.acquisition.sdk.pay.common.api.k[i];
            case 14:
                return new com.yandex.plus.acquisition.sdk.pay.common.api.d[i];
            case 15:
                return new com.yandex.plus.acquisition.sdk.pay.common.api.e[i];
            case 16:
                return new com.yandex.plus.acquisition.sdk.pay.common.api.f[i];
            case 17:
                return new com.yandex.plus.acquisition.sdk.pay.common.api.g[i];
            case 18:
                return new com.yandex.plus.acquisition.sdk.pay.common.api.j[i];
            case 19:
                return new com.yandex.plus.acquisition.sdk.pay.common.api.l[i];
            case 20:
                return new com.yandex.plus.acquisition.sdk.pay.common.api.m[i];
            case 21:
                return new com.yandex.plus.acquisition.sdk.pay.common.api.n[i];
            case 22:
                return new com.yandex.plus.acquisition.sdk.pay.common.api.o[i];
            case 23:
                return new p[i];
            case 24:
                return new q[i];
            case 25:
                return new r[i];
            case 26:
                return new s[i];
            case 27:
                return new com.yandex.plus.bdui.plus.scenario.q[i];
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.plus.core.benchmark.e[i];
            default:
                return new com.yandex.plus.core.benchmark.f[i];
        }
    }
}
