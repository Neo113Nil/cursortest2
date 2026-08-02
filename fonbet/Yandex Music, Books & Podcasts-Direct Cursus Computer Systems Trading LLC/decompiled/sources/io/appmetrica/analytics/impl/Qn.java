package io.appmetrica.analytics.impl;

/* loaded from: classes5.dex */
public final class Qn {
    public final Xn a;
    public final Integer b;

    public Qn(Pn pn) {
        Xn xn;
        Integer num;
        xn = pn.a;
        this.a = xn;
        num = pn.b;
        this.b = num;
    }

    public static final Pn a(Xn xn) {
        return new Pn(xn);
    }

    public final Xn b() {
        return this.a;
    }

    public final Integer a() {
        return this.b;
    }
}
