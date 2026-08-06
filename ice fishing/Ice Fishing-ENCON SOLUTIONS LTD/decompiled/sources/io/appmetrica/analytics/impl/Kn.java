package io.appmetrica.analytics.impl;

import i1.AbstractC0253j;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;

/* loaded from: classes.dex */
public final class Kn {

    /* renamed from: a, reason: collision with root package name */
    public final E3 f4648a;

    /* renamed from: b, reason: collision with root package name */
    public final Do f4649b;

    /* renamed from: c, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f4650c;

    public Kn(Toggle toggle) {
        E3 e3 = new E3(C0610na.k().y());
        this.f4648a = e3;
        Do r12 = new Do();
        this.f4649b = r12;
        this.f4650c = new ConjunctiveCompositeThreadSafeToggle(AbstractC0253j.B(e3, r12, toggle == null ? new C0831vo() : toggle), "loc-def");
    }
}
