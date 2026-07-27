package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class IP extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f25502b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f25503c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f25508h;
    public MediaFormat i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f25509j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f25510k;

    /* renamed from: l, reason: collision with root package name */
    public long f25511l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25512m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f25513n;

    /* renamed from: o, reason: collision with root package name */
    public C4019ut f25514o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f25501a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final C2780Sl f25504d = new C2780Sl();

    /* renamed from: e, reason: collision with root package name */
    public final C2780Sl f25505e = new C2780Sl();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f25506f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f25507g = new ArrayDeque();

    public IP(HandlerThread handlerThread) {
        this.f25502b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f25507g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        C2780Sl c2780Sl = this.f25504d;
        c2780Sl.f27545b = c2780Sl.f27544a;
        C2780Sl c2780Sl2 = this.f25505e;
        c2780Sl2.f27545b = c2780Sl2.f27544a;
        this.f25506f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f25513n;
        if (illegalStateException != null) {
            this.f25513n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f25509j;
        if (codecException != null) {
            this.f25509j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f25510k;
        if (cryptoException == null) {
            return;
        }
        this.f25510k = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f25501a) {
            this.f25510k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f25501a) {
            this.f25509j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        QN qn;
        synchronized (this.f25501a) {
            try {
                this.f25504d.c(i);
                C4019ut c4019ut = this.f25514o;
                if (c4019ut != null && (qn = ((RP) c4019ut.f34603u).f27266o0) != null) {
                    qn.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        QN qn;
        synchronized (this.f25501a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.f25505e.c(-2);
                    this.f25507g.add(mediaFormat);
                    this.i = null;
                }
                this.f25505e.c(i);
                this.f25506f.add(bufferInfo);
                C4019ut c4019ut = this.f25514o;
                if (c4019ut != null && (qn = ((RP) c4019ut.f34603u).f27266o0) != null) {
                    qn.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f25501a) {
            this.f25505e.c(-2);
            this.f25507g.add(mediaFormat);
            this.i = null;
        }
    }
}
