package io.appmetrica.analytics.networkquality.impl;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes9.dex */
public final class f {
    public final boolean a;
    public final int b;
    public final int c;
    public final List d;

    public f(boolean z, int i, int i2, List list) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b && this.c == fVar.c && jl40.l(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + oyr.b(this.c, oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkQualityConfig(enabled=");
        sb.append(this.a);
        sb.append(", startupRandomDelayMaxSeconds=");
        sb.append(this.b);
        sb.append(", repeatIntervalSeconds=");
        sb.append(this.c);
        sb.append(", requests=");
        return unr0.t(sb, this.d, ')');
    }
}
