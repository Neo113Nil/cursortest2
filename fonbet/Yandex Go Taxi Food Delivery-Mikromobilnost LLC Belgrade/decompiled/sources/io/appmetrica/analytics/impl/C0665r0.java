package io.appmetrica.analytics.impl;

import defpackage.unr0;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0665r0 {
    public final List a;
    public final boolean b;

    public C0665r0(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppMetricaConfigExtension(autoCollectedDataSubscribers=");
        sb.append(this.a);
        sb.append(", needClearEnvironment=");
        return unr0.u(sb, this.b, ')');
    }
}
