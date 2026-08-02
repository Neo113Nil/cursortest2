package com.squareup.cash.booklet.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BookletStyle {
    public static final /* synthetic */ BookletStyle[] $VALUES;
    public static final BookletStyle Default;
    public static final BookletStyle Evolution;

    static {
        BookletStyle bookletStyle = new BookletStyle("Default", 0);
        Default = bookletStyle;
        BookletStyle bookletStyle2 = new BookletStyle("Evolution", 1);
        Evolution = bookletStyle2;
        $VALUES = new BookletStyle[]{bookletStyle, bookletStyle2};
    }

    public static BookletStyle valueOf(String str) {
        return (BookletStyle) Enum.valueOf(BookletStyle.class, str);
    }

    public static BookletStyle[] values() {
        return (BookletStyle[]) $VALUES.clone();
    }
}
