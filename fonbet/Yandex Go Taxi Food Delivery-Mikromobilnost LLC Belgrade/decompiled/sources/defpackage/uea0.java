package defpackage;

import com.yandex.go.payments.payment.AddPaymentModel$State;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class uea0 implements tea0 {
    public final jfa0 a(oea0 oea0Var, jw90 jw90Var, m6a0 m6a0Var) {
        lea0 p;
        rhq0 rhq0Var = null;
        rhq0Var = null;
        if (oea0Var.a()) {
            return new jfa0(EmptyList.a, null, true);
        }
        List<lea0> list = oea0Var.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (lea0 lea0Var : list) {
            arrayList.add(new nea0(lea0Var, jw90Var.b(lea0Var)));
        }
        List<vi0> list2 = oea0Var.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        for (vi0 vi0Var : list2) {
            bw90 bw90Var = xw91.C;
            if (vi0Var instanceof na0) {
                if (((na0) vi0Var).a != null) {
                    bw90Var = bei.J;
                }
            } else if (vi0Var instanceof mj0) {
                if (((mj0) vi0Var).e == AddPaymentModel$State.DISABLED) {
                    bw90Var = new zv90((String) null);
                }
            } else if (vi0Var instanceof mf0) {
                if (((mf0) vi0Var).b() == AddPaymentModel$State.DISABLED) {
                    bw90Var = new zv90((String) null);
                }
            } else if (vi0Var instanceof bg0) {
                if (((bg0) vi0Var).b() == AddPaymentModel$State.DISABLED) {
                    bw90Var = new zv90((String) null);
                }
            } else if (vi0Var instanceof kd0) {
                if (((kd0) vi0Var).b() == AddPaymentModel$State.DISABLED) {
                    bw90Var = new zv90((String) null);
                }
            } else if (vi0Var instanceof df0) {
                if (((df0) vi0Var).b() == AddPaymentModel$State.DISABLED) {
                    bw90Var = new zv90((String) null);
                }
            } else if ((vi0Var instanceof mk0) && ((mk0) vi0Var).b() == AddPaymentModel$State.DISABLED) {
                bw90Var = new zv90((String) null);
            }
            arrayList2.add(new nea0(vi0Var, bw90Var));
        }
        ArrayList m0 = a.m0(arrayList2, arrayList);
        if (m6a0Var != null && (p = eja1.p(oea0Var, m6a0Var)) != null) {
            lea0 p2 = eja1.p(oea0Var, m6a0Var.c);
            rhq0Var = new rhq0(new edi0(p, jw90Var.b(p)), p2 != null ? new edi0(p2, jw90Var.b(p2)) : null);
        }
        return new jfa0(m0, rhq0Var, false);
    }
}
