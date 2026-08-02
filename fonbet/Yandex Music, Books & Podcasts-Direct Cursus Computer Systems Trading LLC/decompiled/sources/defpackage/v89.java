package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class v89 implements zqn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v89(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.zqn
    public final void cancel() {
        switch (this.a) {
            case 0:
                ((rar) this.b).g(null);
                break;
            case 1:
                ((ffg) this.b).cancel();
                break;
            default:
                ((jf9) this.b).cancel();
                break;
        }
    }
}
