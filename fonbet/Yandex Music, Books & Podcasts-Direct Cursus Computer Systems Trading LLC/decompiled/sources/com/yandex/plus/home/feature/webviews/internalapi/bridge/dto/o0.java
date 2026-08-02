package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.btf;
import defpackage.bwf;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@vhp
/* loaded from: classes5.dex */
public final class o0 {

    @NotNull
    public static final n0 Companion;
    public static final Object a;
    public static final o0 b;
    public static final /* synthetic */ o0[] c;

    static {
        o0 o0Var = new o0("BUTTON", 0);
        b = o0Var;
        c = new o0[]{o0Var, new o0("CARD", 1)};
        Companion = new n0();
        a = btf.a(bwf.b, new b0(9));
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) c.clone();
    }
}
