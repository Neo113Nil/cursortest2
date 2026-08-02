package com.yandex.passport.internal.sso;

import com.yandex.passport.internal.flags.o;
import com.yandex.passport.internal.properties.x;

/* loaded from: classes4.dex */
public final class l {
    public final x a;
    public final com.yandex.passport.internal.flags.i b;

    public l(x xVar, com.yandex.passport.internal.flags.i iVar) {
        xVar.getClass();
        iVar.getClass();
        this.a = xVar;
        this.b = iVar;
    }

    public final boolean a() {
        Boolean bool = this.a.o;
        if (bool != null) {
            return !bool.booleanValue();
        }
        com.yandex.passport.internal.flags.a aVar = o.a;
        return ((Boolean) this.b.b(o.h)).booleanValue();
    }
}
