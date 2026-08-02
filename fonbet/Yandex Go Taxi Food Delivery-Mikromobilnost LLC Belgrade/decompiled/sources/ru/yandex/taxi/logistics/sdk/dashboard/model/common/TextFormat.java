package ru.yandex.taxi.logistics.sdk.dashboard.model.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dashboard/model/common/TextFormat;", "", "PLAIN_TEXT", "MARKDOWN", "base"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextFormat {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextFormat[] $VALUES;
    public static final TextFormat MARKDOWN;
    public static final TextFormat PLAIN_TEXT;

    static {
        TextFormat textFormat = new TextFormat("PLAIN_TEXT", 0);
        PLAIN_TEXT = textFormat;
        TextFormat textFormat2 = new TextFormat("MARKDOWN", 1);
        MARKDOWN = textFormat2;
        TextFormat[] textFormatArr = {textFormat, textFormat2};
        $VALUES = textFormatArr;
        $ENTRIES = a.a(textFormatArr);
    }

    public static TextFormat valueOf(String str) {
        return (TextFormat) Enum.valueOf(TextFormat.class, str);
    }

    public static TextFormat[] values() {
        return (TextFormat[]) $VALUES.clone();
    }
}
