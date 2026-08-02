package ru.yandex.taxi.scooters.data.model;

import defpackage.b631;
import defpackage.gp21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/scooters/data/model/VehicleType;", "", "Companion", "b631", "SCOOTER", "BIKE", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VehicleType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VehicleType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final VehicleType BIKE;
    public static final b631 Companion;
    public static final VehicleType SCOOTER;

    static {
        VehicleType vehicleType = new VehicleType("SCOOTER", 0);
        SCOOTER = vehicleType;
        VehicleType vehicleType2 = new VehicleType("BIKE", 1);
        BIKE = vehicleType2;
        VehicleType[] vehicleTypeArr = {vehicleType, vehicleType2};
        $VALUES = vehicleTypeArr;
        $ENTRIES = a.a(vehicleTypeArr);
        Companion = new b631();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(20));
    }

    public static VehicleType valueOf(String str) {
        return (VehicleType) Enum.valueOf(VehicleType.class, str);
    }

    public static VehicleType[] values() {
        return (VehicleType[]) $VALUES.clone();
    }
}
