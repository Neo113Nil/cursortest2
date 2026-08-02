package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.hh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3331hh implements VG {

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f31588n;

    public C3331hh(byte[] bArr, int i) {
        switch (i) {
            case 1:
                this.f31588n = new byte[256];
                for (int i4 = 0; i4 < 256; i4++) {
                    this.f31588n[i4] = (byte) i4;
                }
                int i6 = 0;
                for (int i9 = 0; i9 < 256; i9++) {
                    byte[] bArr2 = this.f31588n;
                    byte b9 = bArr2[i9];
                    i6 = (i6 + b9 + bArr[i9 % bArr.length]) & com.anythink.basead.exoplayer.k.p.f9259b;
                    bArr2[i9] = bArr2[i6];
                    bArr2[i6] = b9;
                }
                break;
            default:
                this.f31588n = bArr;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.VG
    /* renamed from: c */
    public /* synthetic */ InterfaceC3636nH mo13c() {
        AtomicInteger atomicInteger = C3437jh.f32063N;
        return new VF(this.f31588n);
    }
}
