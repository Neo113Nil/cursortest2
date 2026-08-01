package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class T6 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f27694a;

    public T6(byte[] bArr, int i) {
        switch (i) {
            case 1:
                this.f27694a = bArr;
                break;
            default:
                this.f27694a = new byte[256];
                for (int i6 = 0; i6 < 256; i6++) {
                    this.f27694a[i6] = (byte) i6;
                }
                int i9 = 0;
                for (int i10 = 0; i10 < 256; i10++) {
                    byte[] bArr2 = this.f27694a;
                    byte b9 = bArr2[i10];
                    i9 = (i9 + b9 + bArr[i10 % bArr.length]) & com.anythink.basead.exoplayer.k.p.f8473b;
                    bArr2[i10] = bArr2[i9];
                    bArr2[i9] = b9;
                }
                break;
        }
    }
}
