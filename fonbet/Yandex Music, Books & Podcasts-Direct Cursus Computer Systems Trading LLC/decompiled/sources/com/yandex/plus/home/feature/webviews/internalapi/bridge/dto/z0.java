package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.btf;
import defpackage.bwf;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@vhp
/* loaded from: classes5.dex */
public final class z0 {

    @NotNull
    public static final y0 Companion;
    public static final Object a;
    public static final z0 b;
    public static final z0 c;
    public static final /* synthetic */ z0[] d;

    static {
        z0 z0Var = new z0("SWIPE", 0);
        b = z0Var;
        z0 z0Var2 = new z0("TAP", 1);
        c = z0Var2;
        d = new z0[]{z0Var, z0Var2};
        Companion = new y0();
        a = btf.a(bwf.b, new b0(17));
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) d.clone();
    }
}
