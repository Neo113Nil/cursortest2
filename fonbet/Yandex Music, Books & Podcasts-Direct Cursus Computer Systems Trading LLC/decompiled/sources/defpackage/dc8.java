package defpackage;

/* loaded from: classes3.dex */
public final class dc8 extends j8t {
    public final /* synthetic */ int a = 2;
    public n8t b;

    public dc8(n8t n8tVar) {
        this.b = n8tVar;
    }

    @Override // defpackage.j8t, defpackage.a8t
    public void d(b8t b8tVar) {
        switch (this.a) {
            case 1:
                n8t n8tVar = this.b;
                n8tVar.H.remove(b8tVar);
                if (!n8tVar.x()) {
                    n8tVar.E(n8tVar, wvs.d, false);
                    n8tVar.t = true;
                    n8tVar.E(n8tVar, wvs.c, false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.j8t, defpackage.a8t
    public void e(b8t b8tVar) {
        switch (this.a) {
            case 0:
                this.b.H(this);
                break;
            case 2:
                n8t n8tVar = this.b;
                int i = n8tVar.J - 1;
                n8tVar.J = i;
                if (i == 0) {
                    n8tVar.K = false;
                    n8tVar.q();
                }
                b8tVar.H(this);
                break;
        }
    }

    @Override // defpackage.j8t, defpackage.a8t
    public void f(b8t b8tVar) {
        switch (this.a) {
            case 2:
                n8t n8tVar = this.b;
                if (!n8tVar.K) {
                    n8tVar.S();
                    n8tVar.K = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ dc8() {
    }

    public dc8(n8t n8tVar, rwd rwdVar, gc8 gc8Var, rv8 rv8Var) {
        this.b = n8tVar;
    }
}
