package com.yandex.passport.internal.links;

import defpackage.rdb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class h {
    public static final h b;
    public static final h c;
    public static final h d;
    public static final /* synthetic */ h[] e;
    public static final /* synthetic */ rdb f;
    public final String a;

    static {
        h hVar = new h("AUTH_QR", 0, "/am/push/qrsecure");
        b = hVar;
        h hVar2 = new h("AUTH_QR_WITHOUT_QR", 1, "/am/pssp/browser/account");
        c = hVar2;
        h hVar3 = new h("PAY_URL", 2, "/open-payment");
        d = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        e = hVarArr;
        f = new rdb(hVarArr);
    }

    public h(String str, int i, String str2) {
        this.a = str2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) e.clone();
    }
}
