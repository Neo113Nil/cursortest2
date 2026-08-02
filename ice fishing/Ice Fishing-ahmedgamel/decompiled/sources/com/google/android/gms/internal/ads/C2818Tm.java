package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.Tm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2818Tm {

    /* renamed from: a, reason: collision with root package name */
    public boolean f28577a;

    public final synchronized boolean a() {
        if (this.f28577a) {
            return false;
        }
        this.f28577a = true;
        notifyAll();
        return true;
    }

    public final synchronized void b() {
        boolean z6 = false;
        while (!this.f28577a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z6 = true;
            }
        }
        if (z6) {
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
                    boolean z6 = false;
                    while (!this.f28577a && elapsedRealtime < j9) {
                        try {
                            wait(j9 - elapsedRealtime);
                        } catch (InterruptedException unused) {
                            z6 = true;
                        }
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z6) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f28577a;
    }
}
