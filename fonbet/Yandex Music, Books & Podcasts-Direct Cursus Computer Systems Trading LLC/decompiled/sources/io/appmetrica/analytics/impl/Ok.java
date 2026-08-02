package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import defpackage.hrg;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Ok implements Cr {
    public final Map a;

    public Ok(@NonNull Map<String, ?> map) {
        this.a = map;
    }

    @Override // io.appmetrica.analytics.impl.Cr
    public final Ar a(String str) {
        return this.a.containsKey(str) ? new Ar(this, false, hrg.q("Failed to activate AppMetrica with provided apiKey ApiKey ", str, " has already been used by another reporter.")) : new Ar(this, true, "");
    }
}
