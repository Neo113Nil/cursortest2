package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ValidationException;

/* loaded from: classes5.dex */
public class Jq implements Cr {
    public final Cr a;

    public Jq(@NonNull Cr cr) {
        this.a = cr;
    }

    @Override // io.appmetrica.analytics.impl.Cr
    public final Ar a(Object obj) {
        Ar a = this.a.a(obj);
        if (a.a) {
            return a;
        }
        throw new ValidationException(a.b);
    }

    @NonNull
    public final Cr a() {
        return this.a;
    }
}
