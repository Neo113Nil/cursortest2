package com.yandex.plus.pay.internal.feature.offers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k {
    public static final /* synthetic */ k[] a = {new k("DEFAULT", 0), new k("PRESALE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    k EF5;

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) a.clone();
    }
}
