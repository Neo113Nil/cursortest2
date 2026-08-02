package ru.yandex.logistics.sdk.cargo_form.impl.model.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/logistics/sdk/cargo_form/impl/model/common/SlotTrailModel$TrailButton$TrailButtonStyle", "", "Lru/yandex/logistics/sdk/cargo_form/impl/model/common/SlotTrailModel$TrailButton$TrailButtonStyle;", "MAIN", "OUTLINE", "MINOR", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SlotTrailModel$TrailButton$TrailButtonStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlotTrailModel$TrailButton$TrailButtonStyle[] $VALUES;
    public static final SlotTrailModel$TrailButton$TrailButtonStyle MAIN;
    public static final SlotTrailModel$TrailButton$TrailButtonStyle MINOR;
    public static final SlotTrailModel$TrailButton$TrailButtonStyle OUTLINE;

    static {
        SlotTrailModel$TrailButton$TrailButtonStyle slotTrailModel$TrailButton$TrailButtonStyle = new SlotTrailModel$TrailButton$TrailButtonStyle("MAIN", 0);
        MAIN = slotTrailModel$TrailButton$TrailButtonStyle;
        SlotTrailModel$TrailButton$TrailButtonStyle slotTrailModel$TrailButton$TrailButtonStyle2 = new SlotTrailModel$TrailButton$TrailButtonStyle("OUTLINE", 1);
        OUTLINE = slotTrailModel$TrailButton$TrailButtonStyle2;
        SlotTrailModel$TrailButton$TrailButtonStyle slotTrailModel$TrailButton$TrailButtonStyle3 = new SlotTrailModel$TrailButton$TrailButtonStyle("MINOR", 2);
        MINOR = slotTrailModel$TrailButton$TrailButtonStyle3;
        SlotTrailModel$TrailButton$TrailButtonStyle[] slotTrailModel$TrailButton$TrailButtonStyleArr = {slotTrailModel$TrailButton$TrailButtonStyle, slotTrailModel$TrailButton$TrailButtonStyle2, slotTrailModel$TrailButton$TrailButtonStyle3};
        $VALUES = slotTrailModel$TrailButton$TrailButtonStyleArr;
        $ENTRIES = a.a(slotTrailModel$TrailButton$TrailButtonStyleArr);
    }

    public static SlotTrailModel$TrailButton$TrailButtonStyle valueOf(String str) {
        return (SlotTrailModel$TrailButton$TrailButtonStyle) Enum.valueOf(SlotTrailModel$TrailButton$TrailButtonStyle.class, str);
    }

    public static SlotTrailModel$TrailButton$TrailButtonStyle[] values() {
        return (SlotTrailModel$TrailButton$TrailButtonStyle[]) $VALUES.clone();
    }
}
