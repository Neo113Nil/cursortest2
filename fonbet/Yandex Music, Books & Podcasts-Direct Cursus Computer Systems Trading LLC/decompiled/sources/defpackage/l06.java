package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class l06 extends bfu {
    public final g06 k;
    public final xdr l = ydr.a(apq.a);
    public final x0q m = y0q.b(0, 1, oi3.b, 1);
    public final j0q n = new j0q();
    public final ce5 o;
    public rar p;

    public l06(g06 g06Var, nnq nnqVar, l63 l63Var) {
        this.k = g06Var;
        ce5 ce5Var = new ce5("concert_page", ot0.F(this), nnqVar, l63Var);
        this.o = ce5Var;
        ssg.a(3, "Concert:Skeleton", "Init SkeletonListViewModel", null);
        ox6.B(new bca((xdr) ce5Var.e, 18), ot0.F(this), new i64(21, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r1.r(r2, null, r0) == r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l06 l06Var, boolean z, cg6 cg6Var) {
        k06 k06Var;
        int i;
        Object obj;
        boolean z2;
        String str;
        cqq cqqVar;
        xdr xdrVar = l06Var.l;
        ce5 ce5Var = l06Var.o;
        if (cg6Var instanceof k06) {
            k06Var = (k06) cg6Var;
            int i2 = k06Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k06Var.n = i2 - Integer.MIN_VALUE;
                Object obj2 = k06Var.l;
                nm6 nm6Var = nm6.a;
                i = k06Var.n;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    ssg.a(3, "Concert:Skeleton", "Load skeleton[force=" + z + "]: blockId=null", null);
                    g06 g06Var = l06Var.k;
                    k06Var.j = null;
                    k06Var.k = z;
                    k06Var.n = 1;
                    Object X = g06Var.X(z, k06Var);
                    if (X != nm6Var) {
                        obj = X;
                        z2 = z;
                        str = null;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = k06Var.j;
                    qgg.h0(obj2);
                    if (str != null) {
                        Integer b = ce5Var.b(str);
                        if (b == null) {
                            b = ce5Var.c(str);
                        }
                        if (b != null) {
                            x97.y(ot0.F(l06Var), null, null, new dv0(l06Var, b.intValue(), continuation, 2), 3);
                        }
                    }
                    return Unit.a;
                }
                boolean z3 = k06Var.k;
                String str2 = k06Var.j;
                qgg.h0(obj2);
                z2 = z3;
                str = str2;
                obj = obj2;
                cqqVar = (cqq) obj;
                if (cqqVar instanceof bqq) {
                    if (!(cqqVar instanceof aqq)) {
                        b6e.s();
                        return null;
                    }
                    aqq aqqVar = (aqq) cqqVar;
                    ssg.a(6, "Concert:Skeleton", "Skeleton loading is failed.", aqqVar.b);
                    l06Var.m.a(aqqVar);
                    if (!(xdrVar.getValue() instanceof bpq)) {
                        xdrVar.m(null, new zoq(aqqVar.a));
                    }
                    return Unit.a;
                }
                List list = ((snq) ((bqq) cqqVar).a).c;
                k06Var.j = str;
                k06Var.k = z2;
                k06Var.n = 2;
            }
        }
        k06Var = new k06(l06Var, cg6Var);
        Object obj22 = k06Var.l;
        nm6 nm6Var2 = nm6.a;
        i = k06Var.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        cqqVar = (cqq) obj;
        if (cqqVar instanceof bqq) {
        }
    }
}
