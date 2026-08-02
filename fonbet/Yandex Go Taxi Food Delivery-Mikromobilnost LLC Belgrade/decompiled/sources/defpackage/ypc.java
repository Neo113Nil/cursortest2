package defpackage;

import com.yandex.go.support.web.e;
import com.yandex.go.support.web.factory.a;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;

/* loaded from: classes14.dex */
public final class ypc extends h55 {
    public final nqc D;
    public final p1b E;
    public final vbb F;

    public ypc(nqc nqcVar, p1b p1bVar, vbb vbbVar) {
        super(null);
        this.D = nqcVar;
        this.E = p1bVar;
        this.F = vbbVar;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        wpc wpcVar = (wpc) obj;
        String str = wpcVar.b;
        fqc fqcVar = wpcVar.a;
        p1b p1bVar = this.E;
        if (!p1bVar.h(str)) {
            r(new foc(1));
            return;
        }
        String c = ((as21) p1bVar.a).c("LAST_KNOWN_SUPPORT_URL");
        if (c == null) {
            c = "";
        }
        String d = p1bVar.d(fqcVar);
        if (d == null) {
            d = wpcVar.b;
        }
        mqc mqcVar = new mqc(c, d, fqcVar);
        boolean l = jl40.l(fqcVar, bqc.c);
        vbb vbbVar = this.F;
        w030 a = l ? ((y030) vbbVar.b).a(ContentContainer$ZOrder.IMPORTANT) : (w030) vbbVar.a;
        oo2 oo2Var = this.D.a;
        A(new e(a, (hqc) ((xvf0) oo2Var.a).get(), (jqc) ((xvf0) oo2Var.b).get(), (a) ((xvf0) oo2Var.c).get(), (zm41) ((xvf0) oo2Var.w).get(), (com.yandex.go.support.analytics.a) ((swb) oo2Var.x).get()), mqcVar, new xpc(this));
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        j(dpb.a);
    }
}
