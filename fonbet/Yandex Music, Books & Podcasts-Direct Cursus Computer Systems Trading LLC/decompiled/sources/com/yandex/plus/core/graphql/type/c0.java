package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum c0 {
    /* JADX INFO: Fake field, exist only in values array */
    BOTTOM_LEFT("BOTTOM_LEFT"),
    /* JADX INFO: Fake field, exist only in values array */
    BOTTOM_RIGHT("BOTTOM_RIGHT"),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEFT("TOP_LEFT"),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_RIGHT("TOP_RIGHT"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("BOTTOM_LEFT", "BOTTOM_RIGHT", "TOP_LEFT", "TOP_RIGHT").getClass();
    }

    c0(String str) {
        this.a = str;
    }
}
