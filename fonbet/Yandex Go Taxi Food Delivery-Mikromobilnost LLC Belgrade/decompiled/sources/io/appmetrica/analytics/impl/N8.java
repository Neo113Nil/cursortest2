package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class N8 {
    public final C0794vd a;

    public N8() {
        this(Jb.k().l());
    }

    public final V8 a(O8 o8, Q5 q5, C0545mo c0545mo, as asVar) {
        V8 v8 = new V8(o8, q5.a(), c0545mo, asVar);
        C0794vd c0794vd = this.a;
        synchronized (c0794vd) {
            c0794vd.c.add(v8);
        }
        return v8;
    }

    public N8(C0794vd c0794vd) {
        this.a = c0794vd;
    }
}
