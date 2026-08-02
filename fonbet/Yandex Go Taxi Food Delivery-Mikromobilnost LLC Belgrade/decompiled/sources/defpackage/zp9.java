package defpackage;

import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.debt.data.ChargersDebtApi;
import com.yandex.go.chargers.debt.domain.c;
import com.yandex.go.chargers.domain.e;
import com.yandex.go.chargers.error.data.a;

/* loaded from: classes12.dex */
public final class zp9 implements v7p {
    public final /* synthetic */ int a;
    public final lxf b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;

    public /* synthetic */ zp9(lxf lxfVar, xvf0 xvf0Var, pxf pxfVar, xvf0 xvf0Var2, v7p v7pVar, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = lxfVar;
        this.c = xvf0Var;
        this.d = pxfVar;
        this.e = xvf0Var2;
        this.f = v7pVar;
        this.g = xvf0Var3;
        this.h = xvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.h;
        xvf0 xvf0Var2 = this.g;
        xvf0 xvf0Var3 = this.f;
        xvf0 xvf0Var4 = this.e;
        xvf0 xvf0Var5 = this.d;
        xvf0 xvf0Var6 = this.c;
        lxf lxfVar = this.b;
        switch (i) {
            case 0:
                return new c((tt2) lxfVar.get(), (ChargersDebtApi) xvf0Var6.get(), (ney) xvf0Var5.get(), (bq9) xvf0Var4.get(), (a) xvf0Var3.get(), (vp9) xvf0Var2.get(), (vya) xvf0Var.get());
            default:
                return new e((tt2) lxfVar.get(), i5m.a(xvf0Var6), (ney) xvf0Var5.get(), (sya) xvf0Var4.get(), (f) xvf0Var3.get(), (com.yandex.go.chargers.domain.a) xvf0Var2.get(), (vya) xvf0Var.get());
        }
    }
}
