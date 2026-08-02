package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class xwr implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ int x;

    public /* synthetic */ xwr(f530 f530Var, String str, tls tlsVar, int i) {
        this.b = f530Var;
        this.c = str;
        this.w = tlsVar;
        this.x = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.x;
        tls tlsVar = this.w;
        f530 f530Var = this.b;
        String str = this.c;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                nsa1.a(vng.O(i2 | 1), fidVar, tlsVar, f530Var, str);
                break;
            case 1:
                cl91.a(vng.O(i2 | 1), fidVar, tlsVar, f530Var, str);
                break;
            default:
                fnm0.a(vng.O(i2 | 1), fidVar, tlsVar, f530Var, str);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ xwr(String str, tls tlsVar, f530 f530Var, int i) {
        this.c = str;
        this.w = tlsVar;
        this.b = f530Var;
        this.x = i;
    }

    public /* synthetic */ xwr(String str, f530 f530Var, tls tlsVar, int i) {
        this.c = str;
        this.b = f530Var;
        this.w = tlsVar;
        this.x = i;
    }
}
