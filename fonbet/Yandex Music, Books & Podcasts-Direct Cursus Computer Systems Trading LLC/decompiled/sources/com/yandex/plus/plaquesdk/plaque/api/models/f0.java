package com.yandex.plus.plaquesdk.plaque.api.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f0 {
    public static final f0 a;
    public static final f0 b;
    public static final /* synthetic */ f0[] c;

    static {
        f0 f0Var = new f0("LEFT", 0);
        a = f0Var;
        f0 f0Var2 = new f0("RIGHT", 1);
        b = f0Var2;
        c = new f0[]{f0Var, f0Var2};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) c.clone();
    }
}
