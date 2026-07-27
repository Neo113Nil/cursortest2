package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import k2.EnumC4631b;
import q2.C4927z0;
import q2.InterfaceC4921w0;

/* loaded from: classes2.dex */
public final class Hv {

    /* renamed from: a, reason: collision with root package name */
    public final ClientApi f25446a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f25447b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25448c;

    /* renamed from: d, reason: collision with root package name */
    public final C3602mu f25449d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f25450e;

    /* renamed from: f, reason: collision with root package name */
    public final Ev f25451f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f25452g;

    /* renamed from: h, reason: collision with root package name */
    public final q2.N f25453h;
    public final q2.P i;

    /* renamed from: j, reason: collision with root package name */
    public final Queue f25454j;

    /* renamed from: k, reason: collision with root package name */
    public final Iv f25455k;

    /* renamed from: l, reason: collision with root package name */
    public final String f25456l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f25457m;

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledExecutorService f25458n;

    /* renamed from: o, reason: collision with root package name */
    public final Iu f25459o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f25460p;

    /* renamed from: q, reason: collision with root package name */
    public Mt f25461q;

    /* renamed from: r, reason: collision with root package name */
    public final S2.a f25462r;

    /* renamed from: s, reason: collision with root package name */
    public final Nv f25463s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f25464t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Hv(ClientApi clientApi, Context context, int i, C3602mu c3602mu, q2.W0 w02, q2.N n9, ScheduledExecutorService scheduledExecutorService, Iu iu, Iv iv, S2.a aVar, int i4) {
        this("none", clientApi, context, i, c3602mu, w02, scheduledExecutorService, iu, iv, aVar, (Ev) null);
        this.f25464t = i4;
        this.f25453h = n9;
    }

