package ru.yandex.logistics.sdk.cargo_form.impl.model.widget;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/model/widget/VerticalContentAlignment;", "", "TOP", "CENTER", "BOTTOM", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerticalContentAlignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VerticalContentAlignment[] $VALUES;
    public static final VerticalContentAlignment BOTTOM;
    public static final VerticalContentAlignment CENTER;
    public static final VerticalContentAlignment TOP;

    static {
        VerticalContentAlignment verticalContentAlignment = new VerticalContentAlignment("TOP", 0);
        TOP = verticalContentAlignment;
        VerticalContentAlignment verticalContentAlignment2 = new VerticalContentAlignment("CENTER", 1);
        CENTER = verticalContentAlignment2;
        VerticalContentAlignment verticalContentAlignment3 = new VerticalContentAlignment("BOTTOM", 2);
        BOTTOM = verticalContentAlignment3;
        VerticalContentAlignment[] verticalContentAlignmentArr = {verticalContentAlignment, verticalContentAlignment2, verticalContentAlignment3};
        $VALUES = verticalContentAlignmentArr;
        $ENTRIES = a.a(verticalContentAlignmentArr);
    }

    public static VerticalContentAlignment valueOf(String str) {
        return (VerticalContentAlignment) Enum.valueOf(VerticalContentAlignment.class, str);
    }

    public static VerticalContentAlignment[] values() {
        return (VerticalContentAlignment[]) $VALUES.clone();
    }
}
