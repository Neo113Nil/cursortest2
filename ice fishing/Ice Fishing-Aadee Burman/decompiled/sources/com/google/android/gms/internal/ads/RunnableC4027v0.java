package com.google.android.gms.internal.ads;

import java.util.Objects;
import m1.C4729d;
import q2.InterfaceC4914w0;

/* renamed from: com.google.android.gms.internal.ads.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4027v0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34621n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f34622u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f34623v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f34624w;

    public /* synthetic */ RunnableC4027v0(S0.e eVar, Object obj, long j6) {
        this.f34623v = eVar;
        this.f34624w = obj;
        this.f34622u = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j6 = this.f34622u;
        Object obj = this.f34623v;
        Object obj2 = this.f34624w;
        switch (this.f34621n) {
            case 0:
                S0.e eVar = (S0.e) obj;
                eVar.getClass();
                String str = AbstractC3159eu.f29993a;
                PN pn = ((HN) eVar.f2782v).f25264n;
                BO bo = pn.f26780K;
                C4159xO x9 = bo.x();
                bo.s(x9, 26, new C4019ut(x9, obj2, j6));
                if (pn.f26799r0 == obj2) {
                    XJ xj = XJ.f28513v;
                    C3530lp c3530lp = pn.f26776G;
                    c3530lp.c(26, xj);
                    c3530lp.d();
                    break;
                }
                break;
            case 1:
                AbstractC3171f5 abstractC3171f5 = (AbstractC3171f5) obj2;
                abstractC3171f5.f30042n.a((String) obj, j6);
                abstractC3171f5.f30042n.b(abstractC3171f5.toString());
                break;
            case 2:
                Fv fv = (Fv) obj2;
                if (fv.f24881q != null) {
                    InterfaceC4914w0 interfaceC4914w0 = (InterfaceC4914w0) obj;
                    fv.f24881q.A("paa", "pano_ts", this.f34622u, fv.s(), fv.t(), !(interfaceC4914w0 instanceof BinderC3848rk) ? null : ((BinderC3848rk) interfaceC4914w0).f33701w, fv.f24883s, fv.g());
                    break;
                }
                break;
            default:
                C4729d c4729d = (C4729d) obj2;
                c4729d.f39294n.a((String) obj, j6);
                c4729d.f39294n.b(c4729d.toString());
                break;
        }
    }

    public RunnableC4027v0(AbstractC3171f5 abstractC3171f5, String str, long j6) {
        this.f34623v = str;
        this.f34622u = j6;
        Objects.requireNonNull(abstractC3171f5);
        this.f34624w = abstractC3171f5;
    }

    public RunnableC4027v0(Fv fv, long j6, InterfaceC4914w0 interfaceC4914w0) {
        this.f34622u = j6;
        this.f34623v = interfaceC4914w0;
        Objects.requireNonNull(fv);
        this.f34624w = fv;
    }

    public RunnableC4027v0(C4729d c4729d, String str, long j6) {
        this.f34624w = c4729d;
        this.f34623v = str;
        this.f34622u = j6;
    }
}
