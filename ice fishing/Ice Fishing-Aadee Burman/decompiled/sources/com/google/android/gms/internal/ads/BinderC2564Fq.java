package com.google.android.gms.internal.ads;

import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.Fq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2564Fq extends AbstractBinderC3788qd implements InterfaceC2592Hk {

    /* renamed from: n, reason: collision with root package name */
    public BinderC3478kr f24851n;

    /* renamed from: u, reason: collision with root package name */
    public com.bumptech.glide.manager.p f24852u;

    @Override // com.google.android.gms.internal.ads.InterfaceC2592Hk
    public final synchronized void B1(com.bumptech.glide.manager.p pVar) {
        this.f24852u = pVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void E() {
        BinderC3478kr binderC3478kr = this.f24851n;
        if (binderC3478kr != null) {
            binderC3478kr.E();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void O3(int i, String str) {
        com.bumptech.glide.manager.p pVar = this.f24852u;
        if (pVar != null) {
            synchronized (pVar) {
                try {
                    if (!pVar.f23469u) {
                        pVar.f23469u = true;
                        if (str == null) {
                            str = C3424jr.c(i, ((C3477kq) pVar.f23470v).f31638a);
                        }
                        pVar.o(new C4920z0(i, str, "undefined", null, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void T(int i) {
        BinderC3478kr binderC3478kr = this.f24851n;
        if (binderC3478kr != null) {
            binderC3478kr.T(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void U(String str) {
        BinderC3478kr binderC3478kr = this.f24851n;
        if (binderC3478kr != null) {
            binderC3478kr.U(str);
        }
    }

    public final synchronized void V3(BinderC3478kr binderC3478kr) {
        this.f24851n = binderC3478kr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void b1(C4920z0 c4920z0) {
        BinderC3478kr binderC3478kr = this.f24851n;
        if (binderC3478kr != null) {
            binderC3478kr.b1(c4920z0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void d() {
        BinderC3478kr binderC3478kr = this.f24851n;
        if (binderC3478kr != null) {
            binderC3478kr.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void e() {
        BinderC3478kr binderC3478kr = this.f24851n;
        if (binderC3478kr != null) {
            binderC3478kr.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void g() {
        BinderC3478kr binderC3478kr = this.f24851n;
        if (binderC3478kr != null) {
            binderC3478kr.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void g3(InterfaceC2515Db interfaceC2515Db, String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void j() {
        try {
            BinderC3478kr binderC3478kr = this.f24851n;
            if (binderC3478kr != null) {
                binderC3478kr.j();
            }
            com.bumptech.glide.manager.p pVar = this.f24852u;
            if (pVar != null) {
                synchronized (pVar) {
                    ((C3467kg) pVar.f23471w).b(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void j0(int i) {
        com.bumptech.glide.manager.p pVar = this.f24852u;
        if (pVar != null) {
            pVar.h(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void k() {
        BinderC3478kr binderC3478kr = this.f24851n;
        if (binderC3478kr != null) {
            binderC3478kr.k();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void m() {
        BinderC3478kr binderC3478kr = this.f24851n;
        if (binderC3478kr != null) {
            binderC3478kr.m();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void n() {
        BinderC3478kr binderC3478kr = this.f24851n;
        if (binderC3478kr != null) {
            binderC3478kr.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void n3(C4920z0 c4920z0) {
        com.bumptech.glide.manager.p pVar = this.f24852u;
        if (pVar != null) {
            synchronized (pVar) {
                if (!pVar.f23469u) {
                    pVar.f23469u = true;
                    pVar.o(c4920z0);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void o3(C3091df c3091df) {
        BinderC3478kr binderC3478kr = this.f24851n;
        if (binderC3478kr != null) {
            binderC3478kr.o3(c3091df);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void p() {
        BinderC3478kr binderC3478kr = this.f24851n;
        if (binderC3478kr != null) {
            binderC3478kr.p();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void p2() {
        BinderC3478kr binderC3478kr = this.f24851n;
        if (binderC3478kr != null) {
            binderC3478kr.p2();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void p3(String str, String str2) {
        BinderC3478kr binderC3478kr = this.f24851n;
        if (binderC3478kr != null) {
            binderC3478kr.p3(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void u() {
        BinderC3478kr binderC3478kr = this.f24851n;
        if (binderC3478kr != null) {
            binderC3478kr.u();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void x0(InterfaceC3198ff interfaceC3198ff) {
        BinderC3478kr binderC3478kr = this.f24851n;
        if (binderC3478kr != null) {
            binderC3478kr.x0(interfaceC3198ff);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3841rd
    public final synchronized void y() {
        BinderC3478kr binderC3478kr = this.f24851n;
        if (binderC3478kr != null) {
            binderC3478kr.y();
        }
    }
}
