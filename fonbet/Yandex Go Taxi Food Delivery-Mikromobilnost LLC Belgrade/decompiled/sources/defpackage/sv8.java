package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.ui.c;

/* loaded from: classes5.dex */
public final /* synthetic */ class sv8 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ oz40 c;
    public final /* synthetic */ oip0 w;
    public final /* synthetic */ qkg x;

    public /* synthetic */ sv8(c cVar, oz40 oz40Var, oip0 oip0Var, qkg qkgVar, int i) {
        this.a = i;
        this.b = cVar;
        this.c = oz40Var;
        this.w = oip0Var;
        this.x = qkgVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                this.b.a(this.c, this.w, this.x, (fid) obj, vng.O(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                this.b.g(this.c, this.w, this.x, (fid) obj, vng.O(1));
                break;
            case 2:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    this.b.g(this.c, this.w, this.x, btsVar, 0);
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
                    this.b.a(this.c, this.w, this.x, btsVar2, 0);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ sv8(c cVar, oz40 oz40Var, oip0 oip0Var, qkg qkgVar, int i, int i2) {
        this.a = i2;
        this.b = cVar;
        this.c = oz40Var;
        this.w = oip0Var;
        this.x = qkgVar;
    }
}
