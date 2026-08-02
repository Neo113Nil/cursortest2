package com.google.android.gms.internal.ads;

import java.util.Objects;
import o1.C4800d;
import s2.InterfaceC4963w0;

/* renamed from: com.google.android.gms.internal.ads.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4050v0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35384n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f35385u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f35386v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f35387w;

    public /* synthetic */ RunnableC4050v0(S0.e eVar, Object obj, long j6) {
        this.f35386v = eVar;
        this.f35387w = obj;
        this.f35385u = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j6 = this.f35385u;
        Object obj = this.f35386v;
        Object obj2 = this.f35387w;
        switch (this.f35384n) {
            case 0:
                S0.e eVar = (S0.e) obj;
                eVar.getClass();
                String str = AbstractC3182eu.f30782a;
                PN pn = ((HN) eVar.f2909v).f26036n;
                BO bo = pn.f27558K;
                C4182xO x9 = bo.x();
                bo.s(x9, 26, new C4042ut(x9, obj2, j6));
                if (pn.m0 == obj2) {
                    XJ xj = XJ.f29293v;
                    C3553lp c3553lp = pn.f27555G;
                    c3553lp.c(26, xj);
                    c3553lp.d();
                    break;
                }
                break;
            case 1:
                AbstractC3194f5 abstractC3194f5 = (AbstractC3194f5) obj2;
                abstractC3194f5.f30829n.a((String) obj, j6);
                abstractC3194f5.f30829n.b(abstractC3194f5.toString());
                break;
            case 2:
                Fv fv = (Fv) obj2;
                if (fv.f25671q != null) {
                    InterfaceC4963w0 interfaceC4963w0 = (InterfaceC4963w0) obj;
                    fv.f25671q.A("paa", "pano_ts", this.f35385u, fv.s(), fv.t(), !(interfaceC4963w0 instanceof BinderC3871rk) ? null : ((BinderC3871rk) interfaceC4963w0).f34473w, fv.f25673s, fv.g());
                    break;
                }
                break;
            default:
                C4800d c4800d = (C4800d) obj2;
                c4800d.f39737n.a((String) obj, j6);
                c4800d.f39737n.b(c4800d.toString());
                break;
        }
    }

    public RunnableC4050v0(AbstractC3194f5 abstractC3194f5, String str, long j6) {
        this.f35386v = str;
        this.f35385u = j6;
        Objects.requireNonNull(abstractC3194f5);
        this.f35387w = abstractC3194f5;
    }

    public RunnableC4050v0(Fv fv, long j6, InterfaceC4963w0 interfaceC4963w0) {
        this.f35385u = j6;
        this.f35386v = interfaceC4963w0;
        Objects.requireNonNull(fv);
        this.f35387w = fv;
    }

    public RunnableC4050v0(C4800d c4800d, String str, long j6) {
        this.f35387w = c4800d;
        this.f35386v = str;
        this.f35385u = j6;
    }
}
