package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.Sm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2781Sm {

    /* renamed from: a, reason: collision with root package name */
    public boolean f27548a;

    public final synchronized boolean a() {
        if (this.f27548a) {
            return false;
        }
        this.f27548a = true;
        notifyAll();
        return true;
    }

    public final synchronized void b() {
        boolean z3 = false;
        while (!this.f27548a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z3 = true;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j6) {
        if (j6 > 0) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j9 = j6 + elapsedRealtime;
                if (j9 < elapsedRealtime) {
                    b();
                } else {
                    boolean z3 = false;
                    while (!this.f27548a && elapsedRealtime < j9) {
                        try {
                            wait(j9 - elapsedRealtime);
                        } catch (InterruptedException unused) {
                            z3 = true;
                        }
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f27548a;
    }
}
