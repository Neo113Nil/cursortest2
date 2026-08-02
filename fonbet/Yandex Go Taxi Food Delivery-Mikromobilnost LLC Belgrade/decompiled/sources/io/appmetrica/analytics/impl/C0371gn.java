package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0371gn {
    public final String a;
    public final String b;

    public C0371gn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelfReportingLazyEvent(eventName='");
        sb.append(this.a);
        sb.append("', eventValue='");
        return AbstractC0748tp.a(sb, this.b, "')");
    }
}
