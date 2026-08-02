package com.yandex.passport.internal;

/* loaded from: classes4.dex */
public abstract class j {
    public static final com.yandex.passport.internal.properties.l a;

    static {
        com.yandex.passport.internal.properties.k kVar = new com.yandex.passport.internal.properties.k();
        com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
        jVar.O(com.yandex.passport.api.impl.b.c);
        kVar.b = com.yandex.passport.internal.ui.a.s(jVar.l());
        kVar.i = true;
        kVar.q = "passport/settings";
        a = kVar.a();
    }
}