    public final void a(final int i) {
        int size;
        Ev ev;
        boolean z8 = true;
        int i4 = 0;
        O2.w.b(i > 0);
        q2.W0 w02 = (q2.W0) this.f25450e.getAndUpdate(new UnaryOperator() { // from class: com.google.android.gms.internal.ads.Rv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                q2.W0 w03 = (q2.W0) obj;
                int i9 = i;
                if (i9 <= 0) {
                    i9 = w03.f39989w;
                }
                return new q2.W0(w03.f39986n, w03.f39987u, w03.f39988v, i9, w03.f39990x);
            }
        });
        EnumC4631b a9 = EnumC4631b.a(w02.f39987u);
        int i9 = w02.f39989w;
        Queue queue = this.f25454j;
        synchronized (queue) {
            try {
                size = queue.size();
                if (queue.size() > i) {
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31400B)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        while (i4 < i) {
                            Ov ov = (Ov) queue.poll();
                            if (ov != null) {
                                arrayList.add(ov);
                            }
                            i4++;
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                        i4 = arrayList.size();
                    }
                }
                z8 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8 && size > i4 && (ev = this.f25451f) != null) {
            int i10 = size - i4;
            if (i4 == 0) {
                i10--;
            }
            ev.c(this, i10);
        }
        Mt mt = this.f25461q;
        if (mt == null || a9 == null) {
            return;
        }
        this.f25462r.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        String str = ((q2.W0) this.f25450e.get()).f39986n;
        C2593Hm a10 = ((C3165eo) mt.f26393u).a();
        a10.r(NativeAdvancedJsUtils.f18064p, "cache_resize");
        a10.r("cs_ts", Long.toString(currentTimeMillis));
        a10.r("orig_ma", Integer.toString(i9));
        a10.r("max_ads", Integer.toString(i));
        a10.r(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, a9.name().toLowerCase(Locale.ENGLISH));
        a10.r("ad_unit_id", str);
        a10.r(com.anythink.expressad.f.a.b.aB, null);
        a10.r("pv", "1");
        a10.s();
    }

    public final void b(q2.d1 d1Var) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31442G)).booleanValue()) {
            Bundle bundle = d1Var.f40028V;
            bundle.putInt("plcs", t());
            bundle.putInt("plbs", s());
            bundle.putString("plid", this.f25456l);
        }
    }

    public final void c(C4927z0 c4927z0) {
        if (this.f25460p.get()) {
            t2.G.f40858l.post(new RunnableC3329hp(this, c4927z0));
        }
        this.f25457m.set(false);
        int i = c4927z0.f40122n;
        if (i != 1 && i != 8 && i != 10 && i != 11) {
            d(true);
            return;
        }
        AtomicReference atomicReference = this.f25450e;
        int i4 = ((q2.W0) atomicReference.get()).f39987u;
        String str = ((q2.W0) atomicReference.get()).f39986n;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(i4).length() + 26 + 61);
        sb.append("Preloading ");
        sb.append(i4);
        sb.append(", for adUnitId:");
        sb.append(str);
        sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
        String sb2 = sb.toString();
        int i9 = t2.C.f40822b;
        u2.i.e(sb2);
        this.f25452g.set(false);
        Ev ev = this.f25451f;
        if (ev != null) {
            ev.a(this);
        }
        String str2 = ((q2.W0) atomicReference.get()).f39986n;
        EnumC4631b q6 = q();
        Mt mt = this.f25461q;
        this.f25462r.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        int s3 = s();
        int t9 = t();
        String g9 = g();
        C2593Hm a9 = ((C3165eo) mt.f26393u).a();
        a9.r(NativeAdvancedJsUtils.f18064p, "pftla");
        a9.r("pftlat_ts", Long.toString(currentTimeMillis));
        a9.r("pftlaec", Integer.toString(c4927z0.f40122n));
        a9.r(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, q6 == null ? com.anythink.core.common.v.m.f16967e : q6.name().toLowerCase(Locale.ENGLISH));
        a9.r("max_ads", Integer.toString(s3));
        a9.r("cache_size", Integer.toString(t9));
        a9.r("ad_unit_id", str2);
        a9.r(com.anythink.expressad.f.a.b.aB, this.f25456l);
        a9.r("pv", g9);
        a9.s();
    }

    public final void d(boolean z8) {
        Iv iv = this.f25455k;
        Ev ev = this.f25451f;
        if (ev != null) {
            if (z8) {
                iv.c();
            }
            ev.a(this);
        } else {
            if (iv.d()) {
                return;
            }
            if (z8) {
                iv.c();
            }
            this.f25458n.schedule(new Pv(this, 0), iv.b(), TimeUnit.MILLISECONDS);
        }
    }

    public final void e() {
        boolean z8;
        int i;
        int i4;
        Queue queue = this.f25454j;
        synchronized (queue) {
            try {
                Iterator it = queue.iterator();
                z8 = false;
                i = 0;
                while (true) {
                    boolean z9 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Ov ov = (Ov) it.next();
                    ov.f26782c.getClass();
                    if (System.currentTimeMillis() < ov.f26781b + ov.f26783d) {
                        z9 = false;
                    }
                    if (z9) {
                        it.remove();
                        i++;
                    }
                }
                if (i > 0 && queue.isEmpty()) {
                    z8 = true;
                }
                i4 = (i <= 0 || !queue.isEmpty()) ? i : i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        Ev ev = this.f25451f;
        if (ev != null && i > 0) {
            ev.c(this, i4);
        }
        if (z8) {
            f();
        }
    }

    public final void f() {
        if (this.f25460p.get()) {
            t2.G.f40858l.post(new Pv(this, 1));
        }
        this.f25458n.execute(new Pv(this, 2));
    }

    public final String g() {
        return true != "none".equals(this.f25456l) ? "2" : "1";
    }

    public final AbstractC3300hD h(Context context) {
        ND l9;
        switch (this.f25464t) {
            case 0:
                InterfaceC3423jd interfaceC3423jd = (InterfaceC3423jd) ((AtomicReference) this.f25449d.f32776w).get();
                if (interfaceC3423jd == null) {
                    break;
                } else {
                    V2.b bVar = new V2.b(context);
                    q2.g1 b9 = q2.g1.b();
                    AtomicReference atomicReference = this.f25450e;
                    BinderC3655nt binderC3655nt = (BinderC3655nt) this.f25446a.W2(bVar, b9, ((q2.W0) atomicReference.get()).f39986n, interfaceC3423jd, this.f25448c);
                    if (binderC3655nt == null) {
                        break;
                    } else {
                        ZD zd = new ZD();
                        try {
                            b(((q2.W0) atomicReference.get()).f39988v);
                            Ev ev = this.f25451f;
                            if (ev != null) {
                                C3151ea c3151ea = AbstractC3368ia.Y;
                                q2.r rVar = q2.r.f40116e;
                                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                                    binderC3655nt.f33062y.f32209A.set(new Jv(ev, this.f25458n, ((Long) rVar.f40119c.a(AbstractC3368ia.f31624b0)).longValue(), this));
                                }
                            }
                            q2.W0 w02 = (q2.W0) atomicReference.get();
                            C2593Hm c2593Hm = new C2593Hm(this, zd, 21, false);
                            String str = w02.f39986n;
                            G8 g82 = new G8();
                            g82.f25105v = c2593Hm;
                            g82.f25104u = str;
                            binderC3655nt.W1(g82);
                            binderC3655nt.f0(((q2.W0) atomicReference.get()).f39988v);
                            break;
                        } catch (RemoteException e6) {
                            u2.i.g("Failed to load app open ad.", e6);
                            return C3686oN.l(new Fv());
                        }
                    }
                }
            case 1:
                InterfaceC3423jd interfaceC3423jd2 = (InterfaceC3423jd) ((AtomicReference) this.f25449d.f32776w).get();
                if (interfaceC3423jd2 == null) {
                    break;
                } else {
                    V2.b bVar2 = new V2.b(context);
                    q2.g1 g1Var = new q2.g1();
                    AtomicReference atomicReference2 = this.f25450e;
                    Ir ir = (Ir) this.f25446a.M2(bVar2, g1Var, ((q2.W0) atomicReference2.get()).f39986n, interfaceC3423jd2, this.f25448c);
                    if (ir == null) {
                        break;
                    } else {
                        ZD zd2 = new ZD();
                        try {
                            b(((q2.W0) atomicReference2.get()).f39988v);
                            Ev ev2 = this.f25451f;
                            if (ev2 != null) {
                                C3151ea c3151ea2 = AbstractC3368ia.Y;
                                q2.r rVar2 = q2.r.f40116e;
                                if (((Boolean) rVar2.f40119c.a(c3151ea2)).booleanValue()) {
                                    ir.f25641y.f25034B.set(new Jv(ev2, this.f25458n, ((Long) rVar2.f40119c.a(AbstractC3368ia.f31604Z)).longValue(), this));
                                }
                            }
                            q2.d1 d1Var = ((q2.W0) atomicReference2.get()).f39988v;
                            C2593Hm c2593Hm2 = new C2593Hm(this, zd2, 21, false);
                            String str2 = ((q2.W0) atomicReference2.get()).f39986n;
                            Kv kv = new Kv();
                            kv.f26064n = ir;
                            kv.f26065u = c2593Hm2;
                            kv.f26066v = str2;
                            ir.C2(d1Var, kv);
                            break;
                        } catch (RemoteException e9) {
                            u2.i.g("Failed to load interstitial ad.", e9);
                            return C3686oN.l(new Fv());
                        }
                    }
                }
            default:
                InterfaceC3423jd interfaceC3423jd3 = (InterfaceC3423jd) ((AtomicReference) this.f25449d.f32776w).get();
                if (interfaceC3423jd3 == null) {
                    l9 = C3686oN.l(new Fv());
                } else {
                    V2.b bVar3 = new V2.b(context);
                    AtomicReference atomicReference3 = this.f25450e;
                    Rt rt = (Rt) this.f25446a.z1(bVar3, ((q2.W0) atomicReference3.get()).f39986n, interfaceC3423jd3, this.f25448c);
                    if (rt == null) {
                        l9 = C3686oN.l(new Fv());
                    } else {
                        ZD zd3 = new ZD();
                        try {
                            b(((q2.W0) atomicReference3.get()).f39988v);
                            Ev ev3 = this.f25451f;
                            if (ev3 != null) {
                                C3151ea c3151ea3 = AbstractC3368ia.Y;
                                q2.r rVar3 = q2.r.f40116e;
                                if (((Boolean) rVar3.f40119c.a(c3151ea3)).booleanValue()) {
                                    try {
                                    } catch (RemoteException unused) {
                                        u2.i.f("Failed to load rewarded ad.");
                                        return C3686oN.l(new Fv());
                                    }
                                    try {
                                        rt.f27438v.f25838B.set(new Jv(ev3, this.f25458n, ((Long) rVar3.f40119c.a(AbstractC3368ia.f31614a0)).longValue(), this));
                                        q2.d1 d1Var2 = ((q2.W0) atomicReference3.get()).f39988v;
                                        C2593Hm c2593Hm3 = new C2593Hm(this, zd3, 21, false);
                                        String str3 = ((q2.W0) atomicReference3.get()).f39986n;
                                        Uv uv = new Uv();
                                        uv.f28189n = rt;
                                        uv.f28190u = c2593Hm3;
                                        uv.f28191v = str3;
                                        rt.f2(d1Var2, uv);
                                        break;
                                    } catch (RemoteException unused2) {
                                        u2.i.f("Failed to load rewarded ad.");
                                        return C3686oN.l(new Fv());
                                    }
                                }
                            }
                            q2.d1 d1Var22 = ((q2.W0) atomicReference3.get()).f39988v;
                            C2593Hm c2593Hm32 = new C2593Hm(this, zd3, 21, false);
                            String str32 = ((q2.W0) atomicReference3.get()).f39986n;
                            Uv uv2 = new Uv();
                            uv2.f28189n = rt;
                            uv2.f28190u = c2593Hm32;
                            uv2.f28191v = str32;
                            rt.f2(d1Var22, uv2);
                        } catch (RemoteException unused3) {
                        }
                    }
                }
                break;
        }
        return C3686oN.l(new Fv());
    }

    public final long i() {
        switch (this.f25464t) {
            case 0:
                return ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31587X)).longValue();
            case 1:
                return ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31569V)).longValue();
            default:
                return ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31578W)).longValue();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000e, code lost:
    
        r1 = t2.C.f40822b;
        u2.i.b("Failed to get response info for the rewarded ad.", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001e, code lost:
    
        r1 = t2.C.f40822b;
        u2.i.b("Failed to get response info for  the interstitial ad.", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        r1 = t2.C.f40822b;
        u2.i.b("Failed to get response info for the app open ad.", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000d, code lost:
    
        r3 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ InterfaceC4921w0 j(Object obj) {
        switch (this.f25464t) {
        }
        return null;
    }

    public final void k() {
        AtomicBoolean atomicBoolean = this.f25457m;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!this.f25452g.get() || t() >= ((q2.W0) this.f25450e.get()).f39989w) {
                atomicBoolean.set(false);
            } else {
                this.f25458n.submit(new Pv(this, 5, false));
            }
        }
    }

    public final boolean l() {
        boolean isEmpty;
        C3151ea c3151ea = AbstractC3368ia.f31509O;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            this.f25455k.a();
        }
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31450H)).booleanValue() && this.f25451f == null) {
            v();
        } else {
            e();
        }
        Queue queue = this.f25454j;
        synchronized (queue) {
            isEmpty = queue.isEmpty();
        }
        return !isEmpty;
    }

    public final Object m() {
        final Ov ov;
        final boolean z8;
        final Ov ov2;
        Queue queue = this.f25454j;
        final int t9 = t();
        synchronized (queue) {
            try {
                ov = (Ov) queue.poll();
                boolean z9 = false;
                if (ov != null && queue.isEmpty()) {
                    z9 = true;
                }
                z8 = z9;
                ov2 = (ov == null || queue.isEmpty()) ? null : (Ov) queue.peek();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f25462r.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        final int s3 = s();
        final int t10 = t();
        this.f25458n.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.Qv
            /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
            /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                q2.r rVar;
                Ev ev;
                Hv hv = Hv.this;
                int i = t9;
                Ov ov3 = ov;
                Ov ov4 = ov2;
                long j9 = currentTimeMillis;
                int i4 = s3;
                int i9 = t10;
                boolean z10 = z8;
                hv.getClass();
                C3151ea c3151ea = AbstractC3368ia.f31526Q;
                q2.r rVar2 = q2.r.f40116e;
                if (((Boolean) rVar2.f40119c.a(c3151ea)).booleanValue()) {
                    if (!((Boolean) rVar2.f40119c.a(AbstractC3368ia.f31518P)).booleanValue()) {
                        hv.f25455k.a();
                    } else if (i == 1) {
                        hv.f25455k.a();
                    }
                }
                if (ov3 != null && ov4 != null) {
                    EnumC4631b a9 = EnumC4631b.a(((q2.W0) hv.f25450e.get()).f39987u);
                    InterfaceC4921w0 j10 = hv.j(ov3.f26780a);
                    String str = !(j10 instanceof BinderC3754pk) ? null : ((BinderC3754pk) j10).f33487w;
                    if (a9 != null && str != null && ov4.f26781b < ov3.f26781b) {
                        rVar = rVar2;
                        hv.f25461q.y("poll_ad", "psvroc_ts", j9, i4, i9, str, hv.f25463s, hv.g());
                        ev = hv.f25451f;
                        if (ev != null) {
                            long i10 = hv.i();
                            if (i10 < 0) {
                                i10 = ((Long) rVar.f40119c.a(AbstractC3368ia.f31561U)).longValue();
                            }
                            if (i10 > 0) {
                                hv.f25458n.schedule(new Pv(hv, 0), i10, TimeUnit.MILLISECONDS);
                            } else {
                                hv.v();
                            }
                        } else if (!ev.i(hv)) {
                            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Y)).booleanValue()) {
                                ev.h(hv);
                            } else {
                                long i11 = hv.i();
                                if (i11 < 0) {
                                    i11 = ((Long) rVar.f40119c.a(AbstractC3368ia.f31561U)).longValue();
                                }
                                if (i11 > 0) {
                                    ev.h(hv);
                                    synchronized (ev) {
                                        ev.f24850c = ev.f24853f.schedule(new Dv(ev, 4), i11, TimeUnit.MILLISECONDS);
                                    }
                                } else {
                                    ev.a(hv);
                                }
                            }
                        }
                        if (z10) {
                            return;
                        }
                        hv.f();
                        return;
                    }
                }
                rVar = rVar2;
                ev = hv.f25451f;
                if (ev != null) {
                }
                if (z10) {
                }
            }
        });
        if (ov == null) {
            return null;
        }
        return ov.f26780a;
    }

    public final void n() {
        this.f25452g.set(true);
        this.f25460p.set(true);
        Ev ev = this.f25451f;
        if (ev != null) {
            ev.c(this, 0);
        } else {
            this.f25458n.submit(new Pv(this, 0));
        }
    }

    public final String o() {
        Ov ov;
        Queue queue = this.f25454j;
        synchronized (queue) {
            ov = (Ov) queue.peek();
        }
        Object obj = ov == null ? null : ov.f26780a;
        InterfaceC4921w0 j9 = obj == null ? null : j(obj);
        if (j9 instanceof BinderC3754pk) {
            return ((BinderC3754pk) j9).f33487w;
        }
        return null;
    }

    public final void p(int i) {
        O2.w.b(i >= 5);
        Iv iv = this.f25455k;
        synchronized (iv) {
            O2.w.b(i > 0);
            iv.f25658d = i;
        }
    }

    public final EnumC4631b q() {
        return EnumC4631b.a(((q2.W0) this.f25450e.get()).f39987u);
    }

    public final String r() {
        return ((q2.W0) this.f25450e.get()).f39986n;
    }

    public final int s() {
        return ((q2.W0) this.f25450e.get()).f39989w;
    }

    public final int t() {
        int size;
        Queue queue = this.f25454j;
        synchronized (queue) {
            size = queue.size();
        }
        return size;
    }

    public final boolean u() {
        long currentTimeMillis;
        long j9;
        if (!this.f25452g.get() || this.f25457m.get() || t() >= s()) {
            return false;
        }
        Iv iv = this.f25455k;
        synchronized (iv) {
            iv.f25660f.getClass();
            currentTimeMillis = System.currentTimeMillis();
            j9 = iv.f25659e;
        }
        return currentTimeMillis >= j9 && !iv.d();
    }

    public final void v() {
        e();
        AtomicBoolean atomicBoolean = this.f25457m;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!this.f25452g.get() || t() >= ((q2.W0) this.f25450e.get()).f39989w) {
                atomicBoolean.set(false);
            } else {
                w();
            }
        }
    }

    public final void w() {
        AbstractC3300hD h9;
        Activity m8 = p2.j.f39798C.f39807g.m();
        if (m8 == null) {
            String valueOf = String.valueOf(((q2.W0) this.f25450e.get()).f39986n);
            int i = t2.C.f40822b;
            u2.i.f("Empty activity context at preloading: ".concat(valueOf));
            h9 = h(this.f25447b);
        } else {
            h9 = h(m8);
        }
        h9.c(new MD(0, h9, new Mu(this)), this.f25458n);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Hv(String str, ClientApi clientApi, Context context, int i, C3602mu c3602mu, q2.W0 w02, q2.P p6, ScheduledExecutorService scheduledExecutorService, Iu iu, Iv iv, S2.a aVar, Ev ev, int i4) {
        this(str, clientApi, context, i, c3602mu, w02, scheduledExecutorService, iu, iv, aVar, ev);
        this.f25464t = i4;
        this.i = p6;
    }

    public Hv(String str, ClientApi clientApi, Context context, int i, C3602mu c3602mu, q2.W0 w02, ScheduledExecutorService scheduledExecutorService, Iu iu, Iv iv, S2.a aVar, Ev ev) {
        Queue priorityQueue;
        this.f25456l = str;
        this.f25446a = clientApi;
        this.f25447b = context;
        this.f25448c = i;
        this.f25449d = c3602mu;
        AtomicReference atomicReference = new AtomicReference(w02);
        this.f25450e = atomicReference;
        int max = Math.max(1, w02.f39989w);
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31669g0)).booleanValue()) {
            priorityQueue = new Tv();
        } else {
            priorityQueue = new PriorityQueue(max, C2959b.f29363H);
        }
        this.f25454j = priorityQueue;
        this.f25452g = new AtomicBoolean(true);
        this.f25457m = new AtomicBoolean(false);
        this.f25458n = scheduledExecutorService;
        this.f25459o = iu;
        this.f25455k = iv;
        this.f25460p = new AtomicBoolean(true);
        this.f25462r = aVar;
        int i4 = 17;
        C3602mu c3602mu2 = new C3602mu(i4, w02.f39986n, EnumC4631b.a(((q2.W0) atomicReference.get()).f39987u));
        c3602mu2.f32776w = str;
        this.f25463s = new Nv(c3602mu2);
        this.f25451f = ev;
    }
}
