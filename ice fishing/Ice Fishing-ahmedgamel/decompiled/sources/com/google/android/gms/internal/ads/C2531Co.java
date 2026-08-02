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
import r2.C4906k;
import w2.C5140B;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Co, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2531Co {

    /* renamed from: d, reason: collision with root package name */
    public final long f24969d;

    /* renamed from: f, reason: collision with root package name */
    public final Context f24971f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakReference f24972g;

    /* renamed from: h, reason: collision with root package name */
    public final C2785Rn f24973h;
    public final RD i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f24974j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f24975k;

    /* renamed from: l, reason: collision with root package name */
    public final C3498ko f24976l;

    /* renamed from: m, reason: collision with root package name */
    public final C5189a f24977m;

    /* renamed from: o, reason: collision with root package name */
    public final C4034ul f24979o;

    /* renamed from: p, reason: collision with root package name */
    public final Wu f24980p;

    /* renamed from: a, reason: collision with root package name */
    public boolean f24966a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24967b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24968c = false;

    /* renamed from: e, reason: collision with root package name */
    public final C3490kg f24970e = new C3490kg();

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f24978n = new ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public boolean f24981q = true;

    public C2531Co(Executor executor, Context context, WeakReference weakReference, RD rd, C2785Rn c2785Rn, ScheduledExecutorService scheduledExecutorService, C3498ko c3498ko, C5189a c5189a, C4034ul c4034ul, Wu wu) {
        this.f24973h = c2785Rn;
        this.f24971f = context;
        this.f24972g = weakReference;
        this.i = rd;
        this.f24975k = scheduledExecutorService;
        this.f24974j = executor;
        this.f24976l = c3498ko;
        this.f24977m = c5189a;
        this.f24979o = c4034ul;
        this.f24980p = wu;
        C4906k.f40186C.f40198k.getClass();
        this.f24969d = SystemClock.elapsedRealtime();
        d("com.google.android.gms.ads.MobileAds", 0, "", false);
    }

    public final void a() {
        if (!((Boolean) AbstractC2840Va.f28995a.r()).booleanValue()) {
            int i = this.f24977m.f41847v;
            C3324ha c3324ha = AbstractC3592ma.f33161u2;
            s2.r rVar = s2.r.f40506e;
            if (i >= ((Integer) rVar.f40509c.a(c3324ha)).intValue() && this.f24981q) {
                if (this.f24966a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f24966a) {
                            return;
                        }
                        this.f24976l.d();
                        this.f24979o.d();
                        C3490kg c3490kg = this.f24970e;
                        final int i4 = 0;
                        Runnable runnable = new Runnable(this) { // from class: com.google.android.gms.internal.ads.Ao

                            /* renamed from: u, reason: collision with root package name */
                            public final /* synthetic */ C2531Co f24522u;

                            {
                                this.f24522u = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i4) {
                                    case 0:
                                        C2531Co c2531Co = this.f24522u;
                                        C3498ko c3498ko = c2531Co.f24976l;
                                        synchronized (c3498ko) {
                                            try {
                                                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.G2)).booleanValue() && !c3498ko.f32412d) {
                                                    HashMap e9 = c3498ko.e();
                                                    e9.put(NativeAdvancedJsUtils.f18693p, "init_finished");
                                                    ArrayList arrayList = c3498ko.f32410b;
                                                    arrayList.add(e9);
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        c3498ko.f32414f.b((Map) it.next());
                                                    }
                                                    c3498ko.f32412d = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        c2531Co.f24979o.e();
                                        c2531Co.f24967b = true;
                                        return;
                                    default:
                                        C2531Co c2531Co2 = this.f24522u;
                                        synchronized (c2531Co2) {
                                            try {
                                                if (c2531Co2.f24968c) {
                                                    return;
                                                }
                                                C4906k.f40186C.f40198k.getClass();
                                                c2531Co2.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - c2531Co2.f24969d), "Timeout.", false);
                                                c2531Co2.f24976l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                c2531Co2.f24979o.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                c2531Co2.f24970e.c(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                }
                            }
                        };
                        RD rd = this.i;
                        c3490kg.f32256n.a(runnable, rd);
                        this.f24966a = true;
                        P3.a c9 = c();
                        final int i6 = 1;
                        this.f24975k.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Ao

                            /* renamed from: u, reason: collision with root package name */
                            public final /* synthetic */ C2531Co f24522u;

                            {
                                this.f24522u = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        C2531Co c2531Co = this.f24522u;
                                        C3498ko c3498ko = c2531Co.f24976l;
                                        synchronized (c3498ko) {
                                            try {
                                                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.G2)).booleanValue() && !c3498ko.f32412d) {
                                                    HashMap e9 = c3498ko.e();
                                                    e9.put(NativeAdvancedJsUtils.f18693p, "init_finished");
                                                    ArrayList arrayList = c3498ko.f32410b;
                                                    arrayList.add(e9);
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        c3498ko.f32414f.b((Map) it.next());
                                                    }
                                                    c3498ko.f32412d = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        c2531Co.f24979o.e();
                                        c2531Co.f24967b = true;
                                        return;
                                    default:
                                        C2531Co c2531Co2 = this.f24522u;
                                        synchronized (c2531Co2) {
                                            try {
                                                if (c2531Co2.f24968c) {
                                                    return;
                                                }
                                                C4906k.f40186C.f40198k.getClass();
                                                c2531Co2.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - c2531Co2.f24969d), "Timeout.", false);
                                                c2531Co2.f24976l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                c2531Co2.f24979o.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                c2531Co2.f24970e.c(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                }
                            }
                        }, ((Long) rVar.f40509c.a(AbstractC3592ma.f33180w2)).longValue(), TimeUnit.SECONDS);
                        c9.a(new LD(0, c9, new C3717or(this)), rd);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.f24966a) {
            return;
        }
        d("com.google.android.gms.ads.MobileAds", 0, "", true);
        this.f24970e.b(Boolean.FALSE);
        this.f24966a = true;
        this.f24967b = true;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.f24978n;
        for (String str : concurrentHashMap.keySet()) {
            C4295zc c4295zc = (C4295zc) concurrentHashMap.get(str);
            arrayList.add(new C4295zc(str, c4295zc.f36124v, c4295zc.f36125w, c4295zc.f36123u));
        }
        return arrayList;
    }

    public final synchronized P3.a c() {
        C4906k c4906k = C4906k.f40186C;
        String str = c4906k.f40196h.g().n().f29694e;
        if (!TextUtils.isEmpty(str)) {
            return QC.c(str);
        }
        C3490kg c3490kg = new C3490kg();
        C5140B g9 = c4906k.f40196h.g();
        g9.f41601c.add(new RunnableC3996u0(27, this, c3490kg));
        return c3490kg;
    }

    public final void d(String str, int i, String str2, boolean z6) {
        this.f24978n.put(str, new C4295zc(str, i, str2, z6));
    }
}
