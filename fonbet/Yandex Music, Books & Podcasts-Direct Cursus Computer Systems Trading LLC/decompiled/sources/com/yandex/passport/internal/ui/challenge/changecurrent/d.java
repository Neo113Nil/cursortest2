package com.yandex.passport.internal.ui.challenge.changecurrent;

import defpackage.a4g;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class d implements rzm {
    public final /* synthetic */ int a;
    public final c b;

    public /* synthetic */ d(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                com.yandex.passport.internal.properties.v vVar = this.b.c;
                a4g.t(vVar);
                return vVar;
            default:
                com.yandex.passport.internal.properties.c0 c0Var = this.b.b;
                a4g.t(c0Var);
                return c0Var;
        }
    }
}
