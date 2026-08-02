package ru.yandex.taxi.scooters.data.model;

import defpackage.cyv0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j8w0;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/scooters/data/model/SuperPassesDisplayVersionDto;", "", "Companion", "j8w0", "V1", "V2", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SuperPassesDisplayVersionDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperPassesDisplayVersionDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final j8w0 Companion;
    public static final SuperPassesDisplayVersionDto V1;
    public static final SuperPassesDisplayVersionDto V2;

    static {
        SuperPassesDisplayVersionDto superPassesDisplayVersionDto = new SuperPassesDisplayVersionDto("V1", 0);
        V1 = superPassesDisplayVersionDto;
        SuperPassesDisplayVersionDto superPassesDisplayVersionDto2 = new SuperPassesDisplayVersionDto("V2", 1);
        V2 = superPassesDisplayVersionDto2;
        SuperPassesDisplayVersionDto[] superPassesDisplayVersionDtoArr = {superPassesDisplayVersionDto, superPassesDisplayVersionDto2};
        $VALUES = superPassesDisplayVersionDtoArr;
        $ENTRIES = a.a(superPassesDisplayVersionDtoArr);
        Companion = new j8w0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cyv0(6));
    }

    public static SuperPassesDisplayVersionDto valueOf(String str) {
        return (SuperPassesDisplayVersionDto) Enum.valueOf(SuperPassesDisplayVersionDto.class, str);
    }

    public static SuperPassesDisplayVersionDto[] values() {
        return (SuperPassesDisplayVersionDto[]) $VALUES.clone();
    }
}
