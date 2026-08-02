package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum v {
    /* JADX INFO: Fake field, exist only in values array */
    MAX_FAMILY_MEMBERS("MAX_FAMILY_MEMBERS"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_REASONS("NO_REASONS"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_REASON("UNKNOWN_REASON"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_HAS_NO_FAMILY("USER_HAS_NO_FAMILY"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_IS_A_FAMILY_CHILD("USER_IS_A_FAMILY_CHILD"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_REGION_IS_NOT_SUPPORTED("USER_REGION_IS_NOT_SUPPORTED"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("MAX_FAMILY_MEMBERS", "NO_REASONS", "UNKNOWN_REASON", "USER_HAS_NO_FAMILY", "USER_IS_A_FAMILY_CHILD", "USER_REGION_IS_NOT_SUPPORTED").getClass();
    }

    v(String str) {
        this.a = str;
    }
}
