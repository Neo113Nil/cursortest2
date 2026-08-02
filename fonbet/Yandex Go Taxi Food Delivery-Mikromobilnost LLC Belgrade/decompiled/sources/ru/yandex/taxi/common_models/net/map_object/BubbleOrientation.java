package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jn6;
import defpackage.k4o;
import defpackage.rm6;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/BubbleOrientation;", "", "Companion", "jn6", "UNKNOWN", "TOP", "BOTTOM", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BubbleOrientation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BubbleOrientation[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final BubbleOrientation BOTTOM;
    public static final jn6 Companion;
    public static final BubbleOrientation TOP;
    public static final BubbleOrientation UNKNOWN;

    static {
        BubbleOrientation bubbleOrientation = new BubbleOrientation("UNKNOWN", 0);
        UNKNOWN = bubbleOrientation;
        BubbleOrientation bubbleOrientation2 = new BubbleOrientation("TOP", 1);
        TOP = bubbleOrientation2;
        BubbleOrientation bubbleOrientation3 = new BubbleOrientation("BOTTOM", 2);
        BOTTOM = bubbleOrientation3;
        BubbleOrientation[] bubbleOrientationArr = {bubbleOrientation, bubbleOrientation2, bubbleOrientation3};
        $VALUES = bubbleOrientationArr;
        $ENTRIES = kotlin.enums.a.a(bubbleOrientationArr);
        Companion = new jn6();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(1));
    }

    public static BubbleOrientation valueOf(String str) {
        return (BubbleOrientation) Enum.valueOf(BubbleOrientation.class, str);
    }

    public static BubbleOrientation[] values() {
        return (BubbleOrientation[]) $VALUES.clone();
    }
}
