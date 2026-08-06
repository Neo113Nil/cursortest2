package io.appmetrica.analytics.impl;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class F2 {

    /* renamed from: a, reason: collision with root package name */
    public final Ff f4374a;

    /* renamed from: b, reason: collision with root package name */
    public final Ea f4375b;

    public F2(Ff ff, Ea ea) {
        this.f4374a = ff;
        this.f4375b = ea;
    }

    public final boolean a(P5 p5, E2 e2) {
        Iterator it = ((V8) this.f4374a.a(p5.f4907d)).f5224a.iterator();
        while (it.hasNext()) {
            if (e2.a(it.next(), p5)) {
                return true;
            }
        }
        return false;
    }

    public final Ff b() {
        return this.f4374a;
    }

    public final Ea a() {
        return this.f4375b;
    }
}
