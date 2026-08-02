package io.appmetrica.analytics.impl;

import defpackage.oyr;

/* loaded from: classes9.dex */
public final class Yp {
    public final int a;

    public Yp(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Yp) && this.a == ((Yp) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("StartupUpdateConfig(intervalSeconds="), this.a, ')');
    }
}
