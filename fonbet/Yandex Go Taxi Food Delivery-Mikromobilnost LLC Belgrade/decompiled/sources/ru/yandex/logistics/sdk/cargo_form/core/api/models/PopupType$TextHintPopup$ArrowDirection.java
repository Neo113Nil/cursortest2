package ru.yandex.logistics.sdk.cargo_form.core.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/logistics/sdk/cargo_form/core/api/models/PopupType$TextHintPopup$ArrowDirection", "", "Lru/yandex/logistics/sdk/cargo_form/core/api/models/PopupType$TextHintPopup$ArrowDirection;", "TOP", "BOTTOM", "LEFT", "RIGHT", "core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PopupType$TextHintPopup$ArrowDirection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PopupType$TextHintPopup$ArrowDirection[] $VALUES;
    public static final PopupType$TextHintPopup$ArrowDirection BOTTOM;
    public static final PopupType$TextHintPopup$ArrowDirection LEFT;
    public static final PopupType$TextHintPopup$ArrowDirection RIGHT;
    public static final PopupType$TextHintPopup$ArrowDirection TOP;

    static {
        PopupType$TextHintPopup$ArrowDirection popupType$TextHintPopup$ArrowDirection = new PopupType$TextHintPopup$ArrowDirection("TOP", 0);
        TOP = popupType$TextHintPopup$ArrowDirection;
        PopupType$TextHintPopup$ArrowDirection popupType$TextHintPopup$ArrowDirection2 = new PopupType$TextHintPopup$ArrowDirection("BOTTOM", 1);
        BOTTOM = popupType$TextHintPopup$ArrowDirection2;
        PopupType$TextHintPopup$ArrowDirection popupType$TextHintPopup$ArrowDirection3 = new PopupType$TextHintPopup$ArrowDirection("LEFT", 2);
        LEFT = popupType$TextHintPopup$ArrowDirection3;
        PopupType$TextHintPopup$ArrowDirection popupType$TextHintPopup$ArrowDirection4 = new PopupType$TextHintPopup$ArrowDirection("RIGHT", 3);
        RIGHT = popupType$TextHintPopup$ArrowDirection4;
        PopupType$TextHintPopup$ArrowDirection[] popupType$TextHintPopup$ArrowDirectionArr = {popupType$TextHintPopup$ArrowDirection, popupType$TextHintPopup$ArrowDirection2, popupType$TextHintPopup$ArrowDirection3, popupType$TextHintPopup$ArrowDirection4};
        $VALUES = popupType$TextHintPopup$ArrowDirectionArr;
        $ENTRIES = a.a(popupType$TextHintPopup$ArrowDirectionArr);
    }

    public static PopupType$TextHintPopup$ArrowDirection valueOf(String str) {
        return (PopupType$TextHintPopup$ArrowDirection) Enum.valueOf(PopupType$TextHintPopup$ArrowDirection.class, str);
    }

    public static PopupType$TextHintPopup$ArrowDirection[] values() {
        return (PopupType$TextHintPopup$ArrowDirection[]) $VALUES.clone();
    }
}
