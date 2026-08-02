package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ncc {
    public final ddc a;
    public final tf6 b;
    public Long c;
    public Set d;
    public rar e;
    public final xdr f;
    public final fkn g;

    public ncc(frt frtVar, ddc ddcVar) {
        frtVar.getClass();
        this.a = ddcVar;
        tf6 e = gld.e(dm6.b);
        this.b = e;
        xdr a = ydr.a(pcc.a);
        this.f = a;
        this.g = new fkn(a);
        ox6.B(q6k.m(frtVar.g(), new qxb(26), q6k.g), e, new u58(22, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final scc a(ncc nccVar, ucc uccVar) {
        nccVar.getClass();
        if (uccVar == null) {
            return qcc.a;
        }
        List list = uccVar.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            zbc zbcVar = null;
            HashSet hashSet = null;
            if (!it.hasNext()) {
                break;
            }
            ecc eccVar = (ecc) it.next();
            if (!eccVar.a.equals("all")) {
                Set set = eccVar.c;
                if (set != null) {
                    hashSet = new HashSet();
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        rr5 t = q6k.t((String) it2.next());
                        if (t != null) {
                            hashSet.add(t);
                        }
                    }
                }
                if (zbcVar == null) {
                    arrayList.add(zbcVar);
                }
            }
            zbcVar = new zbc(eccVar.a, eccVar.b, hashSet);
            if (zbcVar == null) {
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            Set set2 = ((zbc) next).c;
            if (set2 == null || set2.size() >= 8) {
                arrayList2.add(next);
            }
        }
        List q0 = CollectionsKt.q0(arrayList2, 8);
        List list2 = q0.size() >= 3 ? q0 : null;
        return list2 == null ? occ.a : new rcc(list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(ncc nccVar, HashSet hashSet, cg6 cg6Var) {
        mcc mccVar;
        int i;
        rj6 rj6Var;
        Object obj;
        xdr xdrVar = nccVar.f;
        if (cg6Var instanceof mcc) {
            mccVar = (mcc) cg6Var;
            int i2 = mccVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mccVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = mccVar.j;
                nm6 nm6Var = nm6.a;
                i = mccVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    ddc ddcVar = nccVar.a;
                    mccVar.l = 1;
                    obj2 = x97.V(dm6.b, new fzb(ddcVar, hashSet, continuation, 6), mccVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                rj6Var = (rj6) obj2;
                if (!(rj6Var instanceof qj6)) {
                    List list = (List) ((qj6) rj6Var).a;
                    if (list.isEmpty()) {
                        return c5b.a;
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((ecc) obj).a.equals("all")) {
                            break;
                        }
                    }
                    if (obj != null) {
                        return list;
                    }
                    if (xdrVar.getValue() instanceof qcc) {
                        return c5b.a;
                    }
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    if (xdrVar.getValue() instanceof qcc) {
                        return c5b.a;
                    }
                }
                return null;
            }
        }
        mccVar = new mcc(nccVar, cg6Var);
        Object obj22 = mccVar.j;
        nm6 nm6Var2 = nm6.a;
        i = mccVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        rj6Var = (rj6) obj22;
        if (!(rj6Var instanceof qj6)) {
        }
        return null;
    }

    public final void c(HashSet hashSet) {
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            hashSet2.add(((rr5) it.next()).e());
        }
        Long l = this.c;
        Set set = this.d;
        if (l == null || set == null || System.currentTimeMillis() - l.longValue() > 86400000 || !hashSet2.equals(set)) {
            rar rarVar = this.e;
            if (rarVar != null) {
                rarVar.g(null);
            }
            this.e = x97.y(this.b, null, null, new av7(hashSet, this, hashSet2, (Continuation) null), 3);
        }
    }
}
