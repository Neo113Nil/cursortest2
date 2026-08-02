package ru.yandex.logistics.sdk.cargo_form.impl.model.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/model/common/IconPosition;", "", "LEAD", "TRAIL", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IconPosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IconPosition[] $VALUES;
    public static final IconPosition LEAD;
    public static final IconPosition TRAIL;

    static {
        IconPosition iconPosition = new IconPosition("LEAD", 0);
        LEAD = iconPosition;
        IconPosition iconPosition2 = new IconPosition("TRAIL", 1);
        TRAIL = iconPosition2;
        IconPosition[] iconPositionArr = {iconPosition, iconPosition2};
        $VALUES = iconPositionArr;
        $ENTRIES = a.a(iconPositionArr);
    }

    public static IconPosition valueOf(String str) {
        return (IconPosition) Enum.valueOf(IconPosition.class, str);
    }

    public static IconPosition[] values() {
        return (IconPosition[]) $VALUES.clone();
    }
}
