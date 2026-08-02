package io.appmetrica.analytics.locationinternal.impl;

import defpackage.oyr;
import defpackage.qv10;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0962k1 {
    public final int a;
    public final int b;
    public final long c;
    public final int d;

    public C0962k1(int i, int i2, long j, int i3) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0962k1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C0962k1 c0962k1 = (C0962k1) obj;
        return this.a == c0962k1.a && this.b == c0962k1.b && this.c == c0962k1.c && this.d == c0962k1.d;
    }

    public final int hashCode() {
        return qv10.c(((this.a * 31) + this.b) * 31, 31, this.c) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationFlushingArguments(recordsCountToForceFlush=");
        sb.append(this.a);
        sb.append(", maxBatchSize=");
        sb.append(this.b);
        sb.append(", maxAgeToForceFlush=");
        sb.append(this.c);
        sb.append(", maxRecordsToStoreLocally=");
        return oyr.s(sb, this.d, ')');
    }
}
