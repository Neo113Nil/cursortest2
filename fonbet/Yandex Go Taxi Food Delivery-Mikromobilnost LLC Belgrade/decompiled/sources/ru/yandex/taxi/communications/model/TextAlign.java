package ru.yandex.taxi.communications.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.rjy0;
import defpackage.y6y0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/communications/model/TextAlign;", "", "Companion", "rjy0", "START", "CENTER", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TextAlign {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextAlign[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final TextAlign CENTER;
    public static final rjy0 Companion;
    public static final TextAlign START;

    static {
        TextAlign textAlign = new TextAlign("START", 0);
        START = textAlign;
        TextAlign textAlign2 = new TextAlign("CENTER", 1);
        CENTER = textAlign2;
        TextAlign[] textAlignArr = {textAlign, textAlign2};
        $VALUES = textAlignArr;
        $ENTRIES = kotlin.enums.a.a(textAlignArr);
        Companion = new rjy0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y6y0(20));
    }

    public static TextAlign valueOf(String str) {
        return (TextAlign) Enum.valueOf(TextAlign.class, str);
    }

    public static TextAlign[] values() {
        return (TextAlign[]) $VALUES.clone();
    }
}
