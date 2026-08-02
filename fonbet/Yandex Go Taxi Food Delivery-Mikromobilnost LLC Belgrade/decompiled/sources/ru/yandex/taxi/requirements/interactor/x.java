package ru.yandex.taxi.requirements.interactor;

import defpackage.b580;
import defpackage.g580;
import defpackage.gmw0;
import defpackage.hmw0;
import defpackage.ijj0;
import defpackage.jl40;
import defpackage.jmw0;
import defpackage.q5z;
import defpackage.w511;
import defpackage.x8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class x {
    public final g580 a;
    public final ijj0 b;

    public x(g580 g580Var, ijj0 ijj0Var) {
        this.a = g580Var;
        this.b = ijj0Var;
    }

    public final void a(jmw0 jmw0Var, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        g580 g580Var = this.a;
        if (isEmpty) {
            ((x8) g580Var).d(jmw0Var.getName());
        } else {
            ((x8) g580Var).c(q5z.u(jmw0Var, arrayList), true);
        }
        ((x8) g580Var).a();
    }

    public final kotlinx.coroutines.flow.n b() {
        return new kotlinx.coroutines.flow.n(((x8) this.a).b, new RequirementOptionSelectedInteractor$loadRequirementsFlow$1(2, null));
    }

    public final List c(jmw0 jmw0Var) {
        Object obj;
        Iterator it = ((x8) this.a).d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((b580) obj).a, jmw0Var.getName())) {
                break;
            }
        }
        b580 b580Var = (b580) obj;
        if (b580Var == null) {
            return EmptyList.a;
        }
        ArrayList d = ijj0.d(this.b, b580Var, jmw0Var);
        if (jmw0Var instanceof gmw0) {
            return kotlin.collections.a.A0(d, ((gmw0) jmw0Var).t.a.size());
        }
        if (jmw0Var instanceof hmw0) {
            return d;
        }
        w511.b();
        return null;
    }
}
