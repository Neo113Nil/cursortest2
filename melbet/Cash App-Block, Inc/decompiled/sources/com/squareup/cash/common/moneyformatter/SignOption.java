package com.squareup.cash.common.moneyformatter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SignOption {
    public static final /* synthetic */ SignOption[] $VALUES;
    public static final SignOption ACCOUNTING;
    public static final SignOption ALWAYS_SIGNED;
    public static final SignOption POSITIVE_ONLY;
    public static final SignOption STANDARD;

    static {
        SignOption signOption = new SignOption("STANDARD", 0);
        STANDARD = signOption;
        SignOption signOption2 = new SignOption("ALWAYS_SIGNED", 1);
        ALWAYS_SIGNED = signOption2;
        SignOption signOption3 = new SignOption("POSITIVE_ONLY", 2);
        POSITIVE_ONLY = signOption3;
        SignOption signOption4 = new SignOption("ACCOUNTING", 3);
        ACCOUNTING = signOption4;
        $VALUES = new SignOption[]{signOption, signOption2, signOption3, signOption4, new SignOption("NONE", 4)};
    }

    public static SignOption valueOf(String str) {
        return (SignOption) Enum.valueOf(SignOption.class, str);
    }

    public static SignOption[] values() {
        return (SignOption[]) $VALUES.clone();
    }
}
