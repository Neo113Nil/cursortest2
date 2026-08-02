package com.squareup.cash.crypto.backend.performance;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BitcoinPerformanceDataState {
    public static final /* synthetic */ BitcoinPerformanceDataState[] $VALUES;
    public static final BitcoinPerformanceDataState AWAITING_POTENTIAL_UPDATE;
    public static final BitcoinPerformanceDataState ENTERED_FLOW;
    public static final BitcoinPerformanceDataState FRESH;

    static {
        BitcoinPerformanceDataState bitcoinPerformanceDataState = new BitcoinPerformanceDataState("FRESH", 0);
        FRESH = bitcoinPerformanceDataState;
        BitcoinPerformanceDataState bitcoinPerformanceDataState2 = new BitcoinPerformanceDataState("ENTERED_FLOW", 1);
        ENTERED_FLOW = bitcoinPerformanceDataState2;
        BitcoinPerformanceDataState bitcoinPerformanceDataState3 = new BitcoinPerformanceDataState("AWAITING_POTENTIAL_UPDATE", 2);
        AWAITING_POTENTIAL_UPDATE = bitcoinPerformanceDataState3;
        $VALUES = new BitcoinPerformanceDataState[]{bitcoinPerformanceDataState, bitcoinPerformanceDataState2, bitcoinPerformanceDataState3};
    }

    public static BitcoinPerformanceDataState valueOf(String str) {
        return (BitcoinPerformanceDataState) Enum.valueOf(BitcoinPerformanceDataState.class, str);
    }

    public static BitcoinPerformanceDataState[] values() {
        return (BitcoinPerformanceDataState[]) $VALUES.clone();
    }
}
