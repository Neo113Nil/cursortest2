package ru.yandex.taxi.preorder.source.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/preorder/source/data/TaxiMainControlElementEvent;", "", "DISABLE", "ENABLE", "SHOW", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TaxiMainControlElementEvent {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiMainControlElementEvent[] $VALUES;
    public static final TaxiMainControlElementEvent DISABLE;
    public static final TaxiMainControlElementEvent ENABLE;
    public static final TaxiMainControlElementEvent SHOW;

    static {
        TaxiMainControlElementEvent taxiMainControlElementEvent = new TaxiMainControlElementEvent("DISABLE", 0);
        DISABLE = taxiMainControlElementEvent;
        TaxiMainControlElementEvent taxiMainControlElementEvent2 = new TaxiMainControlElementEvent("ENABLE", 1);
        ENABLE = taxiMainControlElementEvent2;
        TaxiMainControlElementEvent taxiMainControlElementEvent3 = new TaxiMainControlElementEvent("SHOW", 2);
        SHOW = taxiMainControlElementEvent3;
        TaxiMainControlElementEvent[] taxiMainControlElementEventArr = {taxiMainControlElementEvent, taxiMainControlElementEvent2, taxiMainControlElementEvent3};
        $VALUES = taxiMainControlElementEventArr;
        $ENTRIES = kotlin.enums.a.a(taxiMainControlElementEventArr);
    }

    public static TaxiMainControlElementEvent valueOf(String str) {
        return (TaxiMainControlElementEvent) Enum.valueOf(TaxiMainControlElementEvent.class, str);
    }

    public static TaxiMainControlElementEvent[] values() {
        return (TaxiMainControlElementEvent[]) $VALUES.clone();
    }
}
