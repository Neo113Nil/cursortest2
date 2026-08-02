package app.cash.local.primitives;

import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* loaded from: classes3.dex */
public abstract class LocalMoneyKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewDependentPayWithParams.deepLinkSpecs;
    }

    public static final com.squareup.protos.cash.local.client.v1.LocalMoney toLocalMoneyProto(LocalMoney localMoney) {
        localMoney.getClass();
        return new com.squareup.protos.cash.local.client.v1.LocalMoney(localMoney.currencyCode.name(), Long.valueOf(localMoney.amount), ByteString.EMPTY);
    }

    public static final LocalMoney toMoney(com.squareup.protos.cash.local.client.v1.LocalMoney localMoney) {
        localMoney.getClass();
        Long l = localMoney.amount;
        l.getClass();
        long longValue = l.longValue();
        String str = localMoney.currency_code;
        str.getClass();
        return new LocalMoney(longValue, LocalCurrencyCode.valueOf(str));
    }
}
