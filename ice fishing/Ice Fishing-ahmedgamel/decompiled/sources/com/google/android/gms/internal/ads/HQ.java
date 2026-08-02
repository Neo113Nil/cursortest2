package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class HQ extends AbstractC2947aQ {
    public final VG i;

    /* renamed from: j, reason: collision with root package name */
    public final C3128du f26070j;

    /* renamed from: k, reason: collision with root package name */
    public final V2 f26071k;

    /* renamed from: l, reason: collision with root package name */
    public final int f26072l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26073m;

    /* renamed from: n, reason: collision with root package name */
    public long f26074n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f26075o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f26076p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f26077q;

    /* renamed from: r, reason: collision with root package name */
    public B f26078r;

    /* renamed from: s, reason: collision with root package name */
    public C2977b2 f26079s;

    public /* synthetic */ HQ(C2977b2 c2977b2, VG vg, C3128du c3128du, V2 v22, int i) {
        V2 v23 = V2.f28864D;
        this.f26079s = c2977b2;
        this.i = vg;
        this.f26070j = c3128du;
        this.f26071k = v23;
        this.f26072l = i;
        this.f26073m = true;
        this.f26074n = com.anythink.basead.exoplayer.b.f7168b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final synchronized void a(C2977b2 c2977b2) {
        this.f26079s = c2977b2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final void b(InterfaceC3807qQ interfaceC3807qQ) {
        FQ fq = (FQ) interfaceC3807qQ;
        if (fq.f25570O) {
            for (KQ kq : fq.f25567L) {
                kq.o();
                if (kq.f26685g != null) {
                    kq.f26685g = null;
                    kq.f26684f = null;
                }
            }
        }
        C4297ze c4297ze = fq.f25559C;
        E e9 = (E) c4297ze.f36134v;
        if (e9 != null) {
            e9.a(true);
        }
        F f2 = new F(fq, 0);
        J j6 = (J) c4297ze.f36133u;
        j6.execute(f2);
        ((ExecutorService) j6.f26384u).shutdown();
        fq.f25564H.removeCallbacksAndMessages(null);
        fq.f25565I = null;
        fq.f25587o0 = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final InterfaceC3807qQ c(C3860rQ c3860rQ, InterfaceC4049v interfaceC4049v, long j6) {
        InterfaceC3636nH mo13c = this.i.mo13c();
        B b9 = this.f26078r;
        if (b9 != null) {
            mo13c.m(b9);
        }
        L0 l02 = f().f29973b;
        l02.getClass();
        this.f29831g.getClass();
        C4297ze c4297ze = new C4297ze(27, (T0) this.f26070j.f30647u);
        AP ap = new AP(this.f29828d.f24456b, c3860rQ);
        AP ap2 = new AP(this.f29827c.f24456b, c3860rQ);
        long u6 = AbstractC3182eu.u(com.anythink.basead.exoplayer.b.f7168b);
        return new FQ(l02.f26806a, mo13c, c4297ze, this.f26071k, ap, ap2, this, interfaceC4049v, this.f26072l, u6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final synchronized C2977b2 f() {
        return this.f26079s;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final void h(B b9) {
        this.f26078r = b9;
        Looper.myLooper().getClass();
        this.f29831g.getClass();
        t();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final void r() {
    }

    public final void s(long j6, InterfaceC3136e1 interfaceC3136e1, boolean z6) {
        if (this.f26077q && interfaceC3136e1.j()) {
            return;
        }
        this.f26077q = !interfaceC3136e1.j();
        if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
            j6 = this.f26074n;
        }
        boolean f2 = interfaceC3136e1.f();
        if (!this.f26073m && this.f26074n == j6 && this.f26075o == f2 && this.f26076p == z6) {
            return;
        }
        this.f26074n = j6;
        this.f26075o = f2;
        this.f26076p = z6;
        this.f26073m = false;
        t();
    }

    public final void t() {
        long j6 = this.f26074n;
        boolean z6 = this.f26075o;
        boolean z9 = this.f26076p;
        C2977b2 f2 = f();
        AbstractC3627n8 oq = new OQ(j6, j6, z6, f2, z9 ? f2.f29974c : null);
        if (this.f26073m) {
            oq = new GQ(oq);
        }
        k(oq);
    }
}
