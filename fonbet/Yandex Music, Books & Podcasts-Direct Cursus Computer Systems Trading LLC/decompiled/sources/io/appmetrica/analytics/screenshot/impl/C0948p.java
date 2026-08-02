package io.appmetrica.analytics.screenshot.impl;

import defpackage.eta;
import defpackage.xz0;
import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0948p {
    public final boolean a;
    public final List b;
    public final long c;

    public C0948p() {
        this(new O().a, xz0.X(new O().c), new O().b);
    }

    public final long a() {
        return this.c;
    }

    public final boolean b() {
        return this.a;
    }

    public final List c() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentObserverCaptorConfig(enabled=");
        sb.append(this.a);
        sb.append(", mediaStoreColumnNames='");
        sb.append(this.b);
        sb.append("', detectWindowSeconds=");
        return eta.g(sb, this.c, ')');
    }

    public C0948p(boolean z, List list, long j) {
        this.a = z;
        this.b = list;
        this.c = j;
    }
}
