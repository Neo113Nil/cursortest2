package defpackage;

import android.content.Context;
import ru.yandex.video.m3.data.Size;

/* loaded from: classes6.dex */
public final class ue7 {
    public static final Size p = v3g.o(500, 900);
    public final tf6 a;
    public final Context b;
    public final nsh c;
    public final gag d;
    public iz7 e;
    public rar f;
    public final se7 g;
    public final xdr h;
    public final xdr i;
    public final fkn j;
    public final xdr k;
    public final fkn l;
    public imh m;
    public paw n;
    public final rar o;

    public ue7(tf6 tf6Var, gag gagVar, nsh nshVar, Context context) {
        context.getClass();
        this.a = tf6Var;
        this.b = context;
        this.c = nshVar;
        this.d = gagVar;
        this.g = new se7(this);
        xdr a = ydr.a(Boolean.FALSE);
        this.h = a;
        xdr a2 = ydr.a(new qe7());
        this.i = a2;
        this.j = new fkn(a2);
        c5b c5bVar = c5b.a;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        xdr a3 = ydr.a(new jag(c5bVar, e5bVar, e5bVar, e5bVar, e5bVar, null, null, null, null, e5bVar, e5bVar, c5bVar, c5bVar, null, false, null));
        this.k = a3;
        this.l = new fkn(a3);
        this.o = zsd.r0(tf6Var, new u21(10, gagVar.d, a, new re7(this, null, 0)));
    }

    public final void a() {
        paw pawVar = this.n;
        if (pawVar != null) {
            pawVar.q(this.g);
        }
        this.n = null;
        iz7 iz7Var = this.e;
        if (iz7Var != null) {
            iz7Var.n();
        }
        this.e = null;
        rar rarVar = this.f;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.f = null;
    }

    public final void b() {
        this.o.g(null);
        this.m = null;
        a();
        iz7 iz7Var = this.e;
        if (iz7Var != null) {
            xdr xdrVar = (xdr) iz7Var.c;
            qe7 qe7Var = new qe7();
            xdrVar.getClass();
            xdrVar.m(null, qe7Var);
        }
        xdr xdrVar2 = this.d.c;
        eag eagVar = new eag();
        xdrVar2.getClass();
        xdrVar2.m(null, eagVar);
    }
}
