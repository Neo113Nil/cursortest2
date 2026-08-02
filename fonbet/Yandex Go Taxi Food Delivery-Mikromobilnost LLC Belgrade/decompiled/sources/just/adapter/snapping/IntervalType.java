package just.adapter.snapping;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ojw;
import defpackage.vuw;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ljust/adapter/snapping/IntervalType;", "", "Companion", "vuw", "ABSOLUTE", "RELATIVE", "just-adapter-snapping_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IntervalType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IntervalType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final IntervalType ABSOLUTE;
    public static final vuw Companion;
    public static final IntervalType RELATIVE;

    static {
        IntervalType intervalType = new IntervalType("ABSOLUTE", 0);
        ABSOLUTE = intervalType;
        IntervalType intervalType2 = new IntervalType("RELATIVE", 1);
        RELATIVE = intervalType2;
        IntervalType[] intervalTypeArr = {intervalType, intervalType2};
        $VALUES = intervalTypeArr;
        $ENTRIES = kotlin.enums.a.a(intervalTypeArr);
        Companion = new vuw();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ojw(18));
    }

    public static IntervalType valueOf(String str) {
        return (IntervalType) Enum.valueOf(IntervalType.class, str);
    }

    public static IntervalType[] values() {
        return (IntervalType[]) $VALUES.clone();
    }
}
