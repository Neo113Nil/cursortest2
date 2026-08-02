package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* loaded from: classes.dex */
public final class iep implements eun {
    public final long a;
    public final bfp b;
    public final long c;
    public pt0 d;
    public ugi e;
    public final yci f;

    public iep(long j, bfp bfpVar, long j2) {
        pt0 pt0Var = pt0.i;
        this.a = j;
        this.b = bfpVar;
        this.c = j2;
        this.d = pt0Var;
        hep hepVar = new hep(this, 0);
        jep jepVar = new jep(hepVar, bfpVar, j);
        yg3 yg3Var = new yg3();
        yg3Var.c = hepVar;
        yg3Var.d = bfpVar;
        yg3Var.b = j;
        yg3Var.a = 0L;
        ul6 ul6Var = new ul6(yg3Var, jepVar);
        ffm ffmVar = eur.a;
        this.f = uwf.x(new SuspendPointerInputElement(yg3Var, jepVar, null, ul6Var, 4), c3x.h);
    }

    @Override // defpackage.eun
    public final void b() {
        hep hepVar = new hep(this, 1);
        hep hepVar2 = new hep(this, 2);
        long j = this.a;
        ugi ugiVar = new ugi(j, hepVar, hepVar2);
        bfp bfpVar = this.b;
        yoi yoiVar = bfpVar.c;
        if (j == 0) {
            vme.a("The selectable contains an invalid id: " + j);
        }
        if (yoiVar.b(j)) {
            vme.a("Another selectable with the id: " + ugiVar + ".selectableId has already subscribed.");
        }
        yoiVar.h(j, ugiVar);
        bfpVar.b.add(ugiVar);
        bfpVar.a = false;
        this.e = ugiVar;
    }

    @Override // defpackage.eun
    public final void d() {
        ugi ugiVar = this.e;
        if (ugiVar != null) {
            this.b.d(ugiVar);
            this.e = null;
        }
    }

    @Override // defpackage.eun
    public final void e() {
        ugi ugiVar = this.e;
        if (ugiVar != null) {
            this.b.d(ugiVar);
            this.e = null;
        }
    }
}
