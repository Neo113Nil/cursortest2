package com.google.android.gms.internal.ads;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.yf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4221yf implements InterfaceC2468Af {

    /* renamed from: l, reason: collision with root package name */
    public static final List f35180l = Collections.synchronizedList(new ArrayList());

    /* renamed from: a, reason: collision with root package name */
    public final C3134eM f35181a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f35182b;

    /* renamed from: e, reason: collision with root package name */
    public final Context f35185e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35186f;

    /* renamed from: g, reason: collision with root package name */
    public final C4275zf f35187g;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f35183c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f35184d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final Object f35188h = new Object();
    public final HashSet i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public boolean f35189j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35190k = false;

    public C4221yf(Context context, C5110a c5110a, C4275zf c4275zf, String str) {
        P2.w.i(c4275zf, "SafeBrowsing config is not present.");
        this.f35185e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f35182b = new LinkedHashMap();
        this.f35187g = c4275zf;
        Iterator it = c4275zf.f35368x.iterator();
        while (it.hasNext()) {
            this.i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.i.remove("cookie".toLowerCase(Locale.ENGLISH));
        C3134eM D8 = FM.D();
        D8.h();
        ((FM) D8.f27721u).O(9);
        if (str != null) {
            D8.h();
            ((FM) D8.f27721u).E(str);
            D8.h();
            ((FM) D8.f27721u).F(str);
        }
        C3188fM A9 = C3242gM.A();
        String str2 = this.f35187g.f35364n;
        if (str2 != null) {
            A9.h();
            ((C3242gM) A9.f27721u).B(str2);
        }
        C3242gM c3242gM = (C3242gM) A9.j();
        D8.h();
        ((FM) D8.f27721u).G(c3242gM);
        C4265zM A10 = AM.A();
        boolean d2 = V2.c.a(this.f35185e).d();
        A10.h();
        ((AM) A10.f27721u).D(d2);
        String str3 = c5110a.f41388n;
        if (str3 != null) {
            A10.h();
            ((AM) A10.f27721u).B(str3);
        }
        M2.f fVar = M2.f.f1844b;
        Context context2 = this.f35185e;
        fVar.getClass();
        long a9 = M2.f.a(context2);
        if (a9 > 0) {
            A10.h();
            ((AM) A10.f27721u).C(a9);
        }
        AM am = (AM) A10.j();
        D8.h();
        ((FM) D8.f27721u).L(am);
        this.f35181a = D8;
    }

    public final void a(String str) {
        synchronized (this.f35188h) {
            try {
                if (str == null) {
                    C3134eM c3134eM = this.f35181a;
                    c3134eM.h();
                    ((FM) c3134eM.f27721u).J();
                } else {
                    C3134eM c3134eM2 = this.f35181a;
                    c3134eM2.h();
                    ((FM) c3134eM2.f27721u).I(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i, String str, Map map) {
        synchronized (this.f35188h) {
            if (i == 3) {
                try {
                    this.f35190k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.f35182b;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    C4103wM c4103wM = (C4103wM) linkedHashMap.get(str);
                    c4103wM.h();
                    ((C4211yM) c4103wM.f27721u).H(4);
                }
                return;
            }
            C4103wM C8 = C4211yM.C();
            int i6 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 4 : 3 : 2 : 1;
            if (i6 != 0) {
                C8.h();
                ((C4211yM) C8.f27721u).H(i6);
            }
            int size = linkedHashMap.size();
            C8.h();
            ((C4211yM) C8.f27721u).D(size);
            C8.h();
            ((C4211yM) C8.f27721u).E(str);
            C3564mM A9 = C3672oM.A();
            if (!this.i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        C3456kM A10 = C3510lM.A();
                        HK hk = str2.isEmpty() ? JK.f25675u : new HK(str2.getBytes(StandardCharsets.UTF_8));
                        A10.h();
                        ((C3510lM) A10.f27721u).B(hk);
                        HK hk2 = str3.isEmpty() ? JK.f25675u : new HK(str3.getBytes(StandardCharsets.UTF_8));
                        A10.h();
                        ((C3510lM) A10.f27721u).C(hk2);
                        C3510lM c3510lM = (C3510lM) A10.j();
                        A9.h();
                        ((C3672oM) A9.f27721u).B(c3510lM);
                    }
                }
            }
            C3672oM c3672oM = (C3672oM) A9.j();
            C8.h();
            ((C4211yM) C8.f27721u).F(c3672oM);
            linkedHashMap.put(str, C8);
        }
    }
}
