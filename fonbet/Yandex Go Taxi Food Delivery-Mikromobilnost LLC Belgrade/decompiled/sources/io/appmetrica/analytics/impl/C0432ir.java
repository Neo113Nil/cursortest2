package io.appmetrica.analytics.impl;

import defpackage.scc;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;

/* renamed from: io.appmetrica.analytics.impl.ir, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0432ir {
    public final C0843x4 a;
    public final hs b;
    public final ConjunctiveCompositeThreadSafeToggle c;

    public C0432ir(Toggle toggle) {
        C0843x4 c0843x4 = new C0843x4(Jb.k().y());
        this.a = c0843x4;
        hs hsVar = new hs();
        this.b = hsVar;
        this.c = new ConjunctiveCompositeThreadSafeToggle(scc.g(c0843x4, hsVar, toggle == null ? new Yr() : toggle), "loc-def");
    }
}
