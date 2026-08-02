package ru.yandex.taxi.masstransit.utils;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/masstransit/utils/VehicleType;", "", "", "eventValue", "Ljava/lang/String;", "getEventValue", "()Ljava/lang/String;", "Bus", "Aeroexpress", "Suburban", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VehicleType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VehicleType[] $VALUES;
    public static final VehicleType Aeroexpress;
    public static final VehicleType Bus;
    public static final VehicleType Suburban;
    private final String eventValue;

    static {
        VehicleType vehicleType = new VehicleType("Bus", 0, "bus");
        Bus = vehicleType;
        VehicleType vehicleType2 = new VehicleType("Aeroexpress", 1, "aeroexpress");
        Aeroexpress = vehicleType2;
        VehicleType vehicleType3 = new VehicleType("Suburban", 2, "suburban");
        Suburban = vehicleType3;
        VehicleType[] vehicleTypeArr = {vehicleType, vehicleType2, vehicleType3};
        $VALUES = vehicleTypeArr;
        $ENTRIES = kotlin.enums.a.a(vehicleTypeArr);
    }

    public VehicleType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static VehicleType valueOf(String str) {
        return (VehicleType) Enum.valueOf(VehicleType.class, str);
    }

    public static VehicleType[] values() {
        return (VehicleType[]) $VALUES.clone();
    }
}
