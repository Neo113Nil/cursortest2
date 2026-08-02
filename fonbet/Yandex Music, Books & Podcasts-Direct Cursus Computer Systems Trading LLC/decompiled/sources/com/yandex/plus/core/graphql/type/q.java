package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum q {
    /* JADX INFO: Fake field, exist only in values array */
    WIDGET("WIDGET"),
    /* JADX INFO: Fake field, exist only in values array */
    WIDGET_GROUP("WIDGET_GROUP"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("WIDGET", "WIDGET_GROUP").getClass();
    }

    q(String str) {
        this.a = str;
    }
}
