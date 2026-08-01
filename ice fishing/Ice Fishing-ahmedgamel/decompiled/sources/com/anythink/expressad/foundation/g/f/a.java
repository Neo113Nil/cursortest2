package com.anythink.expressad.foundation.g.f;

import android.net.TrafficStats;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static long f19225a;

    /* renamed from: b, reason: collision with root package name */
    private static long f19226b;

    /* renamed from: c, reason: collision with root package name */
    private static long f19227c;

    /* renamed from: com.anythink.expressad.foundation.g.f.a$a, reason: collision with other inner class name */
    public static class C0123a {

        /* renamed from: a, reason: collision with root package name */
        private static a f19231a = new a(0);

        private C0123a() {
        }
    }

    private a() {
    }

    public static a a() {
        return C0123a.f19231a;
    }

    public static long b() {
        return f19226b;
    }

    private synchronized void c() {
        if (f19225a == 0) {
            f19225a = SystemClock.elapsedRealtime();
            f19227c = TrafficStats.getTotalRxBytes();
        }
    }

    private synchronized void d() {
        try {
            if (f19225a != 0 && f19227c != 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - f19225a;
                if (elapsedRealtime != 0) {
                    try {
                        if (TrafficStats.getTotalRxBytes() != -1) {
                            long totalRxBytes = ((TrafficStats.getTotalRxBytes() - f19227c) * 1000) / elapsedRealtime;
                            if (totalRxBytes == 0) {
                                f19226b = 1L;
                            } else {
                                f19226b = totalRxBytes;
                            }
                        } else {
                            f19226b = 0L;
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
        f19227c = 0L;
        f19225a = 0L;
    }

    public /* synthetic */ a(byte b9) {
        this();
    }
}
