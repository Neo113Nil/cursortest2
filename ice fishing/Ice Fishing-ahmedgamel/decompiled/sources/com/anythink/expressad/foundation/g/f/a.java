package com.anythink.expressad.foundation.g.f;

import android.net.TrafficStats;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static long f20012a;

    /* renamed from: b, reason: collision with root package name */
    private static long f20013b;

    /* renamed from: c, reason: collision with root package name */
    private static long f20014c;

    /* renamed from: com.anythink.expressad.foundation.g.f.a$a, reason: collision with other inner class name */
    public static class C0123a {

        /* renamed from: a, reason: collision with root package name */
        private static a f20018a = new a(0);

        private C0123a() {
        }
    }

    private a() {
    }

    public static a a() {
        return C0123a.f20018a;
    }

    public static long b() {
        return f20013b;
    }

    private synchronized void c() {
        if (f20012a == 0) {
            f20012a = SystemClock.elapsedRealtime();
            f20014c = TrafficStats.getTotalRxBytes();
        }
    }

    private synchronized void d() {
        try {
            if (f20012a != 0 && f20014c != 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - f20012a;
                if (elapsedRealtime != 0) {
                    try {
                        if (TrafficStats.getTotalRxBytes() != -1) {
                            long totalRxBytes = ((TrafficStats.getTotalRxBytes() - f20014c) * 1000) / elapsedRealtime;
                            if (totalRxBytes == 0) {
                                f20013b = 1L;
                            } else {
                                f20013b = totalRxBytes;
                            }
                        } else {
                            f20013b = 0L;
                        }
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void e() {
        f20014c = 0L;
        f20012a = 0L;
    }

    public /* synthetic */ a(byte b9) {
        this();
    }
}
