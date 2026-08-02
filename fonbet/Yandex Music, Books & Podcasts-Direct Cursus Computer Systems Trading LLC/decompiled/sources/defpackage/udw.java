package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class udw {
    public final z78 a;
    public final rjq b;
    public final um6 c;
    public final AtomicReference d;

    public udw(z78 z78Var) {
        this.a = z78Var;
        rjq rjqVar = new rjq(false);
        this.b = rjqVar;
        this.c = hld.s(rjqVar, dm6.b());
        this.d = new AtomicReference();
    }

    public final void a(w74 w74Var) {
        if (this.b.d.a()) {
            this.d.set(w74Var.c);
            nmb nmbVar = j74.a;
            v74 v74Var = w74Var.e;
            v74Var.getClass();
            j74.a(xv7.y(v74Var), slb.Ynison, tlb.Ondemand);
        }
    }
}
