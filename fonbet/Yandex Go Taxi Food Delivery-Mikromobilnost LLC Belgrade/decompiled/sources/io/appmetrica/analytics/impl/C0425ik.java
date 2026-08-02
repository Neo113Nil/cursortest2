package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ik, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0425ik {
    public final K6 a;
    public final boolean b;
    public final int c;
    public final HashMap d;
    public final C0714sk e;

    public C0425ik(K6 k6, boolean z, int i, HashMap hashMap, C0714sk c0714sk) {
        this.a = k6;
        this.b = z;
        this.c = i;
        this.d = hashMap;
        this.e = c0714sk;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.a + ", serviceDataReporterType=" + this.c + ", environment=" + this.e + ", isCrashReport=" + this.b + ", trimmedFields=" + this.d + ')';
    }
}
