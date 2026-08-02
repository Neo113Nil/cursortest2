package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wn1 extends bnc {
    public final vjg d;
    public final pm1 e;
    public final om1 f;
    public final qm1 g;
    public final ri1 h;
    public final jyr i;
    public final xdr j;
    public final fkn k;

    public wn1(vjg vjgVar, e0j e0jVar, pm1 pm1Var, om1 om1Var, qm1 qm1Var, ri1 ri1Var) {
        vjgVar.getClass();
        e0jVar.getClass();
        pm1Var.getClass();
        om1Var.getClass();
        qm1Var.getClass();
        this.d = vjgVar;
        this.e = pm1Var;
        this.f = om1Var;
        this.g = qm1Var;
        this.h = ri1Var;
        this.i = btf.b(new w2(e0jVar, 16));
        xdr a = ydr.a(new an1(1, true));
        this.j = a;
        this.k = new fkn(a);
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // defpackage.ufg
    public final pjc f(mm6 mm6Var, boolean z) {
        ?? r3;
        ArrayList arrayList;
        List list;
        n7q n7qVar;
        mm6Var.getClass();
        d6l x = p6g.x((e6l) ((oq7) this.e.a.a.getValue()).a.c.getValue());
        mwk b = (x == null || (n7qVar = x.a) == null) ? null : n7qVar.b();
        zm1 zm1Var = zm1.a;
        xdr xdrVar = this.j;
        if (b == null) {
            xdrVar.getClass();
            xdrVar.m(null, zm1Var);
            return new fs(15, new c73(a()));
        }
        mqs a = b.a();
        if (a == null || (list = a.f) == null) {
            r3 = c5b.a;
        } else {
            c5b c5bVar = c5b.a;
            c5bVar.getClass();
            ArrayList J = xp3.J(list, c5bVar);
            r3 = new ArrayList();
            Iterator it = J.iterator();
            while (it.hasNext()) {
                zp2 zp2Var = (zp2) it.next();
                zp2Var.getClass();
                String str = zp2Var.a;
                if (str != null) {
                    r3.add(str);
                }
            }
        }
        cn1 cn1Var = (cn1) xdrVar.getValue();
        if (cn1Var instanceof bn1) {
            List list2 = ((bn1) cn1Var).a;
            arrayList = new ArrayList(v75.o(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((dn1) it2.next()).c.a);
            }
        } else {
            if (!Intrinsics.d(cn1Var, zm1Var) && !(cn1Var instanceof an1)) {
                b6e.s();
                return null;
            }
            arrayList = null;
        }
        if (!Intrinsics.d(arrayList, r3)) {
            an1 an1Var = new an1(r3.size(), true);
            xdrVar.getClass();
            xdrVar.m(null, an1Var);
        }
        return new eno(new vn1(this, (List) r3, z, b, (Continuation) null));
    }
}
