package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum j0 {
    ALL("ALL"),
    /* JADX INFO: Fake field, exist only in values array */
    HEAVYWEIGHT_ONLY("HEAVYWEIGHT_ONLY"),
    /* JADX INFO: Fake field, exist only in values array */
    LIGHTWEIGHT_ONLY("LIGHTWEIGHT_ONLY"),
    MAYBE_HEAVY("MAYBE_HEAVY"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("ALL", "HEAVYWEIGHT_ONLY", "LIGHTWEIGHT_ONLY", "MAYBE_HEAVY").getClass();
    }

    j0(String str) {
        this.a = str;
    }
}
