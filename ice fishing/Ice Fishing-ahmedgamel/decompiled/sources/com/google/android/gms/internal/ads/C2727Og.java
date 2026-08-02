package com.google.android.gms.internal.ads;

import A1.AbstractC0269k;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Og, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2727Og extends AbstractC0269k {

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC4084vh f27404v;

    /* renamed from: w, reason: collision with root package name */
    public final AbstractC2862Wg f27405w;

    /* renamed from: x, reason: collision with root package name */
    public final String f27406x;

    /* renamed from: y, reason: collision with root package name */
    public final String[] f27407y;

    public C2727Og(InterfaceC4084vh interfaceC4084vh, AbstractC2862Wg abstractC2862Wg, String str, String[] strArr) {
        super(4);
        this.f27404v = interfaceC4084vh;
        this.f27405w = abstractC2862Wg;
        this.f27406x = str;
        this.f27407y = strArr;
        C4906k.f40186C.f40187A.f27628n.add(this);
    }

    @Override // A1.AbstractC0269k
    public final void k() {
        try {
            this.f27405w.d(this.f27406x, this.f27407y);
        } finally {
            w2.D.f41627l.post(new RunnableC3134e(this));
        }
    }

    @Override // A1.AbstractC0269k
    public final P3.a l() {
        return (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32779D2)).booleanValue() && (this.f27405w instanceof C3009bh)) ? AbstractC3436jg.f32060f.b(new CallableC3572m7(2, this)) : super.l();
    }
}
