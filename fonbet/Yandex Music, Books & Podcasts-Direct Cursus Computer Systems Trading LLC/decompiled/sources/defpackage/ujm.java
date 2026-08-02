package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ujm extends bfu {
    public final kjm k;
    public final njm l;
    public final k68 m;
    public final lkm n;
    public final fkn o;
    public final xdr p;
    public final xdr q;

    public ujm(kjm kjmVar, njm njmVar, k68 k68Var, lkm lkmVar) {
        this.k = kjmVar;
        this.l = njmVar;
        this.m = k68Var;
        this.n = lkmVar;
        this.o = zsd.F0(new ail(9, lkmVar.a().b().b, lkmVar), ot0.F(this), lbq.b, Boolean.FALSE);
        xdr a = ydr.a(qjm.a);
        this.p = a;
        this.q = a;
        String str = kjmVar.b;
        str.getClass();
        xdr xdrVar = lkmVar.b;
        xdrVar.getClass();
        xdrVar.m(null, str);
        x97.y(ot0.F(this), null, null, new y7b(this, null, 8), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0081 -> B:10:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ujm ujmVar, cg6 cg6Var) {
        tjm tjmVar;
        int i;
        List list;
        int i2;
        Iterator it;
        Collection collection;
        int i3;
        int i4;
        String str;
        if (cg6Var instanceof tjm) {
            tjmVar = (tjm) cg6Var;
            int i5 = tjmVar.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                tjmVar.q = i5 - Integer.MIN_VALUE;
                Object obj = tjmVar.o;
                nm6 nm6Var = nm6.a;
                i = tjmVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    zjm zjmVar = ujmVar.k.k;
                    if (zjmVar == null || (list = (List) zjmVar.d.getValue()) == null) {
                        return null;
                    }
                    ArrayList m = lxe.m(list);
                    ArrayList arrayList = new ArrayList();
                    i2 = 0;
                    it = m.iterator();
                    collection = arrayList;
                    i3 = 0;
                    i4 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = tjmVar.n;
                    i2 = tjmVar.m;
                    i4 = tjmVar.l;
                    it = tjmVar.k;
                    collection = tjmVar.j;
                    qgg.h0(obj);
                    a58 a58Var = (a58) obj;
                    String str2 = (a58Var != null || (str = a58Var.d) == null) ? null : (String) avf.Q(str);
                    if (str2 != null) {
                        collection.add(str2);
                    }
                    if (it.hasNext()) {
                        hs5 hs5Var = (hs5) it.next();
                        k68 k68Var = ujmVar.m;
                        tjmVar.j = collection;
                        tjmVar.k = it;
                        tjmVar.l = i4;
                        tjmVar.m = i2;
                        tjmVar.n = i3;
                        tjmVar.q = 1;
                        obj = k68Var.a(hs5Var, tjmVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        a58 a58Var2 = (a58) obj;
                        if (a58Var2 != null) {
                        }
                        if (str2 != null) {
                        }
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        tjmVar = new tjm(ujmVar, cg6Var);
        Object obj2 = tjmVar.o;
        nm6 nm6Var2 = nm6.a;
        i = tjmVar.q;
        if (i != 0) {
        }
    }
}
