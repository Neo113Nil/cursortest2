package ru.yandex.logistics.sdk.cargo_form.impl.model.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/model/common/Align;", "", "LEADING", "CENTER", "TRAILING", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Align {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Align[] $VALUES;
    public static final Align CENTER;
    public static final Align LEADING;
    public static final Align TRAILING;

    static {
        Align align = new Align("LEADING", 0);
        LEADING = align;
        Align align2 = new Align("CENTER", 1);
        CENTER = align2;
        Align align3 = new Align("TRAILING", 2);
        TRAILING = align3;
        Align[] alignArr = {align, align2, align3};
        $VALUES = alignArr;
        $ENTRIES = a.a(alignArr);
    }

    public static Align valueOf(String str) {
        return (Align) Enum.valueOf(Align.class, str);
    }

    public static Align[] values() {
        return (Align[]) $VALUES.clone();
    }
}
