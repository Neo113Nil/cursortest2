package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class b12 implements gw1 {
    public final k2b a;
    public final String b;
    public final f6q c;
    public final rjq d;
    public final um6 e;
    public final gej f;
    public final wx1 g;
    public final ArrayList h;
    public nej i;
    public iw1 j;
    public final xdr k;

    /* JADX WARN: Multi-variable type inference failed */
    public b12(jw1 jw1Var, ncl nclVar, k2b k2bVar) {
        this.a = k2bVar;
        String W = wdp.W(this, "Auto");
        this.b = W;
        this.c = f6q.Automatic;
        rjq rjqVar = new rjq(true);
        this.d = rjqVar;
        this.e = hld.s(rjqVar, ca8.b);
        gej gejVar = new gej(nclVar, k2bVar);
        this.f = gejVar;
        wx1 wx1Var = new wx1((wzc) jw1Var.a.getValue(), nclVar, k2bVar);
        this.g = wx1Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(wx1Var);
        arrayList.add(gejVar);
        this.h = arrayList;
        gejVar = ((Boolean) wx1Var.f.getValue()).booleanValue() ? wx1Var : gejVar;
        ssg.a(3, W, "Created with " + gejVar.b + " initially.", null);
        nej nejVar = this.i;
        if (nejVar != null) {
            this.j.f(nejVar);
        }
        this.j = gejVar;
        this.k = ydr.a(gejVar.f.getValue());
    }

    @Override // defpackage.gw1
    public final void a() {
        ssg.a(3, this.b, "Releasing", null);
        this.d.V();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((gw1) it.next()).a();
        }
    }

    @Override // defpackage.gw1
    public final xdr b() {
        return this.k;
    }

    @Override // defpackage.gw1
    public final void c(float f) {
        ssg.a(3, this.b, "New gain " + f, null);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((gw1) it.next()).c(f);
        }
    }

    @Override // defpackage.gw1
    public final void d(int i) {
        v3w.k("Applying audio session id ", i, 3, this.b, null);
        this.d.g();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            gw1 gw1Var = (gw1) it.next();
            ox6.B(gw1Var.b(), this.e, new ri(16, this));
            gw1Var.d(i);
        }
        this.a.b(i, f6q.Automatic);
    }

    @Override // defpackage.gw1
    public final void e() {
        ssg.a(3, this.b, "Disconnecting control", null);
        this.i = null;
        this.j.e();
    }

    @Override // defpackage.gw1
    public final void f(nej nejVar) {
        nejVar.getClass();
        ssg.a(3, this.b, "Connecting control", null);
        this.i = nejVar;
        this.j.f(nejVar);
    }

    @Override // defpackage.gw1
    public final f6q getImplementation() {
        return this.c;
    }
}
