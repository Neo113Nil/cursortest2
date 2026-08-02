package io.appmetrica.analytics.networkquality.impl;

import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import java.util.Map;

/* loaded from: classes9.dex */
public final class v {
    public final long a;
    public final String b;
    public final Map c;

    public v(long j, String str, Map map) {
        this.a = j;
        this.b = str;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a == vVar.a && jl40.l(this.b, vVar.b) && jl40.l(this.c, vVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundResult(timestamp=");
        sb.append(this.a);
        sb.append(", networkType=");
        sb.append(this.b);
        sb.append(", requestResults=");
        return smw0.n(sb, this.c, ')');
    }
}
