package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class rsm0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ctm0 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ rsm0(ctm0 ctm0Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = ctm0Var;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        ctm0 ctm0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                k0b1.b(ctm0Var, tlsVar, fidVar, vng.O(1));
                break;
            case 1:
                k0b1.f(ctm0Var, tlsVar, fidVar, vng.O(1));
                break;
            default:
                k0b1.e(ctm0Var, tlsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
