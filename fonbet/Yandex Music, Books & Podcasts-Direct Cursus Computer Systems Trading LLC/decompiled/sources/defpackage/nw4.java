package defpackage;

/* loaded from: classes3.dex */
public final class nw4 implements prf {
    public final /* synthetic */ int a;
    public final knq b;

    public nw4(ow4 ow4Var, tmb tmbVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new y3(ow4Var.c, tmbVar, 4);
                break;
            case 2:
                this.b = new y3(ow4Var.a, tmbVar, 5);
                break;
            default:
                this.b = new i3(ow4Var.d, (c22) ow4Var.h.getValue(), tmbVar);
                break;
        }
    }

    @Override // defpackage.prf
    public final knq a() {
        switch (this.a) {
        }
        return (y3) this.b;
    }
}
