package ru.yandex.taxi.preorder.summary.selector.ui.verticals;

import defpackage.pf31;
import defpackage.rb5;
import defpackage.sb5;
import defpackage.tls;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.VerticalInternalTariffView;

/* loaded from: classes6.dex */
public final class b implements rb5 {
    public final /* synthetic */ pf31 b;
    public final /* synthetic */ sb5 c;

    public b(pf31 pf31Var, sb5 sb5Var) {
        this.b = pf31Var;
        this.c = sb5Var;
    }

    @Override // defpackage.rb5
    public final void a() {
        this.b.c.d.a = false;
    }

    @Override // defpackage.rb5
    public final void b() {
        tls tlsVar = this.b.y;
        if (tlsVar != null) {
            ((VerticalInternalTariffView.AnonymousClass4) tlsVar).invoke(this.c);
        }
    }
}
