package io.appmetrica.analytics.impl;

import defpackage.u75;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;

/* loaded from: classes5.dex */
public final class L {
    public final C0724vh a = C0747wb.k().y();
    public final SavableToggle b;
    public final OuterStateToggle c;
    public final OuterStateToggle d;
    public final ConjunctiveCompositeThreadSafeToggle e;
    public final ConjunctiveCompositeThreadSafeToggle f;
    public final SavableToggle g;

    public L(C0385jp c0385jp) {
        SavableToggle savableToggle = new SavableToggle("advIdsFromClientApi", new K(this));
        this.b = savableToggle;
        OuterStateToggle outerStateToggle = new OuterStateToggle(false, "GAID-remote-config");
        this.c = outerStateToggle;
        OuterStateToggle outerStateToggle2 = new OuterStateToggle(false, "HOAID-remote-config");
        this.d = outerStateToggle2;
        this.e = new ConjunctiveCompositeThreadSafeToggle(u75.h(savableToggle, outerStateToggle), "GAID");
        this.f = new ConjunctiveCompositeThreadSafeToggle(u75.h(savableToggle, outerStateToggle2), "HOAID");
        this.g = savableToggle;
        a(c0385jp);
    }

    public final I a() {
        int i = 3;
        int i2 = 4;
        int i3 = this.e.getActualState() ? 1 : !this.b.getActualState() ? 2 : !this.c.getActualState() ? 3 : 4;
        if (this.f.getActualState()) {
            i = 1;
        } else if (!this.b.getActualState()) {
            i = 2;
        } else if (this.d.getActualState()) {
            i = 4;
        }
        if (this.g.getActualState()) {
            i2 = 1;
        } else if (!this.b.getActualState()) {
            i2 = 2;
        }
        return new I(i3, i, i2);
    }

    public final void a(C0385jp c0385jp) {
        boolean z = c0385jp.q;
        boolean z2 = true;
        this.c.update(!z || c0385jp.o.c);
        OuterStateToggle outerStateToggle = this.d;
        if (z && !c0385jp.o.e) {
            z2 = false;
        }
        outerStateToggle.update(z2);
    }
}
