package com.gamericefishpro.space.i8;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AdRevenueScheme;
import com.gamericefishpro.space.b8.k;
import com.gamericefishpro.space.b8.l;
import com.gamericefishpro.space.b8.u;
import com.gamericefishpro.space.b8.v;
import com.gamericefishpro.space.b8.x;
import com.gamericefishpro.space.c8.j;
import com.gamericefishpro.space.c8.m;
import com.gamericefishpro.space.c8.o;
import com.gamericefishpro.space.h0.w0;
import com.gamericefishpro.space.j8.i;
import com.gamericefishpro.space.u6.p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final Context a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object h;
    public Object i;

    public h(Context context, com.gamericefishpro.space.d8.d dVar, com.gamericefishpro.space.j8.d dVar2, com.gamericefishpro.space.a8.c cVar, Executor executor, com.gamericefishpro.space.k8.c cVar2, com.gamericefishpro.space.l8.a aVar, com.gamericefishpro.space.l8.a aVar2, com.gamericefishpro.space.j8.c cVar3) {
        this.a = context;
        this.b = dVar;
        this.c = dVar2;
        this.d = cVar;
        this.e = executor;
        this.f = cVar2;
        this.g = aVar;
        this.h = aVar2;
        this.i = cVar3;
    }

    public void a(j jVar, int i) {
        byte[] bArr;
        long j;
        com.gamericefishpro.space.d8.a aVar;
        String str;
        com.gamericefishpro.space.d8.a aVar2;
        int i2;
        com.gamericefishpro.space.a8.d dVarD;
        String str2;
        Integer numValueOf;
        k kVar;
        final h hVar = this;
        final j jVar2 = jVar;
        byte[] bArr2 = jVar2.b;
        com.gamericefishpro.space.k8.c cVar = (com.gamericefishpro.space.k8.c) hVar.f;
        com.gamericefishpro.space.d8.e eVarA = ((com.gamericefishpro.space.d8.d) hVar.b).a(jVar2.a);
        long jMax = 0;
        while (true) {
            final int i3 = 0;
            i iVar = (i) cVar;
            if (!((Boolean) iVar.o(new com.gamericefishpro.space.k8.b(hVar) { // from class: com.gamericefishpro.space.i8.f
                public final /* synthetic */ h e;

                {
                    this.e = hVar;
                }

                @Override // com.gamericefishpro.space.k8.b
                public final Object b() {
                    Boolean bool;
                    switch (i3) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            j jVar3 = jVar2;
                            i iVar2 = (i) ((com.gamericefishpro.space.j8.d) this.e.c);
                            SQLiteDatabase sQLiteDatabaseB = iVar2.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                Long lC = i.c(sQLiteDatabaseB, jVar3);
                                if (lC == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = iVar2.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lC.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseB.setTransactionSuccessful();
                                sQLiteDatabaseB.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseB.endTransaction();
                                throw th2;
                            }
                        default:
                            i iVar3 = (i) ((com.gamericefishpro.space.j8.d) this.e.c);
                            iVar3.getClass();
                            return (Iterable) iVar3.j(new w0(3, iVar3, jVar2));
                    }
                }
            })).booleanValue()) {
                iVar.o(new g(jMax, hVar, jVar2));
                return;
            }
            final int i4 = 1;
            Iterable iterable = (Iterable) iVar.o(new com.gamericefishpro.space.k8.b(hVar) { // from class: com.gamericefishpro.space.i8.f
                public final /* synthetic */ h e;

                {
                    this.e = hVar;
                }

                @Override // com.gamericefishpro.space.k8.b
                public final Object b() {
                    Boolean bool;
                    switch (i4) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            j jVar3 = jVar2;
                            i iVar2 = (i) ((com.gamericefishpro.space.j8.d) this.e.c);
                            SQLiteDatabase sQLiteDatabaseB = iVar2.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                Long lC = i.c(sQLiteDatabaseB, jVar3);
                                if (lC == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = iVar2.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lC.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseB.setTransactionSuccessful();
                                sQLiteDatabaseB.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseB.endTransaction();
                                throw th2;
                            }
                        default:
                            i iVar3 = (i) ((com.gamericefishpro.space.j8.d) this.e.c);
                            iVar3.getClass();
                            return (Iterable) iVar3.j(new w0(3, iVar3, jVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (eVarA == null) {
                com.gamericefishpro.space.wa.b.r("Uploader", "Unknown backend for %s, deleting event batch for it...", jVar2);
                aVar2 = new com.gamericefishpro.space.d8.a(3, -1L);
                bArr = bArr2;
                j = jMax;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.gamericefishpro.space.j8.b) it.next()).c);
                }
                if (bArr2 != null) {
                    com.gamericefishpro.space.j8.c cVar2 = (com.gamericefishpro.space.j8.c) hVar.i;
                    Objects.requireNonNull(cVar2);
                    com.gamericefishpro.space.f8.a aVar3 = (com.gamericefishpro.space.f8.a) iVar.o(new com.gamericefishpro.space.a8.b(6, cVar2));
                    com.gamericefishpro.space.c8.h hVar2 = new com.gamericefishpro.space.c8.h();
                    hVar2.f = new HashMap();
                    hVar2.d = Long.valueOf(((com.gamericefishpro.space.l8.a) hVar.g).d());
                    hVar2.e = Long.valueOf(((com.gamericefishpro.space.l8.a) hVar.h).d());
                    hVar2.a = "GDT_CLIENT_METRICS";
                    com.gamericefishpro.space.z7.c cVar3 = new com.gamericefishpro.space.z7.c("proto");
                    aVar3.getClass();
                    com.gamericefishpro.space.a8.c cVar4 = o.a;
                    cVar4.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        cVar4.h(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    hVar2.c = new m(cVar3, byteArrayOutputStream.toByteArray());
                    arrayList.add(((com.gamericefishpro.space.a8.e) eVarA).a(hVar2.h()));
                }
                com.gamericefishpro.space.a8.e eVar = (com.gamericefishpro.space.a8.e) eVarA;
                HashMap map = new HashMap();
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    com.gamericefishpro.space.c8.i iVar2 = (com.gamericefishpro.space.c8.i) obj;
                    String str3 = iVar2.a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(iVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(iVar2);
                        map.put(str3, arrayList2);
                    }
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    com.gamericefishpro.space.c8.i iVar3 = (com.gamericefishpro.space.c8.i) ((List) entry.getValue()).get(0);
                    x xVar = x.d;
                    long jD = eVar.f.d();
                    long jD2 = eVar.e.d();
                    com.gamericefishpro.space.b8.j jVar3 = new com.gamericefishpro.space.b8.j(new com.gamericefishpro.space.b8.h(Integer.valueOf(iVar3.b("sdk-version")), iVar3.a("model"), iVar3.a("hardware"), iVar3.a("device"), iVar3.a("product"), iVar3.a("os-uild"), iVar3.a("manufacturer"), iVar3.a("fingerprint"), iVar3.a("locale"), iVar3.a(AdRevenueScheme.COUNTRY), iVar3.a("mcc_mnc"), iVar3.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (com.gamericefishpro.space.c8.i iVar4 : (List) entry.getValue()) {
                        Iterator it3 = it2;
                        m mVar = iVar4.c;
                        com.gamericefishpro.space.z7.c cVar5 = mVar.a;
                        byte[] bArr3 = mVar.b;
                        long j2 = jMax;
                        if (cVar5.equals(new com.gamericefishpro.space.z7.c("proto"))) {
                            kVar = new k();
                            kVar.w = bArr3;
                        } else {
                            if (cVar5.equals(new com.gamericefishpro.space.z7.c("json"))) {
                                String str4 = new String(bArr3, Charset.forName("UTF-8"));
                                k kVar2 = new k();
                                kVar2.y = str4;
                                kVar = kVar2;
                            } else {
                                String strConcat = "TRuntime.".concat("CctTransportBackend");
                                if (Log.isLoggable(strConcat, 5)) {
                                    Log.w(strConcat, "Received event of unsupported encoding " + cVar5 + ". Skipping...");
                                }
                            }
                            it2 = it3;
                            jMax = j2;
                        }
                        kVar.d = Long.valueOf(iVar4.d);
                        kVar.e = Long.valueOf(iVar4.e);
                        String str5 = (String) iVar4.f.get("tz-offset");
                        kVar.i = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        kVar.z = new com.gamericefishpro.space.b8.o((v) v.d.get(iVar4.b("net-type")), (u) u.d.get(iVar4.b("mobile-subtype")));
                        Integer num = iVar4.b;
                        if (num != null) {
                            kVar.v = num;
                        }
                        String strH = ((Long) kVar.d) == null ? " eventTimeMs" : "";
                        if (((Long) kVar.e) == null) {
                            strH = strH.concat(" eventUptimeMs");
                        }
                        if (((Long) kVar.i) == null) {
                            strH = com.gamericefishpro.space.m5.a.h(strH, " timezoneOffsetSeconds");
                        }
                        if (!strH.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strH));
                        }
                        arrayList4.add(new l(((Long) kVar.d).longValue(), (Integer) kVar.v, ((Long) kVar.e).longValue(), (byte[]) kVar.w, (String) kVar.y, ((Long) kVar.i).longValue(), (com.gamericefishpro.space.b8.o) kVar.z));
                        it2 = it3;
                        jMax = j2;
                    }
                    arrayList3.add(new com.gamericefishpro.space.b8.m(jD, jD2, jVar3, numValueOf, str2, arrayList4));
                    it2 = it2;
                }
                j = jMax;
                com.gamericefishpro.space.b8.i iVar5 = new com.gamericefishpro.space.b8.i(arrayList3);
                URL urlB = eVar.d;
                if (bArr != null) {
                    try {
                        com.gamericefishpro.space.a8.a aVarA = com.gamericefishpro.space.a8.a.a(bArr);
                        str = aVarA.b;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = aVarA.a;
                        if (str6 != null) {
                            urlB = com.gamericefishpro.space.a8.e.b(str6);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new com.gamericefishpro.space.d8.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    int i6 = 0;
                    com.gamericefishpro.space.a8.c cVar6 = new com.gamericefishpro.space.a8.c(urlB, iVar5, str, i6);
                    com.gamericefishpro.space.a8.b bVar = new com.gamericefishpro.space.a8.b(i6, eVar);
                    int i7 = 5;
                    do {
                        dVarD = bVar.d(cVar6);
                        URL url = dVarD.b;
                        if (url != null) {
                            com.gamericefishpro.space.wa.b.r("CctTransportBackend", "Following redirect to: %s", url);
                            cVar6 = new com.gamericefishpro.space.a8.c(url, (com.gamericefishpro.space.b8.i) cVar6.i, (String) cVar6.v, 0);
                        } else {
                            cVar6 = null;
                        }
                        if (cVar6 == null) {
                            break;
                        } else {
                            i7--;
                        }
                    } while (i7 >= 1);
                    int i8 = dVarD.a;
                    if (i8 == 200) {
                        aVar2 = new com.gamericefishpro.space.d8.a(1, dVarD.c);
                    } else {
                        if (i8 >= 500 || i8 == 404) {
                            aVar = new com.gamericefishpro.space.d8.a(2, -1L);
                        } else if (i8 == 400) {
                            try {
                                aVar = new com.gamericefishpro.space.d8.a(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                com.gamericefishpro.space.wa.b.s("CctTransportBackend", "Could not make request to the backend", e);
                                i2 = 2;
                                aVar2 = new com.gamericefishpro.space.d8.a(2, -1L);
                            }
                        } else {
                            aVar = new com.gamericefishpro.space.d8.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            int i9 = aVar2.a;
            if (i9 == i2) {
                iVar.o(new com.gamericefishpro.space.cb.b(this, iterable, jVar, j));
                ((com.gamericefishpro.space.a8.c) this.d).z(jVar, i + 1, true);
                return;
            }
            hVar = this;
            jVar2 = jVar;
            jMax = j;
            iVar.o(new w0(1, hVar, iterable));
            if (i9 == 1) {
                jMax = Math.max(jMax, aVar2.b);
                if (bArr != null) {
                    iVar.o(new com.gamericefishpro.space.a8.b(8, hVar));
                }
            } else if (i9 == 4) {
                HashMap map2 = new HashMap();
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    String str7 = ((com.gamericefishpro.space.j8.b) it4.next()).c.a;
                    if (map2.containsKey(str7)) {
                        map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                    } else {
                        map2.put(str7, 1);
                    }
                }
                iVar.o(new w0(2, hVar, map2));
            }
            bArr2 = bArr;
        }
    }

    public h(Context context, com.gamericefishpro.space.l6.c cVar, com.gamericefishpro.space.r5.b bVar, com.gamericefishpro.space.m6.f fVar, WorkDatabase workDatabase, p pVar, ArrayList arrayList) {
        this.i = new com.gamericefishpro.space.a8.c(17);
        this.a = context.getApplicationContext();
        this.c = bVar;
        this.b = fVar;
        this.d = cVar;
        this.e = workDatabase;
        this.f = pVar;
        this.h = arrayList;
    }
}
