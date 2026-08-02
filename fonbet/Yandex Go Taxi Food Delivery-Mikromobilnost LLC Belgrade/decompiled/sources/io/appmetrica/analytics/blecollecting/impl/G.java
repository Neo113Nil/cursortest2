package io.appmetrica.analytics.blecollecting.impl;

import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import java.util.Set;

/* loaded from: classes9.dex */
public final class G {
    public final Set a;
    public final String b;
    public final boolean c;
    public final String d;
    public final long e;

    public G(Set set, String str, boolean z, String str2, long j) {
        this.a = set;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = j;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final long d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!G.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        G g = (G) obj;
        return jl40.l(this.a, g.a) && jl40.l(this.b, g.b) && this.c == g.c && jl40.l(this.d, g.d) && this.e == g.e;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Long.hashCode(this.e) + ((e + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportSettingsConfig(scanFilters=");
        sb.append(this.a);
        sb.append(", apiKey='");
        sb.append(this.b);
        sb.append("', reportToAppMetrica=");
        sb.append(this.c);
        sb.append(", rtmProjectName=");
        sb.append(this.d);
        sb.append(", sameBeaconMinReportingInterval=");
        return b64.o(sb, this.e, ')');
    }
}
