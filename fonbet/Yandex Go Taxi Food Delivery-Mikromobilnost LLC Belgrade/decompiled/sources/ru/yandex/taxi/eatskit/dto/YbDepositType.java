package ru.yandex.taxi.eatskit.dto;

import defpackage.dp51;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.nr51;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/eatskit/dto/YbDepositType;", "", "Companion", "nr51", "EXACT_AMOUNT", "ORDER_AMOUNT", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class YbDepositType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbDepositType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final nr51 Companion;
    public static final YbDepositType EXACT_AMOUNT;
    public static final YbDepositType ORDER_AMOUNT;

    static {
        YbDepositType ybDepositType = new YbDepositType("EXACT_AMOUNT", 0);
        EXACT_AMOUNT = ybDepositType;
        YbDepositType ybDepositType2 = new YbDepositType("ORDER_AMOUNT", 1);
        ORDER_AMOUNT = ybDepositType2;
        YbDepositType[] ybDepositTypeArr = {ybDepositType, ybDepositType2};
        $VALUES = ybDepositTypeArr;
        $ENTRIES = kotlin.enums.a.a(ybDepositTypeArr);
        Companion = new nr51();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dp51(6));
    }

    public static YbDepositType valueOf(String str) {
        return (YbDepositType) Enum.valueOf(YbDepositType.class, str);
    }

    public static YbDepositType[] values() {
        return (YbDepositType[]) $VALUES.clone();
    }
}
