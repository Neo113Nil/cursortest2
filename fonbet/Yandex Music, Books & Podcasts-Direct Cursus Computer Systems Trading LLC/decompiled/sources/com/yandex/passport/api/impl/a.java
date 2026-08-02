package com.yandex.passport.api.impl;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import com.yandex.passport.api.n;
import com.yandex.passport.api.w0;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.common.core.d;
import com.yandex.passport.common.core.e;
import com.yandex.passport.common.core.f;
import com.yandex.passport.common.core.g;
import com.yandex.passport.data.models.i;
import com.yandex.passport.data.models.j;
import com.yandex.passport.data.models.l;
import com.yandex.passport.data.models.w;
import com.yandex.passport.data.network.c4;
import com.yandex.passport.data.network.c9;
import com.yandex.passport.data.network.i8;
import com.yandex.passport.data.network.j8;
import com.yandex.passport.data.network.k8;
import com.yandex.passport.data.network.l8;
import com.yandex.passport.data.network.m8;
import com.yandex.passport.data.network.o0;
import com.yandex.passport.data.network.w8;
import com.yandex.passport.internal.entities.p;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        long b;
        long b2;
        switch (this.a) {
            case 0:
                return b.a(parcel.readInt());
            case 1:
                parcel.getClass();
                y1 valueOf = y1.valueOf(parcel.readString());
                b bVar = (b) parcel.readParcelable(c.class.getClassLoader());
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                boolean z2 = false;
                int i = 0;
                while (i != readInt) {
                    i = k.b(parcel, linkedHashMap, parcel.readString(), i, 1);
                }
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new c(valueOf, bVar, linkedHashMap, z2, parcel.readInt() != 0 ? true : z);
            case 2:
                parcel.getClass();
                return new com.yandex.passport.common.account.a(parcel.readString());
            case 3:
                parcel.getClass();
                return new com.yandex.passport.common.bitflag.a(parcel.readInt());
            case 4:
                parcel.getClass();
                return new com.yandex.passport.common.bitflag.b((com.yandex.passport.common.bitflag.a) parcel.readParcelable(com.yandex.passport.common.bitflag.b.class.getClassLoader()));
            case 5:
                parcel.getClass();
                return com.yandex.passport.common.core.b.valueOf(parcel.readString());
            case 6:
                parcel.getClass();
                return new d(parcel.readString());
            case 7:
                parcel.getClass();
                String readString = parcel.readString();
                readString.getClass();
                return new e(readString);
            case 8:
                parcel.getClass();
                return new f(com.yandex.passport.common.core.b.CREATOR.createFromParcel(parcel), parcel.readLong());
            case 9:
                parcel.getClass();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, parcel.readLong());
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                int readInt2 = parcel.readInt();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean z3 = parcel.readInt() != 0;
                String readString9 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                String readString10 = parcel.readString();
                boolean z5 = parcel.readInt() != 0;
                boolean z6 = parcel.readInt() != 0;
                boolean z7 = parcel.readInt() != 0;
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                int readInt3 = parcel.readInt();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                boolean z8 = parcel.readInt() != 0;
                String readString16 = parcel.readString();
                boolean z9 = parcel.readInt() != 0;
                boolean z10 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                int readInt4 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt4);
                int i2 = 0;
                while (i2 != readInt4) {
                    i2 = k.c(e.CREATOR, parcel, arrayList, i2, 1);
                }
                boolean z12 = parcel.readInt() != 0;
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0;
                boolean z15 = parcel.readInt() != 0;
                boolean z16 = parcel.readInt() != 0;
                boolean z17 = parcel.readInt() != 0;
                boolean z18 = parcel.readInt() != 0;
                Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                int i3 = 0;
                String readString17 = parcel.readString();
                int readInt5 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt5);
                while (true) {
                    Long l = valueOf2;
                    if (i3 == readInt5) {
                        return new g(readInt2, readInt3, b, readLong, l, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, arrayList, linkedHashMap2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                    }
                    String readString18 = parcel.readString();
                    int i4 = readInt5;
                    int readInt6 = parcel.readInt();
                    int i5 = readInt2;
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt6);
                    int i6 = readInt3;
                    int i7 = 0;
                    while (i7 != readInt6) {
                        linkedHashSet.add(parcel.readString());
                        i7++;
                        readInt6 = readInt6;
                    }
                    linkedHashMap2.put(readString18, linkedHashSet);
                    i3++;
                    valueOf2 = l;
                    readInt5 = i4;
                    readInt2 = i5;
                    readInt3 = i6;
                }
            case 10:
                parcel.getClass();
                return new com.yandex.passport.common.ebs.a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                parcel.getClass();
                return new com.yandex.passport.common.ebs.g(d.CREATOR.createFromParcel(parcel));
            case 12:
                parcel.getClass();
                return new com.yandex.passport.common.properties.a(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 13:
                parcel.getClass();
                return new com.yandex.passport.common.resources.c(parcel.readInt());
            case 14:
                parcel.getClass();
                i valueOf3 = i.valueOf(parcel.readString());
                int readInt7 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt7);
                for (int i8 = 0; i8 != readInt7; i8++) {
                    linkedHashSet2.add(parcel.readString());
                }
                return new j(valueOf3, linkedHashSet2);
            case 15:
                parcel.getClass();
                return new com.yandex.passport.data.models.k(parcel.readString(), parcel.readInt(), parcel.readLong());
            case 16:
                parcel.getClass();
                parcel.readInt();
                return new l();
            case 17:
                parcel.getClass();
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                b2 = com.yandex.passport.common.time.a.b(0L, 0L, 0L, parcel.readLong());
                long readLong2 = parcel.readLong();
                String readString21 = parcel.readString();
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                String readString24 = parcel.readString();
                int readInt8 = parcel.readInt();
                String readString25 = parcel.readString();
                String readString26 = parcel.readString();
                boolean z19 = parcel.readInt() != 0;
                String readString27 = parcel.readString();
                boolean z20 = parcel.readInt() != 0;
                String readString28 = parcel.readString();
                boolean z21 = parcel.readInt() != 0;
                boolean z22 = parcel.readInt() != 0;
                boolean z23 = parcel.readInt() != 0;
                String readString29 = parcel.readString();
                String readString30 = parcel.readString();
                String readString31 = parcel.readString();
                int readInt9 = parcel.readInt();
                String readString32 = parcel.readString();
                String readString33 = parcel.readString();
                boolean z24 = parcel.readInt() != 0;
                String readString34 = parcel.readString();
                boolean z25 = parcel.readInt() != 0;
                boolean z26 = parcel.readInt() != 0;
                boolean z27 = parcel.readInt() != 0;
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                boolean z28 = parcel.readInt() != 0;
                boolean z29 = parcel.readInt() != 0;
                boolean z30 = parcel.readInt() != 0;
                boolean z31 = parcel.readInt() != 0;
                boolean z32 = parcel.readInt() != 0;
                boolean z33 = parcel.readInt() != 0;
                boolean z34 = parcel.readInt() != 0;
                Long valueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                int readInt10 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt10);
                for (int i9 = 0; i9 != readInt10; i9++) {
                    String readString35 = parcel.readString();
                    int readInt11 = parcel.readInt();
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet(readInt11);
                    for (int i10 = 0; i10 != readInt11; i10++) {
                        linkedHashSet3.add(parcel.readString());
                    }
                    linkedHashMap3.put(readString35, linkedHashSet3);
                }
                return new w(readInt8, readInt9, b2, readLong2, valueOf4, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), readString19, readString20, readString21, readString22, readString23, readString24, readString25, readString26, readString27, readString28, readString29, readString30, readString31, readString32, readString33, readString34, createStringArrayList, linkedHashMap3, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, z33, z34, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 18:
                parcel.getClass();
                String readString36 = parcel.readString();
                boolean z35 = parcel.readInt() != 0;
                boolean z36 = parcel.readInt() != 0;
                int readInt12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt12);
                for (int i11 = 0; i11 != readInt12; i11++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                return new o0(readString36, z35, z36, arrayList2);
            case 19:
                parcel.getClass();
                return new c4(parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                parcel.getClass();
                return new i8(parcel.readString(), (m8) parcel.readParcelable(i8.class.getClassLoader()));
            case 21:
                parcel.getClass();
                parcel.readInt();
                return j8.a;
            case 22:
                parcel.getClass();
                parcel.readInt();
                return k8.a;
            case 23:
                parcel.getClass();
                return new l8(parcel.readString());
            case 24:
                parcel.getClass();
                return new w8(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 25:
                parcel.getClass();
                String readString37 = parcel.readString();
                boolean z37 = parcel.readInt() != 0;
                boolean z38 = parcel.readInt() != 0;
                boolean z39 = parcel.readInt() != 0;
                boolean z40 = parcel.readInt() != 0;
                String readString38 = parcel.readString();
                int readInt13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt13);
                int i12 = 0;
                while (i12 != readInt13) {
                    i12 = k.c(c4.CREATOR, parcel, arrayList3, i12, 1);
                }
                return new c9(readString37, z37, z38, z39, z40, readString38, arrayList3, parcel.readString(), parcel.readInt() != 0);
            case 26:
                parcel.getClass();
                return new com.yandex.passport.internal.account.f(z1.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, com.yandex.passport.internal.stash.a.CREATOR.createFromParcel(parcel), (Account) parcel.readParcelable(com.yandex.passport.internal.account.f.class.getClassLoader()), n.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), parcel.readString(), p.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 27:
                parcel.getClass();
                Parcelable.Creator<z1> creator = z1.CREATOR;
                return new com.yandex.passport.internal.account.g(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), n.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                return new com.yandex.passport.internal.analytics.a(parcel.readString(), parcel.readInt() == 0 ? null : w0.valueOf(parcel.readString()), parcel.readInt() != 0);
            default:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.passport.internal.credentials.a.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new b[i];
            case 1:
                return new c[i];
            case 2:
                return new com.yandex.passport.common.account.a[i];
            case 3:
                return new com.yandex.passport.common.bitflag.a[i];
            case 4:
                return new com.yandex.passport.common.bitflag.b[i];
            case 5:
                return new com.yandex.passport.common.core.b[i];
            case 6:
                return new d[i];
            case 7:
                return new e[i];
            case 8:
                return new f[i];
            case 9:
                return new g[i];
            case 10:
                return new com.yandex.passport.common.ebs.a[i];
            case 11:
                return new com.yandex.passport.common.ebs.g[i];
            case 12:
                return new com.yandex.passport.common.properties.a[i];
            case 13:
                return new com.yandex.passport.common.resources.c[i];
            case 14:
                return new j[i];
            case 15:
                return new com.yandex.passport.data.models.k[i];
            case 16:
                return new l[i];
            case 17:
                return new w[i];
            case 18:
                return new o0[i];
            case 19:
                return new c4[i];
            case 20:
                return new i8[i];
            case 21:
                return new j8[i];
            case 22:
                return new k8[i];
            case 23:
                return new l8[i];
            case 24:
                return new w8[i];
            case 25:
                return new c9[i];
            case 26:
                return new com.yandex.passport.internal.account.f[i];
            case 27:
                return new com.yandex.passport.internal.account.g[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.passport.internal.analytics.a[i];
            default:
                return new com.yandex.passport.internal.credentials.a[i];
        }
    }
}
