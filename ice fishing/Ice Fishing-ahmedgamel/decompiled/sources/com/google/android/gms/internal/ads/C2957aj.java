package com.google.android.gms.internal.ads;

import E2.C0310g;
import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.aj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2957aj implements InterfaceC3950t8, InterfaceC2561Ek, v2.l, InterfaceC2544Dk {

    /* renamed from: n, reason: collision with root package name */
    public final C2864Wi f29857n;

    /* renamed from: u, reason: collision with root package name */
    public final C2880Xi f29858u;

    /* renamed from: w, reason: collision with root package name */
    public final C3327hd f29860w;

    /* renamed from: x, reason: collision with root package name */
    public final Executor f29861x;

    /* renamed from: y, reason: collision with root package name */
    public final V2.a f29862y;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f29859v = new HashSet();

    /* renamed from: z, reason: collision with root package name */
    public final AtomicBoolean f29863z = new AtomicBoolean(false);

    /* renamed from: A, reason: collision with root package name */
    public final C2912Zi f29854A = new C2912Zi();

    /* renamed from: B, reason: collision with root package name */
    public boolean f29855B = false;

    /* renamed from: C, reason: collision with root package name */
    public WeakReference f29856C = new WeakReference(this);

    public C2957aj(C3273gd c3273gd, C2880Xi c2880Xi, Executor executor, C2864Wi c2864Wi, V2.a aVar) {
        this.f29857n = c2864Wi;
        c3273gd.a();
        this.f29860w = new C3327hd(0, c3273gd.f31351b);
        this.f29858u = c2880Xi;
        this.f29861x = executor;
        this.f29862y = aVar;
    }

    @Override // v2.l
    public final void C3(int i) {
    }

    @Override // v2.l
    public final void G1() {
    }

    @Override // v2.l
    public final void K0() {
    }

    @Override // v2.l
    public final void N2() {
    }

    @Override // v2.l
    public final void Q1() {
    }

    @Override // v2.l
    public final synchronized void S1() {
        this.f29854A.f29714b = false;
        l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2561Ek
    public final synchronized void a(Context context) {
        this.f29854A.f29716d = "u";
        l();
        b();
        this.f29855B = true;
    }

    public final void b() {
        Iterator it = this.f29859v.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str = "/untrackActiveViewUnit";
            String str2 = "/updateActiveView";
            C2864Wi c2864Wi = this.f29857n;
            if (!hasNext) {
                C2848Vi c2848Vi = c2864Wi.f29173e;
                C3273gd c3273gd = c2864Wi.f29170b;
                P3.a aVar = c3273gd.f31351b;
                C0310g c0310g = new C0310g(1, str2, c2848Vi);
                C3383ig c3383ig = AbstractC3436jg.f32062h;
                C3955tD u6 = QC.u(aVar, c0310g, c3383ig);
                c3273gd.f31351b = u6;
                c3273gd.f31351b = QC.u(u6, new C0310g(1, str, c2864Wi.f29174f), c3383ig);
                return;
            }
            InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) it.next();
            interfaceC4084vh.S0("/updateActiveView", c2864Wi.f29173e);
            interfaceC4084vh.S0("/untrackActiveViewUnit", c2864Wi.f29174f);
        }
    }

    @Override // v2.l
    public final void d1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3950t8
    public final synchronized void f(C3896s8 c3896s8) {
        C2912Zi c2912Zi = this.f29854A;
        c2912Zi.f29713a = c3896s8.f34667j;
        c2912Zi.f29717e = c3896s8;
        l();
    }

    @Override // v2.l
    public final void g() {
    }

    @Override // v2.l
    public final void h1() {
    }

    public final synchronized void l() {
        try {
            if (this.f29856C.get() == null) {
                synchronized (this) {
                    b();
                    this.f29855B = true;
                }
                return;
            }
            if (this.f29855B || !this.f29863z.get()) {
                return;
            }
            try {
                C2912Zi c2912Zi = this.f29854A;
                this.f29862y.getClass();
                c2912Zi.f29715c = SystemClock.elapsedRealtime();
                JSONObject n9 = this.f29858u.n(c2912Zi);
                Iterator it = this.f29859v.iterator();
                while (it.hasNext()) {
                    this.f29861x.execute(new RunnableC2896Yi(n9, (InterfaceC4084vh) it.next()));
                }
                C3327hd c3327hd = this.f29860w;
                c3327hd.getClass();
                E2.r rVar = new E2.r(2, c3327hd, n9);
                C3383ig c3383ig = AbstractC3436jg.f32062h;
                C3901sD t6 = QC.t(c3327hd.f31583b, rVar, c3383ig);
                t6.a(new LD(0, t6, new C3579mE("ActiveViewListener.callActiveViewJs", 6)), c3383ig);
                return;
            } catch (Exception e9) {
                w2.z.l("Failed to call ActiveViewJS", e9);
                return;
            }
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2561Ek
    public final synchronized void n(Context context) {
        this.f29854A.f29714b = true;
        l();
    }

    @Override // v2.l
    public final synchronized void r1() {
        this.f29854A.f29714b = true;
        l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2561Ek
    public final synchronized void s(Context context) {
        this.f29854A.f29714b = false;
        l();
    }

    @Override // v2.l
    public final void t0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2544Dk
    public final synchronized void v() {
        if (this.f29863z.compareAndSet(false, true)) {
            C2864Wi c2864Wi = this.f29857n;
            C2848Vi c2848Vi = c2864Wi.f29173e;
            C3273gd c3273gd = c2864Wi.f29170b;
            c3273gd.a();
            P3.a aVar = c3273gd.f31351b;
            E2.r rVar = new E2.r(1, "/updateActiveView", c2848Vi);
            C3383ig c3383ig = AbstractC3436jg.f32062h;
            c3273gd.f31351b = QC.t(aVar, rVar, c3383ig);
            C2848Vi c2848Vi2 = c2864Wi.f29174f;
            c3273gd.a();
            c3273gd.f31351b = QC.t(c3273gd.f31351b, new E2.r(1, "/untrackActiveViewUnit", c2848Vi2), c3383ig);
            c2864Wi.f29172d = this;
            l();
        }
    }
}
