package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class zif0 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ long w;
    public final /* synthetic */ long x;
    public final /* synthetic */ int y;

    public /* synthetic */ zif0(float f, int i, int i2, long j, long j2, f530 f530Var) {
        this.c = f530Var;
        this.w = j;
        this.b = f;
        this.x = j2;
        this.y = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                cjf0.b(this.b, this.y, O, this.w, this.x, (fid) obj, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(this.y | 1);
                cjf0.c(this.b, O2, this.w, this.x, (fid) obj, this.c);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ zif0(float f, int i, long j, long j2, f530 f530Var) {
        this.b = f;
        this.c = f530Var;
        this.w = j;
        this.x = j2;
        this.y = i;
    }
}
