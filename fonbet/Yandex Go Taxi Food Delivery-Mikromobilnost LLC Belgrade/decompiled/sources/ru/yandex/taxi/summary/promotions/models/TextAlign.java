package ru.yandex.taxi.summary.promotions.models;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.qjy0;
import defpackage.y6y0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/TextAlign;", "", "Companion", "qjy0", "LEFT", "CENTER", "RIGHT", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextAlign {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextAlign[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final TextAlign CENTER;
    public static final qjy0 Companion;
    public static final TextAlign LEFT;
    public static final TextAlign RIGHT;

    static {
        TextAlign textAlign = new TextAlign("LEFT", 0);
        LEFT = textAlign;
        TextAlign textAlign2 = new TextAlign("CENTER", 1);
        CENTER = textAlign2;
        TextAlign textAlign3 = new TextAlign("RIGHT", 2);
        RIGHT = textAlign3;
        TextAlign[] textAlignArr = {textAlign, textAlign2, textAlign3};
        $VALUES = textAlignArr;
        $ENTRIES = kotlin.enums.a.a(textAlignArr);
        Companion = new qjy0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y6y0(19));
    }

    public static TextAlign valueOf(String str) {
        return (TextAlign) Enum.valueOf(TextAlign.class, str);
    }

    public static TextAlign[] values() {
        return (TextAlign[]) $VALUES.clone();
    }
}
