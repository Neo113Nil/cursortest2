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
import r2.C4906k;
import s2.C4969z0;
import s2.InterfaceC4963w0;

/* loaded from: classes2.dex */
public final class Fv {

    /* renamed from: a, reason: collision with root package name */
    public final ClientApi f25656a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f25657b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25658c;

    /* renamed from: d, reason: collision with root package name */
    public final C3504ku f25659d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f25660e;

    /* renamed from: f, reason: collision with root package name */
    public final Cv f25661f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f25662g;

    /* renamed from: h, reason: collision with root package name */
    public final s2.N f25663h;
    public final s2.P i;

    /* renamed from: j, reason: collision with root package name */
    public final Queue f25664j;

    /* renamed from: k, reason: collision with root package name */
    public final Gv f25665k;

    /* renamed from: l, reason: collision with root package name */
    public final String f25666l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f25667m;

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledExecutorService f25668n;

    /* renamed from: o, reason: collision with root package name */
    public final Gu f25669o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f25670p;

    /* renamed from: q, reason: collision with root package name */
    public C3557lt f25671q;

    /* renamed from: r, reason: collision with root package name */
    public final V2.a f25672r;

    /* renamed from: s, reason: collision with root package name */
    public final Lv f25673s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f25674t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Fv(ClientApi clientApi, Context context, int i, C3504ku c3504ku, s2.V0 v02, s2.N n9, ScheduledExecutorService scheduledExecutorService, Gu gu, Gv gv, V2.a aVar, int i4) {
        this("none", clientApi, context, i, c3504ku, v02, scheduledExecutorService, gu, gv, aVar, (Cv) null);
        this.f25674t = i4;
        this.f25663h = n9;
    }

