package io.appmetrica.analytics.impl;

import android.content.Context;
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

/* loaded from: classes.dex */
public final class Am {

    /* renamed from: a, reason: collision with root package name */
    public final Bm f4163a;

    /* renamed from: b, reason: collision with root package name */
    public volatile NetworkTask f4164b;

    public Am(Bm bm) {
        this.f4163a = bm;
    }

    public final Context b() {
        return this.f4163a.f4225a;
    }

    public final synchronized NetworkTask c() {
        NetworkTask networkTask;
        try {
            if (g()) {
                networkTask = this.f4164b;
                if (networkTask != null) {
                    if (networkTask.isRemoved()) {
                    }
                }
                C0312bm d2 = d();
                Vd vd = Vd.f5231a;
                Xl xl = new Xl(new C0433ge(), C0610na.f6575I.p());
                FinalConfigProvider finalConfigProvider = new FinalConfigProvider(d2);
                networkTask = new NetworkTask(new SynchronizedBlockingExecutor(), new C0657p5(this.f4163a.f4225a), new AllHostsExponentialBackoffPolicy(Vd.f5231a.a(Td.STARTUP)), new C0907ym(this, new Rl(), new FullUrlFormer(xl, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), i1.r.f3416a, Vd.f5233c);
                this.f4164b = networkTask;
            } else {
                networkTask = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return networkTask;
    }

    public final C0312bm d() {
        return (C0312bm) this.f4163a.f4236l.a();
    }

    public final C0415fm e() {
        C0415fm c0415fm;
        Il il = this.f4163a.f4236l;
        synchronized (il) {
            c0415fm = il.f6661c.f4671a;
        }
        return c0415fm;
    }

    public final void f() {
        C0415fm c0415fm;
        Il il = this.f4163a.f4236l;
        synchronized (il) {
            c0415fm = il.f6661c.f4671a;
        }
        C0518jm c0518jm = c0415fm.f6004c;
        C0492im a2 = c0518jm.a(c0518jm.f6318m);
        String str = c0415fm.f6002a;
        String str2 = c0415fm.f6003b;
        C0676po c0676po = this.f4163a.f4238n;
        String str3 = c0415fm.f6005d;
        c0676po.getClass();
        if (!C0676po.a(str3)) {
            a2.f6203a = this.f4163a.f4237m.a().id;
        }
        String str4 = c0415fm.f6002a;
        if (str4 == null || str4.length() == 0) {
            str = this.f4163a.f4232h.a();
            str2 = "";
        }
        List<String> list = this.f4163a.f4227c.f5531e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        a2.f6209g = list;
        C0415fm c0415fm2 = new C0415fm(str, str2, new C0518jm(a2));
        b(c0415fm2);
        a(c0415fm2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r1 == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x0002, B:10:0x0011, B:12:0x001b, B:17:0x0035, B:19:0x003d, B:21:0x0045, B:24:0x004e), top: B:3:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean g() {
        boolean z2;
        boolean z3 = true;
        synchronized (this) {
            try {
                boolean z4 = false;
                if (C0610na.f6575I.h().isRestrictedForSdk()) {
                    return false;
                }
                C0415fm e2 = e();
                Set set = AbstractC0338cm.f5767a;
                if (!e2.f6023w) {
                    if (AbstractC0338cm.f5768b.currentTimeSeconds() <= e2.f6016o + e2.f6026z.f4275a) {
                        z2 = false;
                        if (!z2) {
                            if (AbstractC0338cm.a(e2.f6005d) && AbstractC0338cm.a(e2.f6002a) && AbstractC0338cm.a(e2.f6003b)) {
                                z4 = true;
                            }
                            z2 = !z4;
                            C3 c3 = this.f4163a.f4235k;
                            Map map = d().f5691h;
                            C0914z3 c0914z3 = this.f4163a.f4234j;
                            c3.getClass();
                            boolean a2 = C3.a(map, e2, c0914z3);
                            if (z4) {
                            }
                        }
                        z3 = z2;
                        return z3;
                    }
                }
                z2 = true;
                if (!z2) {
                }
                z3 = z2;
                return z3;
            } finally {
            }
        }
    }

    public final synchronized void h() {
        this.f4164b = null;
    }

    public final Q4 a() {
        return this.f4163a.f4230f;
    }

    public final synchronized void b(C0415fm c0415fm) {
        this.f4163a.f4236l.a(c0415fm);
        C0389em c0389em = this.f4163a.f4231g;
        c0389em.f5954b.a(c0415fm.f6002a);
        c0389em.f5954b.b(c0415fm.f6003b);
        c0389em.f5953a.save(c0415fm.f6004c);
        this.f4163a.f4229e.a(c0415fm);
    }

    public final synchronized boolean a(List<String> list, Map<String, String> map) {
        return !AbstractC0338cm.a(e(), list, map, new C0933zm(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r5 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0415fm a(C0364dm c0364dm, C0312bm c0312bm, long j2) {
        String str;
        boolean equals;
        String a2 = Fm.a(c0312bm.f5691h);
        Map map = c0312bm.f5692i.f6806a;
        String str2 = c0364dm.f5833j;
        String str3 = e().f6012k;
        if (!Fm.a(Fm.a(str2))) {
            str2 = Fm.a(Fm.a(str3)) ? str3 : null;
        }
        String str4 = e().f6002a;
        if (str4 != null) {
            str = z1.g.a0(str4) ? null : str4;
        }
        str = c0364dm.f5831h;
        C0492im c0492im = new C0492im(c0364dm.f5825b);
        String str5 = c0364dm.f5832i;
        c0492im.f6217o = this.f4163a.f4233i.currentTimeSeconds();
        c0492im.f6203a = e().f6005d;
        c0492im.f6205c = c0364dm.f5827d;
        c0492im.f6208f = c0364dm.f5826c;
        c0492im.f6209g = c0312bm.f5688e;
        c0492im.f6204b = c0364dm.f5828e;
        c0492im.f6206d = c0364dm.f5829f;
        c0492im.f6207e = c0364dm.f5830g;
        c0492im.f6210h = c0364dm.f5837n;
        c0492im.f6211i = c0364dm.f5838o;
        c0492im.f6212j = str2;
        c0492im.f6213k = a2;
        this.f4163a.f4235k.getClass();
        HashMap a3 = Fm.a(str2);
        if (AbstractC0572lo.a(map)) {
            equals = AbstractC0572lo.a((Map) a3);
        } else {
            equals = a3.equals(map);
        }
        c0492im.f6219q = equals;
        c0492im.f6214l = Fm.a(map);
        c0492im.f6220r = c0364dm.f5836m;
        c0492im.f6216n = c0364dm.f5834k;
        c0492im.f6221s = c0364dm.f5839p;
        c0492im.f6218p = true;
        c0492im.t = j2;
        C0312bm d2 = d();
        if (d2.f5697n == 0) {
            d2.f5697n = j2;
        }
        c0492im.f6222u = d2.f5697n;
        c0492im.f6223v = false;
        c0492im.f6224w = c0364dm.f5840q;
        c0492im.f6225x = c0364dm.f5841r;
        c0492im.f6226y = c0364dm.f5842s;
        c0492im.f6227z = c0364dm.t;
        c0492im.f6201A = c0364dm.f5843u;
        c0492im.f6202B = c0364dm.f5844v;
        return new C0415fm(str, str5, new C0518jm(c0492im));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:11:0x0037, B:12:0x003e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0364dm c0364dm, C0312bm c0312bm, Map<String, ? extends List<String>> map) {
        Long l2;
        C0415fm a2;
        synchronized (this) {
            if (!AbstractC0572lo.a((Map) map)) {
                List list = (List) CollectionUtils.getFromMapIgnoreCase(map, "Date");
                if (!AbstractC0572lo.a((Collection) list)) {
                    try {
                        l2 = Long.valueOf(new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US).parse((String) list.get(0)).getTime());
                    } catch (Throwable unused) {
                    }
                    long longValue = l2 == null ? l2.longValue() : 0L;
                    Wj.f5313a.a(longValue, c0364dm.f5835l);
                    a2 = a(c0364dm, c0312bm, longValue);
                    h();
                    b(a2);
                }
            }
            l2 = null;
            if (l2 == null) {
            }
            Wj.f5313a.a(longValue, c0364dm.f5835l);
            a2 = a(c0364dm, c0312bm, longValue);
            h();
            b(a2);
        }
        a(a2);
    }

    public final void a(C0415fm c0415fm) {
        ArrayList arrayList;
        Bm bm = this.f4163a;
        Fl fl = bm.f4228d;
        String str = bm.f4226b;
        synchronized (fl.f4397a.f4486b) {
            try {
                Hl hl = fl.f4397a;
                hl.f4487c = c0415fm;
                Collection collection = (Collection) hl.f4485a.f6733a.get(str);
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
            ((Ql) it.next()).a(c0415fm);
        }
    }

    public final void a(Jl jl) {
        synchronized (this) {
            this.f4164b = null;
        }
        Bm bm = this.f4163a;
        bm.f4228d.a(bm.f4230f.f4950a, jl, e());
    }

    public final synchronized void a(Zl zl) {
        try {
            this.f4163a.f4236l.a(zl);
            C0312bm d2 = d();
            if (d2.f5694k) {
                List list = d2.f5693j;
                if (list != null && !list.isEmpty()) {
                    if (!AbstractC0572lo.a(list, d2.f5688e)) {
                        C0415fm e2 = e();
                        C0518jm c0518jm = e2.f6004c;
                        C0492im a2 = c0518jm.a(c0518jm.f6318m);
                        String str = e2.f6002a;
                        String str2 = e2.f6003b;
                        a2.f6209g = list;
                        C0415fm c0415fm = new C0415fm(str, str2, new C0518jm(a2));
                        b(c0415fm);
                        a(c0415fm);
                    }
                }
                if (d2.f5688e != null && (!r5.isEmpty())) {
                    C0415fm e3 = e();
                    C0518jm c0518jm2 = e3.f6004c;
                    C0492im a3 = c0518jm2.a(c0518jm2.f6318m);
                    String str3 = e3.f6002a;
                    String str4 = e3.f6003b;
                    a3.f6209g = null;
                    C0415fm c0415fm2 = new C0415fm(str3, str4, new C0518jm(a3));
                    b(c0415fm2);
                    a(c0415fm2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
