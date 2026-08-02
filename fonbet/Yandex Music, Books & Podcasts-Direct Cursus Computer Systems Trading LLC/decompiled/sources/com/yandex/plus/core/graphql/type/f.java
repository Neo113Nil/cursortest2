package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum f {
    /* JADX INFO: Fake field, exist only in values array */
    EQ("EQ"),
    /* JADX INFO: Fake field, exist only in values array */
    GT("GT"),
    /* JADX INFO: Fake field, exist only in values array */
    GTE("GTE"),
    /* JADX INFO: Fake field, exist only in values array */
    LT("LT"),
    /* JADX INFO: Fake field, exist only in values array */
    LTE("LTE"),
    UNKNOWN__("UNKNOWN__");

    public static final com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a b = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
    public final String a;

    static {
        u75.h("EQ", "GT", "GTE", "LT", "LTE").getClass();
    }

    f(String str) {
        this.a = str;
    }
}
