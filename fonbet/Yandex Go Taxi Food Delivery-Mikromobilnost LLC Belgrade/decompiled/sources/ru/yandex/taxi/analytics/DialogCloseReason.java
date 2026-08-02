package ru.yandex.taxi.analytics;

import defpackage.g5c;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/analytics/DialogCloseReason;", "Lg5c;", "", "BUTTON_TAPPED", "BACK_PRESSED", "TOUCH_OUTSIDE", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DialogCloseReason implements g5c {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DialogCloseReason[] $VALUES;
    public static final DialogCloseReason BACK_PRESSED;
    public static final DialogCloseReason BUTTON_TAPPED;
    public static final DialogCloseReason TOUCH_OUTSIDE;

    static {
        DialogCloseReason dialogCloseReason = new DialogCloseReason("BUTTON_TAPPED", 0);
        BUTTON_TAPPED = dialogCloseReason;
        DialogCloseReason dialogCloseReason2 = new DialogCloseReason("BACK_PRESSED", 1);
        BACK_PRESSED = dialogCloseReason2;
        DialogCloseReason dialogCloseReason3 = new DialogCloseReason("TOUCH_OUTSIDE", 2);
        TOUCH_OUTSIDE = dialogCloseReason3;
        DialogCloseReason[] dialogCloseReasonArr = {dialogCloseReason, dialogCloseReason2, dialogCloseReason3};
        $VALUES = dialogCloseReasonArr;
        $ENTRIES = a.a(dialogCloseReasonArr);
    }

    public static DialogCloseReason valueOf(String str) {
        return (DialogCloseReason) Enum.valueOf(DialogCloseReason.class, str);
    }

    public static DialogCloseReason[] values() {
        return (DialogCloseReason[]) $VALUES.clone();
    }
}
