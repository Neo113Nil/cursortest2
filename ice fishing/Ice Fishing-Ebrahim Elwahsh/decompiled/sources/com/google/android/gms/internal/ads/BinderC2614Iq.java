package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Iq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2614Iq extends AbstractBinderC2874Ye implements InterfaceC2574Gk {

    /* renamed from: n, reason: collision with root package name */
    public BinderC3384ir f25629n;

    /* renamed from: u, reason: collision with root package name */
    public com.bumptech.glide.manager.o f25630u;

    /* renamed from: v, reason: collision with root package name */
    public C2518Df f25631v;

    @Override // com.google.android.gms.internal.ads.InterfaceC2891Ze
    public final synchronized void B1(V2.a aVar) {
        BinderC3384ir binderC3384ir = this.f25629n;
        if (binderC3384ir != null) {
            binderC3384ir.f32012v.u1(C2943ak.f29272B);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2574Gk
    public final synchronized void C1(com.bumptech.glide.manager.o oVar) {
        this.f25630u = oVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2891Ze
    public final synchronized void F(V2.a aVar) {
        BinderC3384ir binderC3384ir = this.f25629n;
        if (binderC3384ir != null) {
            binderC3384ir.f32012v.v1();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2891Ze
    public final synchronized void L2(V2.a aVar) {
        BinderC3384ir binderC3384ir = this.f25629n;
        if (binderC3384ir != null) {
            binderC3384ir.f32011u.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2891Ze
    public final synchronized void Q(V2.a aVar) {
        BinderC3384ir binderC3384ir = this.f25629n;
        if (binderC3384ir != null) {
            binderC3384ir.f32010n.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2891Ze
    public final synchronized void S2(V2.a aVar, int i) {
        com.bumptech.glide.manager.o oVar = this.f25630u;
        if (oVar != null) {
            oVar.h(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2891Ze
    public final synchronized void V(V2.a aVar) {
        com.bumptech.glide.manager.o oVar = this.f25630u;
        if (oVar != null) {
            synchronized (oVar) {
                ((C3320hg) oVar.f23625w).a(null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2891Ze
    public final synchronized void V1(V2.a aVar, C2938af c2938af) {
        BinderC3384ir binderC3384ir = this.f25629n;
        if (binderC3384ir != null) {
            binderC3384ir.f32013w.F(c2938af);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2891Ze
    public final synchronized void e1(V2.a aVar) {
        BinderC3384ir binderC3384ir = this.f25629n;
        if (binderC3384ir != null) {
            binderC3384ir.f32013w.F(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2891Ze
    public final synchronized void h2(V2.a aVar) {
        C2518Df c2518Df = this.f25631v;
        if (c2518Df != null) {
            C3598mq c3598mq = (C3598mq) c2518Df.f24455w;
            ((C3168er) c2518Df.f24456x).f30520c.execute(new RunnableC3771q0((C2953au) c2518Df.f24453u, (Ut) c2518Df.f24454v, c3598mq, 8));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2891Ze
    public final synchronized void k0(V2.a aVar, int i) {
        C2518Df c2518Df = this.f25631v;
        if (c2518Df != null) {
            String str = ((C3598mq) c2518Df.f24455w).f32760a;
            int i4 = t2.C.f40822b;
            u2.i.f("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2891Ze
    public final synchronized void s3(V2.a aVar) {
        BinderC3384ir binderC3384ir = this.f25629n;
        if (binderC3384ir != null) {
            binderC3384ir.s3(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2891Ze
    public final synchronized void z0(V2.a aVar) {
        BinderC3384ir binderC3384ir = this.f25629n;
        if (binderC3384ir != null) {
            binderC3384ir.f32013w.a();
        }
    }
}
