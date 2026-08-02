package io.appmetrica.analytics.screenshot.impl;

import defpackage.eta;

/* loaded from: classes5.dex */
public final class l0 {
    public final boolean a;
    public final long b;

    public l0(a0 a0Var) {
        this(a0Var.b(), a0Var.a());
    }

    public final long a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSideServiceCaptorConfig(enabled=");
        sb.append(this.a);
        sb.append(", delaySeconds=");
        return eta.g(sb, this.b, ')');
    }

    public l0(boolean z, long j) {
        this.a = z;
        this.b = j;
    }
}
