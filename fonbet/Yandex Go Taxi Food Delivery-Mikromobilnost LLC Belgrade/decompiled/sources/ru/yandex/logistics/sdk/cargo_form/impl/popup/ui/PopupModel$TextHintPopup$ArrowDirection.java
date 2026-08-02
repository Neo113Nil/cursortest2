package ru.yandex.logistics.sdk.cargo_form.impl.popup.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/logistics/sdk/cargo_form/impl/popup/ui/PopupModel$TextHintPopup$ArrowDirection", "", "Lru/yandex/logistics/sdk/cargo_form/impl/popup/ui/PopupModel$TextHintPopup$ArrowDirection;", "TOP", "BOTTOM", "LEFT", "RIGHT", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PopupModel$TextHintPopup$ArrowDirection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PopupModel$TextHintPopup$ArrowDirection[] $VALUES;
    public static final PopupModel$TextHintPopup$ArrowDirection BOTTOM;
    public static final PopupModel$TextHintPopup$ArrowDirection LEFT;
    public static final PopupModel$TextHintPopup$ArrowDirection RIGHT;
    public static final PopupModel$TextHintPopup$ArrowDirection TOP;

    static {
        PopupModel$TextHintPopup$ArrowDirection popupModel$TextHintPopup$ArrowDirection = new PopupModel$TextHintPopup$ArrowDirection("TOP", 0);
        TOP = popupModel$TextHintPopup$ArrowDirection;
        PopupModel$TextHintPopup$ArrowDirection popupModel$TextHintPopup$ArrowDirection2 = new PopupModel$TextHintPopup$ArrowDirection("BOTTOM", 1);
        BOTTOM = popupModel$TextHintPopup$ArrowDirection2;
        PopupModel$TextHintPopup$ArrowDirection popupModel$TextHintPopup$ArrowDirection3 = new PopupModel$TextHintPopup$ArrowDirection("LEFT", 2);
        LEFT = popupModel$TextHintPopup$ArrowDirection3;
        PopupModel$TextHintPopup$ArrowDirection popupModel$TextHintPopup$ArrowDirection4 = new PopupModel$TextHintPopup$ArrowDirection("RIGHT", 3);
        RIGHT = popupModel$TextHintPopup$ArrowDirection4;
        PopupModel$TextHintPopup$ArrowDirection[] popupModel$TextHintPopup$ArrowDirectionArr = {popupModel$TextHintPopup$ArrowDirection, popupModel$TextHintPopup$ArrowDirection2, popupModel$TextHintPopup$ArrowDirection3, popupModel$TextHintPopup$ArrowDirection4};
        $VALUES = popupModel$TextHintPopup$ArrowDirectionArr;
        $ENTRIES = kotlin.enums.a.a(popupModel$TextHintPopup$ArrowDirectionArr);
    }

    public static PopupModel$TextHintPopup$ArrowDirection valueOf(String str) {
        return (PopupModel$TextHintPopup$ArrowDirection) Enum.valueOf(PopupModel$TextHintPopup$ArrowDirection.class, str);
    }

    public static PopupModel$TextHintPopup$ArrowDirection[] values() {
        return (PopupModel$TextHintPopup$ArrowDirection[]) $VALUES.clone();
    }
}
