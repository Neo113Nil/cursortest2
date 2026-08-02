package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class IP extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f26245b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f26246c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f26251h;
    public MediaFormat i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f26252j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f26253k;

    /* renamed from: l, reason: collision with root package name */
    public long f26254l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26255m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f26256n;

    /* renamed from: o, reason: collision with root package name */
    public C4042ut f26257o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f26244a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final C2817Tl f26247d = new C2817Tl();

    /* renamed from: e, reason: collision with root package name */
    public final C2817Tl f26248e = new C2817Tl();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f26249f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f26250g = new ArrayDeque();

    public IP(HandlerThread handlerThread) {
        this.f26245b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f26250g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        C2817Tl c2817Tl = this.f26247d;
        c2817Tl.f28574b = c2817Tl.f28573a;
        C2817Tl c2817Tl2 = this.f26248e;
        c2817Tl2.f28574b = c2817Tl2.f28573a;
        this.f26249f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f26256n;
        if (illegalStateException != null) {
            this.f26256n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f26252j;
        if (codecException != null) {
            this.f26252j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f26253k;
        if (cryptoException == null) {
            return;
        }
        this.f26253k = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f26244a) {
            this.f26253k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f26244a) {
            this.f26252j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        QN qn;
        synchronized (this.f26244a) {
            try {
                this.f26247d.c(i);
                C4042ut c4042ut = this.f26257o;
                if (c4042ut != null && (qn = ((SP) c4042ut.f35366u).f28250j0) != null) {
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
        synchronized (this.f26244a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.f26248e.c(-2);
                    this.f26250g.add(mediaFormat);
                    this.i = null;
                }
                this.f26248e.c(i);
                this.f26249f.add(bufferInfo);
                C4042ut c4042ut = this.f26257o;
                if (c4042ut != null && (qn = ((SP) c4042ut.f35366u).f28250j0) != null) {
                    qn.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f26244a) {
            this.f26248e.c(-2);
            this.f26250g.add(mediaFormat);
            this.i = null;
        }
    }
}
