package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.uP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3998uP extends AbstractC3631ni {
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f34535j;

    /* renamed from: k, reason: collision with root package name */
    public int f34536k;

    /* renamed from: l, reason: collision with root package name */
    public long f34537l;

    /* renamed from: m, reason: collision with root package name */
    public int f34538m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f34539n;

    /* renamed from: o, reason: collision with root package name */
    public int f34540o;

    /* renamed from: p, reason: collision with root package name */
    public int f34541p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f34542q;

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public final void a(ByteBuffer byteBuffer) {
        int limit;
        int i;
        int position;
        while (byteBuffer.hasRemaining() && !this.f32758g.hasRemaining()) {
            if (this.f34536k != 0) {
                AbstractC2772Sd.H(this.f34540o < this.f34539n.length);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > 1024) {
                        int i6 = this.i;
                        limit = (position2 / i6) * i6;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i9 = this.f34540o;
                int i10 = this.f34541p;
                int i11 = i9 + i10;
                int length = this.f34539n.length;
                if (i11 < length) {
                    i = length - i11;
                } else {
                    i11 = i10 - (length - i9);
                    i = i9 - i11;
                }
                int min = Math.min(position3, i);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.f34539n, i11, min);
                int i12 = this.f34541p + min;
                this.f34541p = i12;
                AbstractC2772Sd.H(i12 <= this.f34539n.length);
                boolean z3 = limit < limit2 && position3 < i;
                o(z3);
                if (z3) {
                    this.f34536k = 0;
                    this.f34538m = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f34539n.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit4) << 8) | (byteBuffer.get(limit4 - 1) & 255)) > 1024) {
                        int i13 = this.i;
                        position = ((limit4 / i13) * i13) + i13;
                        break;
                    }
                    limit4 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.f34536k = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    g(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3631ni, com.google.android.gms.internal.ads.InterfaceC3147ei
    public final boolean i() {
        return super.i() && this.f34535j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3631ni
    public final C3630nh k(C3630nh c3630nh) {
        if (c3630nh.f32751c == 2) {
            return c3630nh.f32749a == -1 ? C3630nh.f32748e : c3630nh;
        }
        throw new C2840Wh("Unhandled input format:", c3630nh);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3631ni
    public final void l() {
        if (this.f34541p > 0) {
            o(true);
            this.f34538m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3631ni
    public final void m() {
        if (i()) {
            int i = this.f32753b.f32750b;
            int i6 = i + i;
            this.i = i6;
            int i9 = ((((int) ((100000 * r0.f32749a) / 1000000)) / 2) / i6) * i6;
            int i10 = i9 + i9;
            if (this.f34539n.length != i10) {
                this.f34539n = new byte[i10];
                this.f34542q = new byte[i10];
            }
        }
        this.f34536k = 0;
        this.f34537l = 0L;
        this.f34538m = 0;
        this.f34540o = 0;
        this.f34541p = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3631ni
    public final void n() {
        this.f34535j = false;
        byte[] bArr = AbstractC3159eu.f29994b;
        this.f34539n = bArr;
        this.f34542q = bArr;
    }

    public final void o(boolean z3) {
        int i;
        int i6;
        int i9 = this.f34541p;
        int length = this.f34539n.length;
        if (i9 != length) {
            if (!z3) {
                return;
            } else {
                z3 = true;
            }
        }
        if (this.f34538m == 0) {
            if (z3) {
                q(i9, 3);
                i6 = i9;
            } else {
                AbstractC2772Sd.H(i9 >= (length >> 1));
                i6 = this.f34539n.length >> 1;
                q(i6, 0);
            }
            i = i6;
        } else {
            int i10 = length >> 1;
            int i11 = i9 - i10;
            if (z3) {
                int p9 = p(i11) + (this.f34539n.length >> 1);
                q(p9, 2);
                int i12 = i10 + i11;
                i = p9;
                i6 = i12;
            } else {
                int p10 = p(i11);
                q(p10, 1);
                i = p10;
                i6 = i11;
            }
        }
        if (i6 % this.i != 0) {
            throw new IllegalStateException(AbstractC2639Kg.x("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(i6)));
        }
        AbstractC2772Sd.H(i9 >= i);
        this.f34541p -= i6;
        int i13 = this.f34540o + i6;
        this.f34540o = i13;
        this.f34540o = i13 % this.f34539n.length;
        this.f34538m = (i / this.i) + this.f34538m;
        this.f34537l += (i6 - i) / r2;
    }

    public final int p(int i) {
        int length = ((((int) ((2000000 * this.f32753b.f32749a) / 1000000)) - this.f34538m) * this.i) - (this.f34539n.length >> 1);
        AbstractC2772Sd.H(length >= 0);
        int min = (int) Math.min((i * 0.2f) + 0.5f, length);
        int i6 = this.i;
        return (min / i6) * i6;
    }

    public final void q(int i, int i6) {
        int i9;
        if (i == 0) {
            return;
        }
        AbstractC2772Sd.i(this.f34541p >= i);
        if (i6 == 2) {
            int i10 = this.f34540o;
            int i11 = this.f34541p;
            int i12 = i10 + i11;
            byte[] bArr = this.f34539n;
            int length = bArr.length;
            if (i12 <= length) {
                System.arraycopy(bArr, i12 - i, this.f34542q, 0, i);
            } else {
                int i13 = i11 - (length - i10);
                if (i13 >= i) {
                    System.arraycopy(bArr, i13 - i, this.f34542q, 0, i);
                } else {
                    int i14 = i - i13;
                    System.arraycopy(bArr, length - i14, this.f34542q, 0, i14);
                    System.arraycopy(this.f34539n, 0, this.f34542q, i14, i13);
                }
            }
        } else {
            int i15 = this.f34540o;
            int i16 = i15 + i;
            byte[] bArr2 = this.f34539n;
            int length2 = bArr2.length;
            if (i16 <= length2) {
                System.arraycopy(bArr2, i15, this.f34542q, 0, i);
            } else {
                int i17 = length2 - i15;
                System.arraycopy(bArr2, i15, this.f34542q, 0, i17);
                System.arraycopy(this.f34539n, 0, this.f34542q, i17, i - i17);
            }
        }
        AbstractC2772Sd.w(i, "sizeToOutput is not aligned to frame size: %s", i % this.i == 0);
        AbstractC2772Sd.H(this.f34540o < this.f34539n.length);
        byte[] bArr3 = this.f34542q;
        AbstractC2772Sd.w(i, "byteOutput size is not aligned to frame size %s", i % this.i == 0);
        if (i6 != 3) {
            for (int i18 = 0; i18 < i; i18 += 2) {
                int i19 = i18 + 1;
                int i20 = (bArr3[i19] << 8) | (bArr3[i18] & 255);
                if (i6 == 0) {
                    i9 = ((((i18 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i9 = 10;
                    if (i6 == 2) {
                        i9 = 10 + (((com.anythink.expressad.foundation.g.a.bQ * i18) / (i - 1)) / 1000);
                    }
                }
                int i21 = (i20 * i9) / 100;
                if (i21 >= 32767) {
                    bArr3[i18] = -1;
                    bArr3[i19] = Byte.MAX_VALUE;
                } else if (i21 <= -32768) {
                    bArr3[i18] = 0;
                    bArr3[i19] = com.anythink.core.common.s.a.c.f16316a;
                } else {
                    bArr3[i18] = (byte) (i21 & com.anythink.basead.exoplayer.k.p.f8473b);
                    bArr3[i19] = (byte) (i21 >> 8);
                }
            }
        }
        g(i).put(bArr3, 0, i).flip();
    }
}
