package ru.yandex.logistics.sdk.cargo_form.core.api.models.modal;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/core/api/models/modal/ModalViewType;", "", "OVER_FORM", "OVER_MAP", "OVER_CAMERA", "UNKNOWN", "core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ModalViewType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ModalViewType[] $VALUES;
    public static final ModalViewType OVER_CAMERA;
    public static final ModalViewType OVER_FORM;
    public static final ModalViewType OVER_MAP;
    public static final ModalViewType UNKNOWN;

    static {
        ModalViewType modalViewType = new ModalViewType("OVER_FORM", 0);
        OVER_FORM = modalViewType;
        ModalViewType modalViewType2 = new ModalViewType("OVER_MAP", 1);
        OVER_MAP = modalViewType2;
        ModalViewType modalViewType3 = new ModalViewType("OVER_CAMERA", 2);
        OVER_CAMERA = modalViewType3;
        ModalViewType modalViewType4 = new ModalViewType("UNKNOWN", 3);
        UNKNOWN = modalViewType4;
        ModalViewType[] modalViewTypeArr = {modalViewType, modalViewType2, modalViewType3, modalViewType4};
        $VALUES = modalViewTypeArr;
        $ENTRIES = a.a(modalViewTypeArr);
    }

    public static ModalViewType valueOf(String str) {
        return (ModalViewType) Enum.valueOf(ModalViewType.class, str);
    }

    public static ModalViewType[] values() {
        return (ModalViewType[]) $VALUES.clone();
    }
}
