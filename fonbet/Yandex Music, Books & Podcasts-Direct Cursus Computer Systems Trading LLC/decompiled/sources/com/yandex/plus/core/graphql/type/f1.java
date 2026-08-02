package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum f1 {
    /* JADX INFO: Fake field, exist only in values array */
    FILL("FILL"),
    /* JADX INFO: Fake field, exist only in values array */
    FIT("FIT"),
    /* JADX INFO: Fake field, exist only in values array */
    FIX("FIX"),
    UNKNOWN__("UNKNOWN__");

    public static final a1 b = new a1(4);
    public final String a;

    static {
        u75.h("FILL", "FIT", "FIX").getClass();
    }

    f1(String str) {
        this.a = str;
    }
}
