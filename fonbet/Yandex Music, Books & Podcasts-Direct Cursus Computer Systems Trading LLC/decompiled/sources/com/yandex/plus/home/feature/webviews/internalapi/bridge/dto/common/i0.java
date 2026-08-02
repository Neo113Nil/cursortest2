package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.g4;
import defpackage.btf;
import defpackage.bwf;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@vhp
/* loaded from: classes5.dex */
public final class i0 {

    @NotNull
    public static final h0 Companion;
    public static final Object a;
    public static final i0 b;
    public static final i0 c;
    public static final i0 d;
    public static final /* synthetic */ i0[] e;

    static {
        i0 i0Var = new i0("SUCCESS", 0);
        b = i0Var;
        i0 i0Var2 = new i0("FAILURE", 1);
        c = i0Var2;
        i0 i0Var3 = new i0("CANCEL", 2);
        d = i0Var3;
        e = new i0[]{i0Var, i0Var2, i0Var3};
        Companion = new h0();
        a = btf.a(bwf.b, new g4(21));
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) e.clone();
    }
}
