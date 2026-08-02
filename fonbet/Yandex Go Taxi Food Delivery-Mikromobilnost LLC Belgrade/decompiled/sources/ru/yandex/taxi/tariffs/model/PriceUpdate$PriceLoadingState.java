package ru.yandex.taxi.tariffs.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState", "", "Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "LOADED", "LOADING", "FAILED", "LOADING_INTERRUPTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PriceUpdate$PriceLoadingState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PriceUpdate$PriceLoadingState[] $VALUES;
    public static final PriceUpdate$PriceLoadingState FAILED;
    public static final PriceUpdate$PriceLoadingState LOADED;
    public static final PriceUpdate$PriceLoadingState LOADING;
    public static final PriceUpdate$PriceLoadingState LOADING_INTERRUPTED;

    static {
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = new PriceUpdate$PriceLoadingState("LOADED", 0);
        LOADED = priceUpdate$PriceLoadingState;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState2 = new PriceUpdate$PriceLoadingState("LOADING", 1);
        LOADING = priceUpdate$PriceLoadingState2;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState3 = new PriceUpdate$PriceLoadingState("FAILED", 2);
        FAILED = priceUpdate$PriceLoadingState3;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState4 = new PriceUpdate$PriceLoadingState("LOADING_INTERRUPTED", 3);
        LOADING_INTERRUPTED = priceUpdate$PriceLoadingState4;
        PriceUpdate$PriceLoadingState[] priceUpdate$PriceLoadingStateArr = {priceUpdate$PriceLoadingState, priceUpdate$PriceLoadingState2, priceUpdate$PriceLoadingState3, priceUpdate$PriceLoadingState4};
        $VALUES = priceUpdate$PriceLoadingStateArr;
        $ENTRIES = kotlin.enums.a.a(priceUpdate$PriceLoadingStateArr);
    }

    public static PriceUpdate$PriceLoadingState valueOf(String str) {
        return (PriceUpdate$PriceLoadingState) Enum.valueOf(PriceUpdate$PriceLoadingState.class, str);
    }

    public static PriceUpdate$PriceLoadingState[] values() {
        return (PriceUpdate$PriceLoadingState[]) $VALUES.clone();
    }
}
