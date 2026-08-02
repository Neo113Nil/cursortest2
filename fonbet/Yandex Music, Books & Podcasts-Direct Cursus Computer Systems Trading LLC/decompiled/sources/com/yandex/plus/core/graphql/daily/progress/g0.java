package com.yandex.plus.core.graphql.daily.progress;

import defpackage.btf;
import defpackage.bwf;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@vhp
/* loaded from: classes4.dex */
public final class g0 {

    @NotNull
    public static final f0 Companion;
    public static final Object a;
    public static final g0 b;
    public static final g0 c;
    public static final /* synthetic */ g0[] d;

    static {
        g0 g0Var = new g0("TEXT_ICON_PROPERTIES", 0);
        b = g0Var;
        g0 g0Var2 = new g0("STYLED_TEXT_PROPERTIES", 1);
        c = g0Var2;
        d = new g0[]{g0Var, g0Var2};
        Companion = new f0();
        a = btf.a(bwf.b, new s(3));
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) d.clone();
    }
}
