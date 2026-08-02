package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ActionButtonsState;
import com.yandex.passport.api.c;
import com.yandex.passport.api.c3;
import ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class ub31 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ ub31(o9z0 o9z0Var, tls tlsVar, sls slsVar, sls slsVar2, sls slsVar3, int i) {
        this.a = 2;
        this.b = o9z0Var;
        this.c = tlsVar;
        this.w = slsVar;
        this.x = slsVar2;
        this.y = slsVar3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.b;
        Object obj6 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                te91.b((f530) obj5, (ActionButtonsState) obj6, (hwc) obj4, (czs) obj3, this.c, (fid) obj, O);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(1);
                xe91.e((f530) obj5, (jxu) obj6, (w49) obj4, (frv0) obj3, this.c, (fid) obj, O2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int O3 = vng.O(1);
                b.g((o9z0) obj5, this.c, (sls) obj6, (sls) obj4, (sls) obj3, (fid) obj, O3);
                break;
            default:
                ((Integer) obj2).getClass();
                int O4 = vng.O(32769);
                ((c) obj6).a((f530) obj5, (c3) obj4, this.c, (tpr) obj3, (fid) obj, O4);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ub31(int i, int i2, tls tlsVar, f530 f530Var, Object obj, Object obj2, Object obj3) {
        this.a = i2;
        this.b = f530Var;
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
        this.c = tlsVar;
    }

    public /* synthetic */ ub31(c cVar, f530 f530Var, c3 c3Var, tls tlsVar, tpr tprVar, int i) {
        this.a = 3;
        this.w = cVar;
        this.b = f530Var;
        this.x = c3Var;
        this.c = tlsVar;
        this.y = tprVar;
    }
}
