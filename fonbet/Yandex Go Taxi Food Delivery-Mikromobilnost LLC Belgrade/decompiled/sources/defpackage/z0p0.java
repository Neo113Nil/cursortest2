package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class z0p0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ s1p0 b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ int w;

    public /* synthetic */ z0p0(s1p0 s1p0Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = s1p0Var;
        this.c = tlsVar;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        tls tlsVar = this.c;
        s1p0 s1p0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                k4b1.e(s1p0Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                k4b1.i(s1p0Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
