package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class T6 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f28477a;

    public T6(byte[] bArr, int i) {
        switch (i) {
            case 1:
                this.f28477a = bArr;
                break;
            default:
                this.f28477a = new byte[256];
                for (int i4 = 0; i4 < 256; i4++) {
                    this.f28477a[i4] = (byte) i4;
                }
                int i6 = 0;
                for (int i9 = 0; i9 < 256; i9++) {
                    byte[] bArr2 = this.f28477a;
                    byte b9 = bArr2[i9];
                    i6 = (i6 + b9 + bArr[i9 % bArr.length]) & com.anythink.basead.exoplayer.k.p.f9259b;
                    bArr2[i9] = bArr2[i6];
                    bArr2[i6] = b9;
                }
                break;
        }
    }
}
