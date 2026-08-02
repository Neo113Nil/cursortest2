package ru.yandex.taxi.preorder.tollroad;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/preorder/tollroad/RoadType;", "", "FREE", "TOLL", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RoadType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RoadType[] $VALUES;
    public static final RoadType FREE;
    public static final RoadType TOLL;

    static {
        RoadType roadType = new RoadType("FREE", 0);
        FREE = roadType;
        RoadType roadType2 = new RoadType("TOLL", 1);
        TOLL = roadType2;
        RoadType[] roadTypeArr = {roadType, roadType2};
        $VALUES = roadTypeArr;
        $ENTRIES = kotlin.enums.a.a(roadTypeArr);
    }

    public static RoadType valueOf(String str) {
        return (RoadType) Enum.valueOf(RoadType.class, str);
    }

    public static RoadType[] values() {
        return (RoadType[]) $VALUES.clone();
    }
}
