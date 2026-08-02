package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class VF extends AbstractC3580mF {

    /* renamed from: A, reason: collision with root package name */
    public int f28927A;

    /* renamed from: B, reason: collision with root package name */
    public int f28928B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f28929C;

    /* renamed from: x, reason: collision with root package name */
    public final T6 f28930x;

    /* renamed from: y, reason: collision with root package name */
    public Uri f28931y;

    /* renamed from: z, reason: collision with root package name */
    public byte[] f28932z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VF(byte[] bArr) {
        super(false);
        T6 t6 = new T6(bArr, 1);
        this.f28930x = t6;
        AbstractC2792Sd.i(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final long b(C2994bJ c2994bJ) {
        a(c2994bJ);
        this.f28931y = c2994bJ.f30067a;
        byte[] bArr = this.f28930x.f28477a;
        this.f28932z = bArr;
        int length = bArr.length;
        long j6 = length;
        long j9 = c2994bJ.f30069c;
        if (j9 > j6) {
            throw new NH();
        }
        int i = (int) j9;
        this.f28927A = i;
        int i4 = length - i;
        this.f28928B = i4;
        long j10 = c2994bJ.f30070d;
        if (j10 != -1) {
            this.f28928B = (int) Math.min(i4, j10);
        }
        this.f28929C = true;
        c(c2994bJ);
        return j10 != -1 ? j10 : this.f28928B;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final Uri i() {
        return this.f28931y;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final void o() {
        if (this.f28929C) {
            this.f28929C = false;
            e();
        }
        this.f28931y = null;
        this.f28932z = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4073vN
    public final int r(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        int i6 = this.f28928B;
        if (i6 == 0) {
            return -1;
        }
        int min = Math.min(i4, i6);
        byte[] bArr2 = this.f28932z;
        bArr2.getClass();
        System.arraycopy(bArr2, this.f28927A, bArr, i, min);
        this.f28927A += min;
        this.f28928B -= min;
        d(min);
        return min;
    }
}
