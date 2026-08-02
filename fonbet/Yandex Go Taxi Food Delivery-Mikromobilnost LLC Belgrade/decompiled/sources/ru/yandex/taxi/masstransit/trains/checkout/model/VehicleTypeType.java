package ru.yandex.taxi.masstransit.trains.checkout.model;

import defpackage.c631;
import defpackage.gp21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/masstransit/trains/checkout/model/VehicleTypeType;", "", "Companion", "c631", "BUS", "AEROEXPRESS", "SUBURBAN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VehicleTypeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VehicleTypeType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final VehicleTypeType AEROEXPRESS;
    public static final VehicleTypeType BUS;
    public static final c631 Companion;
    public static final VehicleTypeType SUBURBAN;

    static {
        VehicleTypeType vehicleTypeType = new VehicleTypeType("BUS", 0);
        BUS = vehicleTypeType;
        VehicleTypeType vehicleTypeType2 = new VehicleTypeType("AEROEXPRESS", 1);
        AEROEXPRESS = vehicleTypeType2;
        VehicleTypeType vehicleTypeType3 = new VehicleTypeType("SUBURBAN", 2);
        SUBURBAN = vehicleTypeType3;
        VehicleTypeType[] vehicleTypeTypeArr = {vehicleTypeType, vehicleTypeType2, vehicleTypeType3};
        $VALUES = vehicleTypeTypeArr;
        $ENTRIES = kotlin.enums.a.a(vehicleTypeTypeArr);
        Companion = new c631();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(21));
    }

    public static VehicleTypeType valueOf(String str) {
        return (VehicleTypeType) Enum.valueOf(VehicleTypeType.class, str);
    }

    public static VehicleTypeType[] values() {
        return (VehicleTypeType[]) $VALUES.clone();
    }
}
