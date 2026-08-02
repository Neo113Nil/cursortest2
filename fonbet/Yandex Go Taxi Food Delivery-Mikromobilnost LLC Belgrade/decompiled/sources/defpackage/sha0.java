package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes8.dex */
public final class sha0 {
    public final lx4 a;
    public final arv0 b;

    public sha0(lx4 lx4Var, arv0 arv0Var) {
        this.a = lx4Var;
        this.b = arv0Var;
    }

    public final void a(qfo qfoVar, String str) {
        String a = qfoVar.getA();
        if (a == null || evu0.J(a)) {
            qv10.C(new Object[]{str}, 1, "Empty event name for promo event %s", jst.e);
            return;
        }
        i d = ((j) this.a).d(g8e.p(qfoVar.getA(), Extension.DOT_CHAR, str));
        d.d("tag", qfoVar.getC());
        d.i();
        d.m();
    }
}
