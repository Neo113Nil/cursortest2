package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum r0 {
    DARK("DARK"),
    LIGHT("LIGHT"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("DARK", "LIGHT").getClass();
    }

    r0(String str) {
        this.a = str;
    }
}
