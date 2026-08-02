package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.rm6;
import defpackage.un6;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/BubbleShowState;", "", "Companion", "un6", "UNKNOWN", "UNSELECTED", "SELECTED", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BubbleShowState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BubbleShowState[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final un6 Companion;
    public static final BubbleShowState SELECTED;
    public static final BubbleShowState UNKNOWN;
    public static final BubbleShowState UNSELECTED;

    static {
        BubbleShowState bubbleShowState = new BubbleShowState("UNKNOWN", 0);
        UNKNOWN = bubbleShowState;
        BubbleShowState bubbleShowState2 = new BubbleShowState("UNSELECTED", 1);
        UNSELECTED = bubbleShowState2;
        BubbleShowState bubbleShowState3 = new BubbleShowState("SELECTED", 2);
        SELECTED = bubbleShowState3;
        BubbleShowState[] bubbleShowStateArr = {bubbleShowState, bubbleShowState2, bubbleShowState3};
        $VALUES = bubbleShowStateArr;
        $ENTRIES = kotlin.enums.a.a(bubbleShowStateArr);
        Companion = new un6();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(3));
    }

    public static BubbleShowState valueOf(String str) {
        return (BubbleShowState) Enum.valueOf(BubbleShowState.class, str);
    }

    public static BubbleShowState[] values() {
        return (BubbleShowState[]) $VALUES.clone();
    }
}
