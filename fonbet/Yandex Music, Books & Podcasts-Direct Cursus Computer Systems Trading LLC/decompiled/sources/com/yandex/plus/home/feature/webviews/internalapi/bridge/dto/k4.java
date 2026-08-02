package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.btf;
import defpackage.bwf;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@vhp
/* loaded from: classes5.dex */
public final class k4 {

    @NotNull
    public static final j4 Companion;
    public static final Object a;
    public static final k4 b;
    public static final /* synthetic */ k4[] c;

    static {
        k4 k4Var = new k4("DEEPLINK", 0);
        b = k4Var;
        c = new k4[]{k4Var, new k4("WEBLINK", 1)};
        Companion = new j4();
        a = btf.a(bwf.b, new g4(1));
    }

    public static k4 valueOf(String str) {
        return (k4) Enum.valueOf(k4.class, str);
    }

    public static k4[] values() {
        return (k4[]) c.clone();
    }
}
