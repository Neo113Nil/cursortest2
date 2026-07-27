package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j0.C4586a;
import j0.C4587b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class RP extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27361a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27362b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RP(UP up, Looper looper) {
        super(looper);
        Objects.requireNonNull(up);
        this.f27362b = up;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        S0.e[] eVarArr;
        switch (this.f27361a) {
            case 0:
                UP up = (UP) this.f27362b;
                up.getClass();
                int i = message.what;
                SP sp = null;
                if (i == 1) {
                    SP sp2 = (SP) message.obj;
                    try {
                        up.f28000n.queueInputBuffer(sp2.f27561a, 0, sp2.f27562b, sp2.f27564d, sp2.f27565e);
                    } catch (RuntimeException e6) {
                        AtomicReference atomicReference = up.f28003w;
                        while (!atomicReference.compareAndSet(null, e6) && atomicReference.get() == null) {
                        }
                    }
                    sp = sp2;
                } else if (i == 2) {
                    SP sp3 = (SP) message.obj;
                    int i4 = sp3.f27561a;
                    MediaCodec.CryptoInfo cryptoInfo = sp3.f27563c;
                    long j9 = sp3.f27564d;
                    int i9 = sp3.f27565e;
                    try {
                        synchronized (UP.f27998A) {
                            up.f28000n.queueSecureInputBuffer(i4, 0, cryptoInfo, j9, i9);
                        }
                    } catch (RuntimeException e9) {
                        AtomicReference atomicReference2 = up.f28003w;
                        while (!atomicReference2.compareAndSet(null, e9) && atomicReference2.get() == null) {
                        }
                    }
                    sp = sp3;
                } else if (i == 3) {
                    up.f28004x.a();
                } else if (i != 4) {
                    AtomicReference atomicReference3 = up.f28003w;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        up.f28000n.setParameters((Bundle) message.obj);
                    } catch (RuntimeException e10) {
                        AtomicReference atomicReference4 = up.f28003w;
                        while (!atomicReference4.compareAndSet(null, e10) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (sp != null) {
                    ArrayDeque arrayDeque = UP.f27999z;
                    synchronized (arrayDeque) {
                        arrayDeque.add(sp);
                    }
                    return;
                }
                return;
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                C4587b c4587b = (C4587b) this.f27362b;
                while (true) {
                    synchronized (c4587b.f38475b) {
                        try {
                            size = c4587b.f38477d.size();
                            if (size <= 0) {
                                return;
                            }
                            eVarArr = new S0.e[size];
                            c4587b.f38477d.toArray(eVarArr);
                            c4587b.f38477d.clear();
                        } finally {
                        }
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        S0.e eVar = eVarArr[i10];
                        int size2 = ((ArrayList) eVar.f2892v).size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            C4586a c4586a = (C4586a) ((ArrayList) eVar.f2892v).get(i11);
                            if (!c4586a.f38471d) {
                                c4586a.f38469b.onReceive(c4587b.f38474a, (Intent) eVar.f2891u);
                            }
                        }
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RP(C4587b c4587b, Looper looper) {
        super(looper);
        this.f27362b = c4587b;
    }
}
