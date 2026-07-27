package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Zi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2895Zi implements InterfaceC3725p8, InterfaceC2523Dk, s2.l, InterfaceC2506Ck {

    /* renamed from: n, reason: collision with root package name */
    public final C2827Vi f29047n;

    /* renamed from: u, reason: collision with root package name */
    public final C2844Wi f29048u;

    /* renamed from: w, reason: collision with root package name */
    public final C3154ed f29050w;

    /* renamed from: x, reason: collision with root package name */
    public final Executor f29051x;

    /* renamed from: y, reason: collision with root package name */
    public final S2.a f29052y;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f29049v = new HashSet();

    /* renamed from: z, reason: collision with root package name */
    public final AtomicBoolean f29053z = new AtomicBoolean(false);

    /* renamed from: A, reason: collision with root package name */
    public final C2878Yi f29044A = new C2878Yi();

    /* renamed from: B, reason: collision with root package name */
    public boolean f29045B = false;

    /* renamed from: C, reason: collision with root package name */
    public WeakReference f29046C = new WeakReference(this);

    public C2895Zi(C3045cd c3045cd, C2844Wi c2844Wi, Executor executor, C2827Vi c2827Vi, S2.a aVar) {
        this.f29047n = c2827Vi;
        c3045cd.a();
        this.f29050w = new C3154ed(0, c3045cd.f29719b);
        this.f29048u = c2844Wi;
        this.f29051x = executor;
        this.f29052y = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3725p8
    public final synchronized void A(C3671o8 c3671o8) {
        C2878Yi c2878Yi = this.f29044A;
        c2878Yi.f28847a = c3671o8.f33111j;
        c2878Yi.f28851e = c3671o8;
        k();
    }

    @Override // s2.l
    public final void D0() {
    }

    @Override // s2.l
    public final void G2() {
    }

    @Override // s2.l
    public final void K1() {
    }

    @Override // s2.l
    public final void K2() {
    }

    @Override // s2.l
    public final void R0(int i) {
    }

    @Override // s2.l
    public final synchronized void Y1() {
        this.f29044A.f28848b = false;
        k();
    }

    public final void a() {
        Iterator it = this.f29049v.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str = "/untrackActiveViewUnit";
            String str2 = "/updateActiveView";
            C2827Vi c2827Vi = this.f29047n;
            if (!hasNext) {
                C2810Ui c2810Ui = c2827Vi.f28287e;
                C3045cd c3045cd = c2827Vi.f28284b;
                J3.a aVar = c3045cd.f29719b;
                C2991bd c2991bd = new C2991bd(0, str2, c2810Ui);
                C3157eg c3157eg = AbstractC3212fg.f30745h;
                C3999uD A8 = C3686oN.A(aVar, c2991bd, c3157eg);
                c3045cd.f29719b = A8;
                c3045cd.f29719b = C3686oN.A(A8, new C2991bd(0, str, c2827Vi.f28288f), c3157eg);
                return;
            }
            InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) it.next();
            interfaceC3858rh.E0("/updateActiveView", c2827Vi.f28287e);
            interfaceC3858rh.E0("/untrackActiveViewUnit", c2827Vi.f28288f);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2523Dk
    public final synchronized void b(Context context) {
        this.f29044A.f28850d = "u";
        k();
        a();
        this.f29045B = true;
    }

    @Override // s2.l
    public final void f1() {
    }

    @Override // s2.l
    public final void g() {
    }

    public final synchronized void k() {
        try {
            if (this.f29046C.get() == null) {
                synchronized (this) {
                    a();
                    this.f29045B = true;
                }
                return;
            }
            if (this.f29045B || !this.f29053z.get()) {
                return;
            }
            try {
                C2878Yi c2878Yi = this.f29044A;
                this.f29052y.getClass();
                c2878Yi.f28849c = SystemClock.elapsedRealtime();
                JSONObject l9 = this.f29048u.l(c2878Yi);
                Iterator it = this.f29049v.iterator();
                while (it.hasNext()) {
                    this.f29051x.execute(new RunnableC2861Xi(l9, (InterfaceC3858rh) it.next()));
                }
                C3154ed c3154ed = this.f29050w;
                c3154ed.getClass();
                C2936ad c2936ad = new C2936ad(1, c3154ed, l9);
                C3157eg c3157eg = AbstractC3212fg.f30745h;
                C3945tD y6 = C3686oN.y(c3154ed.f30446b, c2936ad, c3157eg);
                y6.c(new MD(0, y6, new C3731pE("ActiveViewListener.callActiveViewJs", 4)), c3157eg);
                return;
            } catch (Exception e6) {
                t2.C.l("Failed to call ActiveViewJS", e6);
                return;
            }
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2523Dk
    public final synchronized void o(Context context) {
        this.f29044A.f28848b = true;
        k();
    }

    @Override // s2.l
    public final void o1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2523Dk
    public final synchronized void q(Context context) {
        this.f29044A.f28848b = false;
        k();
    }

    @Override // s2.l
    public final void u0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2506Ck
    public final synchronized void y() {
        if (this.f29053z.compareAndSet(false, true)) {
            C2827Vi c2827Vi = this.f29047n;
            C2810Ui c2810Ui = c2827Vi.f28287e;
            C3045cd c3045cd = c2827Vi.f28284b;
            c3045cd.a();
            J3.a aVar = c3045cd.f29719b;
            C2936ad c2936ad = new C2936ad(0, "/updateActiveView", c2810Ui);
            C3157eg c3157eg = AbstractC3212fg.f30745h;
            c3045cd.f29719b = C3686oN.y(aVar, c2936ad, c3157eg);
            C2810Ui c2810Ui2 = c2827Vi.f28288f;
            c3045cd.a();
            c3045cd.f29719b = C3686oN.y(c3045cd.f29719b, new C2936ad(0, "/untrackActiveViewUnit", c2810Ui2), c3157eg);
            c2827Vi.f28286d = this;
            k();
        }
    }

    @Override // s2.l
    public final synchronized void y1() {
        this.f29044A.f28848b = true;
        k();
    }
}
