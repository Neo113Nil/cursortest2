package com.anythink.basead.exoplayer.c;

import android.media.MediaCodec;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6876a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6877b;

    /* renamed from: c, reason: collision with root package name */
    public int f6878c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f6879d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f6880e;

    /* renamed from: f, reason: collision with root package name */
    public int f6881f;

    /* renamed from: g, reason: collision with root package name */
    public int f6882g;

    /* renamed from: h, reason: collision with root package name */
    public int f6883h;
    private final MediaCodec.CryptoInfo i;

    /* renamed from: j, reason: collision with root package name */
    private final a f6884j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f6885a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f6886b;

        public /* synthetic */ a(MediaCodec.CryptoInfo cryptoInfo, byte b9) {
            this(cryptoInfo);
        }

        private void a(int i, int i4) {
            this.f6886b.set(i, i4);
            this.f6885a.setPattern(this.f6886b);
        }

        private a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f6885a = cryptoInfo;
            this.f6886b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        public static /* synthetic */ void a(a aVar, int i, int i4) {
            aVar.f6886b.set(i, i4);
            aVar.f6885a.setPattern(aVar.f6886b);
        }
    }

    public b() {
        int i = af.f8503a;
        MediaCodec.CryptoInfo cryptoInfo = i >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.i = cryptoInfo;
        this.f6884j = i >= 24 ? new a(cryptoInfo, (byte) 0) : null;
    }

    private static MediaCodec.CryptoInfo b() {
        return new MediaCodec.CryptoInfo();
    }

    private void c() {
        MediaCodec.CryptoInfo cryptoInfo = this.i;
        cryptoInfo.numSubSamples = this.f6881f;
        cryptoInfo.numBytesOfClearData = this.f6879d;
        cryptoInfo.numBytesOfEncryptedData = this.f6880e;
        cryptoInfo.key = this.f6877b;
        cryptoInfo.iv = this.f6876a;
        cryptoInfo.mode = this.f6878c;
        if (af.f8503a >= 24) {
            a.a(this.f6884j, this.f6882g, this.f6883h);
        }
    }

    public final void a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i4, int i9, int i10) {
        this.f6881f = i;
        this.f6879d = iArr;
        this.f6880e = iArr2;
        this.f6877b = bArr;
        this.f6876a = bArr2;
        this.f6878c = i4;
        this.f6882g = i9;
        this.f6883h = i10;
        int i11 = af.f8503a;
        if (i11 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = i4;
            if (i11 >= 24) {
                a.a(this.f6884j, i9, i10);
            }
        }
    }

    public final MediaCodec.CryptoInfo a() {
        return this.i;
    }
}
