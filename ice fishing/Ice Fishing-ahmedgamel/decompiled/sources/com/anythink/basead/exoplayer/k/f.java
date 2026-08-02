package com.anythink.basead.exoplayer.k;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f9174a;

    public final synchronized boolean a() {
        if (this.f9174a) {
            return false;
        }
        this.f9174a = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean b() {
        boolean z6;
        z6 = this.f9174a;
        this.f9174a = false;
        return z6;
    }

    public final synchronized void c() {
        while (!this.f9174a) {
            wait();
        }
    }

    private synchronized boolean a(long j6) {
        boolean z6;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j9 = j6 + elapsedRealtime;
        while (true) {
            z6 = this.f9174a;
            if (z6 || elapsedRealtime >= j9) {
                break;
            }
            wait(j9 - elapsedRealtime);
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        return z6;
    }
}
