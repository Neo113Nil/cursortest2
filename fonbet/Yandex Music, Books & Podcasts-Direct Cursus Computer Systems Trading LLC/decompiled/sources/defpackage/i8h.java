package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class i8h extends zdg {
    public final ime b;
    public final sue c;
    public final ad4 d;
    public final jd4 e;
    public List f;
    public owe g;
    public boolean h;
    public boolean i;
    public rjp j;
    public final /* synthetic */ j8h k;

    public i8h(j8h j8hVar, ime imeVar) {
        super(0);
        this.k = j8hVar;
        List list = (List) imeVar.b;
        this.f = list;
        Logger logger = j8h.c0;
        this.b = imeVar;
        sue sueVar = new sue(sue.d.incrementAndGet(), "Subchannel", j8hVar.t.e());
        this.c = sueVar;
        hs4 hs4Var = j8hVar.l;
        jd4 jd4Var = new jd4(sueVar, hs4Var.x(), "Subchannel for " + list);
        this.e = jd4Var;
        this.d = new ad4(jd4Var, hs4Var);
    }

    @Override // defpackage.zdg
    public final void D() {
        this.k.m.e();
        o2g.U("not started", this.h);
        owe oweVar = this.g;
        if (oweVar.u != null) {
            return;
        }
        oweVar.j.execute(new gwe(oweVar, 1));
    }

    @Override // defpackage.zdg
    public final void F() {
        rjp rjpVar;
        j8h j8hVar = this.k;
        j8hVar.m.e();
        if (this.g == null) {
            this.i = true;
            return;
        }
        if (!this.i) {
            this.i = true;
        } else {
            if (!j8hVar.H || (rjpVar = this.j) == null) {
                return;
            }
            rjpVar.c();
            this.j = null;
        }
        if (!j8hVar.H) {
            this.j = j8hVar.m.c(j8hVar.f.a.d, new arg(new dsd(11, this)), 5L, TimeUnit.SECONDS);
        } else {
            owe oweVar = this.g;
            oweVar.j.execute(new hwe(oweVar, j8h.f0, 0));
        }
    }

    @Override // defpackage.zdg
    public final void H(beg begVar) {
        j8h j8hVar = this.k;
        j8hVar.m.e();
        o2g.U("already started", !this.h);
        o2g.U("already shutdown", !this.i);
        o2g.U("Channel is being terminated", !j8hVar.H);
        this.h = true;
        List list = (List) this.b.b;
        String e = j8hVar.t.e();
        wvo wvoVar = j8hVar.s;
        is3 is3Var = j8hVar.f;
        ScheduledExecutorService scheduledExecutorService = is3Var.a.d;
        yqr yqrVar = j8hVar.p;
        vq6 vq6Var = j8hVar.m;
        aqd aqdVar = new aqd(this, begVar);
        lte lteVar = j8hVar.O;
        j8hVar.K.getClass();
        owe oweVar = new owe(list, e, wvoVar, is3Var, scheduledExecutorService, yqrVar, vq6Var, aqdVar, lteVar, new kkp(2), this.e, this.c, this.d);
        j8hVar.M.b(new jte("Child Subchannel started", ite.a, j8hVar.l.x(), oweVar));
        this.g = oweVar;
        lte.a(j8hVar.O.c, oweVar);
        j8hVar.z.add(oweVar);
    }

    @Override // defpackage.zdg
    public final void Q(List list) {
        this.k.m.e();
        this.f = list;
        owe oweVar = this.g;
        oweVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o2g.O(it.next(), "newAddressGroups contains null entry");
        }
        o2g.J("newAddressGroups is empty", !list.isEmpty());
        oweVar.j.execute(new pv7(15, oweVar, Collections.unmodifiableList(new ArrayList(list))));
    }

    @Override // defpackage.zdg
    public final List t() {
        this.k.m.e();
        o2g.U("not started", this.h);
        return this.f;
    }

    @Override // defpackage.zdg
    public final String toString() {
        return this.c.toString();
    }

    @Override // defpackage.zdg
    public final xu1 u() {
        return (xu1) this.b.c;
    }

    @Override // defpackage.zdg
    public final zc4 v() {
        return this.d;
    }

    @Override // defpackage.zdg
    public final Object w() {
        o2g.U("Subchannel is not started", this.h);
        return this.g;
    }
}
