package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum y0 {
    /* JADX INFO: Fake field, exist only in values array */
    SYNCHRONIZATION_IN_PROGRESS("SYNCHRONIZATION_IN_PROGRESS"),
    /* JADX INFO: Fake field, exist only in values array */
    SYNCHRONIZED("SYNCHRONIZED"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("SYNCHRONIZATION_IN_PROGRESS", "SYNCHRONIZED").getClass();
    }

    y0(String str) {
        this.a = str;
    }
}
