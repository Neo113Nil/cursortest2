package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class n8i extends xmm {
    public final s63 d;
    public final rmb e;
    public final m7i f;
    public final l7i g;
    public final boolean h;
    public final u7i i;
    public final xdr j;
    public final fkn k;

    public n8i(s63 s63Var, rmb rmbVar, m7i m7iVar) {
        String str;
        this.d = s63Var;
        this.e = rmbVar;
        this.f = m7iVar;
        l7i l7iVar = (l7i) s63Var.a;
        this.g = l7iVar;
        this.h = l7iVar.d != null && ((str = l7iVar.c) == null || StringsKt.U(str));
        String str2 = l7iVar.a.b;
        str2.getClass();
        this.i = str2.equals("MIXES_GRID") ? u7i.c : str2.equals("MIXES") ? u7i.a : u7i.b;
        xdr a = ydr.a(p(true));
        this.j = a;
        this.k = new fkn(a);
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.g;
    }

    @Override // defpackage.xmm
    public final boolean n() {
        fkn fknVar = this.k;
        return (fknVar.a.getValue() instanceof r7i) || (fknVar.a.getValue() instanceof o7i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        m8i m8iVar;
        int i;
        rj6 rj6Var;
        Object r7iVar;
        if (cg6Var instanceof m8i) {
            m8iVar = (m8i) cg6Var;
            int i2 = m8iVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m8iVar.l = i2 - Integer.MIN_VALUE;
                Object obj = m8iVar.j;
                nm6 nm6Var = nm6.a;
                i = m8iVar.l;
                l7i l7iVar = this.g;
                xdr xdrVar = this.j;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        t7i p = p(true);
                        xdrVar.getClass();
                        xdrVar.m(null, p);
                    }
                    m8iVar.l = 1;
                    obj = this.f.a(l7iVar, z, m8iVar);
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
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    if (!n()) {
                        t7i p2 = p(false);
                        xdrVar.getClass();
                        xdrVar.m(null, p2);
                    }
                    ((pj6) rj6Var).a();
                    return new c73(l7iVar);
                }
                List list = (List) ((qj6) rj6Var).a;
                rmb.h(this.e, list.size(), 2);
                int ordinal = this.i.ordinal();
                boolean z2 = this.h;
                if (ordinal == 0) {
                    if (z2) {
                        ArrayList arrayList = new ArrayList(list);
                        arrayList.add(d8i.a);
                        list = arrayList;
                    }
                    r7iVar = new r7i(list, true);
                } else if (ordinal == 1) {
                    if (z2) {
                        list = CollectionsKt.h0(list, e8i.a);
                    }
                    r7iVar = new r7i(list, false);
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    List list2 = list;
                    Integer num = l7iVar.b.b;
                    r7iVar = new o7i(CollectionsKt.q0(list2, (num == null || num.intValue() <= 0) ? 6 : num.intValue()));
                }
                xdrVar.getClass();
                xdrVar.m(null, r7iVar);
                return new d73(l7iVar);
            }
        }
        m8iVar = new m8i(this, cg6Var);
        Object obj2 = m8iVar.j;
        nm6 nm6Var2 = nm6.a;
        i = m8iVar.l;
        l7i l7iVar2 = this.g;
        xdr xdrVar2 = this.j;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }

    public final t7i p(boolean z) {
        int ordinal = this.i.ordinal();
        boolean z2 = this.h;
        int i = 0;
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList(4);
            while (i < 4) {
                arrayList.add(h8i.a);
                i++;
            }
            if (z2) {
                arrayList.add(i8i.a);
            }
            return new q7i(arrayList, z);
        }
        g8i g8iVar = g8i.a;
        if (ordinal == 1) {
            ArrayList arrayList2 = new ArrayList(4);
            while (i < 4) {
                arrayList2.add(g8iVar);
                i++;
            }
            if (z2) {
                arrayList2.add(j8i.a);
            }
            return new q7i(arrayList2, z);
        }
        if (ordinal != 2) {
            b6e.s();
            return null;
        }
        Integer num = this.g.b.b;
        int intValue = (num == null || num.intValue() <= 0) ? 6 : num.intValue();
        ArrayList arrayList3 = new ArrayList(intValue);
        while (i < intValue) {
            arrayList3.add(g8iVar);
            i++;
        }
        return new n7i(arrayList3, z);
    }
}
