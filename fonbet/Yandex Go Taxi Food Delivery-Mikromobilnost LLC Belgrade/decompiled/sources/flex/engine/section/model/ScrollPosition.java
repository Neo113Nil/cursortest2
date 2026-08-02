package flex.engine.section.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lflex/engine/section/model/ScrollPosition;", "", "TOP", "CENTER", "BOTTOM", "flex-section-extension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScrollPosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScrollPosition[] $VALUES;
    public static final ScrollPosition BOTTOM;
    public static final ScrollPosition CENTER;
    public static final ScrollPosition TOP;

    static {
        ScrollPosition scrollPosition = new ScrollPosition("TOP", 0);
        TOP = scrollPosition;
        ScrollPosition scrollPosition2 = new ScrollPosition("CENTER", 1);
        CENTER = scrollPosition2;
        ScrollPosition scrollPosition3 = new ScrollPosition("BOTTOM", 2);
        BOTTOM = scrollPosition3;
        ScrollPosition[] scrollPositionArr = {scrollPosition, scrollPosition2, scrollPosition3};
        $VALUES = scrollPositionArr;
        $ENTRIES = a.a(scrollPositionArr);
    }

    public static ScrollPosition valueOf(String str) {
        return (ScrollPosition) Enum.valueOf(ScrollPosition.class, str);
    }

    public static ScrollPosition[] values() {
        return (ScrollPosition[]) $VALUES.clone();
    }
}
