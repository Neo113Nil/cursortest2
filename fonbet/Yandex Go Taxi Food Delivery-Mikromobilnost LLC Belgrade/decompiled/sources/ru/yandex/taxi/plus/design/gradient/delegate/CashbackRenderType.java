package ru.yandex.taxi.plus.design.gradient.delegate;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/plus/design/gradient/delegate/CashbackRenderType;", "", "DEFAULT", "BADGE", "plus_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CashbackRenderType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CashbackRenderType[] $VALUES;
    public static final CashbackRenderType BADGE;
    public static final CashbackRenderType DEFAULT;

    static {
        CashbackRenderType cashbackRenderType = new CashbackRenderType("DEFAULT", 0);
        DEFAULT = cashbackRenderType;
        CashbackRenderType cashbackRenderType2 = new CashbackRenderType("BADGE", 1);
        BADGE = cashbackRenderType2;
        CashbackRenderType[] cashbackRenderTypeArr = {cashbackRenderType, cashbackRenderType2};
        $VALUES = cashbackRenderTypeArr;
        $ENTRIES = a.a(cashbackRenderTypeArr);
    }

    public static CashbackRenderType valueOf(String str) {
        return (CashbackRenderType) Enum.valueOf(CashbackRenderType.class, str);
    }

    public static CashbackRenderType[] values() {
        return (CashbackRenderType[]) $VALUES.clone();
    }
}
