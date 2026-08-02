package io.appmetrica.analytics.screenshot.impl;

import defpackage.b64;

/* loaded from: classes9.dex */
public final class U {
    public final boolean a;
    public final long b;

    public U() {
        this(new y().a, new y().b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSideServiceCaptorConfig(enabled=");
        sb.append(this.a);
        sb.append(", delaySeconds=");
        return b64.o(sb, this.b, ')');
    }

    public U(boolean z, long j) {
        this.a = z;
        this.b = j;
    }
}
