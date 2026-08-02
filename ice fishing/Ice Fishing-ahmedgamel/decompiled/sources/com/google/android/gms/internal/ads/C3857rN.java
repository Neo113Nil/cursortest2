package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* renamed from: com.google.android.gms.internal.ads.rN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3857rN {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f34340a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f34341b;

    /* renamed from: c, reason: collision with root package name */
    public int f34342c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f34343d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f34344e;

    /* renamed from: f, reason: collision with root package name */
    public int f34345f;

    /* renamed from: g, reason: collision with root package name */
    public int f34346g;

    /* renamed from: h, reason: collision with root package name */
    public int f34347h;
    public final MediaCodec.CryptoInfo i;

    /* renamed from: j, reason: collision with root package name */
    public final S0.c f34348j;

    public C3857rN() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.f34348j = new S0.c(cryptoInfo);
    }

    public final void a(int i) {
        if (i == 0) {
            return;
        }
        if (this.f34343d == null) {
            int[] iArr = new int[1];
            this.f34343d = iArr;
            this.i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f34343d;
        iArr2[0] = iArr2[0] + i;
    }
}
