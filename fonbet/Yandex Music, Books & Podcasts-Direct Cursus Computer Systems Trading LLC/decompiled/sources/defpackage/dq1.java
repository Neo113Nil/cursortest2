package defpackage;

import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class dq1 extends xfg {
    public final vjg d;
    public final fq1 e;
    public final rw5 f;
    public final fu5 g;
    public final xdr h;
    public final fkn i;
    public final String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq1(oq7 oq7Var, vjg vjgVar, fq1 fq1Var, rw5 rw5Var, fu5 fu5Var) {
        super(oq7Var);
        oq7Var.getClass();
        vjgVar.getClass();
        rw5Var.getClass();
        fu5Var.getClass();
        this.d = vjgVar;
        this.e = fq1Var;
        this.f = rw5Var;
        this.g = fu5Var;
        xdr a = ydr.a(tp1.a);
        this.h = a;
        this.i = new fkn(a);
        this.j = "ArtistsConcerts";
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.d;
    }

    @Override // defpackage.xfg
    public final String b() {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // defpackage.xfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(mwk mwkVar, cg6 cg6Var) {
        cq1 cq1Var;
        int i;
        List list;
        ArrayList<zp2> arrayList;
        mwk mwkVar2;
        rj6 rj6Var;
        Object obj;
        Object obj2;
        if (cg6Var instanceof cq1) {
            cq1Var = (cq1) cg6Var;
            int i2 = cq1Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cq1Var.n = i2 - Integer.MIN_VALUE;
                Object obj3 = cq1Var.l;
                nm6 nm6Var = nm6.a;
                i = cq1Var.n;
                tp1 tp1Var = tp1.a;
                xdr xdrVar = this.h;
                vjg vjgVar = this.d;
                if (i != 0) {
                    qgg.h0(obj3);
                    mqs a = mwkVar.a();
                    if (a == null || (list = a.f) == null) {
                        return new c73(vjgVar);
                    }
                    ArrayList J = xp3.J(list, c5b.a);
                    if (J.isEmpty()) {
                        xdrVar.getClass();
                        xdrVar.m(null, tp1Var);
                        return new c73(vjgVar);
                    }
                    ArrayList arrayList2 = new ArrayList(v75.o(J, 10));
                    Iterator it = J.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((zp2) it.next()).a);
                    }
                    Long a2 = this.f.a();
                    String valueOf = a2 != null ? String.valueOf(a2.longValue()) : null;
                    cq1Var.j = mwkVar;
                    cq1Var.k = J;
                    cq1Var.n = 1;
                    Object a3 = this.e.a(cq1Var, valueOf, arrayList2);
                    if (a3 == nm6Var) {
                        return nm6Var;
                    }
                    arrayList = J;
                    obj3 = a3;
                    mwkVar2 = mwkVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = cq1Var.k;
                    mwkVar2 = cq1Var.j;
                    qgg.h0(obj3);
                }
                rj6Var = (rj6) obj3;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    xdrVar.getClass();
                    xdrVar.m(null, tp1Var);
                    return new c73(vjgVar);
                }
                ArrayList arrayList3 = ((gq1) ((qj6) rj6Var).a).a;
                if (arrayList3.isEmpty()) {
                    xdrVar.getClass();
                    xdrVar.m(null, tp1Var);
                    return new b73(vjgVar);
                }
                if (arrayList.size() <= 1) {
                    u51 O = ghh.O((zp2) CollectionsKt.P(arrayList));
                    Iterator it2 = arrayList3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((rp1) obj).a.equals(O.a)) {
                            break;
                        }
                    }
                    rp1 rp1Var = (rp1) obj;
                    ArrayList arrayList4 = rp1Var != null ? rp1Var.b : null;
                    if (arrayList4 == null) {
                        xdrVar.getClass();
                        xdrVar.m(null, tp1Var);
                        return new c73(vjgVar);
                    }
                    vp1 vp1Var = new vp1(vjgVar.c, O, l(arrayList4), mwkVar2);
                    xdrVar.getClass();
                    xdrVar.m(null, vp1Var);
                    return new d73(vjgVar);
                }
                ArrayList arrayList5 = new ArrayList();
                for (zp2 zp2Var : arrayList) {
                    Iterator it3 = arrayList3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it3.next();
                        if (Intrinsics.d(zp2Var.a, ((rp1) obj2).a)) {
                            break;
                        }
                    }
                    rp1 rp1Var2 = (rp1) obj2;
                    op1 op1Var = rp1Var2 == null ? null : new op1(new np1(zp2Var.b, zp2Var.g.getPathForSize(wct.s())), ghh.O(zp2Var), l(rp1Var2.b));
                    if (op1Var != null) {
                        arrayList5.add(op1Var);
                    }
                }
                if (arrayList5.isEmpty()) {
                    xdrVar.getClass();
                    xdrVar.m(null, tp1Var);
                    return new c73(vjgVar);
                }
                up1 up1Var = new up1(vjgVar.c, arrayList5, mwkVar2);
                xdrVar.getClass();
                xdrVar.m(null, up1Var);
                return new d73(vjgVar);
            }
        }
        cq1Var = new cq1(this, cg6Var);
        Object obj32 = cq1Var.l;
        nm6 nm6Var2 = nm6.a;
        i = cq1Var.n;
        tp1 tp1Var2 = tp1.a;
        xdr xdrVar2 = this.h;
        vjg vjgVar2 = this.d;
        if (i != 0) {
        }
        rj6Var = (rj6) obj32;
        if (rj6Var instanceof qj6) {
        }
    }

    public final ArrayList l(List list) {
        List<s26> q0 = CollectionsKt.q0(list, 6);
        ArrayList arrayList = new ArrayList(v75.o(q0, 10));
        for (s26 s26Var : q0) {
            fu5 fu5Var = this.g;
            fu5Var.getClass();
            uu5 uu5Var = fu5Var.b;
            s26Var.getClass();
            h06 h06Var = s26Var.a;
            wy5 wy5Var = (wy5) fu5Var.a.b;
            wy5Var.getClass();
            pw5 P = pcg.P(wy5Var, uu5Var, h06Var, s26Var.b);
            ZonedDateTime zonedDateTime = h06Var.f;
            zonedDateTime.getClass();
            arrayList.add(new pp1(P, h06Var, ((sld) uu5Var.k).I(zonedDateTime)));
        }
        return arrayList;
    }
}
