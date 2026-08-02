package flex.feature.sections.action;

import defpackage.c6p0;
import defpackage.gsq0;
import defpackage.hip0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lflex/feature/sections/action/ScrollPositionSurrogate;", "", "Companion", "hip0", "TOP", "CENTER", "BOTTOM", "flex-sections-action_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScrollPositionSurrogate {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScrollPositionSurrogate[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ScrollPositionSurrogate BOTTOM;
    public static final ScrollPositionSurrogate CENTER;
    public static final hip0 Companion;
    public static final ScrollPositionSurrogate TOP;

    static {
        ScrollPositionSurrogate scrollPositionSurrogate = new ScrollPositionSurrogate("TOP", 0);
        TOP = scrollPositionSurrogate;
        ScrollPositionSurrogate scrollPositionSurrogate2 = new ScrollPositionSurrogate("CENTER", 1);
        CENTER = scrollPositionSurrogate2;
        ScrollPositionSurrogate scrollPositionSurrogate3 = new ScrollPositionSurrogate("BOTTOM", 2);
        BOTTOM = scrollPositionSurrogate3;
        ScrollPositionSurrogate[] scrollPositionSurrogateArr = {scrollPositionSurrogate, scrollPositionSurrogate2, scrollPositionSurrogate3};
        $VALUES = scrollPositionSurrogateArr;
        $ENTRIES = a.a(scrollPositionSurrogateArr);
        Companion = new hip0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c6p0(18));
    }

    public static ScrollPositionSurrogate valueOf(String str) {
        return (ScrollPositionSurrogate) Enum.valueOf(ScrollPositionSurrogate.class, str);
    }

    public static ScrollPositionSurrogate[] values() {
        return (ScrollPositionSurrogate[]) $VALUES.clone();
    }
}
