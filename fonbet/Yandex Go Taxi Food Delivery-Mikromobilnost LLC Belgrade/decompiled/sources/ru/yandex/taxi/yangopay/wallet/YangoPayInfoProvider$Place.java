package ru.yandex.taxi.yangopay.wallet;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"ru/yandex/taxi/yangopay/wallet/YangoPayInfoProvider$Place", "", "Lru/yandex/taxi/yangopay/wallet/YangoPayInfoProvider$Place;", "", "strRepresentation", "Ljava/lang/String;", "getStrRepresentation", "()Ljava/lang/String;", "PAYMENT_METHODS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class YangoPayInfoProvider$Place {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YangoPayInfoProvider$Place[] $VALUES;
    public static final YangoPayInfoProvider$Place PAYMENT_METHODS;
    private final String strRepresentation = "paymentMethods";

    static {
        YangoPayInfoProvider$Place yangoPayInfoProvider$Place = new YangoPayInfoProvider$Place();
        PAYMENT_METHODS = yangoPayInfoProvider$Place;
        YangoPayInfoProvider$Place[] yangoPayInfoProvider$PlaceArr = {yangoPayInfoProvider$Place};
        $VALUES = yangoPayInfoProvider$PlaceArr;
        $ENTRIES = a.a(yangoPayInfoProvider$PlaceArr);
    }

    public static YangoPayInfoProvider$Place valueOf(String str) {
        return (YangoPayInfoProvider$Place) Enum.valueOf(YangoPayInfoProvider$Place.class, str);
    }

    public static YangoPayInfoProvider$Place[] values() {
        return (YangoPayInfoProvider$Place[]) $VALUES.clone();
    }
}
