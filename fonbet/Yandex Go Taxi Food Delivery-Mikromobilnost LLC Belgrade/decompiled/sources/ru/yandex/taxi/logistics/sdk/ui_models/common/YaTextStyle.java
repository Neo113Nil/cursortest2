package ru.yandex.taxi.logistics.sdk.ui_models.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui_models/common/YaTextStyle;", "", "TITLE1", "TITLE2", "TITLE3", "TITLE4", "BODY1", "BODY2", "CAPTION1", "CAPTION2", "sdk-ui-models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class YaTextStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YaTextStyle[] $VALUES;
    public static final YaTextStyle BODY1;
    public static final YaTextStyle BODY2;
    public static final YaTextStyle CAPTION1;
    public static final YaTextStyle CAPTION2;
    public static final YaTextStyle TITLE1;
    public static final YaTextStyle TITLE2;
    public static final YaTextStyle TITLE3;
    public static final YaTextStyle TITLE4;

    static {
        YaTextStyle yaTextStyle = new YaTextStyle("TITLE1", 0);
        TITLE1 = yaTextStyle;
        YaTextStyle yaTextStyle2 = new YaTextStyle("TITLE2", 1);
        TITLE2 = yaTextStyle2;
        YaTextStyle yaTextStyle3 = new YaTextStyle("TITLE3", 2);
        TITLE3 = yaTextStyle3;
        YaTextStyle yaTextStyle4 = new YaTextStyle("TITLE4", 3);
        TITLE4 = yaTextStyle4;
        YaTextStyle yaTextStyle5 = new YaTextStyle("BODY1", 4);
        BODY1 = yaTextStyle5;
        YaTextStyle yaTextStyle6 = new YaTextStyle("BODY2", 5);
        BODY2 = yaTextStyle6;
        YaTextStyle yaTextStyle7 = new YaTextStyle("CAPTION1", 6);
        CAPTION1 = yaTextStyle7;
        YaTextStyle yaTextStyle8 = new YaTextStyle("CAPTION2", 7);
        CAPTION2 = yaTextStyle8;
        YaTextStyle[] yaTextStyleArr = {yaTextStyle, yaTextStyle2, yaTextStyle3, yaTextStyle4, yaTextStyle5, yaTextStyle6, yaTextStyle7, yaTextStyle8};
        $VALUES = yaTextStyleArr;
        $ENTRIES = a.a(yaTextStyleArr);
    }

    public static YaTextStyle valueOf(String str) {
        return (YaTextStyle) Enum.valueOf(YaTextStyle.class, str);
    }

    public static YaTextStyle[] values() {
        return (YaTextStyle[]) $VALUES.clone();
    }
}
