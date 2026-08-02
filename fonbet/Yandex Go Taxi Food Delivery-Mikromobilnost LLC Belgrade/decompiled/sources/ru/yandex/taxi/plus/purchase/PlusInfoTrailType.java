package ru.yandex.taxi.plus.purchase;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/plus/purchase/PlusInfoTrailType;", "", "PAYMENT_METHOD", "INFO", "NAVIGATION", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlusInfoTrailType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusInfoTrailType[] $VALUES;
    public static final PlusInfoTrailType INFO;
    public static final PlusInfoTrailType NAVIGATION;
    public static final PlusInfoTrailType NONE;
    public static final PlusInfoTrailType PAYMENT_METHOD;

    static {
        PlusInfoTrailType plusInfoTrailType = new PlusInfoTrailType("PAYMENT_METHOD", 0);
        PAYMENT_METHOD = plusInfoTrailType;
        PlusInfoTrailType plusInfoTrailType2 = new PlusInfoTrailType("INFO", 1);
        INFO = plusInfoTrailType2;
        PlusInfoTrailType plusInfoTrailType3 = new PlusInfoTrailType("NAVIGATION", 2);
        NAVIGATION = plusInfoTrailType3;
        PlusInfoTrailType plusInfoTrailType4 = new PlusInfoTrailType(JCP.RAW_PREFIX, 3);
        NONE = plusInfoTrailType4;
        PlusInfoTrailType[] plusInfoTrailTypeArr = {plusInfoTrailType, plusInfoTrailType2, plusInfoTrailType3, plusInfoTrailType4};
        $VALUES = plusInfoTrailTypeArr;
        $ENTRIES = kotlin.enums.a.a(plusInfoTrailTypeArr);
    }

    public static PlusInfoTrailType valueOf(String str) {
        return (PlusInfoTrailType) Enum.valueOf(PlusInfoTrailType.class, str);
    }

    public static PlusInfoTrailType[] values() {
        return (PlusInfoTrailType[]) $VALUES.clone();
    }
}
