package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.by71;
import defpackage.ny61;
import defpackage.p881;
import defpackage.rf71;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

/* loaded from: classes7.dex */
public final class ui extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public long k;
    public boolean l;
    public IllegalStateException m;
    public final Object a = new Object();
    public final by71 d = new by71();
    public final by71 e = new by71();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public ui(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public final int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                if (this.k <= 0 && !this.l) {
                    IllegalStateException illegalStateException = this.m;
                    if (illegalStateException != null) {
                        this.m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = this.j;
                    if (codecException != null) {
                        this.j = null;
                        throw codecException;
                    }
                    by71 by71Var = this.e;
                    int i = by71Var.c;
                    if (i == 0) {
                        return -1;
                    }
                    if (i == 0) {
                        throw new NoSuchElementException();
                    }
                    int[] iArr = by71Var.d;
                    int i2 = by71Var.a;
                    int i3 = iArr[i2];
                    by71Var.a = (i2 + 1) & by71Var.e;
                    by71Var.c = i - 1;
                    if (i3 >= 0) {
                        if (this.h == null) {
                            throw new IllegalStateException();
                        }
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i3 == -2) {
                        this.h = (MediaFormat) this.g.remove();
                    }
                    return i3;
                }
                return -1;
            } finally {
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            try {
                if (this.l) {
                    return;
                }
                long j = this.k - 1;
                this.k = j;
                if (j > 0) {
                    return;
                }
                if (j < 0) {
                    a(new IllegalStateException());
                    return;
                }
                if (!this.g.isEmpty()) {
                    this.i = (MediaFormat) this.g.getLast();
                }
                by71 by71Var = this.d;
                by71Var.a = 0;
                by71Var.b = -1;
                by71Var.c = 0;
                by71 by71Var2 = this.e;
                by71Var2.a = 0;
                by71Var2.b = -1;
                by71Var2.c = 0;
                this.f.clear();
                this.g.clear();
                this.j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.a) {
            this.d.a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.g.add(mediaFormat);
                    this.i = null;
                }
                this.e.a(i);
                this.f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.e.a(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }

    public final void a(MediaCodec mediaCodec) {
        if (this.c == null) {
            this.b.start();
            Handler handler = new Handler(this.b.getLooper());
            mediaCodec.setCallback(this, handler);
            this.c = handler;
            return;
        }
        ny61.k();
    }

    public final void a() {
        synchronized (this.a) {
            this.k++;
            Handler handler = this.c;
            int i = rf71.a;
            handler.post(new p881(2, this));
        }
    }

    public final void a(IllegalStateException illegalStateException) {
        synchronized (this.a) {
            this.m = illegalStateException;
        }
    }
}
