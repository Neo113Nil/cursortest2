package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.uP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4021uP extends AbstractC3654ni {
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f35309j;

    /* renamed from: k, reason: collision with root package name */
    public int f35310k;

    /* renamed from: l, reason: collision with root package name */
    public long f35311l;

    /* renamed from: m, reason: collision with root package name */
    public int f35312m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f35313n;

    /* renamed from: o, reason: collision with root package name */
    public int f35314o;

    /* renamed from: p, reason: collision with root package name */
    public int f35315p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f35316q;

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public final void a(ByteBuffer byteBuffer) {
        int limit;
        int i;
        int position;
        while (byteBuffer.hasRemaining() && !this.f33545g.hasRemaining()) {
            if (this.f35310k != 0) {
                AbstractC2792Sd.H(this.f35314o < this.f35313n.length);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > 1024) {
                        int i4 = this.i;
                        limit = (position2 / i4) * i4;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i6 = this.f35314o;
                int i9 = this.f35315p;
                int i10 = i6 + i9;
                int length = this.f35313n.length;
                if (i10 < length) {
                    i = length - i10;
                } else {
                    i10 = i9 - (length - i6);
                    i = i6 - i10;
                }
                int min = Math.min(position3, i);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.f35313n, i10, min);
                int i11 = this.f35315p + min;
                this.f35315p = i11;
                AbstractC2792Sd.H(i11 <= this.f35313n.length);
                boolean z6 = limit < limit2 && position3 < i;
                o(z6);
                if (z6) {
                    this.f35310k = 0;
                    this.f35312m = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f35313n.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit4) << 8) | (byteBuffer.get(limit4 - 1) & 255)) > 1024) {
                        int i12 = this.i;
                        position = ((limit4 / i12) * i12) + i12;
                        break;
                    }
                    limit4 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.f35310k = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    g(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3654ni, com.google.android.gms.internal.ads.InterfaceC3170ei
    public final boolean i() {
        return super.i() && this.f35309j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3654ni
    public final C3653nh k(C3653nh c3653nh) {
        if (c3653nh.f33538c == 2) {
            return c3653nh.f33536a == -1 ? C3653nh.f33535e : c3653nh;
        }
        throw new C2863Wh("Unhandled input format:", c3653nh);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3654ni
    public final void l() {
        if (this.f35315p > 0) {
            o(true);
            this.f35312m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3654ni
    public final void m() {
        if (i()) {
            int i = this.f33540b.f33537b;
            int i4 = i + i;
            this.i = i4;
            int i6 = ((((int) ((100000 * r0.f33536a) / 1000000)) / 2) / i4) * i4;
            int i9 = i6 + i6;
            if (this.f35313n.length != i9) {
                this.f35313n = new byte[i9];
                this.f35316q = new byte[i9];
            }
        }
        this.f35310k = 0;
        this.f35311l = 0L;
        this.f35312m = 0;
        this.f35314o = 0;
        this.f35315p = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3654ni
    public final void n() {
        this.f35309j = false;
        byte[] bArr = AbstractC3182eu.f30783b;
        this.f35313n = bArr;
        this.f35316q = bArr;
    }

    public final void o(boolean z6) {
        int i;
        int i4;
        int i6 = this.f35315p;
        int length = this.f35313n.length;
        if (i6 != length) {
            if (!z6) {
                return;
            } else {
                z6 = true;
            }
        }
        if (this.f35312m == 0) {
            if (z6) {
                q(i6, 3);
                i4 = i6;
            } else {
                AbstractC2792Sd.H(i6 >= (length >> 1));
                i4 = this.f35313n.length >> 1;
                q(i4, 0);
            }
            i = i4;
        } else {
            int i9 = length >> 1;
            int i10 = i6 - i9;
            if (z6) {
                int p9 = p(i10) + (this.f35313n.length >> 1);
                q(p9, 2);
                int i11 = i9 + i10;
                i = p9;
                i4 = i11;
            } else {
                int p10 = p(i10);
                q(p10, 1);
                i = p10;
                i4 = i10;
            }
        }
        if (i4 % this.i != 0) {
            throw new IllegalStateException(AbstractC2659Kg.x("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(i4)));
        }
        AbstractC2792Sd.H(i6 >= i);
        this.f35315p -= i4;
        int i12 = this.f35314o + i4;
        this.f35314o = i12;
        this.f35314o = i12 % this.f35313n.length;
        this.f35312m = (i / this.i) + this.f35312m;
        this.f35311l += (i4 - i) / r2;
    }

    public final int p(int i) {
        int length = ((((int) ((2000000 * this.f33540b.f33536a) / 1000000)) - this.f35312m) * this.i) - (this.f35313n.length >> 1);
        AbstractC2792Sd.H(length >= 0);
        int min = (int) Math.min((i * 0.2f) + 0.5f, length);
        int i4 = this.i;
        return (min / i4) * i4;
    }

    public final void q(int i, int i4) {
        int i6;
        if (i == 0) {
            return;
        }
        AbstractC2792Sd.i(this.f35315p >= i);
        if (i4 == 2) {
            int i9 = this.f35314o;
            int i10 = this.f35315p;
            int i11 = i9 + i10;
            byte[] bArr = this.f35313n;
            int length = bArr.length;
            if (i11 <= length) {
                System.arraycopy(bArr, i11 - i, this.f35316q, 0, i);
            } else {
                int i12 = i10 - (length - i9);
                if (i12 >= i) {
                    System.arraycopy(bArr, i12 - i, this.f35316q, 0, i);
                } else {
                    int i13 = i - i12;
                    System.arraycopy(bArr, length - i13, this.f35316q, 0, i13);
                    System.arraycopy(this.f35313n, 0, this.f35316q, i13, i12);
                }
            }
        } else {
            int i14 = this.f35314o;
            int i15 = i14 + i;
            byte[] bArr2 = this.f35313n;
            int length2 = bArr2.length;
            if (i15 <= length2) {
                System.arraycopy(bArr2, i14, this.f35316q, 0, i);
            } else {
                int i16 = length2 - i14;
                System.arraycopy(bArr2, i14, this.f35316q, 0, i16);
                System.arraycopy(this.f35313n, 0, this.f35316q, i16, i - i16);
            }
        }
        AbstractC2792Sd.w(i, "sizeToOutput is not aligned to frame size: %s", i % this.i == 0);
        AbstractC2792Sd.H(this.f35314o < this.f35313n.length);
        byte[] bArr3 = this.f35316q;
        AbstractC2792Sd.w(i, "byteOutput size is not aligned to frame size %s", i % this.i == 0);
        if (i4 != 3) {
            for (int i17 = 0; i17 < i; i17 += 2) {
                int i18 = i17 + 1;
                int i19 = (bArr3[i18] << 8) | (bArr3[i17] & 255);
                if (i4 == 0) {
                    i6 = ((((i17 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i6 = 10;
                    if (i4 == 2) {
                        i6 = 10 + (((com.anythink.expressad.foundation.g.a.bQ * i17) / (i - 1)) / 1000);
                    }
                }
                int i20 = (i19 * i6) / 100;
                if (i20 >= 32767) {
                    bArr3[i17] = -1;
                    bArr3[i18] = Byte.MAX_VALUE;
                } else if (i20 <= -32768) {
                    bArr3[i17] = 0;
                    bArr3[i18] = com.anythink.core.common.s.a.c.f17103a;
                } else {
                    bArr3[i17] = (byte) (i20 & com.anythink.basead.exoplayer.k.p.f9259b);
                    bArr3[i18] = (byte) (i20 >> 8);
                }
            }
        }
        g(i).put(bArr3, 0, i).flip();
    }
}
