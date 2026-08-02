package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class url implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ qor c;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    public /* synthetic */ url(f530 f530Var, qor qorVar, int i, int i2, int i3) {
        this.a = i3;
        this.b = f530Var;
        this.c = qorVar;
        this.w = i;
        this.x = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.x;
        int i3 = this.w;
        qor qorVar = this.c;
        f530 f530Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                uj91.b(f530Var, qorVar, fidVar, vng.O(i3 | 1), i2);
                break;
            case 1:
                yrl.e(f530Var, qorVar, fidVar, vng.O(i3 | 1), i2);
                break;
            default:
                yrl.c(f530Var, qorVar, fidVar, vng.O(i3 | 1), i2);
                break;
        }
        return zy11Var;
    }
}
