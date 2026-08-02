package com.yandex.passport.internal.analytics;

import defpackage.czf;
import defpackage.eqj;
import defpackage.kyf;
import defpackage.q0v;
import java.util.Map;

/* loaded from: classes4.dex */
public final class p0 implements czf {
    public final w a;
    public final Map b;
    public final q0v c;

    public p0(w wVar, Map map) {
        wVar.getClass();
        map.getClass();
        this.a = wVar;
        this.b = map;
        this.c = new q0v(20, this);
    }

    @eqj(kyf.ON_CREATE)
    public final void onCreate() {
        w wVar = this.a;
        wVar.getClass();
        wVar.b.add(this.c);
    }

    @eqj(kyf.ON_DESTROY)
    public final void onDestroy() {
        w wVar = this.a;
        wVar.getClass();
        wVar.b.remove(this.c);
    }
}
