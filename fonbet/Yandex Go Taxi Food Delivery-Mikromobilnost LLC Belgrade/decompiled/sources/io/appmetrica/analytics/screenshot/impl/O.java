package io.appmetrica.analytics.screenshot.impl;

import defpackage.b64;
import java.util.List;

/* loaded from: classes9.dex */
public final class O {
    public final boolean a;
    public final List b;
    public final long c;

    public O() {
        this(new x().a, AbstractC1108m.a(), new x().b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSideContentObserverCaptorConfig(enabled=");
        sb.append(this.a);
        sb.append(", mediaStoreColumnNames=");
        sb.append(this.b);
        sb.append(", detectWindowSeconds=");
        return b64.o(sb, this.c, ')');
    }

    public O(boolean z, List list, long j) {
        this.a = z;
        this.b = list;
        this.c = j;
    }
}
