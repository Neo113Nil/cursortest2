package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Sj {

    /* renamed from: a, reason: collision with root package name */
    public final String f5063a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5064b;

    public Sj(String str, String str2) {
        this.f5063a = str;
        this.f5064b = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelfReportingLazyEvent(eventName='");
        sb.append(this.f5063a);
        sb.append("', eventValue='");
        return C1.a.k(sb, this.f5064b, "')");
    }
}
