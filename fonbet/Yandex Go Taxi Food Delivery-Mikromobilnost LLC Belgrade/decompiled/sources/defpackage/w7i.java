package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.delivery.extracted_delivery_form.models.data.PaymentType;

/* loaded from: classes5.dex */
public final class w7i {
    public final aji a;
    public final vwh b;
    public final wiq0 c;
    public final xai d;
    public final bai e;

    public w7i(aji ajiVar, vwh vwhVar, wiq0 wiq0Var, xai xaiVar, bai baiVar) {
        this.a = ajiVar;
        this.b = vwhVar;
        this.c = wiq0Var;
        this.d = xaiVar;
        this.e = baiVar;
    }

    public static ArrayList a(kfi kfiVar, List list, String str, PaymentType paymentType, PaymentType paymentType2) {
        ArrayList o0 = a.o0(kfiVar.r, kfiVar.e);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            lmw0 lmw0Var = (lmw0) obj;
            if (!o0.isEmpty()) {
                Iterator it = o0.iterator();
                while (it.hasNext()) {
                    nmi nmiVar = (nmi) it.next();
                    if (!(lmw0Var instanceof fmw0)) {
                        if ((lmw0Var instanceof jmw0) && jl40.l(nmiVar.a, lmw0Var.getName())) {
                            List<adj0> list2 = nmiVar.b;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                for (adj0 adj0Var : list2) {
                                    if (jl40.l(adj0Var.a, str) && adj0Var.c) {
                                        List list3 = adj0Var.d;
                                        if (list3 == null ? true : (paymentType2 == null || list3.contains(paymentType2.getTypeName())) ? list3.contains(paymentType.getTypeName()) : false) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
