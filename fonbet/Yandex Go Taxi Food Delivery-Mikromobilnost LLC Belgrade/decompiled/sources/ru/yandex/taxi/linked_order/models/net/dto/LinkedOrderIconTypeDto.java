package ru.yandex.taxi.linked_order.models.net.dto;

import defpackage.cny;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.wky;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/linked_order/models/net/dto/LinkedOrderIconTypeDto;", "", "Companion", "cny", "C2C", "B2C", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkedOrderIconTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LinkedOrderIconTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final LinkedOrderIconTypeDto B2C;
    public static final LinkedOrderIconTypeDto C2C;
    public static final cny Companion;

    static {
        LinkedOrderIconTypeDto linkedOrderIconTypeDto = new LinkedOrderIconTypeDto("C2C", 0);
        C2C = linkedOrderIconTypeDto;
        LinkedOrderIconTypeDto linkedOrderIconTypeDto2 = new LinkedOrderIconTypeDto("B2C", 1);
        B2C = linkedOrderIconTypeDto2;
        LinkedOrderIconTypeDto[] linkedOrderIconTypeDtoArr = {linkedOrderIconTypeDto, linkedOrderIconTypeDto2};
        $VALUES = linkedOrderIconTypeDtoArr;
        $ENTRIES = a.a(linkedOrderIconTypeDtoArr);
        Companion = new cny();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wky(4));
    }

    public static LinkedOrderIconTypeDto valueOf(String str) {
        return (LinkedOrderIconTypeDto) Enum.valueOf(LinkedOrderIconTypeDto.class, str);
    }

    public static LinkedOrderIconTypeDto[] values() {
        return (LinkedOrderIconTypeDto[]) $VALUES.clone();
    }
}
