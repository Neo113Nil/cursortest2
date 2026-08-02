package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class sm9 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ an9 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ sm9(an9 an9Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = an9Var;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        an9 an9Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                tm9.b(an9Var, tlsVar, fidVar, vng.O(1));
                break;
            default:
                tm9.a(an9Var, tlsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
