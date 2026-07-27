package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ZP implements InterfaceC3837rQ, BP {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f28885a;

    /* renamed from: b, reason: collision with root package name */
    public AP f28886b;

    /* renamed from: c, reason: collision with root package name */
    public AP f28887c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC2978bQ f28888d;

    public ZP(AbstractC2978bQ abstractC2978bQ, Integer num) {
        Objects.requireNonNull(abstractC2978bQ);
        this.f28888d = abstractC2978bQ;
        C3676oQ c3676oQ = null;
        this.f28886b = new AP(abstractC2978bQ.f28526c.f23676b, c3676oQ);
        this.f28887c = new AP(abstractC2978bQ.f28527d.f23676b, c3676oQ);
        this.f28885a = num;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837rQ
    public final void a(int i, C3676oQ c3676oQ, C3514lQ c3514lQ) {
        if (c(c3676oQ)) {
            AP ap = this.f28886b;
            d(c3514lQ, c3676oQ);
            ap.getClass();
            ap.a(new S0.s(26, ap, c3514lQ));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837rQ
    public final void b(int i, C3676oQ c3676oQ, C3246gQ c3246gQ, C3514lQ c3514lQ, int i6) {
        if (c(c3676oQ)) {
            AP ap = this.f28886b;
            d(c3514lQ, c3676oQ);
            ap.getClass();
            ap.a(new R5(ap, c3246gQ, c3514lQ, i6));
        }
    }

    public final boolean c(C3676oQ c3676oQ) {
        C3676oQ c3676oQ2;
        Integer num = this.f28885a;
        AbstractC2978bQ abstractC2978bQ = this.f28888d;
        if (c3676oQ != null) {
            c3676oQ2 = abstractC2978bQ.v(num, c3676oQ);
            if (c3676oQ2 == null) {
                return false;
            }
        } else {
            c3676oQ2 = null;
        }
        abstractC2978bQ.u(num);
        AP ap = this.f28886b;
        ap.getClass();
        if (!Objects.equals(ap.f23675a, c3676oQ2)) {
            this.f28886b = new AP(abstractC2978bQ.f28526c.f23676b, c3676oQ2);
        }
        AP ap2 = this.f28887c;
        ap2.getClass();
        if (Objects.equals(ap2.f23675a, c3676oQ2)) {
            return true;
        }
        this.f28887c = new AP(abstractC2978bQ.f28527d.f23676b, c3676oQ2);
        return true;
    }

    public final void d(C3514lQ c3514lQ, C3676oQ c3676oQ) {
        AbstractC2978bQ abstractC2978bQ = this.f28888d;
        Integer num = this.f28885a;
        abstractC2978bQ.w(num, c3514lQ.f31766c);
        abstractC2978bQ.w(num, c3514lQ.f31767d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837rQ
    public final void n(int i, C3676oQ c3676oQ, C3246gQ c3246gQ, C3514lQ c3514lQ, IOException iOException, boolean z3) {
        if (c(c3676oQ)) {
            AP ap = this.f28886b;
            d(c3514lQ, c3676oQ);
            ap.getClass();
            ap.a(new Xw(ap, c3246gQ, c3514lQ, iOException, z3));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837rQ
    public final void p(int i, C3676oQ c3676oQ, C3246gQ c3246gQ, C3514lQ c3514lQ) {
        if (c(c3676oQ)) {
            AP ap = this.f28886b;
            d(c3514lQ, c3676oQ);
            ap.getClass();
            ap.a(new C3481ku(27, ap, c3246gQ, c3514lQ));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837rQ
    public final void q(int i, C3676oQ c3676oQ, C3246gQ c3246gQ, C3514lQ c3514lQ) {
        if (c(c3676oQ)) {
            AP ap = this.f28886b;
            d(c3514lQ, c3676oQ);
            ap.getClass();
            ap.a(new C4274ze(28, ap, c3246gQ, c3514lQ));
        }
    }
}
