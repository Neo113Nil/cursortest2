package ru.yandex.taxi.masstransit.trains.checkout.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/masstransit/trains/checkout/model/CheckoutVersionType;", "", "", "type", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "V1", "V2", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutVersionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CheckoutVersionType[] $VALUES;
    public static final CheckoutVersionType V1;
    public static final CheckoutVersionType V2;
    private final String type;

    static {
        CheckoutVersionType checkoutVersionType = new CheckoutVersionType("V1", 0, "v1");
        V1 = checkoutVersionType;
        CheckoutVersionType checkoutVersionType2 = new CheckoutVersionType("V2", 1, "v2");
        V2 = checkoutVersionType2;
        CheckoutVersionType[] checkoutVersionTypeArr = {checkoutVersionType, checkoutVersionType2};
        $VALUES = checkoutVersionTypeArr;
        $ENTRIES = kotlin.enums.a.a(checkoutVersionTypeArr);
    }

    public CheckoutVersionType(String str, int i, String str2) {
        this.type = str2;
    }

    public static CheckoutVersionType valueOf(String str) {
        return (CheckoutVersionType) Enum.valueOf(CheckoutVersionType.class, str);
    }

    public static CheckoutVersionType[] values() {
        return (CheckoutVersionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
