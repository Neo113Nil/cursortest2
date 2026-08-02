package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class cl1 extends xmm {
    public final u51 d;
    public final rmb e;
    public final qe1 f;
    public final bm1 g;
    public final ke1 h;
    public final xdr i;

    public cl1(s63 s63Var, u51 u51Var, rmb rmbVar, qe1 qe1Var, bm1 bm1Var) {
        u51Var.getClass();
        qe1Var.getClass();
        this.d = u51Var;
        this.e = rmbVar;
        this.f = qe1Var;
        this.g = bm1Var;
        this.h = (ke1) s63Var.a;
        this.i = ydr.a(new yl1(true));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.h;
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.i.getValue() instanceof zl1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        yk1 yk1Var;
        int i;
        List list;
        if (cg6Var instanceof yk1) {
            yk1Var = (yk1) cg6Var;
            int i2 = yk1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yk1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = yk1Var.j;
                nm6 nm6Var = nm6.a;
                i = yk1Var.l;
                xdr xdrVar = this.i;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        yl1 yl1Var = new yl1(true);
                        xdrVar.getClass();
                        xdrVar.m(null, yl1Var);
                    }
                    String str = this.d.a;
                    yk1Var.l = 1;
                    obj = this.f.a(str, z, yk1Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                list = (List) obj;
                ke1 ke1Var = this.h;
                if (list != null) {
                    yl1 yl1Var2 = new yl1(false);
                    xdrVar.getClass();
                    xdrVar.m(null, yl1Var2);
                    return new c73(ke1Var);
                }
                List<mqs> list2 = list;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                for (mqs mqsVar : list2) {
                    arrayList.add(new nk1(this.g.a.a(mqsVar), mqsVar));
                }
                zl1 zl1Var = new zl1(arrayList);
                xdrVar.getClass();
                xdrVar.m(null, zl1Var);
                rmb.h(this.e, 1, 2);
                return new d73(ke1Var);
            }
        }
        yk1Var = new yk1(this, cg6Var);
        Object obj2 = yk1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = yk1Var.l;
        xdr xdrVar2 = this.i;
        if (i != 0) {
        }
        list = (List) obj2;
        ke1 ke1Var2 = this.h;
        if (list != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:11:0x0060->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable p(cg6 cg6Var) {
        al1 al1Var;
        int i;
        Iterator it;
        if (cg6Var instanceof al1) {
            al1Var = (al1) cg6Var;
            int i2 = al1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                al1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = al1Var.j;
                nm6 nm6Var = nm6.a;
                i = al1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    fs fsVar = new fs(3, new ub7(11, this.i, ern.a(zl1.class)));
                    al1Var.l = 1;
                    obj = zsd.g0(fsVar, al1Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((nk1) it.next()).b);
                }
                return arrayList;
            }
        }
        al1Var = new al1(this, cg6Var);
        Object obj2 = al1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = al1Var.l;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }
}
