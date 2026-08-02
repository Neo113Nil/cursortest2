package com.yandex.passport.internal.methods;

import defpackage.b6e;

/* loaded from: classes4.dex */
public final class k6 extends v {
    public k6(String str) {
        super(m.l, str);
    }

    public com.yandex.passport.internal.stash.b c() {
        com.yandex.passport.data.network.token.i iVar = com.yandex.passport.internal.stash.b.b;
        String str = (String) this.c;
        iVar.getClass();
        com.yandex.passport.internal.stash.b h = com.yandex.passport.data.network.token.i.h(str);
        if (h != null) {
            return h;
        }
        b6e.l(str, "no such cell ");
        return null;
    }
}
