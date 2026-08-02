package app.cash.redwood.yoga.internal.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class YGEdge {
    public static final /* synthetic */ YGEdge[] $VALUES;
    public static final YGEdge YGEdgeBottom;
    public static final YGEdge YGEdgeEnd;
    public static final YGEdge YGEdgeLeft;
    public static final YGEdge YGEdgeRight;
    public static final YGEdge YGEdgeStart;
    public static final YGEdge YGEdgeTop;

    static {
        YGEdge yGEdge = new YGEdge("YGEdgeLeft", 0);
        YGEdgeLeft = yGEdge;
        YGEdge yGEdge2 = new YGEdge("YGEdgeTop", 1);
        YGEdgeTop = yGEdge2;
        YGEdge yGEdge3 = new YGEdge("YGEdgeRight", 2);
        YGEdgeRight = yGEdge3;
        YGEdge yGEdge4 = new YGEdge("YGEdgeBottom", 3);
        YGEdgeBottom = yGEdge4;
        YGEdge yGEdge5 = new YGEdge("YGEdgeStart", 4);
        YGEdgeStart = yGEdge5;
        YGEdge yGEdge6 = new YGEdge("YGEdgeEnd", 5);
        YGEdgeEnd = yGEdge6;
        $VALUES = new YGEdge[]{yGEdge, yGEdge2, yGEdge3, yGEdge4, yGEdge5, yGEdge6, new YGEdge("YGEdgeHorizontal", 6), new YGEdge("YGEdgeVertical", 7), new YGEdge("YGEdgeAll", 8)};
    }

    public static YGEdge valueOf(String str) {
        return (YGEdge) Enum.valueOf(YGEdge.class, str);
    }

    public static YGEdge[] values() {
        return (YGEdge[]) $VALUES.clone();
    }
}
