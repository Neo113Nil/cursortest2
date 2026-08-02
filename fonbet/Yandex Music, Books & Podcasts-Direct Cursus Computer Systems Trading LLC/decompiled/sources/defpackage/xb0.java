package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class xb0 {
    public final c62 a;
    public final y42 b;
    public final i82 c;
    public tf6 d;
    public final pjc e;
    public final xdr f;
    public final fkn g;
    public final pjc h;
    public final xdr i;
    public final fkn j;
    public final ConcurrentHashMap k;

    public xb0(c62 c62Var, md0 md0Var, y42 y42Var, i82 i82Var) {
        this.a = c62Var;
        this.b = y42Var;
        this.c = i82Var;
        this.e = (pjc) md0Var.q.getValue();
        xdr a = ydr.a(null);
        this.f = a;
        this.g = new fkn(a);
        this.h = (pjc) md0Var.p.getValue();
        xdr a2 = ydr.a(null);
        this.i = a2;
        this.j = new fkn(a2);
        this.k = new ConcurrentHashMap();
    }
}
