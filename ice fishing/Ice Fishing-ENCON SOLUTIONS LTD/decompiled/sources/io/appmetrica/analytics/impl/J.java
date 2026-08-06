package io.appmetrica.analytics.impl;

import i1.AbstractC0253j;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final Ze f4557a = C0610na.k().y();

    /* renamed from: b, reason: collision with root package name */
    public final SavableToggle f4558b;

    /* renamed from: c, reason: collision with root package name */
    public final OuterStateToggle f4559c;

    /* renamed from: d, reason: collision with root package name */
    public final OuterStateToggle f4560d;

    /* renamed from: e, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f4561e;

    /* renamed from: f, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f4562f;

    /* renamed from: g, reason: collision with root package name */
    public final SavableToggle f4563g;

    public J(C0415fm c0415fm) {
        SavableToggle savableToggle = new SavableToggle("advIdsFromClientApi", new I(this));
        this.f4558b = savableToggle;
        OuterStateToggle outerStateToggle = new OuterStateToggle(false, "GAID-remote-config");
        this.f4559c = outerStateToggle;
        OuterStateToggle outerStateToggle2 = new OuterStateToggle(false, "HOAID-remote-config");
        this.f4560d = outerStateToggle2;
        this.f4561e = new ConjunctiveCompositeThreadSafeToggle(AbstractC0253j.B(savableToggle, outerStateToggle), "GAID");
        this.f4562f = new ConjunctiveCompositeThreadSafeToggle(AbstractC0253j.B(savableToggle, outerStateToggle2), "HOAID");
        this.f4563g = savableToggle;
        a(c0415fm);
    }

    public final void a(C0415fm c0415fm) {
        boolean z2 = c0415fm.f6017p;
        boolean z3 = true;
        this.f4559c.update(!z2 || c0415fm.f6015n.f6416c);
        OuterStateToggle outerStateToggle = this.f4560d;
        if (z2 && !c0415fm.f6015n.f6418e) {
            z3 = false;
        }
        outerStateToggle.update(z3);
    }

    public final G a() {
        int i2;
        int i3 = 3;
        int i4 = 4;
        if (this.f4561e.getActualState()) {
            i2 = 1;
        } else if (this.f4558b.getActualState()) {
            i2 = !this.f4559c.getActualState() ? 3 : 4;
        } else {
            i2 = 2;
        }
        if (this.f4562f.getActualState()) {
            i3 = 1;
        } else if (!this.f4558b.getActualState()) {
            i3 = 2;
        } else if (this.f4560d.getActualState()) {
            i3 = 4;
        }
        if (this.f4563g.getActualState()) {
            i4 = 1;
        } else if (!this.f4558b.getActualState()) {
            i4 = 2;
        }
        return new G(i2, i3, i4);
    }
}
