package ru.yandex.logistics.sdk.cargo_form.impl.model.widget;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/model/widget/Style;", "", "FLOATING", "GHOST", "MAIN", "MINOR", "OUTLINE", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Style {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Style[] $VALUES;
    public static final Style FLOATING;
    public static final Style GHOST;
    public static final Style MAIN;
    public static final Style MINOR;
    public static final Style OUTLINE;

    static {
        Style style = new Style("FLOATING", 0);
        FLOATING = style;
        Style style2 = new Style("GHOST", 1);
        GHOST = style2;
        Style style3 = new Style("MAIN", 2);
        MAIN = style3;
        Style style4 = new Style("MINOR", 3);
        MINOR = style4;
        Style style5 = new Style("OUTLINE", 4);
        OUTLINE = style5;
        Style[] styleArr = {style, style2, style3, style4, style5};
        $VALUES = styleArr;
        $ENTRIES = a.a(styleArr);
    }

    public static Style valueOf(String str) {
        return (Style) Enum.valueOf(Style.class, str);
    }

    public static Style[] values() {
        return (Style[]) $VALUES.clone();
    }
}
