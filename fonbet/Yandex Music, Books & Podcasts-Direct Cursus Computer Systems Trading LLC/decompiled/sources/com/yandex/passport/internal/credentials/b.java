package com.yandex.passport.internal.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.b2;
import com.yandex.passport.api.m1;
import com.yandex.passport.api.p1;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.entities.h;
import com.yandex.passport.internal.entities.i;
import com.yandex.passport.internal.entities.k;
import com.yandex.passport.internal.entities.l;
import com.yandex.passport.internal.entities.p;
import com.yandex.passport.internal.entities.r;
import com.yandex.passport.internal.entities.t;
import com.yandex.passport.internal.entities.u;
import com.yandex.passport.internal.entities.v;
import com.yandex.passport.internal.entities.w;
import com.yandex.passport.internal.entities.x;
import com.yandex.passport.internal.entities.y;
import com.yandex.passport.internal.entities.z;
import com.yandex.pulse.metrics.o;
import defpackage.uah;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class b implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                parcel.readInt();
                return c.a;
            case 1:
                parcel.getClass();
                return new d((f) parcel.readParcelable(d.class.getClassLoader()));
            case 2:
                parcel.getClass();
                return new f(parcel.readString(), parcel.readString());
            case 3:
                parcel.getClass();
                return new com.yandex.passport.internal.entities.b(parcel.readInt());
            case 4:
                parcel.getClass();
                return new com.yandex.passport.internal.entities.c((com.yandex.passport.common.core.f) parcel.readParcelable(com.yandex.passport.internal.entities.c.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString());
            case 5:
                parcel.getClass();
                return new com.yandex.passport.internal.entities.e(parcel.readString(), parcel.readString());
            case 6:
                parcel.getClass();
                return new com.yandex.passport.internal.entities.f(parcel.readInt(), (com.yandex.passport.api.impl.b) parcel.readParcelable(com.yandex.passport.internal.entities.f.class.getClassLoader()), parcel.readString());
            case 7:
                parcel.getClass();
                return new h((com.yandex.passport.api.impl.b) parcel.readParcelable(h.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                parcel.getClass();
                return new i(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            case 9:
                parcel.getClass();
                com.yandex.passport.api.impl.b bVar = (com.yandex.passport.api.impl.b) parcel.readParcelable(k.class.getClassLoader());
                com.yandex.passport.api.impl.b bVar2 = (com.yandex.passport.api.impl.b) parcel.readParcelable(k.class.getClassLoader());
                com.yandex.passport.common.bitflag.b createFromParcel = com.yandex.passport.common.bitflag.b.CREATOR.createFromParcel(parcel);
                ArrayList arrayList = new ArrayList();
                parcel.readStringList(arrayList);
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    m1.a(str);
                    arrayList2.add(new m1(str));
                }
                p pVar = new p(arrayList2);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(k.class.getClassLoader()));
                }
                return new k(bVar, bVar2, createFromParcel, pVar, linkedHashMap);
            case 10:
                parcel.getClass();
                return new l(parcel.readString(), parcel.readLong());
            case 11:
                parcel.getClass();
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = com.appsflyer.internal.k.c(m1.CREATOR, parcel, arrayList3, i2, 1);
                }
                return new p(arrayList3);
            case 12:
                parcel.getClass();
                return new r(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : p1.valueOf(parcel.readString()), parcel.createStringArrayList());
            case 13:
                parcel.getClass();
                return new t((com.yandex.passport.api.impl.b) parcel.readParcelable(t.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 14:
                parcel.getClass();
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = com.appsflyer.internal.k.b(parcel, linkedHashMap2, parcel.readString(), i3, 1);
                }
                return new u(linkedHashMap2);
            case 15:
                parcel.getClass();
                return new v(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                parcel.getClass();
                return new w((com.yandex.passport.api.impl.b) parcel.readParcelable(w.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            case 17:
                parcel.getClass();
                parcel.readInt();
                return x.a;
            case 18:
                parcel.getClass();
                return new y(parcel.readString());
            case 19:
                parcel.getClass();
                parcel.readInt();
                return z.a;
            case 20:
                parcel.getClass();
                return new com.yandex.passport.internal.link_auth.e((com.yandex.passport.api.impl.b) parcel.readParcelable(com.yandex.passport.internal.link_auth.e.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
            case 21:
                parcel.getClass();
                int readInt4 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (int i4 = 0; i4 < readInt4; i4++) {
                    String readString = parcel.readString();
                    readString.getClass();
                    b2 valueOf = b2.valueOf(readString);
                    com.yandex.passport.api.impl.b a = com.yandex.passport.api.impl.b.a(parcel.readInt());
                    a.getClass();
                    String readString2 = parcel.readString();
                    readString2.getClass();
                    linkedHashMap3.put(new Pair(valueOf, a), readString2);
                }
                return new com.yandex.passport.internal.network.p(uah.o(linkedHashMap3));
            case 22:
                parcel.getClass();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                int readInt5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt5);
                int i5 = 0;
                int i6 = 0;
                while (i6 != readInt5) {
                    i6 = com.appsflyer.internal.k.c(com.yandex.passport.internal.network.response.f.CREATOR, parcel, arrayList4, i6, 1);
                }
                boolean z = parcel.readInt() != 0;
                int readInt6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt6);
                int i7 = 0;
                while (i7 != readInt6) {
                    i7 = com.appsflyer.internal.k.c(com.yandex.passport.internal.network.response.f.CREATOR, parcel, arrayList5, i7, 1);
                }
                int readInt7 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt7);
                while (i5 != readInt7) {
                    i5 = com.appsflyer.internal.k.c(com.yandex.passport.internal.network.response.f.CREATOR, parcel, arrayList6, i5, 1);
                }
                return new com.yandex.passport.internal.network.response.g(readString3, readString4, readString5, arrayList4, z, arrayList5, arrayList6);
            case 23:
                parcel.getClass();
                return new com.yandex.passport.internal.network.response.e(parcel.readString(), parcel.readString());
            case 24:
                parcel.getClass();
                String readString6 = parcel.readString();
                int readInt8 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt8);
                int i8 = 0;
                while (i8 != readInt8) {
                    i8 = com.appsflyer.internal.k.c(com.yandex.passport.internal.network.response.e.CREATOR, parcel, arrayList7, i8, 1);
                }
                return new com.yandex.passport.internal.network.response.f(readString6, arrayList7);
            case 25:
                return new com.yandex.passport.internal.network.response.h(parcel);
            case 26:
                parcel.getClass();
                return new com.yandex.passport.internal.properties.a(com.yandex.passport.api.e.valueOf(parcel.readString()), (com.yandex.passport.api.d) parcel.readParcelable(com.yandex.passport.internal.properties.a.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 27:
                parcel.getClass();
                return new com.yandex.passport.internal.properties.b(z1.CREATOR.createFromParcel(parcel), y1.valueOf(parcel.readString()), parcel.readString(), com.yandex.passport.internal.properties.l.CREATOR.createFromParcel(parcel));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                return new com.yandex.passport.internal.properties.c(y1.valueOf(parcel.readString()), (com.yandex.passport.api.impl.b) parcel.readParcelable(com.yandex.passport.internal.properties.c.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, parcel.readString());
            default:
                parcel.getClass();
                z1 createFromParcel2 = z1.CREATOR.createFromParcel(parcel);
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                int readInt9 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt9);
                int i9 = 0;
                while (i9 != readInt9) {
                    i9 = com.appsflyer.internal.k.b(parcel, linkedHashMap4, parcel.readString(), i9, 1);
                }
                return new com.yandex.passport.internal.properties.e(createFromParcel2, readString7, readString8, linkedHashMap4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new c[i];
            case 1:
                return new d[i];
            case 2:
                return new f[i];
            case 3:
                return new com.yandex.passport.internal.entities.b[i];
            case 4:
                return new com.yandex.passport.internal.entities.c[i];
            case 5:
                return new com.yandex.passport.internal.entities.e[i];
            case 6:
                return new com.yandex.passport.internal.entities.f[i];
            case 7:
                return new h[i];
            case 8:
                return new i[i];
            case 9:
                return new k[i];
            case 10:
                return new l[i];
            case 11:
                return new p[i];
            case 12:
                return new r[i];
            case 13:
                return new t[i];
            case 14:
                return new u[i];
            case 15:
                return new v[i];
            case 16:
                return new w[i];
            case 17:
                return new x[i];
            case 18:
                return new y[i];
            case 19:
                return new z[i];
            case 20:
                return new com.yandex.passport.internal.link_auth.e[i];
            case 21:
                return new com.yandex.passport.internal.network.p[i];
            case 22:
                return new com.yandex.passport.internal.network.response.g[i];
            case 23:
                return new com.yandex.passport.internal.network.response.e[i];
            case 24:
                return new com.yandex.passport.internal.network.response.f[i];
            case 25:
                return new com.yandex.passport.internal.network.response.h[i];
            case 26:
                return new com.yandex.passport.internal.properties.a[i];
            case 27:
                return new com.yandex.passport.internal.properties.b[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.passport.internal.properties.c[i];
            default:
                return new com.yandex.passport.internal.properties.e[i];
        }
    }
}
