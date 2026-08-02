package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;

/* loaded from: classes15.dex */
public abstract class qe01 {
    public static final tf51 a(MoneyEntity moneyEntity, w530 w530Var) {
        return new tf51(moneyEntity.getAmount(), moneyEntity.getCurrency(), w530.a(w530Var, moneyEntity.getAmount(), moneyEntity.getCurrency(), false, null, false, 60), w530Var.b(moneyEntity.getCurrency()), w530.a(w530Var, moneyEntity.getAmount(), moneyEntity.getCurrency(), false, null, false, 28));
    }
}
