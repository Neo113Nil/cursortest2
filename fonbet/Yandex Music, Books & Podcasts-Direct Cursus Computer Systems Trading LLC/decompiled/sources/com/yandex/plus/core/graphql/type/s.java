package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum s {
    /* JADX INFO: Fake field, exist only in values array */
    LINEAR("LINEAR"),
    /* JADX INFO: Fake field, exist only in values array */
    RADIAL("RADIAL"),
    /* JADX INFO: Fake field, exist only in values array */
    TRANSPARENT("TRANSPARENT"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("LINEAR", "RADIAL", "TRANSPARENT").getClass();
    }

    s(String str) {
        this.a = str;
    }
}
