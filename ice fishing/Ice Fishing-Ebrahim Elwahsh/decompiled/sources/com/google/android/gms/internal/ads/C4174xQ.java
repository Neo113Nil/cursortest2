package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.xQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4174xQ extends AbstractC3689oQ {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC3473kQ f35174k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f35175l;

    /* renamed from: m, reason: collision with root package name */
    public final Y7 f35176m;

    /* renamed from: n, reason: collision with root package name */
    public final L7 f35177n;

    /* renamed from: o, reason: collision with root package name */
    public C4066vQ f35178o;

    /* renamed from: p, reason: collision with root package name */
    public C4012uQ f35179p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f35180q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f35181r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f35182s;

    public C4174xQ(AbstractC3473kQ abstractC3473kQ, boolean z8) {
        boolean z9;
        this.f35174k = abstractC3473kQ;
        if (z8) {
            abstractC3473kQ.e();
            z9 = true;
        } else {
            z9 = false;
        }
        this.f35175l = z9;
        this.f35176m = new Y7();
        this.f35177n = new L7();
        abstractC3473kQ.d();
        this.f35178o = new C4066vQ(new C4120wQ(abstractC3473kQ.f()), Y7.f28792m, C4066vQ.f34798e);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final void a(C3235g2 c3235g2) {
        if (this.f35182s) {
            C4066vQ c4066vQ = this.f35178o;
            AbstractC3832r8 abstractC3832r8 = c4066vQ.f34040b;
            int i = C2987bR.f29501d;
            this.f35178o = new C4066vQ(abstractC3832r8 instanceof C2987bR ? new C2987bR(((C2987bR) abstractC3832r8).f34040b, c3235g2) : new C2987bR(abstractC3832r8, c3235g2), c4066vQ.f34799c, c4066vQ.f34800d);
        } else {
            this.f35178o = new C4066vQ(new C4120wQ(c3235g2), Y7.f28792m, C4066vQ.f34798e);
        }
        this.f35174k.a(c3235g2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final void b(AQ aq) {
        C4012uQ c4012uQ = (C4012uQ) aq;
        AQ aq2 = c4012uQ.f34596x;
        if (aq2 != null) {
            AbstractC3473kQ abstractC3473kQ = c4012uQ.f34595w;
            abstractC3473kQ.getClass();
            abstractC3473kQ.b(aq2);
        }
        if (aq == this.f35179p) {
            this.f35179p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final void d() {
        this.f35174k.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final void e() {
        this.f35174k.e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final C3235g2 f() {
        return this.f35174k.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final void h(A a9) {
        this.f33143j = AbstractC3548lu.p();
        if (this.f35175l) {
            return;
        }
        this.f35180q = true;
        t(null, this.f35174k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3689oQ, com.google.android.gms.internal.ads.AbstractC3473kQ
    public final void j() {
        this.f35181r = false;
        this.f35180q = false;
        super.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r4 != 0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC3689oQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(Integer num, AbstractC3473kQ abstractC3473kQ, AbstractC3832r8 abstractC3832r8) {
        long j9;
        C4066vQ c4066vQ;
        C4066vQ c4066vQ2;
        BQ bq = null;
        if (this.f35181r) {
            C4066vQ c4066vQ3 = this.f35178o;
            this.f35178o = new C4066vQ(abstractC3832r8, c4066vQ3.f34799c, c4066vQ3.f34800d);
            C4012uQ c4012uQ = this.f35179p;
            if (c4012uQ != null) {
                y(c4012uQ.f34598z);
            }
        } else if (abstractC3832r8.g()) {
            if (this.f35182s) {
                C4066vQ c4066vQ4 = this.f35178o;
                c4066vQ2 = new C4066vQ(abstractC3832r8, c4066vQ4.f34799c, c4066vQ4.f34800d);
            } else {
                c4066vQ2 = new C4066vQ(abstractC3832r8, Y7.f28792m, C4066vQ.f34798e);
            }
            this.f35178o = c4066vQ2;
        } else {
            Y7 y72 = this.f35176m;
            abstractC3832r8.b(0, y72, 0L);
            Object obj = y72.f28794a;
            C4012uQ c4012uQ2 = this.f35179p;
            if (c4012uQ2 != null) {
                this.f35178o.o(c4012uQ2.f34592n.f24043a, this.f35177n);
                this.f35178o.b(0, y72, 0L);
                j9 = c4012uQ2.f34593u;
            }
            j9 = 0;
            Pair m8 = abstractC3832r8.m(y72, this.f35177n, 0, j9);
            Object obj2 = m8.first;
            long longValue = ((Long) m8.second).longValue();
            if (this.f35182s) {
                C4066vQ c4066vQ5 = this.f35178o;
                c4066vQ = new C4066vQ(abstractC3832r8, c4066vQ5.f34799c, c4066vQ5.f34800d);
            } else {
                c4066vQ = new C4066vQ(abstractC3832r8, obj, obj2);
            }
            this.f35178o = c4066vQ;
            C4012uQ c4012uQ3 = this.f35179p;
            if (c4012uQ3 != null && y(longValue)) {
                BQ bq2 = c4012uQ3.f34592n;
                Object obj3 = this.f35178o.f34800d;
                Object obj4 = bq2.f24043a;
                if (obj3 != null && obj4.equals(C4066vQ.f34798e)) {
                    obj4 = this.f35178o.f34800d;
                }
                bq = bq2.a(obj4);
            }
        }
        this.f35182s = true;
        this.f35181r = true;
        k(this.f35178o);
        if (bq != null) {
            C4012uQ c4012uQ4 = this.f35179p;
            c4012uQ4.getClass();
            c4012uQ4.n(bq);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC3689oQ
    public final /* bridge */ /* synthetic */ void u(Integer num) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC3689oQ
    public final BQ v(Integer num, BQ bq) {
        Object obj = this.f35178o.f34800d;
        Object obj2 = bq.f24043a;
        if (obj != null && obj.equals(obj2)) {
            obj2 = C4066vQ.f34798e;
        }
        return bq.a(obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC3689oQ
    public final /* synthetic */ void w(Integer num, long j9) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final C4012uQ c(BQ bq, InterfaceC3985u interfaceC3985u, long j9) {
        C4012uQ c4012uQ = new C4012uQ(bq, interfaceC3985u, j9);
        PA.T(c4012uQ.f34595w == null);
        AbstractC3473kQ abstractC3473kQ = this.f35174k;
        c4012uQ.f34595w = abstractC3473kQ;
        if (!this.f35181r) {
            this.f35179p = c4012uQ;
            if (!this.f35180q) {
                this.f35180q = true;
                t(null, abstractC3473kQ);
            }
            return c4012uQ;
        }
        Object obj = this.f35178o.f34800d;
        Object obj2 = bq.f24043a;
        if (obj != null && obj2.equals(C4066vQ.f34798e)) {
            obj2 = this.f35178o.f34800d;
        }
        c4012uQ.n(bq.a(obj2));
        return c4012uQ;
    }

    public final boolean y(long j9) {
        C4012uQ c4012uQ = this.f35179p;
        int e6 = this.f35178o.e(c4012uQ.f34592n.f24043a);
        if (e6 == -1) {
            return false;
        }
        C4066vQ c4066vQ = this.f35178o;
        L7 l72 = this.f35177n;
        c4066vQ.d(e6, l72, false);
        long j10 = l72.f26109d;
        if (j10 != com.anythink.basead.exoplayer.b.f6539b && j9 >= j10) {
            j9 = Math.max(0L, j10 - 1);
        }
        c4012uQ.f34598z = j9;
        return true;
    }
}
