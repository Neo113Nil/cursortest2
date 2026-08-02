package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class ywb implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ fxb b;

    public /* synthetic */ ywb(fxb fxbVar, int i) {
        this.a = i;
        this.b = fxbVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        fxb fxbVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    jeb1.f(fxbVar.b, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.b, btsVar, 0, 0, 16382);
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
                    fmb1.f(fxbVar.a, ljs0.c(an91.m(c530.a, 0.0f, 14.0f, 1), 1.0f), xya1.e(btsVar2).g.a, null, new sjy0(3), 0, 0, btsVar2, 48);
                    break;
                }
        }
        return zy11Var;
    }
}
