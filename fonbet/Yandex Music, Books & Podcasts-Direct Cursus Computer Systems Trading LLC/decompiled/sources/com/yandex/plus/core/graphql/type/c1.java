package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum c1 {
    ALLOW("ALLOW"),
    REFUSE("REFUSE"),
    UNKNOWN__("UNKNOWN__");

    public static final a1 b = new a1(1);
    public final String a;

    static {
        u75.h("ALLOW", "REFUSE").getClass();
    }

    c1(String str) {
        this.a = str;
    }
}
