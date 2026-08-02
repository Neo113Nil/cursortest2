package com.yandex.passport.internal.di.module;

import defpackage.bfu;
import defpackage.gfu;
import defpackage.is6;
import defpackage.szm;
import java.util.Map;

/* loaded from: classes4.dex */
public final class v implements gfu {
    public final Map a;

    public v(Map map) {
        map.getClass();
        this.a = map;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        szm szmVar = (szm) this.a.get(cls);
        bfu bfuVar = szmVar != null ? (bfu) szmVar.get() : null;
        bfuVar.getClass();
        return bfuVar;
    }

    @Override // defpackage.gfu
    public final bfu c(Class cls, is6 is6Var) {
        is6Var.getClass();
        return b(cls);
    }
}
