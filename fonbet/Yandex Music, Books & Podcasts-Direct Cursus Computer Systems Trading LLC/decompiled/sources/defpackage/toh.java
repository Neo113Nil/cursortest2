package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class toh implements f4q {
    public final /* synthetic */ int a = 0;
    public final f7l b;
    public final Object c;
    public final Object d;
    public Object e;

    public toh(f7l f7lVar, k1l k1lVar, jyr jyrVar) {
        jyrVar.getClass();
        this.b = f7lVar;
        this.c = k1lVar;
        this.d = jyrVar;
        this.e = new tu1();
    }

    @Override // defpackage.f4q
    public final void a(mm6 mm6Var) {
        int i = this.a;
        mm6Var.getClass();
        switch (i) {
            case 0:
                rar rarVar = (rar) this.e;
                Continuation continuation = null;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                xqn xqnVar = new xqn();
                xqnVar.a = s84.f;
                int i2 = 2;
                this.e = ox6.B(zsd.C(zsd.M0(zsd.b0(new v81(new ub7(12, zsd.C(((dk4) this.d).b, -1), new xc(i2, 29, continuation)), 4)), new gv6(continuation, zsd.b0(new ifd(this.b.c, 28)), this, 8)), 0), mm6Var, new lrf(8, xqnVar, this));
                break;
            case 1:
                ox6.B(zsd.C(zsd.M0(zsd.b0(new p6o(this.b.c, 15)), new cle((Continuation) null, this, 23)), 0), mm6Var, new ryp(2, this));
                break;
            default:
                x97.y(mm6Var, null, null, new glp(this, null, 17), 3);
                break;
        }
    }

    public toh(dk4 dk4Var, f7l f7lVar, k1l k1lVar) {
        this.d = dk4Var;
        this.b = f7lVar;
        this.c = k1lVar;
    }

    public toh(f7l f7lVar, jyr jyrVar, jyr jyrVar2, q7l q7lVar) {
        this.b = f7lVar;
        this.d = jyrVar;
        this.c = jyrVar2;
        this.e = q7lVar;
    }
}
