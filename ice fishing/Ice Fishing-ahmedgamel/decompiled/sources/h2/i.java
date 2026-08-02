package h2;

import J3.l;
import a2.k;
import a2.n;
import a2.t;
import a2.u;
import a2.w;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.fragment.app.C0465d;
import c2.C0546a;
import com.google.android.gms.internal.ads.Wv;
import e2.C4473a;
import i2.C4588b;
import i2.InterfaceC4589c;
import i2.InterfaceC4590d;
import j2.InterfaceC4611b;
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
import k2.InterfaceC4642a;
import m.c1;
import s2.C4945n;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38106a;

    /* renamed from: b, reason: collision with root package name */
    public final c2.e f38107b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4590d f38108c;

    /* renamed from: d, reason: collision with root package name */
    public final c f38109d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f38110e;

    /* renamed from: f, reason: collision with root package name */
    public final j2.c f38111f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4642a f38112g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC4642a f38113h;
    public final InterfaceC4589c i;

    public i(Context context, c2.e eVar, InterfaceC4590d interfaceC4590d, c cVar, Executor executor, j2.c cVar2, InterfaceC4642a interfaceC4642a, InterfaceC4642a interfaceC4642a2, InterfaceC4589c interfaceC4589c) {
        this.f38106a = context;
        this.f38107b = eVar;
        this.f38108c = interfaceC4590d;
        this.f38109d = cVar;
        this.f38110e = executor;
        this.f38111f = cVar2;
        this.f38112g = interfaceC4642a;
        this.f38113h = interfaceC4642a2;
        this.i = interfaceC4589c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03fc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(b2.i iVar, int i) {
        c2.f fVar;
        C0546a c0546a;
        int i4;
        String str;
        Z1.b a9;
        int i6;
        String str2;
        Integer num;
        String str3;
        c2.f fVar2;
        c1 c1Var;
        int i9;
        int i10;
        final i iVar2 = this;
        final b2.i iVar3 = iVar;
        int i11 = 3;
        final int i12 = 0;
        int i13 = 2;
        final int i14 = 1;
        c2.f a10 = iVar2.f38107b.a(iVar3.f5537a);
        long j6 = 0;
        while (true) {
            InterfaceC4611b interfaceC4611b = new InterfaceC4611b(iVar2) { // from class: h2.g

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f38101u;

                {
                    this.f38101u = iVar2;
                }

                @Override // j2.InterfaceC4611b
                public final Object d() {
                    Boolean bool;
                    switch (i12) {
                        case 0:
                            b2.i iVar4 = iVar3;
                            i2.h hVar = (i2.h) this.f38101u.f38108c;
                            SQLiteDatabase b9 = hVar.b();
                            b9.beginTransaction();
                            try {
                                Long i15 = i2.h.i(b9, iVar4);
                                if (i15 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{i15.toString()});
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
                            i2.h hVar2 = (i2.h) this.f38101u.f38108c;
                            hVar2.getClass();
                            return (Iterable) hVar2.j(new C0465d(3, hVar2, iVar3));
                    }
                }
            };
            i2.h hVar = (i2.h) iVar2.f38111f;
            if (!((Boolean) hVar.m(interfaceC4611b)).booleanValue()) {
                hVar.m(new h(j6, iVar2, iVar3));
                return;
            }
            Iterable iterable = (Iterable) hVar.m(new InterfaceC4611b(iVar2) { // from class: h2.g

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f38101u;

                {
                    this.f38101u = iVar2;
                }

                @Override // j2.InterfaceC4611b
                public final Object d() {
                    Boolean bool;
                    switch (i14) {
                        case 0:
                            b2.i iVar4 = iVar3;
                            i2.h hVar2 = (i2.h) this.f38101u.f38108c;
                            SQLiteDatabase b9 = hVar2.b();
                            b9.beginTransaction();
                            try {
                                Long i15 = i2.h.i(b9, iVar4);
                                if (i15 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar2.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{i15.toString()});
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
                            i2.h hVar22 = (i2.h) this.f38101u.f38108c;
                            hVar22.getClass();
                            return (Iterable) hVar22.j(new C0465d(3, hVar22, iVar3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte[] bArr = iVar3.f5538b;
            if (a10 == null) {
                Z2.d.i("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar3);
                c0546a = new C0546a(i11, -1L);
                i4 = i13;
                fVar = a10;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C4588b) it.next()).f38163c);
                }
                String str4 = "proto";
                if ((bArr != null ? 1 : i12) != 0) {
                    InterfaceC4589c interfaceC4589c = iVar2.i;
                    Objects.requireNonNull(interfaceC4589c);
                    C4473a c4473a = (C4473a) hVar.m(new l(6, interfaceC4589c));
                    C4945n c4945n = new C4945n(i13);
                    c4945n.f40496z = new HashMap();
                    c4945n.f40494x = Long.valueOf(iVar2.f38112g.f());
                    c4945n.f40495y = Long.valueOf(iVar2.f38113h.f());
                    c4945n.f40491u = "GDT_CLIENT_METRICS";
                    Y1.c cVar = new Y1.c("proto");
                    c4473a.getClass();
                    b3.e eVar = b2.l.f5543a;
                    eVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        eVar.s(c4473a, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    c4945n.f40493w = new b2.j(cVar, byteArrayOutputStream.toByteArray());
                    arrayList.add(((Z1.c) a10).a(c4945n.c()));
                }
                Z1.c cVar2 = (Z1.c) a10;
                HashMap hashMap = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    b2.h hVar2 = (b2.h) it2.next();
                    String str5 = hVar2.f5531a;
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
                    b2.h hVar3 = (b2.h) ((List) entry.getValue()).get(0);
                    w wVar = w.f4296n;
                    long f2 = cVar2.f4120f.f();
                    long f9 = cVar2.f4119e.f();
                    a2.j jVar = new a2.j(new a2.h(Integer.valueOf(hVar3.b("sdk-version")), hVar3.a("model"), hVar3.a("hardware"), hVar3.a("device"), hVar3.a("product"), hVar3.a("os-uild"), hVar3.a("manufacturer"), hVar3.a("fingerprint"), hVar3.a("locale"), hVar3.a("country"), hVar3.a("mcc_mnc"), hVar3.a("application_build")));
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
                        b2.h hVar4 = (b2.h) it4.next();
                        b2.j jVar2 = hVar4.f5533c;
                        Iterator it5 = it3;
                        Y1.c cVar3 = jVar2.f5540a;
                        Iterator it6 = it4;
                        boolean equals = cVar3.equals(new Y1.c(str4));
                        byte[] bArr2 = jVar2.f5541b;
                        if (equals) {
                            c1Var = new c1();
                            c1Var.f39195w = bArr2;
                            str3 = str4;
                        } else {
                            str3 = str4;
                            if (cVar3.equals(new Y1.c("json"))) {
                                String str6 = new String(bArr2, Charset.forName("UTF-8"));
                                c1 c1Var2 = new c1();
                                c1Var2.f39196x = str6;
                                c1Var = c1Var2;
                            } else {
                                fVar2 = a10;
                                String l9 = Z2.d.l("CctTransportBackend");
                                if (Log.isLoggable(l9, 5)) {
                                    Log.w(l9, "Received event of unsupported encoding " + cVar3 + ". Skipping...");
                                }
                                a10 = fVar2;
                                it4 = it6;
                                it3 = it5;
                                str4 = str3;
                            }
                        }
                        fVar2 = a10;
                        c1Var.f39192n = Long.valueOf(hVar4.f5534d);
                        c1Var.f39194v = Long.valueOf(hVar4.f5535e);
                        String str7 = (String) hVar4.f5536f.get("tz-offset");
                        c1Var.f39197y = Long.valueOf(str7 == null ? 0L : Long.valueOf(str7).longValue());
                        c1Var.f39198z = new n((u) u.f4294n.get(hVar4.b("net-type")), (t) t.f4292n.get(hVar4.b("mobile-subtype")));
                        Integer num2 = hVar4.f5532b;
                        if (num2 != null) {
                            c1Var.f39193u = num2;
                        }
                        String str8 = ((Long) c1Var.f39192n) == null ? " eventTimeMs" : "";
                        if (((Long) c1Var.f39194v) == null) {
                            str8 = str8.concat(" eventUptimeMs");
                        }
                        if (((Long) c1Var.f39197y) == null) {
                            str8 = Wv.g(str8, " timezoneOffsetSeconds");
                        }
                        if (!str8.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str8));
                        }
                        arrayList4.add(new k(((Long) c1Var.f39192n).longValue(), (Integer) c1Var.f39193u, ((Long) c1Var.f39194v).longValue(), (byte[]) c1Var.f39195w, (String) c1Var.f39196x, ((Long) c1Var.f39197y).longValue(), (n) c1Var.f39198z));
                        a10 = fVar2;
                        it4 = it6;
                        it3 = it5;
                        str4 = str3;
                    }
                    arrayList3.add(new a2.l(f2, f9, jVar, num, str2, arrayList4));
                    a10 = a10;
                    it3 = it3;
                    str4 = str4;
                }
                fVar = a10;
                a2.i iVar4 = new a2.i(arrayList3);
                URL url = cVar2.f4118d;
                if (bArr != null) {
                    try {
                        Z1.a a11 = Z1.a.a(bArr);
                        str = a11.f4110b;
                        if (str == null) {
                            str = null;
                        }
                        String str9 = a11.f4109a;
                        if (str9 != null) {
                            url = Z1.c.b(str9);
                        }
                    } catch (IllegalArgumentException unused3) {
                        i11 = 3;
                        c0546a = new C0546a(3, -1L);
                        i4 = 2;
                    }
                } else {
                    str = null;
                }
                i11 = 3;
                try {
                    try {
                        b3.e eVar2 = new b3.e(17, url, iVar4, str);
                        l lVar = new l(i11, cVar2);
                        int i15 = 5;
                        do {
                            try {
                                a9 = lVar.a(eVar2);
                                URL url2 = (URL) a9.f4114w;
                                if (url2 != null) {
                                    try {
                                        Z2.d.i("CctTransportBackend", "Following redirect to: %s", url2);
                                        try {
                                            eVar2 = new b3.e(17, url2, (a2.i) eVar2.f5558v, (String) eVar2.f5559w);
                                        } catch (IOException e9) {
                                            e = e9;
                                            i11 = 3;
                                            Z2.d.j("CctTransportBackend", "Could not make request to the backend", e);
                                            i4 = 2;
                                            c0546a = new C0546a(2, -1L);
                                            i9 = c0546a.f5709a;
                                            if (i9 != i4) {
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
                                    i15--;
                                }
                            } catch (IOException e11) {
                                e = e11;
                                i11 = 3;
                                Z2.d.j("CctTransportBackend", "Could not make request to the backend", e);
                                i4 = 2;
                                c0546a = new C0546a(2, -1L);
                                i9 = c0546a.f5709a;
                                if (i9 != i4) {
                                }
                            }
                        } while (i15 >= 1);
                        i6 = a9.f4113v;
                    } catch (IOException e12) {
                        e = e12;
                    }
                } catch (IOException e13) {
                    e = e13;
                }
                if (i6 == 200) {
                    c0546a = new C0546a(1, a9.f4112u);
                } else {
                    if (i6 >= 500 || i6 == 404) {
                        i11 = 3;
                        c0546a = new C0546a(2, -1L);
                    } else if (i6 == 400) {
                        try {
                            c0546a = new C0546a(4, -1L);
                        } catch (IOException e14) {
                            e = e14;
                            i11 = 3;
                            Z2.d.j("CctTransportBackend", "Could not make request to the backend", e);
                            i4 = 2;
                            c0546a = new C0546a(2, -1L);
                            i9 = c0546a.f5709a;
                            if (i9 != i4) {
                            }
                        }
                    } else {
                        i11 = 3;
                        c0546a = new C0546a(3, -1L);
                    }
                    i4 = 2;
                    i9 = c0546a.f5709a;
                    if (i9 != i4) {
                        hVar.m(new U3.b(this, iterable, iVar, j6));
                        this.f38109d.a(iVar, i + 1, true);
                        return;
                    }
                    hVar.m(new C0465d(1, this, iterable));
                    if (i9 == 1) {
                        j6 = Math.max(j6, c0546a.f5710b);
                        if (bArr != null) {
                            hVar.m(new l(8, this));
                        }
                    } else if (i9 == 4) {
                        HashMap hashMap2 = new HashMap();
                        Iterator it7 = iterable.iterator();
                        while (it7.hasNext()) {
                            String str10 = ((C4588b) it7.next()).f38163c.f5531a;
                            if (hashMap2.containsKey(str10)) {
                                hashMap2.put(str10, Integer.valueOf(((Integer) hashMap2.get(str10)).intValue() + 1));
                            } else {
                                hashMap2.put(str10, 1);
                            }
                        }
                        i10 = 1;
                        i13 = 2;
                        hVar.m(new C0465d(i13, this, hashMap2));
                        iVar2 = this;
                        a10 = fVar;
                        iVar3 = iVar;
                        i14 = i10;
                        i12 = 0;
                    }
                    i13 = 2;
                    i10 = 1;
                    iVar2 = this;
                    a10 = fVar;
                    iVar3 = iVar;
                    i14 = i10;
                    i12 = 0;
                }
                i11 = 3;
                i4 = 2;
                i9 = c0546a.f5709a;
                if (i9 != i4) {
                }
            }
            i9 = c0546a.f5709a;
            if (i9 != i4) {
            }
        }
    }
}
