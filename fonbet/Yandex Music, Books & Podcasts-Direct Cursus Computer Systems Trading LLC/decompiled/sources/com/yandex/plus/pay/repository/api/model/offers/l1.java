package com.yandex.plus.pay.repository.api.model.offers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class l1 {
    public static final l1 a;
    public static final l1 b;
    public static final l1 c;
    public static final /* synthetic */ l1[] d;

    static {
        l1 l1Var = new l1("CHECKOUT", 0);
        a = l1Var;
        l1 l1Var2 = new l1("UPSALE", 1);
        b = l1Var2;
        l1 l1Var3 = new l1("PRESALE", 2);
        c = l1Var3;
        d = new l1[]{l1Var, l1Var2, l1Var3};
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) d.clone();
    }
}
