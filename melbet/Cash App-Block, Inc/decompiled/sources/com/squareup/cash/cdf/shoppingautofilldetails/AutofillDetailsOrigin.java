package com.squareup.cash.cdf.shoppingautofilldetails;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class AutofillDetailsOrigin {
    public static final /* synthetic */ AutofillDetailsOrigin[] $VALUES;
    public static final AutofillDetailsOrigin AddAutofillInfo;
    public static final AutofillDetailsOrigin EditAutofillInfo;

    static {
        AutofillDetailsOrigin autofillDetailsOrigin = new AutofillDetailsOrigin("AddAutofillInfo", 0);
        AddAutofillInfo = autofillDetailsOrigin;
        AutofillDetailsOrigin autofillDetailsOrigin2 = new AutofillDetailsOrigin("EditAutofillInfo", 1);
        EditAutofillInfo = autofillDetailsOrigin2;
        $VALUES = new AutofillDetailsOrigin[]{autofillDetailsOrigin, autofillDetailsOrigin2};
    }

    public static AutofillDetailsOrigin valueOf(String str) {
        return (AutofillDetailsOrigin) Enum.valueOf(AutofillDetailsOrigin.class, str);
    }

    public static AutofillDetailsOrigin[] values() {
        return (AutofillDetailsOrigin[]) $VALUES.clone();
    }
}
