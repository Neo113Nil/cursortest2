package ru.yandex.taxi.search;

import android.widget.EditText;
import defpackage.bvf0;
import defpackage.czo0;
import defpackage.gct0;
import defpackage.hbp0;
import defpackage.kdc;
import defpackage.qoi0;
import defpackage.tje;
import defpackage.w511;
import defpackage.yw0;
import defpackage.zuj0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.design.SourceDestinationComponentV2;
import ru.yandex.taxi.address.experiment.r;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class g {
    public final SourceDestinationComponentV2 a;
    public final zuj0 b;
    public final r0 c = bvf0.c(new r(0));
    public final hbp0 d;
    public boolean e;

    public g(SourceDestinationComponentV2 sourceDestinationComponentV2, zuj0 zuj0Var) {
        this.a = sourceDestinationComponentV2;
        this.b = zuj0Var;
        String d = qoi0.a(g.class).d();
        this.d = new hbp0(new czo0(14), d == null ? "" : d, null);
    }

    public final EditText a(PointType pointType) {
        int i = gct0.a[pointType.ordinal()];
        SourceDestinationComponentV2 sourceDestinationComponentV2 = this.a;
        if (i == 1) {
            return sourceDestinationComponentV2.sourceInput();
        }
        if (i == 2) {
            return sourceDestinationComponentV2.destinationInput();
        }
        w511.b();
        return null;
    }

    public final void b() {
        hbp0 hbp0Var = this.d;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new SourceDestinationHolder$attach$1(this, null), 3);
    }

    public final boolean c(PointType pointType) {
        int i = pointType == null ? -1 : gct0.a[pointType.ordinal()];
        SourceDestinationComponentV2 sourceDestinationComponentV2 = this.a;
        if (i == -1) {
            return sourceDestinationComponentV2.hasFocus();
        }
        if (i == 1) {
            return sourceDestinationComponentV2.hasSourceFocus();
        }
        if (i == 2) {
            return sourceDestinationComponentV2.hasDestinationFocus();
        }
        w511.b();
        return false;
    }

    public final void d(PointType pointType) {
        int i = gct0.a[pointType.ordinal()];
        SourceDestinationComponentV2 sourceDestinationComponentV2 = this.a;
        if (i == 1) {
            sourceDestinationComponentV2.requestSourceFocus();
        } else if (i == 2) {
            sourceDestinationComponentV2.requestDestinationFocus();
        } else {
            w511.b();
        }
    }

    public final void e(PointType pointType, String str) {
        r0 r0Var = this.c;
        r rVar = (r) r0Var.getValue();
        int i = gct0.a[pointType.ordinal()];
        if (i == 1) {
            r a = r.a(rVar, ru.yandex.taxi.address.experiment.a.a(rVar.a, null, str, null, null, null, null, null, null, false, false, false, false, 524285), null, 2);
            r0Var.getClass();
            r0Var.m(null, a);
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            r a2 = r.a(rVar, null, ru.yandex.taxi.address.experiment.a.a(rVar.b, null, str, null, null, null, null, null, null, false, false, false, false, 524285), 1);
            r0Var.getClass();
            r0Var.m(null, a2);
        }
    }

    public final void f(PointType pointType, kdc kdcVar) {
        r0 r0Var = this.c;
        r rVar = (r) r0Var.getValue();
        int i = gct0.a[pointType.ordinal()];
        if (i == 1) {
            r a = r.a(rVar, ru.yandex.taxi.address.experiment.a.a(rVar.a, null, null, kdcVar, null, null, null, null, null, false, false, false, false, 524283), null, 2);
            r0Var.getClass();
            r0Var.m(null, a);
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            r a2 = r.a(rVar, null, ru.yandex.taxi.address.experiment.a.a(rVar.b, null, null, kdcVar, null, null, null, null, null, false, false, false, false, 524283), 1);
            r0Var.getClass();
            r0Var.m(null, a2);
        }
    }

    public final void g(PointType pointType) {
        yw0 yw0Var;
        yw0 yw0Var2;
        r0 r0Var = this.c;
        r rVar = (r) r0Var.getValue();
        int i = gct0.a[pointType.ordinal()];
        if (i == 1) {
            yw0Var = rVar.a.g.b;
            yw0Var2 = rVar.b.g.a;
        } else if (i != 2) {
            w511.b();
            return;
        } else {
            yw0Var = rVar.a.g.a;
            yw0Var2 = rVar.b.g.b;
        }
        r rVar2 = new r(ru.yandex.taxi.address.experiment.a.a(rVar.a, null, null, null, null, yw0Var, null, null, null, false, false, false, false, 524255), ru.yandex.taxi.address.experiment.a.a(rVar.b, null, null, null, null, yw0Var2, null, null, null, false, false, false, false, 524255));
        r0Var.getClass();
        r0Var.m(null, rVar2);
    }
}
