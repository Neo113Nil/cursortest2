package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.u3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3999u3 implements InterfaceC3566m1 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3566m1 f35239a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3837r3 f35240b;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC3891s3 f35245g;

    /* renamed from: h, reason: collision with root package name */
    public DP f35246h;
    public boolean i;

    /* renamed from: d, reason: collision with root package name */
    public int f35242d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f35243e = 0;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f35244f = AbstractC3182eu.f30783b;

    /* renamed from: c, reason: collision with root package name */
    public final Cr f35241c = new Cr();

    public C3999u3(InterfaceC3566m1 interfaceC3566m1, InterfaceC3837r3 interfaceC3837r3) {
        this.f35239a = interfaceC3566m1;
        this.f35240b = interfaceC3837r3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    public final int b(InterfaceC4073vN interfaceC4073vN, int i, boolean z6) {
        if (this.f35245g == null) {
            return this.f35239a.b(interfaceC4073vN, i, z6);
        }
        g(i);
        int r9 = interfaceC4073vN.r(this.f35244f, this.f35243e, i);
        if (r9 != -1) {
            this.f35243e += r9;
            return r9;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    public final void c(long j6, int i, int i4, int i6, C3512l1 c3512l1) {
        if (this.f35245g == null) {
            this.f35239a.c(j6, i, i4, i6, c3512l1);
            return;
        }
        AbstractC2792Sd.q("DRM on subtitles is not supported", c3512l1 == null);
        int i9 = (this.f35243e - i6) - i4;
        try {
            this.f35245g.x(this.f35244f, i9, i4, new Z1.b(this, j6, i));
        } catch (RuntimeException e9) {
            if (!this.i) {
                throw e9;
            }
            AbstractC2991bG.C("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e9);
        }
        int i10 = i9 + i4;
        this.f35242d = i10;
        if (i10 == this.f35243e) {
            this.f35242d = 0;
            this.f35243e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    public final void e(DP dp) {
        String str = dp.f25176o;
        str.getClass();
        AbstractC2792Sd.i(H4.f(str) == 3);
        boolean equals = dp.equals(this.f35246h);
        InterfaceC3837r3 interfaceC3837r3 = this.f35240b;
        if (!equals) {
            this.f35246h = dp;
            this.f35245g = interfaceC3837r3.f(dp) ? interfaceC3837r3.k(dp) : null;
        }
        InterfaceC3891s3 interfaceC3891s3 = this.f35245g;
        InterfaceC3566m1 interfaceC3566m1 = this.f35239a;
        if (interfaceC3891s3 == null) {
            interfaceC3566m1.e(dp);
            return;
        }
        C3322hP c3322hP = new C3322hP(dp);
        c3322hP.e("application/x-media3-cues");
        c3322hP.f31554j = str;
        c3322hP.f31563s = Long.MAX_VALUE;
        c3322hP.f31544N = interfaceC3837r3.j(dp);
        interfaceC3566m1.e(new DP(c3322hP));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    public final void f(Cr cr, int i, int i4) {
        if (this.f35245g == null) {
            this.f35239a.f(cr, i, i4);
            return;
        }
        g(i);
        cr.H(this.f35244f, this.f35243e, i);
        this.f35243e += i;
    }

    public final void g(int i) {
        int length = this.f35244f.length;
        int i4 = this.f35243e;
        if (length - i4 >= i) {
            return;
        }
        int i6 = i4 - this.f35242d;
        int max = Math.max(i6 + i6, i + i6);
        byte[] bArr = this.f35244f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.f35242d, bArr2, 0, i6);
        this.f35242d = 0;
        this.f35243e = i6;
        this.f35244f = bArr2;
    }
}
