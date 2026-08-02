package ru.yandex.taxi.design;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/design/FixedPixel;", "", "CENTER", "TOP_LEFT", "BOTTOM_RIGHT", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final class FixedPixel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FixedPixel[] $VALUES;
    public static final FixedPixel BOTTOM_RIGHT;
    public static final FixedPixel CENTER;
    public static final FixedPixel TOP_LEFT;

    static {
        FixedPixel fixedPixel = new FixedPixel("CENTER", 0);
        CENTER = fixedPixel;
        FixedPixel fixedPixel2 = new FixedPixel("TOP_LEFT", 1);
        TOP_LEFT = fixedPixel2;
        FixedPixel fixedPixel3 = new FixedPixel("BOTTOM_RIGHT", 2);
        BOTTOM_RIGHT = fixedPixel3;
        FixedPixel[] fixedPixelArr = {fixedPixel, fixedPixel2, fixedPixel3};
        $VALUES = fixedPixelArr;
        $ENTRIES = kotlin.enums.a.a(fixedPixelArr);
    }

    public static FixedPixel valueOf(String str) {
        return (FixedPixel) Enum.valueOf(FixedPixel.class, str);
    }

    public static FixedPixel[] values() {
        return (FixedPixel[]) $VALUES.clone();
    }
}
