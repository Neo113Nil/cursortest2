package com.yandex.passport.internal.account;

import com.yandex.passport.internal.storage.m;
import defpackage.dkn;
import defpackage.jp0;
import defpackage.s9f;
import defpackage.x0q;
import defpackage.y0q;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class b {
    public final m a;
    public final x0q b;
    public final dkn c;

    public b(m mVar) {
        mVar.getClass();
        this.a = mVar;
        x0q b = y0q.b(0, 1, null, 5);
        this.b = b;
        this.c = new dkn(b);
    }

    public final void a(com.yandex.passport.common.core.f fVar) {
        fVar.getClass();
        m mVar = this.a;
        if (fVar.equals(mVar.c())) {
            jp0 jp0Var = mVar.c;
            s9f[] s9fVarArr = m.m;
            jp0Var.setValue(mVar, s9fVarArr[1], null);
            mVar.d.setValue(mVar, s9fVarArr[2], null);
            this.b.a(Unit.a);
        }
    }

    public final void b(com.yandex.passport.common.core.f fVar) {
        fVar.getClass();
        m mVar = this.a;
        jp0 jp0Var = mVar.c;
        s9f[] s9fVarArr = m.m;
        jp0Var.setValue(mVar, s9fVarArr[1], null);
        mVar.d.setValue(mVar, s9fVarArr[2], fVar);
        this.b.a(Unit.a);
    }
}
