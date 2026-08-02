package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class wt1 extends MediaCodec.Callback {
    public final /* synthetic */ int a;
    public final Object b;
    public final HandlerThread c;
    public Handler d;
    public final ll4 e;
    public final ll4 f;
    public final ArrayDeque g;
    public final ArrayDeque h;
    public MediaFormat i;
    public MediaFormat j;
    public MediaCodec.CodecException k;
    public MediaCodec.CryptoException l;
    public long m;
    public boolean n;
    public IllegalStateException o;
    public hih p;

    public wt1(HandlerThread handlerThread, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new Object();
                this.c = handlerThread;
                this.e = new ll4();
                this.f = new ll4();
                this.g = new ArrayDeque();
                this.h = new ArrayDeque();
                break;
            default:
                this.b = new Object();
                this.c = handlerThread;
                this.e = new ll4();
                this.f = new ll4();
                this.g = new ArrayDeque();
                this.h = new ArrayDeque();
                break;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ArrayDeque arrayDeque = this.h;
                if (!arrayDeque.isEmpty()) {
                    this.j = (MediaFormat) arrayDeque.getLast();
                }
                ll4 ll4Var = this.e;
                ll4Var.b = ll4Var.a;
                ll4 ll4Var2 = this.f;
                ll4Var2.b = ll4Var2.a;
                this.g.clear();
                arrayDeque.clear();
                break;
            default:
                ArrayDeque arrayDeque2 = this.h;
                if (!arrayDeque2.isEmpty()) {
                    this.j = (MediaFormat) arrayDeque2.getLast();
                }
                ll4 ll4Var3 = this.e;
                ll4Var3.b = ll4Var3.a;
                ll4 ll4Var4 = this.f;
                ll4Var4.b = ll4Var4.a;
                this.g.clear();
                arrayDeque2.clear();
                break;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    this.l = cryptoException;
                }
                return;
            default:
                synchronized (this.b) {
                    this.l = cryptoException;
                }
                return;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    this.k = codecException;
                }
                return;
            default:
                synchronized (this.b) {
                    this.k = codecException;
                }
                return;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    try {
                        this.e.a(i);
                        hih hihVar = this.p;
                        if (hihVar != null) {
                            hihVar.b();
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.b) {
                    try {
                        this.e.a(i);
                        hih hihVar2 = this.p;
                        if (hihVar2 != null) {
                            hihVar2.b();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    try {
                        MediaFormat mediaFormat = this.j;
                        if (mediaFormat != null) {
                            this.f.a(-2);
                            this.h.add(mediaFormat);
                            this.j = null;
                        }
                        this.f.a(i);
                        this.g.add(bufferInfo);
                        hih hihVar = this.p;
                        if (hihVar != null) {
                            hihVar.t();
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.b) {
                    try {
                        MediaFormat mediaFormat2 = this.j;
                        if (mediaFormat2 != null) {
                            this.f.a(-2);
                            this.h.add(mediaFormat2);
                            this.j = null;
                        }
                        this.f.a(i);
                        this.g.add(bufferInfo);
                        hih hihVar2 = this.p;
                        if (hihVar2 != null) {
                            hihVar2.t();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    this.f.a(-2);
                    this.h.add(mediaFormat);
                    this.j = null;
                }
                return;
            default:
                synchronized (this.b) {
                    this.f.a(-2);
                    this.h.add(mediaFormat);
                    this.j = null;
                }
                return;
        }
    }
}
