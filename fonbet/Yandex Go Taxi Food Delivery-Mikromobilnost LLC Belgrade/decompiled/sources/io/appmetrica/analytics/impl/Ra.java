package io.appmetrica.analytics.impl;

import defpackage.b64;

/* loaded from: classes9.dex */
public final class Ra {
    public final long a;

    public Ra(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ra) && this.a == ((Ra) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b64.o(new StringBuilder("ExternalAttributionConfig(collectingInterval="), this.a, ')');
    }
}
