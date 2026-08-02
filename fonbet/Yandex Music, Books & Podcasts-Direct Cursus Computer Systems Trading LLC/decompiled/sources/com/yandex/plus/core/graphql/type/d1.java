package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum d1 {
    /* JADX INFO: Fake field, exist only in values array */
    BOTTOM("BOTTOM"),
    /* JADX INFO: Fake field, exist only in values array */
    CENTER("CENTER"),
    /* JADX INFO: Fake field, exist only in values array */
    TOP("TOP"),
    UNKNOWN__("UNKNOWN__");

    public static final a1 b = new a1(2);
    public final String a;

    static {
        u75.h("BOTTOM", "CENTER", "TOP").getClass();
    }

    d1(String str) {
        this.a = str;
    }
}
