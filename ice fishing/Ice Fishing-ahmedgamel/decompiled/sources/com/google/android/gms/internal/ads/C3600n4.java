package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3600n4 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3543m1 f32676a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f32677b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32678c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32679d;

    /* renamed from: e, reason: collision with root package name */
    public int f32680e;

    /* renamed from: f, reason: collision with root package name */
    public int f32681f;

    /* renamed from: g, reason: collision with root package name */
    public long f32682g;

    /* renamed from: h, reason: collision with root package name */
    public long f32683h;

    public C3600n4(InterfaceC3543m1 interfaceC3543m1) {
        this.f32676a = interfaceC3543m1;
    }

    public final void a(byte[] bArr, int i, int i6) {
        if (this.f32678c) {
            int i9 = this.f32681f;
            int i10 = (i + 1) - i9;
            if (i10 >= i6) {
                this.f32681f = (i6 - i) + i9;
            } else {
                this.f32679d = ((bArr[i10] & 192) >> 6) == 0;
                this.f32678c = false;
            }
        }
    }

    public final void b(int i, long j6, boolean z3) {
        AbstractC2772Sd.H(this.f32683h != com.anythink.basead.exoplayer.b.f6382b);
        if (this.f32680e == 182 && z3 && this.f32677b) {
            long j9 = j6 - this.f32682g;
            this.f32676a.c(this.f32683h, this.f32679d ? 1 : 0, (int) j9, i, null);
        }
        if (this.f32680e != 179) {
            this.f32682g = j6;
        }
    }
}
