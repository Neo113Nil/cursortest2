package f2;

import F3.l;
import Y1.n;
import Y1.t;
import Y1.u;
import Y1.w;
import Z1.k;
import Z1.m;
import a2.C0422a;
import a2.C0426e;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.fragment.app.C0471d;
import c2.C0538a;
import com.google.android.gms.internal.ads.CL;
import g2.C4526b;
import h2.InterfaceC4565b;
import h2.InterfaceC4566c;
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
import m.c1;
import q2.C4903n;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37686a;

    /* renamed from: b, reason: collision with root package name */
    public final C0426e f37687b;

    /* renamed from: c, reason: collision with root package name */
    public final g2.d f37688c;

    /* renamed from: d, reason: collision with root package name */
    public final C4500c f37689d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f37690e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4566c f37691f;

    /* renamed from: g, reason: collision with root package name */
    public final i2.a f37692g;

    /* renamed from: h, reason: collision with root package name */
    public final i2.a f37693h;
    public final g2.c i;

    public i(Context context, C0426e c0426e, g2.d dVar, C4500c c4500c, Executor executor, InterfaceC4566c interfaceC4566c, i2.a aVar, i2.a aVar2, g2.c cVar) {
        this.f37686a = context;
        this.f37687b = c0426e;
        this.f37688c = dVar;
        this.f37689d = c4500c;
        this.f37690e = executor;
        this.f37691f = interfaceC4566c;
        this.f37692g = aVar;
        this.f37693h = aVar2;
        this.i = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03fc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Z1.i iVar, int i) {
        a2.f fVar;
        C0422a c0422a;
        int i4;
        String str;
        X1.b a9;
        int i9;
        String str2;
        Integer num;
        String str3;
        a2.f fVar2;
        c1 c1Var;
        int i10;
        int i11;
        final i iVar2 = this;
        final Z1.i iVar3 = iVar;
        int i12 = 3;
        final int i13 = 0;
        int i14 = 2;
        final int i15 = 1;
        a2.f a10 = iVar2.f37687b.a(iVar3.f4225a);
        long j9 = 0;
        while (true) {
            InterfaceC4565b interfaceC4565b = new InterfaceC4565b(iVar2) { // from class: f2.g

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f37681u;

                {
                    this.f37681u = iVar2;
                }

                @Override // h2.InterfaceC4565b
                public final Object d() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            Z1.i iVar4 = iVar3;
                            g2.h hVar = (g2.h) this.f37681u.f37688c;
                            SQLiteDatabase b9 = hVar.b();
                            b9.beginTransaction();
                            try {
                                Long g9 = g2.h.g(b9, iVar4);
                                if (g9 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{g9.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                b9.setTransactionSuccessful();
                                return bool;
                            } finally {
                                b9.endTransaction();
                            }
                        default:
                            g2.h hVar2 = (g2.h) this.f37681u.f37688c;
                            hVar2.getClass();
                            return (Iterable) hVar2.i(new C0471d(5, hVar2, iVar3));
                    }
                }
            };
            g2.h hVar = (g2.h) iVar2.f37691f;
            if (!((Boolean) hVar.m(interfaceC4565b)).booleanValue()) {
                hVar.m(new h(j9, iVar2, iVar3));
                return;
            }
            Iterable iterable = (Iterable) hVar.m(new InterfaceC4565b(iVar2) { // from class: f2.g

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f37681u;

                {
                    this.f37681u = iVar2;
                }

                @Override // h2.InterfaceC4565b
                public final Object d() {
                    Boolean bool;
                    switch (i15) {
                        case 0:
                            Z1.i iVar4 = iVar3;
                            g2.h hVar2 = (g2.h) this.f37681u.f37688c;
                            SQLiteDatabase b9 = hVar2.b();
                            b9.beginTransaction();
                            try {
                                Long g9 = g2.h.g(b9, iVar4);
                                if (g9 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar2.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{g9.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                b9.setTransactionSuccessful();
                                return bool;
                            } finally {
                                b9.endTransaction();
                            }
                        default:
                            g2.h hVar22 = (g2.h) this.f37681u.f37688c;
                            hVar22.getClass();
                            return (Iterable) hVar22.i(new C0471d(5, hVar22, iVar3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte[] bArr = iVar3.f4226b;
            if (a10 == null) {
                U2.a.c("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar3);
                c0422a = new C0422a(i12, -1L);
                i4 = i14;
                fVar = a10;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C4526b) it.next()).f37867c);
                }
                String str4 = "proto";
                if ((bArr != null ? 1 : i13) != 0) {
                    g2.c cVar = iVar2.i;
                    Objects.requireNonNull(cVar);
                    C0538a c0538a = (C0538a) hVar.m(new l(6, cVar));
                    C4903n c4903n = new C4903n(i14);
                    c4903n.f40106z = new HashMap();
                    c4903n.f40104x = Long.valueOf(iVar2.f37692g.a());
                    c4903n.f40105y = Long.valueOf(iVar2.f37693h.a());
                    c4903n.f40101u = "GDT_CLIENT_METRICS";
                    W1.c cVar2 = new W1.c("proto");
                    c0538a.getClass();
                    Y2.e eVar = m.f4233a;
                    eVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        eVar.s(c0538a, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    c4903n.f40103w = new k(cVar2, byteArrayOutputStream.toByteArray());
                    arrayList.add(((X1.c) a10).a(c4903n.c()));
                }
                X1.c cVar3 = (X1.c) a10;
                HashMap hashMap = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Z1.h hVar2 = (Z1.h) it2.next();
                    String str5 = hVar2.f4219a;
                    if (hashMap.containsKey(str5)) {
                        ((List) hashMap.get(str5)).add(hVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar2);
                        hashMap.put(str5, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = hashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    Z1.h hVar3 = (Z1.h) ((List) entry.getValue()).get(0);
                    w wVar = w.f3956n;
                    long a11 = cVar3.f3825f.a();
                    long a12 = cVar3.f3824e.a();
                    Y1.j jVar = new Y1.j(new Y1.h(Integer.valueOf(hVar3.b("sdk-version")), hVar3.a("model"), hVar3.a("hardware"), hVar3.a("device"), hVar3.a("product"), hVar3.a("os-uild"), hVar3.a("manufacturer"), hVar3.a("fingerprint"), hVar3.a("locale"), hVar3.a("country"), hVar3.a("mcc_mnc"), hVar3.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = ((List) entry.getValue()).iterator();
                    while (it4.hasNext()) {
                        Z1.h hVar4 = (Z1.h) it4.next();
                        k kVar = hVar4.f4221c;
                        Iterator it5 = it3;
                        W1.c cVar4 = kVar.f4230a;
                        Iterator it6 = it4;
                        boolean equals = cVar4.equals(new W1.c(str4));
                        byte[] bArr2 = kVar.f4231b;
                        if (equals) {
                            c1Var = new c1();
                            c1Var.f39397w = bArr2;
                            str3 = str4;
                        } else {
                            str3 = str4;
                            if (cVar4.equals(new W1.c("json"))) {
                                String str6 = new String(bArr2, Charset.forName("UTF-8"));
                                c1 c1Var2 = new c1();
                                c1Var2.f39398x = str6;
                                c1Var = c1Var2;
                            } else {
                                fVar2 = a10;
                                String j10 = U2.a.j("CctTransportBackend");
                                if (Log.isLoggable(j10, 5)) {
                                    Log.w(j10, "Received event of unsupported encoding " + cVar4 + ". Skipping...");
                                }
                                a10 = fVar2;
                                it4 = it6;
                                it3 = it5;
                                str4 = str3;
                            }
                        }
                        fVar2 = a10;
                        c1Var.f39394n = Long.valueOf(hVar4.f4222d);
                        c1Var.f39396v = Long.valueOf(hVar4.f4223e);
                        String str7 = (String) hVar4.f4224f.get("tz-offset");
                        c1Var.f39399y = Long.valueOf(str7 == null ? 0L : Long.valueOf(str7).longValue());
                        c1Var.f39400z = new n((u) u.f3954n.get(hVar4.b("net-type")), (t) t.f3952n.get(hVar4.b("mobile-subtype")));
                        Integer num2 = hVar4.f4220b;
                        if (num2 != null) {
                            c1Var.f39395u = num2;
                        }
                        String str8 = ((Long) c1Var.f39394n) == null ? " eventTimeMs" : "";
                        if (((Long) c1Var.f39396v) == null) {
                            str8 = str8.concat(" eventUptimeMs");
                        }
                        if (((Long) c1Var.f39399y) == null) {
                            str8 = CL.j(str8, " timezoneOffsetSeconds");
                        }
                        if (!str8.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str8));
                        }
                        arrayList4.add(new Y1.k(((Long) c1Var.f39394n).longValue(), (Integer) c1Var.f39395u, ((Long) c1Var.f39396v).longValue(), (byte[]) c1Var.f39397w, (String) c1Var.f39398x, ((Long) c1Var.f39399y).longValue(), (n) c1Var.f39400z));
                        a10 = fVar2;
                        it4 = it6;
                        it3 = it5;
                        str4 = str3;
                    }
                    arrayList3.add(new Y1.l(a11, a12, jVar, num, str2, arrayList4));
                    a10 = a10;
                    it3 = it3;
                    str4 = str4;
                }
                fVar = a10;
                Y1.i iVar4 = new Y1.i(arrayList3);
                URL url = cVar3.f3823d;
                if (bArr != null) {
                    try {
                        X1.a a13 = X1.a.a(bArr);
                        str = a13.f3815b;
                        if (str == null) {
                            str = null;
                        }
                        String str9 = a13.f3814a;
                        if (str9 != null) {
                            url = X1.c.b(str9);
                        }
                    } catch (IllegalArgumentException unused3) {
                        i12 = 3;
                        c0422a = new C0422a(3, -1L);
                        i4 = 2;
                    }
                } else {
                    str = null;
                }
                i12 = 3;
                try {
                    try {
                        Y2.e eVar2 = new Y2.e(url, iVar4, str, 16);
                        l lVar = new l(i12, cVar3);
                        int i16 = 5;
                        do {
                            try {
                                a9 = lVar.a(eVar2);
                                URL url2 = (URL) a9.f3819w;
                                if (url2 != null) {
                                    try {
                                        U2.a.c("CctTransportBackend", "Following redirect to: %s", url2);
                                        try {
                                            eVar2 = new Y2.e(url2, (Y1.i) eVar2.f3964v, (String) eVar2.f3965w, 16);
                                        } catch (IOException e6) {
                                            e = e6;
                                            i12 = 3;
                                            U2.a.d("CctTransportBackend", "Could not make request to the backend", e);
                                            i4 = 2;
                                            c0422a = new C0422a(2, -1L);
                                            i10 = c0422a.f4363a;
                                            if (i10 != i4) {
                                            }
                                        }
                                    } catch (IOException e9) {
                                        e = e9;
                                    }
                                } else {
                                    eVar2 = null;
                                }
                                if (eVar2 == null) {
                                    break;
                                } else {
                                    i16--;
                                }
                            } catch (IOException e10) {
                                e = e10;
                                i12 = 3;
                                U2.a.d("CctTransportBackend", "Could not make request to the backend", e);
                                i4 = 2;
                                c0422a = new C0422a(2, -1L);
                                i10 = c0422a.f4363a;
                                if (i10 != i4) {
                                }
                            }
                        } while (i16 >= 1);
                        i9 = a9.f3818v;
                    } catch (IOException e11) {
                        e = e11;
                    }
                } catch (IOException e12) {
                    e = e12;
                }
                if (i9 == 200) {
                    c0422a = new C0422a(1, a9.f3817u);
                } else {
                    if (i9 >= 500 || i9 == 404) {
                        i12 = 3;
                        c0422a = new C0422a(2, -1L);
                    } else if (i9 == 400) {
                        try {
                            c0422a = new C0422a(4, -1L);
                        } catch (IOException e13) {
                            e = e13;
                            i12 = 3;
                            U2.a.d("CctTransportBackend", "Could not make request to the backend", e);
                            i4 = 2;
                            c0422a = new C0422a(2, -1L);
                            i10 = c0422a.f4363a;
                            if (i10 != i4) {
                            }
                        }
                    } else {
                        i12 = 3;
                        c0422a = new C0422a(3, -1L);
                    }
                    i4 = 2;
                    i10 = c0422a.f4363a;
                    if (i10 != i4) {
                        hVar.m(new O3.b(this, iterable, iVar, j9));
                        this.f37689d.a(iVar, i + 1, true);
                        return;
                    }
                    hVar.m(new C0471d(1, this, iterable));
                    if (i10 == 1) {
                        j9 = Math.max(j9, c0422a.f4364b);
                        if (bArr != null) {
                            hVar.m(new l(8, this));
                        }
                    } else if (i10 == 4) {
                        HashMap hashMap2 = new HashMap();
                        Iterator it7 = iterable.iterator();
                        while (it7.hasNext()) {
                            String str10 = ((C4526b) it7.next()).f37867c.f4219a;
                            if (hashMap2.containsKey(str10)) {
                                hashMap2.put(str10, Integer.valueOf(((Integer) hashMap2.get(str10)).intValue() + 1));
                            } else {
                                hashMap2.put(str10, 1);
                            }
                        }
                        i11 = 1;
                        i14 = 2;
                        hVar.m(new C0471d(i14, this, hashMap2));
                        iVar2 = this;
                        a10 = fVar;
                        iVar3 = iVar;
                        i15 = i11;
                        i13 = 0;
                    }
                    i14 = 2;
                    i11 = 1;
                    iVar2 = this;
                    a10 = fVar;
                    iVar3 = iVar;
                    i15 = i11;
                    i13 = 0;
                }
                i12 = 3;
                i4 = 2;
                i10 = c0422a.f4363a;
                if (i10 != i4) {
                }
            }
            i10 = c0422a.f4363a;
            if (i10 != i4) {
            }
        }
    }
}
