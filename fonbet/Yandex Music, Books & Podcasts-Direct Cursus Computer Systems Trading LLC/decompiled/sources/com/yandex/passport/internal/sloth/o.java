package com.yandex.passport.internal.sloth;

import com.yandex.passport.internal.report.af;

/* loaded from: classes4.dex */
public final class o implements com.yandex.passport.sloth.dependencies.h {
    public final af a;
    public final com.yandex.passport.internal.features.a b;

    public o(af afVar, com.yandex.passport.internal.features.a aVar) {
        afVar.getClass();
        aVar.getClass();
        this.a = afVar;
        this.b = aVar;
    }

    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.d.getValue(aVar, com.yandex.passport.internal.features.a.J[0])).booleanValue();
    }
}
