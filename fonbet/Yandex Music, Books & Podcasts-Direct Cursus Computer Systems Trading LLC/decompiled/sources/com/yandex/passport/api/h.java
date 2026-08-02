package com.yandex.passport.api;

/* loaded from: classes4.dex */
public enum h implements k0 {
    c("PRODUCTION"),
    d("TEAM_PRODUCTION"),
    e("TESTING"),
    f("TEAM_TESTING"),
    g("RC");

    public static final q b = new q();
    public final com.yandex.passport.api.impl.b a;

    h(String str) {
        this.a = r2;
    }

    @Override // com.yandex.passport.api.k0
    public final int d() {
        return this.a.a;
    }
}
