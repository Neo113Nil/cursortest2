package ru.yandex.taxi.search.address.view;

import defpackage.jvd0;
import defpackage.k4o;
import defpackage.kvd0;
import defpackage.w511;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/search/address/view/PointType;", "", "Companion", "jvd0", "SOURCE", "DESTINATION", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PointType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PointType[] $VALUES;
    public static final jvd0 Companion;
    public static final PointType DESTINATION;
    public static final PointType SOURCE;

    static {
        PointType pointType = new PointType("SOURCE", 0);
        SOURCE = pointType;
        PointType pointType2 = new PointType("DESTINATION", 1);
        DESTINATION = pointType2;
        PointType[] pointTypeArr = {pointType, pointType2};
        $VALUES = pointTypeArr;
        $ENTRIES = kotlin.enums.a.a(pointTypeArr);
        Companion = new jvd0();
    }

    public static PointType valueOf(String str) {
        return (PointType) Enum.valueOf(PointType.class, str);
    }

    public static PointType[] values() {
        return (PointType[]) $VALUES.clone();
    }

    public final boolean a() {
        int i = kvd0.a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        w511.b();
        return false;
    }
}
