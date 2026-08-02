package ru.yandex.taxi.address.clarification;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/address/clarification/AddressClarificationCloseReason;", "", "MOVE_PIN_OUT_AREA", "BACK_PRESSED", "DONE_PRESSED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressClarificationCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressClarificationCloseReason[] $VALUES;
    public static final AddressClarificationCloseReason BACK_PRESSED;
    public static final AddressClarificationCloseReason DONE_PRESSED;
    public static final AddressClarificationCloseReason MOVE_PIN_OUT_AREA;

    static {
        AddressClarificationCloseReason addressClarificationCloseReason = new AddressClarificationCloseReason("MOVE_PIN_OUT_AREA", 0);
        MOVE_PIN_OUT_AREA = addressClarificationCloseReason;
        AddressClarificationCloseReason addressClarificationCloseReason2 = new AddressClarificationCloseReason("BACK_PRESSED", 1);
        BACK_PRESSED = addressClarificationCloseReason2;
        AddressClarificationCloseReason addressClarificationCloseReason3 = new AddressClarificationCloseReason("DONE_PRESSED", 2);
        DONE_PRESSED = addressClarificationCloseReason3;
        AddressClarificationCloseReason[] addressClarificationCloseReasonArr = {addressClarificationCloseReason, addressClarificationCloseReason2, addressClarificationCloseReason3};
        $VALUES = addressClarificationCloseReasonArr;
        $ENTRIES = kotlin.enums.a.a(addressClarificationCloseReasonArr);
    }

    public static AddressClarificationCloseReason valueOf(String str) {
        return (AddressClarificationCloseReason) Enum.valueOf(AddressClarificationCloseReason.class, str);
    }

    public static AddressClarificationCloseReason[] values() {
        return (AddressClarificationCloseReason[]) $VALUES.clone();
    }
}
