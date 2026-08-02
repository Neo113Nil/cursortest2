package ru.yandex.taxi.logistics.experiments;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/experiments/NddRouteType;", "", "SOURCE", "DESTINATION", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NddRouteType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NddRouteType[] $VALUES;
    public static final NddRouteType DESTINATION;
    public static final NddRouteType SOURCE;

    static {
        NddRouteType nddRouteType = new NddRouteType("SOURCE", 0);
        SOURCE = nddRouteType;
        NddRouteType nddRouteType2 = new NddRouteType("DESTINATION", 1);
        DESTINATION = nddRouteType2;
        NddRouteType[] nddRouteTypeArr = {nddRouteType, nddRouteType2};
        $VALUES = nddRouteTypeArr;
        $ENTRIES = kotlin.enums.a.a(nddRouteTypeArr);
    }

    public static NddRouteType valueOf(String str) {
        return (NddRouteType) Enum.valueOf(NddRouteType.class, str);
    }

    public static NddRouteType[] values() {
        return (NddRouteType[]) $VALUES.clone();
    }
}
