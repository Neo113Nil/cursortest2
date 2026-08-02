package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.nQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3645nQ extends AbstractC3161eQ {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC2947aQ f33511k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f33512l;

    /* renamed from: m, reason: collision with root package name */
    public final U7 f33513m;

    /* renamed from: n, reason: collision with root package name */
    public final K7 f33514n;

    /* renamed from: o, reason: collision with root package name */
    public C3537lQ f33515o;

    /* renamed from: p, reason: collision with root package name */
    public C3483kQ f33516p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f33517q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f33518r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f33519s;

    public C3645nQ(AbstractC2947aQ abstractC2947aQ, boolean z6) {
        boolean z9;
        this.f33511k = abstractC2947aQ;
        if (z6) {
            abstractC2947aQ.e();
            z9 = true;
        } else {
            z9 = false;
        }
        this.f33512l = z9;
        this.f33513m = new U7();
        this.f33514n = new K7();
        abstractC2947aQ.d();
        this.f33515o = new C3537lQ(new C3591mQ(abstractC2947aQ.f()), U7.f28688m, C3537lQ.f32544e);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final void a(C2977b2 c2977b2) {
        if (this.f33519s) {
            C3537lQ c3537lQ = this.f33515o;
            AbstractC3627n8 abstractC3627n8 = c3537lQ.f31816b;
            int i = RQ.f27968d;
            this.f33515o = new C3537lQ(abstractC3627n8 instanceof RQ ? new RQ(((RQ) abstractC3627n8).f31816b, c2977b2) : new RQ(abstractC3627n8, c2977b2), c3537lQ.f32545c, c3537lQ.f32546d);
        } else {
            this.f33515o = new C3537lQ(new C3591mQ(c2977b2), U7.f28688m, C3537lQ.f32544e);
        }
        this.f33511k.a(c2977b2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final void b(InterfaceC3807qQ interfaceC3807qQ) {
        C3483kQ c3483kQ = (C3483kQ) interfaceC3807qQ;
        InterfaceC3807qQ interfaceC3807qQ2 = c3483kQ.f32232x;
        if (interfaceC3807qQ2 != null) {
            AbstractC2947aQ abstractC2947aQ = c3483kQ.f32231w;
            abstractC2947aQ.getClass();
            abstractC2947aQ.b(interfaceC3807qQ2);
        }
        if (interfaceC3807qQ == this.f33516p) {
            this.f33516p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final void d() {
        this.f33511k.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final void e() {
        this.f33511k.e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final C2977b2 f() {
        return this.f33511k.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final void h(B b9) {
        this.f30724j = AbstractC3182eu.p();
        if (this.f33512l) {
            return;
        }
        this.f33517q = true;
        t(null, this.f33511k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3161eQ, com.google.android.gms.internal.ads.AbstractC2947aQ
    public final void j() {
        this.f33518r = false;
        this.f33517q = false;
        super.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r4 != 0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC3161eQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(Integer num, AbstractC2947aQ abstractC2947aQ, AbstractC3627n8 abstractC3627n8) {
        long j6;
        C3537lQ c3537lQ;
        C3537lQ c3537lQ2;
        C3860rQ c3860rQ = null;
        if (this.f33518r) {
            C3537lQ c3537lQ3 = this.f33515o;
            this.f33515o = new C3537lQ(abstractC3627n8, c3537lQ3.f32545c, c3537lQ3.f32546d);
            C3483kQ c3483kQ = this.f33516p;
            if (c3483kQ != null) {
                y(c3483kQ.f32234z);
            }
        } else if (abstractC3627n8.g()) {
            if (this.f33519s) {
                C3537lQ c3537lQ4 = this.f33515o;
                c3537lQ2 = new C3537lQ(abstractC3627n8, c3537lQ4.f32545c, c3537lQ4.f32546d);
            } else {
                c3537lQ2 = new C3537lQ(abstractC3627n8, U7.f28688m, C3537lQ.f32544e);
            }
            this.f33515o = c3537lQ2;
        } else {
            U7 u72 = this.f33513m;
            abstractC3627n8.b(0, u72, 0L);
            Object obj = u72.f28690a;
            C3483kQ c3483kQ2 = this.f33516p;
            if (c3483kQ2 != null) {
                this.f33515o.o(c3483kQ2.f32228n.f34406a, this.f33514n);
                this.f33515o.b(0, u72, 0L);
                j6 = c3483kQ2.f32229u;
            }
            j6 = 0;
            Pair m9 = abstractC3627n8.m(u72, this.f33514n, 0, j6);
            Object obj2 = m9.first;
            long longValue = ((Long) m9.second).longValue();
            if (this.f33519s) {
                C3537lQ c3537lQ5 = this.f33515o;
                c3537lQ = new C3537lQ(abstractC3627n8, c3537lQ5.f32545c, c3537lQ5.f32546d);
            } else {
                c3537lQ = new C3537lQ(abstractC3627n8, obj, obj2);
            }
            this.f33515o = c3537lQ;
            C3483kQ c3483kQ3 = this.f33516p;
            if (c3483kQ3 != null && y(longValue)) {
                C3860rQ c3860rQ2 = c3483kQ3.f32228n;
                Object obj3 = this.f33515o.f32546d;
                Object obj4 = c3860rQ2.f34406a;
                if (obj3 != null && obj4.equals(C3537lQ.f32544e)) {
                    obj4 = this.f33515o.f32546d;
                }
                c3860rQ = c3860rQ2.a(obj4);
            }
        }
        this.f33519s = true;
        this.f33518r = true;
        k(this.f33515o);
        if (c3860rQ != null) {
            C3483kQ c3483kQ4 = this.f33516p;
            c3483kQ4.getClass();
            c3483kQ4.l(c3860rQ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC3161eQ
    public final /* bridge */ /* synthetic */ void u(Integer num) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC3161eQ
    public final C3860rQ v(Integer num, C3860rQ c3860rQ) {
        Object obj = this.f33515o.f32546d;
        Object obj2 = c3860rQ.f34406a;
        if (obj != null && obj.equals(obj2)) {
            obj2 = C3537lQ.f32544e;
        }
        return c3860rQ.a(obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC3161eQ
    public final /* synthetic */ void w(Integer num, long j6) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final C3483kQ c(C3860rQ c3860rQ, InterfaceC4049v interfaceC4049v, long j6) {
        C3483kQ c3483kQ = new C3483kQ(c3860rQ, interfaceC4049v, j6);
        AbstractC2792Sd.H(c3483kQ.f32231w == null);
        AbstractC2947aQ abstractC2947aQ = this.f33511k;
        c3483kQ.f32231w = abstractC2947aQ;
        if (!this.f33518r) {
            this.f33516p = c3483kQ;
            if (!this.f33517q) {
                this.f33517q = true;
                t(null, abstractC2947aQ);
            }
            return c3483kQ;
        }
        Object obj = this.f33515o.f32546d;
        Object obj2 = c3860rQ.f34406a;
        if (obj != null && obj2.equals(C3537lQ.f32544e)) {
            obj2 = this.f33515o.f32546d;
        }
        c3483kQ.l(c3860rQ.a(obj2));
        return c3483kQ;
    }

    public final boolean y(long j6) {
        C3483kQ c3483kQ = this.f33516p;
        int e9 = this.f33515o.e(c3483kQ.f32228n.f34406a);
        if (e9 == -1) {
            return false;
        }
        C3537lQ c3537lQ = this.f33515o;
        K7 k72 = this.f33514n;
        c3537lQ.d(e9, k72, false);
        long j9 = k72.f26620d;
        if (j9 != com.anythink.basead.exoplayer.b.f7168b && j6 >= j9) {
            j6 = Math.max(0L, j9 - 1);
        }
        c3483kQ.f32234z = j6;
        return true;
    }
}
