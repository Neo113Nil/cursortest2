package c6;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
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
import v5.t;
import v5.u;
import v5.w;
import x4.p;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1268a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1269b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1270c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1271d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1272e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1273f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1274g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1275h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1276i;

    public l(Context context, x5.e eVar, d6.d dVar, a5.c cVar, Executor executor, e6.c cVar2, f6.a aVar, f6.a aVar2, d6.c cVar3) {
        this.f1268a = context;
        this.f1269b = eVar;
        this.f1270c = dVar;
        this.f1271d = cVar;
        this.f1272e = executor;
        this.f1273f = cVar2;
        this.f1274g = aVar;
        this.f1275h = aVar2;
        this.f1276i = cVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03e0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(w5.i iVar, int i10) {
        byte[] bArr;
        long j3;
        x5.a aVar;
        String str;
        x5.a aVar2;
        int i11;
        u5.b c3;
        String str2;
        Integer num;
        p6.d dVar;
        byte[] bArr2;
        int i12;
        final l lVar = this;
        final w5.i iVar2 = iVar;
        byte[] bArr3 = iVar2.f7688b;
        e6.c cVar = (e6.c) lVar.f1273f;
        x5.f a6 = ((x5.e) lVar.f1269b).a(iVar2.f7687a);
        long j6 = 0;
        while (true) {
            final int i13 = 0;
            d6.j jVar = (d6.j) cVar;
            if (!((Boolean) jVar.i(new e6.b(lVar) { // from class: c6.h

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ l f1255h;

                {
                    this.f1255h = lVar;
                }

                @Override // e6.b
                public final Object a() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            w5.i iVar3 = iVar2;
                            d6.j jVar2 = (d6.j) ((d6.d) this.f1255h.f1270c);
                            SQLiteDatabase a8 = jVar2.a();
                            a8.beginTransaction();
                            try {
                                Long b2 = d6.j.b(a8, iVar3);
                                if (b2 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = jVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b2.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a8.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a8.endTransaction();
                            }
                        default:
                            d6.j jVar3 = (d6.j) ((d6.d) this.f1255h.f1270c);
                            jVar3.getClass();
                            return (Iterable) jVar3.d(new j(2, jVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                jVar.i(new k(lVar, iVar2, j6));
                return;
            }
            final int i14 = 1;
            Iterable iterable = (Iterable) jVar.i(new e6.b(lVar) { // from class: c6.h

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ l f1255h;

                {
                    this.f1255h = lVar;
                }

                @Override // e6.b
                public final Object a() {
                    Boolean bool;
                    switch (i14) {
                        case 0:
                            w5.i iVar3 = iVar2;
                            d6.j jVar2 = (d6.j) ((d6.d) this.f1255h.f1270c);
                            SQLiteDatabase a8 = jVar2.a();
                            a8.beginTransaction();
                            try {
                                Long b2 = d6.j.b(a8, iVar3);
                                if (b2 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = jVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b2.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a8.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a8.endTransaction();
                            }
                        default:
                            d6.j jVar3 = (d6.j) ((d6.d) this.f1255h.f1270c);
                            jVar3.getClass();
                            return (Iterable) jVar3.d(new j(2, jVar3, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a6 == null) {
                a.a.r("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar2);
                aVar2 = new x5.a(3, -1L);
                bArr = bArr3;
                j3 = j6;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((d6.b) it.next()).f1693c);
                }
                if (bArr3 != null) {
                    d6.c cVar2 = (d6.c) lVar.f1276i;
                    Objects.requireNonNull(cVar2);
                    z5.a aVar3 = (z5.a) jVar.i(new f(i13, cVar2));
                    d8.m mVar = new d8.m();
                    mVar.f1802f = new HashMap();
                    mVar.f1800d = Long.valueOf(((f6.a) lVar.f1274g).a());
                    mVar.f1801e = Long.valueOf(((f6.a) lVar.f1275h).a());
                    mVar.f1797a = "GDT_CLIENT_METRICS";
                    t5.c cVar3 = new t5.c("proto");
                    aVar3.getClass();
                    a5.c cVar4 = w5.m.f7699a;
                    cVar4.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        cVar4.r(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    mVar.f1799c = new w5.k(cVar3, byteArrayOutputStream.toByteArray());
                    arrayList.add(((u5.c) a6).a(mVar.h()));
                }
                u5.c cVar5 = (u5.c) a6;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    w5.h hVar = (w5.h) obj;
                    String str3 = hVar.f7681a;
                    if (hashMap.containsKey(str3)) {
                        bArr2 = bArr3;
                        ((List) hashMap.get(str3)).add(hVar);
                    } else {
                        bArr2 = bArr3;
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar);
                        hashMap.put(str3, arrayList2);
                    }
                    bArr3 = bArr2;
                }
                bArr = bArr3;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = hashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    w5.h hVar2 = (w5.h) ((List) entry.getValue()).get(0);
                    w wVar = w.f7298g;
                    long a8 = cVar5.f6707f.a();
                    long a10 = cVar5.f6706e.a();
                    v5.j jVar2 = new v5.j(new v5.h(Integer.valueOf(hVar2.b("sdk-version")), hVar2.a("model"), hVar2.a("hardware"), hVar2.a("device"), hVar2.a("product"), hVar2.a("os-uild"), hVar2.a("manufacturer"), hVar2.a("fingerprint"), hVar2.a("locale"), hVar2.a("country"), hVar2.a("mcc_mnc"), hVar2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (w5.h hVar3 : (List) entry.getValue()) {
                        Iterator it3 = it2;
                        w5.k kVar = hVar3.f7683c;
                        t5.c cVar6 = kVar.f7696a;
                        byte[] bArr4 = kVar.f7697b;
                        long j10 = j6;
                        if (cVar6.equals(new t5.c("proto"))) {
                            dVar = new p6.d();
                            dVar.f5559e = bArr4;
                        } else if (cVar6.equals(new t5.c("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            p6.d dVar2 = new p6.d();
                            dVar2.f5556b = str4;
                            dVar = dVar2;
                        } else {
                            String concat = "TRuntime.".concat("CctTransportBackend");
                            if (Log.isLoggable(concat, 5)) {
                                Log.w(concat, "Received event of unsupported encoding " + cVar6 + ". Skipping...");
                            }
                            it2 = it3;
                            j6 = j10;
                        }
                        dVar.f5557c = Long.valueOf(hVar3.f7684d);
                        dVar.f5558d = Long.valueOf(hVar3.f7685e);
                        String str5 = (String) hVar3.f7686f.get("tz-offset");
                        dVar.f5560f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        dVar.f5561g = new v5.n((u) u.f7296g.get(hVar3.b("net-type")), (t) t.f7294g.get(hVar3.b("mobile-subtype")));
                        Integer num2 = hVar3.f7682b;
                        if (num2 != null) {
                            dVar.f5555a = num2;
                        }
                        String str6 = ((Long) dVar.f5557c) == null ? " eventTimeMs" : "";
                        if (((Long) dVar.f5558d) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) dVar.f5560f) == null) {
                            str6 = a4.d.i(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new v5.k(((Long) dVar.f5557c).longValue(), dVar.f5555a, ((Long) dVar.f5558d).longValue(), (byte[]) dVar.f5559e, dVar.f5556b, ((Long) dVar.f5560f).longValue(), (v5.n) dVar.f5561g));
                        it2 = it3;
                        j6 = j10;
                    }
                    arrayList3.add(new v5.l(a8, a10, jVar2, num, str2, arrayList4));
                    it2 = it2;
                }
                j3 = j6;
                v5.i iVar3 = new v5.i(arrayList3);
                URL url = cVar5.f6705d;
                if (bArr != null) {
                    try {
                        u5.a a11 = u5.a.a(bArr);
                        str = a11.f6698b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a11.f6697a;
                        if (str7 != null) {
                            url = u5.c.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new x5.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    a5.c cVar7 = new a5.c(url, iVar3, str);
                    f fVar = new f(11, cVar5);
                    int i16 = 5;
                    do {
                        c3 = fVar.c(cVar7);
                        URL url2 = c3.f6700b;
                        if (url2 != null) {
                            a.a.r("CctTransportBackend", "Following redirect to: %s", url2);
                            cVar7 = new a5.c(url2, (v5.i) cVar7.f261g, (String) cVar7.f263i);
                        } else {
                            cVar7 = null;
                        }
                        if (cVar7 == null) {
                            break;
                        } else {
                            i16--;
                        }
                    } while (i16 >= 1);
                    int i17 = c3.f6699a;
                    if (i17 == 200) {
                        aVar2 = new x5.a(1, c3.f6701c);
                    } else {
                        if (i17 >= 500 || i17 == 404) {
                            aVar = new x5.a(2, -1L);
                        } else if (i17 == 400) {
                            try {
                                aVar = new x5.a(4, -1L);
                            } catch (IOException e10) {
                                e = e10;
                                a.a.u("CctTransportBackend", "Could not make request to the backend", e);
                                i11 = 2;
                                aVar2 = new x5.a(2, -1L);
                                i12 = aVar2.f8358a;
                                if (i12 != i11) {
                                }
                            }
                        } else {
                            aVar = new x5.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e11) {
                    e = e11;
                }
            }
            i11 = 2;
            i12 = aVar2.f8358a;
            if (i12 != i11) {
                jVar.i(new i(this, iterable, iVar, j3));
                ((a5.c) this.f1271d).I(iVar, i10 + 1, true);
                return;
            }
            lVar = this;
            iVar2 = iVar;
            j6 = j3;
            jVar.i(new j(0, lVar, iterable));
            if (i12 == 1) {
                j6 = Math.max(j6, aVar2.f8359b);
                if (bArr != null) {
                    jVar.i(new f(2, lVar));
                }
            } else if (i12 == 4) {
                HashMap hashMap2 = new HashMap();
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    String str8 = ((d6.b) it4.next()).f1693c.f7681a;
                    if (hashMap2.containsKey(str8)) {
                        hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                    } else {
                        hashMap2.put(str8, 1);
                    }
                }
                jVar.i(new j(1, lVar, hashMap2));
            }
            bArr3 = bArr;
        }
    }

    public l(Context context, o4.b bVar, a5.c cVar, p4.e eVar, WorkDatabase workDatabase, p pVar, ArrayList arrayList) {
        this.f1276i = new a5.c(13);
        this.f1268a = context.getApplicationContext();
        this.f1270c = cVar;
        this.f1269b = eVar;
        this.f1271d = bVar;
        this.f1272e = workDatabase;
        this.f1273f = pVar;
        this.f1275h = arrayList;
    }
}
