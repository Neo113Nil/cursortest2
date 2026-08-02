package ru.yandex.taxi.net.taxi.dto.request;

import defpackage.cmw0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.xlw0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/net/taxi/dto/request/SupportedOptionType;", "", "Companion", "cmw0", "VERTICALS_MULTICLASS", "ORDER_FLOW_DELIVERY", "REQUIREMENT_V2", "PLUS_CASH_BACK_PROMO", "TOLL_ROADS_V2", "MULTICLASS_REQUIREMENTS", "VERTICAL_SUMMARY", "MULTICLASS_PREORDER", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SupportedOptionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SupportedOptionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final cmw0 Companion;
    public static final SupportedOptionType MULTICLASS_PREORDER;
    public static final SupportedOptionType MULTICLASS_REQUIREMENTS;
    public static final SupportedOptionType ORDER_FLOW_DELIVERY;
    public static final SupportedOptionType PLUS_CASH_BACK_PROMO;
    public static final SupportedOptionType REQUIREMENT_V2;
    public static final SupportedOptionType TOLL_ROADS_V2;
    public static final SupportedOptionType VERTICALS_MULTICLASS;
    public static final SupportedOptionType VERTICAL_SUMMARY;

    static {
        SupportedOptionType supportedOptionType = new SupportedOptionType("VERTICALS_MULTICLASS", 0);
        VERTICALS_MULTICLASS = supportedOptionType;
        SupportedOptionType supportedOptionType2 = new SupportedOptionType("ORDER_FLOW_DELIVERY", 1);
        ORDER_FLOW_DELIVERY = supportedOptionType2;
        SupportedOptionType supportedOptionType3 = new SupportedOptionType("REQUIREMENT_V2", 2);
        REQUIREMENT_V2 = supportedOptionType3;
        SupportedOptionType supportedOptionType4 = new SupportedOptionType("PLUS_CASH_BACK_PROMO", 3);
        PLUS_CASH_BACK_PROMO = supportedOptionType4;
        SupportedOptionType supportedOptionType5 = new SupportedOptionType("TOLL_ROADS_V2", 4);
        TOLL_ROADS_V2 = supportedOptionType5;
        SupportedOptionType supportedOptionType6 = new SupportedOptionType("MULTICLASS_REQUIREMENTS", 5);
        MULTICLASS_REQUIREMENTS = supportedOptionType6;
        SupportedOptionType supportedOptionType7 = new SupportedOptionType("VERTICAL_SUMMARY", 6);
        VERTICAL_SUMMARY = supportedOptionType7;
        SupportedOptionType supportedOptionType8 = new SupportedOptionType("MULTICLASS_PREORDER", 7);
        MULTICLASS_PREORDER = supportedOptionType8;
        SupportedOptionType[] supportedOptionTypeArr = {supportedOptionType, supportedOptionType2, supportedOptionType3, supportedOptionType4, supportedOptionType5, supportedOptionType6, supportedOptionType7, supportedOptionType8};
        $VALUES = supportedOptionTypeArr;
        $ENTRIES = kotlin.enums.a.a(supportedOptionTypeArr);
        Companion = new cmw0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlw0(1));
    }

    public static SupportedOptionType valueOf(String str) {
        return (SupportedOptionType) Enum.valueOf(SupportedOptionType.class, str);
    }

    public static SupportedOptionType[] values() {
        return (SupportedOptionType[]) $VALUES.clone();
    }
}
