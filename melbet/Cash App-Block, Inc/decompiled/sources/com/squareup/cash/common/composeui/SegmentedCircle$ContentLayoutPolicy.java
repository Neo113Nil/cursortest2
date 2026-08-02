package com.squareup.cash.common.composeui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SegmentedCircle$ContentLayoutPolicy {
    public static final /* synthetic */ SegmentedCircle$ContentLayoutPolicy[] $VALUES;
    public static final SegmentedCircle$ContentLayoutPolicy INSIDE_CORNER;
    public static final SegmentedCircle$ContentLayoutPolicy INSIDE_EDGE;

    static {
        SegmentedCircle$ContentLayoutPolicy segmentedCircle$ContentLayoutPolicy = new SegmentedCircle$ContentLayoutPolicy("INSIDE_CORNER", 0);
        INSIDE_CORNER = segmentedCircle$ContentLayoutPolicy;
        SegmentedCircle$ContentLayoutPolicy segmentedCircle$ContentLayoutPolicy2 = new SegmentedCircle$ContentLayoutPolicy("INSIDE_EDGE", 1);
        INSIDE_EDGE = segmentedCircle$ContentLayoutPolicy2;
        $VALUES = new SegmentedCircle$ContentLayoutPolicy[]{segmentedCircle$ContentLayoutPolicy, segmentedCircle$ContentLayoutPolicy2, new SegmentedCircle$ContentLayoutPolicy("FULL_SIZE", 2)};
    }

    public static SegmentedCircle$ContentLayoutPolicy valueOf(String str) {
        return (SegmentedCircle$ContentLayoutPolicy) Enum.valueOf(SegmentedCircle$ContentLayoutPolicy.class, str);
    }

    public static SegmentedCircle$ContentLayoutPolicy[] values() {
        return (SegmentedCircle$ContentLayoutPolicy[]) $VALUES.clone();
    }
}
