package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Locale;

/* renamed from: io.appmetrica.analytics.impl.mc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0459mc implements Cr {
    public final String a;
    public final List b;

    public C0459mc(@NonNull String str, @NonNull List<Integer> list) {
        this.a = str;
        this.b = list;
    }

    @Override // io.appmetrica.analytics.impl.Cr
    public final Ar a(Integer num) {
        return num == null ? new Ar(this, false, AbstractC0155bp.a(new StringBuilder(), this.a, "is null")) : !this.b.contains(num) ? new Ar(this, false, String.format(Locale.US, "%s(value = %d) not in range of possible values: %s", this.a, num, this.b)) : new Ar(this, true, "");
    }
}
