package io.appmetrica.analytics.impl;

import defpackage.oyr;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Yk implements Vr {
    public final Map a;

    public Yk(Map<String, ?> map) {
        this.a = map;
    }

    @Override // io.appmetrica.analytics.impl.Vr
    public final Tr a(String str) {
        return this.a.containsKey(str) ? new Tr(this, false, oyr.p("Failed to activate AppMetrica with provided apiKey ApiKey ", str, " has already been used by another reporter.")) : new Tr(this, true, "");
    }
}
