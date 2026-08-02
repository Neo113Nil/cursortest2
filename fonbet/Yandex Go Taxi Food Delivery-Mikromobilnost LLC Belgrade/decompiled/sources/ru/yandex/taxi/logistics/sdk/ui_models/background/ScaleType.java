package ru.yandex.taxi.logistics.sdk.ui_models.background;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui_models/background/ScaleType;", "", "ASPECT_FILL", "SCALE_TO_FILL", "ASPECT_FIT", JCP.RAW_PREFIX, "sdk-ui-models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScaleType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScaleType[] $VALUES;
    public static final ScaleType ASPECT_FILL;
    public static final ScaleType ASPECT_FIT;
    public static final ScaleType NONE;
    public static final ScaleType SCALE_TO_FILL;

    static {
        ScaleType scaleType = new ScaleType("ASPECT_FILL", 0);
        ASPECT_FILL = scaleType;
        ScaleType scaleType2 = new ScaleType("SCALE_TO_FILL", 1);
        SCALE_TO_FILL = scaleType2;
        ScaleType scaleType3 = new ScaleType("ASPECT_FIT", 2);
        ASPECT_FIT = scaleType3;
        ScaleType scaleType4 = new ScaleType(JCP.RAW_PREFIX, 3);
        NONE = scaleType4;
        ScaleType[] scaleTypeArr = {scaleType, scaleType2, scaleType3, scaleType4};
        $VALUES = scaleTypeArr;
        $ENTRIES = a.a(scaleTypeArr);
    }

    public static ScaleType valueOf(String str) {
        return (ScaleType) Enum.valueOf(ScaleType.class, str);
    }

    public static ScaleType[] values() {
        return (ScaleType[]) $VALUES.clone();
    }
}
