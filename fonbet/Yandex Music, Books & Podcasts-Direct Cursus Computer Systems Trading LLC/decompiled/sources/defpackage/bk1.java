package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class bk1 extends bfu {
    public final rdk k;
    public final xdr l = ydr.a(apq.a);
    public final x0q m = y0q.b(0, 1, oi3.b, 1);
    public final j0q n = new j0q();
    public final ce5 o;
    public wh1 p;
    public rar q;

    public bk1(rdk rdkVar, oj1 oj1Var, xpq xpqVar, l63 l63Var) {
        this.k = rdkVar;
        ce5 ce5Var = new ce5("artists", ot0.F(this), xpqVar, l63Var);
        this.o = ce5Var;
        this.p = wh1.a;
        ssg.a(3, "Artist:Skeleton", "Init SkeletonListViewModel", null);
        ox6.B(new bca((xdr) ce5Var.e, 18), ot0.F(this), new yj1(this, 0));
        ox6.B(oj1Var.a, ot0.F(this), new yj1(this, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (r0.r(r1, null, r11) == r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (r11 == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(bk1 bk1Var, String str, boolean z, cg6 cg6Var) {
        zj1 zj1Var;
        int i;
        cqq cqqVar;
        xdr xdrVar = bk1Var.l;
        if (cg6Var instanceof zj1) {
            zj1Var = (zj1) cg6Var;
            int i2 = zj1Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zj1Var.n = i2 - Integer.MIN_VALUE;
                Object obj = zj1Var.l;
                nm6 nm6Var = nm6.a;
                i = zj1Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "Artist:Skeleton", "Load skeleton[force=" + z + "]: blockId=" + str, null);
                    rdk rdkVar = bk1Var.k;
                    wh1 wh1Var = bk1Var.p;
                    zj1Var.j = str;
                    zj1Var.k = z;
                    zj1Var.n = 1;
                    obj = rdkVar.V(wh1Var, z, zj1Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = zj1Var.j;
                        qgg.h0(obj);
                        if (str != null) {
                            bk1Var.H(str);
                        }
                        return Unit.a;
                    }
                    z = zj1Var.k;
                    str = zj1Var.j;
                    qgg.h0(obj);
                }
                cqqVar = (cqq) obj;
                if (cqqVar instanceof bqq) {
                    if (!(cqqVar instanceof aqq)) {
                        b6e.s();
                        return null;
                    }
                    aqq aqqVar = (aqq) cqqVar;
                    ssg.a(6, "Artist:Skeleton", "Skeleton loading is failed.", aqqVar.b);
                    bk1Var.m.a(aqqVar);
                    if (!(xdrVar.getValue() instanceof bpq)) {
                        xdrVar.m(null, new zoq(aqqVar.a));
                    }
                    return Unit.a;
                }
                ce5 ce5Var = bk1Var.o;
                List list = ((snq) ((bqq) cqqVar).a).c;
                zj1Var.j = str;
                zj1Var.k = z;
                zj1Var.n = 2;
            }
        }
        zj1Var = new zj1(bk1Var, cg6Var);
        Object obj2 = zj1Var.l;
        nm6 nm6Var2 = nm6.a;
        i = zj1Var.n;
        if (i != 0) {
        }
        cqqVar = (cqq) obj2;
        if (cqqVar instanceof bqq) {
        }
    }

    public final void G(wh1 wh1Var, String str, boolean z) {
        wh1Var.getClass();
        rar rarVar = this.q;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.q = x97.y(ot0.F(this), null, null, new ak1(this, wh1Var, z, str, (Continuation) null), 3);
    }

    public final void H(String str) {
        str.getClass();
        ce5 ce5Var = this.o;
        Integer b = ce5Var.b(str);
        if (b == null) {
            b = ce5Var.c(str);
        }
        if (b != null) {
            x97.y(ot0.F(this), null, null, new dv0(this, b.intValue() + 1, null, 1), 3);
        }
    }
}
