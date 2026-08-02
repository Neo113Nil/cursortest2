package com.squareup.cash.cdf.balancebasedaddcash;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class EditAmountMethod {
    public static final /* synthetic */ EditAmountMethod[] $VALUES;
    public static final EditAmountMethod ATM;
    public static final EditAmountMethod KEYPAD;

    static {
        EditAmountMethod editAmountMethod = new EditAmountMethod("ATM", 0);
        ATM = editAmountMethod;
        EditAmountMethod editAmountMethod2 = new EditAmountMethod("KEYPAD", 1);
        KEYPAD = editAmountMethod2;
        $VALUES = new EditAmountMethod[]{editAmountMethod, editAmountMethod2};
    }

    public static EditAmountMethod valueOf(String str) {
        return (EditAmountMethod) Enum.valueOf(EditAmountMethod.class, str);
    }

    public static EditAmountMethod[] values() {
        return (EditAmountMethod[]) $VALUES.clone();
    }
}
