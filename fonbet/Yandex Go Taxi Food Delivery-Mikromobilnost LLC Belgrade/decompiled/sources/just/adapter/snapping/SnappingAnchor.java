package just.adapter.snapping;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Ljust/adapter/snapping/SnappingAnchor;", "", "START", "END", "just-adapter-snapping_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SnappingAnchor {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SnappingAnchor[] $VALUES;
    public static final SnappingAnchor END;
    public static final SnappingAnchor START;

    static {
        SnappingAnchor snappingAnchor = new SnappingAnchor("START", 0);
        START = snappingAnchor;
        SnappingAnchor snappingAnchor2 = new SnappingAnchor("END", 1);
        END = snappingAnchor2;
        SnappingAnchor[] snappingAnchorArr = {snappingAnchor, snappingAnchor2};
        $VALUES = snappingAnchorArr;
        $ENTRIES = kotlin.enums.a.a(snappingAnchorArr);
    }

    public static SnappingAnchor valueOf(String str) {
        return (SnappingAnchor) Enum.valueOf(SnappingAnchor.class, str);
    }

    public static SnappingAnchor[] values() {
        return (SnappingAnchor[]) $VALUES.clone();
    }
}
