package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.yg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0809yg implements Cr {
    public final String a;

    public C0809yg(@NonNull String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.Cr
    public final Ar a(Object obj) {
        return obj == null ? new Ar(this, false, AbstractC0155bp.a(new StringBuilder(), this.a, " is null.")) : new Ar(this, true, "");
    }

    @NonNull
    public final String a() {
        return this.a;
    }
}
