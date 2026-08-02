package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3623n4 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3566m1 f33454a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33455b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33456c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f33457d;

    /* renamed from: e, reason: collision with root package name */
    public int f33458e;

    /* renamed from: f, reason: collision with root package name */
    public int f33459f;

    /* renamed from: g, reason: collision with root package name */
    public long f33460g;

    /* renamed from: h, reason: collision with root package name */
    public long f33461h;

    public C3623n4(InterfaceC3566m1 interfaceC3566m1) {
        this.f33454a = interfaceC3566m1;
    }

    public final void a(byte[] bArr, int i, int i4) {
        if (this.f33456c) {
            int i6 = this.f33459f;
            int i9 = (i + 1) - i6;
            if (i9 >= i4) {
                this.f33459f = (i4 - i) + i6;
            } else {
                this.f33457d = ((bArr[i9] & 192) >> 6) == 0;
                this.f33456c = false;
            }
        }
    }

    public final void b(int i, long j6, boolean z6) {
        AbstractC2792Sd.H(this.f33461h != com.anythink.basead.exoplayer.b.f7168b);
        if (this.f33458e == 182 && z6 && this.f33455b) {
            long j9 = j6 - this.f33460g;
            this.f33454a.c(this.f33461h, this.f33457d ? 1 : 0, (int) j9, i, null);
        }
        if (this.f33458e != 179) {
            this.f33460g = j6;
        }
    }
}
