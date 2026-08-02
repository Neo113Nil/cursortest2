package ru.yandex.taxi.requirements.glued.interactor;

import defpackage.b580;
import defpackage.dqe0;
import defpackage.h73;
import defpackage.ijj0;
import defpackage.jmw0;
import defpackage.lvp0;
import defpackage.v15;
import defpackage.w15;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class d {
    public final w15 a;
    public final lvp0 b;
    public final ijj0 c;
    public final dqe0 d;

    public d(w15 w15Var, lvp0 lvp0Var, ijj0 ijj0Var, dqe0 dqe0Var) {
        this.a = w15Var;
        this.b = lvp0Var;
        this.c = ijj0Var;
        this.d = dqe0Var;
    }

    public final jmw0 a(List list) {
        Object obj;
        List list2 = this.d.a.x;
        w15 w15Var = this.a;
        w15Var.getClass();
        Iterator it = kotlin.sequences.b.s(kotlin.sequences.b.g(kotlin.sequences.b.g(kotlin.sequences.b.g(new h73(1, list), v15.a), new BaseGluedRequirementInteractor$gluedSequence$1(1, w15Var, w15.class, "isValidGluedRequirement", "isValidGluedRequirement(Lcom/yandex/go/requirements/api/domain/model/SupportedRequirement;)Z", 0)), new BaseGluedRequirementInteractor$mandatoryGluedSequence$1(1, w15Var, w15.class, "isGluedMandatory", "isGluedMandatory(Lcom/yandex/go/requirements/api/domain/model/SupportedRequirement;)Z", 0))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            jmw0 jmw0Var = (jmw0) obj;
            this.b.getClass();
            b580 a = lvp0.a(jmw0Var.getName(), list2);
            if (a == null || ijj0.d(this.c, a, jmw0Var).isEmpty()) {
                break;
            }
        }
        return (jmw0) obj;
    }
}
