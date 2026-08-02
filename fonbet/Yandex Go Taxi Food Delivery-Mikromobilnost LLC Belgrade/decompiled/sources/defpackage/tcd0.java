package defpackage;

import com.yandex.plus.pay.api.model.PlusPayInAppReplacementParams;
import com.yandex.plus.pay.repository.api.model.offers.InAppReplacementParams;

/* loaded from: classes2.dex */
public abstract class tcd0 {
    public static final PlusPayInAppReplacementParams a(InAppReplacementParams inAppReplacementParams) {
        PlusPayInAppReplacementParams.Strategy strategy;
        int i = scd0.a[inAppReplacementParams.getStrategy().ordinal()];
        if (i == 1) {
            strategy = PlusPayInAppReplacementParams.Strategy.CHARGE_FULL_PRICE;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            strategy = PlusPayInAppReplacementParams.Strategy.DEFERRED;
        }
        return new PlusPayInAppReplacementParams(inAppReplacementParams.getPurchaseToken(), strategy);
    }
}
