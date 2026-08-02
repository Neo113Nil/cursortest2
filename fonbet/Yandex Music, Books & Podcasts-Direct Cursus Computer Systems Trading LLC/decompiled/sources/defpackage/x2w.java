package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class x2w {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final tf6 e;
    public rar f;

    public x2w() {
        bdt I = hag.I(frt.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(wst.class), true);
        this.c = l18Var.b(hag.I(vxr.class), true);
        this.d = l18Var.b(hag.I(oy2.class), true);
        this.e = gld.e(dm6.b);
    }

    public final rar a() {
        Continuation continuation = null;
        r1w r1wVar = new r1w(this, continuation, 1);
        tf6 tf6Var = this.e;
        x97.y(tf6Var, null, null, r1wVar, 3);
        rar rarVar = this.f;
        if (rarVar != null) {
            rarVar.g(null);
        }
        rar y = x97.y(tf6Var, null, null, new y6v(this, continuation, 15), 3);
        this.f = y;
        return y;
    }
}
