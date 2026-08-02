package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;

/* loaded from: classes3.dex */
public final class r7n implements owu {
    public final owu a;
    public final q0h b;
    public final l0f c;
    public final xdr d;

    public r7n(owu owuVar, q0h q0hVar, l0f l0fVar) {
        owuVar.getClass();
        l0fVar.getClass();
        this.a = owuVar;
        this.b = q0hVar;
        this.c = l0fVar;
        this.d = q0hVar.h;
    }

    @Override // defpackage.owu
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.owu
    public final void b(qmu qmuVar) {
        qmuVar.getClass();
        if (!this.b.c()) {
            this.a.b(qmuVar);
            return;
        }
        iik iikVar = new iik(26, this, qmuVar);
        l0f l0fVar = this.c;
        switch (l0fVar.a) {
            case 0:
                k0f k0fVar = (k0f) l0fVar.c;
                b0f b0fVar = (b0f) l0fVar.d;
                k0fVar.o(b0fVar.a, l0fVar.b, iikVar);
                break;
            default:
                xli xliVar = (xli) l0fVar.c;
                n7n n7nVar = (n7n) l0fVar.d;
                int i = l0fVar.b;
                hgp hgpVar = xliVar.b;
                ((h0h) ((jyr) hgpVar.a).getValue()).a(n7nVar, i);
                x0h x0hVar = (x0h) ((jyr) hgpVar.i).getValue();
                y supportFragmentManager = ((t) hgpVar.b).getSupportFragmentManager();
                supportFragmentManager.getClass();
                x0hVar.a(supportFragmentManager, (kxi) hgpVar.c, iikVar);
                break;
        }
    }

    @Override // defpackage.owu
    public final vdr c() {
        return this.a.c();
    }

    @Override // defpackage.owu
    public final void d() {
        this.a.d();
    }
}
