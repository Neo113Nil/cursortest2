package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3597n1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f32657a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f32658b;

    /* renamed from: c, reason: collision with root package name */
    public int f32659c;

    /* renamed from: d, reason: collision with root package name */
    public long f32660d;

    /* renamed from: e, reason: collision with root package name */
    public int f32661e;

    /* renamed from: f, reason: collision with root package name */
    public int f32662f;

    /* renamed from: g, reason: collision with root package name */
    public int f32663g;

    public final void a(R0 r02) {
        if (this.f32658b) {
            return;
        }
        byte[] bArr = this.f32657a;
        r02.y(bArr, 0, 10);
        r02.l();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f32658b = true;
        }
    }

    public final void b(InterfaceC3543m1 interfaceC3543m1, long j6, int i, int i6, int i9, C3489l1 c3489l1) {
        AbstractC2772Sd.I("TrueHD chunk samples must be contiguous in the sample queue.", this.f32663g <= i6 + i9);
        if (this.f32658b) {
            int i10 = this.f32659c;
            int i11 = i10 + 1;
            this.f32659c = i11;
            if (i10 == 0) {
                this.f32660d = j6;
                this.f32661e = i;
                this.f32662f = 0;
            }
            this.f32662f += i6;
            this.f32663g = i9;
            if (i11 >= 16) {
                c(interfaceC3543m1, c3489l1);
            }
        }
    }

    public final void c(InterfaceC3543m1 interfaceC3543m1, C3489l1 c3489l1) {
        if (this.f32659c > 0) {
            interfaceC3543m1.c(this.f32660d, this.f32661e, this.f32662f, this.f32663g, c3489l1);
            this.f32659c = 0;
        }
    }
}
