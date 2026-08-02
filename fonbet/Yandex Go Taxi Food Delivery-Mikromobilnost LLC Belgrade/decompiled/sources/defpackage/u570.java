package defpackage;

import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.SilentPaymentFragment;

/* loaded from: classes2.dex */
public final class u570 implements s570 {
    public final ftb a;

    public u570(ftb ftbVar) {
        this.a = ftbVar;
    }

    public final void a(PlusTarifficatorPurchase plusTarifficatorPurchase) {
        int i = t570.a[plusTarifficatorPurchase.getType().ordinal()];
        ftb ftbVar = this.a;
        if (i == 1) {
            ftbVar.b();
        } else if (i != 2) {
            w511.b();
        } else {
            ftbVar.getClass();
            ftbVar.c(new SilentPaymentFragment(), "Silent");
        }
    }
}
