package com.squareup.cash.cdf.balancebasedaddcash;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class EditAmountOption {
    public static final /* synthetic */ EditAmountOption[] $VALUES;
    public static final EditAmountOption INCREMENT;
    public static final EditAmountOption MIN_BALANCE;

    static {
        EditAmountOption editAmountOption = new EditAmountOption("MIN_BALANCE", 0);
        MIN_BALANCE = editAmountOption;
        EditAmountOption editAmountOption2 = new EditAmountOption("INCREMENT", 1);
        INCREMENT = editAmountOption2;
        $VALUES = new EditAmountOption[]{editAmountOption, editAmountOption2};
    }

    public static EditAmountOption valueOf(String str) {
        return (EditAmountOption) Enum.valueOf(EditAmountOption.class, str);
    }

    public static EditAmountOption[] values() {
        return (EditAmountOption[]) $VALUES.clone();
    }
}
