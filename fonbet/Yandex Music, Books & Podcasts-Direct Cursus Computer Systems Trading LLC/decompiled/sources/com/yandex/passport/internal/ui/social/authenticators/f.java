package com.yandex.passport.internal.ui.social.authenticators;

import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.report.reporters.a1;
import com.yandex.passport.internal.ui.domik.o;
import com.yandex.passport.internal.ui.social.q;
import com.yandex.passport.internal.ui.social.t;
import defpackage.bfu;
import defpackage.fkn;
import defpackage.xdr;
import defpackage.ydr;

/* loaded from: classes4.dex */
public abstract class f extends bfu {
    public final l k;
    public final a0 l;
    public final boolean m;
    public final Object n;
    public final a1 o;
    public final o p;
    public final xdr q;
    public final fkn r;

    public f(l lVar, a0 a0Var, Bundle bundle, boolean z, Object obj, a1 a1Var) {
        lVar.getClass();
        a0Var.getClass();
        a1Var.getClass();
        this.k = lVar;
        this.l = a0Var;
        this.m = z;
        this.n = obj;
        this.o = a1Var;
        this.p = new o();
        xdr a = ydr.a(q.b);
        this.q = a;
        this.r = new fkn(a);
        if (bundle == null) {
            G();
        }
    }

    public abstract void G();

    public void H(Bundle bundle) {
    }

    public void J(Bundle bundle) {
        bundle.getClass();
    }

    public final void K() {
        ((t) this.r.a.getValue()).getClass();
        q qVar = q.c;
        xdr xdrVar = this.q;
        xdrVar.getClass();
        xdrVar.m(null, qVar);
    }

    public abstract void a(int i, int i2, Intent intent);
}
