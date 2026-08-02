package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jd5 {
    public final b6v a;
    public final int b;

    public jd5(s9q s9qVar, int i) {
        r3q m3qVar;
        bd5 ad5Var;
        o3q o3qVar;
        k3q k3qVar;
        i3q i3qVar;
        if (s9qVar instanceof o9q) {
            o9q o9qVar = (o9q) s9qVar;
            xc5 xc5Var = new xc5(o9qVar.d.a);
            n3q n3qVar = new n3q(o9qVar.e);
            iow iowVar = o9qVar.c;
            iowVar.getClass();
            switch (iowVar.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 7:
                    i3qVar = i3q.a;
                    break;
                case 4:
                    i3qVar = i3q.b;
                    break;
                default:
                    b6e.s();
                    throw null;
            }
            m3qVar = new j3q(xc5Var, n3qVar, i3qVar);
        } else if (s9qVar instanceof p9q) {
            p9q p9qVar = (p9q) s9qVar;
            yc5 yc5Var = new yc5(p9qVar.d.a);
            n3q n3qVar2 = new n3q(p9qVar.e);
            iow iowVar2 = p9qVar.c;
            iowVar2.getClass();
            switch (iowVar2.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                    k3qVar = k3q.a;
                    break;
                case 4:
                    k3qVar = k3q.d;
                    break;
                case 6:
                    k3qVar = k3q.b;
                    break;
                case 7:
                    k3qVar = k3q.c;
                    break;
                default:
                    b6e.s();
                    throw null;
            }
            m3qVar = new l3q(yc5Var, n3qVar2, k3qVar);
        } else if (s9qVar instanceof q9q) {
            q9q q9qVar = (q9q) s9qVar;
            x9q x9qVar = q9qVar.e;
            if (x9qVar instanceof v9q) {
                v9q v9qVar = (v9q) x9qVar;
                ad5Var = new zc5(v9qVar.a, v9qVar.b);
            } else {
                if (!(x9qVar instanceof w9q)) {
                    b6e.s();
                    throw null;
                }
                w9q w9qVar = (w9q) x9qVar;
                ad5Var = new ad5(w9qVar.a, w9qVar.b, w9qVar.c);
            }
            n3q n3qVar3 = new n3q(q9qVar.f);
            iow iowVar3 = q9qVar.a;
            iowVar3.getClass();
            switch (iowVar3.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 7:
                    o3qVar = o3q.b;
                    break;
                case 4:
                    o3qVar = o3q.a;
                    break;
                default:
                    b6e.s();
                    throw null;
            }
            m3qVar = new p3q(ad5Var, o3qVar, n3qVar3);
        } else {
            if (!(s9qVar instanceof r9q)) {
                b6e.s();
                throw null;
            }
            r9q r9qVar = (r9q) s9qVar;
            m3qVar = new m3q(new cd5(r9qVar.b), o2g.m0(r9qVar.a));
        }
        this.a = new b6v(m3qVar);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd5)) {
            return false;
        }
        jd5 jd5Var = (jd5) obj;
        return Intrinsics.d(this.a, jd5Var.a) && this.b == jd5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonEntityWithKey(source=" + this.a + ", key=" + this.b + ")";
    }

    public jd5(b6v b6vVar, int i) {
        this.a = b6vVar;
        this.b = i;
    }
}
