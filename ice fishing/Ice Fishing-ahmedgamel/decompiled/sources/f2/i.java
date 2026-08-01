package f2;

import H3.l;
import Y1.n;
import Y1.t;
import Y1.u;
import Y1.w;
import Z1.k;
import Z1.m;
import a2.C0429a;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.fragment.app.C0461d;
import c2.C0534a;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import g2.C4525b;
import g2.InterfaceC4526c;
import g2.InterfaceC4527d;
import h2.InterfaceC4563b;
import i2.InterfaceC4581a;
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
import m.b1;
import q2.C4896n;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37482a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.f f37483b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4527d f37484c;

    /* renamed from: d, reason: collision with root package name */
    public final c f37485d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f37486e;

    /* renamed from: f, reason: collision with root package name */
    public final h2.c f37487f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4581a f37488g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC4581a f37489h;
    public final InterfaceC4526c i;

    public i(Context context, a2.f fVar, InterfaceC4527d interfaceC4527d, c cVar, Executor executor, h2.c cVar2, InterfaceC4581a interfaceC4581a, InterfaceC4581a interfaceC4581a2, InterfaceC4526c interfaceC4526c) {
        this.f37482a = context;
        this.f37483b = fVar;
        this.f37484c = interfaceC4527d;
        this.f37485d = cVar;
        this.f37486e = executor;
        this.f37487f = cVar2;
        this.f37488g = interfaceC4581a;
        this.f37489h = interfaceC4581a2;
        this.i = interfaceC4526c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03fc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Z1.i iVar, int i) {
        a2.g gVar;
        C0429a c0429a;
        int i6;
        String str;
        X1.b a9;
        int i9;
        String str2;
        Integer num;
        String str3;
        a2.g gVar2;
        b1 b1Var;
        int i10;
        int i11;
        final i iVar2 = this;
        final Z1.i iVar3 = iVar;
        int i12 = 3;
        final int i13 = 0;
        int i14 = 2;
        final int i15 = 1;
        a2.g a10 = iVar2.f37483b.a(iVar3.f4148a);
        long j6 = 0;
        while (true) {
            InterfaceC4563b interfaceC4563b = new InterfaceC4563b(iVar2) { // from class: f2.g

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f37477u;

                {
                    this.f37477u = iVar2;
                }

                @Override // h2.InterfaceC4563b
                public final Object c() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            Z1.i iVar4 = iVar3;
                            g2.h hVar = (g2.h) this.f37477u.f37484c;
                            SQLiteDatabase b9 = hVar.b();
                            b9.beginTransaction();
                            try {
                                Long i16 = g2.h.i(b9, iVar4);
                                if (i16 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{i16.toString()});
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
                            g2.h hVar2 = (g2.h) this.f37477u.f37484c;
                            hVar2.getClass();
                            return (Iterable) hVar2.j(new C0461d(3, hVar2, iVar3));
                    }
                }
            };
            g2.h hVar = (g2.h) iVar2.f37487f;
            if (!((Boolean) hVar.m(interfaceC4563b)).booleanValue()) {
                hVar.m(new h(j6, iVar2, iVar3));
                return;
            }
            Iterable iterable = (Iterable) hVar.m(new InterfaceC4563b(iVar2) { // from class: f2.g

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f37477u;

                {
                    this.f37477u = iVar2;
                }

                @Override // h2.InterfaceC4563b
                public final Object c() {
                    Boolean bool;
                    switch (i15) {
                        case 0:
                            Z1.i iVar4 = iVar3;
                            g2.h hVar2 = (g2.h) this.f37477u.f37484c;
                            SQLiteDatabase b9 = hVar2.b();
                            b9.beginTransaction();
                            try {
                                Long i16 = g2.h.i(b9, iVar4);
                                if (i16 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar2.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{i16.toString()});
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
                            g2.h hVar22 = (g2.h) this.f37477u.f37484c;
                            hVar22.getClass();
                            return (Iterable) hVar22.j(new C0461d(3, hVar22, iVar3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte[] bArr = iVar3.f4149b;
            if (a10 == null) {
                O3.b.i("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar3);
                c0429a = new C0429a(i12, -1L);
                i6 = i14;
                gVar = a10;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C4525b) it.next()).f37636c);
                }
                String str4 = "proto";
                if ((bArr != null ? 1 : i13) != 0) {
                    InterfaceC4526c interfaceC4526c = iVar2.i;
                    Objects.requireNonNull(interfaceC4526c);
                    C0534a c0534a = (C0534a) hVar.m(new l(6, interfaceC4526c));
                    C4896n c4896n = new C4896n(i14);
                    c4896n.f40197z = new HashMap();
                    c4896n.f40195x = Long.valueOf(iVar2.f37488g.g());
                    c4896n.f40196y = Long.valueOf(iVar2.f37489h.g());
                    c4896n.f40192u = "GDT_CLIENT_METRICS";
                    W1.c cVar = new W1.c("proto");
                    c0534a.getClass();
                    Z2.e eVar = m.f4156a;
                    eVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        eVar.q(c0534a, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    c4896n.f40194w = new k(cVar, byteArrayOutputStream.toByteArray());
                    arrayList.add(((X1.c) a10).a(c4896n.c()));
                }
                X1.c cVar2 = (X1.c) a10;
                HashMap hashMap = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Z1.h hVar2 = (Z1.h) it2.next();
                    String str5 = hVar2.f4142a;
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
                    w wVar = w.f3943n;
                    long g4 = cVar2.f3769f.g();
                    long g9 = cVar2.f3768e.g();
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
                        k kVar = hVar4.f4144c;
                        Iterator it5 = it3;
                        W1.c cVar3 = kVar.f4153a;
                        Iterator it6 = it4;
                        boolean equals = cVar3.equals(new W1.c(str4));
                        byte[] bArr2 = kVar.f4154b;
                        if (equals) {
                            b1Var = new b1();
                            b1Var.f39124w = bArr2;
                            str3 = str4;
                        } else {
                            str3 = str4;
                            if (cVar3.equals(new W1.c("json"))) {
                                String str6 = new String(bArr2, Charset.forName("UTF-8"));
                                b1 b1Var2 = new b1();
                                b1Var2.f39125x = str6;
                                b1Var = b1Var2;
                            } else {
                                gVar2 = a10;
                                String w6 = O3.b.w("CctTransportBackend");
                                if (Log.isLoggable(w6, 5)) {
                                    Log.w(w6, "Received event of unsupported encoding " + cVar3 + ". Skipping...");
                                }
                                a10 = gVar2;
                                it4 = it6;
                                it3 = it5;
                                str4 = str3;
                            }
                        }
                        gVar2 = a10;
                        b1Var.f39121n = Long.valueOf(hVar4.f4145d);
                        b1Var.f39123v = Long.valueOf(hVar4.f4146e);
                        String str7 = (String) hVar4.f4147f.get("tz-offset");
                        b1Var.f39126y = Long.valueOf(str7 == null ? 0L : Long.valueOf(str7).longValue());
                        b1Var.f39127z = new n((u) u.f3941n.get(hVar4.b("net-type")), (t) t.f3939n.get(hVar4.b("mobile-subtype")));
                        Integer num2 = hVar4.f4143b;
                        if (num2 != null) {
                            b1Var.f39122u = num2;
                        }
                        String str8 = ((Long) b1Var.f39121n) == null ? " eventTimeMs" : "";
                        if (((Long) b1Var.f39123v) == null) {
                            str8 = str8.concat(" eventUptimeMs");
                        }
                        if (((Long) b1Var.f39126y) == null) {
                            str8 = AbstractC4404f.f(str8, " timezoneOffsetSeconds");
                        }
                        if (!str8.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str8));
                        }
                        arrayList4.add(new Y1.k(((Long) b1Var.f39121n).longValue(), (Integer) b1Var.f39122u, ((Long) b1Var.f39123v).longValue(), (byte[]) b1Var.f39124w, (String) b1Var.f39125x, ((Long) b1Var.f39126y).longValue(), (n) b1Var.f39127z));
                        a10 = gVar2;
                        it4 = it6;
                        it3 = it5;
                        str4 = str3;
                    }
                    arrayList3.add(new Y1.l(g4, g9, jVar, num, str2, arrayList4));
                    a10 = a10;
                    it3 = it3;
                    str4 = str4;
                }
                gVar = a10;
                Y1.i iVar4 = new Y1.i(arrayList3);
                URL url = cVar2.f3767d;
                if (bArr != null) {
                    try {
                        X1.a a11 = X1.a.a(bArr);
                        str = a11.f3759b;
                        if (str == null) {
                            str = null;
                        }
                        String str9 = a11.f3758a;
                        if (str9 != null) {
                            url = X1.c.b(str9);
                        }
                    } catch (IllegalArgumentException unused3) {
                        i12 = 3;
                        c0429a = new C0429a(3, -1L);
                        i6 = 2;
                    }
                } else {
                    str = null;
                }
                i12 = 3;
                try {
                    try {
                        Z2.e eVar2 = new Z2.e(17, url, iVar4, str);
                        l lVar = new l(i12, cVar2);
                        int i16 = 5;
                        do {
                            try {
                                a9 = lVar.a(eVar2);
                                URL url2 = (URL) a9.f3763w;
                                if (url2 != null) {
                                    try {
                                        O3.b.i("CctTransportBackend", "Following redirect to: %s", url2);
                                        try {
                                            eVar2 = new Z2.e(17, url2, (Y1.i) eVar2.f4171v, (String) eVar2.f4172w);
                                        } catch (IOException e9) {
                                            e = e9;
                                            i12 = 3;
                                            O3.b.k("CctTransportBackend", "Could not make request to the backend", e);
                                            i6 = 2;
                                            c0429a = new C0429a(2, -1L);
                                            i10 = c0429a.f4314a;
                                            if (i10 != i6) {
                                            }
                                        }
                                    } catch (IOException e10) {
                                        e = e10;
                                    }
                                } else {
                                    eVar2 = null;
                                }
                                if (eVar2 == null) {
                                    break;
                                } else {
                                    i16--;
                                }
                            } catch (IOException e11) {
                                e = e11;
                                i12 = 3;
                                O3.b.k("CctTransportBackend", "Could not make request to the backend", e);
                                i6 = 2;
                                c0429a = new C0429a(2, -1L);
                                i10 = c0429a.f4314a;
                                if (i10 != i6) {
                                }
                            }
                        } while (i16 >= 1);
                        i9 = a9.f3762v;
                    } catch (IOException e12) {
                        e = e12;
                    }
                } catch (IOException e13) {
                    e = e13;
                }
                if (i9 == 200) {
                    c0429a = new C0429a(1, a9.f3761u);
                } else {
                    if (i9 >= 500 || i9 == 404) {
                        i12 = 3;
                        c0429a = new C0429a(2, -1L);
                    } else if (i9 == 400) {
                        try {
                            c0429a = new C0429a(4, -1L);
                        } catch (IOException e14) {
                            e = e14;
                            i12 = 3;
                            O3.b.k("CctTransportBackend", "Could not make request to the backend", e);
                            i6 = 2;
                            c0429a = new C0429a(2, -1L);
                            i10 = c0429a.f4314a;
                            if (i10 != i6) {
                            }
                        }
                    } else {
                        i12 = 3;
                        c0429a = new C0429a(3, -1L);
                    }
                    i6 = 2;
                    i10 = c0429a.f4314a;
                    if (i10 != i6) {
                        hVar.m(new S3.b(this, iterable, iVar, j6));
                        this.f37485d.a(iVar, i + 1, true);
                        return;
                    }
                    hVar.m(new C0461d(1, this, iterable));
                    if (i10 == 1) {
                        j6 = Math.max(j6, c0429a.f4315b);
                        if (bArr != null) {
                            hVar.m(new l(8, this));
                        }
                    } else if (i10 == 4) {
                        HashMap hashMap2 = new HashMap();
                        Iterator it7 = iterable.iterator();
                        while (it7.hasNext()) {
                            String str10 = ((C4525b) it7.next()).f37636c.f4142a;
                            if (hashMap2.containsKey(str10)) {
                                hashMap2.put(str10, Integer.valueOf(((Integer) hashMap2.get(str10)).intValue() + 1));
                            } else {
                                hashMap2.put(str10, 1);
                            }
                        }
                        i11 = 1;
                        i14 = 2;
                        hVar.m(new C0461d(i14, this, hashMap2));
                        iVar2 = this;
                        a10 = gVar;
                        iVar3 = iVar;
                        i15 = i11;
                        i13 = 0;
                    }
                    i14 = 2;
                    i11 = 1;
                    iVar2 = this;
                    a10 = gVar;
                    iVar3 = iVar;
                    i15 = i11;
                    i13 = 0;
                }
                i12 = 3;
                i6 = 2;
                i10 = c0429a.f4314a;
                if (i10 != i6) {
                }
            }
            i10 = c0429a.f4314a;
            if (i10 != i6) {
            }
        }
    }
}
