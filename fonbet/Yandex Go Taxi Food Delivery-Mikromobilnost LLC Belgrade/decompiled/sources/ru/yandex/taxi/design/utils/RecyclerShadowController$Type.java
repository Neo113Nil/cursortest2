package ru.yandex.taxi.design.utils;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/design/utils/RecyclerShadowController$Type", "", "Lru/yandex/taxi/design/utils/RecyclerShadowController$Type;", "BOTTOM", "TOP", "START", "END", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RecyclerShadowController$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RecyclerShadowController$Type[] $VALUES;
    public static final RecyclerShadowController$Type BOTTOM;
    public static final RecyclerShadowController$Type END;
    public static final RecyclerShadowController$Type START;
    public static final RecyclerShadowController$Type TOP;

    static {
        RecyclerShadowController$Type recyclerShadowController$Type = new RecyclerShadowController$Type("BOTTOM", 0);
        BOTTOM = recyclerShadowController$Type;
        RecyclerShadowController$Type recyclerShadowController$Type2 = new RecyclerShadowController$Type("TOP", 1);
        TOP = recyclerShadowController$Type2;
        RecyclerShadowController$Type recyclerShadowController$Type3 = new RecyclerShadowController$Type("START", 2);
        START = recyclerShadowController$Type3;
        RecyclerShadowController$Type recyclerShadowController$Type4 = new RecyclerShadowController$Type("END", 3);
        END = recyclerShadowController$Type4;
        RecyclerShadowController$Type[] recyclerShadowController$TypeArr = {recyclerShadowController$Type, recyclerShadowController$Type2, recyclerShadowController$Type3, recyclerShadowController$Type4};
        $VALUES = recyclerShadowController$TypeArr;
        $ENTRIES = kotlin.enums.a.a(recyclerShadowController$TypeArr);
    }

    public static RecyclerShadowController$Type valueOf(String str) {
        return (RecyclerShadowController$Type) Enum.valueOf(RecyclerShadowController$Type.class, str);
    }

    public static RecyclerShadowController$Type[] values() {
        return (RecyclerShadowController$Type[]) $VALUES.clone();
    }
}
