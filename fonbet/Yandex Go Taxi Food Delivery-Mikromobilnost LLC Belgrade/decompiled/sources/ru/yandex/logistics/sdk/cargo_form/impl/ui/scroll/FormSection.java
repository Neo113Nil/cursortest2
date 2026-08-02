package ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/ui/scroll/FormSection;", "", "TOP", "MAIN", "BOTTOM", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormSection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FormSection[] $VALUES;
    public static final FormSection BOTTOM;
    public static final FormSection MAIN;
    public static final FormSection TOP;

    static {
        FormSection formSection = new FormSection("TOP", 0);
        TOP = formSection;
        FormSection formSection2 = new FormSection("MAIN", 1);
        MAIN = formSection2;
        FormSection formSection3 = new FormSection("BOTTOM", 2);
        BOTTOM = formSection3;
        FormSection[] formSectionArr = {formSection, formSection2, formSection3};
        $VALUES = formSectionArr;
        $ENTRIES = kotlin.enums.a.a(formSectionArr);
    }

    public static FormSection valueOf(String str) {
        return (FormSection) Enum.valueOf(FormSection.class, str);
    }

    public static FormSection[] values() {
        return (FormSection[]) $VALUES.clone();
    }
}
