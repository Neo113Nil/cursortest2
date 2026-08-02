package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final /* synthetic */ class s230 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ t230 b;
    public final /* synthetic */ qkg c;

    public /* synthetic */ s230(t230 t230Var, qkg qkgVar, int i) {
        this.a = i;
        this.b = t230Var;
        this.c = qkgVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        t230 t230Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    t230Var.c.a(this.c, null, 0.0f, ldc.l, false, false, null, btsVar, 16780288, HProv.PP_INFO);
                    break;
                }
            default:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    t230Var.c.a(this.c, null, 0.0f, ldc.l, false, false, null, btsVar2, 16780288, HProv.PP_INFO);
                    break;
                }
        }
        return zy11Var;
    }
}
