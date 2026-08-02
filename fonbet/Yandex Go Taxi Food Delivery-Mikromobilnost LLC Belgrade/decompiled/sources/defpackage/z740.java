package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class z740 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ l940 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ z740(l940 l940Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = l940Var;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        l940 l940Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                im91.d(l940Var, tlsVar, fidVar, vng.O(1));
                break;
            default:
                im91.c(l940Var, tlsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
