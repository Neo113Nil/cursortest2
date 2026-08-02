package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class eka {
    public final o3t a;
    public final i5h b;

    public eka(o3t o3tVar, i5h i5hVar) {
        this.a = o3tVar;
        this.b = i5hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d5, code lost:
    
        if (r3 != r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, vhn vhnVar, Boolean bool, Integer num, Boolean bool2, cg6 cg6Var) {
        dka dkaVar;
        int i;
        ArrayList arrayList;
        String str2;
        vhn vhnVar2;
        Boolean bool3;
        Integer num2;
        ArrayList arrayList2;
        if (cg6Var instanceof dka) {
            dkaVar = (dka) cg6Var;
            int i2 = dkaVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dkaVar.q = i2 - Integer.MIN_VALUE;
                Object obj = dkaVar.o;
                nm6 nm6Var = nm6.a;
                i = dkaVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    ArrayList b = this.a.b(str);
                    if (bool2 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = b.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (Boolean.valueOf(((ija) next).c).equals(bool2)) {
                                arrayList3.add(next);
                            }
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = b;
                    }
                    String X = CollectionsKt.X(arrayList, StringUtil.SPACE, null, null, new xga(5), 30);
                    dkaVar.j = vhnVar;
                    dkaVar.k = bool;
                    dkaVar.l = num;
                    dkaVar.m = arrayList;
                    dkaVar.n = X;
                    dkaVar.q = 1;
                    Object b2 = this.b.b(str, dkaVar);
                    if (b2 != nm6Var) {
                        str2 = X;
                        vhnVar2 = vhnVar;
                        bool3 = bool;
                        num2 = num;
                        arrayList2 = arrayList;
                        obj = b2;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    List list = (List) obj;
                    ArrayList arrayList4 = new ArrayList(v75.o(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(ngg.M((rxs) it2.next()));
                    }
                    return arrayList4;
                }
                String str3 = dkaVar.n;
                ArrayList arrayList5 = dkaVar.m;
                Integer num3 = dkaVar.l;
                Boolean bool4 = dkaVar.k;
                vhn vhnVar3 = dkaVar.j;
                qgg.h0(obj);
                str2 = str3;
                arrayList2 = arrayList5;
                num2 = num3;
                bool3 = bool4;
                vhnVar2 = vhnVar3;
                ueo ueoVar = (ueo) obj;
                qca qcaVar = new qca(ueoVar, (Continuation) null, str2, num2, arrayList2, vhnVar2, bool3);
                dkaVar.j = null;
                dkaVar.k = null;
                dkaVar.l = null;
                dkaVar.m = null;
                dkaVar.n = null;
                dkaVar.q = 2;
                obj = tyf.N(ueoVar, qcaVar, dkaVar);
            }
        }
        dkaVar = new dka(this, cg6Var);
        Object obj2 = dkaVar.o;
        nm6 nm6Var2 = nm6.a;
        i = dkaVar.q;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        qca qcaVar2 = new qca(ueoVar2, (Continuation) null, str2, num2, arrayList2, vhnVar2, bool3);
        dkaVar.j = null;
        dkaVar.k = null;
        dkaVar.l = null;
        dkaVar.m = null;
        dkaVar.n = null;
        dkaVar.q = 2;
        obj2 = tyf.N(ueoVar2, qcaVar2, dkaVar);
    }
}
