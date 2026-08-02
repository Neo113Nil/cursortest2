package io.appmetrica.analytics.screenshot.impl;

import defpackage.eta;
import java.util.List;

/* loaded from: classes5.dex */
public final class i0 {
    public final boolean a;
    public final List b;
    public final long c;

    public i0(C0948p c0948p) {
        this(c0948p.b(), c0948p.c(), c0948p.a());
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
        StringBuilder sb = new StringBuilder("ServiceSideContentObserverCaptorConfig(enabled=");
        sb.append(this.a);
        sb.append(", mediaStoreColumnNames=");
        sb.append(this.b);
        sb.append(", detectWindowSeconds=");
        return eta.g(sb, this.c, ')');
    }

    public i0(boolean z, List list, long j) {
        this.a = z;
        this.b = list;
        this.c = j;
    }
}
