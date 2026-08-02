package io.appmetrica.analytics.impl;

/* loaded from: classes5.dex */
public final class Qm {
    public final String a;
    public final String b;

    public Qm(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelfReportingLazyEvent(eventName='");
        sb.append(this.a);
        sb.append("', eventValue='");
        return AbstractC0155bp.a(sb, this.b, "')");
    }
}
