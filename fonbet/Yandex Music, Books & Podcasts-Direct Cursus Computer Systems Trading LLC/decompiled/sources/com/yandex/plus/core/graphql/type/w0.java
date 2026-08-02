package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum w0 {
    /* JADX INFO: Fake field, exist only in values array */
    CHECKOUT("CHECKOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    PRESALE("PRESALE"),
    /* JADX INFO: Fake field, exist only in values array */
    UPSALE("UPSALE"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("CHECKOUT", "PRESALE", "UPSALE").getClass();
    }

    w0(String str) {
        this.a = str;
    }
}
