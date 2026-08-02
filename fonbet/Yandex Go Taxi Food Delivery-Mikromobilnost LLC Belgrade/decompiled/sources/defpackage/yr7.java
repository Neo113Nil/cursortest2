package defpackage;

import ru.yandex.taxi.logistics.sdk.postcard.presentation.ui.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class yr7 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;
    public final /* synthetic */ int c;

    public /* synthetic */ yr7(int i, sls slsVar, int i2) {
        this.a = 4;
        this.c = i;
        this.b = slsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.b;
        int i2 = this.c;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                wp81.a(slsVar, fidVar, vng.O(i2 | 1));
                break;
            case 1:
                num.intValue();
                a.b(slsVar, fidVar, vng.O(i2 | 1));
                break;
            case 2:
                num.getClass();
                ut91.d(slsVar, fidVar, vng.O(i2 | 1));
                break;
            case 3:
                num.getClass();
                ut91.a(slsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                num.getClass();
                u3b1.i(i2, slsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ yr7(sls slsVar, int i, int i2) {
        this.a = i2;
        this.b = slsVar;
        this.c = i;
    }
}
