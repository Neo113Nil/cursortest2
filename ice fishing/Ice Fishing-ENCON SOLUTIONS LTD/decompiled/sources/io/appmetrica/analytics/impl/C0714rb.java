package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.rb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0714rb extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0740sb f6818a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0714rb(C0740sb c0740sb, String str) {
        super(str);
        this.f6818a = c0740sb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        synchronized (this.f6818a.f6890a) {
            C0740sb.a(this.f6818a);
            this.f6818a.f6894e = true;
            this.f6818a.f6890a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f6818a.f6891b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                hashMap = new HashMap(this.f6818a.f6891b);
                this.f6818a.f6891b.clear();
            }
            if (hashMap.size() > 0) {
                C0740sb.a(this.f6818a, hashMap);
                hashMap.clear();
            }
        }
    }
}
