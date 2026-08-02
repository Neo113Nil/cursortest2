package com.yandex.plus.core.benchmark;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o {
    public static final o a;
    public static final o b;
    public static final /* synthetic */ o[] c;

    static {
        o oVar = new o("NOT_STARTED", 0);
        a = oVar;
        o oVar2 = new o("STARTED", 1);
        b = oVar2;
        c = new o[]{oVar, oVar2};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) c.clone();
    }
}
