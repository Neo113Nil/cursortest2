package app.cash.redwood.yoga.internal.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LayoutPassReason {
    public static final /* synthetic */ LayoutPassReason[] $VALUES;
    public static final int COUNT;
    public static final EmptyEventData Companion;
    public static final LayoutPassReason kAbsLayout;
    public static final LayoutPassReason kAbsMeasureChild;
    public static final LayoutPassReason kFlexLayout;
    public static final LayoutPassReason kFlexMeasure;
    public static final LayoutPassReason kInitial;
    public static final LayoutPassReason kMeasureChild;
    public static final LayoutPassReason kMultilineStretch;
    public static final LayoutPassReason kStretch;

    static {
        LayoutPassReason layoutPassReason = new LayoutPassReason("kInitial", 0);
        kInitial = layoutPassReason;
        LayoutPassReason layoutPassReason2 = new LayoutPassReason("kAbsLayout", 1);
        kAbsLayout = layoutPassReason2;
        LayoutPassReason layoutPassReason3 = new LayoutPassReason("kStretch", 2);
        kStretch = layoutPassReason3;
        LayoutPassReason layoutPassReason4 = new LayoutPassReason("kMultilineStretch", 3);
        kMultilineStretch = layoutPassReason4;
        LayoutPassReason layoutPassReason5 = new LayoutPassReason("kFlexLayout", 4);
        kFlexLayout = layoutPassReason5;
        LayoutPassReason layoutPassReason6 = new LayoutPassReason("kMeasureChild", 5);
        kMeasureChild = layoutPassReason6;
        LayoutPassReason layoutPassReason7 = new LayoutPassReason("kAbsMeasureChild", 6);
        kAbsMeasureChild = layoutPassReason7;
        LayoutPassReason layoutPassReason8 = new LayoutPassReason("kFlexMeasure", 7);
        kFlexMeasure = layoutPassReason8;
        $VALUES = new LayoutPassReason[]{layoutPassReason, layoutPassReason2, layoutPassReason3, layoutPassReason4, layoutPassReason5, layoutPassReason6, layoutPassReason7, layoutPassReason8};
        Companion = new EmptyEventData();
        COUNT = values().length;
    }

    public static LayoutPassReason valueOf(String str) {
        return (LayoutPassReason) Enum.valueOf(LayoutPassReason.class, str);
    }

    public static LayoutPassReason[] values() {
        return (LayoutPassReason[]) $VALUES.clone();
    }
}
