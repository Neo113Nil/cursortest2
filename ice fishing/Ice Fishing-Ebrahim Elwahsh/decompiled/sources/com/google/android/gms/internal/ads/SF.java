package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class SF extends AbstractC3624nF {

    /* renamed from: A, reason: collision with root package name */
    public int f27515A;

    /* renamed from: B, reason: collision with root package name */
    public int f27516B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f27517C;

    /* renamed from: x, reason: collision with root package name */
    public final Q6 f27518x;

    /* renamed from: y, reason: collision with root package name */
    public Uri f27519y;

    /* renamed from: z, reason: collision with root package name */
    public byte[] f27520z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SF(byte[] bArr) {
        super(false);
        Q6 q6 = new Q6(bArr, 1);
        this.f27518x = q6;
        PA.n(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final long F(C3197fJ c3197fJ) {
        b(c3197fJ);
        this.f27519y = c3197fJ.f30686a;
        byte[] bArr = this.f27518x.f27118a;
        this.f27520z = bArr;
        int length = bArr.length;
        long j9 = length;
        long j10 = c3197fJ.f30688c;
        if (j10 > j9) {
            throw new NH();
        }
        int i = (int) j10;
        this.f27515A = i;
        int i4 = length - i;
        this.f27516B = i4;
        long j11 = c3197fJ.f30689d;
        if (j11 != -1) {
            this.f27516B = (int) Math.min(i4, j11);
        }
        this.f27517C = true;
        c(c3197fJ);
        return j11 != -1 ? j11 : this.f27516B;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final Uri i() {
        return this.f27519y;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final void o() {
        if (this.f27517C) {
            this.f27517C = false;
            e();
        }
        this.f27519y = null;
        this.f27520z = null;
    }

    @Override // com.google.android.gms.internal.ads.JN
    public final int z(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        int i9 = this.f27516B;
        if (i9 == 0) {
            return -1;
        }
        int min = Math.min(i4, i9);
        byte[] bArr2 = this.f27520z;
        bArr2.getClass();
        System.arraycopy(bArr2, this.f27515A, bArr, i, min);
        this.f27515A += min;
        this.f27516B -= min;
        d(min);
        return min;
    }
}
