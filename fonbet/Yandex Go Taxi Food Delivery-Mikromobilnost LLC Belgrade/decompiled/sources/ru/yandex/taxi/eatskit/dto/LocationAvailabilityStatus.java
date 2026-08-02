package ru.yandex.taxi.eatskit.dto;

import defpackage.b7z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.o3z;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/eatskit/dto/LocationAvailabilityStatus;", "", "Companion", "b7z", "AVAILABLE", "NOT_AVAILABLE", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocationAvailabilityStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LocationAvailabilityStatus[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final LocationAvailabilityStatus AVAILABLE;
    public static final b7z Companion;
    public static final LocationAvailabilityStatus NOT_AVAILABLE;

    static {
        LocationAvailabilityStatus locationAvailabilityStatus = new LocationAvailabilityStatus("AVAILABLE", 0);
        AVAILABLE = locationAvailabilityStatus;
        LocationAvailabilityStatus locationAvailabilityStatus2 = new LocationAvailabilityStatus("NOT_AVAILABLE", 1);
        NOT_AVAILABLE = locationAvailabilityStatus2;
        LocationAvailabilityStatus[] locationAvailabilityStatusArr = {locationAvailabilityStatus, locationAvailabilityStatus2};
        $VALUES = locationAvailabilityStatusArr;
        $ENTRIES = kotlin.enums.a.a(locationAvailabilityStatusArr);
        Companion = new b7z();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new o3z(8));
    }

    public static LocationAvailabilityStatus valueOf(String str) {
        return (LocationAvailabilityStatus) Enum.valueOf(LocationAvailabilityStatus.class, str);
    }

    public static LocationAvailabilityStatus[] values() {
        return (LocationAvailabilityStatus[]) $VALUES.clone();
    }
}
