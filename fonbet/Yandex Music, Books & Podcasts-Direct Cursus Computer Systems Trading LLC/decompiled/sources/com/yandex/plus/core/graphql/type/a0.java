package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum a0 {
    /* JADX INFO: Fake field, exist only in values array */
    APP_STORE("APP_STORE"),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY("GOOGLE_PLAY"),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSOFT_STORE("MICROSOFT_STORE"),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_YANDEX("NATIVE_YANDEX"),
    /* JADX INFO: Fake field, exist only in values array */
    PARTNER("PARTNER"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("UNKNOWN"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("APP_STORE", "GOOGLE_PLAY", "MICROSOFT_STORE", "NATIVE_YANDEX", "PARTNER", "UNKNOWN").getClass();
    }

    a0(String str) {
        this.a = str;
    }
}
