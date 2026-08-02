package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum r {
    /* JADX INFO: Fake field, exist only in values array */
    CHARGE_FULL_PRICE("CHARGE_FULL_PRICE"),
    /* JADX INFO: Fake field, exist only in values array */
    DEFERRED("DEFERRED"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("CHARGE_FULL_PRICE", "DEFERRED").getClass();
    }

    r(String str) {
        this.a = str;
    }
}
