package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.a4g;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class q0 implements rzm {
    public final /* synthetic */ int a;
    public final p0 b;

    public /* synthetic */ q0(p0 p0Var, int i) {
        this.a = i;
        this.b = p0Var;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                com.yandex.passport.internal.properties.v vVar = this.b.c;
                a4g.t(vVar);
                return vVar;
            default:
                com.yandex.passport.internal.properties.r rVar = this.b.b;
                a4g.t(rVar);
                return rVar;
        }
    }
}
