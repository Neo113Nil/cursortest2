package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class sf6 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ au2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ sf6(au2 au2Var, String str, int i) {
        this.a = i;
        this.b = au2Var;
        this.c = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    sya1.a(this.b, null, this.c, null, btsVar, 0, 10);
                    break;
                }
            default:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    sya1.a(this.b, null, this.c, null, btsVar2, 0, 10);
                    break;
                }
        }
        return zy11Var;
    }
}
