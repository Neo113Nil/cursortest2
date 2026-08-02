package ru.yandex.taxi.analytics;

import defpackage.g5c;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/analytics/ModalViewCloseReason;", "Lg5c;", "", "BACK_PRESSED", "SLIDE_OUT", "TOUCH_OUTSIDE", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ModalViewCloseReason implements g5c {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ModalViewCloseReason[] $VALUES;
    public static final ModalViewCloseReason BACK_PRESSED;
    public static final ModalViewCloseReason SLIDE_OUT;
    public static final ModalViewCloseReason TOUCH_OUTSIDE;

    static {
        ModalViewCloseReason modalViewCloseReason = new ModalViewCloseReason("BACK_PRESSED", 0);
        BACK_PRESSED = modalViewCloseReason;
        ModalViewCloseReason modalViewCloseReason2 = new ModalViewCloseReason("SLIDE_OUT", 1);
        SLIDE_OUT = modalViewCloseReason2;
        ModalViewCloseReason modalViewCloseReason3 = new ModalViewCloseReason("TOUCH_OUTSIDE", 2);
        TOUCH_OUTSIDE = modalViewCloseReason3;
        ModalViewCloseReason[] modalViewCloseReasonArr = {modalViewCloseReason, modalViewCloseReason2, modalViewCloseReason3};
        $VALUES = modalViewCloseReasonArr;
        $ENTRIES = a.a(modalViewCloseReasonArr);
    }

    public static ModalViewCloseReason valueOf(String str) {
        return (ModalViewCloseReason) Enum.valueOf(ModalViewCloseReason.class, str);
    }

    public static ModalViewCloseReason[] values() {
        return (ModalViewCloseReason[]) $VALUES.clone();
    }
}
