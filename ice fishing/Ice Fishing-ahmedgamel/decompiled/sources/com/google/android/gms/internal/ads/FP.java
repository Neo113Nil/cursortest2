package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j0.C4595a;
import j0.C4596b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FP extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24797a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24798b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FP(HP hp, Looper looper) {
        super(looper);
        Objects.requireNonNull(hp);
        this.f24798b = hp;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        S0.s[] sVarArr;
        switch (this.f24797a) {
            case 0:
                HP hp = (HP) this.f24798b;
                hp.getClass();
                int i = message.what;
                GP gp = null;
                if (i == 1) {
                    GP gp2 = (GP) message.obj;
                    try {
                        hp.f25292n.queueInputBuffer(gp2.f24971a, 0, gp2.f24972b, gp2.f24974d, gp2.f24975e);
                    } catch (RuntimeException e9) {
                        AtomicReference atomicReference = hp.f25295w;
                        while (!atomicReference.compareAndSet(null, e9) && atomicReference.get() == null) {
                        }
                    }
                    gp = gp2;
                } else if (i == 2) {
                    GP gp3 = (GP) message.obj;
                    int i6 = gp3.f24971a;
                    MediaCodec.CryptoInfo cryptoInfo = gp3.f24973c;
                    long j6 = gp3.f24974d;
                    int i9 = gp3.f24975e;
                    try {
                        if (Build.VERSION.SDK_INT >= 31) {
                            hp.f25292n.queueSecureInputBuffer(i6, 0, cryptoInfo, j6, i9);
                        } else {
                            synchronized (HP.f25290A) {
                                hp.f25292n.queueSecureInputBuffer(i6, 0, cryptoInfo, j6, i9);
                            }
                        }
                    } catch (RuntimeException e10) {
                        AtomicReference atomicReference2 = hp.f25295w;
                        while (!atomicReference2.compareAndSet(null, e10) && atomicReference2.get() == null) {
                        }
                    }
                    gp = gp3;
                } else if (i == 3) {
                    hp.f25296x.a();
                } else if (i != 4) {
                    AtomicReference atomicReference3 = hp.f25295w;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        hp.f25292n.setParameters((Bundle) message.obj);
                    } catch (RuntimeException e11) {
                        AtomicReference atomicReference4 = hp.f25295w;
                        while (!atomicReference4.compareAndSet(null, e11) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (gp != null) {
                    ArrayDeque arrayDeque = HP.f25291z;
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
                C4596b c4596b = (C4596b) this.f24798b;
                while (true) {
                    synchronized (c4596b.f38292b) {
                        try {
                            size = c4596b.f38294d.size();
                            if (size <= 0) {
                                return;
                            }
                            sVarArr = new S0.s[size];
                            c4596b.f38294d.toArray(sVarArr);
                            c4596b.f38294d.clear();
                        } finally {
                        }
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        S0.s sVar = sVarArr[i10];
                        int size2 = ((ArrayList) sVar.f2841v).size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            C4595a c4595a = (C4595a) ((ArrayList) sVar.f2841v).get(i11);
                            if (!c4595a.f38288d) {
                                c4595a.f38286b.onReceive(c4596b.f38291a, (Intent) sVar.f2840u);
                            }
                        }
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FP(C4596b c4596b, Looper looper) {
        super(looper);
        this.f24798b = c4596b;
    }
}
