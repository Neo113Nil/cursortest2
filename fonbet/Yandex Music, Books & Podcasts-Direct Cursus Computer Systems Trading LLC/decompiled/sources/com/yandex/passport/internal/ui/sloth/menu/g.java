package com.yandex.passport.internal.ui.sloth.menu;

import com.yandex.passport.internal.properties.j0;
import com.yandex.passport.internal.properties.v;
import defpackage.a4g;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class g implements rzm {
    public final /* synthetic */ int a;
    public final f b;

    public /* synthetic */ g(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a;
            case 1:
                v vVar = this.b.c;
                a4g.t(vVar);
                return vVar;
            default:
                j0 j0Var = this.b.b;
                a4g.t(j0Var);
                return j0Var;
        }
    }
}
