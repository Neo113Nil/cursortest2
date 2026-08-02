package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum p {
    /* JADX INFO: Fake field, exist only in values array */
    APP("APP"),
    /* JADX INFO: Fake field, exist only in values array */
    DESKTOP("DESKTOP"),
    /* JADX INFO: Fake field, exist only in values array */
    PAD("PAD"),
    /* JADX INFO: Fake field, exist only in values array */
    TOUCH("TOUCH"),
    /* JADX INFO: Fake field, exist only in values array */
    TV("TV"),
    /* JADX INFO: Fake field, exist only in values array */
    TVAPP("TVAPP"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("APP", "DESKTOP", "PAD", "TOUCH", "TV", "TVAPP").getClass();
    }

    p(String str) {
        this.a = str;
    }
}
