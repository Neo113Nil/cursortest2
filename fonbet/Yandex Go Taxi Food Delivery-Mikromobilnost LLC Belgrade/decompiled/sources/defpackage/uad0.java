package defpackage;

import com.yandex.plus.pay.internal.model.PlusPayUpsaleStep;
import com.yandex.plus.pay.repository.api.model.offers.UpsaleStep;

/* loaded from: classes2.dex */
public final class uad0 {
    public final oed0 a;
    public final gdd0 b;

    public uad0(oed0 oed0Var, gdd0 gdd0Var) {
        this.a = oed0Var;
        this.b = gdd0Var;
    }

    public static PlusPayUpsaleStep a(UpsaleStep upsaleStep) {
        int i = tad0.b[upsaleStep.ordinal()];
        if (i == 1) {
            return PlusPayUpsaleStep.CHECKOUT;
        }
        if (i == 2) {
            return PlusPayUpsaleStep.UPSALE;
        }
        if (i == 3) {
            return PlusPayUpsaleStep.PRESALE;
        }
        w511.b();
        return null;
    }
}
