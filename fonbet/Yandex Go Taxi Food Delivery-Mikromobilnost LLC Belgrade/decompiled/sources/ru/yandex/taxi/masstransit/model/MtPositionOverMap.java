package ru.yandex.taxi.masstransit.model;

import defpackage.es30;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.z530;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/model/MtPositionOverMap;", "", "Companion", "es30", "CENTER_START", "CENTER_END", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MtPositionOverMap {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtPositionOverMap[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final MtPositionOverMap CENTER_END;
    public static final MtPositionOverMap CENTER_START;
    public static final es30 Companion;

    static {
        MtPositionOverMap mtPositionOverMap = new MtPositionOverMap("CENTER_START", 0);
        CENTER_START = mtPositionOverMap;
        MtPositionOverMap mtPositionOverMap2 = new MtPositionOverMap("CENTER_END", 1);
        CENTER_END = mtPositionOverMap2;
        MtPositionOverMap[] mtPositionOverMapArr = {mtPositionOverMap, mtPositionOverMap2};
        $VALUES = mtPositionOverMapArr;
        $ENTRIES = kotlin.enums.a.a(mtPositionOverMapArr);
        Companion = new es30();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z530(12));
    }

    public static MtPositionOverMap valueOf(String str) {
        return (MtPositionOverMap) Enum.valueOf(MtPositionOverMap.class, str);
    }

    public static MtPositionOverMap[] values() {
        return (MtPositionOverMap[]) $VALUES.clone();
    }
}
