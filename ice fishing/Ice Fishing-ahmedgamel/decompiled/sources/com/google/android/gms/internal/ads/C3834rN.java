package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* renamed from: com.google.android.gms.internal.ads.rN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3834rN {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f33572a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f33573b;

    /* renamed from: c, reason: collision with root package name */
    public int f33574c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f33575d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f33576e;

    /* renamed from: f, reason: collision with root package name */
    public int f33577f;

    /* renamed from: g, reason: collision with root package name */
    public int f33578g;

    /* renamed from: h, reason: collision with root package name */
    public int f33579h;
    public final MediaCodec.CryptoInfo i;

    /* renamed from: j, reason: collision with root package name */
    public final S0.c f33580j;

    public C3834rN() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.f33580j = new S0.c(cryptoInfo);
    }

    public final void a(int i) {
        if (i == 0) {
            return;
        }
        if (this.f33575d == null) {
            int[] iArr = new int[1];
            this.f33575d = iArr;
            this.i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f33575d;
        iArr2[0] = iArr2[0] + i;
    }
}
