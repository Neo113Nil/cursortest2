package com.squareup.cash.cdf.sponsoredaccount;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class GraphTimeUnit {
    public static final /* synthetic */ GraphTimeUnit[] $VALUES;
    public static final GraphTimeUnit All;
    public static final GraphTimeUnit OneDay;
    public static final GraphTimeUnit OneMonth;
    public static final GraphTimeUnit OneWeek;
    public static final GraphTimeUnit OneYear;

    static {
        GraphTimeUnit graphTimeUnit = new GraphTimeUnit("OneDay", 0);
        OneDay = graphTimeUnit;
        GraphTimeUnit graphTimeUnit2 = new GraphTimeUnit("OneWeek", 1);
        OneWeek = graphTimeUnit2;
        GraphTimeUnit graphTimeUnit3 = new GraphTimeUnit("OneMonth", 2);
        OneMonth = graphTimeUnit3;
        GraphTimeUnit graphTimeUnit4 = new GraphTimeUnit("OneYear", 3);
        OneYear = graphTimeUnit4;
        GraphTimeUnit graphTimeUnit5 = new GraphTimeUnit("All", 4);
        All = graphTimeUnit5;
        $VALUES = new GraphTimeUnit[]{graphTimeUnit, graphTimeUnit2, graphTimeUnit3, graphTimeUnit4, graphTimeUnit5};
    }

    public static GraphTimeUnit valueOf(String str) {
        return (GraphTimeUnit) Enum.valueOf(GraphTimeUnit.class, str);
    }

    public static GraphTimeUnit[] values() {
        return (GraphTimeUnit[]) $VALUES.clone();
    }
}
