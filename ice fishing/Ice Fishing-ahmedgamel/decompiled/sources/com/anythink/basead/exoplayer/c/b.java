package com.anythink.basead.exoplayer.c;

import android.media.MediaCodec;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7505a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7506b;

    /* renamed from: c, reason: collision with root package name */
    public int f7507c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f7508d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f7509e;

    /* renamed from: f, reason: collision with root package name */
    public int f7510f;

    /* renamed from: g, reason: collision with root package name */
    public int f7511g;

    /* renamed from: h, reason: collision with root package name */
    public int f7512h;
    private final MediaCodec.CryptoInfo i;

    /* renamed from: j, reason: collision with root package name */
    private final a f7513j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f7514a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f7515b;

        public /* synthetic */ a(MediaCodec.CryptoInfo cryptoInfo, byte b9) {
            this(cryptoInfo);
        }

        private void a(int i, int i4) {
            this.f7515b.set(i, i4);
            this.f7514a.setPattern(this.f7515b);
        }

        private a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f7514a = cryptoInfo;
            this.f7515b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        public static /* synthetic */ void a(a aVar, int i, int i4) {
            aVar.f7515b.set(i, i4);
            aVar.f7514a.setPattern(aVar.f7515b);
        }
    }

    public b() {
        int i = af.f9132a;
        MediaCodec.CryptoInfo cryptoInfo = i >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.i = cryptoInfo;
        this.f7513j = i >= 24 ? new a(cryptoInfo, (byte) 0) : null;
    }

    private static MediaCodec.CryptoInfo b() {
        return new MediaCodec.CryptoInfo();
    }

    private void c() {
        MediaCodec.CryptoInfo cryptoInfo = this.i;
        cryptoInfo.numSubSamples = this.f7510f;
        cryptoInfo.numBytesOfClearData = this.f7508d;
        cryptoInfo.numBytesOfEncryptedData = this.f7509e;
        cryptoInfo.key = this.f7506b;
        cryptoInfo.iv = this.f7505a;
        cryptoInfo.mode = this.f7507c;
        if (af.f9132a >= 24) {
            a.a(this.f7513j, this.f7511g, this.f7512h);
        }
    }

    public final void a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i4, int i6, int i9) {
        this.f7510f = i;
        this.f7508d = iArr;
        this.f7509e = iArr2;
        this.f7506b = bArr;
        this.f7505a = bArr2;
        this.f7507c = i4;
        this.f7511g = i6;
        this.f7512h = i9;
        int i10 = af.f9132a;
        if (i10 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = i4;
            if (i10 >= 24) {
                a.a(this.f7513j, i6, i9);
            }
        }
    }

    public final MediaCodec.CryptoInfo a() {
        return this.i;
    }
}
