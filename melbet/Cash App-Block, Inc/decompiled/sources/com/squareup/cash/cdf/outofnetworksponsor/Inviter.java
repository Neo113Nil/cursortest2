package com.squareup.cash.cdf.outofnetworksponsor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Inviter {
    public static final /* synthetic */ Inviter[] $VALUES;
    public static final Inviter dependent;
    public static final Inviter sponsor;

    static {
        Inviter inviter = new Inviter("dependent", 0);
        dependent = inviter;
        Inviter inviter2 = new Inviter("sponsor", 1);
        sponsor = inviter2;
        $VALUES = new Inviter[]{inviter, inviter2};
    }

    public static Inviter valueOf(String str) {
        return (Inviter) Enum.valueOf(Inviter.class, str);
    }

    public static Inviter[] values() {
        return (Inviter[]) $VALUES.clone();
    }
}
