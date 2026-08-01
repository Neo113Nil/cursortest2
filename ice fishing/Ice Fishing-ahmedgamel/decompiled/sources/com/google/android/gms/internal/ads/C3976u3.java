package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.u3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3976u3 implements InterfaceC3543m1 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3543m1 f34465a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3814r3 f34466b;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC3868s3 f34471g;

    /* renamed from: h, reason: collision with root package name */
    public DP f34472h;
    public boolean i;

    /* renamed from: d, reason: collision with root package name */
    public int f34468d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f34469e = 0;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f34470f = AbstractC3159eu.f29994b;

    /* renamed from: c, reason: collision with root package name */
    public final Cr f34467c = new Cr();

    public C3976u3(InterfaceC3543m1 interfaceC3543m1, InterfaceC3814r3 interfaceC3814r3) {
        this.f34465a = interfaceC3543m1;
        this.f34466b = interfaceC3814r3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    public final int b(InterfaceC4050vN interfaceC4050vN, int i, boolean z3) {
        if (this.f34471g == null) {
            return this.f34465a.b(interfaceC4050vN, i, z3);
        }
        g(i);
        int m4 = interfaceC4050vN.m(this.f34470f, this.f34469e, i);
        if (m4 != -1) {
            this.f34469e += m4;
            return m4;
        }
        if (z3) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    public final void c(long j6, int i, int i6, int i9, C3489l1 c3489l1) {
        if (this.f34471g == null) {
            this.f34465a.c(j6, i, i6, i9, c3489l1);
            return;
        }
        AbstractC2772Sd.q("DRM on subtitles is not supported", c3489l1 == null);
        int i10 = (this.f34469e - i9) - i6;
        try {
            this.f34471g.h(this.f34470f, i10, i6, new X1.b(this, j6, i));
        } catch (RuntimeException e9) {
            if (!this.i) {
                throw e9;
            }
            AbstractC2968bG.C("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e9);
        }
        int i11 = i10 + i6;
        this.f34468d = i11;
        if (i11 == this.f34469e) {
            this.f34468d = 0;
            this.f34469e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    public final void e(DP dp) {
        String str = dp.f24431o;
        str.getClass();
        AbstractC2772Sd.i(H4.f(str) == 3);
        boolean equals = dp.equals(this.f34472h);
        InterfaceC3814r3 interfaceC3814r3 = this.f34466b;
        if (!equals) {
            this.f34472h = dp;
            this.f34471g = interfaceC3814r3.f(dp) ? interfaceC3814r3.k(dp) : null;
        }
        InterfaceC3868s3 interfaceC3868s3 = this.f34471g;
        InterfaceC3543m1 interfaceC3543m1 = this.f34465a;
        if (interfaceC3868s3 == null) {
            interfaceC3543m1.e(dp);
            return;
        }
        C3299hP c3299hP = new C3299hP(dp);
        c3299hP.e("application/x-media3-cues");
        c3299hP.f30788j = str;
        c3299hP.f30797s = Long.MAX_VALUE;
        c3299hP.f30778N = interfaceC3814r3.j(dp);
        interfaceC3543m1.e(new DP(c3299hP));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    public final void f(Cr cr, int i, int i6) {
        if (this.f34471g == null) {
            this.f34465a.f(cr, i, i6);
            return;
        }
        g(i);
        cr.H(this.f34470f, this.f34469e, i);
        this.f34469e += i;
    }

    public final void g(int i) {
        int length = this.f34470f.length;
        int i6 = this.f34469e;
        if (length - i6 >= i) {
            return;
        }
        int i9 = i6 - this.f34468d;
        int max = Math.max(i9 + i9, i + i9);
        byte[] bArr = this.f34470f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.f34468d, bArr2, 0, i9);
        this.f34468d = 0;
        this.f34469e = i9;
        this.f34470f = bArr2;
    }
}
