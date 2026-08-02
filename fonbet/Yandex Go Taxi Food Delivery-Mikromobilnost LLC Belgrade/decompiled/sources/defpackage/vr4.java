package defpackage;

import java.util.ArrayList;
import ru.yandex.taxi.logistics.sdk.promotions.impl.ui.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class vr4 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ xr4 b;
    public final /* synthetic */ xq4 c;

    public /* synthetic */ vr4(xq4 xq4Var, xr4 xr4Var) {
        this.a = 0;
        this.c = xq4Var;
        this.b = xr4Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        xq4 xq4Var = this.c;
        xr4 xr4Var = this.b;
        switch (i) {
            case 0:
                uq4 uq4Var = xq4Var.d.e;
                if (uq4Var != null) {
                    gzh gzhVar = xr4Var.z.c;
                    vr4 vr4Var = new vr4(xr4Var, xq4Var, 2);
                    vr4 vr4Var2 = new vr4(xr4Var, xq4Var, 3);
                    h0w h0wVar = xr4Var.w;
                    ArrayList arrayList = uq4Var.d;
                    h0wVar.getClass();
                    czh create = gzhVar.create();
                    czh.a(create, new izh(new ys4(h0wVar, arrayList, vr4Var, vr4Var2, create), null, null, null, null, null, 8190));
                    break;
                }
                break;
            case 1:
                nr4 nr4Var = xr4Var.A;
                sq4 sq4Var = xq4Var.c;
                if (!(sq4Var instanceof qq4)) {
                    if (sq4Var != null && !sq4Var.equals(rq4.a)) {
                        w511.b();
                        break;
                    }
                } else {
                    nr4Var.h(((qq4) sq4Var).a);
                    break;
                }
                break;
            case 2:
                b bVar = xr4Var.y;
                String str = xq4Var.a;
                xbp0 xbp0Var = bVar.f;
                if (xbp0Var != null) {
                    lr4 lr4Var = bVar.d;
                    lr4Var.getClass();
                    lr4Var.b(lr4.a(xbp0Var), "AdTag.Tapped.InfoShown", str);
                    break;
                }
                break;
            default:
                b bVar2 = xr4Var.y;
                String str2 = xq4Var.a;
                xbp0 xbp0Var2 = bVar2.f;
                if (xbp0Var2 != null) {
                    lr4 lr4Var2 = bVar2.d;
                    lr4Var2.getClass();
                    lr4Var2.b(lr4.a(xbp0Var2), "AdTag.Tapped.InfoClosed", str2);
                    break;
                }
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ vr4(xr4 xr4Var, xq4 xq4Var, int i) {
        this.a = i;
        this.b = xr4Var;
        this.c = xq4Var;
    }
}
