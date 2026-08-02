package com.yandex.plus.core.benchmark;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.home.repository.api.model.panel.f0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class g implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        LinkedHashMap linkedHashMap;
        com.yandex.plus.home.repository.api.model.panel.h hVar;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new h(parcel.readString(), parcel.readLong(), parcel.readLong());
            case 1:
                parcel.getClass();
                parcel.readInt();
                return p.a;
            case 2:
                parcel.getClass();
                return new q(parcel.readLong());
            case 3:
                parcel.getClass();
                return new com.yandex.plus.core.data.common.c(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 4:
                parcel.getClass();
                return new com.yandex.plus.core.data.common.f(parcel.readInt());
            case 5:
                parcel.getClass();
                int readInt = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList4.add(parcel.readParcelable(com.yandex.plus.core.data.common.j.class.getClassLoader()));
                }
                return new com.yandex.plus.core.data.common.j(arrayList4);
            case 6:
                parcel.getClass();
                int readInt2 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList5.add(Integer.valueOf(parcel.readInt()));
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList6.add(Double.valueOf(parcel.readDouble()));
                }
                return new com.yandex.plus.core.data.common.o(arrayList5, arrayList6, parcel.readDouble());
            case 7:
                parcel.getClass();
                int readInt4 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt4);
                for (int i4 = 0; i4 != readInt4; i4++) {
                    arrayList7.add(Integer.valueOf(parcel.readInt()));
                }
                int readInt5 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt5);
                for (int i5 = 0; i5 != readInt5; i5++) {
                    arrayList8.add(Double.valueOf(parcel.readDouble()));
                }
                return new com.yandex.plus.core.data.common.r(arrayList7, arrayList8, (Pair) parcel.readSerializable(), (Pair) parcel.readSerializable());
            case 8:
                parcel.getClass();
                return new com.yandex.plus.core.data.common.v((com.yandex.plus.core.data.common.k) parcel.readParcelable(com.yandex.plus.core.data.common.v.class.getClassLoader()), (com.yandex.plus.core.data.common.k) parcel.readParcelable(com.yandex.plus.core.data.common.v.class.getClassLoader()));
            case 9:
                parcel.getClass();
                return new com.yandex.plus.core.data.common.y(parcel.readString(), parcel.readString());
            case 10:
                parcel.getClass();
                return new com.yandex.plus.core.data.common.b0(parcel.readString(), parcel.readString());
            case 11:
                parcel.getClass();
                int readInt6 = parcel.readInt();
                com.yandex.plus.core.data.family.c createFromParcel = com.yandex.plus.core.data.family.c.CREATOR.createFromParcel(parcel);
                int readInt7 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(readInt7);
                int i6 = 0;
                while (i6 != readInt7) {
                    i6 = com.appsflyer.internal.k.c(com.yandex.plus.core.data.family.c.CREATOR, parcel, arrayList9, i6, 1);
                }
                return new com.yandex.plus.core.data.family.a(readInt6, createFromParcel, arrayList9);
            case 12:
                parcel.getClass();
                return new com.yandex.plus.core.data.family.c(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 13:
                parcel.getClass();
                return new com.yandex.plus.core.data.pay.a(parcel.readString());
            case 14:
                parcel.getClass();
                return new com.yandex.plus.core.data.pay.b(parcel.readString(), parcel.readString());
            case 15:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.core.data.pay.h.INSTANCE;
            case 16:
                parcel.getClass();
                return new com.yandex.plus.core.data.pay.k(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 17:
                parcel.getClass();
                return new com.yandex.plus.core.data.pay.o(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.core.data.pay.p.INSTANCE;
            case 19:
                parcel.getClass();
                return new com.yandex.plus.core.data.pay.s(parcel.readString(), (com.yandex.plus.core.data.pay.c) parcel.readParcelable(com.yandex.plus.core.data.pay.s.class.getClassLoader()));
            case 20:
                parcel.getClass();
                return new com.yandex.plus.core.data.user.a(parcel.readString(), parcel.readString(), com.yandex.plus.core.data.family.a.CREATOR.createFromParcel(parcel));
            case 21:
                parcel.getClass();
                com.yandex.plus.home.repository.api.model.webconfig.a0 a0Var = (com.yandex.plus.home.repository.api.model.webconfig.a0) parcel.readParcelable(com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.c.class.getClassLoader());
                int readInt8 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(readInt8);
                int i7 = 0;
                while (i7 != readInt8) {
                    i7 = com.appsflyer.internal.k.c(com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.m.CREATOR, parcel, arrayList10, i7, 1);
                }
                return new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.c(a0Var, arrayList10, (com.yandex.plus.home.feature.webviews.internalapi.subscription.p) parcel.readParcelable(com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.c.class.getClassLoader()));
            case 22:
                parcel.getClass();
                com.yandex.plus.home.repository.api.model.webconfig.a0 a0Var2 = (com.yandex.plus.home.repository.api.model.webconfig.a0) parcel.readParcelable(com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.f.class.getClassLoader());
                int readInt9 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(readInt9);
                int i8 = 0;
                while (i8 != readInt9) {
                    i8 = com.appsflyer.internal.k.c(com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.m.CREATOR, parcel, arrayList11, i8, 1);
                }
                return new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.f(a0Var2, arrayList11, (com.yandex.plus.home.feature.webviews.internalapi.subscription.p) parcel.readParcelable(com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.f.class.getClassLoader()), parcel.readString());
            case 23:
                parcel.getClass();
                return new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.m((com.yandex.plus.pay.adapter.api.j) parcel.readParcelable(com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.m.class.getClassLoader()));
            case 24:
                parcel.getClass();
                return new com.yandex.plus.home.feature.webviews.internalapi.subscription.c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            case 25:
                parcel.getClass();
                return new com.yandex.plus.home.feature.webviews.internalapi.subscription.f(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 26:
                parcel.getClass();
                return new com.yandex.plus.home.feature.webviews.internalapi.subscription.i(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 27:
                parcel.getClass();
                return new com.yandex.plus.home.feature.webviews.internalapi.subscription.l(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                return new com.yandex.plus.home.feature.webviews.internalapi.subscription.o(parcel.readString(), parcel.readString(), parcel.readString());
            default:
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Class<com.yandex.plus.home.repository.api.model.panel.b> cls = com.yandex.plus.home.repository.api.model.panel.b.class;
                com.yandex.plus.core.data.common.v vVar = (com.yandex.plus.core.data.common.v) parcel.readParcelable(cls.getClassLoader());
                com.yandex.plus.core.data.common.v vVar2 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(cls.getClassLoader());
                com.yandex.plus.core.data.common.v vVar3 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(cls.getClassLoader());
                com.yandex.plus.home.repository.api.model.panel.d0 createFromParcel2 = parcel.readInt() == 0 ? null : com.yandex.plus.home.repository.api.model.panel.d0.CREATOR.createFromParcel(parcel);
                String readString5 = parcel.readString();
                com.yandex.plus.core.data.common.v vVar4 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(cls.getClassLoader());
                int readInt10 = parcel.readInt();
                ArrayList arrayList12 = new ArrayList(readInt10);
                int i9 = 0;
                while (true) {
                    Class<com.yandex.plus.home.repository.api.model.panel.b> cls2 = cls;
                    if (i9 == readInt10) {
                        if (parcel.readInt() == 0) {
                            arrayList = null;
                        } else {
                            int readInt11 = parcel.readInt();
                            arrayList = new ArrayList(readInt11);
                            int i10 = 0;
                            while (i10 != readInt11) {
                                i10 = com.appsflyer.internal.k.c(com.yandex.plus.home.repository.api.model.panel.e0.CREATOR, parcel, arrayList, i10, 1);
                                readInt11 = readInt11;
                            }
                        }
                        int readInt12 = parcel.readInt();
                        ArrayList arrayList13 = new ArrayList(readInt12);
                        int i11 = 0;
                        while (i11 != readInt12) {
                            i11 = com.appsflyer.internal.k.c(f0.CREATOR, parcel, arrayList13, i11, 1);
                            readInt12 = readInt12;
                            createFromParcel2 = createFromParcel2;
                        }
                        com.yandex.plus.home.repository.api.model.panel.d0 d0Var = createFromParcel2;
                        if (parcel.readInt() == 0) {
                            arrayList2 = null;
                        } else {
                            int readInt13 = parcel.readInt();
                            arrayList2 = new ArrayList(readInt13);
                            int i12 = 0;
                            while (i12 != readInt13) {
                                i12 = com.appsflyer.internal.k.c(f0.CREATOR, parcel, arrayList2, i12, 1);
                                readInt13 = readInt13;
                                readString = readString;
                            }
                        }
                        String str = readString;
                        com.yandex.plus.home.repository.api.model.panel.d0 createFromParcel3 = parcel.readInt() == 0 ? null : com.yandex.plus.home.repository.api.model.panel.d0.CREATOR.createFromParcel(parcel);
                        com.yandex.plus.home.repository.api.model.panel.h createFromParcel4 = parcel.readInt() == 0 ? null : com.yandex.plus.home.repository.api.model.panel.h.CREATOR.createFromParcel(parcel);
                        String readString6 = parcel.readString();
                        com.yandex.plus.core.data.common.v vVar5 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(cls2.getClassLoader());
                        com.yandex.plus.core.data.common.v vVar6 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(cls2.getClassLoader());
                        com.yandex.plus.core.data.common.y yVar = (com.yandex.plus.core.data.common.y) parcel.readParcelable(cls2.getClassLoader());
                        com.yandex.plus.core.data.common.y yVar2 = (com.yandex.plus.core.data.common.y) parcel.readParcelable(cls2.getClassLoader());
                        com.yandex.plus.core.data.common.y yVar3 = (com.yandex.plus.core.data.common.y) parcel.readParcelable(cls2.getClassLoader());
                        if (parcel.readInt() == 0) {
                            arrayList3 = arrayList2;
                            hVar = createFromParcel4;
                            linkedHashMap = null;
                        } else {
                            int readInt14 = parcel.readInt();
                            arrayList3 = arrayList2;
                            linkedHashMap = new LinkedHashMap(readInt14);
                            hVar = createFromParcel4;
                            int i13 = 0;
                            while (i13 != readInt14) {
                                i13 = com.appsflyer.internal.k.b(parcel, linkedHashMap, parcel.readString(), i13, 1);
                                readInt14 = readInt14;
                                vVar5 = vVar5;
                            }
                        }
                        return new com.yandex.plus.home.repository.api.model.panel.b(str, readString2, readString3, readString4, vVar, vVar2, vVar3, d0Var, readString5, vVar4, arrayList12, arrayList, arrayList13, arrayList3, createFromParcel3, hVar, readString6, vVar5, vVar6, yVar, yVar2, yVar3, linkedHashMap);
                    }
                    i9 = com.appsflyer.internal.k.c(com.yandex.plus.home.repository.api.model.panel.e0.CREATOR, parcel, arrayList12, i9, 1);
                    cls = cls2;
                }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new h[i];
            case 1:
                return new p[i];
            case 2:
                return new q[i];
            case 3:
                return new com.yandex.plus.core.data.common.c[i];
            case 4:
                return new com.yandex.plus.core.data.common.f[i];
            case 5:
                return new com.yandex.plus.core.data.common.j[i];
            case 6:
                return new com.yandex.plus.core.data.common.o[i];
            case 7:
                return new com.yandex.plus.core.data.common.r[i];
            case 8:
                return new com.yandex.plus.core.data.common.v[i];
            case 9:
                return new com.yandex.plus.core.data.common.y[i];
            case 10:
                return new com.yandex.plus.core.data.common.b0[i];
            case 11:
                return new com.yandex.plus.core.data.family.a[i];
            case 12:
                return new com.yandex.plus.core.data.family.c[i];
            case 13:
                return new com.yandex.plus.core.data.pay.a[i];
            case 14:
                return new com.yandex.plus.core.data.pay.b[i];
            case 15:
                return new com.yandex.plus.core.data.pay.h[i];
            case 16:
                return new com.yandex.plus.core.data.pay.k[i];
            case 17:
                return new com.yandex.plus.core.data.pay.o[i];
            case 18:
                return new com.yandex.plus.core.data.pay.p[i];
            case 19:
                return new com.yandex.plus.core.data.pay.s[i];
            case 20:
                return new com.yandex.plus.core.data.user.a[i];
            case 21:
                return new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.c[i];
            case 22:
                return new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.f[i];
            case 23:
                return new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.m[i];
            case 24:
                return new com.yandex.plus.home.feature.webviews.internalapi.subscription.c[i];
            case 25:
                return new com.yandex.plus.home.feature.webviews.internalapi.subscription.f[i];
            case 26:
                return new com.yandex.plus.home.feature.webviews.internalapi.subscription.i[i];
            case 27:
                return new com.yandex.plus.home.feature.webviews.internalapi.subscription.l[i];
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.plus.home.feature.webviews.internalapi.subscription.o[i];
            default:
                return new com.yandex.plus.home.repository.api.model.panel.b[i];
        }
    }
}
