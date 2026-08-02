package io.appmetrica.analytics.screenshot.impl;

import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1105j {
    public final boolean a;
    public final List b;
    public final long c;

    public C1105j(boolean z, List list, long j) {
        this.a = z;
        this.b = list;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1105j)) {
            return false;
        }
        C1105j c1105j = (C1105j) obj;
        return this.a == c1105j.a && jl40.l(this.b, c1105j.b) && this.c == c1105j.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + unr0.c(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientSideContentObserverCaptorConfig(enabled=");
        sb.append(this.a);
        sb.append(", mediaStoreColumnNames=");
        sb.append(this.b);
        sb.append(", detectWindowSeconds=");
        return b64.o(sb, this.c, ')');
    }
}
