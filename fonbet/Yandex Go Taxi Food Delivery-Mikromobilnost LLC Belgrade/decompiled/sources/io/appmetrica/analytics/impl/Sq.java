package io.appmetrica.analytics.impl;

import defpackage.jl40;
import defpackage.qv10;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class Sq {
    public final String a;
    public final long b;
    public final byte[] c;

    public Sq(String str, long j, byte[] bArr) {
        this.a = str;
        this.b = j;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Sq.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Sq sq = (Sq) obj;
        if (jl40.l(this.a, sq.a) && this.b == sq.b) {
            return Arrays.equals(this.c, sq.c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "TempCachePutTask(scope='" + this.a + "', timestamp=" + this.b + ", data=" + this.c + ')';
    }
}
