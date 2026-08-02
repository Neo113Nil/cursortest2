package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j0.C4604a;
import j0.C4605b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FP extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25553a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25554b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FP(HP hp, Looper looper) {
        super(looper);
        Objects.requireNonNull(hp);
        this.f25554b = hp;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        S0.l[] lVarArr;
        switch (this.f25553a) {
            case 0:
                HP hp = (HP) this.f25554b;
                hp.getClass();
                int i = message.what;
                GP gp = null;
                if (i == 1) {
                    GP gp2 = (GP) message.obj;
                    try {
                        hp.f26064n.queueInputBuffer(gp2.f25761a, 0, gp2.f25762b, gp2.f25764d, gp2.f25765e);
                    } catch (RuntimeException e9) {
                        AtomicReference atomicReference = hp.f26067w;
                        while (!atomicReference.compareAndSet(null, e9) && atomicReference.get() == null) {
                        }
                    }
                    gp = gp2;
                } else if (i == 2) {
                    GP gp3 = (GP) message.obj;
                    int i4 = gp3.f25761a;
                    MediaCodec.CryptoInfo cryptoInfo = gp3.f25763c;
                    long j6 = gp3.f25764d;
                    int i6 = gp3.f25765e;
                    try {
                        if (Build.VERSION.SDK_INT >= 31) {
                            hp.f26064n.queueSecureInputBuffer(i4, 0, cryptoInfo, j6, i6);
                        } else {
                            synchronized (HP.f26062A) {
                                hp.f26064n.queueSecureInputBuffer(i4, 0, cryptoInfo, j6, i6);
                            }
                        }
                    } catch (RuntimeException e10) {
                        AtomicReference atomicReference2 = hp.f26067w;
                        while (!atomicReference2.compareAndSet(null, e10) && atomicReference2.get() == null) {
                        }
                    }
                    gp = gp3;
                } else if (i == 3) {
                    hp.f26068x.a();
                } else if (i != 4) {
                    AtomicReference atomicReference3 = hp.f26067w;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        hp.f26064n.setParameters((Bundle) message.obj);
                    } catch (RuntimeException e11) {
                        AtomicReference atomicReference4 = hp.f26067w;
                        while (!atomicReference4.compareAndSet(null, e11) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (gp != null) {
                    ArrayDeque arrayDeque = HP.f26063z;
                    synchronized (arrayDeque) {
                        arrayDeque.add(gp);
                    }
                    return;
                }
                return;
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                C4605b c4605b = (C4605b) this.f25554b;
                while (true) {
                    synchronized (c4605b.f38411b) {
                        try {
                            size = c4605b.f38413d.size();
                            if (size <= 0) {
                                return;
                            }
                            lVarArr = new S0.l[size];
                            c4605b.f38413d.toArray(lVarArr);
                            c4605b.f38413d.clear();
                        } finally {
                        }
                    }
                    for (int i9 = 0; i9 < size; i9++) {
                        S0.l lVar = lVarArr[i9];
                        int size2 = ((ArrayList) lVar.f2927v).size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            C4604a c4604a = (C4604a) ((ArrayList) lVar.f2927v).get(i10);
                            if (!c4604a.f38407d) {
                                c4604a.f38405b.onReceive(c4605b.f38410a, (Intent) lVar.f2926u);
                            }
                        }
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FP(C4605b c4605b, Looper looper) {
        super(looper);
        this.f25554b = c4605b;
    }
}
