package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class Bc implements Vr {
    public final String a;
    public final List b;

    public Bc(String str, List<Integer> list) {
        this.a = str;
        this.b = list;
    }

    @Override // io.appmetrica.analytics.impl.Vr
    public final Tr a(Integer num) {
        return num == null ? new Tr(this, false, AbstractC0748tp.a(new StringBuilder(), this.a, "is null")) : !this.b.contains(num) ? new Tr(this, false, String.format(Locale.US, "%s(value = %d) not in range of possible values: %s", this.a, num, this.b)) : new Tr(this, true, "");
    }
}
