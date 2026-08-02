package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class gdf extends bfu {
    public final jyr k;
    public final xdr l;
    public final j6e m;
    public final xdr n;
    public final fkn o;
    public final j0q p;
    public final jyr q;
    public final jyr r;
    public final jyr s;
    public final jyr t;

    public gdf() {
        bdt I = hag.I(vxr.class);
        l18 l18Var = l18.b;
        this.k = l18Var.b(I, true);
        this.l = ydr.a(mdf.a);
        j6e j6eVar = new j6e(25);
        this.m = j6eVar;
        this.n = ydr.a(c5b.a);
        this.o = (fkn) j6eVar.b;
        this.p = new j0q();
        this.q = l18Var.b(hag.I(qy4.class), true);
        this.r = btf.b(new v1e(14, this));
        this.s = l18Var.b(hag.I(u3g.class), true);
        this.t = btf.b(new sxd(27));
        x97.y(ot0.F(this), null, null, new ptd(this, (Continuation) null, 6), 3);
    }

    public static final void G(gdf gdfVar, jdf jdfVar) {
        xdr xdrVar = gdfVar.n;
        ((idf) gdfVar.t.getValue()).getClass();
        jdfVar.getClass();
        xdrVar.l(u75.h(new nbc(jdfVar == jdf.a), new kbc(jdfVar == jdf.b)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0105 -> B:10:0x0108). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(gdf gdfVar, List list, List list2, Continuation continuation) {
        edf edfVar;
        int i;
        Object obj;
        Collection arrayList;
        Iterator it;
        int i2;
        int i3;
        gdfVar.getClass();
        if (continuation instanceof edf) {
            edfVar = (edf) continuation;
            int i4 = edfVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                edfVar.t = i4 - Integer.MIN_VALUE;
                Object obj2 = edfVar.r;
                nm6 nm6Var = nm6.a;
                i = edfVar.t;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (list2.isEmpty()) {
                        return ldf.a;
                    }
                    ((idf) gdfVar.t.getValue()).getClass();
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
                    int ordinal = (vbcVar != null ? idf.a(vbcVar) : jdf.a).ordinal();
                    if (ordinal == 0) {
                        list2 = CollectionsKt.o0(list2, new zda(18));
                    } else if (ordinal == 1) {
                        list2 = CollectionsKt.o0(list2, new zda(17));
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        su4.s(2, null, "sorting is not implemented", null);
                    }
                    List list3 = list2;
                    arrayList = new ArrayList(v75.o(list3, 10));
                    it = list3.iterator();
                    i2 = 0;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = edfVar.q;
                    i3 = edfVar.p;
                    arrayList = edfVar.o;
                    oq oqVar = edfVar.n;
                    jbj jbjVar = edfVar.m;
                    oq oqVar2 = edfVar.l;
                    it = edfVar.k;
                    Collection collection = edfVar.j;
                    qgg.h0(obj2);
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    jbjVar.getClass();
                    arrayList.add(new e9j(oqVar, jbj.a(oqVar2, booleanValue)));
                    arrayList = collection;
                    if (it.hasNext()) {
                        oqVar = (oq) it.next();
                        u3g u3gVar = (u3g) gdfVar.s.getValue();
                        String str = oqVar.a;
                        Collection collection2 = arrayList;
                        edfVar.j = collection2;
                        edfVar.k = it;
                        edfVar.l = oqVar;
                        jbj jbjVar2 = jbj.a;
                        edfVar.m = jbjVar2;
                        edfVar.n = oqVar;
                        edfVar.o = collection2;
                        edfVar.p = i3;
                        edfVar.q = i2;
                        edfVar.t = 1;
                        obj2 = ((t3g) u3gVar).k(str, edfVar);
                        if (obj2 == nm6Var) {
                            return nm6Var;
                        }
                        oqVar2 = oqVar;
                        jbjVar = jbjVar2;
                        collection = arrayList;
                        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                        jbjVar.getClass();
                        arrayList.add(new e9j(oqVar, jbj.a(oqVar2, booleanValue2)));
                        arrayList = collection;
                        if (it.hasNext()) {
                            return new odf((List) arrayList);
                        }
                    }
                }
            }
        }
        edfVar = new edf(gdfVar, continuation);
        Object obj22 = edfVar.r;
        nm6 nm6Var2 = nm6.a;
        i = edfVar.t;
        if (i != 0) {
        }
    }
}
