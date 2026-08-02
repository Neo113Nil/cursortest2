package com.squareup.cash.cdf.notificationssettings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ConfirmationSheetOrigin {
    public static final /* synthetic */ ConfirmationSheetOrigin[] $VALUES;
    public static final ConfirmationSheetOrigin CHANNEL;
    public static final ConfirmationSheetOrigin CONTACT_METHOD;
    public static final ConfirmationSheetOrigin INITIAL_PROMPT;

    static {
        ConfirmationSheetOrigin confirmationSheetOrigin = new ConfirmationSheetOrigin("INITIAL_PROMPT", 0);
        INITIAL_PROMPT = confirmationSheetOrigin;
        ConfirmationSheetOrigin confirmationSheetOrigin2 = new ConfirmationSheetOrigin("CONTACT_METHOD", 1);
        CONTACT_METHOD = confirmationSheetOrigin2;
        ConfirmationSheetOrigin confirmationSheetOrigin3 = new ConfirmationSheetOrigin("CHANNEL", 2);
        CHANNEL = confirmationSheetOrigin3;
        $VALUES = new ConfirmationSheetOrigin[]{confirmationSheetOrigin, confirmationSheetOrigin2, confirmationSheetOrigin3};
    }

    public static ConfirmationSheetOrigin valueOf(String str) {
        return (ConfirmationSheetOrigin) Enum.valueOf(ConfirmationSheetOrigin.class, str);
    }

    public static ConfirmationSheetOrigin[] values() {
        return (ConfirmationSheetOrigin[]) $VALUES.clone();
    }
}
