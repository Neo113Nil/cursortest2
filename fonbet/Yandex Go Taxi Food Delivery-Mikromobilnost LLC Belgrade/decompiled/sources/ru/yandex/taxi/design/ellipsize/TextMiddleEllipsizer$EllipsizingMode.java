package ru.yandex.taxi.design.ellipsize;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/design/ellipsize/TextMiddleEllipsizer$EllipsizingMode", "", "Lru/yandex/taxi/design/ellipsize/TextMiddleEllipsizer$EllipsizingMode;", "MIDDLE_ELLIPSE", "CUSTOM_ELLIPSE", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TextMiddleEllipsizer$EllipsizingMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextMiddleEllipsizer$EllipsizingMode[] $VALUES;
    public static final TextMiddleEllipsizer$EllipsizingMode CUSTOM_ELLIPSE;
    public static final TextMiddleEllipsizer$EllipsizingMode MIDDLE_ELLIPSE;

    static {
        TextMiddleEllipsizer$EllipsizingMode textMiddleEllipsizer$EllipsizingMode = new TextMiddleEllipsizer$EllipsizingMode("MIDDLE_ELLIPSE", 0);
        MIDDLE_ELLIPSE = textMiddleEllipsizer$EllipsizingMode;
        TextMiddleEllipsizer$EllipsizingMode textMiddleEllipsizer$EllipsizingMode2 = new TextMiddleEllipsizer$EllipsizingMode("CUSTOM_ELLIPSE", 1);
        CUSTOM_ELLIPSE = textMiddleEllipsizer$EllipsizingMode2;
        TextMiddleEllipsizer$EllipsizingMode[] textMiddleEllipsizer$EllipsizingModeArr = {textMiddleEllipsizer$EllipsizingMode, textMiddleEllipsizer$EllipsizingMode2};
        $VALUES = textMiddleEllipsizer$EllipsizingModeArr;
        $ENTRIES = a.a(textMiddleEllipsizer$EllipsizingModeArr);
    }

    public static TextMiddleEllipsizer$EllipsizingMode valueOf(String str) {
        return (TextMiddleEllipsizer$EllipsizingMode) Enum.valueOf(TextMiddleEllipsizer$EllipsizingMode.class, str);
    }

    public static TextMiddleEllipsizer$EllipsizingMode[] values() {
        return (TextMiddleEllipsizer$EllipsizingMode[]) $VALUES.clone();
    }
}
