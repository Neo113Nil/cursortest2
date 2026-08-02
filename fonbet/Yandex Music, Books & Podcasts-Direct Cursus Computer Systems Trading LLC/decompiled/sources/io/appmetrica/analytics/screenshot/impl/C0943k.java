package io.appmetrica.analytics.screenshot.impl;

import defpackage.eta;
import defpackage.jj4;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0943k {
    public final boolean a;
    public final List b;
    public final long c;

    public C0943k(B b) {
        this(b.b(), b.c(), b.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0943k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C0943k c0943k = (C0943k) obj;
            return this.a == c0943k.a && Intrinsics.d(this.b, c0943k.b) && this.c == c0943k.c;
        }
        jj4.j("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + k5r.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientSideContentObserverCaptorConfig(enabled=");
        sb.append(this.a);
        sb.append(", mediaStoreColumnNames=");
        sb.append(this.b);
        sb.append(", detectWindowSeconds=");
        return eta.g(sb, this.c, ')');
    }

    public C0943k(boolean z, List list, long j) {
        this.a = z;
        this.b = list;
        this.c = j;
    }
}
