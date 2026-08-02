package ru.yandex.logistics.sdk.cargo_form.impl.model.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/logistics/sdk/cargo_form/impl/model/common/TapAction$ModalAction$ModalType", "", "Lru/yandex/logistics/sdk/cargo_form/impl/model/common/TapAction$ModalAction$ModalType;", "OVER_FORM", "OVER_MAP", "OVER_CAMERA", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TapAction$ModalAction$ModalType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TapAction$ModalAction$ModalType[] $VALUES;
    public static final TapAction$ModalAction$ModalType OVER_CAMERA;
    public static final TapAction$ModalAction$ModalType OVER_FORM;
    public static final TapAction$ModalAction$ModalType OVER_MAP;

    static {
        TapAction$ModalAction$ModalType tapAction$ModalAction$ModalType = new TapAction$ModalAction$ModalType("OVER_FORM", 0);
        OVER_FORM = tapAction$ModalAction$ModalType;
        TapAction$ModalAction$ModalType tapAction$ModalAction$ModalType2 = new TapAction$ModalAction$ModalType("OVER_MAP", 1);
        OVER_MAP = tapAction$ModalAction$ModalType2;
        TapAction$ModalAction$ModalType tapAction$ModalAction$ModalType3 = new TapAction$ModalAction$ModalType("OVER_CAMERA", 2);
        OVER_CAMERA = tapAction$ModalAction$ModalType3;
        TapAction$ModalAction$ModalType[] tapAction$ModalAction$ModalTypeArr = {tapAction$ModalAction$ModalType, tapAction$ModalAction$ModalType2, tapAction$ModalAction$ModalType3};
        $VALUES = tapAction$ModalAction$ModalTypeArr;
        $ENTRIES = a.a(tapAction$ModalAction$ModalTypeArr);
    }

    public static TapAction$ModalAction$ModalType valueOf(String str) {
        return (TapAction$ModalAction$ModalType) Enum.valueOf(TapAction$ModalAction$ModalType.class, str);
    }

    public static TapAction$ModalAction$ModalType[] values() {
        return (TapAction$ModalAction$ModalType[]) $VALUES.clone();
    }
}
