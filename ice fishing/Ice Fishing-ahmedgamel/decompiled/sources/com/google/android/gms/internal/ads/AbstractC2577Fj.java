package com.google.android.gms.internal.ads;

import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Fj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2577Fj implements Yq {

    /* renamed from: a, reason: collision with root package name */
    public final Yt f25622a;

    /* renamed from: b, reason: collision with root package name */
    public final St f25623b;

    /* renamed from: c, reason: collision with root package name */
    public final C2578Fk f25624c;

    /* renamed from: d, reason: collision with root package name */
    public final C2646Jk f25625d;

    /* renamed from: e, reason: collision with root package name */
    public final C3289gt f25626e;

    /* renamed from: f, reason: collision with root package name */
    public final BinderC3871rk f25627f;

    /* renamed from: g, reason: collision with root package name */
    public final C3120dl f25628g;

    /* renamed from: h, reason: collision with root package name */
    public final C2680Lk f25629h;
    public final C2494Al i;

    /* renamed from: j, reason: collision with root package name */
    public final C3387ik f25630j;

    /* renamed from: k, reason: collision with root package name */
    public final C3768po f25631k;

    public AbstractC2577Fj(S0.q qVar) {
        this.f25622a = (Yt) qVar.f2956a;
        this.f25623b = (St) qVar.f2957b;
        this.f25624c = (C2578Fk) qVar.f2958c;
        this.f25625d = (C2646Jk) qVar.f2959d;
        this.f25626e = (C3289gt) qVar.f2960e;
        this.f25627f = (BinderC3871rk) qVar.f2961f;
        this.f25628g = (C3120dl) qVar.f2962g;
        this.f25629h = (C2680Lk) qVar.f2963h;
        this.i = (C2494Al) qVar.i;
        this.f25630j = (C3387ik) qVar.f2964j;
        this.f25631k = (C3768po) qVar.f2965k;
    }

    public void a() {
        this.f25625d.h();
        this.f25629h.y(this);
    }

    public final void b() {
        C3768po c3768po;
        C3523lC c3523lC = this.f25623b.C0;
        if (c3523lC == null || c3523lC.isEmpty() || (c3768po = this.f25631k) == null) {
            return;
        }
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.I8)).booleanValue() || c3523lC.isEmpty()) {
            return;
        }
        PB listIterator = c3523lC.listIterator(0);
        while (listIterator.hasNext()) {
            C3822qo c3822qo = (C3822qo) listIterator.next();
            int[] iArr = c3822qo.f34184b;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 1) {
                    C4906k.f40186C.f40198k.getClass();
                    c3768po.a(1, c3822qo.f34183a, System.currentTimeMillis());
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
