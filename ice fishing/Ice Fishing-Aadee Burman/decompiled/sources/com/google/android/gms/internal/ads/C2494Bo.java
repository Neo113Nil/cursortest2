package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p2.C4835j;
import u2.C5069B;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Bo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2494Bo {

    /* renamed from: d, reason: collision with root package name */
    public final long f23956d;

    /* renamed from: f, reason: collision with root package name */
    public final Context f23958f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakReference f23959g;

    /* renamed from: h, reason: collision with root package name */
    public final C2748Qn f23960h;
    public final RD i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f23961j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f23962k;

    /* renamed from: l, reason: collision with root package name */
    public final C3421jo f23963l;

    /* renamed from: m, reason: collision with root package name */
    public final C5110a f23964m;

    /* renamed from: o, reason: collision with root package name */
    public final C3957tl f23966o;

    /* renamed from: p, reason: collision with root package name */
    public final Wu f23967p;

    /* renamed from: a, reason: collision with root package name */
    public boolean f23953a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23954b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23955c = false;

    /* renamed from: e, reason: collision with root package name */
    public final C3467kg f23957e = new C3467kg();

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f23965n = new ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public boolean f23968q = true;

    public C2494Bo(Executor executor, Context context, WeakReference weakReference, RD rd, C2748Qn c2748Qn, ScheduledExecutorService scheduledExecutorService, C3421jo c3421jo, C5110a c5110a, C3957tl c3957tl, Wu wu) {
        this.f23960h = c2748Qn;
        this.f23958f = context;
        this.f23959g = weakReference;
        this.i = rd;
        this.f23962k = scheduledExecutorService;
        this.f23961j = executor;
        this.f23963l = c3421jo;
        this.f23964m = c5110a;
        this.f23966o = c3957tl;
        this.f23967p = wu;
        C4835j.f39730C.f39742k.getClass();
        this.f23956d = SystemClock.elapsedRealtime();
        d("com.google.android.gms.ads.MobileAds", 0, "", false);
    }

    public final void a() {
        if (!((Boolean) AbstractC2817Va.f28198a.r()).booleanValue()) {
            int i = this.f23964m.f41390v;
            C3301ha c3301ha = AbstractC3569ma.f32382u2;
            q2.r rVar = q2.r.f40204e;
            if (i >= ((Integer) rVar.f40207c.a(c3301ha)).intValue() && this.f23968q) {
                if (this.f23953a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f23953a) {
                            return;
                        }
                        this.f23963l.d();
                        this.f23966o.d();
                        C3467kg c3467kg = this.f23957e;
                        final int i6 = 0;
                        Runnable runnable = new Runnable(this) { // from class: com.google.android.gms.internal.ads.zo

                            /* renamed from: u, reason: collision with root package name */
                            public final /* synthetic */ C2494Bo f35456u;

                            {
                                this.f35456u = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        C2494Bo c2494Bo = this.f35456u;
                                        C3421jo c3421jo = c2494Bo.f23963l;
                                        synchronized (c3421jo) {
                                            try {
                                                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32025G2)).booleanValue() && !c3421jo.f31322d) {
                                                    HashMap e9 = c3421jo.e();
                                                    e9.put(NativeAdvancedJsUtils.f17906p, "init_finished");
                                                    ArrayList arrayList = c3421jo.f31320b;
                                                    arrayList.add(e9);
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        c3421jo.f31324f.b((Map) it.next());
                                                    }
                                                    c3421jo.f31322d = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        c2494Bo.f23966o.e();
                                        c2494Bo.f23954b = true;
                                        return;
                                    default:
                                        C2494Bo c2494Bo2 = this.f35456u;
                                        synchronized (c2494Bo2) {
                                            try {
                                                if (c2494Bo2.f23955c) {
                                                    return;
                                                }
                                                C4835j.f39730C.f39742k.getClass();
                                                c2494Bo2.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - c2494Bo2.f23956d), "Timeout.", false);
                                                c2494Bo2.f23963l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                c2494Bo2.f23966o.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                c2494Bo2.f23957e.c(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                }
                            }
                        };
                        RD rd = this.i;
                        c3467kg.f31479n.a(runnable, rd);
                        this.f23953a = true;
                        N3.a c9 = c();
                        final int i9 = 1;
                        this.f23962k.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zo

                            /* renamed from: u, reason: collision with root package name */
                            public final /* synthetic */ C2494Bo f35456u;

                            {
                                this.f35456u = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i9) {
                                    case 0:
                                        C2494Bo c2494Bo = this.f35456u;
                                        C3421jo c3421jo = c2494Bo.f23963l;
                                        synchronized (c3421jo) {
                                            try {
                                                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32025G2)).booleanValue() && !c3421jo.f31322d) {
                                                    HashMap e9 = c3421jo.e();
                                                    e9.put(NativeAdvancedJsUtils.f17906p, "init_finished");
                                                    ArrayList arrayList = c3421jo.f31320b;
                                                    arrayList.add(e9);
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        c3421jo.f31324f.b((Map) it.next());
                                                    }
                                                    c3421jo.f31322d = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        c2494Bo.f23966o.e();
                                        c2494Bo.f23954b = true;
                                        return;
                                    default:
                                        C2494Bo c2494Bo2 = this.f35456u;
                                        synchronized (c2494Bo2) {
                                            try {
                                                if (c2494Bo2.f23955c) {
                                                    return;
                                                }
                                                C4835j.f39730C.f39742k.getClass();
                                                c2494Bo2.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - c2494Bo2.f23956d), "Timeout.", false);
                                                c2494Bo2.f23963l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                c2494Bo2.f23966o.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                c2494Bo2.f23957e.c(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                }
                            }
                        }, ((Long) rVar.f40207c.a(AbstractC3569ma.f32400w2)).longValue(), TimeUnit.SECONDS);
                        c9.a(new LD(0, c9, new C3694or(this)), rd);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.f23953a) {
            return;
        }
        d("com.google.android.gms.ads.MobileAds", 0, "", true);
        this.f23957e.b(Boolean.FALSE);
        this.f23953a = true;
        this.f23954b = true;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.f23965n;
        for (String str : concurrentHashMap.keySet()) {
            C4272zc c4272zc = (C4272zc) concurrentHashMap.get(str);
            arrayList.add(new C4272zc(str, c4272zc.f35351v, c4272zc.f35352w, c4272zc.f35350u));
        }
        return arrayList;
    }

    public final synchronized N3.a c() {
        C4835j c4835j = C4835j.f39730C;
        String str = c4835j.f39740h.g().n().f28917e;
        if (!TextUtils.isEmpty(str)) {
            return QC.c(str);
        }
        C3467kg c3467kg = new C3467kg();
        C5069B g4 = c4835j.f39740h.g();
        g4.f41208c.add(new RunnableC3973u0(27, this, c3467kg));
        return c3467kg;
    }

    public final void d(String str, int i, String str2, boolean z3) {
        this.f23965n.put(str, new C4272zc(str, i, str2, z3));
    }
}
