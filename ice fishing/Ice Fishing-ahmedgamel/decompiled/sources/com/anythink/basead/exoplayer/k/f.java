package com.anythink.basead.exoplayer.k;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f8388a;

    public final synchronized boolean a() {
        if (this.f8388a) {
            return false;
        }
        this.f8388a = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean b() {
        boolean z3;
        z3 = this.f8388a;
        this.f8388a = false;
        return z3;
    }

    public final synchronized void c() {
        while (!this.f8388a) {
            wait();
        }
    }

    private synchronized boolean a(long j6) {
        boolean z3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j9 = j6 + elapsedRealtime;
        while (true) {
            z3 = this.f8388a;
            if (z3 || elapsedRealtime >= j9) {
                break;
            }
            wait(j9 - elapsedRealtime);
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        return z3;
    }
}
