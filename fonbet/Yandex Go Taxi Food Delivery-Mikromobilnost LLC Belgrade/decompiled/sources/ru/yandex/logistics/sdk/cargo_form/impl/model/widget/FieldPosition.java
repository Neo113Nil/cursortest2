package ru.yandex.logistics.sdk.cargo_form.impl.model.widget;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/model/widget/FieldPosition;", "", "TITLE", "SUBTITLE", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FieldPosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FieldPosition[] $VALUES;
    public static final FieldPosition SUBTITLE;
    public static final FieldPosition TITLE;

    static {
        FieldPosition fieldPosition = new FieldPosition("TITLE", 0);
        TITLE = fieldPosition;
        FieldPosition fieldPosition2 = new FieldPosition("SUBTITLE", 1);
        SUBTITLE = fieldPosition2;
        FieldPosition[] fieldPositionArr = {fieldPosition, fieldPosition2};
        $VALUES = fieldPositionArr;
        $ENTRIES = a.a(fieldPositionArr);
    }

    public static FieldPosition valueOf(String str) {
        return (FieldPosition) Enum.valueOf(FieldPosition.class, str);
    }

    public static FieldPosition[] values() {
        return (FieldPosition[]) $VALUES.clone();
    }
}
