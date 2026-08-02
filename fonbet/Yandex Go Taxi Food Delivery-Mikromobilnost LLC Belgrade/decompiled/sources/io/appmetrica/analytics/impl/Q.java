package io.appmetrica.analytics.impl;

import defpackage.scc;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;

/* loaded from: classes9.dex */
public final class Q {
    public final Lh a = Jb.k().y();
    public final SavableToggle b;
    public final OuterStateToggle c;
    public final OuterStateToggle d;
    public final ConjunctiveCompositeThreadSafeToggle e;
    public final ConjunctiveCompositeThreadSafeToggle f;
    public final SavableToggle g;

    public Q(Bp bp) {
        SavableToggle savableToggle = new SavableToggle("advIdsFromClientApi", new P(this));
        this.b = savableToggle;
        OuterStateToggle outerStateToggle = new OuterStateToggle(false, "GAID-remote-config");
        this.c = outerStateToggle;
        OuterStateToggle outerStateToggle2 = new OuterStateToggle(false, "HOAID-remote-config");
        this.d = outerStateToggle2;
        this.e = new ConjunctiveCompositeThreadSafeToggle(scc.g(savableToggle, outerStateToggle), "GAID");
        this.f = new ConjunctiveCompositeThreadSafeToggle(scc.g(savableToggle, outerStateToggle2), "HOAID");
        this.g = savableToggle;
        a(bp);
    }

    public final N a() {
        return new N(this.e.getActualState() ? O.ALLOWED : !this.b.getActualState() ? O.FORBIDDEN_BY_CLIENT_CONFIG : !this.c.getActualState() ? O.FORBIDDEN_BY_REMOTE_CONFIG : O.UNKNOWN, this.f.getActualState() ? O.ALLOWED : !this.b.getActualState() ? O.FORBIDDEN_BY_CLIENT_CONFIG : !this.d.getActualState() ? O.FORBIDDEN_BY_REMOTE_CONFIG : O.UNKNOWN, this.g.getActualState() ? O.ALLOWED : !this.b.getActualState() ? O.FORBIDDEN_BY_CLIENT_CONFIG : O.UNKNOWN);
    }

    public final void a(Bp bp) {
        boolean z = bp.q;
        boolean z2 = true;
        this.c.update(!z || bp.o.c);
        OuterStateToggle outerStateToggle = this.d;
        if (z && !bp.o.e) {
            z2 = false;
        }
        outerStateToggle.update(z2);
    }
}
