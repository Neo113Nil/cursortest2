package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.a4g;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class y0 implements rzm {
    public final /* synthetic */ int a;
    public final x0 b;

    public /* synthetic */ y0(x0 x0Var, int i) {
        this.a = i;
        this.b = x0Var;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a;
            default:
                l0 l0Var = this.b.b;
                a4g.t(l0Var);
                return l0Var;
        }
    }
}
