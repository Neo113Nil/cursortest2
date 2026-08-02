package com.yandex.plus.pay.repository.api.model.offers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m1 {
    public static final m1 a;
    public static final m1 b;
    public static final /* synthetic */ m1[] c;

    static {
        m1 m1Var = new m1("ADDITION", 0);
        a = m1Var;
        m1 m1Var2 = new m1("REPLACE", 1);
        b = m1Var2;
        c = new m1[]{m1Var, m1Var2};
    }

    public static m1 valueOf(String str) {
        return (m1) Enum.valueOf(m1.class, str);
    }

    public static m1[] values() {
        return (m1[]) c.clone();
    }
}
