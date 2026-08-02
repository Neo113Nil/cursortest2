package ru.yandex.taxi.appdelegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/appdelegates/SupportedOrderType;", "", "TAXI", "EATS", "DRIVE", "LINKED", "LOGISTICS", "SCOOTERS", "CHARGERS", "NAVIGATION", "MULTIMODAL", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SupportedOrderType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SupportedOrderType[] $VALUES;
    public static final SupportedOrderType CHARGERS;
    public static final SupportedOrderType DRIVE;
    public static final SupportedOrderType EATS;
    public static final SupportedOrderType LINKED;
    public static final SupportedOrderType LOGISTICS;
    public static final SupportedOrderType MULTIMODAL;
    public static final SupportedOrderType NAVIGATION;
    public static final SupportedOrderType SCOOTERS;
    public static final SupportedOrderType TAXI;

    static {
        SupportedOrderType supportedOrderType = new SupportedOrderType("TAXI", 0);
        TAXI = supportedOrderType;
        SupportedOrderType supportedOrderType2 = new SupportedOrderType("EATS", 1);
        EATS = supportedOrderType2;
        SupportedOrderType supportedOrderType3 = new SupportedOrderType("DRIVE", 2);
        DRIVE = supportedOrderType3;
        SupportedOrderType supportedOrderType4 = new SupportedOrderType("LINKED", 3);
        LINKED = supportedOrderType4;
        SupportedOrderType supportedOrderType5 = new SupportedOrderType("LOGISTICS", 4);
        LOGISTICS = supportedOrderType5;
        SupportedOrderType supportedOrderType6 = new SupportedOrderType("SCOOTERS", 5);
        SCOOTERS = supportedOrderType6;
        SupportedOrderType supportedOrderType7 = new SupportedOrderType("CHARGERS", 6);
        CHARGERS = supportedOrderType7;
        SupportedOrderType supportedOrderType8 = new SupportedOrderType("NAVIGATION", 7);
        NAVIGATION = supportedOrderType8;
        SupportedOrderType supportedOrderType9 = new SupportedOrderType("MULTIMODAL", 8);
        MULTIMODAL = supportedOrderType9;
        SupportedOrderType[] supportedOrderTypeArr = {supportedOrderType, supportedOrderType2, supportedOrderType3, supportedOrderType4, supportedOrderType5, supportedOrderType6, supportedOrderType7, supportedOrderType8, supportedOrderType9};
        $VALUES = supportedOrderTypeArr;
        $ENTRIES = a.a(supportedOrderTypeArr);
    }

    public static SupportedOrderType valueOf(String str) {
        return (SupportedOrderType) Enum.valueOf(SupportedOrderType.class, str);
    }

    public static SupportedOrderType[] values() {
        return (SupportedOrderType[]) $VALUES.clone();
    }
}
