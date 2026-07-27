package com.google.android.gms.internal.ads;

import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Fj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2557Fj implements Yq {

    /* renamed from: a, reason: collision with root package name */
    public final Yt f24833a;

    /* renamed from: b, reason: collision with root package name */
    public final St f24834b;

    /* renamed from: c, reason: collision with root package name */
    public final C2558Fk f24835c;

    /* renamed from: d, reason: collision with root package name */
    public final C2626Jk f24836d;

    /* renamed from: e, reason: collision with root package name */
    public final C3266gt f24837e;

    /* renamed from: f, reason: collision with root package name */
    public final BinderC3848rk f24838f;

    /* renamed from: g, reason: collision with root package name */
    public final C3097dl f24839g;

    /* renamed from: h, reason: collision with root package name */
    public final C2660Lk f24840h;
    public final C4281zl i;

    /* renamed from: j, reason: collision with root package name */
    public final C3364ik f24841j;

    /* renamed from: k, reason: collision with root package name */
    public final C3691oo f24842k;

    public AbstractC2557Fj(S0.q qVar) {
        this.f24833a = (Yt) qVar.f2827a;
        this.f24834b = (St) qVar.f2828b;
        this.f24835c = (C2558Fk) qVar.f2829c;
        this.f24836d = (C2626Jk) qVar.f2830d;
        this.f24837e = (C3266gt) qVar.f2831e;
        this.f24838f = (BinderC3848rk) qVar.f2832f;
        this.f24839g = (C3097dl) qVar.f2833g;
        this.f24840h = (C2660Lk) qVar.f2834h;
        this.i = (C4281zl) qVar.i;
        this.f24841j = (C3364ik) qVar.f2835j;
        this.f24842k = (C3691oo) qVar.f2836k;
    }

    public void a() {
        this.f24836d.h();
        this.f24840h.A(this);
    }

    public final void b() {
        C3691oo c3691oo;
        C3500lC c3500lC = this.f24834b.C0;
        if (c3500lC == null || c3500lC.isEmpty() || (c3691oo = this.f24842k) == null) {
            return;
        }
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.I8)).booleanValue() || c3500lC.isEmpty()) {
            return;
        }
        PB listIterator = c3500lC.listIterator(0);
        while (listIterator.hasNext()) {
            C3745po c3745po = (C3745po) listIterator.next();
            int[] iArr = c3745po.f33134b;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 1) {
                    C4835j.f39730C.f39742k.getClass();
                    c3691oo.a(1, c3745po.f33133a, System.currentTimeMillis());
                    break;
                }
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Yq
    public final void q() {
        this.i.n();
    }
}
