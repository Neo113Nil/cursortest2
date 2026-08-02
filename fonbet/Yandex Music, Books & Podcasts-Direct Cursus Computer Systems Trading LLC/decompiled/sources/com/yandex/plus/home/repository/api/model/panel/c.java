package com.yandex.plus.home.repository.api.model.panel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes5.dex */
public final class c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        LinkedHashMap linkedHashMap;
        switch (this.a) {
            case 0:
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                com.yandex.plus.core.data.common.v vVar = (com.yandex.plus.core.data.common.v) parcel.readParcelable(d.class.getClassLoader());
                com.yandex.plus.core.data.common.v vVar2 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(d.class.getClassLoader());
                com.yandex.plus.core.data.common.v vVar3 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(d.class.getClassLoader());
                LinkedHashMap linkedHashMap2 = null;
                d0 createFromParcel = parcel.readInt() == 0 ? null : d0.CREATOR.createFromParcel(parcel);
                String readString5 = parcel.readString();
                com.yandex.plus.core.data.common.v vVar4 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(d.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = com.appsflyer.internal.k.c(e0.CREATOR, parcel, arrayList9, i2, 1);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList10 = new ArrayList(readInt2);
                    int i3 = 0;
                    while (i3 != readInt2) {
                        i3 = com.appsflyer.internal.k.c(e0.CREATOR, parcel, arrayList10, i3, 1);
                    }
                    arrayList = arrayList10;
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = com.appsflyer.internal.k.c(f0.CREATOR, parcel, arrayList11, i4, 1);
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList12 = new ArrayList(readInt4);
                    int i5 = 0;
                    while (i5 != readInt4) {
                        i5 = com.appsflyer.internal.k.c(f0.CREATOR, parcel, arrayList12, i5, 1);
                    }
                    arrayList2 = arrayList12;
                }
                d0 createFromParcel2 = parcel.readInt() == 0 ? null : d0.CREATOR.createFromParcel(parcel);
                h createFromParcel3 = parcel.readInt() == 0 ? null : h.CREATOR.createFromParcel(parcel);
                String readString6 = parcel.readString();
                com.yandex.plus.core.data.common.v vVar5 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(d.class.getClassLoader());
                com.yandex.plus.core.data.common.v vVar6 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(d.class.getClassLoader());
                com.yandex.plus.core.data.common.y yVar = (com.yandex.plus.core.data.common.y) parcel.readParcelable(d.class.getClassLoader());
                com.yandex.plus.core.data.common.y yVar2 = (com.yandex.plus.core.data.common.y) parcel.readParcelable(d.class.getClassLoader());
                com.yandex.plus.core.data.common.y yVar3 = (com.yandex.plus.core.data.common.y) parcel.readParcelable(d.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    int readInt5 = parcel.readInt();
                    linkedHashMap2 = new LinkedHashMap(readInt5);
                    while (i != readInt5) {
                        i = com.appsflyer.internal.k.b(parcel, linkedHashMap2, parcel.readString(), i, 1);
                    }
                }
                return new d(readString, readString2, readString3, readString4, vVar, vVar2, vVar3, createFromParcel, readString5, vVar4, arrayList9, arrayList, arrayList11, arrayList2, createFromParcel2, createFromParcel3, readString6, vVar5, vVar6, yVar, yVar2, yVar3, linkedHashMap2);
            case 1:
                parcel.getClass();
                String readString7 = parcel.readString();
                com.yandex.plus.core.data.common.v vVar7 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(e.class.getClassLoader());
                com.yandex.plus.core.data.common.y yVar4 = (com.yandex.plus.core.data.common.y) parcel.readParcelable(e.class.getClassLoader());
                com.yandex.plus.core.data.common.y yVar5 = (com.yandex.plus.core.data.common.y) parcel.readParcelable(e.class.getClassLoader());
                ArrayList arrayList13 = null;
                d0 createFromParcel4 = parcel.readInt() == 0 ? null : d0.CREATOR.createFromParcel(parcel);
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                com.yandex.plus.core.data.common.v vVar8 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(e.class.getClassLoader());
                com.yandex.plus.core.data.common.v vVar9 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(e.class.getClassLoader());
                com.yandex.plus.core.data.common.v vVar10 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(e.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt6 = parcel.readInt();
                    ArrayList arrayList14 = new ArrayList(readInt6);
                    int i6 = 0;
                    while (i6 != readInt6) {
                        i6 = com.appsflyer.internal.k.c(e0.CREATOR, parcel, arrayList14, i6, 1);
                    }
                    arrayList3 = arrayList14;
                }
                if (parcel.readInt() == 0) {
                    arrayList4 = null;
                } else {
                    int readInt7 = parcel.readInt();
                    ArrayList arrayList15 = new ArrayList(readInt7);
                    int i7 = 0;
                    while (i7 != readInt7) {
                        i7 = com.appsflyer.internal.k.c(e0.CREATOR, parcel, arrayList15, i7, 1);
                    }
                    arrayList4 = arrayList15;
                }
                if (parcel.readInt() == 0) {
                    arrayList5 = null;
                } else {
                    int readInt8 = parcel.readInt();
                    ArrayList arrayList16 = new ArrayList(readInt8);
                    int i8 = 0;
                    while (i8 != readInt8) {
                        i8 = com.appsflyer.internal.k.c(f0.CREATOR, parcel, arrayList16, i8, 1);
                    }
                    arrayList5 = arrayList16;
                }
                if (parcel.readInt() == 0) {
                    arrayList6 = null;
                } else {
                    int readInt9 = parcel.readInt();
                    ArrayList arrayList17 = new ArrayList(readInt9);
                    int i9 = 0;
                    while (i9 != readInt9) {
                        i9 = com.appsflyer.internal.k.c(f0.CREATOR, parcel, arrayList17, i9, 1);
                    }
                    arrayList6 = arrayList17;
                }
                d0 createFromParcel5 = parcel.readInt() == 0 ? null : d0.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int readInt10 = parcel.readInt();
                    arrayList13 = new ArrayList(readInt10);
                    for (int i10 = 0; i10 != readInt10; i10++) {
                        arrayList13.add(parcel.readParcelable(e.class.getClassLoader()));
                    }
                }
                return new e(readString7, vVar7, yVar4, yVar5, createFromParcel4, readString8, readString9, readString10, vVar8, vVar9, vVar10, arrayList3, arrayList4, arrayList5, arrayList6, createFromParcel5, arrayList13);
            case 2:
                parcel.getClass();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                com.yandex.plus.core.data.common.v vVar11 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(f.class.getClassLoader());
                com.yandex.plus.core.data.common.v vVar12 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(f.class.getClassLoader());
                com.yandex.plus.core.data.common.v vVar13 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(f.class.getClassLoader());
                d0 createFromParcel6 = parcel.readInt() == 0 ? null : d0.CREATOR.createFromParcel(parcel);
                String readString15 = parcel.readString();
                com.yandex.plus.core.data.common.v vVar14 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(f.class.getClassLoader());
                int readInt11 = parcel.readInt();
                ArrayList arrayList18 = new ArrayList(readInt11);
                int i11 = 0;
                while (i11 != readInt11) {
                    i11 = com.appsflyer.internal.k.c(e0.CREATOR, parcel, arrayList18, i11, 1);
                }
                if (parcel.readInt() == 0) {
                    arrayList7 = null;
                } else {
                    int readInt12 = parcel.readInt();
                    arrayList7 = new ArrayList(readInt12);
                    int i12 = 0;
                    while (i12 != readInt12) {
                        i12 = com.appsflyer.internal.k.c(e0.CREATOR, parcel, arrayList7, i12, 1);
                    }
                }
                int readInt13 = parcel.readInt();
                ArrayList arrayList19 = new ArrayList(readInt13);
                int i13 = 0;
                while (i13 != readInt13) {
                    i13 = com.appsflyer.internal.k.c(f0.CREATOR, parcel, arrayList19, i13, 1);
                }
                if (parcel.readInt() == 0) {
                    arrayList8 = null;
                } else {
                    int readInt14 = parcel.readInt();
                    ArrayList arrayList20 = new ArrayList(readInt14);
                    int i14 = 0;
                    while (i14 != readInt14) {
                        i14 = com.appsflyer.internal.k.c(f0.CREATOR, parcel, arrayList20, i14, 1);
                        readInt14 = readInt14;
                    }
                    arrayList8 = arrayList20;
                }
                d0 createFromParcel7 = parcel.readInt() == 0 ? null : d0.CREATOR.createFromParcel(parcel);
                h createFromParcel8 = parcel.readInt() == 0 ? null : h.CREATOR.createFromParcel(parcel);
                String readString16 = parcel.readString();
                com.yandex.plus.core.data.common.v vVar15 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(f.class.getClassLoader());
                com.yandex.plus.core.data.common.v vVar16 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(f.class.getClassLoader());
                com.yandex.plus.core.data.common.y yVar6 = (com.yandex.plus.core.data.common.y) parcel.readParcelable(f.class.getClassLoader());
                com.yandex.plus.core.data.common.y yVar7 = (com.yandex.plus.core.data.common.y) parcel.readParcelable(f.class.getClassLoader());
                com.yandex.plus.core.data.common.y yVar8 = (com.yandex.plus.core.data.common.y) parcel.readParcelable(f.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt15 = parcel.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt15);
                    int i15 = 0;
                    while (i15 != readInt15) {
                        i15 = com.appsflyer.internal.k.b(parcel, linkedHashMap3, parcel.readString(), i15, 1);
                    }
                    linkedHashMap = linkedHashMap3;
                }
                return new f(readString11, readString12, readString13, readString14, vVar11, vVar12, vVar13, createFromParcel6, readString15, vVar14, arrayList18, arrayList7, arrayList19, arrayList8, createFromParcel7, createFromParcel8, readString16, vVar15, vVar16, yVar6, yVar7, yVar8, linkedHashMap, e.CREATOR.createFromParcel(parcel));
            case 3:
                parcel.getClass();
                String readString17 = parcel.readString();
                com.yandex.plus.core.data.common.v vVar17 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(h.class.getClassLoader());
                com.yandex.plus.core.data.common.v vVar18 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(h.class.getClassLoader());
                int readInt16 = parcel.readInt();
                ArrayList arrayList21 = new ArrayList(readInt16);
                int i16 = 0;
                int i17 = 0;
                while (i17 != readInt16) {
                    i17 = com.appsflyer.internal.k.c(e0.CREATOR, parcel, arrayList21, i17, 1);
                }
                int readInt17 = parcel.readInt();
                ArrayList arrayList22 = new ArrayList(readInt17);
                while (i16 != readInt17) {
                    i16 = com.appsflyer.internal.k.c(f0.CREATOR, parcel, arrayList22, i16, 1);
                }
                return new h(readString17, vVar17, vVar18, arrayList21, arrayList22, (com.yandex.plus.core.data.common.v) parcel.readParcelable(h.class.getClassLoader()), parcel.readDouble(), (com.yandex.plus.core.data.common.v) parcel.readParcelable(h.class.getClassLoader()));
            case 4:
                parcel.getClass();
                String readString18 = parcel.readString();
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                com.yandex.plus.core.data.common.v vVar19 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(o.class.getClassLoader());
                com.yandex.plus.core.data.common.v vVar20 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(o.class.getClassLoader());
                LinkedHashMap linkedHashMap4 = null;
                d0 createFromParcel9 = parcel.readInt() == 0 ? null : d0.CREATOR.createFromParcel(parcel);
                boolean z = parcel.readInt() != 0;
                com.yandex.plus.core.data.common.v vVar21 = (com.yandex.plus.core.data.common.v) parcel.readParcelable(o.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    int readInt18 = parcel.readInt();
                    linkedHashMap4 = new LinkedHashMap(readInt18);
                    int i18 = 0;
                    while (i18 != readInt18) {
                        i18 = com.appsflyer.internal.k.b(parcel, linkedHashMap4, parcel.readString(), i18, 1);
                    }
                }
                return new o(readString18, readString19, readString20, readString21, vVar19, vVar20, createFromParcel9, z, vVar21, linkedHashMap4, parcel.readInt() != 0);
            case 5:
                parcel.getClass();
                return new p(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (com.yandex.plus.core.data.common.v) parcel.readParcelable(p.class.getClassLoader()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(p.class.getClassLoader()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(p.class.getClassLoader()), parcel.readInt() == 0 ? null : d0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 6:
                parcel.getClass();
                return new q((com.yandex.plus.core.data.common.v) parcel.readParcelable(q.class.getClassLoader()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(q.class.getClassLoader()));
            case 7:
                parcel.getClass();
                return new r((com.yandex.plus.core.data.common.v) parcel.readParcelable(r.class.getClassLoader()));
            case 8:
                parcel.getClass();
                return new t(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (com.yandex.plus.core.data.common.v) parcel.readParcelable(t.class.getClassLoader()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(t.class.getClassLoader()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(t.class.getClassLoader()), parcel.readInt() == 0 ? null : d0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (s) parcel.readParcelable(t.class.getClassLoader()));
            case 9:
                parcel.getClass();
                return new u(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (com.yandex.plus.core.data.common.v) parcel.readParcelable(u.class.getClassLoader()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(u.class.getClassLoader()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(u.class.getClassLoader()), parcel.readInt() == 0 ? null : d0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (com.yandex.plus.core.data.common.y) parcel.readParcelable(u.class.getClassLoader()), (com.yandex.plus.core.data.common.y) parcel.readParcelable(u.class.getClassLoader()), (com.yandex.plus.core.data.common.y) parcel.readParcelable(u.class.getClassLoader()));
            case 10:
                parcel.getClass();
                return new v(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (com.yandex.plus.core.data.common.v) parcel.readParcelable(v.class.getClassLoader()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(v.class.getClassLoader()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(v.class.getClassLoader()), parcel.readInt() == 0 ? null : d0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (com.yandex.plus.core.data.common.y) parcel.readParcelable(v.class.getClassLoader()));
            case 11:
                parcel.getClass();
                return new w(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (com.yandex.plus.core.data.common.v) parcel.readParcelable(w.class.getClassLoader()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(w.class.getClassLoader()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(w.class.getClassLoader()), parcel.readInt() == 0 ? null : d0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (com.yandex.plus.core.data.common.y) parcel.readParcelable(w.class.getClassLoader()), parcel.readInt() != 0 ? d0.CREATOR.createFromParcel(parcel) : null);
            case 12:
                parcel.getClass();
                return new x(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (com.yandex.plus.core.data.common.v) parcel.readParcelable(x.class.getClassLoader()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(x.class.getClassLoader()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(x.class.getClassLoader()), parcel.readInt() == 0 ? null : d0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (com.yandex.plus.core.data.common.y) parcel.readParcelable(x.class.getClassLoader()));
            case 13:
                parcel.getClass();
                return new y((com.yandex.plus.core.data.common.v) parcel.readParcelable(y.class.getClassLoader()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(y.class.getClassLoader()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(y.class.getClassLoader()), parcel.readInt() == 0 ? null : d0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? d0.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 14:
                parcel.getClass();
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                a0 valueOf = a0.valueOf(parcel.readString());
                boolean z2 = parcel.readInt() != 0;
                int readInt19 = parcel.readInt();
                ArrayList arrayList23 = new ArrayList(readInt19);
                for (int i19 = 0; i19 != readInt19; i19++) {
                    arrayList23.add(parcel.readParcelable(b0.class.getClassLoader()));
                }
                return new b0(readString22, readString23, valueOf, z2, arrayList23);
            case 15:
                parcel.getClass();
                return new d0(parcel.readString(), (com.yandex.plus.core.data.common.v) parcel.readParcelable(d0.class.getClassLoader()), parcel.readString(), parcel.readString(), a.valueOf(parcel.readString()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(d0.class.getClassLoader()));
            case 16:
                parcel.getClass();
                return new e0(parcel.readString(), parcel.readString(), (com.yandex.plus.core.data.common.v) parcel.readParcelable(e0.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 17:
                parcel.getClass();
                return new f0(parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                parcel.getClass();
                return new com.yandex.plus.home.repository.api.model.webconfig.a0(parcel.readString(), parcel.readString(), com.yandex.plus.home.repository.api.model.webconfig.z.CREATOR.createFromParcel(parcel), com.yandex.plus.home.repository.api.model.webconfig.p.CREATOR.createFromParcel(parcel), com.yandex.plus.home.repository.api.model.webconfig.f.CREATOR.createFromParcel(parcel));
            case 19:
                parcel.getClass();
                return new com.yandex.plus.home.repository.api.model.webconfig.f(parcel.readString(), parcel.readString(), (com.yandex.plus.core.data.common.v) parcel.readParcelable(com.yandex.plus.home.repository.api.model.webconfig.f.class.getClassLoader()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(com.yandex.plus.home.repository.api.model.webconfig.f.class.getClassLoader()));
            case 20:
                parcel.getClass();
                return new com.yandex.plus.home.repository.api.model.webconfig.p(parcel.readInt() == 0 ? null : com.yandex.plus.home.repository.api.model.webconfig.k.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? com.yandex.plus.home.repository.api.model.webconfig.o.CREATOR.createFromParcel(parcel) : null, (com.yandex.plus.core.data.common.c) parcel.readParcelable(com.yandex.plus.home.repository.api.model.webconfig.p.class.getClassLoader()), (com.yandex.plus.core.data.common.v) parcel.readParcelable(com.yandex.plus.home.repository.api.model.webconfig.p.class.getClassLoader()));
            case 21:
                parcel.getClass();
                return new com.yandex.plus.home.repository.api.model.webconfig.k(parcel.readString(), parcel.readString());
            case 22:
                parcel.getClass();
                return new com.yandex.plus.home.repository.api.model.webconfig.o(parcel.readString(), parcel.readString(), parcel.readString());
            case 23:
                parcel.getClass();
                String readString24 = parcel.readString();
                int readInt20 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt20);
                int i20 = 0;
                for (int i21 = 0; i21 != readInt20; i21++) {
                    linkedHashSet.add(parcel.readString());
                }
                int readInt21 = parcel.readInt();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(readInt21);
                while (i20 != readInt21) {
                    i20 = com.appsflyer.internal.k.b(parcel, linkedHashMap5, parcel.readString(), i20, 1);
                }
                return new com.yandex.plus.home.repository.api.model.webconfig.u(readString24, linkedHashSet, linkedHashMap5);
            case 24:
                parcel.getClass();
                return new com.yandex.plus.home.repository.api.model.webconfig.z(parcel.createStringArrayList(), parcel.readInt() != 0, com.yandex.plus.home.repository.api.model.webconfig.v.valueOf(parcel.readString()), com.yandex.plus.home.repository.api.model.webconfig.x.valueOf(parcel.readString()), com.yandex.plus.home.repository.api.model.webconfig.y.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : com.yandex.plus.home.repository.api.model.webconfig.u.CREATOR.createFromParcel(parcel));
            case 25:
                parcel.getClass();
                return new com.yandex.plus.pay.adapter.api.r(parcel.readString(), parcel.readInt() != 0);
            case 26:
                parcel.getClass();
                return new com.yandex.plus.pay.adapter.api.u(com.yandex.plus.pay.adapter.api.f0.valueOf(parcel.readString()));
            case 27:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.pay.adapter.api.w.INSTANCE;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                return new com.yandex.plus.pay.adapter.api.z((com.yandex.plus.core.data.pay.k) parcel.readParcelable(com.yandex.plus.pay.adapter.api.z.class.getClassLoader()));
            default:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.pay.adapter.api.a0.INSTANCE;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new d[i];
            case 1:
                return new e[i];
            case 2:
                return new f[i];
            case 3:
                return new h[i];
            case 4:
                return new o[i];
            case 5:
                return new p[i];
            case 6:
                return new q[i];
            case 7:
                return new r[i];
            case 8:
                return new t[i];
            case 9:
                return new u[i];
            case 10:
                return new v[i];
            case 11:
                return new w[i];
            case 12:
                return new x[i];
            case 13:
                return new y[i];
            case 14:
                return new b0[i];
            case 15:
                return new d0[i];
            case 16:
                return new e0[i];
            case 17:
                return new f0[i];
            case 18:
                return new com.yandex.plus.home.repository.api.model.webconfig.a0[i];
            case 19:
                return new com.yandex.plus.home.repository.api.model.webconfig.f[i];
            case 20:
                return new com.yandex.plus.home.repository.api.model.webconfig.p[i];
            case 21:
                return new com.yandex.plus.home.repository.api.model.webconfig.k[i];
            case 22:
                return new com.yandex.plus.home.repository.api.model.webconfig.o[i];
            case 23:
                return new com.yandex.plus.home.repository.api.model.webconfig.u[i];
            case 24:
                return new com.yandex.plus.home.repository.api.model.webconfig.z[i];
            case 25:
                return new com.yandex.plus.pay.adapter.api.r[i];
            case 26:
                return new com.yandex.plus.pay.adapter.api.u[i];
            case 27:
                return new com.yandex.plus.pay.adapter.api.w[i];
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.plus.pay.adapter.api.z[i];
            default:
                return new com.yandex.plus.pay.adapter.api.a0[i];
        }
    }
}
