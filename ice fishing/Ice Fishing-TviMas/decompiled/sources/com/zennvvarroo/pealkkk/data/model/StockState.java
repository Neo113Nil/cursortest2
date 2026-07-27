package com.zennvvarroo.pealkkk.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoredItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/zennvvarroo/pealkkk/data/model/StockState;", "", "(Ljava/lang/String;I)V", "AVAILABLE", "LOW", "EMPTY", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StockState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StockState[] $VALUES;
    public static final StockState AVAILABLE = new StockState("AVAILABLE", 0);
    public static final StockState LOW = new StockState("LOW", 1);
    public static final StockState EMPTY = new StockState("EMPTY", 2);

    private static final /* synthetic */ StockState[] $values() {
        return new StockState[]{AVAILABLE, LOW, EMPTY};
    }

    public static EnumEntries<StockState> getEntries() {
        return $ENTRIES;
    }

    public static StockState valueOf(String str) {
        return (StockState) Enum.valueOf(StockState.class, str);
    }

    public static StockState[] values() {
        return (StockState[]) $VALUES.clone();
    }

    static {
        StockState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private StockState(String str, int i) {
    }
}
