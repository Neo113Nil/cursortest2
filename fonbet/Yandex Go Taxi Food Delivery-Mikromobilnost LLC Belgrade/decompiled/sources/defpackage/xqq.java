package defpackage;

import com.yandex.go.payments_widgets.section.payments.PaymentWidgetsSection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class xqq {
    public static ArrayList a(g0p g0pVar, hyi hyiVar) {
        List list = g0pVar.b;
        List<vla0> list2 = g0pVar.j;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (vla0 vla0Var : list2) {
            wla0 wla0Var = vla0Var.a;
            qla0 qla0Var = new qla0((tla0) wla0Var.a.a.a.a, vla0Var.b);
            arrayList.add(new i4q0("payment_widgets", qoi0.a(PaymentWidgetsSection.class), PaymentWidgetsSection.Companion.serializer(), qla0Var, new kn2(19, wla0Var, hyiVar), Collections.singletonList("payment_widgets")));
        }
        return a.m0(arrayList, list);
    }
}
