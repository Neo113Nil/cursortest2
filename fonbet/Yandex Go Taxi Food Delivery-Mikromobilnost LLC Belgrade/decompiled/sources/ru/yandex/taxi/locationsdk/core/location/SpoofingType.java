package ru.yandex.taxi.locationsdk.core.location;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/locationsdk/core/location/SpoofingType;", "", "None", "Unknown", "Gnss", "Service", "Region", "core2"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SpoofingType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SpoofingType[] $VALUES;
    public static final SpoofingType Gnss;
    public static final SpoofingType None;
    public static final SpoofingType Region;
    public static final SpoofingType Service;
    public static final SpoofingType Unknown;

    static {
        SpoofingType spoofingType = new SpoofingType("None", 0);
        None = spoofingType;
        SpoofingType spoofingType2 = new SpoofingType("Unknown", 1);
        Unknown = spoofingType2;
        SpoofingType spoofingType3 = new SpoofingType("Gnss", 2);
        Gnss = spoofingType3;
        SpoofingType spoofingType4 = new SpoofingType("Service", 3);
        Service = spoofingType4;
        SpoofingType spoofingType5 = new SpoofingType("Region", 4);
        Region = spoofingType5;
        SpoofingType[] spoofingTypeArr = {spoofingType, spoofingType2, spoofingType3, spoofingType4, spoofingType5};
        $VALUES = spoofingTypeArr;
        $ENTRIES = a.a(spoofingTypeArr);
    }

    public static SpoofingType valueOf(String str) {
        return (SpoofingType) Enum.valueOf(SpoofingType.class, str);
    }

    public static SpoofingType[] values() {
        return (SpoofingType[]) $VALUES.clone();
    }
}
