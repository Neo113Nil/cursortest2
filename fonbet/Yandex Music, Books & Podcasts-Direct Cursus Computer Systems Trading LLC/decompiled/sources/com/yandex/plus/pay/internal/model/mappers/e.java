package com.yandex.plus.pay.internal.model.mappers;

import com.yandex.plus.pay.api.model.PlusPayInAppReplacementParams;
import com.yandex.plus.pay.repository.api.model.offers.v;
import defpackage.b6e;

/* loaded from: classes5.dex */
public abstract class e {
    public static final PlusPayInAppReplacementParams a(v vVar) {
        PlusPayInAppReplacementParams.Strategy strategy;
        vVar.getClass();
        int ordinal = vVar.b.ordinal();
        if (ordinal == 0) {
            strategy = PlusPayInAppReplacementParams.Strategy.CHARGE_FULL_PRICE;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            strategy = PlusPayInAppReplacementParams.Strategy.DEFERRED;
        }
        return new PlusPayInAppReplacementParams(vVar.a, strategy);
    }
}
