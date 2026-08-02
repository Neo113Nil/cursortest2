package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class wpj0 {
    public final ypj0 a;
    public final r0 b;
    public final gci0 c;

    public wpj0(ypj0 ypj0Var) {
        this.a = ypj0Var;
        r0 c = bvf0.c(Boolean.FALSE);
        this.b = c;
        this.c = e.d(c);
    }

    public final void a() {
        ypj0 ypj0Var = this.a;
        int i = ypj0Var.a.i("usage_count", 0) + 1;
        ypj0Var.a.p(i, "usage_count");
        x4e.z(i, ypj0Var.b, null);
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.b;
        r0Var.getClass();
        r0Var.m(null, bool);
    }
}
