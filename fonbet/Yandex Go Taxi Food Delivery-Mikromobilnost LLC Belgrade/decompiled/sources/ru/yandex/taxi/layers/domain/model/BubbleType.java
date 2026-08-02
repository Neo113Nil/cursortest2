package ru.yandex.taxi.layers.domain.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/layers/domain/model/BubbleType;", "", "PLAIN_TEXT", "SMALL", "MEDIUM_OR_LARGE", "MEDIUM_OR_LARGE_CORNER_RADIUS_16", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BubbleType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BubbleType[] $VALUES;
    public static final BubbleType MEDIUM_OR_LARGE;
    public static final BubbleType MEDIUM_OR_LARGE_CORNER_RADIUS_16;
    public static final BubbleType PLAIN_TEXT;
    public static final BubbleType SMALL;

    static {
        BubbleType bubbleType = new BubbleType("PLAIN_TEXT", 0);
        PLAIN_TEXT = bubbleType;
        BubbleType bubbleType2 = new BubbleType("SMALL", 1);
        SMALL = bubbleType2;
        BubbleType bubbleType3 = new BubbleType("MEDIUM_OR_LARGE", 2);
        MEDIUM_OR_LARGE = bubbleType3;
        BubbleType bubbleType4 = new BubbleType("MEDIUM_OR_LARGE_CORNER_RADIUS_16", 3);
        MEDIUM_OR_LARGE_CORNER_RADIUS_16 = bubbleType4;
        BubbleType[] bubbleTypeArr = {bubbleType, bubbleType2, bubbleType3, bubbleType4};
        $VALUES = bubbleTypeArr;
        $ENTRIES = kotlin.enums.a.a(bubbleTypeArr);
    }

    public static BubbleType valueOf(String str) {
        return (BubbleType) Enum.valueOf(BubbleType.class, str);
    }

    public static BubbleType[] values() {
        return (BubbleType[]) $VALUES.clone();
    }
}
