package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.PlusTarifficatorMobileArguments;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.CounterOffersFragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment;
import java.util.Set;

/* loaded from: classes2.dex */
public final class y0u0 implements x0u0 {
    public final Set a;
    public final ftb b;
    public final sls c;

    public y0u0(Set set, ftb ftbVar, sls slsVar) {
        this.a = set;
        this.b = ftbVar;
        this.c = slsVar;
    }

    public final void a() {
        boolean contains = this.a.contains(PlusTarifficatorMobileArguments.Screen.ERROR);
        ftb ftbVar = this.b;
        if (contains) {
            ftbVar.a();
        } else if (((Boolean) this.c.invoke()).booleanValue()) {
            ftbVar.getClass();
            ftbVar.c(new CounterOffersFragment(), "CounterOffer");
        } else {
            ftbVar.getClass();
            ftbVar.c(new ErrorFragment(), "Error");
        }
    }
}
