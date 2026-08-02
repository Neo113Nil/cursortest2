package ru.yandex.taxi.address.repository;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/address/repository/IconType;", "", "DOTS", "MAN_WITH_FLAG", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IconType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IconType[] $VALUES;
    public static final IconType DOTS;
    public static final IconType MAN_WITH_FLAG;

    static {
        IconType iconType = new IconType("DOTS", 0);
        DOTS = iconType;
        IconType iconType2 = new IconType("MAN_WITH_FLAG", 1);
        MAN_WITH_FLAG = iconType2;
        IconType[] iconTypeArr = {iconType, iconType2};
        $VALUES = iconTypeArr;
        $ENTRIES = kotlin.enums.a.a(iconTypeArr);
    }

    public static IconType valueOf(String str) {
        return (IconType) Enum.valueOf(IconType.class, str);
    }

    public static IconType[] values() {
        return (IconType[]) $VALUES.clone();
    }
}
