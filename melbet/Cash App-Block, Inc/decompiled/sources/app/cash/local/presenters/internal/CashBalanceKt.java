package app.cash.local.presenters.internal;

import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.math.LocalMoneysKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.app.v1.cashbalance.LocalCashBalance;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class CashBalanceKt {
    public static final LocalMoney asLocalMoneyOrZero(LocalCashBalance localCashBalance) {
        Long l;
        return (localCashBalance == null || (l = localCashBalance.amount) == null) ? LocalMoneysKt.zero(LocalCurrencyCode.USD) : new LocalMoney(l.longValue(), LocalCurrencyCode.USD);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewCashOutAmountWithInstrument.deepLinkSpecs;
    }

    public static final LocalMoney multiplyingByBasisPoints(LocalMoney localMoney, long j) {
        BigDecimal divide = new BigDecimal(j).divide(new BigDecimal(10000));
        BigDecimal valueOf = BigDecimal.valueOf(localMoney.amount);
        valueOf.getClass();
        divide.getClass();
        BigDecimal multiply = valueOf.multiply(divide);
        multiply.getClass();
        return new LocalMoney(multiply.setScale(2, RoundingMode.HALF_UP).longValue(), localMoney.currencyCode);
    }
}
