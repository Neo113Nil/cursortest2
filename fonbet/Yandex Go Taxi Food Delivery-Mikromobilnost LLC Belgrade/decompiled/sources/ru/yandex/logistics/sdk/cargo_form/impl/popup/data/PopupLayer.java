package ru.yandex.logistics.sdk.cargo_form.impl.popup.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/popup/data/PopupLayer;", "", "CONTENT", "OVERLAY", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PopupLayer {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PopupLayer[] $VALUES;
    public static final PopupLayer CONTENT;
    public static final PopupLayer OVERLAY;

    static {
        PopupLayer popupLayer = new PopupLayer("CONTENT", 0);
        CONTENT = popupLayer;
        PopupLayer popupLayer2 = new PopupLayer("OVERLAY", 1);
        OVERLAY = popupLayer2;
        PopupLayer[] popupLayerArr = {popupLayer, popupLayer2};
        $VALUES = popupLayerArr;
        $ENTRIES = a.a(popupLayerArr);
    }

    public static PopupLayer valueOf(String str) {
        return (PopupLayer) Enum.valueOf(PopupLayer.class, str);
    }

    public static PopupLayer[] values() {
        return (PopupLayer[]) $VALUES.clone();
    }
}
