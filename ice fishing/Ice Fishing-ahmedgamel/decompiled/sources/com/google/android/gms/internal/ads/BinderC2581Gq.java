package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Gq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2581Gq extends AbstractBinderC2984bf implements InterfaceC2592Hk {

    /* renamed from: n, reason: collision with root package name */
    public BinderC3210fr f25130n;

    /* renamed from: u, reason: collision with root package name */
    public com.bumptech.glide.manager.p f25131u;

    /* renamed from: v, reason: collision with root package name */
    public C2570Gf f25132v;

    @Override // com.google.android.gms.internal.ads.InterfaceC2592Hk
    public final synchronized void B1(com.bumptech.glide.manager.p pVar) {
        this.f25131u = pVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037cf
    public final synchronized void D1() {
        BinderC3210fr binderC3210fr = this.f25130n;
        if (binderC3210fr != null) {
            binderC3210fr.f30460v.Q1();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037cf
    public final synchronized void L2(W2.a aVar) {
        com.bumptech.glide.manager.p pVar = this.f25131u;
        if (pVar != null) {
            synchronized (pVar) {
                ((C3467kg) pVar.f23471w).b(null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037cf
    public final synchronized void O1(W2.a aVar) {
        BinderC3210fr binderC3210fr = this.f25130n;
        if (binderC3210fr != null) {
            binderC3210fr.f30461w.t();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037cf
    public final synchronized void T1(W2.a aVar) {
        BinderC3210fr binderC3210fr = this.f25130n;
        if (binderC3210fr != null) {
            binderC3210fr.T1(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037cf
    public final synchronized void W0(W2.a aVar) {
        BinderC3210fr binderC3210fr = this.f25130n;
        if (binderC3210fr != null) {
            binderC3210fr.f30459u.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037cf
    public final synchronized void X2(W2.a aVar) {
        BinderC3210fr binderC3210fr = this.f25130n;
        if (binderC3210fr != null) {
            binderC3210fr.f30461w.D(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037cf
    public final synchronized void Y(W2.a aVar) {
        BinderC3210fr binderC3210fr = this.f25130n;
        if (binderC3210fr != null) {
            binderC3210fr.f30458n.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037cf
    public final synchronized void b3() {
        C2570Gf c2570Gf = this.f25132v;
        if (c2570Gf != null) {
            String str = ((C3477kq) c2570Gf.f25044w).f31638a;
            int i = u2.z.f41322b;
            v2.i.f("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037cf
    public final synchronized void q0(W2.a aVar, int i) {
        com.bumptech.glide.manager.p pVar = this.f25131u;
        if (pVar != null) {
            pVar.h(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037cf
    public final synchronized void u1(W2.a aVar, C3091df c3091df) {
        BinderC3210fr binderC3210fr = this.f25130n;
        if (binderC3210fr != null) {
            binderC3210fr.f30461w.D(c3091df);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037cf
    public final synchronized void v3(W2.a aVar) {
        BinderC3210fr binderC3210fr = this.f25130n;
        if (binderC3210fr != null) {
            binderC3210fr.f30460v.M1(C2935ak.f29090B);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037cf
    public final synchronized void z3(W2.a aVar) {
        C2570Gf c2570Gf = this.f25132v;
        if (c2570Gf != null) {
            C3477kq c3477kq = (C3477kq) c2570Gf.f25044w;
            int i = 8;
            ((C2996br) c2570Gf.f25045x).f29337c.execute(new RunnableC3865s0(i, (Yt) c2570Gf.f25042u, (St) c2570Gf.f25043v, c3477kq));
        }
    }
}
