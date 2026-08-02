package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class y40 extends bfu {
    public final xdr k = ydr.a(a50.b);
    public final xdr l = ydr.a(c5b.a);
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final jyr p;

    public y40() {
        bdt I = hag.I(u3g.class);
        l18 l18Var = l18.b;
        this.m = l18Var.b(I, true);
        this.n = l18Var.b(hag.I(zx4.class), true);
        this.o = btf.b(new z3(14, this));
        this.p = btf.b(new s2(25));
        x97.y(ot0.F(this), null, null, new l5(this, (Continuation) null, 12), 3);
    }

    public static final void G(y40 y40Var, fea feaVar) {
        xdr xdrVar = y40Var.l;
        ((z40) y40Var.p.getValue()).getClass();
        feaVar.getClass();
        xdrVar.l(u75.h(new pbc(feaVar == fea.a), new kbc(feaVar == fea.b)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00fe -> B:10:0x0101). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(y40 y40Var, List list, List list2, Continuation continuation) {
        x40 x40Var;
        int i;
        Object obj;
        List o0;
        Iterator it;
        Collection collection;
        int i2;
        int i3;
        y40Var.getClass();
        if (continuation instanceof x40) {
            x40Var = (x40) continuation;
            int i4 = x40Var.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                x40Var.t = i4 - Integer.MIN_VALUE;
                Object obj2 = x40Var.r;
                nm6 nm6Var = nm6.a;
                i = x40Var.t;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (list2.isEmpty()) {
                        return a50.a;
                    }
                    ((z40) y40Var.p.getValue()).getClass();
                    list.getClass();
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((vbc) obj).b()) {
                            break;
                        }
                    }
                    vbc vbcVar = (vbc) obj;
                    int ordinal = (vbcVar != null ? z40.a(vbcVar) : fea.a).ordinal();
                    if (ordinal == 0) {
                        o0 = CollectionsKt.o0(list2, new C1318t(15));
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        o0 = CollectionsKt.o0(list2, new C1318t(14));
                    }
                    List list3 = o0;
                    ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                    it = list3.iterator();
                    collection = arrayList;
                    i2 = 0;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = x40Var.q;
                    i3 = x40Var.p;
                    collection = x40Var.o;
                    oq oqVar = x40Var.n;
                    jbj jbjVar = x40Var.m;
                    oq oqVar2 = x40Var.l;
                    it = x40Var.k;
                    Collection collection2 = x40Var.j;
                    qgg.h0(obj2);
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    jbjVar.getClass();
                    collection.add(new d9j(oqVar, jbj.e(oqVar2, booleanValue)));
                    collection = collection2;
                    if (it.hasNext()) {
                        kca kcaVar = (kca) it.next();
                        oqVar = kcaVar.a;
                        u3g u3gVar = (u3g) y40Var.m.getValue();
                        String str = kcaVar.a.a;
                        Collection collection3 = collection;
                        x40Var.j = collection3;
                        x40Var.k = it;
                        x40Var.l = oqVar;
                        jbj jbjVar2 = jbj.a;
                        x40Var.m = jbjVar2;
                        x40Var.n = oqVar;
                        x40Var.o = collection3;
                        x40Var.p = i3;
                        x40Var.q = i2;
                        x40Var.t = 1;
                        obj2 = ((t3g) u3gVar).k(str, x40Var);
                        if (obj2 == nm6Var) {
                            return nm6Var;
                        }
                        oqVar2 = oqVar;
                        jbjVar = jbjVar2;
                        collection2 = collection;
                        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                        jbjVar.getClass();
                        collection.add(new d9j(oqVar, jbj.e(oqVar2, booleanValue2)));
                        collection = collection2;
                        if (it.hasNext()) {
                            return new b50((List) collection);
                        }
                    }
                }
            }
        }
        x40Var = new x40(y40Var, continuation);
        Object obj22 = x40Var.r;
        nm6 nm6Var2 = nm6.a;
        i = x40Var.t;
        if (i != 0) {
        }
    }
}
