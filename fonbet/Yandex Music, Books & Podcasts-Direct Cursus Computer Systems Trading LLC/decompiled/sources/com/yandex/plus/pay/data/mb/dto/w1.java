package com.yandex.plus.pay.data.mb.dto;

import defpackage.btf;
import defpackage.bwf;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@vhp
/* loaded from: classes5.dex */
public final class w1 {

    @NotNull
    public static final v1 Companion;
    public static final Object a;
    public static final w1 b;
    public static final /* synthetic */ w1[] c;

    /* JADX INFO: Fake field, exist only in values array */
    w1 EF0;

    static {
        w1 w1Var = new w1("PARENT", 0);
        w1 w1Var2 = new w1("CHILD", 1);
        w1 w1Var3 = new w1("NONE", 2);
        b = w1Var3;
        c = new w1[]{w1Var, w1Var2, w1Var3};
        Companion = new v1();
        a = btf.a(bwf.b, new c1(7));
    }

    public static w1 valueOf(String str) {
        return (w1) Enum.valueOf(w1.class, str);
    }

    public static w1[] values() {
        return (w1[]) c.clone();
    }
}
