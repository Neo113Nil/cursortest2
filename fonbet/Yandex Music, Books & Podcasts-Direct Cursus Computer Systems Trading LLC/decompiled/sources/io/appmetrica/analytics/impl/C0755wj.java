package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.wj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0755wj extends AbstractC0697uj {
    public final IReporter b;

    public C0755wj(@NonNull P5 p5, @NonNull IReporter iReporter) {
        super(p5);
        this.b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0697uj
    public final boolean a(@NonNull H6 h6) {
        C0461me c0461me = (C0461me) C0461me.c.get(h6.d);
        HashMap hashMap = new HashMap();
        hashMap.put("type", c0461me.a);
        hashMap.put("delivery_method", c0461me.b);
        this.b.reportEvent("crash_saved", hashMap);
        return false;
    }
}
