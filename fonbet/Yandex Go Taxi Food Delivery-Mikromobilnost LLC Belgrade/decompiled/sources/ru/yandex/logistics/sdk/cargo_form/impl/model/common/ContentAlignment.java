package ru.yandex.logistics.sdk.cargo_form.impl.model.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/model/common/ContentAlignment;", "", "LEADING", "CENTER", "TRAILING", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContentAlignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ContentAlignment[] $VALUES;
    public static final ContentAlignment CENTER;
    public static final ContentAlignment LEADING;
    public static final ContentAlignment TRAILING;

    static {
        ContentAlignment contentAlignment = new ContentAlignment("LEADING", 0);
        LEADING = contentAlignment;
        ContentAlignment contentAlignment2 = new ContentAlignment("CENTER", 1);
        CENTER = contentAlignment2;
        ContentAlignment contentAlignment3 = new ContentAlignment("TRAILING", 2);
        TRAILING = contentAlignment3;
        ContentAlignment[] contentAlignmentArr = {contentAlignment, contentAlignment2, contentAlignment3};
        $VALUES = contentAlignmentArr;
        $ENTRIES = a.a(contentAlignmentArr);
    }

    public static ContentAlignment valueOf(String str) {
        return (ContentAlignment) Enum.valueOf(ContentAlignment.class, str);
    }

    public static ContentAlignment[] values() {
        return (ContentAlignment[]) $VALUES.clone();
    }
}
