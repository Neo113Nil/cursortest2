package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class vt1 implements kih {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public tt1 c;
    public final AtomicReference d;
    public final n20 e;
    public boolean f;

    public vt1(MediaCodec mediaCodec, HandlerThread handlerThread) {
        n20 n20Var = new n20();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = n20Var;
        this.d = new AtomicReference();
    }

    public static ut1 d() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new ut1();
                }
                return (ut1) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kih
    public final void a() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.kih
    public final void b(Bundle bundle) {
        a();
        tt1 tt1Var = this.c;
        int i = dvt.a;
        tt1Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.kih
    public final void c(int i, int i2, long j, int i3) {
        a();
        ut1 d = d();
        d.a = i;
        d.b = i2;
        d.d = j;
        d.e = i3;
        tt1 tt1Var = this.c;
        int i4 = dvt.a;
        tt1Var.obtainMessage(1, d).sendToTarget();
    }

    @Override // defpackage.kih
    public final void f(int i, nv6 nv6Var, long j, int i2) {
        a();
        ut1 d = d();
        d.a = i;
        d.b = 0;
        d.d = j;
        d.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = d.c;
        cryptoInfo.numSubSamples = nv6Var.f;
        int[] iArr = nv6Var.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = nv6Var.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = nv6Var.b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = nv6Var.a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = nv6Var.c;
        if (dvt.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(nv6Var.g, nv6Var.h));
        }
        this.c.obtainMessage(2, d).sendToTarget();
    }

    @Override // defpackage.kih
    public final void flush() {
        if (this.f) {
            try {
                tt1 tt1Var = this.c;
                tt1Var.getClass();
                tt1Var.removeCallbacksAndMessages(null);
                n20 n20Var = this.e;
                n20Var.d();
                tt1 tt1Var2 = this.c;
                tt1Var2.getClass();
                tt1Var2.obtainMessage(3).sendToTarget();
                n20Var.b();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                wvs.m(e);
            }
        }
    }

    @Override // defpackage.kih
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // defpackage.kih
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new tt1(this, handlerThread.getLooper(), 0);
        this.f = true;
    }
}
