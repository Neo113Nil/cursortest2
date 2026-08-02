package ru.yandex.taxi.logistics.sdk.ui.theme.fonts;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui/theme/fonts/TextMetaStyle;", "", "HeadlineTitle1", "HeadlineTitle2", "HeadlineTitle3", "HeadlineTitle4", "HeadlineTitle5", "sdk-ui-theme"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextMetaStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextMetaStyle[] $VALUES;
    public static final TextMetaStyle HeadlineTitle1;
    public static final TextMetaStyle HeadlineTitle2;
    public static final TextMetaStyle HeadlineTitle3;
    public static final TextMetaStyle HeadlineTitle4;
    public static final TextMetaStyle HeadlineTitle5;

    static {
        TextMetaStyle textMetaStyle = new TextMetaStyle("HeadlineTitle1", 0);
        HeadlineTitle1 = textMetaStyle;
        TextMetaStyle textMetaStyle2 = new TextMetaStyle("HeadlineTitle2", 1);
        HeadlineTitle2 = textMetaStyle2;
        TextMetaStyle textMetaStyle3 = new TextMetaStyle("HeadlineTitle3", 2);
        HeadlineTitle3 = textMetaStyle3;
        TextMetaStyle textMetaStyle4 = new TextMetaStyle("HeadlineTitle4", 3);
        HeadlineTitle4 = textMetaStyle4;
        TextMetaStyle textMetaStyle5 = new TextMetaStyle("HeadlineTitle5", 4);
        HeadlineTitle5 = textMetaStyle5;
        TextMetaStyle[] textMetaStyleArr = {textMetaStyle, textMetaStyle2, textMetaStyle3, textMetaStyle4, textMetaStyle5};
        $VALUES = textMetaStyleArr;
        $ENTRIES = a.a(textMetaStyleArr);
    }

    public static TextMetaStyle valueOf(String str) {
        return (TextMetaStyle) Enum.valueOf(TextMetaStyle.class, str);
    }

    public static TextMetaStyle[] values() {
        return (TextMetaStyle[]) $VALUES.clone();
    }
}
