package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.vg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0723vg implements Cr {
    public final String a;

    public C0723vg(@NonNull String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.Cr
    public final Ar a(Collection<Object> collection) {
        return AbstractC0734vr.a((Collection) collection) ? new Ar(this, false, AbstractC0155bp.a(new StringBuilder(), this.a, " is null or empty.")) : new Ar(this, true, "");
    }
}
