package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class VF extends AbstractC3557mF {

    /* renamed from: A, reason: collision with root package name */
    public int f28130A;

    /* renamed from: B, reason: collision with root package name */
    public int f28131B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f28132C;

    /* renamed from: x, reason: collision with root package name */
    public final T6 f28133x;

    /* renamed from: y, reason: collision with root package name */
    public Uri f28134y;

    /* renamed from: z, reason: collision with root package name */
    public byte[] f28135z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VF(byte[] bArr) {
        super(false);
        T6 t6 = new T6(bArr, 1);
        this.f28133x = t6;
        AbstractC2772Sd.i(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final long g(C2971bJ c2971bJ) {
        a(c2971bJ);
        this.f28134y = c2971bJ.f29279a;
        byte[] bArr = this.f28133x.f27694a;
        this.f28135z = bArr;
        int length = bArr.length;
        long j6 = length;
        long j9 = c2971bJ.f29281c;
        if (j9 > j6) {
            throw new NH();
        }
        int i = (int) j9;
        this.f28130A = i;
        int i6 = length - i;
        this.f28131B = i6;
        long j10 = c2971bJ.f29282d;
        if (j10 != -1) {
            this.f28131B = (int) Math.min(i6, j10);
        }
        this.f28132C = true;
        b(c2971bJ);
        return j10 != -1 ? j10 : this.f28131B;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final Uri i() {
        return this.f28134y;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4050vN
    public final int m(byte[] bArr, int i, int i6) {
        if (i6 == 0) {
            return 0;
        }
        int i9 = this.f28131B;
        if (i9 == 0) {
            return -1;
        }
        int min = Math.min(i6, i9);
        byte[] bArr2 = this.f28135z;
        bArr2.getClass();
        System.arraycopy(bArr2, this.f28130A, bArr, i, min);
        this.f28130A += min;
        this.f28131B -= min;
        c(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final void o() {
        if (this.f28132C) {
            this.f28132C = false;
            d();
        }
        this.f28134y = null;
        this.f28135z = null;
    }
}
