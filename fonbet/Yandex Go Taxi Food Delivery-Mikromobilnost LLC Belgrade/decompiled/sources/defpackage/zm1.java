package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.impl.manual_tips.ui.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class zm1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;
    public final /* synthetic */ sls c;
    public final /* synthetic */ f530 w;

    public /* synthetic */ zm1(sls slsVar, sls slsVar2, f530 f530Var, int i) {
        this.a = 1;
        this.b = slsVar;
        this.c = slsVar2;
        this.w = f530Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.c;
        sls slsVar2 = this.b;
        f530 f530Var = this.w;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                dn1.h(vng.O(1), fidVar, slsVar2, slsVar, f530Var);
                break;
            case 1:
                keb1.a(vng.O(1), fidVar, slsVar2, slsVar, f530Var);
                break;
            case 2:
                a.a(vng.O(7), fidVar, slsVar2, slsVar, f530Var);
                break;
            default:
                olb1.a(vng.O(1), fidVar, slsVar2, slsVar, f530Var);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ zm1(f530 f530Var, sls slsVar, sls slsVar2, int i, int i2) {
        this.a = i2;
        this.w = f530Var;
        this.b = slsVar;
        this.c = slsVar2;
    }
}
