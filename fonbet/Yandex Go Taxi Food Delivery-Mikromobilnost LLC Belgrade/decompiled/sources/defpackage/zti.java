package defpackage;

import ru.yandex.taxi.delivery.web.b;

/* loaded from: classes5.dex */
public interface zti {
    static void a(zti ztiVar, String str, tls tlsVar, sls slsVar, sls slsVar2, sls slsVar3, int i) {
        boolean z = (i & 4) == 0;
        if ((i & 16) != 0) {
            slsVar = new bgc(12);
        }
        if ((i & 32) != 0) {
            slsVar2 = new bgc(12);
        }
        if ((i & 64) != 0) {
            slsVar3 = new bgc(12);
        }
        bui buiVar = (bui) ztiVar;
        oep0 oep0Var = buiVar.p;
        ((pep0) oep0Var).f(new zsa(13, (b) buiVar.d.get(), new dv9(25, tlsVar), new jc0(20, slsVar3)), new wvi(str, true, false, z, slsVar, slsVar2), hxx.a);
    }
}
