package com.anythink.basead.exoplayer.c;

import android.media.MediaCodec;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6719a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6720b;

    /* renamed from: c, reason: collision with root package name */
    public int f6721c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f6722d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f6723e;

    /* renamed from: f, reason: collision with root package name */
    public int f6724f;

    /* renamed from: g, reason: collision with root package name */
    public int f6725g;

    /* renamed from: h, reason: collision with root package name */
    public int f6726h;
    private final MediaCodec.CryptoInfo i;

    /* renamed from: j, reason: collision with root package name */
    private final a f6727j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f6728a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f6729b;

        public /* synthetic */ a(MediaCodec.CryptoInfo cryptoInfo, byte b9) {
            this(cryptoInfo);
        }

        private void a(int i, int i6) {
            this.f6729b.set(i, i6);
            this.f6728a.setPattern(this.f6729b);
        }

        private a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f6728a = cryptoInfo;
            this.f6729b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        public static /* synthetic */ void a(a aVar, int i, int i6) {
            aVar.f6729b.set(i, i6);
            aVar.f6728a.setPattern(aVar.f6729b);
        }
    }

    public b() {
        int i = af.f8346a;
        MediaCodec.CryptoInfo cryptoInfo = i >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.i = cryptoInfo;
        this.f6727j = i >= 24 ? new a(cryptoInfo, (byte) 0) : null;
    }

    private static MediaCodec.CryptoInfo b() {
        return new MediaCodec.CryptoInfo();
    }

    private void c() {
        MediaCodec.CryptoInfo cryptoInfo = this.i;
        cryptoInfo.numSubSamples = this.f6724f;
        cryptoInfo.numBytesOfClearData = this.f6722d;
        cryptoInfo.numBytesOfEncryptedData = this.f6723e;
        cryptoInfo.key = this.f6720b;
        cryptoInfo.iv = this.f6719a;
        cryptoInfo.mode = this.f6721c;
        if (af.f8346a >= 24) {
            a.a(this.f6727j, this.f6725g, this.f6726h);
        }
    }

    public final void a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i6, int i9, int i10) {
        this.f6724f = i;
        this.f6722d = iArr;
        this.f6723e = iArr2;
        this.f6720b = bArr;
        this.f6719a = bArr2;
        this.f6721c = i6;
        this.f6725g = i9;
        this.f6726h = i10;
        int i11 = af.f8346a;
        if (i11 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = i6;
            if (i11 >= 24) {
                a.a(this.f6727j, i9, i10);
            }
        }
    }

    public final MediaCodec.CryptoInfo a() {
        return this.i;
    }
}
