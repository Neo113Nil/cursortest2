package ru.yandex.taxi.common_models.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/common_models/ui/TextStyle;", "", "DEFAULT", "ACCENT", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextStyle[] $VALUES;
    public static final TextStyle ACCENT;
    public static final TextStyle DEFAULT;

    static {
        TextStyle textStyle = new TextStyle("DEFAULT", 0);
        DEFAULT = textStyle;
        TextStyle textStyle2 = new TextStyle("ACCENT", 1);
        ACCENT = textStyle2;
        TextStyle[] textStyleArr = {textStyle, textStyle2};
        $VALUES = textStyleArr;
        $ENTRIES = a.a(textStyleArr);
    }

    public static TextStyle valueOf(String str) {
        return (TextStyle) Enum.valueOf(TextStyle.class, str);
    }

    public static TextStyle[] values() {
        return (TextStyle[]) $VALUES.clone();
    }
}
