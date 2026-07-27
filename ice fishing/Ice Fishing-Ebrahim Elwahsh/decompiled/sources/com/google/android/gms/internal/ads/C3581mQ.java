package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3581mQ implements EQ, OP {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f32695a;

    /* renamed from: b, reason: collision with root package name */
    public NP f32696b;

    /* renamed from: c, reason: collision with root package name */
    public NP f32697c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC3689oQ f32698d;

    public C3581mQ(AbstractC3689oQ abstractC3689oQ, Integer num) {
        Objects.requireNonNull(abstractC3689oQ);
        this.f32698d = abstractC3689oQ;
        this.f32696b = new NP(abstractC3689oQ.f32301c.f26544b, null);
        this.f32697c = new NP(abstractC3689oQ.f32302d.f26544b, null);
        this.f32695a = num;
    }

    public final boolean a(BQ bq) {
        BQ bq2;
        Integer num = this.f32695a;
        AbstractC3689oQ abstractC3689oQ = this.f32698d;
        if (bq != null) {
            bq2 = abstractC3689oQ.v(num, bq);
            if (bq2 == null) {
                return false;
            }
        } else {
            bq2 = null;
        }
        abstractC3689oQ.u(num);
        NP np = this.f32696b;
        np.getClass();
        if (!Objects.equals(np.f26543a, bq2)) {
            this.f32696b = new NP(abstractC3689oQ.f32301c.f26544b, bq2);
        }
        NP np2 = this.f32697c;
        np2.getClass();
        if (Objects.equals(np2.f26543a, bq2)) {
            return true;
        }
        this.f32697c = new NP(abstractC3689oQ.f32302d.f26544b, bq2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.EQ
    public final void b(int i, BQ bq, C4228yQ c4228yQ) {
        if (a(bq)) {
            NP np = this.f32696b;
            c(c4228yQ, bq);
            np.getClass();
            np.a(new C4164xG(18, np, c4228yQ));
        }
    }

    public final void c(C4228yQ c4228yQ, BQ bq) {
        AbstractC3689oQ abstractC3689oQ = this.f32698d;
        Integer num = this.f32695a;
        abstractC3689oQ.w(num, c4228yQ.f35347c);
        abstractC3689oQ.w(num, c4228yQ.f35348d);
    }

    @Override // com.google.android.gms.internal.ads.EQ
    public final void l(int i, BQ bq, C3958tQ c3958tQ, C4228yQ c4228yQ) {
        if (a(bq)) {
            NP np = this.f32696b;
            c(c4228yQ, bq);
            np.getClass();
            np.a(new C3602mu(np, c3958tQ, c4228yQ, 27));
        }
    }

    @Override // com.google.android.gms.internal.ads.EQ
    public final void m(int i, BQ bq, C3958tQ c3958tQ, C4228yQ c4228yQ) {
        if (a(bq)) {
            NP np = this.f32696b;
            c(c4228yQ, bq);
            np.getClass();
            np.a(new C4017ue(np, c3958tQ, c4228yQ, 28));
        }
    }

    @Override // com.google.android.gms.internal.ads.EQ
    public final void p(int i, BQ bq, C3958tQ c3958tQ, C4228yQ c4228yQ, IOException iOException, boolean z8) {
        if (a(bq)) {
            NP np = this.f32696b;
            c(c4228yQ, bq);
            np.getClass();
            np.a(new Zw(np, c3958tQ, c4228yQ, iOException, z8));
        }
    }

    @Override // com.google.android.gms.internal.ads.EQ
    public final void q(int i, BQ bq, C3958tQ c3958tQ, C4228yQ c4228yQ, int i4) {
        if (a(bq)) {
            NP np = this.f32696b;
            c(c4228yQ, bq);
            np.getClass();
            np.a(new O5(np, c3958tQ, c4228yQ, i4));
        }
    }
}
