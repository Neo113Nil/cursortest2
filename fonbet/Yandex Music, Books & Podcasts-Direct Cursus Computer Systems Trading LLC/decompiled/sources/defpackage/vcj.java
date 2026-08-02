package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class vcj extends bfu {
    public final mqs k;
    public final k68 l;
    public final tbb m;
    public final xdr n;
    public final xdr o;

    public vcj(mqs mqsVar, k68 k68Var, tbb tbbVar) {
        mqsVar.getClass();
        this.k = mqsVar;
        this.l = k68Var;
        this.m = tbbVar;
        xdr a = ydr.a(ocj.a);
        this.n = a;
        this.o = a;
        x97.y(ot0.F(this), dm6.b, null, new h1j(this, (Continuation) null, 6), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0076 -> B:10:0x0079). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(vcj vcjVar, cg6 cg6Var) {
        ucj ucjVar;
        int i;
        int i2;
        Iterator it;
        Collection collection;
        int i3;
        int i4;
        String str;
        if (cg6Var instanceof ucj) {
            ucjVar = (ucj) cg6Var;
            int i5 = ucjVar.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                ucjVar.q = i5 - Integer.MIN_VALUE;
                Object obj = ucjVar.o;
                nm6 nm6Var = nm6.a;
                i = ucjVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    ArrayList m = lxe.m(vcjVar.k.h());
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
                    i3 = ucjVar.n;
                    i2 = ucjVar.m;
                    i4 = ucjVar.l;
                    it = ucjVar.k;
                    collection = ucjVar.j;
                    qgg.h0(obj);
                    a58 a58Var = (a58) obj;
                    String str2 = (a58Var != null || (str = a58Var.d) == null) ? null : (String) avf.Q(str);
                    if (str2 != null) {
                        collection.add(str2);
                    }
                    if (it.hasNext()) {
                        hs5 hs5Var = (hs5) it.next();
                        k68 k68Var = vcjVar.l;
                        ucjVar.j = collection;
                        ucjVar.k = it;
                        ucjVar.l = i4;
                        ucjVar.m = i2;
                        ucjVar.n = i3;
                        ucjVar.q = 1;
                        obj = k68Var.a(hs5Var, ucjVar);
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
        ucjVar = new ucj(vcjVar, cg6Var);
        Object obj2 = ucjVar.o;
        nm6 nm6Var2 = nm6.a;
        i = ucjVar.q;
        if (i != 0) {
        }
    }
}
