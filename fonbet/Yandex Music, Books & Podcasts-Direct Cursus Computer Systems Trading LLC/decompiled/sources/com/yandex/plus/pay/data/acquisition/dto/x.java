package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.btf;
import defpackage.bwf;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@vhp
/* loaded from: classes5.dex */
public final class x {

    @NotNull
    public static final w Companion;
    public static final Object a;
    public static final x b;
    public static final /* synthetic */ x[] c;

    /* JADX INFO: Fake field, exist only in values array */
    x EF0;

    static {
        x xVar = new x("GOOGLE_PLAY", 0);
        x xVar2 = new x("NATIVE_YANDEX", 1);
        x xVar3 = new x("UNKNOWN", 2);
        b = xVar3;
        c = new x[]{xVar, xVar2, xVar3};
        Companion = new w();
        a = btf.a(bwf.b, new f(6));
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) c.clone();
    }
}
