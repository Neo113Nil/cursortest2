package ru.yandex.taxi.scooters.data.model;

import defpackage.eug;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.rsf;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/scooters/data/model/DebtStatus;", "", "Companion", "eug", "NO_FUNDS", "IN_PROGRESS", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DebtStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DebtStatus[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final eug Companion;
    public static final DebtStatus IN_PROGRESS;
    public static final DebtStatus NO_FUNDS;

    static {
        DebtStatus debtStatus = new DebtStatus("NO_FUNDS", 0);
        NO_FUNDS = debtStatus;
        DebtStatus debtStatus2 = new DebtStatus("IN_PROGRESS", 1);
        IN_PROGRESS = debtStatus2;
        DebtStatus[] debtStatusArr = {debtStatus, debtStatus2};
        $VALUES = debtStatusArr;
        $ENTRIES = a.a(debtStatusArr);
        Companion = new eug();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rsf(20));
    }

    public static DebtStatus valueOf(String str) {
        return (DebtStatus) Enum.valueOf(DebtStatus.class, str);
    }

    public static DebtStatus[] values() {
        return (DebtStatus[]) $VALUES.clone();
    }
}
