package io.appmetrica.analytics.impl;

import defpackage.jl40;
import defpackage.oyr;

/* renamed from: io.appmetrica.analytics.impl.ek, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0310ek {
    public final long a;
    public final C0762ua b;
    public final int c;

    public C0310ek(long j, C0762ua c0762ua, int i) {
        this.a = j;
        this.b = c0762ua;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0310ek)) {
            return false;
        }
        C0310ek c0310ek = (C0310ek) obj;
        return this.a == c0310ek.a && jl40.l(this.b, c0310ek.b) && this.c == c0310ek.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionCandidate(sessionId=");
        sb.append(this.a);
        sb.append(", sessionDesc=");
        sb.append(this.b);
        sb.append(", sessionTypeCode=");
        return oyr.s(sb, this.c, ')');
    }
}
