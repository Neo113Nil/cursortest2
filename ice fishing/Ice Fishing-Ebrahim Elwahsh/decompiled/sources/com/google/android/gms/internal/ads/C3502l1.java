package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3502l1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f32511a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f32512b;

    /* renamed from: c, reason: collision with root package name */
    public int f32513c;

    /* renamed from: d, reason: collision with root package name */
    public long f32514d;

    /* renamed from: e, reason: collision with root package name */
    public int f32515e;

    /* renamed from: f, reason: collision with root package name */
    public int f32516f;

    /* renamed from: g, reason: collision with root package name */
    public int f32517g;

    public final void a(P0 p02) {
        if (this.f32512b) {
            return;
        }
        byte[] bArr = this.f32511a;
        p02.B(bArr, 0, 10);
        p02.k();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f32512b = true;
        }
    }

    public final void b(InterfaceC3448k1 interfaceC3448k1, long j9, int i, int i4, int i9, C3394j1 c3394j1) {
        PA.U("TrueHD chunk samples must be contiguous in the sample queue.", this.f32517g <= i4 + i9);
        if (this.f32512b) {
            int i10 = this.f32513c;
            int i11 = i10 + 1;
            this.f32513c = i11;
            if (i10 == 0) {
                this.f32514d = j9;
                this.f32515e = i;
                this.f32516f = 0;
            }
            this.f32516f += i4;
            this.f32517g = i9;
            if (i11 >= 16) {
                c(interfaceC3448k1, c3394j1);
            }
        }
    }

    public final void c(InterfaceC3448k1 interfaceC3448k1, C3394j1 c3394j1) {
        if (this.f32513c > 0) {
            interfaceC3448k1.b(this.f32514d, this.f32515e, this.f32516f, this.f32517g, c3394j1);
            this.f32513c = 0;
        }
    }
}
