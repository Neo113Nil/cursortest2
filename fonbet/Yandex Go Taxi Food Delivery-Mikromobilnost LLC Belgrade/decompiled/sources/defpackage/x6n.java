package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class x6n implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b7n b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ int w;

    public /* synthetic */ x6n(b7n b7nVar, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = b7nVar;
        this.c = tlsVar;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        tls tlsVar = this.c;
        b7n b7nVar = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                s1a1.a(b7nVar, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            case 1:
                s1a1.c(b7nVar, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                s1a1.d(b7nVar, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
