package io.appmetrica.analytics.impl;

import defpackage.eta;

/* loaded from: classes5.dex */
public final class Ja {
    public final long a;

    public Ja(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ja) && this.a == ((Ja) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return eta.g(new StringBuilder("ExternalAttributionConfig(collectingInterval="), this.a, ')');
    }
}
