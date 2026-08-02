package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Gq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2601Gq extends AbstractBinderC3007bf implements InterfaceC2612Hk {

    /* renamed from: n, reason: collision with root package name */
    public BinderC3233fr f25902n;

    /* renamed from: u, reason: collision with root package name */
    public com.bumptech.glide.manager.o f25903u;

    /* renamed from: v, reason: collision with root package name */
    public C2590Gf f25904v;

    @Override // com.google.android.gms.internal.ads.InterfaceC3060cf
    public final synchronized void D2(Y2.a aVar) {
        com.bumptech.glide.manager.o oVar = this.f25903u;
        if (oVar != null) {
            synchronized (oVar) {
                ((C3490kg) oVar.f24256w).b(null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3060cf
    public final synchronized void F1(Y2.a aVar, C3114df c3114df) {
        BinderC3233fr binderC3233fr = this.f25902n;
        if (binderC3233fr != null) {
            binderC3233fr.f31224w.B(c3114df);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3060cf
    public final synchronized void J2(Y2.a aVar) {
        BinderC3233fr binderC3233fr = this.f25902n;
        if (binderC3233fr != null) {
            binderC3233fr.f31224w.B(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3060cf
    public final synchronized void L1(Y2.a aVar, int i) {
        com.bumptech.glide.manager.o oVar = this.f25903u;
        if (oVar != null) {
            oVar.h(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3060cf
    public final synchronized void V2() {
        C2590Gf c2590Gf = this.f25904v;
        if (c2590Gf != null) {
            String str = ((C3500kq) c2590Gf.f25832w).f32420a;
            int i = w2.z.f41712b;
            x2.i.f("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3060cf
    public final synchronized void Y0(Y2.a aVar) {
        BinderC3233fr binderC3233fr = this.f25902n;
        if (binderC3233fr != null) {
            binderC3233fr.f31222u.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3060cf
    public final synchronized void Z1(Y2.a aVar) {
        BinderC3233fr binderC3233fr = this.f25902n;
        if (binderC3233fr != null) {
            binderC3233fr.Z1(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3060cf
    public final synchronized void f0(Y2.a aVar) {
        BinderC3233fr binderC3233fr = this.f25902n;
        if (binderC3233fr != null) {
            binderC3233fr.f31221n.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3060cf
    public final synchronized void p2(Y2.a aVar) {
        BinderC3233fr binderC3233fr = this.f25902n;
        if (binderC3233fr != null) {
            binderC3233fr.f31223v.M1(C2958ak.f29865B);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3060cf
    public final synchronized void s3(Y2.a aVar) {
        C2590Gf c2590Gf = this.f25904v;
        if (c2590Gf != null) {
            C3500kq c3500kq = (C3500kq) c2590Gf.f25832w;
            int i = 8;
            ((C3019br) c2590Gf.f25833x).f30125c.execute(new RunnableC3888s0(i, (Yt) c2590Gf.f25830u, (St) c2590Gf.f25831v, c3500kq));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3060cf
    public final synchronized void t1(Y2.a aVar) {
        BinderC3233fr binderC3233fr = this.f25902n;
        if (binderC3233fr != null) {
            binderC3233fr.f31224w.t();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2612Hk
    public final synchronized void u1(com.bumptech.glide.manager.o oVar) {
        this.f25903u = oVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3060cf
    public final synchronized void v1() {
        BinderC3233fr binderC3233fr = this.f25902n;
        if (binderC3233fr != null) {
            binderC3233fr.f31223v.R1();
        }
    }
}
