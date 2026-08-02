package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class pvm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uvm b;

    public /* synthetic */ pvm(uvm uvmVar, int i) {
        this.a = i;
        this.b = uvmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.J = true;
                break;
            case 1:
                this.b.x();
                break;
            default:
                uvm uvmVar = this.b;
                if (!uvmVar.v0) {
                    voh vohVar = uvmVar.s;
                    vohVar.getClass();
                    vohVar.b(uvmVar);
                    break;
                }
                break;
        }
    }
}
