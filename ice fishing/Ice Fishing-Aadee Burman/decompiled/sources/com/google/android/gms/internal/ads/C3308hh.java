package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.hh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3308hh implements VG {

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f30827n;

    public C3308hh(byte[] bArr, int i) {
        switch (i) {
            case 1:
                this.f30827n = new byte[256];
                for (int i6 = 0; i6 < 256; i6++) {
                    this.f30827n[i6] = (byte) i6;
                }
                int i9 = 0;
                for (int i10 = 0; i10 < 256; i10++) {
                    byte[] bArr2 = this.f30827n;
                    byte b9 = bArr2[i10];
                    i9 = (i9 + b9 + bArr[i10 % bArr.length]) & com.anythink.basead.exoplayer.k.p.f8473b;
                    bArr2[i10] = bArr2[i9];
                    bArr2[i9] = b9;
                }
                break;
            default:
                this.f30827n = bArr;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.VG
    /* renamed from: c */
    public /* synthetic */ InterfaceC3613nH mo14c() {
        AtomicInteger atomicInteger = C3414jh.f31276N;
        return new VF(this.f30827n);
    }
}
