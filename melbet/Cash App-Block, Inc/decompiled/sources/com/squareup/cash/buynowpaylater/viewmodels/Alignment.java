package com.squareup.cash.buynowpaylater.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Alignment {
    public static final /* synthetic */ Alignment[] $VALUES;
    public static final Alignment CENTER;
    public static final Alignment LEADING;
    public static final Alignment TRAILING;

    static {
        Alignment alignment = new Alignment("LEADING", 0);
        LEADING = alignment;
        Alignment alignment2 = new Alignment("CENTER", 1);
        CENTER = alignment2;
        Alignment alignment3 = new Alignment("TRAILING", 2);
        TRAILING = alignment3;
        $VALUES = new Alignment[]{alignment, alignment2, alignment3};
    }

    public static Alignment valueOf(String str) {
        return (Alignment) Enum.valueOf(Alignment.class, str);
    }

    public static Alignment[] values() {
        return (Alignment[]) $VALUES.clone();
    }
}
