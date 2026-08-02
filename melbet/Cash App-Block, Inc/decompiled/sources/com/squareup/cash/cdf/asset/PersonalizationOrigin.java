package com.squareup.cash.cdf.asset;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PersonalizationOrigin {
    public static final /* synthetic */ PersonalizationOrigin[] $VALUES;
    public static final PersonalizationOrigin BOTTOM_SHEET_CORE_FLOW;
    public static final PersonalizationOrigin BUTTON;

    /* JADX INFO: Fake field, exist only in values array */
    PersonalizationOrigin EF0;

    static {
        PersonalizationOrigin personalizationOrigin = new PersonalizationOrigin("TOOLTIP", 0);
        PersonalizationOrigin personalizationOrigin2 = new PersonalizationOrigin("BUTTON", 1);
        BUTTON = personalizationOrigin2;
        PersonalizationOrigin personalizationOrigin3 = new PersonalizationOrigin("BOTTOM_SHEET_CORE_FLOW", 2);
        BOTTOM_SHEET_CORE_FLOW = personalizationOrigin3;
        $VALUES = new PersonalizationOrigin[]{personalizationOrigin, personalizationOrigin2, personalizationOrigin3};
    }

    public static PersonalizationOrigin valueOf(String str) {
        return (PersonalizationOrigin) Enum.valueOf(PersonalizationOrigin.class, str);
    }

    public static PersonalizationOrigin[] values() {
        return (PersonalizationOrigin[]) $VALUES.clone();
    }
}
