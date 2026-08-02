package io.appmetrica.analytics.impl;

import java.util.Collection;

/* loaded from: classes9.dex */
public final class Lg implements Vr {
    public final String a;

    public Lg(String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.Vr
    public final Tr a(Collection<Object> collection) {
        return Or.a((Collection) collection) ? new Tr(this, false, AbstractC0748tp.a(new StringBuilder(), this.a, " is null or empty.")) : new Tr(this, true, "");
    }
}
