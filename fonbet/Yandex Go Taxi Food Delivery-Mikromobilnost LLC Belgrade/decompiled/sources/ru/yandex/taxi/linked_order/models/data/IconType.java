package ru.yandex.taxi.linked_order.models.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/linked_order/models/data/IconType;", "", "C2C", "B2C", "AMBULANCE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IconType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IconType[] $VALUES;
    public static final IconType AMBULANCE;
    public static final IconType B2C;
    public static final IconType C2C;

    static {
        IconType iconType = new IconType("C2C", 0);
        C2C = iconType;
        IconType iconType2 = new IconType("B2C", 1);
        B2C = iconType2;
        IconType iconType3 = new IconType("AMBULANCE", 2);
        AMBULANCE = iconType3;
        IconType[] iconTypeArr = {iconType, iconType2, iconType3};
        $VALUES = iconTypeArr;
        $ENTRIES = a.a(iconTypeArr);
    }

    public static IconType valueOf(String str) {
        return (IconType) Enum.valueOf(IconType.class, str);
    }

    public static IconType[] values() {
        return (IconType[]) $VALUES.clone();
    }
}
