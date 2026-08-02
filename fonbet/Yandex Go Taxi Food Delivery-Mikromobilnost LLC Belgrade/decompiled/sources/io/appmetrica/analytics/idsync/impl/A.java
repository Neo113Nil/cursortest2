package io.appmetrica.analytics.idsync.impl;

import com.yandex.payment.common.result.ResultType;

/* loaded from: classes4.dex */
public enum A {
    NONE("none"),
    SUCCESS("success"),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_PRECONDITION("incompatible_precondition"),
    FAILURE(ResultType.RESULT_TYPE_FAILURE);

    public static final z b = new z();
    public final String a;

    A(String str) {
        this.a = str;
    }
}
