package ru.yandex.taxi.delivery.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.v5r;
import defpackage.y6s;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/delivery/experiments/FormType;", "", "Companion", "y6s", "SHORT", "REDUCED", "FULL", "MINIMAL", "UNKNOWN", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FormType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final y6s Companion;
    public static final FormType FULL;
    public static final FormType MINIMAL;
    public static final FormType REDUCED;
    public static final FormType SHORT;
    public static final FormType UNKNOWN;

    static {
        FormType formType = new FormType("SHORT", 0);
        SHORT = formType;
        FormType formType2 = new FormType("REDUCED", 1);
        REDUCED = formType2;
        FormType formType3 = new FormType("FULL", 2);
        FULL = formType3;
        FormType formType4 = new FormType("MINIMAL", 3);
        MINIMAL = formType4;
        FormType formType5 = new FormType("UNKNOWN", 4);
        UNKNOWN = formType5;
        FormType[] formTypeArr = {formType, formType2, formType3, formType4, formType5};
        $VALUES = formTypeArr;
        $ENTRIES = kotlin.enums.a.a(formTypeArr);
        Companion = new y6s();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v5r(16));
    }

    public static FormType valueOf(String str) {
        return (FormType) Enum.valueOf(FormType.class, str);
    }

    public static FormType[] values() {
        return (FormType[]) $VALUES.clone();
    }
}
