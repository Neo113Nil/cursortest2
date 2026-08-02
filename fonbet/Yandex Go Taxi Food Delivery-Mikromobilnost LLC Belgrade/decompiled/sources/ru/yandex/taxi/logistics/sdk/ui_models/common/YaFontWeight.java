package ru.yandex.taxi.logistics.sdk.ui_models.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui_models/common/YaFontWeight;", "", "LIGHT", "NORMAL", "MEDIUM", "BOLD", "EXTRA_BOLD", "sdk-ui-models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class YaFontWeight {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YaFontWeight[] $VALUES;
    public static final YaFontWeight BOLD;
    public static final YaFontWeight EXTRA_BOLD;
    public static final YaFontWeight LIGHT;
    public static final YaFontWeight MEDIUM;
    public static final YaFontWeight NORMAL;

    static {
        YaFontWeight yaFontWeight = new YaFontWeight("LIGHT", 0);
        LIGHT = yaFontWeight;
        YaFontWeight yaFontWeight2 = new YaFontWeight("NORMAL", 1);
        NORMAL = yaFontWeight2;
        YaFontWeight yaFontWeight3 = new YaFontWeight("MEDIUM", 2);
        MEDIUM = yaFontWeight3;
        YaFontWeight yaFontWeight4 = new YaFontWeight("BOLD", 3);
        BOLD = yaFontWeight4;
        YaFontWeight yaFontWeight5 = new YaFontWeight("EXTRA_BOLD", 4);
        EXTRA_BOLD = yaFontWeight5;
        YaFontWeight[] yaFontWeightArr = {yaFontWeight, yaFontWeight2, yaFontWeight3, yaFontWeight4, yaFontWeight5};
        $VALUES = yaFontWeightArr;
        $ENTRIES = a.a(yaFontWeightArr);
    }

    public static YaFontWeight valueOf(String str) {
        return (YaFontWeight) Enum.valueOf(YaFontWeight.class, str);
    }

    public static YaFontWeight[] values() {
        return (YaFontWeight[]) $VALUES.clone();
    }
}
