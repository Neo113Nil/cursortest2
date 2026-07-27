package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.xP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4160xP extends AbstractC3631ni {
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f35013j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35014k;

    /* renamed from: l, reason: collision with root package name */
    public int f35015l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f35016m;

    /* renamed from: n, reason: collision with root package name */
    public int f35017n;

    /* renamed from: o, reason: collision with root package name */
    public long f35018o;

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.f35015l);
        this.f35018o += min / this.f32753b.f32752d;
        this.f35015l -= min;
        byteBuffer.position(position + min);
        if (this.f35015l <= 0) {
            int i6 = i - min;
            int length = (this.f35017n + i6) - this.f35016m.length;
            ByteBuffer g4 = g(length);
            int i9 = this.f35017n;
            String str = AbstractC3159eu.f29993a;
            int max = Math.max(0, Math.min(length, i9));
            g4.put(this.f35016m, 0, max);
            int max2 = Math.max(0, Math.min(length - max, i6));
            byteBuffer.limit(byteBuffer.position() + max2);
            g4.put(byteBuffer);
            byteBuffer.limit(limit);
            int i10 = i6 - max2;
            int i11 = this.f35017n - max;
            this.f35017n = i11;
            byte[] bArr = this.f35016m;
            System.arraycopy(bArr, max, bArr, 0, i11);
            byteBuffer.get(this.f35016m, this.f35017n, i10);
            this.f35017n += i10;
            g4.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public final long b(long j6) {
        return Math.max(0L, j6 - AbstractC3159eu.v(this.f32753b.f32749a, this.f35013j + this.i));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3631ni, com.google.android.gms.internal.ads.InterfaceC3147ei
    public final ByteBuffer e() {
        int i;
        if (super.h() && (i = this.f35017n) > 0) {
            g(i).put(this.f35016m, 0, this.f35017n).flip();
            this.f35017n = 0;
        }
        return super.e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3631ni, com.google.android.gms.internal.ads.InterfaceC3147ei
    public final boolean h() {
        return super.h() && this.f35017n == 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3631ni
    public final C3630nh k(C3630nh c3630nh) {
        if (!AbstractC3159eu.d(c3630nh.f32751c)) {
            throw new C2840Wh("Unhandled input format:", c3630nh);
        }
        this.f35014k = true;
        return (this.i == 0 && this.f35013j == 0) ? C3630nh.f32748e : c3630nh;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3631ni
    public final void l() {
        if (this.f35014k) {
            if (this.f35017n > 0) {
                this.f35018o += r0 / this.f32753b.f32752d;
            }
            this.f35017n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3631ni
    public final void m() {
        if (this.f35014k) {
            this.f35014k = false;
            int i = this.f35013j;
            int i6 = this.f32753b.f32752d;
            this.f35016m = new byte[i * i6];
            this.f35015l = this.i * i6;
        }
        this.f35017n = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3631ni
    public final void n() {
        this.f35016m = AbstractC3159eu.f29994b;
    }
}
