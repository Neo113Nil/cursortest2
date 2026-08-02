package io.appmetrica.analytics.blecollecting.impl;

import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.qv10;
import io.appmetrica.analytics.blewrapper.internal.config.ScanSettingsConfig;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.blecollecting.impl.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0148c {
    public final ScanSettingsConfig a;
    public final Set b;
    public final long c;
    public final long d;

    public C0148c(ScanSettingsConfig scanSettingsConfig, Set set, long j, long j2) {
        this.a = scanSettingsConfig;
        this.b = set;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0148c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C0148c c0148c = (C0148c) obj;
        return jl40.l(this.a, c0148c.a) && jl40.l(this.b, c0148c.b) && this.c == c0148c.c && this.d == c0148c.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + qv10.c(g8e.e(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BleCollectingConfig(scanSettings=");
        sb.append(this.a);
        sb.append(", reportSettings=");
        sb.append(this.b);
        sb.append(", waitReportTimeout=");
        sb.append(this.c);
        sb.append(", firstDelay=");
        return b64.o(sb, this.d, ')');
    }
}
