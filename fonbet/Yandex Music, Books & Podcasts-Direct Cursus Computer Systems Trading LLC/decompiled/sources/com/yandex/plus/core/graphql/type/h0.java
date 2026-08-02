package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum h0 {
    /* JADX INFO: Fake field, exist only in values array */
    AUTO("AUTO"),
    RESTRICTED("RESTRICTED"),
    UNRESTRICTED("UNRESTRICTED"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("AUTO", "RESTRICTED", "UNRESTRICTED").getClass();
    }

    h0(String str) {
        this.a = str;
    }
}
