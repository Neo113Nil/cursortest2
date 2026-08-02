package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes5.dex */
public final class Yj {
    public final H6 a;
    public final boolean b;
    public final int c;
    public final HashMap d;
    public final C0351ik e;

    public Yj(H6 h6, boolean z, int i, HashMap hashMap, C0351ik c0351ik) {
        this.a = h6;
        this.b = z;
        this.c = i;
        this.d = hashMap;
        this.e = c0351ik;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.a + ", serviceDataReporterType=" + this.c + ", environment=" + this.e + ", isCrashReport=" + this.b + ", trimmedFields=" + this.d + ')';
    }
}
