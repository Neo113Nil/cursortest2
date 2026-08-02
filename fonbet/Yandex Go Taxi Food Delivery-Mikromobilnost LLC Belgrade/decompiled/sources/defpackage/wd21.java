package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.cct.internal.d;
import com.google.android.datatransport.cct.internal.e;
import com.google.android.datatransport.cct.internal.f;
import com.google.android.datatransport.cct.internal.h;
import com.google.android.datatransport.cct.internal.i;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.a;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.datatransport.runtime.scheduling.persistence.b;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
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

/* loaded from: classes.dex */
public final class wd21 {
    public final Context a;
    public final x820 b;
    public final ugo c;
    public final am2 d;
    public final Executor e;
    public final w0x0 f;
    public final s3c g;
    public final s3c h;
    public final v2c i;

    public wd21(Context context, x820 x820Var, ugo ugoVar, am2 am2Var, Executor executor, w0x0 w0x0Var, s3c s3cVar, s3c s3cVar2, v2c v2cVar) {
        this.a = context;
        this.b = x820Var;
        this.c = ugoVar;
        this.d = am2Var;
        this.e = executor;
        this.f = w0x0Var;
        this.g = s3cVar;
        this.h = s3cVar2;
        this.i = v2cVar;
    }

    public final void a(final v111 v111Var, int i) {
        d011 d011Var;
        long j;
        a aVar;
        String str;
        t59 j2;
        String str2;
        f74 f74Var;
        rfo rfoVar;
        final wd21 wd21Var = this;
        final v111 v111Var2 = v111Var;
        d011 a = wd21Var.b.a(v111Var2.b());
        new a(BackendResponse.Status.OK, 0L);
        long j3 = 0;
        while (true) {
            final int i2 = 0;
            v0x0 v0x0Var = new v0x0(wd21Var) { // from class: ud21
                public final /* synthetic */ wd21 b;

                {
                    this.b = wd21Var;
                }

                @Override // defpackage.v0x0
                public final Object execute() {
                    Boolean bool;
                    int i3 = i2;
                    v111 v111Var3 = v111Var2;
                    wd21 wd21Var2 = this.b;
                    switch (i3) {
                        case 0:
                            b bVar = (b) wd21Var2.c;
                            SQLiteDatabase a2 = bVar.a();
                            a2.beginTransaction();
                            try {
                                Long c = b.c(a2, v111Var3);
                                if (c == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = bVar.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{c.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a2.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a2.endTransaction();
                            }
                        default:
                            b bVar2 = (b) wd21Var2.c;
                            bVar2.getClass();
                            return (Iterable) bVar2.d(new e89(9, bVar2, v111Var3));
                    }
                }
            };
            b bVar = (b) wd21Var.f;
            if (!((Boolean) bVar.n(v0x0Var)).booleanValue()) {
                bVar.n(new z2f(wd21Var, v111Var2, j3));
                return;
            }
            final int i3 = 1;
            final Iterable iterable = (Iterable) bVar.n(new v0x0(wd21Var) { // from class: ud21
                public final /* synthetic */ wd21 b;

                {
                    this.b = wd21Var;
                }

                @Override // defpackage.v0x0
                public final Object execute() {
                    Boolean bool;
                    int i32 = i3;
                    v111 v111Var3 = v111Var2;
                    wd21 wd21Var2 = this.b;
                    switch (i32) {
                        case 0:
                            b bVar2 = (b) wd21Var2.c;
                            SQLiteDatabase a2 = bVar2.a();
                            a2.beginTransaction();
                            try {
                                Long c = b.c(a2, v111Var3);
                                if (c == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = bVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{c.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a2.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a2.endTransaction();
                            }
                        default:
                            b bVar22 = (b) wd21Var2.c;
                            bVar22.getClass();
                            return (Iterable) bVar22.d(new e89(9, bVar22, v111Var3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a == null) {
                rzo.o("Uploader", "Unknown backend for %s, deleting event batch for it...", v111Var2);
                aVar = new a(BackendResponse.Status.FATAL_ERROR, -1L);
                d011Var = a;
                j = j3;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((u0b0) it.next()).a());
                }
                if (v111Var2.c() != null) {
                    v2c v2cVar = wd21Var.i;
                    Objects.requireNonNull(v2cVar);
                    w2c w2cVar = (w2c) bVar.n(new t6f0(8, v2cVar));
                    h64 h64Var = new h64();
                    h64Var.f = new HashMap();
                    h64Var.d = Long.valueOf(wd21Var.g.getTime());
                    h64Var.e = Long.valueOf(wd21Var.h.getTime());
                    h64Var.a = "GDT_CLIENT_METRICS";
                    pzn pznVar = new pzn("proto");
                    w2cVar.getClass();
                    am2 am2Var = vuf0.a;
                    am2Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        am2Var.g(w2cVar, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    h64Var.c = new qyn(pznVar, byteArrayOutputStream.toByteArray());
                    arrayList.add(((u59) a).a(h64Var.c()));
                }
                q34 q34Var = new q34();
                q34Var.a = arrayList;
                q34Var.b = v111Var2.c();
                String str3 = "";
                String str4 = q34Var.a == null ? " events" : "";
                if (!str4.isEmpty()) {
                    ny61.r("Missing required properties:".concat(str4));
                    return;
                }
                r34 r34Var = new r34(q34Var.b, q34Var.a);
                u59 u59Var = (u59) a;
                HashMap hashMap = new HashMap();
                for (rfo rfoVar2 : r34Var.a) {
                    String k = rfoVar2.k();
                    if (hashMap.containsKey(k)) {
                        ((List) hashMap.get(k)).add(rfoVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(rfoVar2);
                        hashMap.put(k, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    d011 d011Var2 = a;
                    rfo rfoVar3 = (rfo) ((List) entry.getValue()).get(0);
                    h74 h74Var = new h74();
                    h74Var.g = QosTier.DEFAULT;
                    h74Var.a = Long.valueOf(u59Var.f.getTime());
                    h74Var.b = Long.valueOf(u59Var.e.getTime());
                    d dVar = new d();
                    long j4 = j3;
                    dVar.a = ClientInfo.ClientType.ANDROID_FIREBASE;
                    g34 g34Var = new g34();
                    g34Var.a = Integer.valueOf(rfoVar3.h("sdk-version"));
                    g34Var.b = rfoVar3.a("model");
                    g34Var.c = rfoVar3.a("hardware");
                    g34Var.d = rfoVar3.a("device");
                    g34Var.e = rfoVar3.a(CreateApplicationWithProductJsonAdapter.productKey);
                    g34Var.f = rfoVar3.a("os-uild");
                    g34Var.g = rfoVar3.a("manufacturer");
                    g34Var.h = rfoVar3.a("fingerprint");
                    g34Var.j = rfoVar3.a("country");
                    g34Var.i = rfoVar3.a("locale");
                    g34Var.k = rfoVar3.a("mcc_mnc");
                    h74Var.c = new e(dVar.a, new h34(g34Var.a, g34Var.b, g34Var.c, g34Var.d, g34Var.e, g34Var.f, g34Var.g, g34Var.h, g34Var.i, g34Var.j, g34Var.k, rfoVar3.a("application_build")));
                    try {
                        h74Var.d = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                    } catch (NumberFormatException unused2) {
                        h74Var.e = (String) entry.getKey();
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = ((List) entry.getValue()).iterator();
                    while (it2.hasNext()) {
                        rfo rfoVar4 = (rfo) it2.next();
                        qyn d = rfoVar4.d();
                        pzn pznVar2 = d.a;
                        byte[] bArr = d.b;
                        Iterator it3 = it2;
                        if (pznVar2.equals(new pzn("proto"))) {
                            f74Var = new f74();
                            f74Var.e = bArr;
                            str2 = str3;
                        } else {
                            str2 = str3;
                            if (pznVar2.equals(new pzn("json"))) {
                                String str5 = new String(bArr, Charset.forName("UTF-8"));
                                f74 f74Var2 = new f74();
                                f74Var2.f = str5;
                                f74Var = f74Var2;
                            } else {
                                if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 5)) {
                                    new StringBuilder("Received event of unsupported encoding ").append(pznVar2);
                                }
                                it2 = it3;
                                str3 = str2;
                            }
                        }
                        f74Var.a = Long.valueOf(rfoVar4.e());
                        f74Var.d = Long.valueOf(rfoVar4.l());
                        String str6 = (String) rfoVar4.b().get("tz-offset");
                        f74Var.g = Long.valueOf(str6 == null ? 0L : Long.valueOf(str6).longValue());
                        h hVar = new h();
                        hVar.a = NetworkConnectionInfo.NetworkType.a(rfoVar4.h("net-type"));
                        f74Var.h = new i(hVar.a, NetworkConnectionInfo.MobileSubtype.a(rfoVar4.h("mobile-subtype")));
                        if (rfoVar4.c() != null) {
                            f74Var.b = rfoVar4.c();
                        }
                        if (rfoVar4.i() != null) {
                            f fVar = new f();
                            o64 o64Var = new o64();
                            m64 m64Var = new m64();
                            rfoVar = rfoVar4;
                            m64Var.b(rfoVar.i());
                            o64Var.b(m64Var.a());
                            fVar.b(o64Var.a());
                            fVar.c(ComplianceData.ProductIdOrigin.EVENT_OVERRIDE);
                            f74Var.c = fVar.a();
                        } else {
                            rfoVar = rfoVar4;
                        }
                        if (rfoVar.f() != null || rfoVar.g() != null) {
                            k64 k64Var = new k64();
                            if (rfoVar.f() != null) {
                                k64Var.b(rfoVar.f());
                            }
                            if (rfoVar.g() != null) {
                                k64Var.c(rfoVar.g());
                            }
                            f74Var.i = k64Var.a();
                        }
                        String str7 = f74Var.a == null ? " eventTimeMs" : str2;
                        if (f74Var.d == null) {
                            str7 = str7.concat(" eventUptimeMs");
                        }
                        if (f74Var.g == null) {
                            str7 = str7.concat(" timezoneOffsetSeconds");
                        }
                        if (!str7.isEmpty()) {
                            ny61.r("Missing required properties:".concat(str7));
                            return;
                        } else {
                            arrayList4.add(new g74(f74Var.a.longValue(), f74Var.b, f74Var.c, f74Var.d.longValue(), f74Var.e, f74Var.f, f74Var.g.longValue(), f74Var.h, f74Var.i));
                            it2 = it3;
                            str3 = str2;
                        }
                    }
                    String str8 = str3;
                    h74Var.f = arrayList4;
                    String str9 = h74Var.a == null ? " requestTimeMs" : str8;
                    if (h74Var.b == null) {
                        str9 = str9.concat(" requestUptimeMs");
                    }
                    if (!str9.isEmpty()) {
                        ny61.r("Missing required properties:".concat(str9));
                        return;
                    }
                    arrayList3.add(new i74(h74Var.a.longValue(), h74Var.b.longValue(), h74Var.c, h74Var.d, h74Var.e, h74Var.f, h74Var.g));
                    a = d011Var2;
                    j3 = j4;
                    str3 = str8;
                }
                d011Var = a;
                j = j3;
                s34 s34Var = new s34(arrayList3);
                URL url = u59Var.d;
                byte[] bArr2 = r34Var.b;
                if (bArr2 != null) {
                    try {
                        d87 a2 = d87.a(bArr2);
                        str = a2.b;
                        if (str == null) {
                            str = null;
                        }
                        String str10 = a2.a;
                        if (str10 != null) {
                            url = u59.b(str10);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new a(BackendResponse.Status.FATAL_ERROR, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    am2 am2Var2 = new am2(url, s34Var, str);
                    s59 s59Var = new s59(u59Var);
                    int i4 = 5;
                    do {
                        j2 = s59Var.j(am2Var2);
                        URL url2 = (URL) j2.c;
                        if (url2 != null) {
                            rzo.o("CctTransportBackend", "Following redirect to: %s", url2);
                            am2Var2 = new am2(url2, (s34) am2Var2.b, (String) am2Var2.c);
                        } else {
                            am2Var2 = null;
                        }
                        if (am2Var2 == null) {
                            break;
                        } else {
                            i4--;
                        }
                    } while (i4 >= 1);
                    int i5 = j2.b;
                    if (i5 == 200) {
                        aVar = new a(BackendResponse.Status.OK, j2.a);
                    } else {
                        if (i5 < 500 && i5 != 404) {
                            aVar = i5 == 400 ? new a(BackendResponse.Status.INVALID_PAYLOAD, -1L) : new a(BackendResponse.Status.FATAL_ERROR, -1L);
                        }
                        aVar = new a(BackendResponse.Status.TRANSIENT_ERROR, -1L);
                    }
                } catch (IOException e) {
                    rzo.v(e, "CctTransportBackend", "Could not make request to the backend");
                    aVar = new a(BackendResponse.Status.TRANSIENT_ERROR, -1L);
                }
            }
            BackendResponse.Status status = BackendResponse.Status.TRANSIENT_ERROR;
            BackendResponse.Status status2 = aVar.a;
            if (status2 == status) {
                final long j5 = j;
                bVar.n(new v0x0() { // from class: vd21
                    @Override // defpackage.v0x0
                    public final Object execute() {
                        wd21 wd21Var2 = wd21.this;
                        b bVar2 = (b) wd21Var2.c;
                        bVar2.getClass();
                        Iterable iterable2 = iterable;
                        if (iterable2.iterator().hasNext()) {
                            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(b.o(iterable2));
                            SQLiteDatabase a3 = bVar2.a();
                            a3.beginTransaction();
                            try {
                                a3.compileStatement(concat).execute();
                                Cursor rawQuery = a3.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                try {
                                    Cursor cursor = rawQuery;
                                    while (cursor.moveToNext()) {
                                        bVar2.k(cursor.getInt(0), LogEventDropped$Reason.MAX_RETRIES_REACHED, cursor.getString(1));
                                    }
                                    rawQuery.close();
                                    a3.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                    a3.setTransactionSuccessful();
                                } catch (Throwable th) {
                                    rawQuery.close();
                                    throw th;
                                }
                            } finally {
                                a3.endTransaction();
                            }
                        }
                        bVar2.d(new qll0(wd21Var2.g.getTime() + j5, v111Var));
                        return null;
                    }
                });
                this.d.o(v111Var, i + 1, true);
                return;
            }
            wd21Var = this;
            v111Var2 = v111Var;
            j3 = j;
            bVar.n(new e89(13, wd21Var, iterable));
            if (status2 == BackendResponse.Status.OK) {
                j3 = Math.max(j3, aVar.b);
                if (v111Var2.c() != null) {
                    bVar.n(new t6f0(9, wd21Var));
                }
            } else if (status2 == BackendResponse.Status.INVALID_PAYLOAD) {
                HashMap hashMap2 = new HashMap();
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    String k2 = ((u0b0) it4.next()).a().k();
                    if (hashMap2.containsKey(k2)) {
                        hashMap2.put(k2, Integer.valueOf(((Integer) hashMap2.get(k2)).intValue() + 1));
                    } else {
                        hashMap2.put(k2, 1);
                    }
                }
                bVar.n(new e89(14, wd21Var, hashMap2));
            }
            a = d011Var;
        }
    }
}
