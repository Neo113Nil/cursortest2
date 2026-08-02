package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum o0 {
    /* JADX INFO: Fake field, exist only in values array */
    acquisitionPlatform("acquisitionPlatform"),
    /* JADX INFO: Fake field, exist only in values array */
    host("host"),
    /* JADX INFO: Fake field, exist only in values array */
    nativeWidget("nativeWidget"),
    /* JADX INFO: Fake field, exist only in values array */
    webWidget("webWidget"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("acquisitionPlatform", "host", "nativeWidget", "webWidget").getClass();
    }

    o0(String str) {
        this.a = str;
    }
}
