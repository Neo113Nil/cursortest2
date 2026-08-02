package io.appmetrica.analytics.impl;

import defpackage.qv10;

/* renamed from: io.appmetrica.analytics.impl.bo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0228bo {
    public final long a;
    public final int b;
    public final long c;
    public final boolean d;

    public C0228bo(long j, int i, long j2, boolean z) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0228bo)) {
            return false;
        }
        C0228bo c0228bo = (C0228bo) obj;
        return this.a == c0228bo.a && this.b == c0228bo.b && this.c == c0228bo.c && this.d == c0228bo.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qv10.c(((Long.hashCode(this.a) * 31) + this.b) * 31, 31, this.c);
    }
}
