package com.yandex.passport.internal.ui.sloth.authsdk;

import defpackage.a4g;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class g0 implements rzm {
    public final /* synthetic */ int a;
    public final f0 b;

    public /* synthetic */ g0(f0 f0Var, int i) {
        this.a = i;
        this.b = f0Var;
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
