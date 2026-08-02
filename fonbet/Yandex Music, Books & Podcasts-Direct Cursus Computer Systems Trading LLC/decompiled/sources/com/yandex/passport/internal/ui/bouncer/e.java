package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.internal.report.gf;
import defpackage.a4g;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class e implements rzm {
    public final /* synthetic */ int a;
    public final d b;

    public /* synthetic */ e(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a;
            case 1:
                return this.b.a;
            case 2:
                return this.b.a;
            case 3:
                return this.b.c;
            case 4:
                com.yandex.passport.internal.properties.v vVar = this.b.d;
                a4g.t(vVar);
                return vVar;
            default:
                gf gfVar = this.b.b;
                a4g.t(gfVar);
                return gfVar;
        }
    }
}
