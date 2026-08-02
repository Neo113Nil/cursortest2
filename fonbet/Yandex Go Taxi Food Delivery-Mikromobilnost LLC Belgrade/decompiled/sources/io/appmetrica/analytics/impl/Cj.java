package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class Cj extends Aj {
    public final IReporter b;

    public Cj(S5 s5, IReporter iReporter) {
        super(s5);
        this.b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.Aj
    public final boolean a(K6 k6) {
        Be be = (Be) Be.c.get(k6.d);
        HashMap hashMap = new HashMap();
        hashMap.put("type", be.a);
        hashMap.put("delivery_method", be.b);
        this.b.reportEvent("crash_saved", hashMap);
        return false;
    }
}
