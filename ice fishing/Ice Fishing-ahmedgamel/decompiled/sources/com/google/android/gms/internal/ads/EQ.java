package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class EQ extends XP {
    public final VG i;

    /* renamed from: j, reason: collision with root package name */
    public final C3105du f24619j;

    /* renamed from: k, reason: collision with root package name */
    public final V2 f24620k;

    /* renamed from: l, reason: collision with root package name */
    public final int f24621l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24622m;

    /* renamed from: n, reason: collision with root package name */
    public long f24623n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f24624o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f24625p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f24626q;

    /* renamed from: r, reason: collision with root package name */
    public B f24627r;

    /* renamed from: s, reason: collision with root package name */
    public C2954b2 f24628s;

    public /* synthetic */ EQ(C2954b2 c2954b2, VG vg, C3105du c3105du, V2 v22, int i) {
        V2 v23 = V2.f28067D;
        this.f24628s = c2954b2;
        this.i = vg;
        this.f24619j = c3105du;
        this.f24620k = v23;
        this.f24621l = i;
        this.f24622m = true;
        this.f24623n = com.anythink.basead.exoplayer.b.f6382b;
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final synchronized void a(C2954b2 c2954b2) {
        this.f24628s = c2954b2;
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void b(InterfaceC3622nQ interfaceC3622nQ) {
        CQ cq = (CQ) interfaceC3622nQ;
        if (cq.f24131O) {
            for (HQ hq : cq.f24128L) {
                hq.o();
                if (hq.f25308g != null) {
                    hq.f25308g = null;
                    hq.f25307f = null;
                }
            }
        }
        C4274ze c4274ze = cq.f24120C;
        E e9 = (E) c4274ze.f35361v;
        if (e9 != null) {
            e9.a(true);
        }
        F f3 = new F(cq, 0);
        J j6 = (J) c4274ze.f35360u;
        j6.execute(f3);
        ((ExecutorService) j6.f25631u).shutdown();
        cq.f24125H.removeCallbacksAndMessages(null);
        cq.f24126I = null;
        cq.f24149t0 = true;
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final InterfaceC3622nQ c(C3676oQ c3676oQ, InterfaceC4026v interfaceC4026v, long j6) {
        InterfaceC3613nH mo14c = this.i.mo14c();
        B b9 = this.f24627r;
        if (b9 != null) {
            mo14c.k(b9);
        }
        L0 l02 = f().f29185b;
        l02.getClass();
        this.f28530g.getClass();
        C4274ze c4274ze = new C4274ze(27, (T0) this.f24619j.f29859u);
        AP ap = new AP(this.f28527d.f23676b, c3676oQ);
        AP ap2 = new AP(this.f28526c.f23676b, c3676oQ);
        long u3 = AbstractC3159eu.u(com.anythink.basead.exoplayer.b.f6382b);
        return new CQ(l02.f26006a, mo14c, c4274ze, this.f24620k, ap, ap2, this, interfaceC4026v, this.f24621l, u3);
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final synchronized C2954b2 f() {
        return this.f24628s;
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void h(B b9) {
        this.f24627r = b9;
        Looper.myLooper().getClass();
        this.f28530g.getClass();
        t();
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void r() {
    }

    public final void s(long j6, InterfaceC3113e1 interfaceC3113e1, boolean z3) {
        if (this.f24626q && interfaceC3113e1.j()) {
            return;
        }
        this.f24626q = !interfaceC3113e1.j();
        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            j6 = this.f24623n;
        }
        boolean f3 = interfaceC3113e1.f();
        if (!this.f24622m && this.f24623n == j6 && this.f24624o == f3 && this.f24625p == z3) {
            return;
        }
        this.f24623n = j6;
        this.f24624o = f3;
        this.f24625p = z3;
        this.f24622m = false;
        t();
    }

    public final void t() {
        long j6 = this.f24623n;
        boolean z3 = this.f24624o;
        boolean z6 = this.f24625p;
        C2954b2 f3 = f();
        AbstractC3604n8 lq = new LQ(j6, j6, z3, f3, z6 ? f3.f29186c : null);
        if (this.f24622m) {
            lq = new DQ(lq);
        }
        k(lq);
    }
}
