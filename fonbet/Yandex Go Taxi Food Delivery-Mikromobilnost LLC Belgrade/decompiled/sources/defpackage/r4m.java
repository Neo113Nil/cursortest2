package defpackage;

import com.yandex.go.payments.paymentlist.ui.PaymentMethodChooserUIState$ShowAddCardAtBottomConfig;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class r4m {
    public final zuj0 a;

    public r4m(zuj0 zuj0Var) {
        this.a = zuj0Var;
    }

    public static boolean a(jfa0 jfa0Var) {
        Object obj;
        rhq0 rhq0Var = jfa0Var.b;
        if (rhq0Var == null) {
            return false;
        }
        edi0 edi0Var = rhq0Var.a;
        Iterator it = jfa0Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(vez0.E(((nea0) obj).a), vez0.E(edi0Var.a))) {
                break;
            }
        }
        nea0 nea0Var = (nea0) obj;
        edi0 edi0Var2 = rhq0Var.b;
        bw90 bw90Var = edi0Var.b;
        xw91 xw91Var = xw91.C;
        if (jl40.l(bw90Var, xw91Var)) {
            return (edi0Var2 == null || jl40.l(edi0Var2.b, xw91Var)) && nea0Var != null && jl40.l(nea0Var.b, xw91Var);
        }
        return false;
    }

    public static bdc b(PaymentMethodChooserUIState$ShowAddCardAtBottomConfig paymentMethodChooserUIState$ShowAddCardAtBottomConfig) {
        int i = q4m.a[paymentMethodChooserUIState$ShowAddCardAtBottomConfig.ordinal()];
        if (i == 1) {
            return new bdc(xng0.controlMinor);
        }
        if (i == 2) {
            return new bdc(xng0.controlMain);
        }
        w511.b();
        return null;
    }

    public static bdc c(PaymentMethodChooserUIState$ShowAddCardAtBottomConfig paymentMethodChooserUIState$ShowAddCardAtBottomConfig) {
        int i = q4m.a[paymentMethodChooserUIState$ShowAddCardAtBottomConfig.ordinal()];
        if (i == 1) {
            return new bdc(xng0.textOnControlMinor);
        }
        if (i == 2) {
            return new bdc(xng0.textOnControl);
        }
        w511.b();
        return null;
    }
}
