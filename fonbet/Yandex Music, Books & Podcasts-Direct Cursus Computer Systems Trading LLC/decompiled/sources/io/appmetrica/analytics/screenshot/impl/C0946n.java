package io.appmetrica.analytics.screenshot.impl;

import defpackage.eta;
import defpackage.jj4;

/* renamed from: io.appmetrica.analytics.screenshot.impl.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0946n {
    public final boolean a;
    public final long b;

    public C0946n(H h) {
        this(h.b(), h.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0946n.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C0946n c0946n = (C0946n) obj;
            return this.a == c0946n.a && this.b == c0946n.b;
        }
        jj4.j("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientSideServiceCaptorConfig(enabled=");
        sb.append(this.a);
        sb.append(", delaySeconds=");
        return eta.g(sb, this.b, ')');
    }

    public C0946n(boolean z, long j) {
        this.a = z;
        this.b = j;
    }
}
