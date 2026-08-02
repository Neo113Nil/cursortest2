package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3620n1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f33435a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f33436b;

    /* renamed from: c, reason: collision with root package name */
    public int f33437c;

    /* renamed from: d, reason: collision with root package name */
    public long f33438d;

    /* renamed from: e, reason: collision with root package name */
    public int f33439e;

    /* renamed from: f, reason: collision with root package name */
    public int f33440f;

    /* renamed from: g, reason: collision with root package name */
    public int f33441g;

    public final void a(R0 r02) {
        if (this.f33436b) {
            return;
        }
        byte[] bArr = this.f33435a;
        r02.x(bArr, 0, 10);
        r02.l();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f33436b = true;
        }
    }

    public final void b(InterfaceC3566m1 interfaceC3566m1, long j6, int i, int i4, int i6, C3512l1 c3512l1) {
        AbstractC2792Sd.I("TrueHD chunk samples must be contiguous in the sample queue.", this.f33441g <= i4 + i6);
        if (this.f33436b) {
            int i9 = this.f33437c;
            int i10 = i9 + 1;
            this.f33437c = i10;
            if (i9 == 0) {
                this.f33438d = j6;
                this.f33439e = i;
                this.f33440f = 0;
            }
            this.f33440f += i4;
            this.f33441g = i6;
            if (i10 >= 16) {
                c(interfaceC3566m1, c3512l1);
            }
        }
    }

    public final void c(InterfaceC3566m1 interfaceC3566m1, C3512l1 c3512l1) {
        if (this.f33437c > 0) {
            interfaceC3566m1.c(this.f33438d, this.f33439e, this.f33440f, this.f33441g, c3512l1);
            this.f33437c = 0;
        }
    }
}
