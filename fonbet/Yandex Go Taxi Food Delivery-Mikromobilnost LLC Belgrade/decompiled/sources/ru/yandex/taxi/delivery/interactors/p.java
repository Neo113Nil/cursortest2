package ru.yandex.taxi.delivery.interactors;

import defpackage.b580;
import defpackage.g580;
import defpackage.gi;
import defpackage.hgi;
import defpackage.jl40;
import defpackage.tcc;
import defpackage.vsi;
import defpackage.x8;
import defpackage.ysi;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class p {
    public final g580 a;
    public final vsi b;
    public final o c;

    public p(g580 g580Var, vsi vsiVar) {
        this.a = g580Var;
        this.b = vsiVar;
        this.c = new o(new kotlinx.coroutines.flow.n(((x8) g580Var).b, new DeliveryRequirementsInteractorImpl$requirementsFlow$1(2, null)), this);
    }

    public final ArrayList a() {
        ArrayList<b580> arrayList = ((x8) this.a).d;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (b580 b580Var : arrayList) {
            arrayList2.add(new hgi(b580Var.a, b580Var.b()));
        }
        return arrayList2;
    }

    public final void b(String str, boolean z) {
        Object obj;
        Iterator it = this.b.o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((ysi) obj).a, str)) {
                    break;
                }
            }
        }
        ysi ysiVar = (ysi) obj;
        if (ysiVar == null) {
            return;
        }
        String str2 = ysiVar.a;
        g580 g580Var = this.a;
        if (!z) {
            ((x8) g580Var).d(str2);
        } else {
            ((x8) g580Var).c(gi.e(str2, ysiVar.b), true);
        }
    }
}
