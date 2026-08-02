package ru.yandex.logistics.sdk.cargo_form.impl.model.widget;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/model/widget/TextAlignment;", "", "LEADING", "CENTER", "TRAILING", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextAlignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextAlignment[] $VALUES;
    public static final TextAlignment CENTER;
    public static final TextAlignment LEADING;
    public static final TextAlignment TRAILING;

    static {
        TextAlignment textAlignment = new TextAlignment("LEADING", 0);
        LEADING = textAlignment;
        TextAlignment textAlignment2 = new TextAlignment("CENTER", 1);
        CENTER = textAlignment2;
        TextAlignment textAlignment3 = new TextAlignment("TRAILING", 2);
        TRAILING = textAlignment3;
        TextAlignment[] textAlignmentArr = {textAlignment, textAlignment2, textAlignment3};
        $VALUES = textAlignmentArr;
        $ENTRIES = a.a(textAlignmentArr);
    }

    public static TextAlignment valueOf(String str) {
        return (TextAlignment) Enum.valueOf(TextAlignment.class, str);
    }

    public static TextAlignment[] values() {
        return (TextAlignment[]) $VALUES.clone();
    }
}
