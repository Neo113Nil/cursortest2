package defpackage;

/* loaded from: classes4.dex */
public final /* synthetic */ class r23 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int w;

    public /* synthetic */ r23(int i, int i2, long j, boolean z) {
        this.a = i2;
        this.b = z;
        this.c = j;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        long j = this.c;
        boolean z = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                gza1.a(z, j, fidVar, vng.O(i2 | 1));
                break;
            default:
                num.intValue();
                t1a1.a(z, j, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
