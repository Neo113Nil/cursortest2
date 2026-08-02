package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class ks4 implements ffg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ks4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ffg
    public final void cancel() {
        switch (this.a) {
            case 0:
                ((la8) this.b).a();
                break;
            default:
                es3 es3Var = (es3) this.b;
                if (es3Var != null) {
                    es3Var.cancel();
                    break;
                }
                break;
        }
    }
}
