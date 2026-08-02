package ru.yandex.taxi.bubbles.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/bubbles/models/BubbleModelShownFrom;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "DEFAULT", "TAP", "GEO_TAP", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BubbleModelShownFrom {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BubbleModelShownFrom[] $VALUES;
    public static final BubbleModelShownFrom DEFAULT;
    public static final BubbleModelShownFrom GEO_TAP;
    public static final BubbleModelShownFrom TAP;
    private final String value;

    static {
        BubbleModelShownFrom bubbleModelShownFrom = new BubbleModelShownFrom("DEFAULT", 0, "DefaultShown");
        DEFAULT = bubbleModelShownFrom;
        BubbleModelShownFrom bubbleModelShownFrom2 = new BubbleModelShownFrom("TAP", 1, "Tap");
        TAP = bubbleModelShownFrom2;
        BubbleModelShownFrom bubbleModelShownFrom3 = new BubbleModelShownFrom("GEO_TAP", 2, "GeoTap");
        GEO_TAP = bubbleModelShownFrom3;
        BubbleModelShownFrom[] bubbleModelShownFromArr = {bubbleModelShownFrom, bubbleModelShownFrom2, bubbleModelShownFrom3};
        $VALUES = bubbleModelShownFromArr;
        $ENTRIES = a.a(bubbleModelShownFromArr);
    }

    public BubbleModelShownFrom(String str, int i, String str2) {
        this.value = str2;
    }

    public static BubbleModelShownFrom valueOf(String str) {
        return (BubbleModelShownFrom) Enum.valueOf(BubbleModelShownFrom.class, str);
    }

    public static BubbleModelShownFrom[] values() {
        return (BubbleModelShownFrom[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
