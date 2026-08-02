package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.c;

/* loaded from: classes5.dex */
public final /* synthetic */ class rv8 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ qkg c;

    public /* synthetic */ rv8(c cVar, qkg qkgVar, int i) {
        this.a = i;
        this.b = cVar;
        this.c = qkgVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    cVar.w.a(this.c, null, 0.0f, ldc.l, false, false, null, btsVar, 16780288, HProv.PP_INFO);
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
                    cVar.w.a(this.c, null, 0.0f, ldc.l, false, false, null, btsVar2, 16780288, HProv.PP_INFO);
                    break;
                }
        }
        return zy11Var;
    }
}
