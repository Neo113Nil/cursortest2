package ru.yandex.taxi.appdelegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/appdelegates/BadgeType;", "", "Plus", "YangoPay", "BankQr", "PaymentMiniWidgets", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BadgeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BadgeType[] $VALUES;
    public static final BadgeType BankQr;
    public static final BadgeType PaymentMiniWidgets;
    public static final BadgeType Plus;
    public static final BadgeType YangoPay;

    static {
        BadgeType badgeType = new BadgeType("Plus", 0);
        Plus = badgeType;
        BadgeType badgeType2 = new BadgeType("YangoPay", 1);
        YangoPay = badgeType2;
        BadgeType badgeType3 = new BadgeType("BankQr", 2);
        BankQr = badgeType3;
        BadgeType badgeType4 = new BadgeType("PaymentMiniWidgets", 3);
        PaymentMiniWidgets = badgeType4;
        BadgeType[] badgeTypeArr = {badgeType, badgeType2, badgeType3, badgeType4};
        $VALUES = badgeTypeArr;
        $ENTRIES = a.a(badgeTypeArr);
    }

    public static BadgeType valueOf(String str) {
        return (BadgeType) Enum.valueOf(BadgeType.class, str);
    }

    public static BadgeType[] values() {
        return (BadgeType[]) $VALUES.clone();
    }
}
