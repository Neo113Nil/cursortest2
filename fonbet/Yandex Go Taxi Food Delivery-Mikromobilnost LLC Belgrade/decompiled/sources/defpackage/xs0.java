package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class xs0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ int c;
    public final /* synthetic */ vu0 w;

    public /* synthetic */ xs0(a aVar, vu0 vu0Var, int i) {
        this.a = 0;
        this.b = aVar;
        this.w = vu0Var;
        this.c = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        int i2 = this.c;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                dv8 dv8Var = aVar.a;
                tu0 tu0Var = (tu0) this.w;
                dv8Var.e(tu0Var.a, i2, tu0Var.b);
                break;
            case 1:
                dv8 dv8Var2 = aVar.a;
                hu0 hu0Var = new hu0(i2);
                vu0 vu0Var = this.w;
                dv8.c(dv8Var2, vu0Var instanceof su0 ? b51.a : c51.a, hu0Var, vu0Var, new xs0(aVar, i2, vu0Var, 2), 8);
                break;
            default:
                boj0.i(aVar.n, true, this.c, null, this.w, 20);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ xs0(a aVar, int i, vu0 vu0Var, int i2) {
        this.a = i2;
        this.b = aVar;
        this.c = i;
        this.w = vu0Var;
    }
}
