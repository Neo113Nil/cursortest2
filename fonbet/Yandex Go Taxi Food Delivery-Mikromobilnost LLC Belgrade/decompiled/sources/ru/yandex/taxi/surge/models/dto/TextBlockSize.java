package ru.yandex.taxi.surge.models.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.qky0;
import defpackage.y6y0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/surge/models/dto/TextBlockSize;", "", "Companion", "qky0", "EXTRA_SMALL", "SMALL", "MEDIUM", "LARGE", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextBlockSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextBlockSize[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final qky0 Companion;
    public static final TextBlockSize EXTRA_SMALL;
    public static final TextBlockSize LARGE;
    public static final TextBlockSize MEDIUM;
    public static final TextBlockSize SMALL;
    public static final TextBlockSize UNKNOWN;

    static {
        TextBlockSize textBlockSize = new TextBlockSize("EXTRA_SMALL", 0);
        EXTRA_SMALL = textBlockSize;
        TextBlockSize textBlockSize2 = new TextBlockSize("SMALL", 1);
        SMALL = textBlockSize2;
        TextBlockSize textBlockSize3 = new TextBlockSize("MEDIUM", 2);
        MEDIUM = textBlockSize3;
        TextBlockSize textBlockSize4 = new TextBlockSize("LARGE", 3);
        LARGE = textBlockSize4;
        TextBlockSize textBlockSize5 = new TextBlockSize("UNKNOWN", 4);
        UNKNOWN = textBlockSize5;
        TextBlockSize[] textBlockSizeArr = {textBlockSize, textBlockSize2, textBlockSize3, textBlockSize4, textBlockSize5};
        $VALUES = textBlockSizeArr;
        $ENTRIES = kotlin.enums.a.a(textBlockSizeArr);
        Companion = new qky0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y6y0(21));
    }

    public static TextBlockSize valueOf(String str) {
        return (TextBlockSize) Enum.valueOf(TextBlockSize.class, str);
    }

    public static TextBlockSize[] values() {
        return (TextBlockSize[]) $VALUES.clone();
    }
}
