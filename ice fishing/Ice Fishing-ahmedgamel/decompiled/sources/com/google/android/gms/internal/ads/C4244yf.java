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
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.yf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4244yf implements InterfaceC2488Af {

    /* renamed from: l, reason: collision with root package name */
    public static final List f35970l = Collections.synchronizedList(new ArrayList());

    /* renamed from: a, reason: collision with root package name */
    public final C3157eM f35971a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f35972b;

    /* renamed from: e, reason: collision with root package name */
    public final Context f35975e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35976f;

    /* renamed from: g, reason: collision with root package name */
    public final C4298zf f35977g;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f35973c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f35974d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final Object f35978h = new Object();
    public final HashSet i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public boolean f35979j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35980k = false;

    public C4244yf(Context context, C5189a c5189a, C4298zf c4298zf, String str) {
        R2.w.i(c4298zf, "SafeBrowsing config is not present.");
        this.f35975e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f35972b = new LinkedHashMap();
        this.f35977g = c4298zf;
        Iterator it = c4298zf.f36141x.iterator();
        while (it.hasNext()) {
            this.i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.i.remove("cookie".toLowerCase(Locale.ENGLISH));
        C3157eM D8 = FM.D();
        D8.h();
        ((FM) D8.f28504u).O(9);
        if (str != null) {
            D8.h();
            ((FM) D8.f28504u).E(str);
            D8.h();
            ((FM) D8.f28504u).F(str);
        }
        C3211fM A9 = C3265gM.A();
        String str2 = this.f35977g.f36137n;
        if (str2 != null) {
            A9.h();
            ((C3265gM) A9.f28504u).B(str2);
        }
        C3265gM c3265gM = (C3265gM) A9.j();
        D8.h();
        ((FM) D8.f28504u).G(c3265gM);
        C4288zM A10 = AM.A();
        boolean h3 = X2.b.a(this.f35975e).h();
        A10.h();
        ((AM) A10.f28504u).D(h3);
        String str3 = c5189a.f41845n;
        if (str3 != null) {
            A10.h();
            ((AM) A10.f28504u).B(str3);
        }
        O2.f fVar = O2.f.f2270b;
        Context context2 = this.f35975e;
        fVar.getClass();
        long a9 = O2.f.a(context2);
        if (a9 > 0) {
            A10.h();
            ((AM) A10.f28504u).C(a9);
        }
        AM am = (AM) A10.j();
        D8.h();
        ((FM) D8.f28504u).L(am);
        this.f35971a = D8;
    }

    public final void a(String str) {
        synchronized (this.f35978h) {
            try {
                if (str == null) {
                    C3157eM c3157eM = this.f35971a;
                    c3157eM.h();
                    ((FM) c3157eM.f28504u).J();
                } else {
                    C3157eM c3157eM2 = this.f35971a;
                    c3157eM2.h();
                    ((FM) c3157eM2.f28504u).I(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i, String str, Map map) {
        synchronized (this.f35978h) {
            if (i == 3) {
                try {
                    this.f35980k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.f35972b;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    C4126wM c4126wM = (C4126wM) linkedHashMap.get(str);
                    c4126wM.h();
                    ((C4234yM) c4126wM.f28504u).H(4);
                }
                return;
            }
            C4126wM C8 = C4234yM.C();
            int i4 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 4 : 3 : 2 : 1;
            if (i4 != 0) {
                C8.h();
                ((C4234yM) C8.f28504u).H(i4);
            }
            int size = linkedHashMap.size();
            C8.h();
            ((C4234yM) C8.f28504u).D(size);
            C8.h();
            ((C4234yM) C8.f28504u).E(str);
            C3587mM A9 = C3695oM.A();
            if (!this.i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        C3479kM A10 = C3533lM.A();
                        HK hk = str2.isEmpty() ? JK.f26428u : new HK(str2.getBytes(StandardCharsets.UTF_8));
                        A10.h();
                        ((C3533lM) A10.f28504u).B(hk);
                        HK hk2 = str3.isEmpty() ? JK.f26428u : new HK(str3.getBytes(StandardCharsets.UTF_8));
                        A10.h();
                        ((C3533lM) A10.f28504u).C(hk2);
                        C3533lM c3533lM = (C3533lM) A10.j();
                        A9.h();
                        ((C3695oM) A9.f28504u).B(c3533lM);
                    }
                }
            }
            C3695oM c3695oM = (C3695oM) A9.j();
            C8.h();
            ((C4234yM) C8.f28504u).F(c3695oM);
            linkedHashMap.put(str, C8);
        }
    }
}
