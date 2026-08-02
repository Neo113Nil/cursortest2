package com.yandex.plus.core.graphql;

import defpackage.eta;

/* loaded from: classes4.dex */
public final class y {
    public final long a;
    public final long b;

    public y(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a == yVar.a && this.b == yVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetPollingParameters(initStartMessageTimeoutMillis=");
        sb.append(this.a);
        sb.append(", loadMessageTimeoutMillis=");
        return eta.g(sb, this.b, ')');
    }
}
