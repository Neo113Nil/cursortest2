package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.l2;
import com.yandex.passport.api.m1;
import com.yandex.passport.api.o2;
import com.yandex.passport.api.q0;
import com.yandex.passport.api.r0;
import com.yandex.passport.api.u0;
import com.yandex.passport.api.u2;
import com.yandex.passport.api.v1;
import com.yandex.passport.api.v2;
import com.yandex.passport.api.w1;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class f implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        q0 q0Var;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new g(com.yandex.passport.internal.entities.k.CREATOR.createFromParcel(parcel), y1.valueOf(parcel.readString()), com.yandex.passport.api.x.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, (com.yandex.passport.internal.credentials.f) parcel.readParcelable(g.class.getClassLoader()));
            case 1:
                parcel.getClass();
                y1 valueOf = y1.valueOf(parcel.readString());
                z1 createFromParcel = z1.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                int i = 0;
                boolean z11 = parcel.readInt() != 0;
                m0 createFromParcel2 = parcel.readInt() == 0 ? null : m0.CREATOR.createFromParcel(parcel);
                ArrayList arrayList3 = new ArrayList();
                parcel.readStringList(arrayList3);
                ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    m1.a(str);
                    arrayList4.add(new m1(str));
                }
                com.yandex.passport.internal.entities.p pVar = new com.yandex.passport.internal.entities.p(arrayList4);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                while (i != readInt) {
                    i = com.appsflyer.internal.k.b(parcel, linkedHashMap2, parcel.readString(), i, 1);
                }
                return new h(valueOf, createFromParcel, readString, z11, createFromParcel2, pVar, linkedHashMap2);
            case 2:
                parcel.getClass();
                return new i(z1.CREATOR.createFromParcel(parcel), parcel.readString(), y1.valueOf(parcel.readString()));
            case 3:
                parcel.getClass();
                return new j(y1.valueOf(parcel.readString()), z1.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                parcel.getClass();
                String readString2 = parcel.readString();
                boolean z12 = parcel.readInt() != 0;
                String readString3 = parcel.readString();
                com.yandex.passport.internal.entities.k createFromParcel3 = com.yandex.passport.internal.entities.k.CREATOR.createFromParcel(parcel);
                y1 valueOf2 = y1.valueOf(parcel.readString());
                com.yandex.passport.internal.e createFromParcel4 = parcel.readInt() == 0 ? null : com.yandex.passport.internal.e.CREATOR.createFromParcel(parcel);
                z1 createFromParcel5 = parcel.readInt() == 0 ? null : z1.CREATOR.createFromParcel(parcel);
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0;
                w1 valueOf3 = parcel.readInt() == 0 ? null : w1.valueOf(parcel.readString());
                String readString4 = parcel.readString();
                boolean z15 = parcel.readInt() != 0;
                z1 createFromParcel6 = parcel.readInt() == 0 ? null : z1.CREATOR.createFromParcel(parcel);
                com.yandex.passport.internal.entities.w createFromParcel7 = parcel.readInt() == 0 ? null : com.yandex.passport.internal.entities.w.CREATOR.createFromParcel(parcel);
                f0 createFromParcel8 = f0.CREATOR.createFromParcel(parcel);
                k0 createFromParcel9 = k0.CREATOR.createFromParcel(parcel);
                h createFromParcel10 = parcel.readInt() == 0 ? null : h.CREATOR.createFromParcel(parcel);
                String readString5 = parcel.readString();
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = com.appsflyer.internal.k.b(parcel, linkedHashMap3, parcel.readString(), i2, 1);
                }
                com.yandex.passport.internal.entities.v createFromParcel11 = parcel.readInt() == 0 ? null : com.yandex.passport.internal.entities.v.CREATOR.createFromParcel(parcel);
                m0 createFromParcel12 = parcel.readInt() == 0 ? null : m0.CREATOR.createFromParcel(parcel);
                boolean z16 = parcel.readInt() != 0;
                String readString6 = parcel.readString();
                String str2 = readString6 != null ? readString6 : null;
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = com.appsflyer.internal.k.b(parcel, linkedHashMap4, parcel.readString(), i3, 1);
                }
                return new l(readString2, z12, readString3, createFromParcel3, valueOf2, createFromParcel4, createFromParcel5, z13, z14, valueOf3, readString4, z15, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, createFromParcel10, readString5, linkedHashMap3, createFromParcel11, createFromParcel12, z16, str2, linkedHashMap4, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? a0.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, v1.valueOf(parcel.readString()));
            case 5:
                parcel.getClass();
                return new o(y1.valueOf(parcel.readString()), z1.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 6:
                parcel.getClass();
                z1 createFromParcel13 = z1.CREATOR.createFromParcel(parcel);
                v createFromParcel14 = v.CREATOR.createFromParcel(parcel);
                y1 valueOf4 = y1.valueOf(parcel.readString());
                int readInt4 = parcel.readInt();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = com.appsflyer.internal.k.b(parcel, linkedHashMap5, parcel.readString(), i4, 1);
                }
                return new r(createFromParcel13, createFromParcel14, valueOf4, linkedHashMap5);
            case 7:
                parcel.getClass();
                z1 createFromParcel15 = z1.CREATOR.createFromParcel(parcel);
                y1 valueOf5 = y1.valueOf(parcel.readString());
                String readString7 = parcel.readString();
                int i5 = 0;
                boolean z17 = parcel.readInt() != 0;
                v createFromParcel16 = v.CREATOR.createFromParcel(parcel);
                int readInt5 = parcel.readInt();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(readInt5);
                while (i5 != readInt5) {
                    i5 = com.appsflyer.internal.k.b(parcel, linkedHashMap6, parcel.readString(), i5, 1);
                }
                return new u(createFromParcel15, valueOf5, readString7, z17, createFromParcel16, linkedHashMap6);
            case 8:
                parcel.getClass();
                return new v((l2) parcel.readParcelable(v.class.getClassLoader()), (u2) parcel.readParcelable(v.class.getClassLoader()), (o2) parcel.readParcelable(v.class.getClassLoader()), parcel.readInt() != 0);
            case 9:
                parcel.getClass();
                return new z(y1.valueOf(parcel.readString()), z1.CREATOR.createFromParcel(parcel));
            case 10:
                parcel.getClass();
                return new a0(z1.CREATOR.createFromParcel(parcel));
            case 11:
                parcel.getClass();
                return new c0(parcel.readInt() == 0 ? null : z1.CREATOR.createFromParcel(parcel), v.CREATOR.createFromParcel(parcel), y1.valueOf(parcel.readString()));
            case 12:
                parcel.getClass();
                return new d0(com.yandex.passport.internal.entities.k.CREATOR.createFromParcel(parcel), y1.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : z1.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 13:
                parcel.getClass();
                return new e0(com.yandex.passport.internal.entities.k.CREATOR.createFromParcel(parcel), y1.valueOf(parcel.readString()), z1.CREATOR.createFromParcel(parcel), w1.valueOf(parcel.readString()));
            case 14:
                parcel.getClass();
                return new f0(parcel.readInt() == 0 ? null : z1.CREATOR.createFromParcel(parcel), parcel.readString());
            case 15:
                parcel.getClass();
                return new g0(z1.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 16:
                parcel.getClass();
                return new h0(y1.valueOf(parcel.readString()), (com.yandex.passport.api.impl.b) parcel.readParcelable(h0.class.getClassLoader()), z1.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 17:
                parcel.getClass();
                LinkedHashMap linkedHashMap7 = null;
                com.yandex.passport.internal.network.p createFromParcel17 = parcel.readInt() == 0 ? null : com.yandex.passport.internal.network.p.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt6 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt6);
                    for (int i6 = 0; i6 != readInt6; i6++) {
                        linkedHashMap.put(u0.CREATOR.createFromParcel(parcel), com.yandex.passport.internal.network.p.CREATOR.createFromParcel(parcel));
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt7 = parcel.readInt();
                    arrayList = new ArrayList(readInt7);
                    int i7 = 0;
                    while (i7 != readInt7) {
                        i7 = com.appsflyer.internal.k.c(r0.CREATOR, parcel, arrayList, i7, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt8 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt8);
                    int i8 = 0;
                    while (i8 != readInt8) {
                        i8 = com.appsflyer.internal.k.c(r0.CREATOR, parcel, arrayList2, i8, 1);
                    }
                }
                if (parcel.readInt() != 0) {
                    int readInt9 = parcel.readInt();
                    linkedHashMap7 = new LinkedHashMap(readInt9);
                    for (int i9 = 0; i9 != readInt9; i9++) {
                        linkedHashMap7.put(parcel.readString(), parcel.createStringArray());
                    }
                }
                return new i0(createFromParcel17, linkedHashMap, arrayList, arrayList2, linkedHashMap7);
            case 18:
                parcel.getClass();
                y1 valueOf6 = y1.valueOf(parcel.readString());
                com.yandex.passport.api.impl.b bVar = (com.yandex.passport.api.impl.b) parcel.readParcelable(j0.class.getClassLoader());
                v createFromParcel18 = v.CREATOR.createFromParcel(parcel);
                int readInt10 = parcel.readInt();
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(readInt10);
                int i10 = 0;
                while (i10 != readInt10) {
                    i10 = com.appsflyer.internal.k.b(parcel, linkedHashMap8, parcel.readString(), i10, 1);
                }
                return new j0(valueOf6, bVar, createFromParcel18, linkedHashMap8);
            case 19:
                parcel.getClass();
                boolean z18 = false;
                boolean z19 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z18 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z19 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                q0 valueOf7 = q0.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z4 = z3;
                    q0Var = valueOf7;
                    z5 = z4;
                } else {
                    z4 = z3;
                    q0Var = valueOf7;
                    z5 = z;
                }
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                boolean z20 = z4;
                String readString11 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z6 = z20;
                } else {
                    z6 = z20;
                    z20 = z;
                }
                if (parcel.readInt() == 0) {
                    z6 = z;
                }
                return new k0(z18, z19, z2, q0Var, z5, readString8, readString9, readString10, readString11, z20, z6, parcel.readString(), a.CREATOR.createFromParcel(parcel), v.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            case 20:
                parcel.getClass();
                boolean z21 = false;
                boolean z22 = true;
                if (parcel.readInt() != 0) {
                    z7 = false;
                    z21 = true;
                } else {
                    z7 = false;
                }
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = true;
                    z22 = z7;
                }
                if (parcel.readInt() != 0) {
                    z9 = z8;
                } else {
                    z9 = z8;
                    z8 = z7;
                }
                boolean z23 = z7;
                if (parcel.readInt() != 0) {
                    z10 = z9;
                } else {
                    z10 = z9;
                    z9 = z23;
                }
                String readString12 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z10 = z23;
                }
                return new m0(readString12, z21, z22, z8, z9, z10);
            case 21:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.passport.internal.provider.communication.g.a;
            case 22:
                parcel.getClass();
                return new com.yandex.passport.internal.provider.communication.h(parcel.readString());
            case 23:
                parcel.getClass();
                return new com.yandex.passport.internal.provider.communication.k(v2.valueOf(parcel.readString()));
            case 24:
                parcel.getClass();
                return new com.yandex.passport.internal.provider.communication.l((com.yandex.passport.internal.entities.a0) parcel.readParcelable(com.yandex.passport.internal.provider.communication.l.class.getClassLoader()));
            case 25:
                parcel.getClass();
                int readInt11 = parcel.readInt();
                LinkedHashMap linkedHashMap9 = new LinkedHashMap(readInt11);
                int i11 = 0;
                while (i11 != readInt11) {
                    i11 = com.appsflyer.internal.k.b(parcel, linkedHashMap9, parcel.readString(), i11, 1);
                }
                return new com.yandex.passport.internal.stash.a(linkedHashMap9);
            case 26:
                parcel.getClass();
                return new com.yandex.passport.internal.ui.f(parcel.readString(), (Throwable) parcel.readSerializable());
            case 27:
                parcel.getClass();
                return new com.yandex.passport.internal.ui.account_upgrade.l((com.yandex.passport.common.core.f) parcel.readParcelable(com.yandex.passport.internal.ui.account_upgrade.l.class.getClassLoader()), y1.valueOf(parcel.readString()));
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                return new com.yandex.passport.internal.ui.authsdk.l(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), l.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : z1.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            default:
                parcel.getClass();
                return new com.yandex.passport.internal.ui.authsdk.m((com.yandex.passport.internal.network.response.h) parcel.readParcelable(com.yandex.passport.internal.ui.authsdk.m.class.getClassLoader()), (com.yandex.passport.common.core.f) parcel.readParcelable(com.yandex.passport.internal.ui.authsdk.m.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : com.yandex.passport.internal.entities.l.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new g[i];
            case 1:
                return new h[i];
            case 2:
                return new i[i];
            case 3:
                return new j[i];
            case 4:
                return new l[i];
            case 5:
                return new o[i];
            case 6:
                return new r[i];
            case 7:
                return new u[i];
            case 8:
                return new v[i];
            case 9:
                return new z[i];
            case 10:
                return new a0[i];
            case 11:
                return new c0[i];
            case 12:
                return new d0[i];
            case 13:
                return new e0[i];
            case 14:
                return new f0[i];
            case 15:
                return new g0[i];
            case 16:
                return new h0[i];
            case 17:
                return new i0[i];
            case 18:
                return new j0[i];
            case 19:
                return new k0[i];
            case 20:
                return new m0[i];
            case 21:
                return new com.yandex.passport.internal.provider.communication.g[i];
            case 22:
                return new com.yandex.passport.internal.provider.communication.h[i];
            case 23:
                return new com.yandex.passport.internal.provider.communication.k[i];
            case 24:
                return new com.yandex.passport.internal.provider.communication.l[i];
            case 25:
                return new com.yandex.passport.internal.stash.a[i];
            case 26:
                return new com.yandex.passport.internal.ui.f[i];
            case 27:
                return new com.yandex.passport.internal.ui.account_upgrade.l[i];
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.passport.internal.ui.authsdk.l[i];
            default:
                return new com.yandex.passport.internal.ui.authsdk.m[i];
        }
    }
}
