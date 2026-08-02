package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum v0 {
    CHECKOUT("CHECKOUT"),
    PRESALE("PRESALE"),
    UPSALE("UPSALE"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("CHECKOUT", "PRESALE", "UPSALE").getClass();
    }

    v0(String str) {
        this.a = str;
    }
}
