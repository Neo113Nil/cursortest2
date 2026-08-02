package com.squareup.cash.cdf.personalprofile;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PersonalProfileShareSource {
    public static final /* synthetic */ PersonalProfileShareSource[] $VALUES;
    public static final PersonalProfileShareSource ACCOUNT;
    public static final PersonalProfileShareSource QR_CODE;

    static {
        PersonalProfileShareSource personalProfileShareSource = new PersonalProfileShareSource("ACCOUNT", 0);
        ACCOUNT = personalProfileShareSource;
        PersonalProfileShareSource personalProfileShareSource2 = new PersonalProfileShareSource("QR_CODE", 1);
        QR_CODE = personalProfileShareSource2;
        $VALUES = new PersonalProfileShareSource[]{personalProfileShareSource, personalProfileShareSource2};
    }

    public static PersonalProfileShareSource valueOf(String str) {
        return (PersonalProfileShareSource) Enum.valueOf(PersonalProfileShareSource.class, str);
    }

    public static PersonalProfileShareSource[] values() {
        return (PersonalProfileShareSource[]) $VALUES.clone();
    }
}
