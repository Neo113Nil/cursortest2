package ru.yandex.taxi.scooters.data.model;

import defpackage.gsq0;
import defpackage.h5o0;
import defpackage.heo0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/scooters/data/model/ScootersPassesListServiceDto;", "", "Companion", "heo0", "CHARGERS", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPassesListServiceDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersPassesListServiceDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ScootersPassesListServiceDto CHARGERS;
    public static final heo0 Companion;

    static {
        ScootersPassesListServiceDto scootersPassesListServiceDto = new ScootersPassesListServiceDto("CHARGERS", 0);
        CHARGERS = scootersPassesListServiceDto;
        ScootersPassesListServiceDto[] scootersPassesListServiceDtoArr = {scootersPassesListServiceDto};
        $VALUES = scootersPassesListServiceDtoArr;
        $ENTRIES = a.a(scootersPassesListServiceDtoArr);
        Companion = new heo0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(6));
    }

    public static ScootersPassesListServiceDto valueOf(String str) {
        return (ScootersPassesListServiceDto) Enum.valueOf(ScootersPassesListServiceDto.class, str);
    }

    public static ScootersPassesListServiceDto[] values() {
        return (ScootersPassesListServiceDto[]) $VALUES.clone();
    }
}
