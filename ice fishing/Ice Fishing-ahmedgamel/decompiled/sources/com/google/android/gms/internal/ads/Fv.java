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
import p2.C4835j;
import q2.C4920z0;
import q2.InterfaceC4914w0;

/* loaded from: classes2.dex */
public final class Fv {

    /* renamed from: a, reason: collision with root package name */
    public final ClientApi f24866a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f24867b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24868c;

    /* renamed from: d, reason: collision with root package name */
    public final C3481ku f24869d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f24870e;

    /* renamed from: f, reason: collision with root package name */
    public final Cv f24871f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f24872g;

    /* renamed from: h, reason: collision with root package name */
    public final q2.N f24873h;
    public final q2.P i;

    /* renamed from: j, reason: collision with root package name */
    public final Queue f24874j;

    /* renamed from: k, reason: collision with root package name */
    public final Gv f24875k;

    /* renamed from: l, reason: collision with root package name */
    public final String f24876l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f24877m;

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledExecutorService f24878n;

    /* renamed from: o, reason: collision with root package name */
    public final Gu f24879o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f24880p;

    /* renamed from: q, reason: collision with root package name */
    public C3534lt f24881q;

    /* renamed from: r, reason: collision with root package name */
    public final T2.a f24882r;

    /* renamed from: s, reason: collision with root package name */
    public final Lv f24883s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f24884t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Fv(ClientApi clientApi, Context context, int i, C3481ku c3481ku, q2.V0 v02, q2.N n9, ScheduledExecutorService scheduledExecutorService, Gu gu, Gv gv, T2.a aVar, int i6) {
        this("none", clientApi, context, i, c3481ku, v02, scheduledExecutorService, gu, gv, aVar, (Cv) null);
        this.f24884t = i6;
        this.f24873h = n9;
    }

