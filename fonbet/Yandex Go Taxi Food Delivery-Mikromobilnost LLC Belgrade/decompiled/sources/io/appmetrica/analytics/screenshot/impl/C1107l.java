package io.appmetrica.analytics.screenshot.impl;

import defpackage.b64;

/* renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1107l {
    public final boolean a;
    public final long b;

    public C1107l(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1107l)) {
            return false;
        }
        C1107l c1107l = (C1107l) obj;
        return this.a == c1107l.a && this.b == c1107l.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientSideServiceCaptorConfig(enabled=");
        sb.append(this.a);
        sb.append(", delaySeconds=");
        return b64.o(sb, this.b, ')');
    }
}
