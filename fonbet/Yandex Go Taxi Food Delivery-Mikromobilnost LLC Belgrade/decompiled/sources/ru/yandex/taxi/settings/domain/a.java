package ru.yandex.taxi.settings.domain;

import defpackage.bvf0;
import defpackage.ha2;
import defpackage.jae0;
import defpackage.ney;
import defpackage.q3g0;
import defpackage.xk60;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public final class a {
    public final xk60 a;
    public final q3g0 b;
    public final jae0 c;
    public final ney d;
    public final r0 e;

    public a(xk60 xk60Var, q3g0 q3g0Var, jae0 jae0Var, ney neyVar) {
        this.a = xk60Var;
        this.b = q3g0Var;
        this.c = jae0Var;
        this.d = neyVar;
        this.e = bvf0.c(Boolean.valueOf(xk60Var.b()));
    }

    public final ha2 a() {
        return kotlinx.coroutines.flow.e.n(this.b.a.a(), this.c.a.a(), this.e, new PushDisabledMenuItemInteractor$shouldShowPushSystemDisabledFlow$1(this, null));
    }
}
