package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class twl0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ exl0 b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ int w;

    public /* synthetic */ twl0(exl0 exl0Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = exl0Var;
        this.c = tlsVar;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        tls tlsVar = this.c;
        exl0 exl0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                twa1.d(exl0Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                twa1.e(exl0Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
