package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class l7e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n7e b;

    public /* synthetic */ l7e(n7e n7eVar, int i) {
        this.a = i;
        this.b = n7eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n7e n7eVar = this.b;
                qne qneVar = n7eVar.l;
                s9f[] s9fVarArr = n7e.m;
                es3 es3Var = (es3) qneVar.getValue(n7eVar, s9fVarArr[0]);
                if (es3Var != null) {
                    es3Var.cancel();
                }
                qneVar.setValue(n7eVar, s9fVarArr[0], null);
                break;
            case 1:
                this.b.a();
                break;
            default:
                this.b.a();
                break;
        }
    }
}
