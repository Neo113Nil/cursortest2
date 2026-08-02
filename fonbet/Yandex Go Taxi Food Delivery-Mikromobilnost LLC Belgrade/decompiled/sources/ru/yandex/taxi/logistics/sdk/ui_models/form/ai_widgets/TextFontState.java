package ru.yandex.taxi.logistics.sdk.ui_models.form.ai_widgets;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui_models/form/ai_widgets/TextFontState;", "", "BOLD", "REGULAR", "sdk-ui-models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextFontState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextFontState[] $VALUES;
    public static final TextFontState BOLD;
    public static final TextFontState REGULAR;

    static {
        TextFontState textFontState = new TextFontState("BOLD", 0);
        BOLD = textFontState;
        TextFontState textFontState2 = new TextFontState("REGULAR", 1);
        REGULAR = textFontState2;
        TextFontState[] textFontStateArr = {textFontState, textFontState2};
        $VALUES = textFontStateArr;
        $ENTRIES = a.a(textFontStateArr);
    }

    public static TextFontState valueOf(String str) {
        return (TextFontState) Enum.valueOf(TextFontState.class, str);
    }

    public static TextFontState[] values() {
        return (TextFontState[]) $VALUES.clone();
    }
}
