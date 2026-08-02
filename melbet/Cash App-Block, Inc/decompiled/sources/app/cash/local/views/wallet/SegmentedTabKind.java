package app.cash.local.views.wallet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SegmentedTabKind {
    public static final /* synthetic */ SegmentedTabKind[] $VALUES;
    public static final SegmentedTabKind EXPLORE;
    public static final SegmentedTabKind FOLLOWING;
    public static final SegmentedTabKind ORDERS;

    static {
        SegmentedTabKind segmentedTabKind = new SegmentedTabKind("EXPLORE", 0);
        EXPLORE = segmentedTabKind;
        SegmentedTabKind segmentedTabKind2 = new SegmentedTabKind("ORDERS", 1);
        ORDERS = segmentedTabKind2;
        SegmentedTabKind segmentedTabKind3 = new SegmentedTabKind("FOLLOWING", 2);
        FOLLOWING = segmentedTabKind3;
        $VALUES = new SegmentedTabKind[]{segmentedTabKind, segmentedTabKind2, segmentedTabKind3};
    }

    public static SegmentedTabKind valueOf(String str) {
        return (SegmentedTabKind) Enum.valueOf(SegmentedTabKind.class, str);
    }

    public static SegmentedTabKind[] values() {
        return (SegmentedTabKind[]) $VALUES.clone();
    }
}
