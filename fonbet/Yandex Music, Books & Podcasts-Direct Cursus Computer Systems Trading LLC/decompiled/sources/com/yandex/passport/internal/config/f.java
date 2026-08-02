package com.yandex.passport.internal.config;

import defpackage.dfi;
import defpackage.eta;

/* loaded from: classes4.dex */
public final class f {
    public final String a;
    public final long b;

    public f(long j) {
        this.a = dfi.d(j, "location_backend_host_");
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.b == ((f) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return eta.g(new StringBuilder("Backend(locationId="), this.b, ')');
    }
}
