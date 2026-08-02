package ru.yandex.taxi.linked_order.models.net.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.vpy;
import defpackage.wky;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/linked_order/models/net/dto/LinkedOrderTypeDto;", "", "Companion", "vpy", "AMBULANCE", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkedOrderTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LinkedOrderTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final LinkedOrderTypeDto AMBULANCE;
    public static final vpy Companion;
    public static final LinkedOrderTypeDto UNKNOWN;

    static {
        LinkedOrderTypeDto linkedOrderTypeDto = new LinkedOrderTypeDto("AMBULANCE", 0);
        AMBULANCE = linkedOrderTypeDto;
        LinkedOrderTypeDto linkedOrderTypeDto2 = new LinkedOrderTypeDto("UNKNOWN", 1);
        UNKNOWN = linkedOrderTypeDto2;
        LinkedOrderTypeDto[] linkedOrderTypeDtoArr = {linkedOrderTypeDto, linkedOrderTypeDto2};
        $VALUES = linkedOrderTypeDtoArr;
        $ENTRIES = a.a(linkedOrderTypeDtoArr);
        Companion = new vpy();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wky(8));
    }

    public static LinkedOrderTypeDto valueOf(String str) {
        return (LinkedOrderTypeDto) Enum.valueOf(LinkedOrderTypeDto.class, str);
    }

    public static LinkedOrderTypeDto[] values() {
        return (LinkedOrderTypeDto[]) $VALUES.clone();
    }
}
