package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum e0 {
    ANDROID("ANDROID"),
    /* JADX INFO: Fake field, exist only in values array */
    IOS("IOS"),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_DESKTOP("WEB_DESKTOP"),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_TOUCH("WEB_TOUCH"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("ANDROID", "IOS", "WEB_DESKTOP", "WEB_TOUCH").getClass();
    }

    e0(String str) {
        this.a = str;
    }
}
