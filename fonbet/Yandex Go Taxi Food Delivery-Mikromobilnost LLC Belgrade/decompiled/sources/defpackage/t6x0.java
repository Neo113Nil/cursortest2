package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class t6x0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ x6x0 b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ int x;

    public /* synthetic */ t6x0(x6x0 x6x0Var, tls tlsVar, tls tlsVar2, int i, int i2) {
        this.a = i2;
        this.b = x6x0Var;
        this.c = tlsVar;
        this.w = tlsVar2;
        this.x = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.x;
        tls tlsVar = this.w;
        tls tlsVar2 = this.c;
        x6x0 x6x0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                lkb1.d(x6x0Var, tlsVar2, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                lkb1.b(x6x0Var, tlsVar2, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
