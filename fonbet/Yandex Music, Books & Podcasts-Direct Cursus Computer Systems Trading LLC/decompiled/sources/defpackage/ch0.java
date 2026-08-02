package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ch0 implements muk {
    public nwf a;
    public rar b;
    public bxf c;
    public x0q d;

    @Override // defpackage.muk
    public final void a() {
        j(null);
    }

    @Override // defpackage.muk
    public final void b() {
        rar rarVar = this.b;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.b = null;
        xpi i = i();
        if (i != null) {
            ((x0q) i).g();
        }
    }

    @Override // defpackage.muk
    public final void c(ybs ybsVar, ybs ybsVar2) {
        bxf bxfVar = this.c;
        if (bxfVar != null) {
            boolean z = (rds.a(bxfVar.h.b, ybsVar2.b) && Intrinsics.d(bxfVar.h.c, ybsVar2.c)) ? false : true;
            bxfVar.h = ybsVar2;
            int size = bxfVar.j.size();
            for (int i = 0; i < size; i++) {
                qnn qnnVar = (qnn) ((WeakReference) bxfVar.j.get(i)).get();
                if (qnnVar != null) {
                    qnnVar.g = ybsVar2;
                }
            }
            twf twfVar = bxfVar.m;
            synchronized (twfVar.c) {
                twfVar.j = null;
                twfVar.l = null;
                twfVar.k = null;
                twfVar.m = null;
                twfVar.n = null;
            }
            if (Intrinsics.d(ybsVar, ybsVar2)) {
                if (z) {
                    qne qneVar = bxfVar.b;
                    int e = rds.e(ybsVar2.b);
                    int d = rds.d(ybsVar2.b);
                    rds rdsVar = bxfVar.h.c;
                    int e2 = rdsVar != null ? rds.e(rdsVar.a) : -1;
                    rds rdsVar2 = bxfVar.h.c;
                    qneVar.r().updateSelection((View) qneVar.a, e, d, e2, rdsVar2 != null ? rds.d(rdsVar2.a) : -1);
                    return;
                }
                return;
            }
            if (ybsVar != null && (!Intrinsics.d(ybsVar.a.b, ybsVar2.a.b) || (rds.a(ybsVar.b, ybsVar2.b) && !Intrinsics.d(ybsVar.c, ybsVar2.c)))) {
                qne qneVar2 = bxfVar.b;
                qneVar2.r().restartInput((View) qneVar2.a);
                return;
            }
            int size2 = bxfVar.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                qnn qnnVar2 = (qnn) ((WeakReference) bxfVar.j.get(i2)).get();
                if (qnnVar2 != null) {
                    ybs ybsVar3 = bxfVar.h;
                    qne qneVar3 = bxfVar.b;
                    if (qnnVar2.k) {
                        qnnVar2.g = ybsVar3;
                        if (qnnVar2.i) {
                            qneVar3.r().updateExtractedText((View) qneVar3.a, qnnVar2.h, swf.w(ybsVar3));
                        }
                        rds rdsVar3 = ybsVar3.c;
                        long j = ybsVar3.b;
                        int e3 = rdsVar3 != null ? rds.e(rdsVar3.a) : -1;
                        rds rdsVar4 = ybsVar3.c;
                        qneVar3.r().updateSelection((View) qneVar3.a, rds.e(j), rds.d(j), e3, rdsVar4 != null ? rds.d(rdsVar4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.muk
    public final void d() {
        c3r c3rVar;
        nwf nwfVar = this.a;
        if (nwfVar == null || (c3rVar = (c3r) men.t(nwfVar, es5.p)) == null) {
            return;
        }
        ((nw7) c3rVar).a();
    }

    @Override // defpackage.muk
    public final void e(ynn ynnVar) {
        Rect rect;
        bxf bxfVar = this.c;
        if (bxfVar != null) {
            bxfVar.l = new Rect(eeh.b(ynnVar.a), eeh.b(ynnVar.b), eeh.b(ynnVar.c), eeh.b(ynnVar.d));
            if (!bxfVar.j.isEmpty() || (rect = bxfVar.l) == null) {
                return;
            }
            bxfVar.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.muk
    public final void f(ybs ybsVar, ide ideVar, lma lmaVar, nl6 nl6Var) {
        j(new ii(ybsVar, this, ideVar, lmaVar, nl6Var, 1));
    }

    @Override // defpackage.muk
    public final void g() {
        c3r c3rVar;
        nwf nwfVar = this.a;
        if (nwfVar == null || (c3rVar = (c3r) men.t(nwfVar, es5.p)) == null) {
            return;
        }
        ((nw7) c3rVar).b();
    }

    @Override // defpackage.muk
    public final void h(ybs ybsVar, mnj mnjVar, cds cdsVar, hxo hxoVar, ynn ynnVar, ynn ynnVar2) {
        bxf bxfVar = this.c;
        if (bxfVar != null) {
            twf twfVar = bxfVar.m;
            synchronized (twfVar.c) {
                try {
                    twfVar.j = ybsVar;
                    twfVar.l = mnjVar;
                    twfVar.k = cdsVar;
                    twfVar.m = ynnVar;
                    twfVar.n = ynnVar2;
                    if (!twfVar.e) {
                        if (twfVar.d) {
                        }
                    }
                    twfVar.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final xpi i() {
        x0q x0qVar = this.d;
        if (x0qVar != null) {
            return x0qVar;
        }
        if (!qmr.a) {
            return null;
        }
        x0q b = y0q.b(1, 0, oi3.c, 2);
        this.d = b;
        return b;
    }

    public final void j(ii iiVar) {
        nwf nwfVar = this.a;
        if (nwfVar == null) {
            return;
        }
        this.b = nwfVar.n ? x97.y(nwfVar.G0(), null, pm6.d, new ptd(nwfVar, new v3(iiVar, this, nwfVar, r4, 5), r4, 21), 1) : null;
    }

    public final void k(nwf nwfVar) {
        if (!(this.a == nwfVar)) {
            vme.c("Expected textInputModifierNode to be " + nwfVar + " but was " + this.a);
        }
        this.a = null;
    }
}
