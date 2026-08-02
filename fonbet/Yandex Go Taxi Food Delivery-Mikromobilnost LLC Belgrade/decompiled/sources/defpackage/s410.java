package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class s410 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ t510 c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ int x;

    public /* synthetic */ s410(t510 t510Var, tls tlsVar, f530 f530Var, int i) {
        this.c = t510Var;
        this.w = tlsVar;
        this.b = f530Var;
        this.x = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.x;
        tls tlsVar = this.w;
        t510 t510Var = this.c;
        f530 f530Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                uib1.b(vng.O(i2 | 1), fidVar, tlsVar, t510Var, f530Var);
                break;
            default:
                npb1.b(vng.O(i2 | 1), fidVar, tlsVar, t510Var, f530Var);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ s410(f530 f530Var, t510 t510Var, tls tlsVar, int i) {
        this.b = f530Var;
        this.c = t510Var;
        this.w = tlsVar;
        this.x = i;
    }
}