    public final void a(final int i) {
        int size;
        Cv cv;
        boolean z3 = true;
        int i6 = 0;
        P2.w.b(i > 0);
        q2.V0 v02 = (q2.V0) this.f24870e.getAndUpdate(new UnaryOperator() { // from class: com.google.android.gms.internal.ads.Pv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                q2.V0 v03 = (q2.V0) obj;
                int i9 = i;
                if (i9 <= 0) {
                    i9 = v03.f40080w;
                }
                return new q2.V0(v03.f40077n, v03.f40078u, v03.f40079v, i9, v03.f40081x);
            }
        });
        k2.b a9 = k2.b.a(v02.f40078u);
        int i9 = v02.f40080w;
        Queue queue = this.f24874j;
        synchronized (queue) {
            try {
                size = queue.size();
                if (queue.size() > i) {
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f31978B)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        while (i6 < i) {
                            Mv mv = (Mv) queue.poll();
                            if (mv != null) {
                                arrayList.add(mv);
                            }
                            i6++;
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                        i6 = arrayList.size();
                    }
                }
                z3 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3 && size > i6 && (cv = this.f24871f) != null) {
            int i10 = size - i6;
            if (i6 == 0) {
                i10--;
            }
            cv.c(this, i10);
        }
        C3534lt c3534lt = this.f24881q;
        if (c3534lt == null || a9 == null) {
            return;
        }
        this.f24882r.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        String str = ((q2.V0) this.f24870e.get()).f40077n;
        S0.e a10 = ((C3153eo) c3534lt.f31863u).a();
        a10.v(NativeAdvancedJsUtils.f17906p, "cache_resize");
        a10.v("cs_ts", Long.toString(currentTimeMillis));
        a10.v("orig_ma", Integer.toString(i9));
        a10.v("max_ads", Integer.toString(i));
        a10.v(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, a9.name().toLowerCase(Locale.ENGLISH));
        a10.v("ad_unit_id", str);
        a10.v(com.anythink.expressad.f.a.b.aB, null);
        a10.v("pv", "1");
        a10.y();
    }

    public final void b(q2.c1 c1Var) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32022G)).booleanValue()) {
            Bundle bundle = c1Var.f40117V;
            bundle.putInt("plcs", t());
            bundle.putInt("plbs", s());
            bundle.putString("plid", this.f24876l);
        }
    }

    public final void c(C4920z0 c4920z0) {
        if (this.f24880p.get()) {
            u2.D.f41237l.post(new RunnableC3048cq(this, c4920z0));
        }
        this.f24877m.set(false);
        int i = c4920z0.f40213n;
        if (i != 1 && i != 8 && i != 10 && i != 11) {
            d(true);
            return;
        }
        AtomicReference atomicReference = this.f24870e;
        int i6 = ((q2.V0) atomicReference.get()).f40078u;
        String str = ((q2.V0) atomicReference.get()).f40077n;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(i6).length() + 26 + 61);
        sb.append("Preloading ");
        sb.append(i6);
        sb.append(", for adUnitId:");
        sb.append(str);
        sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
        String sb2 = sb.toString();
        int i9 = u2.z.f41322b;
        v2.i.e(sb2);
        this.f24872g.set(false);
        Cv cv = this.f24871f;
        if (cv != null) {
            cv.a(this);
        }
        String str2 = ((q2.V0) atomicReference.get()).f40077n;
        k2.b q8 = q();
        C3534lt c3534lt = this.f24881q;
        this.f24882r.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        int s9 = s();
        int t6 = t();
        String g4 = g();
        S0.e a9 = ((C3153eo) c3534lt.f31863u).a();
        a9.v(NativeAdvancedJsUtils.f17906p, "pftla");
        a9.v("pftlat_ts", Long.toString(currentTimeMillis));
        a9.v("pftlaec", Integer.toString(c4920z0.f40213n));
        a9.v(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, q8 == null ? com.anythink.core.common.v.m.f16809e : q8.name().toLowerCase(Locale.ENGLISH));
        a9.v("max_ads", Integer.toString(s9));
        a9.v("cache_size", Integer.toString(t6));
        a9.v("ad_unit_id", str2);
        a9.v(com.anythink.expressad.f.a.b.aB, this.f24876l);
        a9.v("pv", g4);
        a9.y();
    }

    public final void d(boolean z3) {
        Gv gv = this.f24875k;
        Cv cv = this.f24871f;
        if (cv != null) {
            if (z3) {
                gv.c();
            }
            cv.a(this);
        } else {
            if (gv.d()) {
                return;
            }
            if (z3) {
                gv.c();
            }
            this.f24878n.schedule(new Nv(this, 0), gv.b(), TimeUnit.MILLISECONDS);
        }
    }

    public final void e() {
        boolean z3;
        int i;
        int i6;
        Queue queue = this.f24874j;
        synchronized (queue) {
            try {
                Iterator it = queue.iterator();
                z3 = false;
                i = 0;
                while (true) {
                    boolean z6 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Mv mv = (Mv) it.next();
                    mv.f26372c.getClass();
                    if (System.currentTimeMillis() < mv.f26371b + mv.f26373d) {
                        z6 = false;
                    }
                    if (z6) {
                        it.remove();
                        i++;
                    }
                }
                if (i > 0 && queue.isEmpty()) {
                    z3 = true;
                }
                i6 = (i <= 0 || !queue.isEmpty()) ? i : i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        Cv cv = this.f24871f;
        if (cv != null && i > 0) {
            cv.c(this, i6);
        }
        if (z3) {
            f();
        }
    }

    public final void f() {
        if (this.f24880p.get()) {
            u2.D.f41237l.post(new Nv(this, 1));
        }
        this.f24878n.execute(new Nv(this, 2));
    }

    public final String g() {
        return true != "none".equals(this.f24876l) ? "2" : "1";
    }

    public final AbstractC3233gD h(Context context) {
        MD k9;
        switch (this.f24884t) {
            case 0:
                InterfaceC3572md interfaceC3572md = (InterfaceC3572md) ((AtomicReference) this.f24869d.f31665w).get();
                if (interfaceC3572md == null) {
                    break;
                } else {
                    W2.b bVar = new W2.b(context);
                    q2.f1 b9 = q2.f1.b();
                    AtomicReference atomicReference = this.f24870e;
                    BinderC3642nt binderC3642nt = (BinderC3642nt) this.f24866a.F3(bVar, b9, ((q2.V0) atomicReference.get()).f40077n, interfaceC3572md, this.f24868c);
                    if (binderC3642nt == null) {
                        break;
                    } else {
                        XD xd = new XD();
                        try {
                            b(((q2.V0) atomicReference.get()).f40079v);
                            Cv cv = this.f24871f;
                            if (cv != null) {
                                C3301ha c3301ha = AbstractC3569ma.Y;
                                q2.r rVar = q2.r.f40207e;
                                if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                                    binderC3642nt.f32802y.f30667A.set(new Hv(cv, this.f24878n, ((Long) rVar.f40210c.a(AbstractC3569ma.f32203b0)).longValue(), this));
                                }
                            }
                            q2.V0 v02 = (q2.V0) atomicReference.get();
                            S0.l lVar = new S0.l(this, xd, 17, false);
                            String str = v02.f40077n;
                            J8 j82 = new J8();
                            j82.f25652v = lVar;
                            j82.f25651u = str;
                            binderC3642nt.P3(j82);
                            binderC3642nt.d3(((q2.V0) atomicReference.get()).f40079v);
                            break;
                        } catch (RemoteException e9) {
                            v2.i.g("Failed to load app open ad.", e9);
                            return QC.k(new Dv());
                        }
                    }
                }
            case 1:
                InterfaceC3572md interfaceC3572md2 = (InterfaceC3572md) ((AtomicReference) this.f24869d.f31665w).get();
                if (interfaceC3572md2 == null) {
                    break;
                } else {
                    W2.b bVar2 = new W2.b(context);
                    q2.f1 f1Var = new q2.f1();
                    AtomicReference atomicReference2 = this.f24870e;
                    Gr gr = (Gr) this.f24866a.d1(bVar2, f1Var, ((q2.V0) atomicReference2.get()).f40077n, interfaceC3572md2, this.f24868c);
                    if (gr == null) {
                        break;
                    } else {
                        XD xd2 = new XD();
                        try {
                            b(((q2.V0) atomicReference2.get()).f40079v);
                            Cv cv2 = this.f24871f;
                            if (cv2 != null) {
                                C3301ha c3301ha2 = AbstractC3569ma.Y;
                                q2.r rVar2 = q2.r.f40207e;
                                if (((Boolean) rVar2.f40210c.a(c3301ha2)).booleanValue()) {
                                    gr.f25142y.f24473B.set(new Hv(cv2, this.f24878n, ((Long) rVar2.f40210c.a(AbstractC3569ma.f32183Z)).longValue(), this));
                                }
                            }
                            q2.c1 c1Var = ((q2.V0) atomicReference2.get()).f40079v;
                            S0.l lVar2 = new S0.l(this, xd2, 17, false);
                            String str2 = ((q2.V0) atomicReference2.get()).f40077n;
                            Iv iv = new Iv();
                            iv.f25616n = gr;
                            iv.f25617u = lVar2;
                            iv.f25618v = str2;
                            gr.m2(c1Var, iv);
                            break;
                        } catch (RemoteException e10) {
                            v2.i.g("Failed to load interstitial ad.", e10);
                            return QC.k(new Dv());
                        }
                    }
                }
            default:
                InterfaceC3572md interfaceC3572md3 = (InterfaceC3572md) ((AtomicReference) this.f24869d.f31665w).get();
                if (interfaceC3572md3 == null) {
                    k9 = QC.k(new Dv());
                } else {
                    W2.b bVar3 = new W2.b(context);
                    AtomicReference atomicReference3 = this.f24870e;
                    Ot ot = (Ot) this.f24866a.e3(bVar3, ((q2.V0) atomicReference3.get()).f40077n, interfaceC3572md3, this.f24868c);
                    if (ot == null) {
                        k9 = QC.k(new Dv());
                    } else {
                        XD xd3 = new XD();
                        try {
                            b(((q2.V0) atomicReference3.get()).f40079v);
                            Cv cv3 = this.f24871f;
                            if (cv3 != null) {
                                C3301ha c3301ha3 = AbstractC3569ma.Y;
                                q2.r rVar3 = q2.r.f40207e;
                                if (((Boolean) rVar3.f40210c.a(c3301ha3)).booleanValue()) {
                                    try {
                                    } catch (RemoteException unused) {
                                        v2.i.f("Failed to load rewarded ad.");
                                        return QC.k(new Dv());
                                    }
                                    try {
                                        ot.f26673v.f25778B.set(new Hv(cv3, this.f24878n, ((Long) rVar3.f40210c.a(AbstractC3569ma.f32193a0)).longValue(), this));
                                        q2.c1 c1Var2 = ((q2.V0) atomicReference3.get()).f40079v;
                                        S0.l lVar3 = new S0.l(this, xd3, 17, false);
                                        String str3 = ((q2.V0) atomicReference3.get()).f40077n;
                                        Sv sv = new Sv();
                                        sv.f27656n = ot;
                                        sv.f27657u = lVar3;
                                        sv.f27658v = str3;
                                        ot.k1(c1Var2, sv);
                                        break;
                                    } catch (RemoteException unused2) {
                                        v2.i.f("Failed to load rewarded ad.");
                                        return QC.k(new Dv());
                                    }
                                }
                            }
                            q2.c1 c1Var22 = ((q2.V0) atomicReference3.get()).f40079v;
                            S0.l lVar32 = new S0.l(this, xd3, 17, false);
                            String str32 = ((q2.V0) atomicReference3.get()).f40077n;
                            Sv sv2 = new Sv();
                            sv2.f27656n = ot;
                            sv2.f27657u = lVar32;
                            sv2.f27658v = str32;
                            ot.k1(c1Var22, sv2);
                        } catch (RemoteException unused3) {
                        }
                    }
                }
                break;
        }
        return QC.k(new Dv());
    }

    public final long i() {
        switch (this.f24884t) {
            case 0:
                return ((Long) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32167X)).longValue();
            case 1:
                return ((Long) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32149V)).longValue();
            default:
                return ((Long) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32158W)).longValue();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000e, code lost:
    
        r1 = u2.z.f41322b;
        v2.i.b("Failed to get response info for the rewarded ad.", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001e, code lost:
    
        r1 = u2.z.f41322b;
        v2.i.b("Failed to get response info for  the interstitial ad.", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        r1 = u2.z.f41322b;
        v2.i.b("Failed to get response info for the app open ad.", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000d, code lost:
    
        r3 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ InterfaceC4914w0 j(Object obj) {
        switch (this.f24884t) {
        }
        return null;
    }

    public final void k() {
        AtomicBoolean atomicBoolean = this.f24877m;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!this.f24872g.get() || t() >= ((q2.V0) this.f24870e.get()).f40080w) {
                atomicBoolean.set(false);
            } else {
                this.f24878n.submit(new Nv(this, 5, false));
            }
        }
    }

    public final boolean l() {
        boolean isEmpty;
        C3301ha c3301ha = AbstractC3569ma.f32088O;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            this.f24875k.a();
        }
        if (((Boolean) rVar.f40210c.a(AbstractC3569ma.f32030H)).booleanValue() && this.f24871f == null) {
            v();
        } else {
            e();
        }
        Queue queue = this.f24874j;
        synchronized (queue) {
            isEmpty = queue.isEmpty();
        }
        return !isEmpty;
    }

    public final Object m() {
        final Mv mv;
        final boolean z3;
        final Mv mv2;
        Queue queue = this.f24874j;
        final int t6 = t();
        synchronized (queue) {
            try {
                mv = (Mv) queue.poll();
                boolean z6 = false;
                if (mv != null && queue.isEmpty()) {
                    z6 = true;
                }
                z3 = z6;
                mv2 = (mv == null || queue.isEmpty()) ? null : (Mv) queue.peek();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f24882r.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        final int s9 = s();
        final int t9 = t();
        this.f24878n.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.Ov
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
                Cv cv;
                Fv fv = Fv.this;
                int i = t6;
                Mv mv3 = mv;
                Mv mv4 = mv2;
                long j6 = currentTimeMillis;
                int i6 = s9;
                int i9 = t9;
                boolean z9 = z3;
                fv.getClass();
                C3301ha c3301ha = AbstractC3569ma.f32105Q;
                q2.r rVar2 = q2.r.f40207e;
                if (((Boolean) rVar2.f40210c.a(c3301ha)).booleanValue()) {
                    if (!((Boolean) rVar2.f40210c.a(AbstractC3569ma.f32097P)).booleanValue()) {
                        fv.f24875k.a();
                    } else if (i == 1) {
                        fv.f24875k.a();
                    }
                }
                if (mv3 != null && mv4 != null) {
                    k2.b a9 = k2.b.a(((q2.V0) fv.f24870e.get()).f40078u);
                    InterfaceC4914w0 j9 = fv.j(mv3.f26370a);
                    String str = !(j9 instanceof BinderC3848rk) ? null : ((BinderC3848rk) j9).f33701w;
                    if (a9 != null && str != null && mv4.f26371b < mv3.f26371b) {
                        rVar = rVar2;
                        fv.f24881q.A("poll_ad", "psvroc_ts", j6, i6, i9, str, fv.f24883s, fv.g());
                        cv = fv.f24871f;
                        if (cv != null) {
                            long i10 = fv.i();
                            if (i10 < 0) {
                                i10 = ((Long) rVar.f40210c.a(AbstractC3569ma.f32141U)).longValue();
                            }
                            if (i10 > 0) {
                                fv.f24878n.schedule(new Nv(fv, 0), i10, TimeUnit.MILLISECONDS);
                            } else {
                                fv.v();
                            }
                        } else if (!cv.i(fv)) {
                            if (((Boolean) rVar.f40210c.a(AbstractC3569ma.Y)).booleanValue()) {
                                cv.h(fv);
                            } else {
                                long i11 = fv.i();
                                if (i11 < 0) {
                                    i11 = ((Long) rVar.f40210c.a(AbstractC3569ma.f32141U)).longValue();
                                }
                                if (i11 > 0) {
                                    cv.h(fv);
                                    synchronized (cv) {
                                        cv.f24266c = cv.f24269f.schedule(new Bv(cv, 4), i11, TimeUnit.MILLISECONDS);
                                    }
                                } else {
                                    cv.a(fv);
                                }
                            }
                        }
                        if (z9) {
                            return;
                        }
                        fv.f();
                        return;
                    }
                }
                rVar = rVar2;
                cv = fv.f24871f;
                if (cv != null) {
                }
                if (z9) {
                }
            }
        });
        if (mv == null) {
            return null;
        }
        return mv.f26370a;
    }

    public final void n() {
        this.f24872g.set(true);
        this.f24880p.set(true);
        Cv cv = this.f24871f;
        if (cv != null) {
            cv.c(this, 0);
        } else {
            this.f24878n.submit(new Nv(this, 0));
        }
    }

    public final String o() {
        Mv mv;
        Queue queue = this.f24874j;
        synchronized (queue) {
            mv = (Mv) queue.peek();
        }
        Object obj = mv == null ? null : mv.f26370a;
        InterfaceC4914w0 j6 = obj == null ? null : j(obj);
        if (j6 instanceof BinderC3848rk) {
            return ((BinderC3848rk) j6).f33701w;
        }
        return null;
    }

    public final void p(int i) {
        P2.w.b(i >= 5);
        Gv gv = this.f24875k;
        synchronized (gv) {
            P2.w.b(i > 0);
            gv.f25165d = i;
        }
    }

    public final k2.b q() {
        return k2.b.a(((q2.V0) this.f24870e.get()).f40078u);
    }

    public final String r() {
        return ((q2.V0) this.f24870e.get()).f40077n;
    }

    public final int s() {
        return ((q2.V0) this.f24870e.get()).f40080w;
    }

    public final int t() {
        int size;
        Queue queue = this.f24874j;
        synchronized (queue) {
            size = queue.size();
        }
        return size;
    }

    public final boolean u() {
        long currentTimeMillis;
        long j6;
        if (!this.f24872g.get() || this.f24877m.get() || t() >= s()) {
            return false;
        }
        Gv gv = this.f24875k;
        synchronized (gv) {
            gv.f25167f.getClass();
            currentTimeMillis = System.currentTimeMillis();
            j6 = gv.f25166e;
        }
        return currentTimeMillis >= j6 && !gv.d();
    }

    public final void v() {
        e();
        AtomicBoolean atomicBoolean = this.f24877m;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!this.f24872g.get() || t() >= ((q2.V0) this.f24870e.get()).f40080w) {
                atomicBoolean.set(false);
            } else {
                w();
            }
        }
    }

    public final void w() {
        AbstractC3233gD h9;
        Activity l9 = C4835j.f39733C.f39742g.l();
        if (l9 == null) {
            String valueOf = String.valueOf(((q2.V0) this.f24870e.get()).f40077n);
            int i = u2.z.f41322b;
            v2.i.f("Empty activity context at preloading: ".concat(valueOf));
            h9 = h(this.f24867b);
        } else {
            h9 = h(l9);
        }
        h9.a(new LD(0, h9, new C3105du(this)), this.f24878n);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Fv(String str, ClientApi clientApi, Context context, int i, C3481ku c3481ku, q2.V0 v02, q2.P p9, ScheduledExecutorService scheduledExecutorService, Gu gu, Gv gv, T2.a aVar, Cv cv, int i6) {
        this(str, clientApi, context, i, c3481ku, v02, scheduledExecutorService, gu, gv, aVar, cv);
        this.f24884t = i6;
        this.i = p9;
    }

    public Fv(String str, ClientApi clientApi, Context context, int i, C3481ku c3481ku, q2.V0 v02, ScheduledExecutorService scheduledExecutorService, Gu gu, Gv gv, T2.a aVar, Cv cv) {
        Queue priorityQueue;
        this.f24876l = str;
        this.f24866a = clientApi;
        this.f24867b = context;
        this.f24868c = i;
        this.f24869d = c3481ku;
        AtomicReference atomicReference = new AtomicReference(v02);
        this.f24870e = atomicReference;
        int max = Math.max(1, v02.f40080w);
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32251g0)).booleanValue()) {
            priorityQueue = new Rv();
        } else {
            priorityQueue = new PriorityQueue(max, C3004c.f29391I);
        }
        this.f24874j = priorityQueue;
        this.f24872g = new AtomicBoolean(true);
        this.f24877m = new AtomicBoolean(false);
        this.f24878n = scheduledExecutorService;
        this.f24879o = gu;
        this.f24875k = gv;
        this.f24880p = new AtomicBoolean(true);
        this.f24882r = aVar;
        int i6 = 17;
        C3481ku c3481ku2 = new C3481ku(i6, v02.f40077n, k2.b.a(((q2.V0) atomicReference.get()).f40078u));
        c3481ku2.f31665w = str;
        this.f24883s = new Lv(c3481ku2);
        this.f24871f = cv;
    }
}
