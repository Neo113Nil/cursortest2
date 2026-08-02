package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class Og implements Vr {
    public final String a;

    public Og(String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.Vr
    public final Tr a(Object obj) {
        return obj == null ? new Tr(this, false, AbstractC0748tp.a(new StringBuilder(), this.a, " is null.")) : new Tr(this, true, "");
    }

    public final String a() {
        return this.a;
    }
}