    public final void a(final int i) {
        int size;
        Cv cv;
        boolean z6 = true;
        int i4 = 0;
        R2.w.b(i > 0);
        s2.V0 v02 = (s2.V0) this.f25660e.getAndUpdate(new UnaryOperator() { // from class: com.google.android.gms.internal.ads.Pv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s2.V0 v03 = (s2.V0) obj;
                int i6 = i;
                if (i6 <= 0) {
                    i6 = v03.f40379w;
                }
                return new s2.V0(v03.f40376n, v03.f40377u, v03.f40378v, i6, v03.f40380x);
            }
        });
        m2.b a9 = m2.b.a(v02.f40377u);
        int i6 = v02.f40379w;
        Queue queue = this.f25664j;
        synchronized (queue) {
            try {
                size = queue.size();
                if (queue.size() > i) {
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32759B)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        while (i4 < i) {
                            Mv mv = (Mv) queue.poll();
                            if (mv != null) {
                                arrayList.add(mv);
                            }
                            i4++;
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                        i4 = arrayList.size();
                    }
                }
                z6 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6 && size > i4 && (cv = this.f25661f) != null) {
            int i9 = size - i4;
            if (i4 == 0) {
                i9--;
            }
            cv.c(this, i9);
        }
        C3557lt c3557lt = this.f25671q;
        if (c3557lt == null || a9 == null) {
            return;
        }
        this.f25672r.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        String str = ((s2.V0) this.f25660e.get()).f40376n;
        S0.e a10 = ((C3230fo) c3557lt.f32643u).a();
        a10.M(NativeAdvancedJsUtils.f18693p, "cache_resize");
        a10.M("cs_ts", Long.toString(currentTimeMillis));
        a10.M("orig_ma", Integer.toString(i6));
        a10.M("max_ads", Integer.toString(i));
        a10.M(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, a9.name().toLowerCase(Locale.ENGLISH));
        a10.M("ad_unit_id", str);
        a10.M(com.anythink.expressad.f.a.b.aB, null);
        a10.M("pv", "1");
        a10.N();
    }

    public final void b(s2.c1 c1Var) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32803G)).booleanValue()) {
            Bundle bundle = c1Var.f40416V;
            bundle.putInt("plcs", t());
            bundle.putInt("plbs", s());
            bundle.putString("plid", this.f25666l);
        }
    }

    public final void c(C4969z0 c4969z0) {
        if (this.f25670p.get()) {
            w2.D.f41627l.post(new RunnableC3071cq(this, c4969z0));
        }
        this.f25667m.set(false);
        int i = c4969z0.f40512n;
        if (i != 1 && i != 8 && i != 10 && i != 11) {
            d(true);
            return;
        }
        AtomicReference atomicReference = this.f25660e;
        int i4 = ((s2.V0) atomicReference.get()).f40377u;
        String str = ((s2.V0) atomicReference.get()).f40376n;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(i4).length() + 26 + 61);
        sb.append("Preloading ");
        sb.append(i4);
        sb.append(", for adUnitId:");
        sb.append(str);
        sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
        String sb2 = sb.toString();
        int i6 = w2.z.f41712b;
        x2.i.e(sb2);
        this.f25662g.set(false);
        Cv cv = this.f25661f;
        if (cv != null) {
            cv.a(this);
        }
        String str2 = ((s2.V0) atomicReference.get()).f40376n;
        m2.b q8 = q();
        C3557lt c3557lt = this.f25671q;
        this.f25672r.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        int s9 = s();
        int t6 = t();
        String g9 = g();
        S0.e a9 = ((C3230fo) c3557lt.f32643u).a();
        a9.M(NativeAdvancedJsUtils.f18693p, "pftla");
        a9.M("pftlat_ts", Long.toString(currentTimeMillis));
        a9.M("pftlaec", Integer.toString(c4969z0.f40512n));
        a9.M(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, q8 == null ? com.anythink.core.common.v.m.f17596e : q8.name().toLowerCase(Locale.ENGLISH));
        a9.M("max_ads", Integer.toString(s9));
        a9.M("cache_size", Integer.toString(t6));
        a9.M("ad_unit_id", str2);
        a9.M(com.anythink.expressad.f.a.b.aB, this.f25666l);
        a9.M("pv", g9);
        a9.N();
    }

    public final void d(boolean z6) {
        Gv gv = this.f25665k;
        Cv cv = this.f25661f;
        if (cv != null) {
            if (z6) {
                gv.c();
            }
            cv.a(this);
        } else {
            if (gv.d()) {
                return;
            }
            if (z6) {
                gv.c();
            }
            this.f25668n.schedule(new Nv(this, 0), gv.b(), TimeUnit.MILLISECONDS);
        }
    }

    public final void e() {
        boolean z6;
        int i;
        int i4;
        Queue queue = this.f25664j;
        synchronized (queue) {
            try {
                Iterator it = queue.iterator();
                z6 = false;
                i = 0;
                while (true) {
                    boolean z9 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Mv mv = (Mv) it.next();
                    mv.f27157c.getClass();
                    if (System.currentTimeMillis() < mv.f27156b + mv.f27158d) {
                        z9 = false;
                    }
                    if (z9) {
                        it.remove();
                        i++;
                    }
                }
                if (i > 0 && queue.isEmpty()) {
                    z6 = true;
                }
                i4 = (i <= 0 || !queue.isEmpty()) ? i : i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        Cv cv = this.f25661f;
        if (cv != null && i > 0) {
            cv.c(this, i4);
        }
        if (z6) {
            f();
        }
    }

    public final void f() {
        if (this.f25670p.get()) {
            w2.D.f41627l.post(new Nv(this, 1));
        }
        this.f25668n.execute(new Nv(this, 2));
    }

    public final String g() {
        return true != "none".equals(this.f25666l) ? "2" : "1";
    }

    public final AbstractC3256gD h(Context context) {
        MD k9;
        switch (this.f25674t) {
            case 0:
                InterfaceC3595md interfaceC3595md = (InterfaceC3595md) ((AtomicReference) this.f25659d.f32447w).get();
                if (interfaceC3595md == null) {
                    break;
                } else {
                    Y2.b bVar = new Y2.b(context);
                    s2.f1 b9 = s2.f1.b();
                    AtomicReference atomicReference = this.f25660e;
                    BinderC3665nt binderC3665nt = (BinderC3665nt) this.f25656a.L0(bVar, b9, ((s2.V0) atomicReference.get()).f40376n, interfaceC3595md, this.f25658c);
                    if (binderC3665nt == null) {
                        break;
                    } else {
                        XD xd = new XD();
                        try {
                            b(((s2.V0) atomicReference.get()).f40378v);
                            Cv cv = this.f25661f;
                            if (cv != null) {
                                C3324ha c3324ha = AbstractC3592ma.Y;
                                s2.r rVar = s2.r.f40506e;
                                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                                    binderC3665nt.f33589y.f31436A.set(new Hv(cv, this.f25668n, ((Long) rVar.f40509c.a(AbstractC3592ma.f32982b0)).longValue(), this));
                                }
                            }
                            s2.V0 v02 = (s2.V0) atomicReference.get();
                            S0.l lVar = new S0.l(this, xd, 20, false);
                            String str = v02.f40376n;
                            J8 j82 = new J8();
                            j82.f26405v = lVar;
                            j82.f26404u = str;
                            binderC3665nt.P3(j82);
                            binderC3665nt.D3(((s2.V0) atomicReference.get()).f40378v);
                            break;
                        } catch (RemoteException e9) {
                            x2.i.g("Failed to load app open ad.", e9);
                            return QC.k(new Dv());
                        }
                    }
                }
            case 1:
                InterfaceC3595md interfaceC3595md2 = (InterfaceC3595md) ((AtomicReference) this.f25659d.f32447w).get();
                if (interfaceC3595md2 == null) {
                    break;
                } else {
                    Y2.b bVar2 = new Y2.b(context);
                    s2.f1 f1Var = new s2.f1();
                    AtomicReference atomicReference2 = this.f25660e;
                    Gr gr = (Gr) this.f25656a.j1(bVar2, f1Var, ((s2.V0) atomicReference2.get()).f40376n, interfaceC3595md2, this.f25658c);
                    if (gr == null) {
                        break;
                    } else {
                        XD xd2 = new XD();
                        try {
                            b(((s2.V0) atomicReference2.get()).f40378v);
                            Cv cv2 = this.f25661f;
                            if (cv2 != null) {
                                C3324ha c3324ha2 = AbstractC3592ma.Y;
                                s2.r rVar2 = s2.r.f40506e;
                                if (((Boolean) rVar2.f40509c.a(c3324ha2)).booleanValue()) {
                                    gr.f25914y.f25234B.set(new Hv(cv2, this.f25668n, ((Long) rVar2.f40509c.a(AbstractC3592ma.f32962Z)).longValue(), this));
                                }
                            }
                            s2.c1 c1Var = ((s2.V0) atomicReference2.get()).f40378v;
                            S0.l lVar2 = new S0.l(this, xd2, 20, false);
                            String str2 = ((s2.V0) atomicReference2.get()).f40376n;
                            Iv iv = new Iv();
                            iv.f26369n = gr;
                            iv.f26370u = lVar2;
                            iv.f26371v = str2;
                            gr.I3(c1Var, iv);
                            break;
                        } catch (RemoteException e10) {
                            x2.i.g("Failed to load interstitial ad.", e10);
                            return QC.k(new Dv());
                        }
                    }
                }
            default:
                InterfaceC3595md interfaceC3595md3 = (InterfaceC3595md) ((AtomicReference) this.f25659d.f32447w).get();
                if (interfaceC3595md3 == null) {
                    k9 = QC.k(new Dv());
                } else {
                    Y2.b bVar3 = new Y2.b(context);
                    AtomicReference atomicReference3 = this.f25660e;
                    Ot ot = (Ot) this.f25656a.G2(bVar3, ((s2.V0) atomicReference3.get()).f40376n, interfaceC3595md3, this.f25658c);
                    if (ot == null) {
                        k9 = QC.k(new Dv());
                    } else {
                        XD xd3 = new XD();
                        try {
                            b(((s2.V0) atomicReference3.get()).f40378v);
                            Cv cv3 = this.f25661f;
                            if (cv3 != null) {
                                C3324ha c3324ha3 = AbstractC3592ma.Y;
                                s2.r rVar3 = s2.r.f40506e;
                                if (((Boolean) rVar3.f40509c.a(c3324ha3)).booleanValue()) {
                                    try {
                                    } catch (RemoteException unused) {
                                        x2.i.f("Failed to load rewarded ad.");
                                        return QC.k(new Dv());
                                    }
                                    try {
                                        ot.f27456v.f26530B.set(new Hv(cv3, this.f25668n, ((Long) rVar3.f40509c.a(AbstractC3592ma.f32972a0)).longValue(), this));
                                        s2.c1 c1Var2 = ((s2.V0) atomicReference3.get()).f40378v;
                                        S0.l lVar3 = new S0.l(this, xd3, 20, false);
                                        String str3 = ((s2.V0) atomicReference3.get()).f40376n;
                                        Sv sv = new Sv();
                                        sv.f28439n = ot;
                                        sv.f28440u = lVar3;
                                        sv.f28441v = str3;
                                        ot.R1(c1Var2, sv);
                                        break;
                                    } catch (RemoteException unused2) {
                                        x2.i.f("Failed to load rewarded ad.");
                                        return QC.k(new Dv());
                                    }
                                }
                            }
                            s2.c1 c1Var22 = ((s2.V0) atomicReference3.get()).f40378v;
                            S0.l lVar32 = new S0.l(this, xd3, 20, false);
                            String str32 = ((s2.V0) atomicReference3.get()).f40376n;
                            Sv sv2 = new Sv();
                            sv2.f28439n = ot;
                            sv2.f28440u = lVar32;
                            sv2.f28441v = str32;
                            ot.R1(c1Var22, sv2);
                        } catch (RemoteException unused3) {
                        }
                    }
                }
                break;
        }
        return QC.k(new Dv());
    }

    public final long i() {
        switch (this.f25674t) {
            case 0:
                return ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32946X)).longValue();
            case 1:
                return ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32929V)).longValue();
            default:
                return ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32938W)).longValue();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000e, code lost:
    
        r1 = w2.z.f41712b;
        x2.i.b("Failed to get response info for the rewarded ad.", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001e, code lost:
    
        r1 = w2.z.f41712b;
        x2.i.b("Failed to get response info for  the interstitial ad.", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        r1 = w2.z.f41712b;
        x2.i.b("Failed to get response info for the app open ad.", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000d, code lost:
    
        r3 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ InterfaceC4963w0 j(Object obj) {
        switch (this.f25674t) {
        }
        return null;
    }

    public final void k() {
        AtomicBoolean atomicBoolean = this.f25667m;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!this.f25662g.get() || t() >= ((s2.V0) this.f25660e.get()).f40379w) {
                atomicBoolean.set(false);
            } else {
                this.f25668n.submit(new Nv(this, 5, false));
            }
        }
    }

    public final boolean l() {
        boolean isEmpty;
        C3324ha c3324ha = AbstractC3592ma.f32867O;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            this.f25665k.a();
        }
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f32809H)).booleanValue() && this.f25661f == null) {
            v();
        } else {
            e();
        }
        Queue queue = this.f25664j;
        synchronized (queue) {
            isEmpty = queue.isEmpty();
        }
        return !isEmpty;
    }

    public final Object m() {
        final Mv mv;
        final boolean z6;
        final Mv mv2;
        Queue queue = this.f25664j;
        final int t6 = t();
        synchronized (queue) {
            try {
                mv = (Mv) queue.poll();
                boolean z9 = false;
                if (mv != null && queue.isEmpty()) {
                    z9 = true;
                }
                z6 = z9;
                mv2 = (mv == null || queue.isEmpty()) ? null : (Mv) queue.peek();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f25672r.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        final int s9 = s();
        final int t9 = t();
        this.f25668n.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.Ov
            /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
            /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                s2.r rVar;
                Cv cv;
                Fv fv = Fv.this;
                int i = t6;
                Mv mv3 = mv;
                Mv mv4 = mv2;
                long j6 = currentTimeMillis;
                int i4 = s9;
                int i6 = t9;
                boolean z10 = z6;
                fv.getClass();
                C3324ha c3324ha = AbstractC3592ma.f32885Q;
                s2.r rVar2 = s2.r.f40506e;
                if (((Boolean) rVar2.f40509c.a(c3324ha)).booleanValue()) {
                    if (!((Boolean) rVar2.f40509c.a(AbstractC3592ma.f32876P)).booleanValue()) {
                        fv.f25665k.a();
                    } else if (i == 1) {
                        fv.f25665k.a();
                    }
                }
                if (mv3 != null && mv4 != null) {
                    m2.b a9 = m2.b.a(((s2.V0) fv.f25660e.get()).f40377u);
                    InterfaceC4963w0 j9 = fv.j(mv3.f27155a);
                    String str = !(j9 instanceof BinderC3871rk) ? null : ((BinderC3871rk) j9).f34473w;
                    if (a9 != null && str != null && mv4.f27156b < mv3.f27156b) {
                        rVar = rVar2;
                        fv.f25671q.A("poll_ad", "psvroc_ts", j6, i4, i6, str, fv.f25673s, fv.g());
                        cv = fv.f25661f;
                        if (cv != null) {
                            long i9 = fv.i();
                            if (i9 < 0) {
                                i9 = ((Long) rVar.f40509c.a(AbstractC3592ma.f32920U)).longValue();
                            }
                            if (i9 > 0) {
                                fv.f25668n.schedule(new Nv(fv, 0), i9, TimeUnit.MILLISECONDS);
                            } else {
                                fv.v();
                            }
                        } else if (!cv.i(fv)) {
                            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Y)).booleanValue()) {
                                cv.h(fv);
                            } else {
                                long i10 = fv.i();
                                if (i10 < 0) {
                                    i10 = ((Long) rVar.f40509c.a(AbstractC3592ma.f32920U)).longValue();
                                }
                                if (i10 > 0) {
                                    cv.h(fv);
                                    synchronized (cv) {
                                        cv.f25011c = cv.f25014f.schedule(new Bv(cv, 4), i10, TimeUnit.MILLISECONDS);
                                    }
                                } else {
                                    cv.a(fv);
                                }
                            }
                        }
                        if (z10) {
                            return;
                        }
                        fv.f();
                        return;
                    }
                }
                rVar = rVar2;
                cv = fv.f25661f;
                if (cv != null) {
                }
                if (z10) {
                }
            }
        });
        if (mv == null) {
            return null;
        }
        return mv.f27155a;
    }

    public final void n() {
        this.f25662g.set(true);
        this.f25670p.set(true);
        Cv cv = this.f25661f;
        if (cv != null) {
            cv.c(this, 0);
        } else {
            this.f25668n.submit(new Nv(this, 0));
        }
    }

    public final String o() {
        Mv mv;
        Queue queue = this.f25664j;
        synchronized (queue) {
            mv = (Mv) queue.peek();
        }
        Object obj = mv == null ? null : mv.f27155a;
        InterfaceC4963w0 j6 = obj == null ? null : j(obj);
        if (j6 instanceof BinderC3871rk) {
            return ((BinderC3871rk) j6).f34473w;
        }
        return null;
    }

    public final void p(int i) {
        R2.w.b(i >= 5);
        Gv gv = this.f25665k;
        synchronized (gv) {
            R2.w.b(i > 0);
            gv.f25937d = i;
        }
    }

    public final m2.b q() {
        return m2.b.a(((s2.V0) this.f25660e.get()).f40377u);
    }

    public final String r() {
        return ((s2.V0) this.f25660e.get()).f40376n;
    }

    public final int s() {
        return ((s2.V0) this.f25660e.get()).f40379w;
    }

    public final int t() {
        int size;
        Queue queue = this.f25664j;
        synchronized (queue) {
            size = queue.size();
        }
        return size;
    }

    public final boolean u() {
        long currentTimeMillis;
        long j6;
        if (!this.f25662g.get() || this.f25667m.get() || t() >= s()) {
            return false;
        }
        Gv gv = this.f25665k;
        synchronized (gv) {
            gv.f25939f.getClass();
            currentTimeMillis = System.currentTimeMillis();
            j6 = gv.f25938e;
        }
        return currentTimeMillis >= j6 && !gv.d();
    }

    public final void v() {
        e();
        AtomicBoolean atomicBoolean = this.f25667m;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!this.f25662g.get() || t() >= ((s2.V0) this.f25660e.get()).f40379w) {
                atomicBoolean.set(false);
            } else {
                w();
            }
        }
    }

    public final void w() {
        AbstractC3256gD h3;
        Activity l9 = C4906k.f40186C.f40195g.l();
        if (l9 == null) {
            String valueOf = String.valueOf(((s2.V0) this.f25660e.get()).f40376n);
            int i = w2.z.f41712b;
            x2.i.f("Empty activity context at preloading: ".concat(valueOf));
            h3 = h(this.f25657b);
        } else {
            h3 = h(l9);
        }
        h3.a(new LD(0, h3, new C3128du(this)), this.f25668n);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Fv(String str, ClientApi clientApi, Context context, int i, C3504ku c3504ku, s2.V0 v02, s2.P p9, ScheduledExecutorService scheduledExecutorService, Gu gu, Gv gv, V2.a aVar, Cv cv, int i4) {
        this(str, clientApi, context, i, c3504ku, v02, scheduledExecutorService, gu, gv, aVar, cv);
        this.f25674t = i4;
        this.i = p9;
    }

    public Fv(String str, ClientApi clientApi, Context context, int i, C3504ku c3504ku, s2.V0 v02, ScheduledExecutorService scheduledExecutorService, Gu gu, Gv gv, V2.a aVar, Cv cv) {
        Queue priorityQueue;
        this.f25666l = str;
        this.f25656a = clientApi;
        this.f25657b = context;
        this.f25658c = i;
        this.f25659d = c3504ku;
        AtomicReference atomicReference = new AtomicReference(v02);
        this.f25660e = atomicReference;
        int max = Math.max(1, v02.f40379w);
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33031g0)).booleanValue()) {
            priorityQueue = new Rv();
        } else {
            priorityQueue = new PriorityQueue(max, C3027c.f30174I);
        }
        this.f25664j = priorityQueue;
        this.f25662g = new AtomicBoolean(true);
        this.f25667m = new AtomicBoolean(false);
        this.f25668n = scheduledExecutorService;
        this.f25669o = gu;
        this.f25665k = gv;
        this.f25670p = new AtomicBoolean(true);
        this.f25672r = aVar;
        int i4 = 17;
        C3504ku c3504ku2 = new C3504ku(i4, v02.f40376n, m2.b.a(((s2.V0) atomicReference.get()).f40377u));
        c3504ku2.f32447w = str;
        this.f25673s = new Lv(c3504ku2);
        this.f25661f = cv;
    }
}
