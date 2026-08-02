package defpackage;

/* loaded from: classes4.dex */
public final class z57 implements gfu {
    public final rn5 a;
    public final g0c b;
    public final tc1 c;
    public final n7b d;
    public final sdk e;
    public final osh f;
    public final qdc g;
    public final le3 h;
    public final pjc i;
    public final boolean j;
    public final g8c k;
    public final oxa l;
    public final atn m;
    public final t1f n;
    public final xdh o;
    public final ljj p;
    public final rjj q;
    public final ljj r;

    public z57(rn5 rn5Var, g0c g0cVar, tc1 tc1Var, n7b n7bVar, sdk sdkVar, osh oshVar, qdc qdcVar, le3 le3Var, pjc pjcVar, boolean z, g8c g8cVar, oxa oxaVar, atn atnVar, t1f t1fVar, xdh xdhVar, ljj ljjVar, rjj rjjVar, ljj ljjVar2) {
        this.a = rn5Var;
        this.b = g0cVar;
        this.c = tc1Var;
        this.d = n7bVar;
        this.e = sdkVar;
        this.f = oshVar;
        this.g = qdcVar;
        this.h = le3Var;
        this.i = pjcVar;
        this.j = z;
        this.k = g8cVar;
        this.l = oxaVar;
        this.m = atnVar;
        this.n = t1fVar;
        this.o = xdhVar;
        this.p = ljjVar;
        this.q = rjjVar;
        this.r = ljjVar2;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        boolean z = this.j;
        pjc pjcVar = this.i;
        le3 le3Var = this.h;
        rn5 rn5Var = this.a;
        osh oshVar = this.f;
        n7b n7bVar = this.d;
        g0c g0cVar = this.b;
        if (z) {
            return new y57(g0cVar, this.k, this.r, this.m, this.n, this.o, n7bVar, this.l, oshVar, this.p, this.q, rn5Var, le3Var, pjcVar);
        }
        return new e57(rn5Var, g0cVar, this.c, n7bVar, this.e, oshVar, this.g, le3Var, pjcVar);
    }
}
