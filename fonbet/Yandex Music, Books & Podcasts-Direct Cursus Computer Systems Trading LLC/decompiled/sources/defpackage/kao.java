package defpackage;

/* loaded from: classes5.dex */
public final class kao implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jtc b;

    public /* synthetic */ kao(jtc jtcVar, int i) {
        this.a = i;
        this.b = jtcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x7h x7hVar = (x7h) this.b.b;
                x7hVar.z = true;
                oo4 oo4Var = x7hVar.u;
                sfm sfmVar = x7hVar.s;
                oo4Var.n((sgr) sfmVar.a, (no4) sfmVar.b, (s2i) sfmVar.c);
                break;
            default:
                x7h x7hVar2 = (x7h) this.b.b;
                if (!x7hVar2.z) {
                    x7hVar2.u.onReady();
                    break;
                }
                break;
        }
    }
}
