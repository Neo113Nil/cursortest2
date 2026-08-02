package ru.yandex.taxi.cashback.models.response;

import defpackage.gsq0;
import defpackage.h49;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.r66;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/cashback/models/response/CashbackTariffBadgeStyleDto;", "", "Companion", "h49", "DARK", "LIGHT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CashbackTariffBadgeStyleDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CashbackTariffBadgeStyleDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final h49 Companion;
    public static final CashbackTariffBadgeStyleDto DARK;
    public static final CashbackTariffBadgeStyleDto LIGHT;

    static {
        CashbackTariffBadgeStyleDto cashbackTariffBadgeStyleDto = new CashbackTariffBadgeStyleDto("DARK", 0);
        DARK = cashbackTariffBadgeStyleDto;
        CashbackTariffBadgeStyleDto cashbackTariffBadgeStyleDto2 = new CashbackTariffBadgeStyleDto("LIGHT", 1);
        LIGHT = cashbackTariffBadgeStyleDto2;
        CashbackTariffBadgeStyleDto[] cashbackTariffBadgeStyleDtoArr = {cashbackTariffBadgeStyleDto, cashbackTariffBadgeStyleDto2};
        $VALUES = cashbackTariffBadgeStyleDtoArr;
        $ENTRIES = a.a(cashbackTariffBadgeStyleDtoArr);
        Companion = new h49();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(27));
    }

    public static CashbackTariffBadgeStyleDto valueOf(String str) {
        return (CashbackTariffBadgeStyleDto) Enum.valueOf(CashbackTariffBadgeStyleDto.class, str);
    }

    public static CashbackTariffBadgeStyleDto[] values() {
        return (CashbackTariffBadgeStyleDto[]) $VALUES.clone();
    }
}
