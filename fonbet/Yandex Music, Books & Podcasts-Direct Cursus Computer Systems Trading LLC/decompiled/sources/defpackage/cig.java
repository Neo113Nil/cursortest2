package defpackage;

import com.google.common.cache.b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class cig extends nsc implements Serializable {
    private static final long serialVersionUID = 1;
    public final ngs A;
    public final qzc B;
    public transient big C;
    public final iig q;
    public final iig r;
    public final qeb s;
    public final qeb t;
    public final long u;
    public final long v;
    public final long w;
    public final zo3 x;
    public final int y;
    public final ewn z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cig(b bVar) {
        super(25);
        iig iigVar = bVar.g;
        iig iigVar2 = bVar.h;
        qeb qebVar = bVar.e;
        qeb qebVar2 = bVar.f;
        long j = bVar.l;
        long j2 = bVar.k;
        long j3 = bVar.i;
        zo3 zo3Var = bVar.j;
        int i = bVar.d;
        ewn ewnVar = bVar.n;
        ngs ngsVar = bVar.o;
        qzc qzcVar = bVar.r;
        this.q = iigVar;
        this.r = iigVar2;
        this.s = qebVar;
        this.t = qebVar2;
        this.u = j;
        this.v = j2;
        this.w = j3;
        this.x = zo3Var;
        this.y = i;
        this.z = ewnVar;
        this.A = (ngsVar == ngs.a || ngsVar == ap3.p) ? null : ngsVar;
        this.B = qzcVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        ap3 P = P();
        P.a();
        this.C = new big(new b(P, null));
    }

    private Object readResolve() {
        return this.C;
    }

    @Override // defpackage.ltg
    public final Object B() {
        return this.C;
    }

    public final ap3 P() {
        ap3 d = ap3.d();
        iig iigVar = d.g;
        o2g.S(iigVar, "Key strength was already set to %s", iigVar == null);
        iig iigVar2 = this.q;
        iigVar2.getClass();
        d.g = iigVar2;
        d.e(this.r);
        qeb qebVar = d.k;
        o2g.S(qebVar, "key equivalence was already set to %s", qebVar == null);
        qeb qebVar2 = this.s;
        qebVar2.getClass();
        d.k = qebVar2;
        qeb qebVar3 = d.l;
        o2g.S(qebVar3, "value equivalence was already set to %s", qebVar3 == null);
        qeb qebVar4 = this.t;
        qebVar4.getClass();
        d.l = qebVar4;
        int i = d.c;
        o2g.R(i, "concurrency level was already set to %s", i == -1);
        int i2 = this.y;
        o2g.L(i2 > 0);
        d.c = i2;
        o2g.V(d.m == null);
        ewn ewnVar = this.z;
        ewnVar.getClass();
        d.m = ewnVar;
        d.a = false;
        long j = this.u;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (j > 0) {
            long j2 = d.i;
            o2g.T("expireAfterWrite was already set to %s ns", j2, j2 == -1);
            if (!(j >= 0)) {
                xq0.x(zwf.R("duration cannot be negative: %s %s", Long.valueOf(j), timeUnit));
                return null;
            }
            d.i = j;
        }
        long j3 = this.v;
        if (j3 > 0) {
            d.b(j3, timeUnit);
        }
        zo3 zo3Var = zo3.a;
        long j4 = this.w;
        zo3 zo3Var2 = this.x;
        if (zo3Var2 != zo3Var) {
            o2g.V(d.f == null);
            if (d.a) {
                long j5 = d.d;
                o2g.T("weigher can not be combined with maximum size (%s provided)", j5, j5 == -1);
            }
            zo3Var2.getClass();
            d.f = zo3Var2;
            if (j4 != -1) {
                long j6 = d.e;
                o2g.T("maximum weight was already set to %s", j6, j6 == -1);
                long j7 = d.d;
                o2g.T("maximum size was already set to %s", j7, j7 == -1);
                o2g.J("maximum weight must not be negative", j4 >= 0);
                d.e = j4;
            }
        } else if (j4 != -1) {
            d.c(j4);
        }
        ngs ngsVar = this.A;
        if (ngsVar != null) {
            o2g.V(d.n == null);
            d.n = ngsVar;
        }
        return d;
    }
}
