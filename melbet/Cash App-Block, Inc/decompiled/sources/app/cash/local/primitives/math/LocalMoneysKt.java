package app.cash.local.primitives.math;

import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoney;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class LocalMoneysKt {
    public static final int compareTo(LocalMoney localMoney, LocalMoney localMoney2) {
        localMoney2.getClass();
        LocalCurrencyCode localCurrencyCode = localMoney.currencyCode;
        LocalCurrencyCode localCurrencyCode2 = localMoney2.currencyCode;
        if (localCurrencyCode == localCurrencyCode2) {
            return Intrinsics.compare(localMoney.amount, localMoney2.amount);
        }
        a$$ExternalSyntheticBUOutline0.m(localCurrencyCode, ", ", localCurrencyCode2, ")", "Can't mix currencies (");
        return 0;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewDeviceManagerDeviceDetails.deepLinkSpecs;
    }

    public static final boolean isPositive(LocalMoney localMoney) {
        localMoney.getClass();
        return localMoney.amount > 0;
    }

    public static final LocalMoney minOf(LocalMoney localMoney, LocalMoney localMoney2) {
        localMoney2.getClass();
        LocalCurrencyCode localCurrencyCode = localMoney.currencyCode;
        LocalCurrencyCode localCurrencyCode2 = localMoney2.currencyCode;
        if (localCurrencyCode == localCurrencyCode2) {
            return compareTo(localMoney, localMoney2) < 0 ? localMoney : localMoney2;
        }
        a$$ExternalSyntheticBUOutline0.m(localCurrencyCode, ", ", localCurrencyCode2, ")", "Can't mix currencies (");
        return null;
    }

    public static final LocalMoney minus(LocalMoney localMoney, LocalMoney localMoney2) {
        localMoney.getClass();
        localMoney2.getClass();
        return LocalMoney.copy$default(localMoney, localMoney.amount - localMoney2.amount);
    }

    public static final LocalMoney plus(LocalMoney localMoney, LocalMoney localMoney2) {
        localMoney.getClass();
        localMoney2.getClass();
        return LocalMoney.copy$default(localMoney, localMoney.amount + localMoney2.amount);
    }

    public static final LocalMoney times(LocalMoney localMoney, int i) {
        localMoney.getClass();
        return LocalMoney.copy$default(localMoney, localMoney.amount * i);
    }

    public static final LocalMoney zero(LocalCurrencyCode localCurrencyCode) {
        localCurrencyCode.getClass();
        return new LocalMoney(0L, localCurrencyCode);
    }
}
