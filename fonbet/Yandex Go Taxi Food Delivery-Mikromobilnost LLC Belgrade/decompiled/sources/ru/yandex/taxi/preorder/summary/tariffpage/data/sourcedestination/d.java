package ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination;

import android.view.ViewGroup;
import defpackage.amp0;
import defpackage.c1x0;
import defpackage.czo0;
import defpackage.hbp0;
import defpackage.mct0;
import defpackage.mth;
import defpackage.n0l0;
import defpackage.tje;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.address.design.SourceDestinationComponentV2;

/* loaded from: classes6.dex */
public final class d {
    public final amp0 a;
    public final n0l0 b;
    public c1x0 c;
    public final hbp0 d;

    public d(amp0 amp0Var, n0l0 n0l0Var) {
        this.a = amp0Var;
        this.b = n0l0Var;
        String str = (2 & 1) != 0 ? null : "ControlStateDelegate";
        this.d = new hbp0(new czo0(14), str == null ? "" : str, null);
    }

    public final void a(ViewGroup viewGroup, ViewGroup viewGroup2, mth mthVar) {
        hbp0 hbp0Var = this.d;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new ControlStateDelegate$attach$1(this, mthVar, viewGroup, viewGroup2, null), 3);
    }

    public final void b(mct0 mct0Var) {
        n0l0 n0l0Var = this.b;
        if (mct0Var != null) {
            r0 r0Var = n0l0Var.l;
            r0Var.getClass();
            r0Var.m(null, mct0Var);
            return;
        }
        SourceDestinationComponent sourceDestinationComponent = n0l0Var.j;
        if (sourceDestinationComponent != null) {
            sourceDestinationComponent.setVisibility(8);
        }
        SourceDestinationComponentV2 sourceDestinationComponentV2 = n0l0Var.k;
        if (sourceDestinationComponentV2 != null) {
            sourceDestinationComponentV2.setVisibility(8);
        }
    }
}
