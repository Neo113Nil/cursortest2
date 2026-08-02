package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class ux20 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ zls D;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ux20(f530 f530Var, txq txqVar, boolean z, boolean z2, wls wlsVar, sls slsVar, sls slsVar2, zls zlsVar, int i, int i2) {
        this.b = f530Var;
        this.z = txqVar;
        this.c = z;
        this.w = z2;
        this.A = wlsVar;
        this.B = slsVar;
        this.C = slsVar2;
        this.D = zlsVar;
        this.x = i;
        this.y = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.x;
        Object obj3 = this.C;
        Object obj4 = this.B;
        Object obj5 = this.A;
        Object obj6 = this.z;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                wx20.a(this.b, (rz20) obj6, (gz20) obj5, (v2o) obj4, (ymo) obj3, this.c, this.w, (a) this.D, (fid) obj, O, this.y);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point.a.g(this.b, (txq) obj6, this.c, this.w, (wls) obj5, (sls) obj4, (sls) obj3, this.D, (fid) obj, O2, this.y);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ux20(f530 f530Var, rz20 rz20Var, gz20 gz20Var, v2o v2oVar, ymo ymoVar, boolean z, boolean z2, a aVar, int i, int i2) {
        this.b = f530Var;
        this.z = rz20Var;
        this.A = gz20Var;
        this.B = v2oVar;
        this.C = ymoVar;
        this.c = z;
        this.w = z2;
        this.D = aVar;
        this.x = i;
        this.y = i2;
    }
}
