package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class w61 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ jvs0 b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ tls w;

    public /* synthetic */ w61(jvs0 jvs0Var, tls tlsVar, tls tlsVar2, int i) {
        this.a = i;
        this.b = jvs0Var;
        this.c = tlsVar;
        this.w = tlsVar2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    a.a(this.b, true, true, this.c, this.w, btsVar, 432, 0);
                    break;
                }
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    a.a(this.b, true, true, this.c, this.w, btsVar2, 432, 0);
                    break;
                }
            case 2:
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    a.a(this.b, true, true, this.c, this.w, btsVar3, 432, 0);
                    break;
                }
            case 3:
                bts btsVar4 = (bts) fidVar;
                if (!btsVar4.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    a.a(this.b, false, false, this.c, this.w, btsVar4, 0, 6);
                    break;
                }
            default:
                bts btsVar5 = (bts) fidVar;
                if (!btsVar5.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar5.Y();
                    break;
                } else {
                    a.a(this.b, true, true, this.c, this.w, btsVar5, 432, 0);
                    break;
                }
        }
        return zy11Var;
    }
}
