package io.appmetrica.analytics.billingv8.impl;

import defpackage.pz2;
import java.util.LinkedHashSet;

/* loaded from: classes5.dex */
public final class d {
    public final pz2 a;
    public final LinkedHashSet b = new LinkedHashSet();

    public d(pz2 pz2Var) {
        this.a = pz2Var;
    }

    public final void a(Object obj) {
        this.b.remove(obj);
        if (this.b.size() == 0) {
            this.a.c();
        }
    }
}
