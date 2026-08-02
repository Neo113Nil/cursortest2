package ru.yandex.taxi.design;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/design/CompanionTextStyle;", "", "REGULAR", "STRONG", "ROBUST", "BOLD", "MEDIUM", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CompanionTextStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CompanionTextStyle[] $VALUES;
    public static final CompanionTextStyle BOLD;
    public static final CompanionTextStyle MEDIUM;
    public static final CompanionTextStyle REGULAR;
    public static final CompanionTextStyle ROBUST;
    public static final CompanionTextStyle STRONG;

    static {
        CompanionTextStyle companionTextStyle = new CompanionTextStyle("REGULAR", 0);
        REGULAR = companionTextStyle;
        CompanionTextStyle companionTextStyle2 = new CompanionTextStyle("STRONG", 1);
        STRONG = companionTextStyle2;
        CompanionTextStyle companionTextStyle3 = new CompanionTextStyle("ROBUST", 2);
        ROBUST = companionTextStyle3;
        CompanionTextStyle companionTextStyle4 = new CompanionTextStyle("BOLD", 3);
        BOLD = companionTextStyle4;
        CompanionTextStyle companionTextStyle5 = new CompanionTextStyle("MEDIUM", 4);
        MEDIUM = companionTextStyle5;
        CompanionTextStyle[] companionTextStyleArr = {companionTextStyle, companionTextStyle2, companionTextStyle3, companionTextStyle4, companionTextStyle5};
        $VALUES = companionTextStyleArr;
        $ENTRIES = kotlin.enums.a.a(companionTextStyleArr);
    }

    public static CompanionTextStyle valueOf(String str) {
        return (CompanionTextStyle) Enum.valueOf(CompanionTextStyle.class, str);
    }

    public static CompanionTextStyle[] values() {
        return (CompanionTextStyle[]) $VALUES.clone();
    }
}
