package defpackage;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes9.dex */
public abstract class qc5 extends ad5 {
    public final ney x;
    public final pc5 y;
    public ike z;

    public qc5(Class cls, ney neyVar) {
        super(cls);
        this.x = neyVar;
        this.y = new pc5(0, this);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public void Bg(l050 l050Var) {
        super.Bg(l050Var);
        ney neyVar = this.x;
        pc5 pc5Var = this.y;
        neyVar.b(pc5Var, pc5Var);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public void Cg() {
        this.x.d(this.y);
        super.Cg();
    }

    @Override // defpackage.zc5
    public void Fg() {
        ike ikeVar = this.z;
        if (ikeVar != null) {
            bvf0.i(ikeVar, "pausing presenter", null);
        }
        this.z = null;
    }

    @Override // defpackage.zc5
    public void Gg() {
        qhw0 qhw0Var = new qhw0((l8x) ((ike) Jg()).a.get(seu.C));
        sjh sjhVar = uyj.a;
        this.z = bvf0.a(cvw.U(qhw0Var, o400.a).plus(Ig()));
    }

    public final tse Kg() {
        ike ikeVar = this.z;
        return ikeVar == null ? ad5.Hg("resumedScope") : ikeVar;
    }

    public void Lg() {
    }

    public void onStart() {
    }

    public qc5(Class cls, Lifecycle lifecycle) {
        this(cls, new ney(lifecycle));
    }
}
