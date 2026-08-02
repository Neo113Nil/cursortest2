package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class n5 extends v5 {
    public final v6 c;
    public final k6 d;
    public final k6 e;
    public final List f;
    public final e6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(Bundle bundle) {
        super(w5.n);
        bundle.getClass();
        d dVar = d.e;
        List d = dVar.d(bundle);
        c cVar = c.q;
        String c = cVar.c(bundle);
        m mVar = m.l;
        mVar.getClass();
        String string = bundle.getString(mVar.b, null);
        v6 v6Var = new v6(dVar, d);
        k6 k6Var = new k6(cVar, c);
        k6 k6Var2 = new k6(string);
        this.c = v6Var;
        this.d = k6Var;
        this.e = k6Var2;
        this.f = u75.h(v6Var, k6Var, k6Var2);
        this.g = e6.i;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final List a() {
        return this.f;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final f b() {
        return this.g;
    }
}
