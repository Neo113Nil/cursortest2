package com.squareup.cash.cdf.offers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Origin {
    public static final /* synthetic */ Origin[] $VALUES;
    public static final Origin AFTERPAY_APPLET;
    public static final Origin DISCO;

    /* JADX INFO: Fake field, exist only in values array */
    Origin EF0;

    static {
        Origin origin = new Origin("CARDTAB", 0);
        Origin origin2 = new Origin("DISCO", 1);
        DISCO = origin2;
        Origin origin3 = new Origin("AFTERPAY_APPLET", 2);
        AFTERPAY_APPLET = origin3;
        $VALUES = new Origin[]{origin, origin2, origin3, new Origin("ACTIVITY", 3)};
    }

    public static Origin valueOf(String str) {
        return (Origin) Enum.valueOf(Origin.class, str);
    }

    public static Origin[] values() {
        return (Origin[]) $VALUES.clone();
    }
}
