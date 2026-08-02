package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.btf;
import defpackage.bwf;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@vhp
/* loaded from: classes5.dex */
public final class b1 {

    @NotNull
    public static final a1 Companion;
    public static final Object a;
    public static final b1 b;
    public static final b1 c;
    public static final b1 d;
    public static final /* synthetic */ b1[] e;

    static {
        b1 b1Var = new b1("NEXT", 0);
        b = b1Var;
        b1 b1Var2 = new b1("PREV", 1);
        c = b1Var2;
        b1 b1Var3 = new b1("UNDEFINED", 2);
        d = b1Var3;
        e = new b1[]{b1Var, b1Var2, b1Var3};
        Companion = new a1();
        a = btf.a(bwf.b, new b0(18));
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) e.clone();
    }
}
