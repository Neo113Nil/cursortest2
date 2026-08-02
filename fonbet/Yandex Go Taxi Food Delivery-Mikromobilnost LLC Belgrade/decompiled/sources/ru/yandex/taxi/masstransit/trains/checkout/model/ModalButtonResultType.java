package ru.yandex.taxi.masstransit.trains.checkout.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/trains/checkout/model/ModalButtonResultType;", "", "OPEN_PAYMENT_METHODS_ACTION", "CLOSE_ACTION", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ModalButtonResultType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ModalButtonResultType[] $VALUES;
    public static final ModalButtonResultType CLOSE_ACTION;
    public static final ModalButtonResultType OPEN_PAYMENT_METHODS_ACTION;
    public static final ModalButtonResultType UNKNOWN;

    static {
        ModalButtonResultType modalButtonResultType = new ModalButtonResultType("OPEN_PAYMENT_METHODS_ACTION", 0);
        OPEN_PAYMENT_METHODS_ACTION = modalButtonResultType;
        ModalButtonResultType modalButtonResultType2 = new ModalButtonResultType("CLOSE_ACTION", 1);
        CLOSE_ACTION = modalButtonResultType2;
        ModalButtonResultType modalButtonResultType3 = new ModalButtonResultType("UNKNOWN", 2);
        UNKNOWN = modalButtonResultType3;
        ModalButtonResultType[] modalButtonResultTypeArr = {modalButtonResultType, modalButtonResultType2, modalButtonResultType3};
        $VALUES = modalButtonResultTypeArr;
        $ENTRIES = kotlin.enums.a.a(modalButtonResultTypeArr);
    }

    public static ModalButtonResultType valueOf(String str) {
        return (ModalButtonResultType) Enum.valueOf(ModalButtonResultType.class, str);
    }

    public static ModalButtonResultType[] values() {
        return (ModalButtonResultType[]) $VALUES.clone();
    }
}
