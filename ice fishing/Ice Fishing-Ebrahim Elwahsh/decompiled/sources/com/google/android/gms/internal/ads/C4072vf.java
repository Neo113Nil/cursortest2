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
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.vf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4072vf implements InterfaceC4180xf {

    /* renamed from: l, reason: collision with root package name */
    public static final List f34819l = Collections.synchronizedList(new ArrayList());

    /* renamed from: a, reason: collision with root package name */
    public final C3900sM f34820a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f34821b;

    /* renamed from: e, reason: collision with root package name */
    public final Context f34824e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f34825f;

    /* renamed from: g, reason: collision with root package name */
    public final C4126wf f34826g;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f34822c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f34823d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final Object f34827h = new Object();
    public final HashSet i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public boolean f34828j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f34829k = false;

    public C4072vf(Context context, C5107a c5107a, C4126wf c4126wf, String str) {
        O2.w.i(c4126wf, "SafeBrowsing config is not present.");
        this.f34824e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f34821b = new LinkedHashMap();
        this.f34826g = c4126wf;
        Iterator it = c4126wf.f35012x.iterator();
        while (it.hasNext()) {
            this.i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.i.remove("cookie".toLowerCase(Locale.ENGLISH));
        C3900sM D8 = TM.D();
        D8.h();
        ((TM) D8.f30000u).O(9);
        if (str != null) {
            D8.h();
            ((TM) D8.f30000u).E(str);
            D8.h();
            ((TM) D8.f30000u).F(str);
        }
        C3954tM A8 = C4008uM.A();
        String str2 = this.f34826g.f35008n;
        if (str2 != null) {
            A8.h();
            ((C4008uM) A8.f30000u).B(str2);
        }
        C4008uM c4008uM = (C4008uM) A8.j();
        D8.h();
        ((TM) D8.f30000u).G(c4008uM);
        NM A9 = OM.A();
        boolean f6 = U2.c.a(this.f34824e).f();
        A9.h();
        ((OM) A9.f30000u).D(f6);
        String str3 = c5107a.f41217n;
        if (str3 != null) {
            A9.h();
            ((OM) A9.f30000u).B(str3);
        }
        L2.f fVar = L2.f.f1726b;
        Context context2 = this.f34824e;
        fVar.getClass();
        long a9 = L2.f.a(context2);
        if (a9 > 0) {
            A9.h();
            ((OM) A9.f30000u).C(a9);
        }
        OM om = (OM) A9.j();
        D8.h();
        ((TM) D8.f30000u).L(om);
        this.f34820a = D8;
    }

    public final void a(String str) {
        synchronized (this.f34827h) {
            try {
                if (str == null) {
                    C3900sM c3900sM = this.f34820a;
                    c3900sM.h();
                    ((TM) c3900sM.f30000u).J();
                } else {
                    C3900sM c3900sM2 = this.f34820a;
                    c3900sM2.h();
                    ((TM) c3900sM2.f30000u).I(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i, String str, Map map) {
        synchronized (this.f34827h) {
            if (i == 3) {
                try {
                    this.f34829k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.f34821b;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    LM lm = (LM) linkedHashMap.get(str);
                    lm.h();
                    ((MM) lm.f30000u).H(4);
                }
                return;
            }
            LM C7 = MM.C();
            int i4 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 4 : 3 : 2 : 1;
            if (i4 != 0) {
                C7.h();
                ((MM) C7.f30000u).H(i4);
            }
            int size = linkedHashMap.size();
            C7.h();
            ((MM) C7.f30000u).D(size);
            C7.h();
            ((MM) C7.f30000u).E(str);
            AM A8 = CM.A();
            if (!this.i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        C4224yM A9 = C4278zM.A();
                        QK qk = str2.isEmpty() ? SK.f27529u : new QK(str2.getBytes(StandardCharsets.UTF_8));
                        A9.h();
                        ((C4278zM) A9.f30000u).B(qk);
                        QK qk2 = str3.isEmpty() ? SK.f27529u : new QK(str3.getBytes(StandardCharsets.UTF_8));
                        A9.h();
                        ((C4278zM) A9.f30000u).C(qk2);
                        C4278zM c4278zM = (C4278zM) A9.j();
                        A8.h();
                        ((CM) A8.f30000u).B(c4278zM);
                    }
                }
            }
            CM cm = (CM) A8.j();
            C7.h();
            ((MM) C7.f30000u).F(cm);
            linkedHashMap.put(str, C7);
        }
    }
}
