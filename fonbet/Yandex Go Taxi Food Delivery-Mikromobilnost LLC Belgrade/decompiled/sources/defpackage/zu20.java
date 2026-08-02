package defpackage;

/* loaded from: classes8.dex */
public final /* synthetic */ class zu20 implements thw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ev20 b;

    public /* synthetic */ zu20(ev20 ev20Var, int i) {
        this.a = i;
        this.b = ev20Var;
    }

    @Override // defpackage.thw0
    public Object get() {
        int i = this.a;
        boolean z = false;
        ev20 ev20Var = this.b;
        switch (i) {
            case 0:
                return new hzk(new zu20(ev20Var, 5), z);
            case 1:
                return new hzk(new zu20(ev20Var, 3), z);
            default:
                return new edr(new av20(ev20Var));
        }
    }
}
