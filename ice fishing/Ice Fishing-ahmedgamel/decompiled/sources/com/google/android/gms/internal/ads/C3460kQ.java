package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.kQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3460kQ extends AbstractC2978bQ {

    /* renamed from: k, reason: collision with root package name */
    public final XP f31449k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f31450l;

    /* renamed from: m, reason: collision with root package name */
    public final U7 f31451m;

    /* renamed from: n, reason: collision with root package name */
    public final K7 f31452n;

    /* renamed from: o, reason: collision with root package name */
    public C3354iQ f31453o;

    /* renamed from: p, reason: collision with root package name */
    public C3300hQ f31454p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f31455q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f31456r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f31457s;

    public C3460kQ(XP xp, boolean z3) {
        boolean z6;
        this.f31449k = xp;
        if (z3) {
            xp.e();
            z6 = true;
        } else {
            z6 = false;
        }
        this.f31450l = z6;
        this.f31451m = new U7();
        this.f31452n = new K7();
        xp.d();
        this.f31453o = new C3354iQ(new C3406jQ(xp.f()), U7.f27891m, C3354iQ.f31043e);
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void a(C2954b2 c2954b2) {
        if (this.f31457s) {
            C3354iQ c3354iQ = this.f31453o;
            AbstractC3604n8 abstractC3604n8 = c3354iQ.f30250b;
            int i = OQ.f26615d;
            this.f31453o = new C3354iQ(abstractC3604n8 instanceof OQ ? new OQ(((OQ) abstractC3604n8).f30250b, c2954b2) : new OQ(abstractC3604n8, c2954b2), c3354iQ.f31044c, c3354iQ.f31045d);
        } else {
            this.f31453o = new C3354iQ(new C3406jQ(c2954b2), U7.f27891m, C3354iQ.f31043e);
        }
        this.f31449k.a(c2954b2);
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void b(InterfaceC3622nQ interfaceC3622nQ) {
        C3300hQ c3300hQ = (C3300hQ) interfaceC3622nQ;
        InterfaceC3622nQ interfaceC3622nQ2 = c3300hQ.f30809x;
        if (interfaceC3622nQ2 != null) {
            XP xp = c3300hQ.f30808w;
            xp.getClass();
            xp.b(interfaceC3622nQ2);
        }
        if (interfaceC3622nQ == this.f31454p) {
            this.f31454p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void d() {
        this.f31449k.d();
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void e() {
        this.f31449k.e();
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final C2954b2 f() {
        return this.f31449k.f();
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void h(B b9) {
        this.f29294j = AbstractC3159eu.p();
        if (this.f31450l) {
            return;
        }
        this.f31455q = true;
        t(null, this.f31449k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2978bQ, com.google.android.gms.internal.ads.XP
    public final void j() {
        this.f31456r = false;
        this.f31455q = false;
        super.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r4 != 0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC2978bQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(Integer num, XP xp, AbstractC3604n8 abstractC3604n8) {
        long j6;
        C3354iQ c3354iQ;
        C3354iQ c3354iQ2;
        C3676oQ c3676oQ = null;
        if (this.f31456r) {
            C3354iQ c3354iQ3 = this.f31453o;
            this.f31453o = new C3354iQ(abstractC3604n8, c3354iQ3.f31044c, c3354iQ3.f31045d);
            C3300hQ c3300hQ = this.f31454p;
            if (c3300hQ != null) {
                y(c3300hQ.f30811z);
            }
        } else if (abstractC3604n8.g()) {
            if (this.f31457s) {
                C3354iQ c3354iQ4 = this.f31453o;
                c3354iQ2 = new C3354iQ(abstractC3604n8, c3354iQ4.f31044c, c3354iQ4.f31045d);
            } else {
                c3354iQ2 = new C3354iQ(abstractC3604n8, U7.f27891m, C3354iQ.f31043e);
            }
            this.f31453o = c3354iQ2;
        } else {
            U7 u72 = this.f31451m;
            abstractC3604n8.b(0, u72, 0L);
            Object obj = u72.f27893a;
            C3300hQ c3300hQ2 = this.f31454p;
            if (c3300hQ2 != null) {
                this.f31453o.o(c3300hQ2.f30805n.f32905a, this.f31452n);
                this.f31453o.b(0, u72, 0L);
                j6 = c3300hQ2.f30806u;
            }
            j6 = 0;
            Pair m4 = abstractC3604n8.m(u72, this.f31452n, 0, j6);
            Object obj2 = m4.first;
            long longValue = ((Long) m4.second).longValue();
            if (this.f31457s) {
                C3354iQ c3354iQ5 = this.f31453o;
                c3354iQ = new C3354iQ(abstractC3604n8, c3354iQ5.f31044c, c3354iQ5.f31045d);
            } else {
                c3354iQ = new C3354iQ(abstractC3604n8, obj, obj2);
            }
            this.f31453o = c3354iQ;
            C3300hQ c3300hQ3 = this.f31454p;
            if (c3300hQ3 != null && y(longValue)) {
                C3676oQ c3676oQ2 = c3300hQ3.f30805n;
                Object obj3 = this.f31453o.f31045d;
                Object obj4 = c3676oQ2.f32905a;
                if (obj3 != null && obj4.equals(C3354iQ.f31043e)) {
                    obj4 = this.f31453o.f31045d;
                }
                c3676oQ = c3676oQ2.a(obj4);
            }
        }
        this.f31457s = true;
        this.f31456r = true;
        k(this.f31453o);
        if (c3676oQ != null) {
            C3300hQ c3300hQ4 = this.f31454p;
            c3300hQ4.getClass();
            c3300hQ4.l(c3676oQ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC2978bQ
    public final /* bridge */ /* synthetic */ void u(Integer num) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC2978bQ
    public final C3676oQ v(Integer num, C3676oQ c3676oQ) {
        Object obj = this.f31453o.f31045d;
        Object obj2 = c3676oQ.f32905a;
        if (obj != null && obj.equals(obj2)) {
            obj2 = C3354iQ.f31043e;
        }
        return c3676oQ.a(obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC2978bQ
    public final /* synthetic */ void w(Integer num, long j6) {
    }

    @Override // com.google.android.gms.internal.ads.XP
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final C3300hQ c(C3676oQ c3676oQ, InterfaceC4026v interfaceC4026v, long j6) {
        C3300hQ c3300hQ = new C3300hQ(c3676oQ, interfaceC4026v, j6);
        AbstractC2772Sd.H(c3300hQ.f30808w == null);
        XP xp = this.f31449k;
        c3300hQ.f30808w = xp;
        if (!this.f31456r) {
            this.f31454p = c3300hQ;
            if (!this.f31455q) {
                this.f31455q = true;
                t(null, xp);
            }
            return c3300hQ;
        }
        Object obj = this.f31453o.f31045d;
        Object obj2 = c3676oQ.f32905a;
        if (obj != null && obj2.equals(C3354iQ.f31043e)) {
            obj2 = this.f31453o.f31045d;
        }
        c3300hQ.l(c3676oQ.a(obj2));
        return c3300hQ;
    }

    public final boolean y(long j6) {
        C3300hQ c3300hQ = this.f31454p;
        int e9 = this.f31453o.e(c3300hQ.f30805n.f32905a);
        if (e9 == -1) {
            return false;
        }
        C3354iQ c3354iQ = this.f31453o;
        K7 k72 = this.f31452n;
        c3354iQ.d(e9, k72, false);
        long j9 = k72.f25868d;
        if (j9 != com.anythink.basead.exoplayer.b.f6382b && j6 >= j9) {
            j6 = Math.max(0L, j9 - 1);
        }
        c3300hQ.f30811z = j6;
        return true;
    }
}
