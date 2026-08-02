package com.squareup.cash.borrow.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class LoanDetailsSheetState {
    public static final /* synthetic */ LoanDetailsSheetState[] $VALUES;
    public static final LoanDetailsSheetState Details;
    public static final LoanDetailsSheetState Timeline;

    static {
        LoanDetailsSheetState loanDetailsSheetState = new LoanDetailsSheetState("Details", 0);
        Details = loanDetailsSheetState;
        LoanDetailsSheetState loanDetailsSheetState2 = new LoanDetailsSheetState("Timeline", 1);
        Timeline = loanDetailsSheetState2;
        $VALUES = new LoanDetailsSheetState[]{loanDetailsSheetState, loanDetailsSheetState2};
    }

    public static LoanDetailsSheetState valueOf(String str) {
        return (LoanDetailsSheetState) Enum.valueOf(LoanDetailsSheetState.class, str);
    }

    public static LoanDetailsSheetState[] values() {
        return (LoanDetailsSheetState[]) $VALUES.clone();
    }
}
