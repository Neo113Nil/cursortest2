package com.squareup.cash.cdf.transfers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Section {
    public static final /* synthetic */ Section[] $VALUES;
    public static final Section BANK_TRANSFER;
    public static final Section WIRE_TRANSFER;

    static {
        Section section = new Section("BANK_TRANSFER", 0);
        BANK_TRANSFER = section;
        Section section2 = new Section("WIRE_TRANSFER", 1);
        WIRE_TRANSFER = section2;
        $VALUES = new Section[]{section, section2};
    }

    public static Section valueOf(String str) {
        return (Section) Enum.valueOf(Section.class, str);
    }

    public static Section[] values() {
        return (Section[]) $VALUES.clone();
    }
}
