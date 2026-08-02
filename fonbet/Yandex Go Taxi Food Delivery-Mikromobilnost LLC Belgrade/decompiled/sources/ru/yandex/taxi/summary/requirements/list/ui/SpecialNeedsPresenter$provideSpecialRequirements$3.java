package ru.yandex.taxi.summary.requirements.list.ui;

import defpackage.g8e;
import defpackage.jmw0;
import defpackage.jst;
import defpackage.soj0;
import defpackage.tje;
import defpackage.tls;
import defpackage.upj0;
import defpackage.vot0;
import defpackage.zot0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.summary.requirements.list.interactors.k0;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class SpecialNeedsPresenter$provideSpecialRequirements$3 extends FunctionReferenceImpl implements tls {
    public final void i(zot0 zot0Var) {
        soj0 a;
        vot0 vot0Var = (vot0) this.receiver;
        ru.yandex.taxi.preorder.summary.tariffpage.requirements.a aVar = vot0Var.A;
        k0 k0Var = vot0Var.y;
        if (k0.c(k0Var, zot0Var.g, vot0Var.G.a, false, 4) == null || (a = k0Var.a(zot0Var.g, true)) == null) {
            return;
        }
        if (a.e != null) {
            tje.N(vot0Var.Jg(), null, null, new SpecialNeedsPresenter$onSwitcherClick$1$1$1(vot0Var, a, zot0Var, null), 3);
            return;
        }
        upj0 upj0Var = a.a;
        if (upj0Var != null) {
            aVar.c(upj0Var, !a.b);
            return;
        }
        jmw0 jmw0Var = a.c;
        if (jmw0Var != null) {
            aVar.b(jmw0Var);
        } else {
            g8e.C("Unsupported action in SpecialNeedsPresenter", jst.e);
        }
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((zot0) obj);
        return zy11.a;
    }
}
