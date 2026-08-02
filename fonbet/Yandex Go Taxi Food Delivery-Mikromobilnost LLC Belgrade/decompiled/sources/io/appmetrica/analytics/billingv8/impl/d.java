package io.appmetrica.analytics.billingv8.impl;

import defpackage.es5;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class d {
    public final es5 a;
    public final LinkedHashSet b = new LinkedHashSet();

    public d(es5 es5Var) {
        this.a = es5Var;
    }

    public final void a(Object obj) {
        this.b.remove(obj);
        if (this.b.size() == 0) {
            this.a.c();
        }
    }
}
