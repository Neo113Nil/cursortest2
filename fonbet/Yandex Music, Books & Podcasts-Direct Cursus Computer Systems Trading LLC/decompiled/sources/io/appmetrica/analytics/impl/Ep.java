package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.c5b;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.FinalConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Ep {
    public final Fp a;
    public volatile NetworkTask b;

    public Ep(@NotNull Fp fp) {
        this.a = fp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r5 == null) goto L15;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0385jp a(@NotNull C0328hp c0328hp, @NotNull C0270fp c0270fp, long j) {
        String str;
        String a = Jp.a(c0270fp.h);
        Map map = c0270fp.i.a;
        String str2 = c0328hp.j;
        String str3 = e().l;
        if (!Jp.a(Jp.a(str2))) {
            str2 = Jp.a(Jp.a(str3)) ? str3 : null;
        }
        String str4 = e().a;
        if (str4 != null) {
            str = StringsKt.U(str4) ? null : str4;
        }
        str = c0328hp.h;
        C0472mp c0472mp = new C0472mp(c0328hp.b);
        String str5 = c0328hp.i;
        c0472mp.o = this.a.i.currentTimeSeconds();
        c0472mp.a = e().d;
        c0472mp.c = c0328hp.d;
        c0472mp.f = c0328hp.c;
        c0472mp.g = c0270fp.e;
        c0472mp.b = c0328hp.e;
        c0472mp.d = c0328hp.f;
        c0472mp.e = c0328hp.g;
        c0472mp.h = c0328hp.n;
        c0472mp.i = c0328hp.o;
        c0472mp.j = str2;
        c0472mp.k = a;
        this.a.k.getClass();
        HashMap a2 = Jp.a(str2);
        c0472mp.q = AbstractC0734vr.a(map) ? AbstractC0734vr.a((Map) a2) : a2.equals(map);
        c0472mp.l = Jp.a(map);
        c0472mp.r = c0328hp.m;
        c0472mp.n = c0328hp.k;
        c0472mp.s = c0328hp.p;
        c0472mp.p = true;
        c0472mp.t = j;
        C0270fp d = d();
        if (d.n == 0) {
            d.n = j;
        }
        c0472mp.u = d.n;
        c0472mp.v = false;
        c0472mp.w = c0328hp.q;
        c0472mp.x = c0328hp.r;
        c0472mp.y = c0328hp.s;
        c0472mp.z = c0328hp.t;
        c0472mp.A = c0328hp.u;
        c0472mp.B = c0328hp.v;
        return new C0385jp(str, str5, new C0501np(c0472mp));
    }

    public final synchronized void b(C0385jp c0385jp) {
        this.a.l.a(c0385jp);
        C0356ip c0356ip = this.a.g;
        c0356ip.b.a(c0385jp.a);
        c0356ip.b.b(c0385jp.b);
        c0356ip.a.save(c0385jp.c);
        this.a.e.a(c0385jp);
    }

    public final synchronized NetworkTask c() {
        NetworkTask networkTask;
        try {
            try {
                if (g()) {
                    networkTask = this.b;
                    if (networkTask != null && !networkTask.isRemoved()) {
                    }
                    C0270fp d = d();
                    C0579qg c0579qg = C0579qg.a;
                    C0126ap c0126ap = new C0126ap(new Dg(), C0747wb.I.p());
                    FinalConfigProvider finalConfigProvider = new FinalConfigProvider(d);
                    try {
                        NetworkTask networkTask2 = new NetworkTask(new SynchronizedBlockingExecutor(), new C0309h6(this.a.a), new AllHostsExponentialBackoffPolicy(C0579qg.a.a(EnumC0521og.STARTUP)), new Cp(this, new Uo(), new FullUrlFormer(c0126ap, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), c5b.a, C0579qg.c);
                        this.b = networkTask2;
                        networkTask = networkTask2;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } else {
                    networkTask = null;
                }
                return networkTask;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @NotNull
    public final C0270fp d() {
        return (C0270fp) this.a.l.a();
    }

    @NotNull
    public final C0385jp e() {
        C0385jp c0385jp;
        Lo lo = this.a.l;
        synchronized (lo) {
            c0385jp = lo.c.a;
        }
        return c0385jp;
    }

    public final void f() {
        C0385jp c0385jp;
        Lo lo = this.a.l;
        synchronized (lo) {
            c0385jp = lo.c.a;
        }
        C0501np c0501np = c0385jp.c;
        C0472mp a = c0501np.a(c0501np.m);
        String str = c0385jp.a;
        String str2 = c0385jp.b;
        zr zrVar = this.a.n;
        String str3 = c0385jp.d;
        zrVar.getClass();
        if (!zr.a(str3)) {
            a.a = this.a.m.a().id;
        }
        String str4 = c0385jp.a;
        if (str4 == null || str4.length() == 0) {
            str = this.a.h.a();
            str2 = "";
        }
        List<String> list = this.a.c.e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        a.g = list;
        C0385jp c0385jp2 = new C0385jp(str, str2, new C0501np(a));
        b(c0385jp2);
        a(c0385jp2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r0 == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:9:0x0010, B:11:0x001b, B:16:0x0035, B:18:0x003d, B:20:0x0045, B:23:0x004e), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean g() {
        boolean z;
        try {
            boolean z2 = false;
            if (C0747wb.I.h().isRestrictedForSdk()) {
                return false;
            }
            C0385jp e = e();
            Set set = AbstractC0299gp.a;
            boolean z3 = true;
            if (!e.x) {
                if (AbstractC0299gp.b.currentTimeSeconds() <= e.p + e.A.a) {
                    z = false;
                    if (!z) {
                        if (AbstractC0299gp.a(e.d) && AbstractC0299gp.a(e.a) && AbstractC0299gp.a(e.b)) {
                            z2 = true;
                        }
                        z = !z2;
                        C0595r4 c0595r4 = this.a.k;
                        Map map = d().h;
                        C0509o4 c0509o4 = this.a.j;
                        c0595r4.getClass();
                        boolean a = C0595r4.a(map, e, c0509o4);
                        if (z2) {
                        }
                    }
                    z3 = z;
                    return z3;
                }
            }
            z = true;
            if (!z) {
            }
            z3 = z;
            return z3;
        } finally {
        }
    }

    public final synchronized void h() {
        this.b = null;
    }

    @NotNull
    public final Context b() {
        return this.a.a;
    }

    @NotNull
    public final H5 a() {
        return this.a.f;
    }

    public final synchronized boolean a(List<String> list, @NotNull Map<String, String> map) {
        return !AbstractC0299gp.a(e(), list, map, new Dp(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:11:0x0037, B:12:0x003e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NotNull C0328hp c0328hp, @NotNull C0270fp c0270fp, Map<String, ? extends List<String>> map) {
        Long l;
        C0385jp a;
        synchronized (this) {
            if (!AbstractC0734vr.a((Map) map)) {
                List list = (List) CollectionUtils.getFromMapIgnoreCase(map, "Date");
                if (!AbstractC0734vr.a((Collection) list)) {
                    try {
                        l = Long.valueOf(new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US).parse((String) list.get(0)).getTime());
                    } catch (Throwable unused) {
                    }
                    long longValue = l == null ? l.longValue() : 0L;
                    Um.a.a(longValue, c0328hp.l);
                    a = a(c0328hp, c0270fp, longValue);
                    h();
                    b(a);
                }
            }
            l = null;
            if (l == null) {
            }
            Um.a.a(longValue, c0328hp.l);
            a = a(c0328hp, c0270fp, longValue);
            h();
            b(a);
        }
        a(a);
    }

    public final void a(C0385jp c0385jp) {
        ArrayList arrayList;
        Fp fp = this.a;
        Io io2 = fp.d;
        String str = fp.b;
        synchronized (io2.a.b) {
            try {
                Ko ko = io2.a;
                ko.c = c0385jp;
                Collection collection = (Collection) ko.a.a.get(str);
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((To) it.next()).a(c0385jp);
        }
    }

    public final void a(@NotNull Mo mo) {
        synchronized (this) {
            this.b = null;
        }
        Fp fp = this.a;
        fp.d.a(fp.f.a, mo, e());
    }

    public final synchronized void a(@NotNull C0212dp c0212dp) {
        try {
            this.a.l.a(c0212dp);
            C0270fp d = d();
            if (d.k) {
                List list = d.j;
                if (list != null && !list.isEmpty()) {
                    if (!AbstractC0734vr.a(list, d.e)) {
                        C0385jp e = e();
                        C0501np c0501np = e.c;
                        C0472mp a = c0501np.a(c0501np.m);
                        String str = e.a;
                        String str2 = e.b;
                        a.g = list;
                        C0385jp c0385jp = new C0385jp(str, str2, new C0501np(a));
                        b(c0385jp);
                        a(c0385jp);
                    }
                }
                if (d.e != null && (!r5.isEmpty())) {
                    C0385jp e2 = e();
                    C0501np c0501np2 = e2.c;
                    C0472mp a2 = c0501np2.a(c0501np2.m);
                    String str3 = e2.a;
                    String str4 = e2.b;
                    a2.g = null;
                    C0385jp c0385jp2 = new C0385jp(str3, str4, new C0501np(a2));
                    b(c0385jp2);
                    a(c0385jp2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
