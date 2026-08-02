package io.appmetrica.analytics.impl;

import defpackage.dfi;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0534p0 {
    public final List a;
    public final boolean b;

    public C0534p0(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppMetricaConfigExtension(autoCollectedDataSubscribers=");
        sb.append(this.a);
        sb.append(", needClearEnvironment=");
        return dfi.j(sb, this.b, ')');
    }
}
