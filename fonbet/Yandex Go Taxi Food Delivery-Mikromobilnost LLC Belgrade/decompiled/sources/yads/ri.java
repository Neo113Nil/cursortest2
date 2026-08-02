package yads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.hc81;
import defpackage.nf81;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ri extends Handler {
    public final /* synthetic */ nf81 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(nf81 nf81Var, Looper looper) {
        super(looper);
        this.a = nf81Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        nf81 nf81Var = this.a;
        nf81Var.getClass();
        int i = message.what;
        hc81 hc81Var = null;
        if (i == 0) {
            hc81 hc81Var2 = (hc81) message.obj;
            try {
                nf81Var.a.queueInputBuffer(hc81Var2.a, 0, hc81Var2.b, hc81Var2.d, hc81Var2.e);
            } catch (RuntimeException e) {
                AtomicReference atomicReference = nf81Var.d;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
            hc81Var = hc81Var2;
        } else if (i == 1) {
            hc81 hc81Var3 = (hc81) message.obj;
            int i2 = hc81Var3.a;
            MediaCodec.CryptoInfo cryptoInfo = hc81Var3.c;
            long j = hc81Var3.d;
            int i3 = hc81Var3.e;
            try {
                synchronized (nf81.h) {
                    nf81Var.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                }
            } catch (RuntimeException e2) {
                AtomicReference atomicReference2 = nf81Var.d;
                while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                }
            }
            hc81Var = hc81Var3;
        } else if (i != 2) {
            AtomicReference atomicReference3 = nf81Var.d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            nf81Var.e.c();
        }
        if (hc81Var != null) {
            ArrayDeque arrayDeque = nf81.g;
            synchronized (arrayDeque) {
                arrayDeque.add(hc81Var);
            }
        }
    }
}
