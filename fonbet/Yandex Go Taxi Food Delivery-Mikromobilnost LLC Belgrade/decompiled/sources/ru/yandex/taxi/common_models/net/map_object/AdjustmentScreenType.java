package ru.yandex.taxi.common_models.net.map_object;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/AdjustmentScreenType;", "", "POINT_ADJUSTMENT", "ADDRESS_CONFIRMATION", "UNKNOWN", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdjustmentScreenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AdjustmentScreenType[] $VALUES;
    public static final AdjustmentScreenType ADDRESS_CONFIRMATION;
    public static final AdjustmentScreenType POINT_ADJUSTMENT;
    public static final AdjustmentScreenType UNKNOWN;

    static {
        AdjustmentScreenType adjustmentScreenType = new AdjustmentScreenType("POINT_ADJUSTMENT", 0);
        POINT_ADJUSTMENT = adjustmentScreenType;
        AdjustmentScreenType adjustmentScreenType2 = new AdjustmentScreenType("ADDRESS_CONFIRMATION", 1);
        ADDRESS_CONFIRMATION = adjustmentScreenType2;
        AdjustmentScreenType adjustmentScreenType3 = new AdjustmentScreenType("UNKNOWN", 2);
        UNKNOWN = adjustmentScreenType3;
        AdjustmentScreenType[] adjustmentScreenTypeArr = {adjustmentScreenType, adjustmentScreenType2, adjustmentScreenType3};
        $VALUES = adjustmentScreenTypeArr;
        $ENTRIES = kotlin.enums.a.a(adjustmentScreenTypeArr);
    }

    public static AdjustmentScreenType valueOf(String str) {
        return (AdjustmentScreenType) Enum.valueOf(AdjustmentScreenType.class, str);
    }

    public static AdjustmentScreenType[] values() {
        return (AdjustmentScreenType[]) $VALUES.clone();
    }
}
