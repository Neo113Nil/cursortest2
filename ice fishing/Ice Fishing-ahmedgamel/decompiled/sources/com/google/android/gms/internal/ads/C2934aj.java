package com.google.android.gms.internal.ads;

import C2.C0274g;
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
public final class C2934aj implements InterfaceC3927t8, InterfaceC2541Ek, t2.l, InterfaceC2524Dk {

    /* renamed from: n, reason: collision with root package name */
    public final C2841Wi f29082n;

    /* renamed from: u, reason: collision with root package name */
    public final C2857Xi f29083u;

    /* renamed from: w, reason: collision with root package name */
    public final C3304hd f29085w;

    /* renamed from: x, reason: collision with root package name */
    public final Executor f29086x;

    /* renamed from: y, reason: collision with root package name */
    public final T2.a f29087y;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f29084v = new HashSet();

    /* renamed from: z, reason: collision with root package name */
    public final AtomicBoolean f29088z = new AtomicBoolean(false);

    /* renamed from: A, reason: collision with root package name */
    public final C2889Zi f29079A = new C2889Zi();

    /* renamed from: B, reason: collision with root package name */
    public boolean f29080B = false;

    /* renamed from: C, reason: collision with root package name */
    public WeakReference f29081C = new WeakReference(this);

    public C2934aj(C3250gd c3250gd, C2857Xi c2857Xi, Executor executor, C2841Wi c2841Wi, T2.a aVar) {
        this.f29082n = c2841Wi;
        c3250gd.a();
        this.f29085w = new C3304hd(0, c3250gd.f30584b);
        this.f29083u = c2857Xi;
        this.f29086x = executor;
        this.f29087y = aVar;
    }

    @Override // t2.l
    public final void H3(int i) {
    }

    @Override // t2.l
    public final void L1() {
    }

    @Override // t2.l
    public final void M0() {
    }

    @Override // t2.l
    public final void Q2() {
    }

    @Override // t2.l
    public final void R1() {
    }

    @Override // t2.l
    public final synchronized void S1() {
        this.f29079A.f28937b = false;
        l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Ek
    public final synchronized void a(Context context) {
        this.f29079A.f28939d = "u";
        l();
        b();
        this.f29080B = true;
    }

    public final void b() {
        Iterator it = this.f29084v.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str = "/untrackActiveViewUnit";
            String str2 = "/updateActiveView";
            C2841Wi c2841Wi = this.f29082n;
            if (!hasNext) {
                C2825Vi c2825Vi = c2841Wi.f28374e;
                C3250gd c3250gd = c2841Wi.f28371b;
                N3.a aVar = c3250gd.f30584b;
                C0274g c0274g = new C0274g(1, str2, c2825Vi);
                C3360ig c3360ig = AbstractC3413jg.f31275h;
                C3932tD u3 = QC.u(aVar, c0274g, c3360ig);
                c3250gd.f30584b = u3;
                c3250gd.f30584b = QC.u(u3, new C0274g(1, str, c2841Wi.f28375f), c3360ig);
                return;
            }
            InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) it.next();
            interfaceC4061vh.T0("/updateActiveView", c2841Wi.f28374e);
            interfaceC4061vh.T0("/untrackActiveViewUnit", c2841Wi.f28375f);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927t8
    public final synchronized void f(C3873s8 c3873s8) {
        C2889Zi c2889Zi = this.f29079A;
        c2889Zi.f28936a = c3873s8.f33899j;
        c2889Zi.f28940e = c3873s8;
        l();
    }

    @Override // t2.l
    public final void f1() {
    }

    @Override // t2.l
    public final void g() {
    }

    @Override // t2.l
    public final void h1() {
    }

    public final synchronized void l() {
        try {
            if (this.f29081C.get() == null) {
                synchronized (this) {
                    b();
                    this.f29080B = true;
                }
                return;
            }
            if (this.f29080B || !this.f29088z.get()) {
                return;
            }
            try {
                C2889Zi c2889Zi = this.f29079A;
                this.f29087y.getClass();
                c2889Zi.f28938c = SystemClock.elapsedRealtime();
                JSONObject n9 = this.f29083u.n(c2889Zi);
                Iterator it = this.f29084v.iterator();
                while (it.hasNext()) {
                    this.f29086x.execute(new RunnableC2873Yi(n9, (InterfaceC4061vh) it.next()));
                }
                C3304hd c3304hd = this.f29085w;
                c3304hd.getClass();
                C2.s sVar = new C2.s(2, c3304hd, n9);
                C3360ig c3360ig = AbstractC3413jg.f31275h;
                C3878sD t6 = QC.t(c3304hd.f30822b, sVar, c3360ig);
                t6.a(new LD(0, t6, new C3556mE("ActiveViewListener.callActiveViewJs", 6)), c3360ig);
                return;
            } catch (Exception e9) {
                u2.z.l("Failed to call ActiveViewJS", e9);
                return;
            }
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Ek
    public final synchronized void n(Context context) {
        this.f29079A.f28937b = true;
        l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Ek
    public final synchronized void s(Context context) {
        this.f29079A.f28937b = false;
        l();
    }

    @Override // t2.l
    public final synchronized void t1() {
        this.f29079A.f28937b = true;
        l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dk
    public final synchronized void w() {
        if (this.f29088z.compareAndSet(false, true)) {
            C2841Wi c2841Wi = this.f29082n;
            C2825Vi c2825Vi = c2841Wi.f28374e;
            C3250gd c3250gd = c2841Wi.f28371b;
            c3250gd.a();
            N3.a aVar = c3250gd.f30584b;
            C2.s sVar = new C2.s(1, "/updateActiveView", c2825Vi);
            C3360ig c3360ig = AbstractC3413jg.f31275h;
            c3250gd.f30584b = QC.t(aVar, sVar, c3360ig);
            C2825Vi c2825Vi2 = c2841Wi.f28375f;
            c3250gd.a();
            c3250gd.f30584b = QC.t(c3250gd.f30584b, new C2.s(1, "/untrackActiveViewUnit", c2825Vi2), c3360ig);
            c2841Wi.f28373d = this;
            l();
        }
    }

    @Override // t2.l
    public final void w0() {
    }
}
