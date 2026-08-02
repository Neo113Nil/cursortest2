package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum y {
    /* JADX INFO: Fake field, exist only in values array */
    LINK("LINK"),
    /* JADX INFO: Fake field, exist only in values array */
    TEXT("TEXT"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("LINK", "TEXT").getClass();
    }

    y(String str) {
        this.a = str;
    }
}
