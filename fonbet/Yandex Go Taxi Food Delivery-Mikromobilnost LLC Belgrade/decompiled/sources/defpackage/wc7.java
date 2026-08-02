package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class wc7 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ h890 b;
    public final /* synthetic */ p370 c;

    public /* synthetic */ wc7(h890 h890Var, p370 p370Var, int i) {
        this.a = i;
        this.b = h890Var;
        this.c = p370Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        p370 p370Var = this.c;
        h890 h890Var = this.b;
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                h890Var.c(p370Var, intValue, intValue2);
                break;
            default:
                h890Var.c(p370Var, intValue, intValue2);
                break;
        }
        return zy11Var;
    }
}
