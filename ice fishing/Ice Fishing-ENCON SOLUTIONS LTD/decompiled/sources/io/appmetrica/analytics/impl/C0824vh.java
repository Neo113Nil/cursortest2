package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0824vh {

    /* renamed from: a, reason: collision with root package name */
    public final P5 f7065a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7066b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7067c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f7068d;

    /* renamed from: e, reason: collision with root package name */
    public final Fh f7069e;

    public C0824vh(P5 p5, boolean z2, int i2, HashMap hashMap, Fh fh) {
        this.f7065a = p5;
        this.f7066b = z2;
        this.f7067c = i2;
        this.f7068d = hashMap;
        this.f7069e = fh;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f7065a + ", serviceDataReporterType=" + this.f7067c + ", environment=" + this.f7069e + ", isCrashReport=" + this.f7066b + ", trimmedFields=" + this.f7068d + ')';
    }
}
