package ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/ai_widgets/data/TextFont;", "", "BOLD", "REGULAR", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextFont {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextFont[] $VALUES;
    public static final TextFont BOLD;
    public static final TextFont REGULAR;

    static {
        TextFont textFont = new TextFont("BOLD", 0);
        BOLD = textFont;
        TextFont textFont2 = new TextFont("REGULAR", 1);
        REGULAR = textFont2;
        TextFont[] textFontArr = {textFont, textFont2};
        $VALUES = textFontArr;
        $ENTRIES = kotlin.enums.a.a(textFontArr);
    }

    public static TextFont valueOf(String str) {
        return (TextFont) Enum.valueOf(TextFont.class, str);
    }

    public static TextFont[] values() {
        return (TextFont[]) $VALUES.clone();
    }
}
