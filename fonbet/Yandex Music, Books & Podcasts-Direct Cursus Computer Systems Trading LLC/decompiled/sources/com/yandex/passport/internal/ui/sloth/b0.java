package com.yandex.passport.internal.ui.sloth;

import defpackage.a4g;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class b0 implements rzm {
    public final /* synthetic */ int a;
    public final a0 b;

    public /* synthetic */ b0(a0 a0Var, int i) {
        this.a = i;
        this.b = a0Var;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a;
            default:
                com.yandex.passport.sloth.data.m mVar = this.b.b;
                a4g.t(mVar);
                return mVar;
        }
    }
}
