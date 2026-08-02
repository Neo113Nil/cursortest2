package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class zql implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;

    public /* synthetic */ zql(f530 f530Var, float f, long j, int i, int i2) {
        this.b = f530Var;
        this.w = f;
        this.c = j;
        this.x = i;
        this.y = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                tj91.a(this.w, O, this.y, this.c, (fid) obj, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                dk91.a(this.w, O2, this.y, this.c, (fid) obj, this.b);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ zql(f530 f530Var, long j, float f, int i, int i2) {
        this.b = f530Var;
        this.c = j;
        this.w = f;
        this.x = i;
        this.y = i2;
    }
}
