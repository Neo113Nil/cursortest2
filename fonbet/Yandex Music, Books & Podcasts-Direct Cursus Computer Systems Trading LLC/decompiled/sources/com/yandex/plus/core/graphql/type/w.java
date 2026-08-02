package com.yandex.plus.core.graphql.type;

import defpackage.u75;

/* loaded from: classes4.dex */
public enum w {
    /* JADX INFO: Fake field, exist only in values array */
    CANCELLED("CANCELLED"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATED("CREATED"),
    CREATED_LEGACY("CREATED_LEGACY"),
    FAILED("FAILED"),
    /* JADX INFO: Fake field, exist only in values array */
    PROVISION_SCHEDULED("PROVISION_SCHEDULED"),
    /* JADX INFO: Fake field, exist only in values array */
    SCHEDULED("SCHEDULED"),
    /* JADX INFO: Fake field, exist only in values array */
    STARTED("STARTED"),
    /* JADX INFO: Fake field, exist only in values array */
    SUCCESS("SUCCESS"),
    /* JADX INFO: Fake field, exist only in values array */
    WAIT_FOR_3DS("WAIT_FOR_3DS"),
    /* JADX INFO: Fake field, exist only in values array */
    WAIT_FOR_NOTIFICATION("WAIT_FOR_NOTIFICATION"),
    WAIT_FOR_SBP("WAIT_FOR_SBP"),
    WAIT_FOR_UZUM("WAIT_FOR_UZUM"),
    UNKNOWN__("UNKNOWN__");

    public static final j b = new j();
    public final String a;

    static {
        u75.h("CANCELLED", "CREATED", "CREATED_LEGACY", "FAILED", "PROVISION_SCHEDULED", "SCHEDULED", "STARTED", "SUCCESS", "WAIT_FOR_3DS", "WAIT_FOR_NOTIFICATION", "WAIT_FOR_SBP", "WAIT_FOR_UZUM").getClass();
    }

    w(String str) {
        this.a = str;
    }
}
