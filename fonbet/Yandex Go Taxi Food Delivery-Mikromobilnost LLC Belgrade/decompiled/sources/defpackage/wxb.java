package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class wxb implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pvi0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ wxb(int i, pvi0 pvi0Var, String str) {
        this.a = i;
        this.b = pvi0Var;
        this.c = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    v0b1.a(this.b, null, this.c, null, null, null, null, null, 0.0f, 0, btsVar, 0, 1018);
                    break;
                }
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    v0b1.a(this.b, null, this.c, null, null, null, null, null, 0.0f, 0, btsVar2, 0, 1018);
                    break;
                }
        }
        return zy11Var;
    }
}
