package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class fdf extends bfu {
    public final xdr k = ydr.a(kdf.b);
    public final xdr l = ydr.a(c5b.a);
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final jyr p;

    public fdf() {
        bdt I = hag.I(zx4.class);
        l18 l18Var = l18.b;
        this.m = l18Var.b(I, true);
        this.n = btf.b(new v1e(13, this));
        this.o = btf.b(new sxd(26));
        this.p = l18Var.b(hag.I(u3g.class), true);
        x97.y(ot0.F(this), null, null, new ptd(this, (Continuation) null, 5), 3);
    }

    public static final void G(fdf fdfVar, cfa cfaVar) {
        xdr xdrVar = fdfVar.l;
        ((hdf) fdfVar.o.getValue()).getClass();
        cfaVar.getClass();
        xdrVar.l(u75.h(new pbc(cfaVar == cfa.a), new kbc(cfaVar == cfa.b)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00fe -> B:10:0x0101). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(fdf fdfVar, List list, List list2, Continuation continuation) {
        ddf ddfVar;
        int i;
        Object obj;
        List o0;
        Iterator it;
        Collection collection;
        int i2;
        int i3;
        fdfVar.getClass();
        if (continuation instanceof ddf) {
            ddfVar = (ddf) continuation;
            int i4 = ddfVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ddfVar.t = i4 - Integer.MIN_VALUE;
                Object obj2 = ddfVar.r;
                nm6 nm6Var = nm6.a;
                i = ddfVar.t;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (list2.isEmpty()) {
                        return kdf.a;
                    }
                    ((hdf) fdfVar.o.getValue()).getClass();
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
                    int ordinal = (vbcVar != null ? hdf.a(vbcVar) : cfa.a).ordinal();
                    if (ordinal == 0) {
                        o0 = CollectionsKt.o0(list2, new zda(20));
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        o0 = CollectionsKt.o0(list2, new zda(19));
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
                    i2 = ddfVar.q;
                    i3 = ddfVar.p;
                    collection = ddfVar.o;
                    oq oqVar = ddfVar.n;
                    jbj jbjVar = ddfVar.m;
                    oq oqVar2 = ddfVar.l;
                    it = ddfVar.k;
                    Collection collection2 = ddfVar.j;
                    qgg.h0(obj2);
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    jbjVar.getClass();
                    collection.add(new d9j(oqVar, jbj.a(oqVar2, booleanValue)));
                    collection = collection2;
                    if (it.hasNext()) {
                        kca kcaVar = (kca) it.next();
                        oqVar = kcaVar.a;
                        u3g u3gVar = (u3g) fdfVar.p.getValue();
                        String str = kcaVar.a.a;
                        Collection collection3 = collection;
                        ddfVar.j = collection3;
                        ddfVar.k = it;
                        ddfVar.l = oqVar;
                        jbj jbjVar2 = jbj.a;
                        ddfVar.m = jbjVar2;
                        ddfVar.n = oqVar;
                        ddfVar.o = collection3;
                        ddfVar.p = i3;
                        ddfVar.q = i2;
                        ddfVar.t = 1;
                        obj2 = ((t3g) u3gVar).k(str, ddfVar);
                        if (obj2 == nm6Var) {
                            return nm6Var;
                        }
                        oqVar2 = oqVar;
                        jbjVar = jbjVar2;
                        collection2 = collection;
                        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                        jbjVar.getClass();
                        collection.add(new d9j(oqVar, jbj.a(oqVar2, booleanValue2)));
                        collection = collection2;
                        if (it.hasNext()) {
                            return new ndf((List) collection);
                        }
                    }
                }
            }
        }
        ddfVar = new ddf(fdfVar, continuation);
        Object obj22 = ddfVar.r;
        nm6 nm6Var2 = nm6.a;
        i = ddfVar.t;
        if (i != 0) {
        }
    }
}
