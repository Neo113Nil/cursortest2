package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class gmi extends bfu {
    public final aqd k;
    public final d20 l;
    public final no6 m;
    public final hwl n;
    public final sy7 o;
    public final p1i p;
    public final d6h q;
    public final hv0 r;
    public final ime s;
    public final xdr t;
    public final fkn u;
    public final xdr v;
    public final fkn w;
    public rar x;
    public final x0q y;
    public rar z;

    public gmi(aqd aqdVar, q0h q0hVar, d20 d20Var, no6 no6Var, hwl hwlVar, sy7 sy7Var, p1i p1iVar, d6h d6hVar, hv0 hv0Var, kxi kxiVar, cvo cvoVar) {
        cvoVar.getClass();
        this.k = aqdVar;
        this.l = d20Var;
        this.m = no6Var;
        this.n = hwlVar;
        this.o = sy7Var;
        this.p = p1iVar;
        this.q = d6hVar;
        this.r = hv0Var;
        this.s = new ime(kxiVar.a, cvoVar);
        xdr a = ydr.a(ami.a);
        this.t = a;
        this.u = new fkn(a);
        xdr a2 = ydr.a(Boolean.FALSE);
        this.v = a2;
        this.w = new fkn(a2);
        this.y = y0q.a(1, 0, oi3.b);
        rar rarVar = this.x;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.x = null;
        this.x = x97.y(ot0.F(this), null, null, new emi(continuation, this, 2), 3);
        q0hVar.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0103, code lost:
    
        if (r13 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0105, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x006d, code lost:
    
        if (r13 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0055, code lost:
    
        if (r13 == r1) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(gmi gmiVar, cg6 cg6Var) {
        dmi dmiVar;
        int i;
        Object obj;
        ArrayList arrayList;
        imi imiVar;
        xdr xdrVar = gmiVar.t;
        if (cg6Var instanceof dmi) {
            dmiVar = (dmi) cg6Var;
            int i2 = dmiVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dmiVar.m = i2 - Integer.MIN_VALUE;
                dmi dmiVar2 = dmiVar;
                Object obj2 = dmiVar2.k;
                nm6 nm6Var = nm6.a;
                i = dmiVar2.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    aqd aqdVar = gmiVar.k;
                    dmiVar2.m = 1;
                    obj2 = ((nli) aqdVar.b).a(20, dmiVar2);
                } else if (i == 1) {
                    qgg.h0(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                        hli hliVar = (hli) obj2;
                        gmiVar.s.E(hliVar.a);
                        hyd hydVar = new hyd(10, 26);
                        ArrayList arrayList2 = new ArrayList(hliVar.a);
                        n7b n7bVar = new n7b(hydVar, new y6g(13, arrayList2, gmiVar));
                        rar rarVar = gmiVar.z;
                        if (rarVar != null) {
                            rarVar.g(null);
                        }
                        gmiVar.z = x97.y(ot0.F(gmiVar), null, null, new rlg(n7bVar, gmiVar, continuation, 10), 3);
                        bmi bmiVar = new bmi(arrayList2, hliVar.b, gmiVar.y);
                        xdrVar.getClass();
                        xdrVar.m(null, bmiVar);
                        return Unit.a;
                    }
                    obj = dmiVar2.j;
                    qgg.h0(obj2);
                    if (((Boolean) obj2).booleanValue()) {
                        arrayList = (List) ((qj6) obj).a;
                    } else {
                        List<imi> list = (List) ((qj6) obj).a;
                        arrayList = new ArrayList();
                        for (imi imiVar2 : list) {
                            List list2 = imiVar2.b;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj3 : list2) {
                                hji hjiVar = ((kji) obj3).a;
                                if (!(hjiVar instanceof uii) && !(hjiVar instanceof eji)) {
                                    arrayList3.add(obj3);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                imiVar = null;
                            } else {
                                Date date = imiVar2.a;
                                date.getClass();
                                imiVar = new imi(date, arrayList3);
                            }
                            if (imiVar != null) {
                                arrayList.add(imiVar);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        xdrVar.getClass();
                        xdrVar.m(null, yli.a);
                        return Unit.a;
                    }
                    d20 d20Var = gmiVar.l;
                    no6 no6Var = gmiVar.m;
                    hwl hwlVar = gmiVar.n;
                    sy7 sy7Var = gmiVar.o;
                    p1i p1iVar = gmiVar.p;
                    d6h d6hVar = gmiVar.q;
                    dmiVar2.j = null;
                    dmiVar2.m = 3;
                    obj2 = tt0.O(arrayList, d20Var, no6Var, hwlVar, sy7Var, p1iVar, d6hVar, dmiVar2);
                }
                obj = (rj6) obj2;
                if (obj instanceof qj6) {
                    if (!(obj instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    xdrVar.getClass();
                    xdrVar.m(null, zli.a);
                    return Unit.a;
                }
                hv0 hv0Var = gmiVar.r;
                dmiVar2.j = (qj6) obj;
                dmiVar2.m = 2;
                obj2 = hv0Var.invoke(dmiVar2);
            }
        }
        dmiVar = new dmi(gmiVar, cg6Var);
        dmi dmiVar22 = dmiVar;
        Object obj22 = dmiVar22.k;
        nm6 nm6Var2 = nm6.a;
        i = dmiVar22.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        obj = (rj6) obj22;
        if (obj instanceof qj6) {
        }
    }
}
