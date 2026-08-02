package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.cQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3054cQ implements InterfaceC4022uQ, BP {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f30279a;

    /* renamed from: b, reason: collision with root package name */
    public AP f30280b;

    /* renamed from: c, reason: collision with root package name */
    public AP f30281c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC3161eQ f30282d;

    public C3054cQ(AbstractC3161eQ abstractC3161eQ, Integer num) {
        Objects.requireNonNull(abstractC3161eQ);
        this.f30282d = abstractC3161eQ;
        C3860rQ c3860rQ = null;
        this.f30280b = new AP(abstractC3161eQ.f29827c.f24456b, c3860rQ);
        this.f30281c = new AP(abstractC3161eQ.f29828d.f24456b, c3860rQ);
        this.f30279a = num;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4022uQ
    public final void a(int i, C3860rQ c3860rQ, C3699oQ c3699oQ) {
        if (c(c3860rQ)) {
            AP ap = this.f30280b;
            d(c3699oQ, c3860rQ);
            ap.getClass();
            ap.a(new S0.s(28, ap, c3699oQ));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4022uQ
    public final void b(int i, C3860rQ c3860rQ, C3429jQ c3429jQ, C3699oQ c3699oQ, int i4) {
        if (c(c3860rQ)) {
            AP ap = this.f30280b;
            d(c3699oQ, c3860rQ);
            ap.getClass();
            ap.a(new R5(ap, c3429jQ, c3699oQ, i4));
        }
    }

    public final boolean c(C3860rQ c3860rQ) {
        C3860rQ c3860rQ2;
        Integer num = this.f30279a;
        AbstractC3161eQ abstractC3161eQ = this.f30282d;
        if (c3860rQ != null) {
            c3860rQ2 = abstractC3161eQ.v(num, c3860rQ);
            if (c3860rQ2 == null) {
                return false;
            }
        } else {
            c3860rQ2 = null;
        }
        abstractC3161eQ.u(num);
        AP ap = this.f30280b;
        ap.getClass();
        if (!Objects.equals(ap.f24455a, c3860rQ2)) {
            this.f30280b = new AP(abstractC3161eQ.f29827c.f24456b, c3860rQ2);
        }
        AP ap2 = this.f30281c;
        ap2.getClass();
        if (Objects.equals(ap2.f24455a, c3860rQ2)) {
            return true;
        }
        this.f30281c = new AP(abstractC3161eQ.f29828d.f24456b, c3860rQ2);
        return true;
    }

    public final void d(C3699oQ c3699oQ, C3860rQ c3860rQ) {
        AbstractC3161eQ abstractC3161eQ = this.f30282d;
        Integer num = this.f30279a;
        abstractC3161eQ.w(num, c3699oQ.f33694c);
        abstractC3161eQ.w(num, c3699oQ.f33695d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4022uQ
    public final void n(int i, C3860rQ c3860rQ, C3429jQ c3429jQ, C3699oQ c3699oQ, IOException iOException, boolean z6) {
        if (c(c3860rQ)) {
            AP ap = this.f30280b;
            d(c3699oQ, c3860rQ);
            ap.getClass();
            ap.a(new Xw(ap, c3429jQ, c3699oQ, iOException, z6));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4022uQ
    public final void p(int i, C3860rQ c3860rQ, C3429jQ c3429jQ, C3699oQ c3699oQ) {
        if (c(c3860rQ)) {
            AP ap = this.f30280b;
            d(c3699oQ, c3860rQ);
            ap.getClass();
            ap.a(new C3504ku(27, ap, c3429jQ, c3699oQ));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4022uQ
    public final void q(int i, C3860rQ c3860rQ, C3429jQ c3429jQ, C3699oQ c3699oQ) {
        if (c(c3860rQ)) {
            AP ap = this.f30280b;
            d(c3699oQ, c3860rQ);
            ap.getClass();
            ap.a(new C4297ze(28, ap, c3429jQ, c3699oQ));
        }
    }
}
