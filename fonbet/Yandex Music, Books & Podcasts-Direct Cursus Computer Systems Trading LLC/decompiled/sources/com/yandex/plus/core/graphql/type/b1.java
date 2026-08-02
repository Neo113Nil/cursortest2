package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum b1 {
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("DIRECT"),
    /* JADX INFO: Fake field, exist only in values array */
    INVERTED("INVERTED"),
    UNKNOWN__("UNKNOWN__");

    public static final a1 b = new a1(0);
    public final String a;

    static {
        u75.h("DIRECT", "INVERTED").getClass();
    }

    b1(String str) {
        this.a = str;
    }
}
