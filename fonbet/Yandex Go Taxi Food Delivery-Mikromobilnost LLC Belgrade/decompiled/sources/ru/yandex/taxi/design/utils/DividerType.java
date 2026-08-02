package ru.yandex.taxi.design.utils;

import defpackage.hrl;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/design/utils/DividerType;", "", "Companion", "hrl", "NORMAL", "ICON", "ICON_MARGIN", JCP.RAW_PREFIX, "MARGIN", "ICON_HALF_MARGIN", "MARGIN_0_75", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DividerType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DividerType[] $VALUES;
    public static final hrl Companion;
    public static final DividerType ICON;
    public static final DividerType ICON_HALF_MARGIN;
    public static final DividerType ICON_MARGIN;
    public static final DividerType MARGIN;
    public static final DividerType MARGIN_0_75;
    public static final DividerType NONE;
    public static final DividerType NORMAL;

    static {
        DividerType dividerType = new DividerType("NORMAL", 0);
        NORMAL = dividerType;
        DividerType dividerType2 = new DividerType("ICON", 1);
        ICON = dividerType2;
        DividerType dividerType3 = new DividerType("ICON_MARGIN", 2);
        ICON_MARGIN = dividerType3;
        DividerType dividerType4 = new DividerType(JCP.RAW_PREFIX, 3);
        NONE = dividerType4;
        DividerType dividerType5 = new DividerType("MARGIN", 4);
        MARGIN = dividerType5;
        DividerType dividerType6 = new DividerType("ICON_HALF_MARGIN", 5);
        ICON_HALF_MARGIN = dividerType6;
        DividerType dividerType7 = new DividerType("MARGIN_0_75", 6);
        MARGIN_0_75 = dividerType7;
        DividerType[] dividerTypeArr = {dividerType, dividerType2, dividerType3, dividerType4, dividerType5, dividerType6, dividerType7};
        $VALUES = dividerTypeArr;
        $ENTRIES = kotlin.enums.a.a(dividerTypeArr);
        Companion = new hrl();
    }

    public static DividerType valueOf(String str) {
        return (DividerType) Enum.valueOf(DividerType.class, str);
    }

    public static DividerType[] values() {
        return (DividerType[]) $VALUES.clone();
    }
}
