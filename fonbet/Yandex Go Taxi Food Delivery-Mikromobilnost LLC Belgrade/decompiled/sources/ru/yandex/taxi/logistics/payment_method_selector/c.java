package ru.yandex.taxi.logistics.payment_method_selector;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.cda0;
import defpackage.e4a0;
import defpackage.jl40;
import defpackage.maj0;
import defpackage.qqy;
import defpackage.tje;
import defpackage.tse;
import defpackage.uq1;
import defpackage.ut90;
import defpackage.wiq0;
import defpackage.wt90;
import defpackage.yhi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.delivery.experiments.e;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.preorder.repositories.g;

/* loaded from: classes5.dex */
public final class c {
    public final g a;
    public final wiq0 b;
    public final wt90 c;
    public final uq1 d;
    public final ut90 e;
    public final e f;
    public final cda0 g;
    public final maj0 h;
    public final kotlinx.coroutines.flow.internal.g i;
    public final m0 j;
    public String k;

    public c(g gVar, wiq0 wiq0Var, wt90 wt90Var, uq1 uq1Var, ut90 ut90Var, e eVar, cda0 cda0Var, maj0 maj0Var) {
        this.a = gVar;
        this.b = wiq0Var;
        this.c = wt90Var;
        this.d = uq1Var;
        this.e = ut90Var;
        this.f = eVar;
        this.g = cda0Var;
        this.h = maj0Var;
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(((k) wiq0Var).j.b(), new PayOnDeliveryProhibitedInteractorImpl$special$$inlined$flatMapLatest$1(null, this));
        this.i = X;
        this.j = new m0(gVar.e(), X, new PayOnDeliveryProhibitedInteractorImpl$isProhibitedFlow$1(null, this));
    }

    public static final boolean a(c cVar, e4a0 e4a0Var) {
        Object obj;
        cda0 cda0Var = cVar.g;
        ut90 ut90Var = cVar.e;
        PaymentMethod$Type a = e4a0Var.a();
        String code = a != null ? a.getCode() : null;
        List list = ut90Var.b().k;
        List list2 = ut90Var.b().l;
        com.yandex.go.payments.paymentlist.data.c cVar2 = (com.yandex.go.payments.paymentlist.data.c) cda0Var;
        String q = cVar2.g.q(e4a0Var);
        ListBuilder h = cVar2.h();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = h.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            }
            Object next = qqyVar.next();
            if (next instanceof yhi) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((yhi) obj).a, q)) {
                break;
            }
        }
        yhi yhiVar = (yhi) obj;
        return kotlin.collections.a.G(list, code) && !kotlin.collections.a.G(list2, yhiVar != null ? yhiVar.d : null);
    }

    public final void b(tse tseVar) {
        tje.N(tseVar, null, null, new PayOnDeliveryProhibitedInteractorImpl$attach$1(null, this), 3);
        tje.N(tseVar, null, null, new PayOnDeliveryProhibitedInteractorImpl$attach$2(null, this), 3);
    }
}
