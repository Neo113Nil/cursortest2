package ru.yandex.taxi.cashback.models.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.r66;
import defpackage.w39;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/cashback/models/response/CashbackInactiveTariffBadgeStyleDto;", "", "Companion", "w39", "DEFAULT", "GRAY", "DISABLED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CashbackInactiveTariffBadgeStyleDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CashbackInactiveTariffBadgeStyleDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final w39 Companion;
    public static final CashbackInactiveTariffBadgeStyleDto DEFAULT;
    public static final CashbackInactiveTariffBadgeStyleDto DISABLED;
    public static final CashbackInactiveTariffBadgeStyleDto GRAY;

    static {
        CashbackInactiveTariffBadgeStyleDto cashbackInactiveTariffBadgeStyleDto = new CashbackInactiveTariffBadgeStyleDto("DEFAULT", 0);
        DEFAULT = cashbackInactiveTariffBadgeStyleDto;
        CashbackInactiveTariffBadgeStyleDto cashbackInactiveTariffBadgeStyleDto2 = new CashbackInactiveTariffBadgeStyleDto("GRAY", 1);
        GRAY = cashbackInactiveTariffBadgeStyleDto2;
        CashbackInactiveTariffBadgeStyleDto cashbackInactiveTariffBadgeStyleDto3 = new CashbackInactiveTariffBadgeStyleDto("DISABLED", 2);
        DISABLED = cashbackInactiveTariffBadgeStyleDto3;
        CashbackInactiveTariffBadgeStyleDto[] cashbackInactiveTariffBadgeStyleDtoArr = {cashbackInactiveTariffBadgeStyleDto, cashbackInactiveTariffBadgeStyleDto2, cashbackInactiveTariffBadgeStyleDto3};
        $VALUES = cashbackInactiveTariffBadgeStyleDtoArr;
        $ENTRIES = a.a(cashbackInactiveTariffBadgeStyleDtoArr);
        Companion = new w39();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(24));
    }

    public static CashbackInactiveTariffBadgeStyleDto valueOf(String str) {
        return (CashbackInactiveTariffBadgeStyleDto) Enum.valueOf(CashbackInactiveTariffBadgeStyleDto.class, str);
    }

    public static CashbackInactiveTariffBadgeStyleDto[] values() {
        return (CashbackInactiveTariffBadgeStyleDto[]) $VALUES.clone();
    }
}
