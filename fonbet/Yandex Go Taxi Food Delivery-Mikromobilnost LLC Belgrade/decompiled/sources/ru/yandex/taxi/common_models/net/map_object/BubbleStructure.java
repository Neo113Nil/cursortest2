package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.rm6;
import defpackage.wn6;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/BubbleStructure;", "", "Companion", "wn6", "UNKNOWN", "CAPSULE", "SQUIRCLE", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BubbleStructure {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BubbleStructure[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final BubbleStructure CAPSULE;
    public static final wn6 Companion;
    public static final BubbleStructure SQUIRCLE;
    public static final BubbleStructure UNKNOWN;

    static {
        BubbleStructure bubbleStructure = new BubbleStructure("UNKNOWN", 0);
        UNKNOWN = bubbleStructure;
        BubbleStructure bubbleStructure2 = new BubbleStructure("CAPSULE", 1);
        CAPSULE = bubbleStructure2;
        BubbleStructure bubbleStructure3 = new BubbleStructure("SQUIRCLE", 2);
        SQUIRCLE = bubbleStructure3;
        BubbleStructure[] bubbleStructureArr = {bubbleStructure, bubbleStructure2, bubbleStructure3};
        $VALUES = bubbleStructureArr;
        $ENTRIES = kotlin.enums.a.a(bubbleStructureArr);
        Companion = new wn6();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(4));
    }

    public static BubbleStructure valueOf(String str) {
        return (BubbleStructure) Enum.valueOf(BubbleStructure.class, str);
    }

    public static BubbleStructure[] values() {
        return (BubbleStructure[]) $VALUES.clone();
    }
}
