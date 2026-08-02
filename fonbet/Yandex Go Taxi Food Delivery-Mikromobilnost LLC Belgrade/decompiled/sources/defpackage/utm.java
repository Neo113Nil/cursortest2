package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class utm implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ utm(rtm rtmVar, float f, f530 f530Var, j690 j690Var, oz40 oz40Var, int i, int i2) {
        this.x = rtmVar;
        this.b = f;
        this.y = f530Var;
        this.z = j690Var;
        this.A = oz40Var;
        this.c = i;
        this.w = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        Object obj3 = this.A;
        Object obj4 = this.z;
        Object obj5 = this.x;
        Object obj6 = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                rx91.c((rtm) obj5, this.b, (f530) obj6, (j690) obj4, (oz40) obj3, (fid) obj, O, this.w);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                s1a1.b((b7n) obj5, (k43) obj6, this.b, (y7m) obj4, (tls) obj3, (fid) obj, O2, this.w);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                qb91.a((f530) obj6, (zrm) obj5, this.b, (Float) obj4, (ldc) obj3, (fid) obj, O3, this.w);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ utm(b7n b7nVar, k43 k43Var, float f, y7m y7mVar, tls tlsVar, int i, int i2) {
        this.x = b7nVar;
        this.y = k43Var;
        this.b = f;
        this.z = y7mVar;
        this.A = tlsVar;
        this.c = i;
        this.w = i2;
    }

    public /* synthetic */ utm(f530 f530Var, zrm zrmVar, float f, Float f2, ldc ldcVar, int i, int i2) {
        this.y = f530Var;
        this.x = zrmVar;
        this.b = f;
        this.z = f2;
        this.A = ldcVar;
        this.c = i;
        this.w = i2;
    }
}
