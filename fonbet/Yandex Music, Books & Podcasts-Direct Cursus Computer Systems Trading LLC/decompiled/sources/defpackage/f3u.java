package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class f3u extends bfu {
    public final x1u k;
    public final k68 l;
    public final l0t m;
    public final xdr n;
    public final xdr o;

    public f3u(x1u x1uVar, k68 k68Var, l0t l0tVar) {
        x1uVar.getClass();
        k68Var.getClass();
        l0tVar.getClass();
        this.k = x1uVar;
        this.l = k68Var;
        this.m = l0tVar;
        xdr a = ydr.a(y2u.a);
        this.n = a;
        this.o = a;
        x97.y(ot0.F(this), null, null, new e3u(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0074 -> B:10:0x0077). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f3u f3uVar, cg6 cg6Var) {
        d3u d3uVar;
        int i;
        int i2;
        Iterator it;
        Collection collection;
        int i3;
        int i4;
        String str;
        if (cg6Var instanceof d3u) {
            d3uVar = (d3u) cg6Var;
            int i5 = d3uVar.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                d3uVar.q = i5 - Integer.MIN_VALUE;
                Object obj = d3uVar.o;
                nm6 nm6Var = nm6.a;
                i = d3uVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    ArrayList m = lxe.m(f3uVar.k.k);
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
                    i3 = d3uVar.n;
                    i2 = d3uVar.m;
                    i4 = d3uVar.l;
                    it = d3uVar.k;
                    collection = d3uVar.j;
                    qgg.h0(obj);
                    a58 a58Var = (a58) obj;
                    String str2 = (a58Var != null || (str = a58Var.d) == null) ? null : (String) avf.Q(str);
                    if (str2 != null) {
                        collection.add(str2);
                    }
                    if (it.hasNext()) {
                        hs5 hs5Var = (hs5) it.next();
                        k68 k68Var = f3uVar.l;
                        d3uVar.j = collection;
                        d3uVar.k = it;
                        d3uVar.l = i4;
                        d3uVar.m = i2;
                        d3uVar.n = i3;
                        d3uVar.q = 1;
                        obj = k68Var.a(hs5Var, d3uVar);
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
        d3uVar = new d3u(f3uVar, cg6Var);
        Object obj2 = d3uVar.o;
        nm6 nm6Var2 = nm6.a;
        i = d3uVar.q;
        if (i != 0) {
        }
    }
}
