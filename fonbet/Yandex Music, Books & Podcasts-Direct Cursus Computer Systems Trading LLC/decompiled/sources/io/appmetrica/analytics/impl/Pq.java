package io.appmetrica.analytics.impl;

import defpackage.u75;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;

/* loaded from: classes5.dex */
public final class Pq {
    public final C0653t4 a;
    public final Nr b;
    public final ConjunctiveCompositeThreadSafeToggle c;

    public Pq(Toggle toggle) {
        C0653t4 c0653t4 = new C0653t4(C0747wb.k().y());
        this.a = c0653t4;
        Nr nr = new Nr();
        this.b = nr;
        this.c = new ConjunctiveCompositeThreadSafeToggle(u75.h(c0653t4, nr, toggle == null ? new Fr() : toggle), "loc-def");
    }
}
