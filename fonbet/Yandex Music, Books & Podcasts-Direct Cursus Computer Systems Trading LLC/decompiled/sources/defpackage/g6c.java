package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class g6c implements rnq, wmm {
    public final q5c a;
    public final rmb b;
    public final jyr c;
    public final boolean d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final qc4 h;
    public String i;
    public final jyr j;
    public cq4 k;
    public boolean l;
    public rar m;
    public kzp n;
    public final xdr o;
    public final xdr p;
    public final fkn q;

    public g6c(q5c q5cVar, rmb rmbVar) {
        Object obj;
        q5cVar.getClass();
        this.a = q5cVar;
        this.b = rmbVar;
        jyr b = btf.b(wg.q);
        this.c = b;
        ((r5c) b.getValue()).getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        boolean h = ((fy4) ((byb) qdcVar.C(I)).b(fy4.class)).h();
        this.d = h;
        final int i = 0;
        this.e = btf.b(new Function0(this) { // from class: d6c
            public final /* synthetic */ g6c b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (ncc) ((xul) ((r5c) this.b.c.getValue()).b.getValue()).a.getValue();
                    case 1:
                        String a = ((pzk) ((xul) ((r5c) this.b.c.getValue()).b.getValue()).c.getValue()).a();
                        return a == null ? "all" : a;
                    default:
                        return ydr.a((String) this.b.f.getValue());
                }
            }
        });
        final int i2 = 1;
        this.f = btf.b(new Function0(this) { // from class: d6c
            public final /* synthetic */ g6c b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (ncc) ((xul) ((r5c) this.b.c.getValue()).b.getValue()).a.getValue();
                    case 1:
                        String a = ((pzk) ((xul) ((r5c) this.b.c.getValue()).b.getValue()).c.getValue()).a();
                        return a == null ? "all" : a;
                    default:
                        return ydr.a((String) this.b.f.getValue());
                }
            }
        });
        final int i3 = 2;
        this.g = btf.b(new Function0(this) { // from class: d6c
            public final /* synthetic */ g6c b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (ncc) ((xul) ((r5c) this.b.c.getValue()).b.getValue()).a.getValue();
                    case 1:
                        String a = ((pzk) ((xul) ((r5c) this.b.c.getValue()).b.getValue()).c.getValue()).a();
                        return a == null ? "all" : a;
                    default:
                        return ydr.a((String) this.b.f.getValue());
                }
            }
        });
        this.h = new qc4();
        this.j = btf.b(wg.r);
        this.o = ydr.a(c5b.a);
        cvl cvlVar = q5cVar.b;
        if (cvlVar == null || cvlVar.g < 1) {
            obj = y5c.a;
        } else {
            obj = new v5c(cvlVar, h ? kdc.a : idc.a);
        }
        xdr a = ydr.a(obj);
        this.p = a;
        this.q = new fkn(a);
    }

    public static final ArrayList b(g6c g6cVar, List list) {
        List<mqs> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (mqs mqsVar : list2) {
            arrayList.add(new jo6(oo6.a.a(mqsVar), mqsVar));
        }
        return arrayList;
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.a;
    }

    @Override // defpackage.wmm
    public final void cancel() {
        ssg.a(3, "Collection:Skeleton:FavoritePlaylistBlock", hrg.q("Block cancel[", this.a.a.a, "]"), null);
        this.k = null;
        m();
    }

    @Override // defpackage.wmm
    public final void h() {
        ssg.a(3, "Collection:Skeleton:FavoritePlaylistBlock", vz1.p("Block reload[", this.a.a.a, "]: ready=", !(this.p.getValue() instanceof v5c)), null);
        cancel();
    }

    @Override // defpackage.wmm
    public final void k(kzp kzpVar) {
        this.n = kzpVar;
    }

    @Override // defpackage.wmm
    public final void l(mm6 mm6Var) {
        ssg.a(3, "Collection:Skeleton:FavoritePlaylistBlock", vz1.p("Block load[", this.a.a.a, "]: ready=", !(this.p.getValue() instanceof v5c)), null);
        this.k = (cq4) mm6Var;
        m();
    }

    public final void m() {
        rar B;
        cq4 cq4Var = this.k;
        Continuation continuation = null;
        if (cq4Var == null || !this.l) {
            rar rarVar = this.m;
            if (rarVar != null) {
                rarVar.g(null);
            }
            this.m = null;
            return;
        }
        if (this.m == null) {
            boolean z = this.d;
            jyr jyrVar = this.j;
            if (z) {
                s5c s5cVar = ((u5c) jyrVar.getValue()).a;
                s5cVar.getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(frt.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                String str = ((frt) qdcVar.C(I)).c().a;
                str.getClass();
                e15 e15Var = (e15) s5cVar.a.getValue();
                String str2 = ((frt) s5cVar.b.getValue()).c().a;
                e15Var.getClass();
                str2.getClass();
                B = ox6.B(zsd.b0(zsd.k0(zsd.P(new k05(e15Var.h("playlist"), e15Var, str, str2, 0), zsd.b0(((u5c) this.j.getValue()).a.b(null)), ((ncc) this.e.getValue()).g, (bqi) this.g.getValue(), new ab5(this, continuation, 2)), dm6.b)), cq4Var, new e6c(this, 0));
            } else {
                B = ox6.B(zsd.b0(((u5c) jyrVar.getValue()).a.b(12)), cq4Var, new e6c(this, 1));
            }
            this.m = B;
        }
    }
}
