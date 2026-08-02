package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers;

import defpackage.rdb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    public static final com.yandex.plus.home.plaque.animator.internal.utils.a b;
    public static final /* synthetic */ a[] c;
    public static final /* synthetic */ rdb d;
    public final String a;

    static {
        a[] aVarArr = {new a("RETRY", 0, "/retry"), new a("CHANGE_PAYMENT_METHOD", 1, "/change-payment-method")};
        c = aVarArr;
        d = new rdb(aVarArr);
        b = new com.yandex.plus.home.plaque.animator.internal.utils.a();
    }

    public a(String str, int i, String str2) {
        this.a = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) c.clone();
    }
}
