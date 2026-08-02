package ru.yandex.taxi.logistics.sdk.dashboard.model.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dashboard/model/common/TileStyle;", "", "REGULAR", "IMAGE", "base"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TileStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TileStyle[] $VALUES;
    public static final TileStyle IMAGE;
    public static final TileStyle REGULAR;

    static {
        TileStyle tileStyle = new TileStyle("REGULAR", 0);
        REGULAR = tileStyle;
        TileStyle tileStyle2 = new TileStyle("IMAGE", 1);
        IMAGE = tileStyle2;
        TileStyle[] tileStyleArr = {tileStyle, tileStyle2};
        $VALUES = tileStyleArr;
        $ENTRIES = a.a(tileStyleArr);
    }

    public static TileStyle valueOf(String str) {
        return (TileStyle) Enum.valueOf(TileStyle.class, str);
    }

    public static TileStyle[] values() {
        return (TileStyle[]) $VALUES.clone();
    }
}
