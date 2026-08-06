package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341d extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f5771a = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0366e f5772b;

    public C0341d(C0366e c0366e) {
        this.f5772b = c0366e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.f5771a.get()) {
            this.f5772b.f5856e.set(false);
            C0366e c0366e = this.f5772b;
            c0366e.f5854c.postAtFrontOfQueue(c0366e.f5857f);
            int i2 = this.f5772b.f5853b.get();
            while (i2 > 0) {
                try {
                    Thread.sleep(C0366e.f5850g);
                    if (this.f5772b.f5856e.get()) {
                        break;
                    } else {
                        i2--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i2 == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f5772b.f5852a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0315c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f5772b.f5856e.get()) {
                try {
                    Thread.sleep(C0366e.f5850g);
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }
}
