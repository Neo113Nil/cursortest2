package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class wbr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ybr b;
    public final /* synthetic */ nb7 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ wbr(ybr ybrVar, nb7 nb7Var, boolean z, int i) {
        this.a = i;
        this.b = ybrVar;
        this.c = nb7Var;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ybr ybrVar = this.b;
                if (ybrVar.b != null && ybrVar.d != null && ybrVar.e != null) {
                    ybrVar.b();
                    break;
                } else {
                    ybrVar.f0(this.c, this.d);
                    break;
                }
                break;
            default:
                ybr ybrVar2 = this.b;
                if (ybrVar2.b != null && ybrVar2.d != null && ybrVar2.e != null) {
                    ybrVar2.b();
                    break;
                } else {
                    ybrVar2.g0(this.c, this.d);
                    break;
                }
        }
    }
}
