package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class Qc extends InterruptionSafeThread {
    public final /* synthetic */ Rc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qc(Rc rc, String str) {
        super(str);
        this.a = rc;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        synchronized (this.a.a) {
            Rc.a(this.a);
            this.a.e = true;
            this.a.a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.a.b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                hashMap = new HashMap(this.a.b);
                this.a.b.clear();
            }
            if (hashMap.size() > 0) {
                Rc.a(this.a, hashMap);
                hashMap.clear();
            }
        }
    }
}
