package defpackage;

import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class xv90 implements ryj0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ryj0 b;

    public xv90(ArrayList arrayList, ryj0 ryj0Var) {
        this.a = arrayList;
        this.b = ryj0Var;
    }

    @Override // defpackage.ryj0
    public final void i(Object obj) {
        this.b.i((PaymentKitError) obj);
    }

    @Override // defpackage.ryj0
    public final void onSuccess(Object obj) {
        Object obj2;
        String memberNameRus;
        List list = (List) obj;
        ArrayList<vcq0> arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (vcq0 vcq0Var : arrayList) {
            PaymentMethod paymentMethod = vcq0Var.a;
            if (paymentMethod instanceof PaymentMethod.SbpToken) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (evu0.y(((lp4) obj2).b, ((PaymentMethod.SbpToken) paymentMethod).getMemberId(), false)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                lp4 lp4Var = (lp4) obj2;
                vcq0Var = new vcq0(paymentMethod, vcq0Var.b, vcq0Var.c, lp4Var != null ? lp4Var.g : null, (n891.l() && ((memberNameRus = ((PaymentMethod.SbpToken) paymentMethod).getMemberNameRus()) == null || memberNameRus.length() == 0)) ? lp4Var != null ? lp4Var.a : null : null);
            }
            arrayList2.add(vcq0Var);
        }
        this.b.onSuccess(arrayList2);
    }
}
