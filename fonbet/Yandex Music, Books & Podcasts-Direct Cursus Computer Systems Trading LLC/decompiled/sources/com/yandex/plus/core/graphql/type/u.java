package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum u {
    /* JADX INFO: Fake field, exist only in values array */
    CENTER("CENTER"),
    /* JADX INFO: Fake field, exist only in values array */
    LEFT("LEFT"),
    /* JADX INFO: Fake field, exist only in values array */
    RIGHT("RIGHT"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("CENTER", "LEFT", "RIGHT").getClass();
    }

    u(String str) {
        this.a = str;
    }
}
