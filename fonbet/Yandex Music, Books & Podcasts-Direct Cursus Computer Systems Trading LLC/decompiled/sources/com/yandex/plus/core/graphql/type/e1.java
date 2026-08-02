package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum e1 {
    /* JADX INFO: Fake field, exist only in values array */
    BALANCE("BALANCE"),
    /* JADX INFO: Fake field, exist only in values array */
    BUTTON("BUTTON"),
    /* JADX INFO: Fake field, exist only in values array */
    ICON("ICON"),
    /* JADX INFO: Fake field, exist only in values array */
    SPACER("SPACER"),
    /* JADX INFO: Fake field, exist only in values array */
    SWITCH("SWITCH"),
    /* JADX INFO: Fake field, exist only in values array */
    TEXT("TEXT"),
    UNKNOWN__("UNKNOWN__");

    public static final a1 b = new a1(3);
    public final String a;

    static {
        u75.h("BALANCE", "BUTTON", "ICON", "SPACER", "SWITCH", "TEXT").getClass();
    }

    e1(String str) {
        this.a = str;
    }
}
