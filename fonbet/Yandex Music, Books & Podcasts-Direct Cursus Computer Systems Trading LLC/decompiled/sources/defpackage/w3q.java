package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class w3q implements f4q {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ w3q(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.f4q
    public final void a(mm6 mm6Var) {
        switch (this.a) {
            case 0:
                mm6Var.getClass();
                x97.y(mm6Var, null, null, new glp(this, null, 3), 3);
                break;
            case 1:
                mm6Var.getClass();
                f7l f7lVar = (f7l) this.c;
                xdr xdrVar = f7lVar.c;
                x0q x0qVar = f7lVar.e;
                ox6.B(zsd.K(new v24(x0qVar, this, xdrVar, (Continuation) null, 13)), mm6Var, new ryp(4, this));
                ox6.B(x0qVar, mm6Var, new o7b(10, this));
                break;
            default:
                mm6Var.getClass();
                ox6.B(zsd.b0(new f9l(14, new p6o(((uol) this.b).i, 16))), mm6Var, new ryp(5, this));
                break;
        }
    }
}
