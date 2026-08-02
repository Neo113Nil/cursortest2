package com.squareup.cash.cdf.browser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AutofillOrigin {
    public static final /* synthetic */ AutofillOrigin[] $VALUES;
    public static final AutofillOrigin AutofillSheet;
    public static final AutofillOrigin SaveAutofillSheet;
    public static final AutofillOrigin UpdateAutofillSheet;

    static {
        AutofillOrigin autofillOrigin = new AutofillOrigin("AutofillSheet", 0);
        AutofillSheet = autofillOrigin;
        AutofillOrigin autofillOrigin2 = new AutofillOrigin("SaveAutofillSheet", 1);
        SaveAutofillSheet = autofillOrigin2;
        AutofillOrigin autofillOrigin3 = new AutofillOrigin("UpdateAutofillSheet", 2);
        UpdateAutofillSheet = autofillOrigin3;
        $VALUES = new AutofillOrigin[]{autofillOrigin, autofillOrigin2, autofillOrigin3};
    }

    public static AutofillOrigin valueOf(String str) {
        return (AutofillOrigin) Enum.valueOf(AutofillOrigin.class, str);
    }

    public static AutofillOrigin[] values() {
        return (AutofillOrigin[]) $VALUES.clone();
    }
}
