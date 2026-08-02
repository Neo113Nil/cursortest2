package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class z4h implements ruy, c9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ z4h(h42 h42Var, yxc0 yxc0Var, yxc0 yxc0Var2, int i) {
        this.a = 1;
        this.b = h42Var;
        this.c = i;
        this.w = yxc0Var;
        this.x = yxc0Var2;
    }

    @Override // defpackage.c9e
    public void accept(Object obj) {
        xf10 xf10Var = (xf10) this.b;
        ((yf10) obj).onLoadStarted(xf10Var.a, xf10Var.b, (uwy) this.w, (he10) this.x, this.c);
    }

    @Override // defpackage.ruy
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.x;
        Object obj3 = this.w;
        int i2 = this.c;
        h42 h42Var = (h42) this.b;
        switch (i) {
            case 0:
                uwy uwyVar = (uwy) obj3;
                he10 he10Var = (he10) obj2;
                j42 j42Var = (j42) obj;
                j42Var.onLoadStarted(h42Var, uwyVar, he10Var);
                j42Var.onLoadStarted(h42Var, uwyVar, he10Var, i2);
                break;
            default:
                j42 j42Var2 = (j42) obj;
                j42Var2.onPositionDiscontinuity(h42Var, i2);
                j42Var2.onPositionDiscontinuity(h42Var, (yxc0) obj3, (yxc0) obj2, i2);
                break;
        }
    }

    public /* synthetic */ z4h(Object obj, uwy uwyVar, he10 he10Var, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.w = uwyVar;
        this.x = he10Var;
        this.c = i;
    }
}
