package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class cka implements rnq, wmm {
    public final mja a;
    public final rmb b;
    public final qja c;
    public final o8q d;
    public boolean e;
    public rar f;
    public kzp g;
    public final xdr h;
    public final xdr i;
    public final xdr j;
    public final fkn k;
    public final by7 l;

    public cka(mja mjaVar, rmb rmbVar, qja qjaVar, o8q o8qVar) {
        Object obj;
        mjaVar.getClass();
        qjaVar.getClass();
        o8qVar.getClass();
        this.a = mjaVar;
        this.b = rmbVar;
        this.c = qjaVar;
        this.d = o8qVar;
        this.h = ydr.a(c5b.a);
        this.i = ydr.a(rr3.a);
        int i = mjaVar.b;
        if (i > 0) {
            obj = new sja(i > 12 ? 12 : i);
        } else {
            obj = vja.a;
        }
        xdr a = ydr.a(obj);
        this.j = a;
        this.k = new fkn(a);
        this.l = asq.K(a, new xga(4));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[LOOP:0: B:11:0x0070->B:13:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(cg6 cg6Var) {
        aka akaVar;
        int i;
        Iterator it;
        if (cg6Var instanceof aka) {
            akaVar = (aka) cg6Var;
            int i2 = akaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                akaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = akaVar.j;
                nm6 nm6Var = nm6.a;
                i = akaVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    yx4 yx4Var = (yx4) this.c.a.getValue();
                    bca bcaVar = new bca(yx4.y(new pjc[]{((e6q) yx4Var.a).e}, new sx4(yx4Var, false, continuation, 0 == true ? 1 : 0)), 18);
                    akaVar.l = 1;
                    obj = zsd.g0(bcaVar, akaVar);
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
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((jja) it.next()).a);
                }
                return arrayList;
            }
        }
        akaVar = new aka(this, cg6Var);
        Object obj2 = akaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = akaVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    @Override // defpackage.wmm
    public final void cancel() {
        ssg.a(3, "Collection:Skeleton:DownloadedTracksBlock", hrg.q("Block cancel[", this.a.a.a, "]"), null);
        rar rarVar = this.f;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.f = null;
        this.e = false;
    }

    @Override // defpackage.wmm
    public final void h() {
        ssg.a(3, "Collection:Skeleton:DownloadedTracksBlock", vz1.p("Block reload[", this.a.a.a, "]: ready=", !(this.j.getValue() instanceof sja)), null);
        cancel();
    }

    @Override // defpackage.wmm
    public final void k(kzp kzpVar) {
        this.g = kzpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wmm
    public final void l(mm6 mm6Var) {
        if (this.e) {
            return;
        }
        int i = 3;
        Continuation continuation = null;
        ssg.a(3, "Collection:Skeleton:DownloadedTracksBlock", vz1.p("Block load[", this.a.a.a, "]: ready=", !(this.j.getValue() instanceof sja)), null);
        rar rarVar = this.f;
        if (rarVar != null) {
            rarVar.g(null);
        }
        qja qjaVar = this.c;
        yx4 yx4Var = (yx4) qjaVar.a.getValue();
        bca bcaVar = new bca(yx4.y(new pjc[]{((e6q) yx4Var.a).e}, new sx4(yx4Var, false, continuation, 0 == true ? 1 : 0)), 11);
        yx4 yx4Var2 = (yx4) qjaVar.a.getValue();
        this.f = ox6.B(zsd.b0(zsd.Q(this.i, bcaVar, new bca(yx4.y(new pjc[]{((e6q) yx4Var2.a).e, yx4Var2.c.e, yx4Var2.b.e}, new hv0(yx4Var2, continuation, i)), 10), new a35(this, continuation, 5))), mm6Var, new u58(11, this));
    }
}
