package defpackage;

/* loaded from: classes.dex */
public final class kon implements tc6 {
    public final /* synthetic */ int a = 1;
    public final String b;
    public final hk0 c;
    public final boolean d;
    public final ok0 e;
    public final Object f;

    public kon(String str, hk0 hk0Var, hk0 hk0Var2, mk0 mk0Var, boolean z) {
        this.b = str;
        this.c = hk0Var;
        this.e = hk0Var2;
        this.f = mk0Var;
        this.d = z;
    }

    @Override // defpackage.tc6
    public final lb6 a(czg czgVar, ayg aygVar, ds2 ds2Var) {
        switch (this.a) {
            case 0:
                return new bon(czgVar, ds2Var, this);
            default:
                return new tyn(czgVar, ds2Var, this);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "RectangleShape{position=" + this.e + ", size=" + ((ok0) this.f) + '}';
            default:
                return super.toString();
        }
    }

    public kon(String str, ok0 ok0Var, gk0 gk0Var, hk0 hk0Var, boolean z) {
        this.b = str;
        this.e = ok0Var;
        this.f = gk0Var;
        this.c = hk0Var;
        this.d = z;
    }
}
