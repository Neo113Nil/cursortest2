package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class tf6 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ au2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ sls w;
    public final /* synthetic */ f530 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ tf6(au2 au2Var, String str, sls slsVar, f530 f530Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = au2Var;
        this.c = str;
        this.w = slsVar;
        this.x = f530Var;
        this.y = i;
        this.z = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                nab1.a(this.b, this.c, this.w, this.x, (fid) obj, O, this.z);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                nab1.b(this.b, this.c, this.w, this.x, (fid) obj, O2, this.z);
                break;
        }
        return zy11Var;
    }
}
