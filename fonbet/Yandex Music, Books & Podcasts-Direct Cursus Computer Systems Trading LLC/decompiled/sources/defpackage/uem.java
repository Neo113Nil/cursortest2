package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class uem extends bfu {
    public final xdr k = ydr.a(wem.b);
    public final xdr l = ydr.a(c5b.a);
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final jyr p;

    public uem() {
        bdt I = hag.I(zx4.class);
        l18 l18Var = l18.b;
        this.m = l18Var.b(I, true);
        this.n = btf.b(new ril(22, this));
        this.o = btf.b(new hvl(21));
        this.p = l18Var.b(hag.I(u3g.class), true);
        x97.y(ot0.F(this), null, null, new b5l(this, null, 26), 3);
    }

    public static final void G(uem uemVar, lha lhaVar) {
        xdr xdrVar = uemVar.l;
        ((vem) uemVar.o.getValue()).getClass();
        lhaVar.getClass();
        xdrVar.l(u75.h(new pbc(lhaVar == lha.a), new kbc(lhaVar == lha.b)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00fe -> B:10:0x0101). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(uem uemVar, List list, List list2, Continuation continuation) {
        tem temVar;
        int i;
        Object obj;
        List o0;
        Iterator it;
        Collection collection;
        int i2;
        int i3;
        uemVar.getClass();
        if (continuation instanceof tem) {
            temVar = (tem) continuation;
            int i4 = temVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                temVar.t = i4 - Integer.MIN_VALUE;
                Object obj2 = temVar.r;
                nm6 nm6Var = nm6.a;
                i = temVar.t;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (list2.isEmpty()) {
                        return wem.a;
                    }
                    ((vem) uemVar.o.getValue()).getClass();
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
                    int ordinal = (vbcVar != null ? vem.a(vbcVar) : lha.a).ordinal();
                    if (ordinal == 0) {
                        o0 = CollectionsKt.o0(list2, new ehf(26));
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        o0 = CollectionsKt.o0(list2, new ehf(25));
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
                    i2 = temVar.q;
                    i3 = temVar.p;
                    collection = temVar.o;
                    oq oqVar = temVar.n;
                    jbj jbjVar = temVar.m;
                    oq oqVar2 = temVar.l;
                    it = temVar.k;
                    Collection collection2 = temVar.j;
                    qgg.h0(obj2);
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    jbjVar.getClass();
                    collection.add(new d9j(oqVar, jbj.e(oqVar2, booleanValue)));
                    collection = collection2;
                    if (it.hasNext()) {
                        kca kcaVar = (kca) it.next();
                        oqVar = kcaVar.a;
                        u3g u3gVar = (u3g) uemVar.p.getValue();
                        String str = kcaVar.a.a;
                        Collection collection3 = collection;
                        temVar.j = collection3;
                        temVar.k = it;
                        temVar.l = oqVar;
                        jbj jbjVar2 = jbj.a;
                        temVar.m = jbjVar2;
                        temVar.n = oqVar;
                        temVar.o = collection3;
                        temVar.p = i3;
                        temVar.q = i2;
                        temVar.t = 1;
                        obj2 = ((t3g) u3gVar).k(str, temVar);
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
                            return new xem((List) collection);
                        }
                    }
                }
            }
        }
        temVar = new tem(uemVar, continuation);
        Object obj22 = temVar.r;
        nm6 nm6Var2 = nm6.a;
        i = temVar.t;
        if (i != 0) {
        }
    }
}
