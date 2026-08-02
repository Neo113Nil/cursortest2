package com.yandex.plus.pay.adapter.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.internal.model.PlusPayUpsaleStep;
import com.yandex.plus.pay.repository.api.model.offers.i0;
import com.yandex.plus.pay.repository.api.model.offers.i1;
import com.yandex.plus.pay.repository.api.model.offers.j0;
import com.yandex.plus.pay.repository.api.model.offers.k0;
import com.yandex.plus.pay.repository.api.model.offers.l0;
import com.yandex.plus.pay.repository.api.model.offers.n0;
import com.yandex.plus.pay.repository.api.model.offers.t0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes5.dex */
public final class b0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ b0(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        switch (this.a) {
            case 0:
                parcel.getClass();
                parcel.readInt();
                return c0.INSTANCE;
            case 1:
                parcel.getClass();
                return new com.yandex.plus.pay.adapter.internal.l((PlusPayPrice) parcel.readParcelable(com.yandex.plus.pay.adapter.internal.l.class.getClassLoader()));
            case 2:
                parcel.getClass();
                return new com.yandex.plus.pay.adapter.internal.h0((PlusPayLegalInfo) parcel.readParcelable(com.yandex.plus.pay.adapter.internal.h0.class.getClassLoader()));
            case 3:
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                LinkedHashSet linkedHashSet3 = null;
                int i = 0;
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet4 = new LinkedHashSet(readInt);
                    for (int i2 = 0; i2 != readInt; i2++) {
                        linkedHashSet4.add(com.yandex.plus.pay.api.analytics.e.CREATOR.createFromParcel(parcel));
                    }
                    linkedHashSet = linkedHashSet4;
                }
                if (parcel.readInt() == 0) {
                    linkedHashSet2 = null;
                } else {
                    int readInt2 = parcel.readInt();
                    LinkedHashSet linkedHashSet5 = new LinkedHashSet(readInt2);
                    for (int i3 = 0; i3 != readInt2; i3++) {
                        linkedHashSet5.add(com.yandex.plus.pay.api.analytics.e.CREATOR.createFromParcel(parcel));
                    }
                    linkedHashSet2 = linkedHashSet5;
                }
                if (parcel.readInt() != 0) {
                    int readInt3 = parcel.readInt();
                    linkedHashSet3 = new LinkedHashSet(readInt3);
                    for (int i4 = 0; i4 != readInt3; i4++) {
                        linkedHashSet3.add(parcel.readString());
                    }
                }
                LinkedHashSet linkedHashSet6 = linkedHashSet3;
                int readInt4 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt4);
                while (i != readInt4) {
                    i = com.appsflyer.internal.k.b(parcel, linkedHashMap3, parcel.readString(), i, 1);
                }
                return new com.yandex.plus.pay.api.analytics.c(readString, readString2, linkedHashSet, linkedHashSet2, linkedHashSet6, linkedHashMap3);
            case 4:
                parcel.getClass();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                int readInt5 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = com.appsflyer.internal.k.b(parcel, linkedHashMap4, parcel.readString(), i5, 1);
                }
                return new com.yandex.plus.pay.api.analytics.d(readString3, readString4, readString5, linkedHashMap4);
            case 5:
                parcel.getClass();
                return new com.yandex.plus.pay.api.analytics.e(parcel.readLong(), parcel.readLong());
            case 6:
                parcel.getClass();
                return new com.yandex.plus.pay.api.google.model.f(parcel.readString());
            case 7:
                parcel.getClass();
                return new com.yandex.plus.pay.api.google.model.i(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, com.yandex.plus.pay.api.google.model.m.valueOf(parcel.readString()));
            case 8:
                parcel.getClass();
                return new com.yandex.plus.pay.api.google.model.l(com.yandex.plus.pay.api.google.model.i.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
            case 9:
                parcel.getClass();
                int readInt6 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt6);
                int i6 = 0;
                int i7 = 0;
                while (i7 != readInt6) {
                    i7 = com.appsflyer.internal.k.c(PlusPayUpsaleStep.CREATOR, parcel, arrayList, i7, 1);
                }
                int readInt7 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt7);
                while (i6 != readInt7) {
                    i6 = com.appsflyer.internal.k.c(com.yandex.plus.pay.internal.feature.offers.q.CREATOR, parcel, arrayList2, i6, 1);
                }
                return new com.yandex.plus.pay.internal.feature.offers.r(arrayList2, arrayList);
            case 10:
                parcel.getClass();
                return new com.yandex.plus.pay.internal.feature.offers.q(parcel.readString(), parcel.readString(), parcel.readString(), PlusPayUpsaleStep.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 11:
                parcel.getClass();
                return new com.yandex.plus.pay.internal.feature.offers.t(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : com.yandex.plus.pay.internal.feature.offers.r.CREATOR.createFromParcel(parcel));
            case 12:
                parcel.getClass();
                return new com.yandex.plus.pay.repository.api.model.mailingads.c(com.yandex.plus.pay.repository.api.model.offers.z.CREATOR.createFromParcel(parcel), com.yandex.plus.pay.repository.api.model.mailingads.a.valueOf(parcel.readString()), com.yandex.plus.pay.repository.api.model.mailingads.b.valueOf(parcel.readString()));
            case 13:
                parcel.getClass();
                return new com.yandex.plus.pay.repository.api.model.offers.v(parcel.readString(), com.yandex.plus.pay.repository.api.model.offers.u.CREATOR.createFromParcel(parcel));
            case 14:
                parcel.getClass();
                return com.yandex.plus.pay.repository.api.model.offers.u.valueOf(parcel.readString());
            case 15:
                parcel.getClass();
                String readString6 = parcel.readString();
                int readInt8 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt8);
                for (int i8 = 0; i8 != readInt8; i8++) {
                    arrayList3.add(parcel.readParcelable(com.yandex.plus.pay.repository.api.model.offers.z.class.getClassLoader()));
                }
                return new com.yandex.plus.pay.repository.api.model.offers.z(readString6, arrayList3);
            case 16:
                parcel.getClass();
                return new com.yandex.plus.pay.repository.api.model.offers.w(parcel.readString(), parcel.readString(), parcel.readString());
            case 17:
                parcel.getClass();
                return new com.yandex.plus.pay.repository.api.model.offers.x(parcel.readString(), parcel.readString());
            case 18:
                parcel.getClass();
                return new com.yandex.plus.pay.repository.api.model.offers.a0(parcel.readString(), parcel.readString(), parcel.readString());
            case 19:
                parcel.getClass();
                String readString7 = parcel.readString();
                i0 valueOf = i0.valueOf(parcel.readString());
                String readString8 = parcel.readString();
                j0 createFromParcel = parcel.readInt() == 0 ? null : j0.CREATOR.createFromParcel(parcel);
                int readInt9 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt9);
                int i9 = 0;
                while (i9 != readInt9) {
                    i9 = com.appsflyer.internal.k.c(com.yandex.plus.pay.repository.api.model.offers.c0.CREATOR, parcel, arrayList4, i9, 1);
                }
                com.yandex.plus.pay.repository.api.model.offers.z createFromParcel2 = parcel.readInt() != 0 ? com.yandex.plus.pay.repository.api.model.offers.z.CREATOR.createFromParcel(parcel) : null;
                int readInt10 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt10);
                int i10 = 0;
                while (i10 != readInt10) {
                    i10 = com.appsflyer.internal.k.c(com.yandex.plus.pay.repository.api.model.offers.b0.CREATOR, parcel, arrayList5, i10, 1);
                }
                return new l0(readString7, valueOf, readString8, createFromParcel, arrayList4, createFromParcel2, arrayList5, com.yandex.plus.pay.repository.api.model.offers.a0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 20:
                parcel.getClass();
                return new com.yandex.plus.pay.repository.api.model.offers.b0(parcel.readLong(), n0.CREATOR.createFromParcel(parcel));
            case 21:
                parcel.getClass();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                n0 createFromParcel3 = n0.CREATOR.createFromParcel(parcel);
                String readString15 = parcel.readString();
                int readInt11 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt11);
                int i11 = 0;
                for (int i12 = 0; i12 != readInt11; i12++) {
                    arrayList6.add(parcel.readParcelable(com.yandex.plus.pay.repository.api.model.offers.c0.class.getClassLoader()));
                }
                k0 valueOf2 = k0.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt12 = parcel.readInt();
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(readInt12);
                    while (i11 != readInt12) {
                        i11 = com.appsflyer.internal.k.b(parcel, linkedHashMap5, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap5;
                }
                return new com.yandex.plus.pay.repository.api.model.offers.c0(readString9, readString10, readString11, readString12, readString13, readString14, createFromParcel3, readString15, arrayList6, valueOf2, linkedHashMap);
            case 22:
                parcel.getClass();
                return new com.yandex.plus.pay.repository.api.model.offers.d0(parcel.readString(), n0.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 23:
                parcel.getClass();
                return new com.yandex.plus.pay.repository.api.model.offers.e0(parcel.readLong(), n0.CREATOR.createFromParcel(parcel));
            case 24:
                parcel.getClass();
                return new com.yandex.plus.pay.repository.api.model.offers.f0(parcel.readString());
            case 25:
                parcel.getClass();
                return new com.yandex.plus.pay.repository.api.model.offers.g0(parcel.readLong());
            case 26:
                parcel.getClass();
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                String readString18 = parcel.readString();
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                n0 createFromParcel4 = n0.CREATOR.createFromParcel(parcel);
                String readString22 = parcel.readString();
                int readInt13 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt13);
                int i13 = 0;
                for (int i14 = 0; i14 != readInt13; i14++) {
                    arrayList7.add(parcel.readParcelable(j0.class.getClassLoader()));
                }
                k0 valueOf3 = k0.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    linkedHashMap2 = null;
                } else {
                    int readInt14 = parcel.readInt();
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap(readInt14);
                    while (i13 != readInt14) {
                        i13 = com.appsflyer.internal.k.b(parcel, linkedHashMap6, parcel.readString(), i13, 1);
                    }
                    linkedHashMap2 = linkedHashMap6;
                }
                return new j0(readString16, readString17, readString18, readString19, readString20, readString21, createFromParcel4, readString22, arrayList7, valueOf3, linkedHashMap2);
            case 27:
                parcel.getClass();
                return new n0((BigDecimal) parcel.readSerializable(), parcel.readString());
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                String readString23 = parcel.readString();
                int readInt15 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt15);
                for (int i15 = 0; i15 != readInt15; i15++) {
                    arrayList8.add(parcel.readParcelable(i1.class.getClassLoader()));
                }
                return new i1(readString23, arrayList8);
            default:
                parcel.getClass();
                return new t0(parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new c0[i];
            case 1:
                return new com.yandex.plus.pay.adapter.internal.l[i];
            case 2:
                return new com.yandex.plus.pay.adapter.internal.h0[i];
            case 3:
                return new com.yandex.plus.pay.api.analytics.c[i];
            case 4:
                return new com.yandex.plus.pay.api.analytics.d[i];
            case 5:
                return new com.yandex.plus.pay.api.analytics.e[i];
            case 6:
                return new com.yandex.plus.pay.api.google.model.f[i];
            case 7:
                return new com.yandex.plus.pay.api.google.model.i[i];
            case 8:
                return new com.yandex.plus.pay.api.google.model.l[i];
            case 9:
                return new com.yandex.plus.pay.internal.feature.offers.r[i];
            case 10:
                return new com.yandex.plus.pay.internal.feature.offers.q[i];
            case 11:
                return new com.yandex.plus.pay.internal.feature.offers.t[i];
            case 12:
                return new com.yandex.plus.pay.repository.api.model.mailingads.c[i];
            case 13:
                return new com.yandex.plus.pay.repository.api.model.offers.v[i];
            case 14:
                return new com.yandex.plus.pay.repository.api.model.offers.u[i];
            case 15:
                return new com.yandex.plus.pay.repository.api.model.offers.z[i];
            case 16:
                return new com.yandex.plus.pay.repository.api.model.offers.w[i];
            case 17:
                return new com.yandex.plus.pay.repository.api.model.offers.x[i];
            case 18:
                return new com.yandex.plus.pay.repository.api.model.offers.a0[i];
            case 19:
                return new l0[i];
            case 20:
                return new com.yandex.plus.pay.repository.api.model.offers.b0[i];
            case 21:
                return new com.yandex.plus.pay.repository.api.model.offers.c0[i];
            case 22:
                return new com.yandex.plus.pay.repository.api.model.offers.d0[i];
            case 23:
                return new com.yandex.plus.pay.repository.api.model.offers.e0[i];
            case 24:
                return new com.yandex.plus.pay.repository.api.model.offers.f0[i];
            case 25:
                return new com.yandex.plus.pay.repository.api.model.offers.g0[i];
            case 26:
                return new j0[i];
            case 27:
                return new n0[i];
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new i1[i];
            default:
                return new t0[i];
        }
    }
}
