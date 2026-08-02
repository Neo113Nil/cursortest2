package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.xP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4183xP extends AbstractC3654ni {
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f35794j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35795k;

    /* renamed from: l, reason: collision with root package name */
    public int f35796l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f35797m;

    /* renamed from: n, reason: collision with root package name */
    public int f35798n;

    /* renamed from: o, reason: collision with root package name */
    public long f35799o;

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.f35796l);
        this.f35799o += min / this.f33540b.f33539d;
        this.f35796l -= min;
        byteBuffer.position(position + min);
        if (this.f35796l <= 0) {
            int i4 = i - min;
            int length = (this.f35798n + i4) - this.f35797m.length;
            ByteBuffer g9 = g(length);
            int i6 = this.f35798n;
            String str = AbstractC3182eu.f30782a;
            int max = Math.max(0, Math.min(length, i6));
            g9.put(this.f35797m, 0, max);
            int max2 = Math.max(0, Math.min(length - max, i4));
            byteBuffer.limit(byteBuffer.position() + max2);
            g9.put(byteBuffer);
            byteBuffer.limit(limit);
            int i9 = i4 - max2;
            int i10 = this.f35798n - max;
            this.f35798n = i10;
            byte[] bArr = this.f35797m;
            System.arraycopy(bArr, max, bArr, 0, i10);
            byteBuffer.get(this.f35797m, this.f35798n, i9);
            this.f35798n += i9;
            g9.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public final long b(long j6) {
        return Math.max(0L, j6 - AbstractC3182eu.v(this.f33540b.f33536a, this.f35794j + this.i));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3654ni, com.google.android.gms.internal.ads.InterfaceC3170ei
    public final ByteBuffer e() {
        int i;
        if (super.h() && (i = this.f35798n) > 0) {
            g(i).put(this.f35797m, 0, this.f35798n).flip();
            this.f35798n = 0;
        }
        return super.e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3654ni, com.google.android.gms.internal.ads.InterfaceC3170ei
    public final boolean h() {
        return super.h() && this.f35798n == 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3654ni
    public final C3653nh k(C3653nh c3653nh) {
        if (!AbstractC3182eu.d(c3653nh.f33538c)) {
            throw new C2863Wh("Unhandled input format:", c3653nh);
        }
        this.f35795k = true;
        return (this.i == 0 && this.f35794j == 0) ? C3653nh.f33535e : c3653nh;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3654ni
    public final void l() {
        if (this.f35795k) {
            if (this.f35798n > 0) {
                this.f35799o += r0 / this.f33540b.f33539d;
            }
            this.f35798n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3654ni
    public final void m() {
        if (this.f35795k) {
            this.f35795k = false;
            int i = this.f35794j;
            int i4 = this.f33540b.f33539d;
            this.f35797m = new byte[i * i4];
            this.f35796l = this.i * i4;
        }
        this.f35798n = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3654ni
    public final void n() {
        this.f35797m = AbstractC3182eu.f30783b;
    }
}
