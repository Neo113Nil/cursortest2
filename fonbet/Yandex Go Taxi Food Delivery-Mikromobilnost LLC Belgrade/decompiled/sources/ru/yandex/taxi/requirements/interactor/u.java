package ru.yandex.taxi.requirements.interactor;

import defpackage.avj0;
import defpackage.bdj0;
import defpackage.bqj0;
import defpackage.cdj0;
import defpackage.cjj0;
import defpackage.ck31;
import defpackage.cvu0;
import defpackage.cwi0;
import defpackage.d6z;
import defpackage.dqe0;
import defpackage.ewi0;
import defpackage.fnx0;
import defpackage.hqj0;
import defpackage.kyh0;
import defpackage.pex0;
import defpackage.qpj0;
import defpackage.wiq0;
import defpackage.wjj0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.requirements.models.net.experiment.RequirementBubbleDto;

/* loaded from: classes6.dex */
public final class u {
    public final dqe0 a;
    public final wiq0 b;
    public final ck31 c;
    public final cjj0 d;
    public final hqj0 e;
    public final bqj0 f;
    public final ewi0 g;

    public u(dqe0 dqe0Var, wiq0 wiq0Var, ck31 ck31Var, cjj0 cjj0Var, hqj0 hqj0Var, bqj0 bqj0Var, ewi0 ewi0Var) {
        this.a = dqe0Var;
        this.b = wiq0Var;
        this.c = ck31Var;
        this.d = cjj0Var;
        this.e = hqj0Var;
        this.f = bqj0Var;
        this.g = ewi0Var;
    }

    public final String a(ru.yandex.taxi.requirements.models.net.experiment.c cVar, cwi0 cwi0Var, int i) {
        return cvu0.v(d6z.Y(cVar, this.g.a(cwi0Var, i)), "$N$", String.valueOf(i), false);
    }

    public final wjj0 b() {
        bdj0 c;
        int b;
        qpj0 qpj0Var;
        String X;
        boolean z;
        bdj0 bdj0Var;
        String str;
        String str2;
        String str3;
        Map map;
        fnx0 n = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.b).n();
        if (n != null) {
            ru.yandex.taxi.requirements.models.net.experiment.c b2 = this.e.b();
            pex0 pex0Var = n.c;
            String str4 = n.d;
            if (!b2.f.contains(pex0Var.b) && (b = this.d.b((c = this.d.c(pex0Var, str4, this.a.a.x, b2, cdj0.a)), true)) >= 1) {
                String str5 = n.c.b;
                hqj0 hqj0Var = this.e;
                qpj0 qpj0Var2 = (qpj0) b2.e.get("__default__");
                if (qpj0Var2 == null) {
                    qpj0Var2 = new qpj0(0);
                }
                if (d6z.S(b2, qpj0Var2.a) && d6z.S(b2, qpj0Var2.b) && d6z.S(b2, qpj0Var2.c) && d6z.S(b2, qpj0Var2.d) && d6z.S(b2, qpj0Var2.e)) {
                    qpj0 qpj0Var3 = (qpj0) b2.e.get(str5);
                    if (qpj0Var3 == null) {
                        qpj0Var3 = new qpj0(0);
                    }
                    RequirementNonBlockingPopupInteractor$tariffPopupDto$1 requirementNonBlockingPopupInteractor$tariffPopupDto$1 = RequirementNonBlockingPopupInteractor$tariffPopupDto$1.b;
                    hqj0Var.getClass();
                    qpj0Var = new qpj0(hqj0.d(qpj0Var3, qpj0Var2, b2, requirementNonBlockingPopupInteractor$tariffPopupDto$1), hqj0.d(qpj0Var3, qpj0Var2, b2, RequirementNonBlockingPopupInteractor$tariffPopupDto$2.b), hqj0.d(qpj0Var3, qpj0Var2, b2, RequirementNonBlockingPopupInteractor$tariffPopupDto$3.b), hqj0.d(qpj0Var3, qpj0Var2, b2, RequirementNonBlockingPopupInteractor$tariffPopupDto$4.b), hqj0.d(qpj0Var3, qpj0Var2, b2, RequirementNonBlockingPopupInteractor$tariffPopupDto$5.b));
                } else {
                    qpj0Var = null;
                }
                if (qpj0Var != null) {
                    bqj0 bqj0Var = this.f;
                    ArrayList arrayList = new ArrayList();
                    if (c.b()) {
                        arrayList.add(((avj0) bqj0Var.b).h(kyh0.summary_due_title));
                    }
                    if (c.a()) {
                        arrayList.add(((avj0) bqj0Var.b).h(kyh0.order_for_other_requirement_label));
                    }
                    loop0: for (Pair pair : c.b) {
                        RequirementBubbleDto requirementBubbleDto = (RequirementBubbleDto) b2.h.get((String) pair.c());
                        if (!((List) pair.f()).isEmpty()) {
                            RequirementBubbleDto requirementBubbleDto2 = requirementBubbleDto;
                            for (String str6 : (List) pair.f()) {
                                RequirementBubbleDto requirementBubbleDto3 = requirementBubbleDto2;
                                String a = bqj0.a(this.f, b2, (requirementBubbleDto2 == null || (map = requirementBubbleDto2.f) == null) ? null : (RequirementBubbleDto) map.get(str6), (String) pair.c(), str6, 48);
                                if (a == null) {
                                    X = null;
                                    break;
                                }
                                arrayList.add(a);
                                requirementBubbleDto2 = requirementBubbleDto3;
                            }
                        } else {
                            String a2 = bqj0.a(this.f, b2, requirementBubbleDto, (String) pair.c(), null, 56);
                            if (a2 == null) {
                                X = null;
                                break;
                            }
                            arrayList.add(a2);
                        }
                    }
                    X = kotlin.collections.a.X(arrayList, Extension.FIX_SPACE, null, null, null, 62);
                    String v = X != null ? cvu0.v(a(b2, qpj0Var.b, b), "$REQ$", X, false) : null;
                    String a3 = a(b2, qpj0Var.a, b);
                    String a4 = v == null ? a(b2, qpj0Var.e, b) : v;
                    String a5 = a(b2, qpj0Var.c, b);
                    String a6 = a(b2, qpj0Var.d, b);
                    String str7 = n.c.b;
                    String h = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.c).h();
                    if (v == null) {
                        z = true;
                        bdj0Var = c;
                        str = a3;
                        str3 = a4;
                        str2 = a5;
                    } else {
                        z = false;
                        bdj0Var = c;
                        str = a3;
                        str2 = a5;
                        str3 = a4;
                    }
                    return new wjj0(str, str3, str2, a6, str7, h, z, bdj0Var);
                }
            }
        }
        return null;
    }
}
